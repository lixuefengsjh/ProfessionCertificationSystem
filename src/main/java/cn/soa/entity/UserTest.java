/*    */ package cn.soa.entity;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import org.springframework.validation.annotation.Validated;
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
/*    */ @Validated
/*    */ public class UserTest
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   private String name;
/*    */   private Integer pId;
/*    */   private Integer id;
/*    */   
/* 36 */   public String toString() { return "UserTest(name=" + getName() + ", pId=" + getPId() + ", id=" + getId() + ")"; } public int hashCode() { int PRIME = 59;int result = 1;Object $name = getName();result = result * 59 + ($name == null ? 43 : $name.hashCode());Object $pId = getPId();result = result * 59 + ($pId == null ? 43 : $pId.hashCode());Object $id = getId();result = result * 59 + ($id == null ? 43 : $id.hashCode());return result; } protected boolean canEqual(Object other) { return other instanceof UserTest; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof UserTest)) return false; UserTest other = (UserTest)o; if (!other.canEqual(this)) return false; Object this$name = getName();Object other$name = other.getName(); if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false; Object this$pId = getPId();Object other$pId = other.getPId(); if (this$pId == null ? other$pId != null : !this$pId.equals(other$pId)) return false; Object this$id = getId();Object other$id = other.getId();return this$id == null ? other$id == null : this$id.equals(other$id); } public UserTest setId(Integer id) { this.id = id;return this; } public UserTest setPId(Integer pId) { this.pId = pId;return this; } public UserTest setName(String name) { this.name = name;return this; } public Integer getId() { return this.id; } public Integer getPId() { return this.pId; } public String getName() { return this.name; }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public UserTest() {}
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public UserTest(String name, Integer id, Integer pId)
/*    */   {
/* 53 */     this.name = name;
/* 54 */     this.id = id;
/* 55 */     this.pId = pId;
/*    */   }
/*    */ }


/* Location:              D:\项目管理\酒店管理\酒店管理\WEB-INF\classes\!\cn\soa\entity\UserTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */