/*    */ package cn.soa.entity;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Date;
/*    */ import javax.validation.constraints.NotBlank;
/*    */ import javax.validation.constraints.NotNull;
/*    */ import org.springframework.validation.annotation.Validated;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Validated
/*    */ public class UserRegister
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   private String regid;
/*    */   @NotNull(message="用户标识不能为空")
/*    */   private String num;
/*    */   @NotBlank(message="用户名不能为空")
/*    */   private String name;
/*    */   private Date create_time;
/*    */   private Integer state;
/*    */   @NotBlank(message="用户备注不能为空")
/*    */   private String note;
/*    */   private Integer remark1;
/*    */   private String remark2;
/*    */   
/*    */   public UserRegister(String regid, String num, String name, Date create_time, Integer state, String note, Integer remark1, String remark2)
/*    */   {
/* 35 */     this.regid = regid;this.num = num;this.name = name;this.create_time = create_time;this.state = state;this.note = note;this.remark1 = remark1;this.remark2 = remark2; }
/*    */   
/* 37 */   public String getRegid() { return this.regid; } public String getNum() { return this.num; } public String getName() { return this.name; } public Date getCreate_time() { return this.create_time; } public Integer getState() { return this.state; } public String getNote() { return this.note; } public Integer getRemark1() { return this.remark1; } public String getRemark2() { return this.remark2; } public UserRegister setRegid(String regid) { this.regid = regid;return this; } public UserRegister setNum(String num) { this.num = num;return this; } public UserRegister setName(String name) { this.name = name;return this; } public UserRegister setCreate_time(Date create_time) { this.create_time = create_time;return this; } public UserRegister setState(Integer state) { this.state = state;return this; } public UserRegister setNote(String note) { this.note = note;return this; } public UserRegister setRemark1(Integer remark1) { this.remark1 = remark1;return this; } public UserRegister setRemark2(String remark2) { this.remark2 = remark2;return this; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof UserRegister)) return false; UserRegister other = (UserRegister)o; if (!other.canEqual(this)) return false; Object this$regid = getRegid();Object other$regid = other.getRegid(); if (this$regid == null ? other$regid != null : !this$regid.equals(other$regid)) return false; Object this$num = getNum();Object other$num = other.getNum(); if (this$num == null ? other$num != null : !this$num.equals(other$num)) return false; Object this$name = getName();Object other$name = other.getName(); if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false; Object this$create_time = getCreate_time();Object other$create_time = other.getCreate_time(); if (this$create_time == null ? other$create_time != null : !this$create_time.equals(other$create_time)) return false; Object this$state = getState();Object other$state = other.getState(); if (this$state == null ? other$state != null : !this$state.equals(other$state)) return false; Object this$note = getNote();Object other$note = other.getNote(); if (this$note == null ? other$note != null : !this$note.equals(other$note)) return false; Object this$remark1 = getRemark1();Object other$remark1 = other.getRemark1(); if (this$remark1 == null ? other$remark1 != null : !this$remark1.equals(other$remark1)) return false; Object this$remark2 = getRemark2();Object other$remark2 = other.getRemark2();return this$remark2 == null ? other$remark2 == null : this$remark2.equals(other$remark2); } protected boolean canEqual(Object other) { return other instanceof UserRegister; } public int hashCode() { int PRIME = 59;int result = 1;Object $regid = getRegid();result = result * 59 + ($regid == null ? 43 : $regid.hashCode());Object $num = getNum();result = result * 59 + ($num == null ? 43 : $num.hashCode());Object $name = getName();result = result * 59 + ($name == null ? 43 : $name.hashCode());Object $create_time = getCreate_time();result = result * 59 + ($create_time == null ? 43 : $create_time.hashCode());Object $state = getState();result = result * 59 + ($state == null ? 43 : $state.hashCode());Object $note = getNote();result = result * 59 + ($note == null ? 43 : $note.hashCode());Object $remark1 = getRemark1();result = result * 59 + ($remark1 == null ? 43 : $remark1.hashCode());Object $remark2 = getRemark2();result = result * 59 + ($remark2 == null ? 43 : $remark2.hashCode());return result; } public String toString() { return "UserRegister(regid=" + getRegid() + ", num=" + getNum() + ", name=" + getName() + ", create_time=" + getCreate_time() + ", state=" + getState() + ", note=" + getNote() + ", remark1=" + getRemark1() + ", remark2=" + getRemark2() + ")"; }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public UserRegister(String num, String name, Integer state, String note)
/*    */   {
/* 64 */     this.num = num;
/* 65 */     this.name = name;
/* 66 */     this.state = state;
/* 67 */     this.note = note;
/*    */   }
/*    */   
/*    */   public UserRegister() {}
/*    */ }


/* Location:              D:\项目管理\酒店管理\酒店管理\WEB-INF\classes\!\cn\soa\entity\UserRegister.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */