package cn.soa.service.inter;

import cn.soa.entity.AuthInfo;
import cn.soa.entity.IotUserModuleResource;
import cn.soa.entity.UserRole;
import cn.soa.entity.UserRoleRelation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface RoleServiceInter
{
  public abstract List<UserRole> getUserRoleByNum(String paramString);
  
  public abstract List<UserRole> queryAllroles(Integer paramInteger1, Integer paramInteger2);
  
  public abstract int countRoles();
  
  public abstract int saveUserRole(UserRole paramUserRole);
  
  public abstract int modifyUserRoleById(UserRole paramUserRole);
  
  public abstract int deleteRolesInIds(String[] paramArrayOfString);
  
  public abstract List<Map<String, Object>> queryUsersByRold(@Param("ROLID") String paramString);
  
  public abstract ArrayList<AuthInfo> findAuthByRolidServ(String paramString);
  
  public abstract int deleteUserUserAndRolebyId(String paramString);
  
  public abstract int saveUserUserRoleInBatch(List<UserRoleRelation> paramList);
  
  public abstract ArrayList<IotUserModuleResource> findAuthJsonServ(String paramString);
}


/* Location:              D:\项目管理\酒店管理\酒店管理\WEB-INF\classes\!\cn\soa\service\inter\RoleServiceInter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */