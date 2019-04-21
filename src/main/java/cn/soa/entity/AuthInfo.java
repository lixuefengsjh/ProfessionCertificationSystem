/*    */ package cn.soa.entity;
/*    */ 
/*    */ 
/*    */ public class AuthInfo
/*    */ {
/*    */   private static final long serialVersionUID = 2222222L;
/*    */   
/*    */   private String id;
/*    */   
/*    */   private String first;
/*    */   
/*    */   private String second;
/*    */   
/*    */   private String url;
/*    */   
/*    */   public AuthInfo(String id, String first, String second, String url)
/*    */   {
/* 18 */     this.id = id;this.first = first;this.second = second;this.url = url; }
/*    */   public AuthInfo() {}
/* 20 */   public String getId() { return this.id; } public String getFirst() { return this.first; } public String getSecond() { return this.second; } public String getUrl() { return this.url; } public AuthInfo setId(String id) { this.id = id;return this; } public AuthInfo setFirst(String first) { this.first = first;return this; } public AuthInfo setSecond(String second) { this.second = second;return this; } public AuthInfo setUrl(String url) { this.url = url;return this; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof AuthInfo)) return false; AuthInfo other = (AuthInfo)o; if (!other.canEqual(this)) return false; Object this$id = getId();Object other$id = other.getId(); if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false; Object this$first = getFirst();Object other$first = other.getFirst(); if (this$first == null ? other$first != null : !this$first.equals(other$first)) return false; Object this$second = getSecond();Object other$second = other.getSecond(); if (this$second == null ? other$second != null : !this$second.equals(other$second)) return false; Object this$url = getUrl();Object other$url = other.getUrl();return this$url == null ? other$url == null : this$url.equals(other$url); } protected boolean canEqual(Object other) { return other instanceof AuthInfo; } public int hashCode() { int PRIME = 59;int result = 1;Object $id = getId();result = result * 59 + ($id == null ? 43 : $id.hashCode());Object $first = getFirst();result = result * 59 + ($first == null ? 43 : $first.hashCode());Object $second = getSecond();result = result * 59 + ($second == null ? 43 : $second.hashCode());Object $url = getUrl();result = result * 59 + ($url == null ? 43 : $url.hashCode());return result; } public String toString() { return "AuthInfo(id=" + getId() + ", first=" + getFirst() + ", second=" + getSecond() + ", url=" + getUrl() + ")"; }
/*    */ }


/* Location:              D:\项目管理\酒店管理\酒店管理\WEB-INF\classes\!\cn\soa\entity\AuthInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */