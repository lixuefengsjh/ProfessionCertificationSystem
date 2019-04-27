package cn.soa.controller;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.soa.entity.headResult.ResultJson;

@RestController
@RequestMapping({"/require"})
public class RequireC{
	private static Logger logger = LoggerFactory.getLogger(RequireC.class);
	
	@Autowired
	private JdbcTemplate jt;
	
	/**   
	 * @Title: saveRequireC   
	 * @Description:   
	 * @return: ResultJson<String>        
	 */  
	@PostMapping("")
	public ResultJson<String> saveRequireC(
			@RequestParam Map<String,String> require ){
		logger.debug( require.toString() );
		String sql = "insert into student_graduation_req "
				+ " (reid,number,expectscore,describle,rname) "
				+ " values  "
				+ " ('" + UUID.randomUUID().toString() 
				+ "','" + require.get("number")  
				+ "','" + require.get("expectscore")  
				+ "','" + require.get("describle")  
				+ "','" + require.get("rname")  
				+"')";
		try {
			jt.execute(sql);
			return new ResultJson<String>( 0, "插入数据成功", "1" );
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}	
	}
	
	@GetMapping("")
	public ResultJson<List<Map<String, Object>>> getRequireC(){
		String sql = " select * from student_graduation_req ";
		List<Map<String, Object>> requires = jt.queryForList(sql);
		logger.debug( requires.toString() );
		return new ResultJson<List<Map<String, Object>>>(0,"查询成功", requires);
	}
	
	@DeleteMapping("")
	public ResultJson<Integer> delRequireC(
			@RequestParam("id") String id){
		logger.debug( id );
		String sql = "delete from student_graduation_req "
				+ "  where reid='" + id.trim() + "'";
		try {
			jt.execute(sql);
			return new ResultJson<Integer>( 0, "删除数据成功", 1 );
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}	
	}
	
	@PutMapping("")
	public ResultJson<Integer> updateRequireC(
			@RequestParam Map<String,String> require 	){
		logger.debug( "修改");
		logger.debug( require.toString());
		logger.debug( require.get("REID"));
		String sql = "delete from student_graduation_req "
				+ "  where reid='" + require.get("REID").trim() + "'";
		try {
			jt.execute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}	
		String sql1  = "insert into student_graduation_req "
				+ " (REID,NUMBER,EXPECTSCORE,DESCRIBLE,PARENTID,RNAME,REMARK1,REMARK2) "
				+ " values  "
				+ " ('" + UUID.randomUUID().toString() 
				+ "','" + require.get("NUMBER")  
				+ "','" + require.get("EXPECTSCORE")  
				+ "','" + require.get("DESCRIBLE")  
				+ "','" + require.get("PARENTID")  
				+ "','" + require.get("RNAME")  
				+ "','" + require.get("REMARK1")  
				+ "','" + require.get("REMARK2")  
				+"')";
		try {
			jt.execute(sql1);
			return new ResultJson<Integer>( 0, "修改数据成功", 1 );
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}	
	}	
}