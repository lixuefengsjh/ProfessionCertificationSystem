package cn.soa.service.inter;

import cn.soa.entity.UserInfo;
import cn.soa.entity.UserOrganization;
import java.util.List;
import java.util.Map;

public abstract interface UserServiceInter
{
  public abstract UserOrganization getUserOrganById(String paramString);
  
  public abstract UserInfo getUserInfoByUserId(String paramString);
  
  public abstract UserInfo getUserInfoByNum(String paramString);
  
  public abstract UserOrganization getUserOrganByUsernum(String paramString);
  
  public abstract String saveOrganServ(UserOrganization paramUserOrganization);
  
  public abstract int saveUserInfoServ(UserInfo paramUserInfo);
  
  public abstract List<UserOrganization> getUserAllListServ();
  
  public abstract int deleteUserByNumServ(String paramString);
  
  public abstract int deleteUserInfoByNumServ(String paramString);
  
  public abstract int deleteUserAndInfoByNum(String paramString);
  
  public abstract List<UserOrganization> findUsersAll();
  
  public abstract UserOrganization getUsersByNum(String paramString);
  
  public abstract UserOrganization saveUserBackId(String paramString1, String paramString2);
  
  public abstract List<Map<String, Object>> getInitOrganServ(String paramString);
  
  public abstract int modifyUserParentidServ(String paramString1, String paramString2);
  
  public abstract int modifyUserByIdServ(String paramString1, String paramString2, String paramString3);
  
  public abstract int deleteUserByNum(String paramString);
}


/* Location:              D:\项目管理\酒店管理\酒店管理\WEB-INF\classes\!\cn\soa\service\inter\UserServiceInter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */