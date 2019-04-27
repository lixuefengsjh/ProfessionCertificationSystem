$(function(){
	var table=layui.table;
	var form = layui.form
	,layer=layui.layer
	,element = layui.element
	,surl='../require'
	,aurl='../require'
	,durl='../require'
	,purl='../require'
	,require = {
			1: "具有人文社会科学素养、社会责任感和工程职业道德",
			2: "具有从事工程工作所需的相关数学、自然科学以及经济和管理知识",
			3: "掌握工程基础知识和本专业的基本理论知识，具有系统的工程时间学习经历，了解本专业的前沿发展现状和趋势",
			4: "具备设计和实施工程实验的能力，并能够对实验结果进行分析",
			5: "掌握基本的创新方法，具有追求创新的态度和意识，具有综合运用理论和技术手段设计系统和过程的能力，设计过程中能够综合考虑经济、环境、法律、安全、健康、伦理等制约因素",
			6: "掌握文献检索、资料查询及运用现代信息技术获取相关信息的基本方法",
			7: "了解与本专业相关的职业和行业的生产、设计、研究与开发、环境保护和可持续发展等方面的方针、政策和法律法规，能正确认识工程对于客观世界和社会的影响",
			8: "具有一定的组织管理能力、表达能力和人际交往能力以及在团队中发挥作用的能力",
			9: "对终身学习有正确的认识，具有不断学习和适应发展的能力",
			10: "具有国际视野和跨文化的交流、竞争与合作能力"			
	}
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
				    	,{field:'reid', title:'id', minWidth:120, fixed: 'left', hide: true, align:'center'}
				    	,{field:'number', title:'指标编号', minWidth:200, edit: 'text', align:'center'}	           
				    	,{field:'expectscore', title:'期望分数', minWidth:200, edit: 'text', align:'center'}
				    	,{field:'describle', minWidth:150,title: '指标描述',edit:'text', align:'center'}
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
				console.log('-----save------');v
				console.log(data);
				ajax('put',purl,encodeURIComponent(data),function(jsonData){
					layer.msg('保存成功');
				})
			}
			,del: function(data){
				console.log('-----del------');
				console.log(data);
				ajax('delete',durl,{"id":data.reid},function(jsonData){
					layer.msg('删除成功');				
				})
			}
	}
	form.render();
	init.initTable();	
	
	table.on('tool(user_table)', function(obj){
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
	        	console.log($( layero ).find('form')[0]);
	        	console.log($( layero ).find('form').serializeArray());
	        	ajax('post',aurl,JSON.stringify($(layero).find('form').serializeArray()),function(jsonData){
	        		console.log(jsonData);
	        		layer.msg('增加指标成功',{icon:1})
		        	init.initTable();		        	
		        	init.hideElem();
	        	})	        	
	        },
	        btn2: function(index, layero){
	            layer.close(index);
	            init.hideElem();
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