/**
 * 全局变量
 */
var loginUrl = ipPort + "/user",
	indexUrl = ipPort + "/html/userCenter/index.html",
	indexSonWinIndex;
 
/**
 * 初始化加载
 */


/**
 * 事件绑定
 */
$(function(){
	console.log( '-------事件绑定-----------' );
	
	//注册单击事件
	$('#register').on('click', registerClickEvent );
	
	
	//登录单击事件
	$('#login').on('click', loginClickEvent );
	
})

 
/**
 * 页面初始化
 */
$(function(){
	//参数验证
	$( '#form' ).validate({
		rules : {
			name : {
				required : true
			},
			user_password : {
				required : true
			}
		},
		messages : {
			name : {
				required : "用户名不能为空"
			},
			user_password : {
				required : "密码不能为空"
			}
		},
		onfocusout :  function( element ){
			$(element).valid();
		},
		onsubmit : false,
		focusInvalid : true,			
		highlight : function( element ) {
			$(element).closest('.form-group').addClass('has-error');
	    },
	    errorPlacement : function(error, element) {  	
            element.parents('div .checkInfo').next('div').find('div').append(error).parent().css({'line-height':'45px'});
        }
	})
})

/**
 * 登录单击事件回调函数
 */
function loginClickEvent(){
	console.log( '-------登录单击事件回调函数-----------' );
	
	/*
	 * 验证
	 */
	if( !$('#form').valid() ){
		console.log( '-------验证不通过-----------' );
		return false;
		return;
	}
			
	/*
	 * 登录
	 */
	console.log( '-------执行登录-----------' );
	var name = $( 'input[name=name]' ).val(),
	user_password=$( 'input[name=user_password]' ).val();
	console.log( 'name:' + name );
	console.log( 'user_password:' + user_password );	
	ajax( 'get', loginUrl+"/"+name+"/"+user_password, {}, loginCallBack, false );	
	return false;
}

/**
 * 注册单击事件回调函数
 */
function registerClickEvent(){
	console.log( '-------注册单击事件回调函数-----------' );
	//弹出框注册页面
	indexSonWinIndex = layer.open({
		type: 2,
		title: '用户注册页面',
//		btn: ['确定', '取消'],
		area: ['700px','450px'],
		content: ipPort + '/html/userCenter/register.html',
		//此处要求返回的格式
		success: function(){
			
		},
		yes: function( index, sonDom ){
			var sonWindow = window[sonDom.find('iframe')[0]['name']],
				nextNodeExecuPE = sonWindow.getCurrTreeNodeName();	
		}
	});
	
	//刷新登录页
	return false;
}

/**
 * 登录成功回调函数
 */
function loginCallBack( data ){
	console.log( '-------登录成功回调函数-----------' );		
	//跳转主页
	window.location.href = indexUrl;
}