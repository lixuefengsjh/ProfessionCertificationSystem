package cn.soa.dao;

import cn.soa.entity.UserRegister;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public abstract interface UserRegistMapper
{
  public abstract List<UserRegister> findRegisters();
  
  public abstract UserRegister findRegisterByNum(String paramString);
  
  public abstract int saveUserRegis(UserRegister paramUserRegister);
  
  public abstract int modifyRegisteState(String paramString);
}


/* Location:              D:\项目管理\酒店管理\酒店管理\WEB-INF\classes\!\cn\soa\dao\UserRegistMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */