/*    */ package cn.soa.entity;
/*    */ 
/*    */ import java.io.Serializable;
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
/*    */ public class UserRole
/*    */   implements Serializable
/*    */ {
/*    */   private String rolid;
/*    */   private String name;
/*    */   private Integer state;
/*    */   private String create_time;
/*    */   private String last_modify_time;
/*    */   private String note;
/*    */   private Integer remark1;
/*    */   private String remark2;
/*    */   
/*    */   public UserRole(String rolid, String name, Integer state, String create_time, String last_modify_time, String note, Integer remark1, String remark2)
/*    */   {
/* 29 */     this.rolid = rolid;this.name = name;this.state = state;this.create_time = create_time;this.last_modify_time = last_modify_time;this.note = note;this.remark1 = remark1;this.remark2 = remark2; }
/*    */   
/* 31 */   public String getRolid() { return this.rolid; } public String getName() { return this.name; } public Integer getState() { return this.state; } public String getCreate_time() { return this.create_time; } public String getLast_modify_time() { return this.last_modify_time; } public String getNote() { return this.note; } public Integer getRemark1() { return this.remark1; } public String getRemark2() { return this.remark2; } public UserRole setRolid(String rolid) { this.rolid = rolid;return this; } public UserRole setName(String name) { this.name = name;return this; } public UserRole setState(Integer state) { this.state = state;return this; } public UserRole setCreate_time(String create_time) { this.create_time = create_time;return this; } public UserRole setLast_modify_time(String last_modify_time) { this.last_modify_time = last_modify_time;return this; } public UserRole setNote(String note) { this.note = note;return this; } public UserRole setRemark1(Integer remark1) { this.remark1 = remark1;return this; } public UserRole setRemark2(String remark2) { this.remark2 = remark2;return this; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof UserRole)) return false; UserRole other = (UserRole)o; if (!other.canEqual(this)) return false; Object this$rolid = getRolid();Object other$rolid = other.getRolid(); if (this$rolid == null ? other$rolid != null : !this$rolid.equals(other$rolid)) return false; Object this$name = getName();Object other$name = other.getName(); if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false; Object this$state = getState();Object other$state = other.getState(); if (this$state == null ? other$state != null : !this$state.equals(other$state)) return false; Object this$create_time = getCreate_time();Object other$create_time = other.getCreate_time(); if (this$create_time == null ? other$create_time != null : !this$create_time.equals(other$create_time)) return false; Object this$last_modify_time = getLast_modify_time();Object other$last_modify_time = other.getLast_modify_time(); if (this$last_modify_time == null ? other$last_modify_time != null : !this$last_modify_time.equals(other$last_modify_time)) return false; Object this$note = getNote();Object other$note = other.getNote(); if (this$note == null ? other$note != null : !this$note.equals(other$note)) return false; Object this$remark1 = getRemark1();Object other$remark1 = other.getRemark1(); if (this$remark1 == null ? other$remark1 != null : !this$remark1.equals(other$remark1)) return false; Object this$remark2 = getRemark2();Object other$remark2 = other.getRemark2();return this$remark2 == null ? other$remark2 == null : this$remark2.equals(other$remark2); } protected boolean canEqual(Object other) { return other instanceof UserRole; } public int hashCode() { int PRIME = 59;int result = 1;Object $rolid = getRolid();result = result * 59 + ($rolid == null ? 43 : $rolid.hashCode());Object $name = getName();result = result * 59 + ($name == null ? 43 : $name.hashCode());Object $state = getState();result = result * 59 + ($state == null ? 43 : $state.hashCode());Object $create_time = getCreate_time();result = result * 59 + ($create_time == null ? 43 : $create_time.hashCode());Object $last_modify_time = getLast_modify_time();result = result * 59 + ($last_modify_time == null ? 43 : $last_modify_time.hashCode());Object $note = getNote();result = result * 59 + ($note == null ? 43 : $note.hashCode());Object $remark1 = getRemark1();result = result * 59 + ($remark1 == null ? 43 : $remark1.hashCode());Object $remark2 = getRemark2();result = result * 59 + ($remark2 == null ? 43 : $remark2.hashCode());return result; } public String toString() { return "UserRole(rolid=" + getRolid() + ", name=" + getName() + ", state=" + getState() + ", create_time=" + getCreate_time() + ", last_modify_time=" + getLast_modify_time() + ", note=" + getNote() + ", remark1=" + getRemark1() + ", remark2=" + getRemark2() + ")"; }
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
/*    */   public UserRole(String name, Integer state, String note, Integer remark1, String remark2)
/*    */   {
/* 46 */     this.name = name;
/* 47 */     this.state = state;
/* 48 */     this.note = note;
/* 49 */     this.remark1 = remark1;
/* 50 */     this.remark2 = remark2;
/*    */   }
/*    */   
/*    */   public UserRole() {}
/*    */ }


/* Location:              D:\项目管理\酒店管理\酒店管理\WEB-INF\classes\!\cn\soa\entity\UserRole.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */