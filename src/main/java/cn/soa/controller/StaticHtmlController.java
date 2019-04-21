/*    */ package cn.soa.controller;
/*    */ 
/*    */ import java.util.HashMap;
/*    */ import org.apache.shiro.authz.annotation.RequiresAuthentication;
/*    */ import org.slf4j.Logger;
/*    */ import org.slf4j.LoggerFactory;
/*    */ import org.springframework.stereotype.Controller;
/*    */ import org.springframework.web.bind.annotation.RequestMapping;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Controller
/*    */ @RequestMapping({"/jsPackage/web/design"})
/*    */ public class StaticHtmlController
/*    */ {
/* 32 */   private static Logger logger = LoggerFactory.getLogger(StaticHtmlController.class);
/*    */   
/*    */   @RequiresAuthentication
/*    */   @RequestMapping({"/index"})
/*    */   public String indexHtml(HashMap<String, Object> map) {
/* 37 */     map.put("hello", "欢迎进入HTML页面");
/* 38 */     return "index.html";
/*    */   }
/*    */   
/*    */   @RequiresAuthentication
/*    */   @RequestMapping({"/userManager"})
/*    */   public String userManagerHtml(HashMap<String, Object> map) {
/* 44 */     map.put("hello", "欢迎进入用户管理页面");
/* 45 */     return "userManager.html";
/*    */   }
/*    */ }


/* Location:              D:\项目管理\酒店管理\酒店管理\WEB-INF\classes\!\cn\soa\controller\StaticHtmlController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */