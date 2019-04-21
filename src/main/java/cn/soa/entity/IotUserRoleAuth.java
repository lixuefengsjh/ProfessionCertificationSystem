/*    */ package cn.soa.entity;
/*    */ 
/*    */ public class IotUserRoleAuth
/*    */ {
/*    */   private String rolAutId;
/*    */   private String rolid;
/*    */   private String autid;
/*    */   
/*    */   public String getRolAutId()
/*    */   {
/* 11 */     return this.rolAutId;
/*    */   }
/*    */   
/*    */   public void setRolAutId(String rolAutId) {
/* 15 */     this.rolAutId = (rolAutId == null ? null : rolAutId.trim());
/*    */   }
/*    */   
/*    */   public String getRolid() {
/* 19 */     return this.rolid;
/*    */   }
/*    */   
/*    */   public void setRolid(String rolid) {
/* 23 */     this.rolid = (rolid == null ? null : rolid.trim());
/*    */   }
/*    */   
/*    */   public String getAutid() {
/* 27 */     return this.autid;
/*    */   }
/*    */   
/*    */   public void setAutid(String autid) {
/* 31 */     this.autid = (autid == null ? null : autid.trim());
/*    */   }
/*    */ }


/* Location:              D:\项目管理\酒店管理\酒店管理\WEB-INF\classes\!\cn\soa\entity\IotUserRoleAuth.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */