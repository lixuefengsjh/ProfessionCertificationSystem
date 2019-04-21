/*     */ package cn.soa.controller;
/*     */ 
/*     */ import cn.soa.entity.UserOrganization;
/*     */ import cn.soa.entity.UserRegister;
/*     */ import cn.soa.entity.headResult.ResultJson;
/*     */ import cn.soa.service.impl.UserRegistService;
/*     */ import cn.soa.service.inter.UserServiceInter;
/*     */ import java.util.List;
/*     */ import javax.validation.Valid;
/*     */ import javax.validation.constraints.NotBlank;
/*     */ import org.slf4j.Logger;
/*     */ import org.slf4j.LoggerFactory;
/*     */ import org.springframework.beans.factory.annotation.Autowired;
/*     */ import org.springframework.web.bind.annotation.GetMapping;
/*     */ import org.springframework.web.bind.annotation.PathVariable;
/*     */ import org.springframework.web.bind.annotation.PostMapping;
/*     */ import org.springframework.web.bind.annotation.PutMapping;
/*     */ import org.springframework.web.bind.annotation.RequestBody;
/*     */ import org.springframework.web.bind.annotation.RequestMapping;
/*     */ import org.springframework.web.bind.annotation.RequestParam;
/*     */ import org.springframework.web.bind.annotation.RestController;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @RestController
/*     */ @RequestMapping({"/register"})
/*     */ public class UserRegistController
/*     */ {
/*  50 */   private static Logger logger = LoggerFactory.getLogger(UserRegistController.class);
/*     */   
/*     */ 
/*     */ 
/*     */   @Autowired
/*     */   private UserRegistService userRegistService;
/*     */   
/*     */ 
/*     */   @Autowired
/*     */   private UserServiceInter userService;
/*     */   
/*     */ 
/*     */ 
/*     */   @PostMapping({""})
/*     */   public ResultJson<String> saveUserRegister(@RequestBody @Valid UserRegister userRegister)
/*     */   {
/*  66 */     logger.debug("--C----------保存用户注册信息-----------");
/*  67 */     int i = this.userRegistService.saveUserRegistServ(userRegister);
/*  68 */     if (i > 0) {
/*  69 */       logger.debug("--C----------保存用户注册信息成功-----------");
/*  70 */       return new ResultJson(0, "保存用户成功", i); }
/*  71 */     if (i == 0) {
/*  72 */       logger.debug("--C----------保存用户注册信息失败-----------i:" + i);
/*  73 */       return new ResultJson(1, "保存用户失败，插入0条数据", i);
/*     */     }
/*  75 */     logger.debug("--C----------保存用户注册信息失败-----------i:" + i);
/*  76 */     return new ResultJson(1, "保存用户失败,未知错误", i);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   @GetMapping({"/user/{num}"})
/*     */   public ResultJson<String> existsUsernum(@PathVariable("num") @NotBlank String usernum)
/*     */   {
/*  87 */     logger.debug("--C----------检查用户表的用户编码是否存在-----------");
/*  88 */     logger.debug("--C----------usernum:" + usernum);
/*     */     
/*     */ 
/*     */ 
/*  92 */     UserOrganization user = this.userService.getUserOrganByUsernum(usernum);
/*  93 */     if (user != null) {
/*  94 */       return new ResultJson(0, "用户表用户存在", "用户存在");
/*     */     }
/*  96 */     logger.debug("--C----------检查用户表的用户编码是不存在-----------");
/*  97 */     return new ResultJson(1, "用户表用户都不存在", "用户不存在");
/*     */   }
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
/*     */   @GetMapping({"/list"})
/*     */   public ResultJson<List<UserRegister>> getRegistersContr()
/*     */   {
/* 119 */     logger.debug("--C----------查询所有注册用户-----------");
/* 120 */     List<UserRegister> registers = this.userRegistService.findRegistersServ();
/* 121 */     logger.debug("--C----------registers-----------" + registers);
/* 122 */     if (registers != null) {
/* 123 */       return new ResultJson(0, "有注册用户", registers);
/*     */     }
/* 125 */     return new ResultJson(0, "没有注册用户", null);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   @PutMapping({"/state"})
/*     */   public ResultJson<Integer> modifyRegStateContr(@RequestParam("num") @NotBlank String num)
/*     */   {
/* 136 */     logger.debug("--C----------根据注册用户num修改注册用户状态     -----------");
/* 137 */     logger.debug("--C---------- num -----------" + num);
/* 138 */     int i = this.userRegistService.modifyRegStateServ(num);
/* 139 */     logger.debug("--C---------- i -----------" + i);
/* 140 */     if (i > 0)
/* 141 */       return new ResultJson(0, "修改成功", Integer.valueOf(i));
/* 142 */     if (i == -1) {
/* 143 */       return new ResultJson(0, "修改失败,数据库出错", Integer.valueOf(-1));
/*     */     }
/* 145 */     return new ResultJson(0, "修改失败，未知错误", Integer.valueOf(-1));
/*     */   }
/*     */ }


/* Location:              D:\项目管理\酒店管理\酒店管理\WEB-INF\classes\!\cn\soa\controller\UserRegistController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */