/*    */ package de.mr.extras;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import net.minecraft.server.v1_8_R3.EntityArmorStand;
/*    */ import net.minecraft.server.v1_8_R3.EntityPlayer;
/*    */ import net.minecraft.server.v1_8_R3.PacketPlayOutSpawnEntityLiving;
/*    */ import net.minecraft.server.v1_8_R3.PlayerConnection;
/*    */ import org.bukkit.Location;
/*    */ import org.bukkit.craftbukkit.v1_8_R3.CraftWorld;
/*    */ import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ 
/*    */ public class Stats_Hologram
/*    */ {
/* 17 */   private List<EntityArmorStand> entitylist = new ArrayList();
/*    */   private String[] Text;
/*    */   private Location location;
/* 20 */   private double DISTANCE = 0.25D;
/*    */   int count;
/*    */   
/*    */   public Stats_Hologram(String[] Text, Location location) {
/* 24 */     this.Text = Text;
/* 25 */     this.location = location;
/* 26 */     create();
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public void showPlayerStats(Player p)
/*    */   {
/* 33 */     for (EntityArmorStand stand : this.entitylist) {
/* 34 */       PacketPlayOutSpawnEntityLiving packet = new PacketPlayOutSpawnEntityLiving(stand);
/* 35 */       ((CraftPlayer)p).getHandle().playerConnection.sendPacket(packet);
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */   private void create()
/*    */   {
/* 42 */     for (String Text : this.Text) {
/* 43 */       EntityArmorStand entity = new EntityArmorStand(((CraftWorld)this.location.getWorld()).getHandle(), this.location.getX(), this.location.getY(), this.location.getZ());
/* 44 */       entity.setCustomName(Text);
/* 45 */       entity.setCustomNameVisible(true);
/* 46 */       entity.setInvisible(true);
/* 47 */       entity.setGravity(false);
/* 48 */       this.entitylist.add(entity);
/* 49 */       this.location.subtract(0.0D, this.DISTANCE, 0.0D);
/* 50 */       this.count += 1;
/*    */     }
/*    */     
/* 53 */     for (int i = 0; i < this.count; i++) {
/* 54 */       this.location.add(0.0D, this.DISTANCE, 0.0D);
/*    */     }
/* 56 */     this.count = 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\Max\Desktop\MLGRush.jar!\de\mr\extras\Stats_Hologram.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */