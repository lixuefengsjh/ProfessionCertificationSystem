$(function(){
	var table=layui.table;
	var form = layui.form
	,layer=layui.layer
	,element = layui.element
	,surl='../require'
	,aurl='../require'
	,durl='../require'
	,purl='../require'
	,sf = {
			loadTable: function(data){
				console.log(data);
				table.render({
					elem : '#table',
//					height : '400ox',
					title: '数据表',
					data : data,
//					toolbar: true,
					page : true,
					even : true,			
					autoSort : false,
					count : data.length,
					curr : 0,
					limit : 10,
					limits : [ 10, 13, 20, 25, 30 ],
					layout : [ 'prev', 'page', 'next', 'skip',
							'count', 'limit' ],
					cols : [ [
						{type: 'numbers',title:'序号', align:'center', minWidth:120}
				    	,{field:'REID', title:'id', minWidth:120, fixed: 'left', hide: true, align:'center'}
				    	,{field:'NUMBER', title:'指标编号', minWidth:200, edit: 'text', align:'center'}	           
				    	,{field:'EXPECTSCORE', title:'期望分数', minWidth:200, edit: 'text', align:'center'}
				    	,{field:'DESCRIBLE', minWidth:150,title: '指标描述',edit:'text', align:'center'}
				    	,{fixed: 'right', title:'操作', toolbar: '#barDemo',minWidth:300, align:'center'}
					] ],
					id: 'testReload',
					done : function(res, curr, count) {
					}
				})
				form.render();
			}
	}
	,init = {
			hideElem:function(){			
				$( '#addArea' ).hide();
			}
			,initTable: function(){
				ajax('get', surl, {}, sf.loadTable );
			}
	}
	,cf={
			save: function(data){
				console.log('-----save------');
				console.log(data);
				ajax('put',purl,data,function(jsonData){
					layer.msg('保存成功');
					init.initTable();	
				})
			}
			,del: function(data){
				console.log('-----del------');
				console.log(data);
				ajax('delete',durl,{"id":data.REID},function(jsonData){
					layer.msg('删除成功');	
					init.initTable();	
				})
			}
	}
	form.render();
	init.initTable();	
	
	table.on('tool(table)', function(obj){
	    var data = obj.data;
	    if(obj.event === 'del'){
	    	cf.del( data );
	    } else if(obj.event === 'save'){
	    	cf.save( data );	   
	    }
	})
		
	$('#add').on('click',function(){
		layer.open({
	        type: 1,
	        title: '新增指标'
	        ,area: ['60%', '80%']	  
	        ,id: 'layerDemo'+ 1 //防止重复弹出
	        ,content: $( '#addArea' )
	        ,btn: ['确定', '取消']
	        ,btnAlign: 'c' //按钮居中
	        ,shade: 0 //不显示遮罩
	        ,yes: function( index, layero){
	        	ajax('post',aurl,$(layero).find('form').serialize(),function(jsonData){
	        		console.log(jsonData);
	        		layer.msg('增加指标成功',{icon:1})
		        	init.initTable();		        	
		        	init.hideElem();
		        	layer.close(index);
	        	})	        	
	        },
	        btn2: function(index, layero){
	            layer.close(index);
	        },
	        end: function(){
	        	init.hideElem();
	        },
	        success: function( layero, index ){    
	        	form.render();
	        	element.init();
	        }
    	}) 
	})
	
})