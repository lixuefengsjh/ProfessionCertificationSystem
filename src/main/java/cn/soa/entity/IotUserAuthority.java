/*    */ package cn.soa.entity;
/*    */ 
/*    */ 
/*    */ public class IotUserAuthority
/*    */ {
/*    */   private String autid;
/*    */   
/*    */   private String resourceid;
/*    */   
/*    */   private Short type;
/*    */   
/*    */   private String name;
/*    */   private String note;
/*    */   private Integer remark1;
/*    */   
/*    */   public String getAutid()
/*    */   {
/* 18 */     return this.autid;
/*    */   }
/*    */   
/*    */   public void setAutid(String autid) {
/* 22 */     this.autid = (autid == null ? null : autid.trim());
/*    */   }
/*    */   
/*    */   public String getResourceid() {
/* 26 */     return this.resourceid;
/*    */   }
/*    */   
/*    */   public void setResourceid(String resourceid) {
/* 30 */     this.resourceid = (resourceid == null ? null : resourceid.trim());
/*    */   }
/*    */   
/*    */   public Short getType() {
/* 34 */     return this.type;
/*    */   }
/*    */   
/*    */   public void setType(Short type) {
/* 38 */     this.type = type;
/*    */   }
/*    */   
/*    */   public String getName() {
/* 42 */     return this.name;
/*    */   }
/*    */   
/*    */   public void setName(String name) {
/* 46 */     this.name = (name == null ? null : name.trim());
/*    */   }
/*    */   
/*    */   public String getNote() {
/* 50 */     return this.note;
/*    */   }
/*    */   
/*    */   public void setNote(String note) {
/* 54 */     this.note = (note == null ? null : note.trim());
/*    */   }
/*    */   
/*    */   public Integer getRemark1() {
/* 58 */     return this.remark1;
/*    */   }
/*    */   
/*    */   public void setRemark1(Integer remark1) {
/* 62 */     this.remark1 = remark1;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public String toString()
/*    */   {
/* 72 */     return 
/* 73 */       "IotUserAuthority [autid=" + this.autid + ", resourceid=" + this.resourceid + ", type=" + this.type + ", name=" + this.name + ", note=" + this.note + ", remark1=" + this.remark1 + "]";
/*    */   }
/*    */ }


/* Location:              D:\项目管理\酒店管理\酒店管理\WEB-INF\classes\!\cn\soa\entity\IotUserAuthority.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */