package cn.soa.dao;

import cn.soa.entity.UserOrganization;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public abstract interface UserMapper
{
  public abstract UserOrganization findUserById(@Param("userId") String paramString);
  
  public abstract UserOrganization findUserByUsernum(@Param("userNum") String paramString);
  
  public abstract UserOrganization findUsersByNum(String paramString);
  
  public abstract List<UserOrganization> findUserAll();
  
  public abstract List<UserOrganization> findUsersAll();
  
  public abstract int saveUser(@Param("userOrgan") UserOrganization paramUserOrganization);
  
  public abstract int saveOrganBackId(UserOrganization paramUserOrganization);
  
  public abstract int saveUserByBatch(@Param("userOrgans") List<UserOrganization> paramList);
  
  public abstract int modifyUserBynum(@Param("userOrgan") UserOrganization paramUserOrganization);
  
  public abstract int deleteUserById(@Param("userid") String paramString);
  
  public abstract int deleteUserByUsernum(@Param("usernum") String paramString);
  
  public abstract int saveUserBackId(UserOrganization paramUserOrganization);
  
  public abstract int modifyUserById(@Param("userOrgan") UserOrganization paramUserOrganization);
}


/* Location:              D:\项目管理\酒店管理\酒店管理\WEB-INF\classes\!\cn\soa\dao\UserMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */