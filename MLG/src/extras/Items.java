/*    */ package de.mr.extras;
/*    */ 
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ import org.bukkit.inventory.meta.ItemMeta;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Items
/*    */ {
/*    */   public static ItemStack createItemmitAnzahl(Material material, int subid, String displayname, Integer anzahl)
/*    */   {
/* 15 */     ItemStack item = new ItemStack(material, anzahl.intValue(), (short)subid);
/* 16 */     ItemMeta mItem = item.getItemMeta();
/* 17 */     mItem.setDisplayName(displayname);
/* 18 */     item.setItemMeta(mItem);
/*    */     
/*    */ 
/* 21 */     return item;
/*    */   }
/*    */ }


/* Location:              C:\Users\Max\Desktop\MLGRush.jar!\de\mr\extras\Items.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */