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
/*    */ public class UserRoleRelation
/*    */   implements Serializable
/*    */ {
/*    */   private String user_rol_id;
/*    */   private String userid;
/*    */   private String rolid;
/*    */   
/*    */   public UserRoleRelation(String user_rol_id, String userid, String rolid)
/*    */   {
/* 29 */     this.user_rol_id = user_rol_id;this.userid = userid;this.rolid = rolid; }
/*    */   
/* 31 */   public String getUser_rol_id() { return this.user_rol_id; } public String getUserid() { return this.userid; } public String getRolid() { return this.rolid; } public UserRoleRelation setUser_rol_id(String user_rol_id) { this.user_rol_id = user_rol_id;return this; } public UserRoleRelation setUserid(String userid) { this.userid = userid;return this; } public UserRoleRelation setRolid(String rolid) { this.rolid = rolid;return this; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof UserRoleRelation)) return false; UserRoleRelation other = (UserRoleRelation)o; if (!other.canEqual(this)) return false; Object this$user_rol_id = getUser_rol_id();Object other$user_rol_id = other.getUser_rol_id(); if (this$user_rol_id == null ? other$user_rol_id != null : !this$user_rol_id.equals(other$user_rol_id)) return false; Object this$userid = getUserid();Object other$userid = other.getUserid(); if (this$userid == null ? other$userid != null : !this$userid.equals(other$userid)) return false; Object this$rolid = getRolid();Object other$rolid = other.getRolid();return this$rolid == null ? other$rolid == null : this$rolid.equals(other$rolid); } protected boolean canEqual(Object other) { return other instanceof UserRoleRelation; } public int hashCode() { int PRIME = 59;int result = 1;Object $user_rol_id = getUser_rol_id();result = result * 59 + ($user_rol_id == null ? 43 : $user_rol_id.hashCode());Object $userid = getUserid();result = result * 59 + ($userid == null ? 43 : $userid.hashCode());Object $rolid = getRolid();result = result * 59 + ($rolid == null ? 43 : $rolid.hashCode());return result; } public String toString() { return "UserRoleRelation(user_rol_id=" + getUser_rol_id() + ", userid=" + getUserid() + ", rolid=" + getRolid() + ")"; }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public UserRoleRelation(String userid, String rolid)
/*    */   {
/* 39 */     this.userid = userid;
/* 40 */     this.rolid = rolid;
/*    */   }
/*    */   
/*    */   public UserRoleRelation() {}
/*    */ }


/* Location:              D:\项目管理\酒店管理\酒店管理\WEB-INF\classes\!\cn\soa\entity\UserRoleRelation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */