/*    */ package cn.soa.entity;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Date;
/*    */ import javax.validation.constraints.NotNull;
/*    */ import org.springframework.validation.annotation.Validated;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Validated
/*    */ public class UserInfo
/*    */   implements Serializable
/*    */ {
/*    */   @NotNull(message="用户信息id不能为空")
/*    */   private String usernum;
/*    */   private String nname;
/*    */   private Integer age;
/*    */   private Integer sex;
/*    */   private String address;
/*    */   private String telephone;
/*    */   private String email;
/*    */   private Date create_time;
/*    */   private Date last_modify_time;
/*    */   private String note;
/*    */   private Integer remark1;
/*    */   private String remark2;
/*    */   
/*    */   public UserInfo(String usernum, String nname, Integer age, Integer sex, String address, String telephone, String email, Date create_time, Date last_modify_time, String note, Integer remark1, String remark2)
/*    */   {
/* 34 */     this.usernum = usernum;this.nname = nname;this.age = age;this.sex = sex;this.address = address;this.telephone = telephone;this.email = email;this.create_time = create_time;this.last_modify_time = last_modify_time;this.note = note;this.remark1 = remark1;this.remark2 = remark2; }
/*    */   public UserInfo() {}
/* 36 */   public String getUsernum() { return this.usernum; } public String getNname() { return this.nname; } public Integer getAge() { return this.age; } public Integer getSex() { return this.sex; } public String getAddress() { return this.address; } public String getTelephone() { return this.telephone; } public String getEmail() { return this.email; } public Date getCreate_time() { return this.create_time; } public Date getLast_modify_time() { return this.last_modify_time; } public String getNote() { return this.note; } public Integer getRemark1() { return this.remark1; } public String getRemark2() { return this.remark2; } public UserInfo setUsernum(String usernum) { this.usernum = usernum;return this; } public UserInfo setNname(String nname) { this.nname = nname;return this; } public UserInfo setAge(Integer age) { this.age = age;return this; } public UserInfo setSex(Integer sex) { this.sex = sex;return this; } public UserInfo setAddress(String address) { this.address = address;return this; } public UserInfo setTelephone(String telephone) { this.telephone = telephone;return this; } public UserInfo setEmail(String email) { this.email = email;return this; } public UserInfo setCreate_time(Date create_time) { this.create_time = create_time;return this; } public UserInfo setLast_modify_time(Date last_modify_time) { this.last_modify_time = last_modify_time;return this; } public UserInfo setNote(String note) { this.note = note;return this; } public UserInfo setRemark1(Integer remark1) { this.remark1 = remark1;return this; } public UserInfo setRemark2(String remark2) { this.remark2 = remark2;return this; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof UserInfo)) return false; UserInfo other = (UserInfo)o; if (!other.canEqual(this)) return false; Object this$usernum = getUsernum();Object other$usernum = other.getUsernum(); if (this$usernum == null ? other$usernum != null : !this$usernum.equals(other$usernum)) return false; Object this$nname = getNname();Object other$nname = other.getNname(); if (this$nname == null ? other$nname != null : !this$nname.equals(other$nname)) return false; Object this$age = getAge();Object other$age = other.getAge(); if (this$age == null ? other$age != null : !this$age.equals(other$age)) return false; Object this$sex = getSex();Object other$sex = other.getSex(); if (this$sex == null ? other$sex != null : !this$sex.equals(other$sex)) return false; Object this$address = getAddress();Object other$address = other.getAddress(); if (this$address == null ? other$address != null : !this$address.equals(other$address)) return false; Object this$telephone = getTelephone();Object other$telephone = other.getTelephone(); if (this$telephone == null ? other$telephone != null : !this$telephone.equals(other$telephone)) return false; Object this$email = getEmail();Object other$email = other.getEmail(); if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false; Object this$create_time = getCreate_time();Object other$create_time = other.getCreate_time(); if (this$create_time == null ? other$create_time != null : !this$create_time.equals(other$create_time)) return false; Object this$last_modify_time = getLast_modify_time();Object other$last_modify_time = other.getLast_modify_time(); if (this$last_modify_time == null ? other$last_modify_time != null : !this$last_modify_time.equals(other$last_modify_time)) return false; Object this$note = getNote();Object other$note = other.getNote(); if (this$note == null ? other$note != null : !this$note.equals(other$note)) return false; Object this$remark1 = getRemark1();Object other$remark1 = other.getRemark1(); if (this$remark1 == null ? other$remark1 != null : !this$remark1.equals(other$remark1)) return false; Object this$remark2 = getRemark2();Object other$remark2 = other.getRemark2();return this$remark2 == null ? other$remark2 == null : this$remark2.equals(other$remark2); } protected boolean canEqual(Object other) { return other instanceof UserInfo; } public int hashCode() { int PRIME = 59;int result = 1;Object $usernum = getUsernum();result = result * 59 + ($usernum == null ? 43 : $usernum.hashCode());Object $nname = getNname();result = result * 59 + ($nname == null ? 43 : $nname.hashCode());Object $age = getAge();result = result * 59 + ($age == null ? 43 : $age.hashCode());Object $sex = getSex();result = result * 59 + ($sex == null ? 43 : $sex.hashCode());Object $address = getAddress();result = result * 59 + ($address == null ? 43 : $address.hashCode());Object $telephone = getTelephone();result = result * 59 + ($telephone == null ? 43 : $telephone.hashCode());Object $email = getEmail();result = result * 59 + ($email == null ? 43 : $email.hashCode());Object $create_time = getCreate_time();result = result * 59 + ($create_time == null ? 43 : $create_time.hashCode());Object $last_modify_time = getLast_modify_time();result = result * 59 + ($last_modify_time == null ? 43 : $last_modify_time.hashCode());Object $note = getNote();result = result * 59 + ($note == null ? 43 : $note.hashCode());Object $remark1 = getRemark1();result = result * 59 + ($remark1 == null ? 43 : $remark1.hashCode());Object $remark2 = getRemark2();result = result * 59 + ($remark2 == null ? 43 : $remark2.hashCode());return result; } public String toString() { return "UserInfo(usernum=" + getUsernum() + ", nname=" + getNname() + ", age=" + getAge() + ", sex=" + getSex() + ", address=" + getAddress() + ", telephone=" + getTelephone() + ", email=" + getEmail() + ", create_time=" + getCreate_time() + ", last_modify_time=" + getLast_modify_time() + ", note=" + getNote() + ", remark1=" + getRemark1() + ", remark2=" + getRemark2() + ")"; }
/*    */ }


/* Location:              D:\项目管理\酒店管理\酒店管理\WEB-INF\classes\!\cn\soa\entity\UserInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */