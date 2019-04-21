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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class UserAuthority
/*    */   implements Serializable
/*    */ {
/*    */   private int autid;
/*    */   private int type;
/*    */   private String name;
/*    */   private String note;
/*    */   private String remark1;
/*    */   
/*    */   public UserAuthority(int autid, int type, String name, String note, String remark1)
/*    */   {
/* 31 */     this.autid = autid;this.type = type;this.name = name;this.note = note;this.remark1 = remark1; }
/*    */   
/* 33 */   public int getAutid() { return this.autid; } public int getType() { return this.type; } public String getName() { return this.name; } public String getNote() { return this.note; } public String getRemark1() { return this.remark1; } public UserAuthority setAutid(int autid) { this.autid = autid;return this; } public UserAuthority setType(int type) { this.type = type;return this; } public UserAuthority setName(String name) { this.name = name;return this; } public UserAuthority setNote(String note) { this.note = note;return this; } public UserAuthority setRemark1(String remark1) { this.remark1 = remark1;return this; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof UserAuthority)) return false; UserAuthority other = (UserAuthority)o; if (!other.canEqual(this)) return false; if (getAutid() != other.getAutid()) return false; if (getType() != other.getType()) return false; Object this$name = getName();Object other$name = other.getName(); if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false; Object this$note = getNote();Object other$note = other.getNote(); if (this$note == null ? other$note != null : !this$note.equals(other$note)) return false; Object this$remark1 = getRemark1();Object other$remark1 = other.getRemark1();return this$remark1 == null ? other$remark1 == null : this$remark1.equals(other$remark1); } protected boolean canEqual(Object other) { return other instanceof UserAuthority; } public int hashCode() { int PRIME = 59;int result = 1;result = result * 59 + getAutid();result = result * 59 + getType();Object $name = getName();result = result * 59 + ($name == null ? 43 : $name.hashCode());Object $note = getNote();result = result * 59 + ($note == null ? 43 : $note.hashCode());Object $remark1 = getRemark1();result = result * 59 + ($remark1 == null ? 43 : $remark1.hashCode());return result; } public String toString() { return "UserAuthority(autid=" + getAutid() + ", type=" + getType() + ", name=" + getName() + ", note=" + getNote() + ", remark1=" + getRemark1() + ")"; }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public UserAuthority(int type, String name, String note, String remark1)
/*    */   {
/* 43 */     this.type = type;
/* 44 */     this.name = name;
/* 45 */     this.note = note;
/* 46 */     this.remark1 = remark1;
/*    */   }
/*    */   
/*    */   public UserAuthority() {}
/*    */ }


/* Location:              D:\项目管理\酒店管理\酒店管理\WEB-INF\classes\!\cn\soa\entity\UserAuthority.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */