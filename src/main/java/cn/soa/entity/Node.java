/*    */ package cn.soa.entity;
/*    */ 
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Node
/*    */ {
/*    */   private String name;
/*    */   private boolean spread;
/*    */   private String id;
/*    */   private List<Node> children;
/*    */   
/*    */   public Node(String name, boolean spread, String id, List<Node> children)
/*    */   {
/* 19 */     this.name = name;this.spread = spread;this.id = id;this.children = children; }
/*    */   public Node() {}
/* 21 */   public String getName() { return this.name; } public boolean isSpread() { return this.spread; } public String getId() { return this.id; } public List<Node> getChildren() { return this.children; } public Node setName(String name) { this.name = name;return this; } public Node setSpread(boolean spread) { this.spread = spread;return this; } public Node setId(String id) { this.id = id;return this; } public Node setChildren(List<Node> children) { this.children = children;return this; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof Node)) return false; Node other = (Node)o; if (!other.canEqual(this)) return false; Object this$name = getName();Object other$name = other.getName(); if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false; if (isSpread() != other.isSpread()) return false; Object this$id = getId();Object other$id = other.getId(); if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false; Object this$children = getChildren();Object other$children = other.getChildren();return this$children == null ? other$children == null : this$children.equals(other$children); } protected boolean canEqual(Object other) { return other instanceof Node; } public int hashCode() { int PRIME = 59;int result = 1;Object $name = getName();result = result * 59 + ($name == null ? 43 : $name.hashCode());result = result * 59 + (isSpread() ? 79 : 97);Object $id = getId();result = result * 59 + ($id == null ? 43 : $id.hashCode());Object $children = getChildren();result = result * 59 + ($children == null ? 43 : $children.hashCode());return result; } public String toString() { return "Node(name=" + getName() + ", spread=" + isSpread() + ", id=" + getId() + ", children=" + getChildren() + ")"; }
/*    */ }


/* Location:              D:\项目管理\酒店管理\酒店管理\WEB-INF\classes\!\cn\soa\entity\Node.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */