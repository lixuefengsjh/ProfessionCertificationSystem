/*     */ package cn.soa.entity;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import javax.validation.constraints.NotBlank;
/*     */ import org.springframework.validation.annotation.Validated;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Validated
/*     */ public class UserOrganization
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private String orgid;
/*     */   @NotBlank(message="用户名不能为空")
/*     */   private String name;
/*     */   private String parent_id;
/*     */   @NotBlank(message="用户标识不能为空")
/*     */   private String usernum;
/*     */   @NotBlank(message="用户密码不能为空")
/*     */   private String user_password;
/*     */   private Integer is_parent;
/*     */   private Integer state;
/*     */   private String note;
/*     */   private Integer remark1;
/*     */   private String remark2;
/*     */   
/*     */   public UserOrganization(String orgid, String name, String parent_id, String usernum, String user_password, Integer is_parent, Integer state, String note, Integer remark1, String remark2)
/*     */   {
/*  35 */     this.orgid = orgid;this.name = name;this.parent_id = parent_id;this.usernum = usernum;this.user_password = user_password;this.is_parent = is_parent;this.state = state;this.note = note;this.remark1 = remark1;this.remark2 = remark2; }
/*     */   
/*  37 */   public String getOrgid() { return this.orgid; } public String getName() { return this.name; } public String getParent_id() { return this.parent_id; } public String getUsernum() { return this.usernum; } public String getUser_password() { return this.user_password; } public Integer getIs_parent() { return this.is_parent; } public Integer getState() { return this.state; } public String getNote() { return this.note; } public Integer getRemark1() { return this.remark1; } public String getRemark2() { return this.remark2; } public UserOrganization setOrgid(String orgid) { this.orgid = orgid;return this; } public UserOrganization setName(String name) { this.name = name;return this; } public UserOrganization setParent_id(String parent_id) { this.parent_id = parent_id;return this; } public UserOrganization setUsernum(String usernum) { this.usernum = usernum;return this; } public UserOrganization setUser_password(String user_password) { this.user_password = user_password;return this; } public UserOrganization setIs_parent(Integer is_parent) { this.is_parent = is_parent;return this; } public UserOrganization setState(Integer state) { this.state = state;return this; } public UserOrganization setNote(String note) { this.note = note;return this; } public UserOrganization setRemark1(Integer remark1) { this.remark1 = remark1;return this; } public UserOrganization setRemark2(String remark2) { this.remark2 = remark2;return this; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof UserOrganization)) return false; UserOrganization other = (UserOrganization)o; if (!other.canEqual(this)) return false; Object this$orgid = getOrgid();Object other$orgid = other.getOrgid(); if (this$orgid == null ? other$orgid != null : !this$orgid.equals(other$orgid)) return false; Object this$name = getName();Object other$name = other.getName(); if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false; Object this$parent_id = getParent_id();Object other$parent_id = other.getParent_id(); if (this$parent_id == null ? other$parent_id != null : !this$parent_id.equals(other$parent_id)) return false; Object this$usernum = getUsernum();Object other$usernum = other.getUsernum(); if (this$usernum == null ? other$usernum != null : !this$usernum.equals(other$usernum)) return false; Object this$user_password = getUser_password();Object other$user_password = other.getUser_password(); if (this$user_password == null ? other$user_password != null : !this$user_password.equals(other$user_password)) return false; Object this$is_parent = getIs_parent();Object other$is_parent = other.getIs_parent(); if (this$is_parent == null ? other$is_parent != null : !this$is_parent.equals(other$is_parent)) return false; Object this$state = getState();Object other$state = other.getState(); if (this$state == null ? other$state != null : !this$state.equals(other$state)) return false; Object this$note = getNote();Object other$note = other.getNote(); if (this$note == null ? other$note != null : !this$note.equals(other$note)) return false; Object this$remark1 = getRemark1();Object other$remark1 = other.getRemark1(); if (this$remark1 == null ? other$remark1 != null : !this$remark1.equals(other$remark1)) return false; Object this$remark2 = getRemark2();Object other$remark2 = other.getRemark2();return this$remark2 == null ? other$remark2 == null : this$remark2.equals(other$remark2); } protected boolean canEqual(Object other) { return other instanceof UserOrganization; } public int hashCode() { int PRIME = 59;int result = 1;Object $orgid = getOrgid();result = result * 59 + ($orgid == null ? 43 : $orgid.hashCode());Object $name = getName();result = result * 59 + ($name == null ? 43 : $name.hashCode());Object $parent_id = getParent_id();result = result * 59 + ($parent_id == null ? 43 : $parent_id.hashCode());Object $usernum = getUsernum();result = result * 59 + ($usernum == null ? 43 : $usernum.hashCode());Object $user_password = getUser_password();result = result * 59 + ($user_password == null ? 43 : $user_password.hashCode());Object $is_parent = getIs_parent();result = result * 59 + ($is_parent == null ? 43 : $is_parent.hashCode());Object $state = getState();result = result * 59 + ($state == null ? 43 : $state.hashCode());Object $note = getNote();result = result * 59 + ($note == null ? 43 : $note.hashCode());Object $remark1 = getRemark1();result = result * 59 + ($remark1 == null ? 43 : $remark1.hashCode());Object $remark2 = getRemark2();result = result * 59 + ($remark2 == null ? 43 : $remark2.hashCode());return result; } public String toString() { return "UserOrganization(orgid=" + getOrgid() + ", name=" + getName() + ", parent_id=" + getParent_id() + ", usernum=" + getUsernum() + ", user_password=" + getUser_password() + ", is_parent=" + getIs_parent() + ", state=" + getState() + ", note=" + getNote() + ", remark1=" + getRemark1() + ", remark2=" + getRemark2() + ")"; }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public UserOrganization(String name, String parent_id, String usernum, String user_password, Integer is_parent, String note, Integer remark1, String remark2)
/*     */   {
/*  67 */     this.name = name;
/*  68 */     this.parent_id = parent_id;
/*  69 */     this.usernum = usernum;
/*  70 */     this.user_password = user_password;
/*  71 */     this.is_parent = is_parent;
/*  72 */     this.note = note;
/*  73 */     this.remark1 = remark1;
/*  74 */     this.remark2 = remark2;
/*     */   }
/*     */   
/*     */   public UserOrganization(String name, String parent_id, String usernum, String user_password, Integer is_parent, Integer state, String note, Integer remark1, String remark2)
/*     */   {
/*  79 */     this.name = name;
/*  80 */     this.parent_id = parent_id;
/*  81 */     this.usernum = usernum;
/*  82 */     this.user_password = user_password;
/*  83 */     this.is_parent = is_parent;
/*  84 */     this.state = state;
/*  85 */     this.note = note;
/*  86 */     this.remark1 = remark1;
/*  87 */     this.remark2 = remark2;
/*     */   }
/*     */   
/*     */   public UserOrganization(String name, String parent_id, String usernum, String user_password, Integer is_parent, Integer state, String note)
/*     */   {
/*  92 */     this.name = name;
/*  93 */     this.parent_id = parent_id;
/*  94 */     this.usernum = usernum;
/*  95 */     this.user_password = user_password;
/*  96 */     this.is_parent = is_parent;
/*  97 */     this.state = state;
/*  98 */     this.note = note;
/*     */   }
/*     */   
/*     */   public UserOrganization(String name, String parent_id, String usernum, String user_password, Integer is_parent, String note)
/*     */   {
/* 103 */     this.name = name;
/* 104 */     this.parent_id = parent_id;
/* 105 */     this.usernum = usernum;
/* 106 */     this.user_password = user_password;
/* 107 */     this.is_parent = is_parent;
/* 108 */     this.note = note;
/*     */   }
/*     */   
/*     */   public UserOrganization() {}
/*     */ }


/* Location:              D:\项目管理\酒店管理\酒店管理\WEB-INF\classes\!\cn\soa\entity\UserOrganization.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */