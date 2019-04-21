/*     */ package cn.soa.controller;
/*     */ 
/*     */ import cn.soa.entity.AuthInfo;
/*     */ import cn.soa.entity.IotUserModuleResource;
/*     */ import cn.soa.entity.UserInfo;
/*     */ import cn.soa.entity.UserOrganization;
/*     */ import cn.soa.entity.UserRole;
/*     */ import cn.soa.entity.UserTest;
/*     */ import cn.soa.entity.headResult.ResultJson;
/*     */ import cn.soa.entity.headResult.UserTableJson;
/*     */ import cn.soa.service.inter.RoleServiceInter;
/*     */ import cn.soa.service.inter.UserServiceInter;
/*     */ import cn.soa.util.GlobalUtil;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.validation.Valid;
/*     */ import javax.validation.constraints.NotBlank;
/*     */ import javax.validation.constraints.NotNull;
/*     */ import org.slf4j.Logger;
/*     */ import org.slf4j.LoggerFactory;
/*     */ import org.springframework.beans.factory.annotation.Autowired;
/*     */ import org.springframework.web.bind.annotation.DeleteMapping;
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
/*     */ @RestController
/*     */ @RequestMapping({"/user"})
/*     */ public class UserController
/*     */ {
/*  57 */   private static Logger logger = LoggerFactory.getLogger(UserController.class);
/*     */   
/*     */ 
/*     */ 
/*     */   @Autowired
/*     */   private UserServiceInter userService;
/*     */   
/*     */ 
/*     */   @Autowired
/*     */   private RoleServiceInter roleService;
/*     */   
/*     */ 
/*     */ 
/*     */   @GetMapping({"/usernum/{num}"})
/*     */   public ResultJson<String> existsUsernum(@PathVariable("num") @NotBlank String usernum)
/*     */   {
/*  73 */     logger.debug("--C----------检查用户编码是否存在-----------");
/*  74 */     logger.debug("--C----------usernum:" + usernum);
/*  75 */     UserOrganization user = this.userService.getUserOrganByUsernum(usernum);
/*  76 */     if (user != null) {
/*  77 */       return new ResultJson(0, "用户存在", "用户存在");
/*     */     }
/*  79 */     return new ResultJson(1, "用户不存在", "用户不存在");
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   @GetMapping({"/password"})
/*     */   public ResultJson<String> managerPwd()
/*     */   {
/*  90 */     logger.debug("--C----------获取管理员密码-----------");
/*  91 */     return new ResultJson(0, "获取密码成功", "13579");
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   @GetMapping({"/users"})
/*     */   public ResultJson<List<UserOrganization>> getUsersAll()
/*     */   {
/* 102 */     List<UserOrganization> users = this.userService.findUsersAll();
/* 103 */     if (users != null) {
/* 104 */       return new ResultJson(0, "查询成功", users);
/*     */     }
/* 106 */     return new ResultJson(1, "查询失败", users);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   @PostMapping({"/list"})
/*     */   public UserTableJson<List<UserOrganization>> getUserAllList()
/*     */   {
/* 116 */     logger.debug("--C----------开始获取所有用户-----------");
/* 117 */     List<UserOrganization> userAll = this.userService.getUserAllListServ();
/* 118 */     if (userAll != null) {
/* 119 */       return new UserTableJson(
/* 120 */         "", 0, "成功", userAll, userAll.size(), true);
/*     */     }
/* 122 */     return new UserTableJson(
/* 123 */       "", 0, "失败", userAll, 0, true);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   @PostMapping({"/list/test"})
/*     */   public UserTableJson<List<UserTest>> getUserAllListTest()
/*     */   {
/* 134 */     logger.debug("--C----------开始获取所有用户-----------");
/* 135 */     UserTest userTest = new UserTest("王者", Integer.valueOf(0), Integer.valueOf(-1));
/* 136 */     UserTest userTest1 = new UserTest("射手", Integer.valueOf(1), Integer.valueOf(0));
/* 137 */     UserTest userTest2 = new UserTest("辅助", Integer.valueOf(2), Integer.valueOf(0));
/* 138 */     UserTest userTest3 = new UserTest("后裔", Integer.valueOf(11), Integer.valueOf(1));
/* 139 */     ArrayList<UserTest> arrayList = new ArrayList();
/* 140 */     arrayList.add(userTest);
/* 141 */     arrayList.add(userTest1);
/* 142 */     arrayList.add(userTest2);
/* 143 */     arrayList.add(userTest3);
/* 144 */     return new UserTableJson("", 1, "成功", arrayList, arrayList.size(), true);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   @PostMapping({""})
/*     */   public ResultJson<String> registryUserContr(@RequestBody @Valid UserOrganization user)
/*     */   {
/* 155 */     logger.debug("C----registryContr--- user ---" + user);
/* 156 */     String i = this.userService.saveOrganServ(user);
/* 157 */     logger.debug("C----新增组织返回值 ---" + i);
/* 158 */     if ("-1".equals(i))
/* 159 */       return new ResultJson(1, "未知错误", i);
/* 160 */     if ("0".equals(i)) {
/* 161 */       return new ResultJson(1, "新增组织失败 ，插入数据为0", i);
/*     */     }
/* 163 */     return new ResultJson(0, "新增组织成功", i);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   @PostMapping({"/userInfo"})
/*     */   public ResultJson<String> registryUserInfoContr(@RequestBody @Valid UserInfo userInfo)
/*     */   {
/* 175 */     logger.debug("C---- 注册用户信息    ---" + userInfo);
/* 176 */     int i = this.userService.saveUserInfoServ(userInfo);
/* 177 */     logger.debug("C---- i    ---" + i);
/* 178 */     if (i < 0) {
/* 179 */       logger.debug("C---- 注册用户信息失败返回值 ---i---" + i);
/* 180 */       return new ResultJson(1, "未知错误", i); }
/* 181 */     if (i == 0) {
/* 182 */       logger.debug("C---- 注册用户信息失败返回值 ---i---" + i);
/* 183 */       return new ResultJson(1, "新增用户信息失败 ，插入数据为0", i);
/*     */     }
/* 185 */     logger.debug("C---- 注册用户信息成功返回值 ---i---" + i);
/* 186 */     return new ResultJson(0, "新增用户成功", i);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   @PostMapping({"/userInfo/{userid}"})
/*     */   public ResultJson<String> saveUserInfoById(@PathVariable("userid") @Valid String userid)
/*     */   {
/* 198 */     logger.debug("---C---------- 根据用户id（非num）注册用户信息    -------" + userid);
/*     */     
/* 200 */     UserOrganization user = this.userService.getUserOrganById(userid);
/* 201 */     String usernum = user.getUsernum();
/* 202 */     logger.debug("---C---------- usernum    -------" + usernum);
/* 203 */     UserInfo userInfo = new UserInfo();
/* 204 */     userInfo.setUsernum(usernum);
/* 205 */     userInfo.setNname(user.getName());
/*     */     
/*     */ 
/* 208 */     int i = this.userService.saveUserInfoServ(userInfo);
/* 209 */     logger.debug("C---- i    ---" + i);
/* 210 */     if (i < 0) {
/* 211 */       logger.debug("C---- 注册用户信息失败返回值 ---i---" + i);
/* 212 */       return new ResultJson(1, "未知错误", i); }
/* 213 */     if (i == 0) {
/* 214 */       logger.debug("C---- 注册用户信息失败返回值 ---i---" + i);
/* 215 */       return new ResultJson(1, "新增用户信息失败 ，插入数据为0", i);
/*     */     }
/* 217 */     logger.debug("C---- 注册用户信息成功返回值 ---i---" + i);
/* 218 */     return new ResultJson(0, "新增用户成功", i);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   @DeleteMapping({"/{usernum}"})
/*     */   public ResultJson<String> deleteUserContro(@PathVariable("usernum") @NotBlank String usernum)
/*     */   {
/* 230 */     logger.debug("-----C------- 删除用户   ---- usernum： " + usernum);
/* 231 */     int i = this.userService.deleteUserByNum(usernum);
/* 232 */     if (i < 0) {
/* 233 */       logger.debug("C---- 删除用户 失败返回值 ---i---" + i);
/* 234 */       return new ResultJson(1, "未知错误，删除失败", i); }
/* 235 */     if (i == 0) {
/* 236 */       logger.debug("C---- 删除用户失败返回值 ---i---" + i);
/* 237 */       return new ResultJson(1, "删除用户失败 ，删除数据为0", i);
/*     */     }
/* 239 */     logger.debug("C---- 删除用户成功返回值 ---i---" + i);
/* 240 */     return new ResultJson(0, "删除用户成功", i);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   @DeleteMapping({"/organ/{num}"})
/*     */   public ResultJson<String> deleteOrganContro(@PathVariable("num") @NotBlank String num)
/*     */   {
/* 251 */     logger.debug("-----C------- 删除组织   ---- num： " + num);
/* 252 */     int i = this.userService.deleteUserByNum(num);
/* 253 */     if (i < 0) {
/* 254 */       logger.debug("C---- 删除组织失败返回值 ---i---" + i);
/* 255 */       return new ResultJson(1, "未知错误，删除失败", i); }
/* 256 */     if (i == 0) {
/* 257 */       logger.debug("C---- 删除组织失败返回值 ---i---" + i);
/* 258 */       return new ResultJson(1, "删除组织失败 ，删除数据为0", i);
/*     */     }
/* 260 */     logger.debug("C---- 删除组织成功返回值 ---i---" + i);
/* 261 */     return new ResultJson(0, "删除组织成功", i);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   @PutMapping({"/{usernum}"})
/*     */   public ResultJson<String> modifyUserState(@PathVariable("usernum") @NotNull int usernum)
/*     */   {
/* 273 */     logger.debug("-----C------- 修改用户状态   ---- usernum： " + usernum);
/* 274 */     return null;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   @GetMapping({"/role/auths"})
/*     */   public ResultJson<List<AuthInfo>> getAuthByRolid()
/*     */   {
/* 285 */     logger.debug("-----C------- 查询用户的模块菜单权限     ---- usernum： ");
/*     */     
/*     */ 
/*     */ 
/* 289 */     String rolid = null;
/* 290 */     String usernum = GlobalUtil.getCookie("num");
/* 291 */     logger.debug("--C-----查询用户的模块菜单权限  :-----------usernum:" + usernum.substring(1, usernum.length() - 1));
/* 292 */     List<UserRole> userRoles = this.roleService.getUserRoleByNum(usernum.substring(1, usernum.length() - 1));
/* 293 */     logger.debug("--C-----查询用户的模块菜单权限  :-----------userRoles:" + userRoles);
/*     */     
/* 295 */     if ((userRoles != null) && (userRoles.get(0) != null)) {
/* 296 */       rolid = ((UserRole)userRoles.get(0)).getRolid();
/*     */     }
/* 298 */     logger.debug("--C-----查询用户的模块菜单权限  :-----------rolid:" + rolid);
/* 299 */     if (rolid == null) {
/* 300 */       logger.debug("---C---- 用户角色不存在 ------");
/* 301 */       return new ResultJson(1, "用户角色不存在", null);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 307 */     ArrayList<AuthInfo> authInfos = this.roleService.findAuthByRolidServ(rolid);
/* 308 */     if (authInfos != null) {
/* 309 */       logger.debug("---C---- 用户权限查询成功 ------authInfos：" + authInfos);
/* 310 */       return new ResultJson(0, "用户角色权限查询成功", authInfos);
/*     */     }
/* 312 */     logger.debug("---C---- 用户角色查询失败或无任何权限 ------authInfos：" + authInfos);
/* 313 */     return new ResultJson(1, "用户角色权限查询失败或无任何权限", null);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   @GetMapping({"/auths"})
/*     */   public ResultJson<List<IotUserModuleResource>> getAuthJsonByRolid()
/*     */   {
/* 326 */     logger.debug("-----C------- 查询用户的模块菜单权限     ---- usernum： ");
/*     */     
/*     */ 
/*     */ 
/* 330 */     String rolid = null;
/* 331 */     String usernum = GlobalUtil.getCookie("num");
/* 332 */     logger.debug("--C-----查询用户的模块菜单权限  :-----------usernum:" + usernum.substring(1, usernum.length() - 1));
/* 333 */     List<UserRole> userRoles = this.roleService.getUserRoleByNum(usernum.substring(1, usernum.length() - 1));
/* 334 */     logger.debug("--C-----查询用户的模块菜单权限  :-----------userRoles:" + userRoles);
/*     */     
/* 336 */     if ((userRoles != null) && (userRoles.get(0) != null)) {
/* 337 */       rolid = ((UserRole)userRoles.get(0)).getRolid();
/*     */     }
/* 339 */     logger.debug("--C-----查询用户的模块菜单权限  :-----------rolid:" + rolid);
/* 340 */     if (rolid == null) {
/* 341 */       logger.debug("---C---- 用户角色不存在 ------");
/* 342 */       return new ResultJson(1, "用户角色不存在", null);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 348 */     ArrayList<IotUserModuleResource> auths = this.roleService.findAuthJsonServ(rolid);
/* 349 */     if (auths != null) {
/* 350 */       logger.debug("---C---- 用户权限查询成功 ------authInfos：" + auths);
/* 351 */       return new ResultJson(0, "用户角色权限查询成功", auths);
/*     */     }
/* 353 */     logger.debug("---C---- 用户角色查询失败或无任何权限 ------authInfos：" + auths);
/* 354 */     return new ResultJson(1, "用户角色权限查询失败或无任何权限", null);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   @GetMapping({"/users/{usernum}"})
/*     */   public ResultJson<UserOrganization> getUserByNum(@PathVariable("usernum") String usernum)
/*     */   {
/* 366 */     logger.debug("-----C------- 根据用户usernum查询用户   ---- usernum： " + usernum);
/* 367 */     UserOrganization u = this.userService.getUsersByNum(usernum);
/* 368 */     if (u != null) {
/* 369 */       logger.debug("---C---- 根据用户usernum查询用户成功------u：" + u);
/* 370 */       return new ResultJson(0, "查询用户成功", u);
/*     */     }
/* 372 */     logger.debug("---C---- 根据用户usernum查询用户失败------u：" + u);
/* 373 */     return new ResultJson(1, "查询用户失败", null);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   @PostMapping({"/users"})
/*     */   public ResultJson<UserOrganization> saveUserBackIdContr(@RequestParam("usernum") String usernum, @RequestParam("name") String name)
/*     */   {
/* 385 */     logger.debug("-----C------- 增加用户   ---- usernum： " + usernum);
/* 386 */     UserOrganization u = this.userService.saveUserBackId(usernum, name);
/* 387 */     if (u != null) {
/* 388 */       logger.debug("-----C------- 增加用户成功   ----  " + u);
/* 389 */       return new ResultJson(0, "增加用户成功 ", u);
/*     */     }
/* 391 */     logger.debug("-----C------- 增加用户失败   ----  " + u);
/* 392 */     return new ResultJson(0, "增加用户失败 ", u);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   @GetMapping({"/organ/{usernum}"})
/*     */   public UserTableJson<List<Map<String, Object>>> getInitOrgan(@PathVariable("usernum") @NotBlank String usernum)
/*     */   {
/* 404 */     logger.debug("--C---------- 获取全部组织数据，并根据用户usernum初始化 数据-----------");
/* 405 */     logger.debug("--C----------usernum-----------" + usernum);
/* 406 */     List<Map<String, Object>> lists = this.userService.getInitOrganServ(usernum);
/* 407 */     logger.debug("--C----------lists-----------" + lists);
/* 408 */     if (lists != null) {
/* 409 */       return new UserTableJson(
/* 410 */         "", 0, "成功", lists, lists.size(), true);
/*     */     }
/* 412 */     return new UserTableJson(
/* 413 */       "", 0, "失败", lists, 0, true);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   @PostMapping({"/organ"})
/*     */   public ResultJson<String> modifyUserParentId(@RequestParam("usernum") @NotBlank String usernum, @RequestParam("parentid") @NotBlank String parentid)
/*     */   {
/* 425 */     logger.debug("--C---------- 修改usernum用户 的parentid-----------");
/* 426 */     logger.debug("usernum:" + usernum);
/* 427 */     logger.debug("parentid:" + parentid);
/* 428 */     int i = this.userService.modifyUserParentidServ(usernum, parentid);
/* 429 */     if (i > 0) {
/* 430 */       logger.debug("-----C------- 修改usernum用户 的parentid成功  ----  " + i);
/* 431 */       return new ResultJson(0, "修改成功 ", i);
/*     */     }
/* 433 */     logger.debug("-----C------- 修改usernum用户 的parentid失败 ----  " + i);
/* 434 */     return new ResultJson(0, "修改失败 ", "");
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
/*     */   @PutMapping({"/user"})
/*     */   public ResultJson<String> modifyUserById(@RequestParam("orgid") @NotBlank String orgid, @RequestParam("usernum") @NotBlank String usernum, @RequestParam("name") @NotBlank String name)
/*     */   {
/* 448 */     logger.debug("--C---------- 根据用户id修改用户信息  -----------");
/* 449 */     int i = this.userService.modifyUserByIdServ(orgid, usernum, name);
/* 450 */     if (i > 0) {
/* 451 */       logger.debug("-----C------- 根据用户id修改用户信息   成功  ----  " + i);
/* 452 */       return new ResultJson(0, "修改成功 ", i);
/*     */     }
/* 454 */     logger.debug("-----C------- 根据用户id修改用户信息   失败 ----  " + i);
/* 455 */     return new ResultJson(0, "修改失败 ", "");
/*     */   }
/*     */ }


/* Location:              D:\项目管理\酒店管理\酒店管理\WEB-INF\classes\!\cn\soa\controller\UserController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */