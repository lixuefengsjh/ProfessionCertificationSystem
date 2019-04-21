package cn.soa.service.inter;

import cn.soa.entity.UserRegister;
import java.util.List;

public abstract interface UserRegistServiceInter
{
  public abstract int saveUserRegistServ(UserRegister paramUserRegister);
  
  public abstract UserRegister findRegisterByNumServ(String paramString);
  
  public abstract List<UserRegister> findRegistersServ();
  
  public abstract int modifyRegStateServ(String paramString);
}


/* Location:              D:\项目管理\酒店管理\酒店管理\WEB-INF\classes\!\cn\soa\service\inter\UserRegistServiceInter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */