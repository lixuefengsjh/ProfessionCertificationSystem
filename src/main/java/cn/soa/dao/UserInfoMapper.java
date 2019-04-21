package cn.soa.dao;

import cn.soa.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public abstract interface UserInfoMapper
{
  public abstract UserInfo findUserInfoById(@Param("userId") String paramString);
  
  public abstract UserInfo findUserInfoByUsernum(@Param("usernum") String paramString);
  
  public abstract int saveUserInfo(@Param("userInfo") UserInfo paramUserInfo);
  
  public abstract int modifyUserInfoById(@Param("userInfo") UserInfo paramUserInfo);
  
  public abstract int deleteUserInfoByNum(@Param("usernum") String paramString);
}


/* Location:              D:\项目管理\酒店管理\酒店管理\WEB-INF\classes\!\cn\soa\dao\UserInfoMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */