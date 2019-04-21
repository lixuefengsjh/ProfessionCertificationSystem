var element = layui.element,
layer = layui.layer,
logoutUrl = ipPort + "/user/logout",	
roleAuthUrl = ipPort + "/user/role/auths",
roleAuthJsonUrl = ipPort + "/user/auths",
username;
	

$(function(){

    var equSrc='room_manage.html';

	$('#ifra').attr('src',equSrc);
	//为导航栏添加点击事件
	$('#secondMeno >li').each(function(i,obj){
		$(this).click(function(){
			
			switch (i){
			case 0:
				equSrc='room_manage.html';
				break;
			case 1:
				equSrc='userManager.html';
				break;
			case 2:
				equSrc='room_using.html';
				break;
			case 3:
				equSrc='roomVate.html';
				break;
			}
			$('#ifra').attr('src',equSrc);
		});
	})


	//退出事件绑定	
	$('#logout').on('click', logoutCallBack );				
})

/**
 * 退出事件绑定回调函数
 * @type 
 */
function logoutCallBack(){
	console.log( '----------退出事件绑定回调函数----------');
	//关闭链接请求
	$.ajax({
	    url: logoutUrl,
	    type: 'post',
	    data: {},
	    dataType: 'json',
	    success: function (jsonData) {
	    	console.log( jsonData );
	        if (jsonData.state == 302) {
	            location.href = ipPort +  jsonData.data;
	        }else{
	        	layer.msg("登出失败", {icon:2});
	        }
	    }
	});      
	return false;
}