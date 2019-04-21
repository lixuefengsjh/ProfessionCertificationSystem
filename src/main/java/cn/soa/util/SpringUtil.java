/*    */ package cn.soa.util;
/*    */ 
/*    */ import org.springframework.beans.BeansException;
/*    */ import org.springframework.context.ApplicationContext;
/*    */ import org.springframework.context.ApplicationContextAware;
/*    */ import org.springframework.stereotype.Component;
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
/*    */ @Component
/*    */ public class SpringUtil
/*    */   implements ApplicationContextAware
/*    */ {
/*    */   private static ApplicationContext applicationContext;
/*    */   
/*    */   public void setApplicationContext(ApplicationContext applicationContext)
/*    */     throws BeansException
/*    */   {
/* 32 */     if (applicationContext == null) {
/* 33 */       applicationContext = applicationContext;
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static ApplicationContext getApplicationContext()
/*    */   {
/* 42 */     return applicationContext;
/*    */   }
/*    */   
/*    */   public static Object getBean(String name)
/*    */   {
/* 47 */     return getApplicationContext().getBean(name);
/*    */   }
/*    */   
/*    */   public static <T> T getBean(Class<T> clazz)
/*    */   {
/* 52 */     return (T)getApplicationContext().getBean(clazz);
/*    */   }
/*    */   
/*    */   public static <T> T getBean(String name, Class<T> clazz)
/*    */   {
/* 57 */     return (T)getApplicationContext().getBean(name, clazz);
/*    */   }
/*    */ }


/* Location:              D:\项目管理\酒店管理\酒店管理\WEB-INF\classes\!\cn\so\\util\SpringUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */