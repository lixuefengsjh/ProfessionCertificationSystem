/*     */ package cn.soa.service.impl;
/*     */ 
/*     */ import cn.soa.dao.UserRegistMapper;
/*     */ import cn.soa.entity.UserRegister;
/*     */ import cn.soa.service.inter.UserRegistServiceInter;
/*     */ import java.util.List;
/*     */ import org.slf4j.Logger;
/*     */ import org.slf4j.LoggerFactory;
/*     */ import org.springframework.beans.factory.annotation.Autowired;
/*     */ import org.springframework.stereotype.Service;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Service
/*     */ public class UserRegistService
/*     */   implements UserRegistServiceInter
/*     */ {
/*  34 */   private static Logger logger = LoggerFactory.getLogger(UserRegistService.class);
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @Autowired
/*     */   private UserRegistMapper userRegistMapper;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public List<UserRegister> findRegistersServ()
/*     */   {
/*     */     try
/*     */     {
/*  50 */       return this.userRegistMapper.findRegisters();
/*     */     }
/*     */     catch (Exception e) {
/*  53 */       e.printStackTrace(); }
/*  54 */     return null;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int saveUserRegistServ(UserRegister userRegist)
/*     */   {
/*     */     try
/*     */     {
/*  67 */       int i = this.userRegistMapper.saveUserRegis(userRegist);
/*  68 */       if (i > 0) {
/*  69 */         return i;
/*     */       }
/*  71 */       return 0;
/*     */     }
/*     */     catch (Exception e) {
/*  74 */       e.printStackTrace(); }
/*  75 */     return -1;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public UserRegister findRegisterByNumServ(String i)
/*     */   {
/*     */     try
/*     */     {
/*  88 */       UserRegister register = this.userRegistMapper.findRegisterByNum(i);
/*  89 */       if (register != null) {
/*  90 */         return register;
/*     */       }
/*     */     } catch (Exception e) {
/*  93 */       e.printStackTrace();
/*  94 */       return null;
/*     */     }
/*  96 */     return null;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int modifyRegStateServ(String num)
/*     */   {
/*     */     try
/*     */     {
/* 108 */       return this.userRegistMapper.modifyRegisteState(num);
/*     */     }
/*     */     catch (Exception e) {
/* 111 */       e.printStackTrace(); }
/* 112 */     return -1;
/*     */   }
/*     */ }


/* Location:              D:\项目管理\酒店管理\酒店管理\WEB-INF\classes\!\cn\soa\service\impl\UserRegistService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */