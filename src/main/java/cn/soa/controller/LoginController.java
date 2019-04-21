/*     */ package cn.soa.controller;
/*     */ 
/*     */ import cn.soa.entity.UserOrganization;
/*     */ import cn.soa.entity.UserRole;
/*     */ import cn.soa.entity.headResult.ResultJson;
/*     */ import cn.soa.service.inter.RoleServiceInter;
/*     */ import cn.soa.service.inter.UserServiceInter;
/*     */ import cn.soa.util.GlobalUtil;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.servlet.http.HttpSession;
/*     */ import javax.validation.constraints.NotBlank;
/*     */ import org.apache.shiro.SecurityUtils;
/*     */ import org.apache.shiro.authc.AuthenticationException;
/*     */ import org.apache.shiro.authc.DisabledAccountException;
/*     */ import org.apache.shiro.authc.IncorrectCredentialsException;
/*     */ import org.apache.shiro.authc.UnknownAccountException;
/*     */ import org.apache.shiro.authc.UsernamePasswordToken;
/*     */ import org.apache.shiro.session.Session;
/*     */ import org.apache.shiro.subject.Subject;
/*     */ import org.slf4j.Logger;
/*     */ import org.slf4j.LoggerFactory;
/*     */ import org.springframework.beans.factory.annotation.Autowired;
/*     */ import org.springframework.web.bind.annotation.GetMapping;
/*     */ import org.springframework.web.bind.annotation.PathVariable;
/*     */ import org.springframework.web.bind.annotation.PostMapping;
/*     */ import org.springframework.web.bind.annotation.RequestMapping;
/*     */ import org.springframework.web.bind.annotation.RestController;

/*     */ @RestController
/*     */ @RequestMapping({"/user"})
/*     */ public class LoginController
/*     */ {
/*  63 */   private static Logger logger = LoggerFactory.getLogger(LoginController.class);
/*     */   
/*     */ 
/*     */ 
/*     */   @Autowired
/*     */   private UserServiceInter userService;
/*     */   
/*     */ 
/*     */ 
/*     */   @Autowired
/*     */   private RoleServiceInter roleService;
/*     */   
/*     */ 
/*     */ 
/*     */   @GetMapping({"/{userName}/{userPassword}"})
/*     */   public ResultJson<String> loginContr(@PathVariable("userName") @NotBlank String userName, @PathVariable("userPassword") @NotBlank String userPassword)
/*     */   {
/*  80 */     logger.debug("-------C----------开始登陆-----------");
/*  81 */     Subject subject = SecurityUtils.getSubject();
/*  82 */     UsernamePasswordToken token = new UsernamePasswordToken(userName.trim(), userPassword.trim());
/*  83 */     ResultJson<String> resultJson = null;
/*     */     try {
/*  85 */       subject.login(token);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  90 */       GlobalUtil.addCookie("num", userName);
/*     */       
/*  92 */       List<UserRole> userRoles = new ArrayList();
/*  93 */       userRoles = this.roleService.getUserRoleByNum(userName.trim());
/*  94 */       String roles = "";
/*  95 */       logger.debug("-------userRoles:-----------" + userRoles);
/*  96 */       if ((userRoles != null) && (userRoles.get(0) != null)) {
/*  97 */         roles = ((UserRole)userRoles.get(0)).getRolid();
/*  98 */         GlobalUtil.addCookie("role", roles);
/*     */       }
/*     */       
/*     */ 
/* 102 */       UserOrganization user = this.userService.getUserOrganByUsernum(userName.trim());
/* 103 */       logger.debug("-------user:-----------" + user);
/* 104 */       if (user != null) {
/* 105 */         GlobalUtil.addCookie("organ", user.getParent_id());
/*     */       }
/*     */       
/* 108 */       resultJson = new ResultJson(0, "登录成功", subject.getSession().getId());
/*     */     } catch (IncorrectCredentialsException e) {
/* 110 */       resultJson = new ResultJson(0, "密码错误", null);
/*     */     } catch (DisabledAccountException e) {
/* 112 */       resultJson = new ResultJson(0, "登录失败，该用户已被冻结", null);
/*     */     } catch (UnknownAccountException e) {
/* 114 */       resultJson = new ResultJson(0, "该用户不存在", null);
/*     */     } catch (AuthenticationException e) {
/* 116 */       resultJson = new ResultJson(0, "登录认证失败，错误信息", null);
/*     */     } catch (Exception e) {
/* 118 */       e.printStackTrace();
/* 119 */       resultJson = new ResultJson(0, "登录失败，未知错误", null);
/*     */     }
/* 121 */     return resultJson;
/*     */   }
/*     */   
/*     */   @PostMapping({"/logout"})
/*     */   public ResultJson<String> logoutContr(HttpSession session)
/*     */   {
/* 127 */     logger.info("-------C----------退出登陆-----------");
/* 128 */     Subject subject = SecurityUtils.getSubject();
/*     */     try {
/* 130 */       subject.logout();
/*     */     } catch (Exception e) {
/* 132 */       e.printStackTrace();
/* 133 */       logger.debug("-------C----------退出登陆错误-----------");
/* 134 */       return new ResultJson(1, "退出失败", null);
/*     */     }
/* 136 */     return new ResultJson(302, "退出成功", "/html/userCenter/login.html");
/*     */   }
/*     */ }


/* Location:              D:\项目管理\酒店管理\酒店管理\WEB-INF\classes\!\cn\soa\controller\LoginController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */