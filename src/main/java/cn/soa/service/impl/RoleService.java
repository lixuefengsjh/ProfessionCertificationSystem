/*     */ package cn.soa.service.impl;
/*     */ 
/*     */ import cn.soa.dao.UserRoleMapper;
/*     */ import cn.soa.entity.AuthInfo;
/*     */ import cn.soa.entity.IotUserModuleResource;
/*     */ import cn.soa.entity.UserOrganization;
/*     */ import cn.soa.entity.UserRole;
/*     */ import cn.soa.entity.UserRoleRelation;
/*     */ import cn.soa.service.inter.RoleServiceInter;
/*     */ import java.io.PrintStream;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ @Service
/*     */ public class RoleService
/*     */   implements RoleServiceInter
/*     */ {
/*  41 */   private static Logger logger = LoggerFactory.getLogger(RoleService.class);
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @Autowired
/*     */   private UserRoleMapper userRoleMapper;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public List<UserRole> getUserRoleByNum(String usernum)
/*     */   {
/*  54 */     List<UserRole> userRoles = this.userRoleMapper.findUserRoleByNum(usernum);
/*  55 */     return userRoles;
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
/*     */   public ArrayList<IotUserModuleResource> findAuthJsonServ(String rolid)
/*     */   {
/*  69 */     ArrayList<IotUserModuleResource> auths = null;
/*     */     try {
/*  71 */       auths = this.userRoleMapper.findAuthByRolid(rolid);
/*     */     } catch (Exception e) {
/*  73 */       e.printStackTrace();
/*  74 */       logger.debug("--------根据用户角色id查询用户具有的权限  findAuthJsonServ--------出错");
/*  75 */       return null;
/*     */     }
/*  77 */     return auths;
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
/*     */   public ArrayList<AuthInfo> findAuthByRolidServ(String rolid)
/*     */   {
/*  93 */     ArrayList<IotUserModuleResource> auths = null;
/*     */     try {
/*  95 */       auths = this.userRoleMapper.findAuthByRolid(rolid);
/*     */     } catch (Exception e) {
/*  97 */       e.printStackTrace();
/*  98 */       logger.debug("--------根据用户角色id查询用户具有的权限  findAuthByRolidServ--------出错");
/*  99 */       return null;
/*     */     }
/* 101 */     logger.debug("--S--------根据用户角色id查询用户具有的权限   -----auths:");
/* 102 */     logger.debug(auths.toString());
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 107 */     ArrayList<IotUserModuleResource> tempAuths = new ArrayList();
/* 108 */     ArrayList<AuthInfo> authInfos = new ArrayList();
/* 109 */     if (auths != null) {
/* 110 */       for (IotUserModuleResource i : auths) {
/* 111 */         if ("-1".equals(i.getParentId())) {
/* 112 */           tempAuths.add(i);
/* 113 */           AuthInfo authInfo = new AuthInfo();
/* 114 */           authInfo.setId(i.getModId());
/* 115 */           authInfo.setFirst(i.getName());
/* 116 */           authInfos.add(authInfo);
/*     */         }
/*     */       }
/* 119 */       logger.debug("--S--------根据用户角色id查询用户具有的权限   -----tempAuths:");
/* 120 */       logger.debug(tempAuths.toString());
/*     */       
/* 122 */       for (IotUserModuleResource i : auths) {
/* 123 */         String pid = i.getParentId();
/* 124 */         if ((pid != null) && (pid != "-1")) {
/* 125 */           for (int j = 0; j < tempAuths.size(); j++) {
/* 126 */             if (pid.equals(((IotUserModuleResource)tempAuths.get(j)).getModId())) {
/* 127 */               AuthInfo currentAuth = (AuthInfo)authInfos.get(j);
/* 128 */               String a = currentAuth.getSecond();
/*     */               
/* 130 */               if (a == null) {
/* 131 */                 currentAuth.setSecond(i.getName());
/*     */               }
/* 133 */               else if (i.getName() == null) {
/* 134 */                 currentAuth.setSecond(a + "," + " ");
/*     */               } else {
/* 136 */                 currentAuth.setSecond(a + "," + i.getName());
/*     */               }
/*     */               
/*     */ 
/*     */ 
/* 141 */               String url = currentAuth.getUrl();
/*     */               
/* 143 */               if (url == null) {
/* 144 */                 currentAuth.setUrl(i.getUrl());
/* 145 */                 break; }
/* 146 */               if (i.getUrl() == null) {
/* 147 */                 currentAuth.setUrl(url + "," + " ");
/* 148 */                 break; }
/* 149 */               currentAuth.setUrl(url + "," + i.getUrl());
/*     */               
/*     */ 
/*     */ 
/* 153 */               break;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/* 158 */       logger.debug("--S--------根据用户角色id查询用户具有的权限   -----AuthInfo");
/* 159 */       logger.debug(authInfos.toString());
/* 160 */       return authInfos;
/*     */     }
/* 162 */     return authInfos;
/*     */   }
/*     */   
/*     */   public List<UserRole> queryAllroles(Integer page, Integer pageSize)
/*     */   {
/* 167 */     if ((page == null) || (pageSize == null)) {
/* 168 */       page = Integer.valueOf(0);
/* 169 */       pageSize = Integer.valueOf(0);
/*     */     }
/* 171 */     return this.userRoleMapper.queryAllroles(Integer.valueOf((page.intValue() - 1) * pageSize.intValue()), Integer.valueOf(page.intValue() * pageSize.intValue()));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public int countRoles()
/*     */   {
/* 178 */     return this.userRoleMapper.countRoles();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public int saveUserRole(UserRole userRole)
/*     */   {
/* 185 */     return this.userRoleMapper.saveUserRole(userRole);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public int modifyUserRoleById(UserRole userRole)
/*     */   {
/* 192 */     return this.userRoleMapper.modifyUserRoleById(userRole);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public int deleteRolesInIds(String[] ids)
/*     */   {
/* 199 */     return this.userRoleMapper.deleteRolesInIds(ids);
/*     */   }
/*     */   
/*     */ 
/*     */   public List<Map<String, Object>> queryUsersByRold(String ROLID)
/*     */   {
/* 205 */     List<UserOrganization> orgs = this.userRoleMapper.queryAllorgnInfo();
/* 206 */     logger.debug("---S-----queryUsersByRold----------:" + orgs);
/* 207 */     List<UserOrganization> orgsByid = this.userRoleMapper.queryUsersByRold(ROLID);
/* 208 */     System.out.println(orgsByid.toString());
/* 209 */     List<Map<String, Object>> lists = new ArrayList();
/* 210 */     for (UserOrganization org : orgs) {
/* 211 */       Map<String, Object> map = new HashMap();
/* 212 */       map.put("name", org.getName());
/* 213 */       map.put("orgid", org.getOrgid());
/* 214 */       map.put("is_parent", org.getIs_parent());
/* 215 */       map.put("usernum", org.getUsernum());
/* 216 */       map.put("parent_id", org.getParent_id());
/* 217 */       if (org.getUsernum().equals("0")) {
/* 218 */         map.put("open", Boolean.valueOf(true));
/*     */       }
/* 220 */       if (!orgsByid.isEmpty()) {
/* 221 */         for (int i = 0; i < orgsByid.size(); i++) {
/* 222 */           if (org.getName().equals(((UserOrganization)orgsByid.get(i)).getName())) {
/* 223 */             map.put("checked", Boolean.valueOf(true));
/*     */           }
/*     */         }
/*     */       }
/*     */       
/* 228 */       lists.add(map);
/*     */     }
/* 230 */     return lists;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int deleteUserUserAndRolebyId(String rolid)
/*     */   {
/* 238 */     return this.userRoleMapper.deleteUserUserAndRolebyId(rolid);
/*     */   }
/*     */   
/*     */ 
/*     */   public int saveUserUserRoleInBatch(List<UserRoleRelation> lists)
/*     */   {
/* 244 */     return this.userRoleMapper.saveUserUserRoleInBatch(lists);
/*     */   }
/*     */ }


/* Location:              D:\项目管理\酒店管理\酒店管理\WEB-INF\classes\!\cn\soa\service\impl\RoleService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */