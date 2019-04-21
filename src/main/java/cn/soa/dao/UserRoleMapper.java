package cn.soa.dao;

import cn.soa.entity.IotUserModuleResource;
import cn.soa.entity.UserOrganization;
import cn.soa.entity.UserRole;
import cn.soa.entity.UserRoleRelation;
import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public abstract interface UserRoleMapper
{
  public abstract UserRole findUserRoleById(@Param("rolid") int paramInt);
  
  public abstract List<UserRole> findUserRoleByNum(@Param("usernum") String paramString);
  
  public abstract int saveUserRole(@Param("userRole") UserRole paramUserRole);
  
  public abstract int saveUserRoleInBatch(@Param("userRoles") List<UserRole> paramList);
  
  public abstract int modifyUserRoleById(@Param("userRole") UserRole paramUserRole);
  
  public abstract int deleteUserRoleById(@Param("rolid") int paramInt);
  
  public abstract int saveUserAndRoleById(@Param("userid") String paramString1, @Param("rolid") String paramString2);
  
  public abstract int saveUserAndRoleByObjects(@Param("user") UserOrganization paramUserOrganization, @Param("userRole") UserRole paramUserRole);
  
  public abstract int deleteUserAndRoleById(@Param("userid") String paramString1, @Param("rolid") String paramString2);
  
  public abstract int deleteUserAndRoleByObjects(@Param("user") UserOrganization paramUserOrganization, @Param("userRole") UserRole paramUserRole);
  
  public abstract List<UserRole> queryAllroles(@Param("first") Integer paramInteger1, @Param("last") Integer paramInteger2);
  
  public abstract int countRoles();
  
  public abstract int deleteRolesInIds(@Param("ids") String[] paramArrayOfString);
  
  public abstract List<UserOrganization> queryUsersByRold(@Param("ROLID") String paramString);
  
  public abstract List<UserOrganization> queryAllorgnInfo();
  
  public abstract ArrayList<IotUserModuleResource> findAuthByRolid(String paramString);
  
  public abstract int saveUserUserRoleInBatch(@Param("lists") List<UserRoleRelation> paramList);
  
  public abstract int deleteUserUserAndRolebyId(@Param("rolid") String paramString);
}


/* Location:              D:\项目管理\酒店管理\酒店管理\WEB-INF\classes\!\cn\soa\dao\UserRoleMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */