/*    */ package cn.soa.entity.headResult;
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
/*    */ public class UserTableJson<T>
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 812376774103405857L;
/*    */   private String msg;
/*    */   private int code;
/*    */   private String tip;
/*    */   private T data;
/*    */   private int count;
/*    */   private boolean is;
/*    */   
/*    */   public UserTableJson(String msg, int code, String tip, T data, int count, boolean is)
/*    */   {
/* 28 */     this.msg = msg;this.code = code;this.tip = tip;this.data = data;this.count = count;this.is = is; }
/*    */   public UserTableJson() {}
/* 30 */   public String getMsg() { return this.msg; } public int getCode() { return this.code; } public String getTip() { return this.tip; } public T getData() { return (T)this.data; } public int getCount() { return this.count; } public boolean isIs() { return this.is; } public UserTableJson<T> setMsg(String msg) { this.msg = msg;return this; } public UserTableJson<T> setCode(int code) { this.code = code;return this; } public UserTableJson<T> setTip(String tip) { this.tip = tip;return this; } public UserTableJson<T> setData(T data) { this.data = data;return this; } public UserTableJson<T> setCount(int count) { this.count = count;return this; } public UserTableJson<T> setIs(boolean is) { this.is = is;return this; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof UserTableJson)) return false; UserTableJson<?> other = (UserTableJson)o; if (!other.canEqual(this)) return false; Object this$msg = getMsg();Object other$msg = other.getMsg(); if (this$msg == null ? other$msg != null : !this$msg.equals(other$msg)) return false; if (getCode() != other.getCode()) return false; Object this$tip = getTip();Object other$tip = other.getTip(); if (this$tip == null ? other$tip != null : !this$tip.equals(other$tip)) return false; Object this$data = getData();Object other$data = other.getData(); if (this$data == null ? other$data != null : !this$data.equals(other$data)) return false; if (getCount() != other.getCount()) return false; return isIs() == other.isIs(); } protected boolean canEqual(Object other) { return other instanceof UserTableJson; } public int hashCode() { int PRIME = 59;int result = 1;Object $msg = getMsg();result = result * 59 + ($msg == null ? 43 : $msg.hashCode());result = result * 59 + getCode();Object $tip = getTip();result = result * 59 + ($tip == null ? 43 : $tip.hashCode());Object $data = getData();result = result * 59 + ($data == null ? 43 : $data.hashCode());result = result * 59 + getCount();result = result * 59 + (isIs() ? 79 : 97);return result; } public String toString() { return "UserTableJson(msg=" + getMsg() + ", code=" + getCode() + ", tip=" + getTip() + ", data=" + getData() + ", count=" + getCount() + ", is=" + isIs() + ")"; }
/*    */ }


/* Location:              D:\项目管理\酒店管理\酒店管理\WEB-INF\classes\!\cn\soa\entity\headResult\UserTableJson.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */