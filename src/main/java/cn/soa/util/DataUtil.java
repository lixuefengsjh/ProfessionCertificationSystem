/*    */ package cn.soa.util;
/*    */ 
/*    */ import cn.soa.entity.IotUserModuleResource;
/*    */ import cn.soa.entity.Node;
/*    */ import java.io.PrintStream;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
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
/*    */ public class DataUtil
/*    */ {
/*    */   public static List<Node> findChildNode(IotUserModuleResource parentResourceInfo, List<IotUserModuleResource> resourceInfos)
/*    */   {
/* 29 */     List<Node> children = new ArrayList();
/*    */     
/* 31 */     for (IotUserModuleResource resourceInfo : resourceInfos)
/*    */     {
/* 33 */       if (parentResourceInfo.getModId().equals(resourceInfo.getParentId())) {
/* 34 */         Node node = new Node();
/* 35 */         node.setId(resourceInfo.getModId());
/* 36 */         node.setName(resourceInfo.getName());
/* 37 */         node.setSpread(false);
/* 38 */         node.setChildren(findChildNode(resourceInfo, resourceInfos));
/* 39 */         children.add(node);
/* 40 */         System.out.println(">>>>>>>>>>>>>>");
/* 41 */         System.out.println(resourceInfo);
/*    */       }
/*    */     }
/* 44 */     return children;
/*    */   }
/*    */ }


/* Location:              D:\项目管理\酒店管理\酒店管理\WEB-INF\classes\!\cn\so\\util\DataUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */