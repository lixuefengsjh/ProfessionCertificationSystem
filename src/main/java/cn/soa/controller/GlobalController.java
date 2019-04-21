/*    */ package cn.soa.controller;
/*    */ 
/*    */ import cn.soa.entity.headResult.ResultJson;
/*    */ import org.slf4j.Logger;
/*    */ import org.slf4j.LoggerFactory;
/*    */ import org.springframework.ui.Model;
/*    */ import org.springframework.web.bind.MethodArgumentNotValidException;
/*    */ import org.springframework.web.bind.WebDataBinder;
/*    */ import org.springframework.web.bind.annotation.ControllerAdvice;
/*    */ import org.springframework.web.bind.annotation.ExceptionHandler;
/*    */ import org.springframework.web.bind.annotation.InitBinder;
/*    */ import org.springframework.web.bind.annotation.ModelAttribute;
/*    */ import org.springframework.web.bind.annotation.ResponseBody;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @ControllerAdvice
/*    */ @ResponseBody
/*    */ public class GlobalController
/*    */ {
/* 26 */   private static final Logger logger = LoggerFactory.getLogger(GlobalController.class);
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   @InitBinder
/*    */   public void initBinder(WebDataBinder binder) {}
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   @ModelAttribute
/*    */   public void addAttributes(Model model)
/*    */   {
/* 45 */     model.addAttribute("author", "Magical Sam");
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   @ExceptionHandler
/*    */   ResultJson<Object> handlerException(Exception e)
/*    */   {
/* 57 */     logger.debug(e.getMessage());
/* 58 */     return new ResultJson(1, e.getMessage(), null);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   @ExceptionHandler({MethodArgumentNotValidException.class})
/*    */   @ResponseBody
/*    */   ResultJson<Object> handleMethodArgumentNotValidException(MethodArgumentNotValidException e)
/*    */   {
/* 71 */     logger.error(e.getMessage(), e);
/* 72 */     return new ResultJson(e);
/*    */   }
/*    */ }


/* Location:              D:\项目管理\酒店管理\酒店管理\WEB-INF\classes\!\cn\soa\controller\GlobalController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */