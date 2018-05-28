/*    */ package de.mr.listeners;
/*    */ 
/*    */ import de.mr.commands.Locations;
/*    */ import de.mr.extras.State;
/*    */ import de.mr.extras.Var;
/*    */ import java.io.File;
/*    */ import java.util.ArrayList;
/*    */ import org.bukkit.block.Block;
/*    */ import org.bukkit.configuration.file.YamlConfiguration;
/*    */ import org.bukkit.event.block.BlockPlaceEvent;
/*    */ 
/*    */ public class Place_Listener implements org.bukkit.event.Listener
/*    */ {
/* 14 */   File file = new File("plugins//MLGRush//config.yml");
/* 15 */   YamlConfiguration cfg = YamlConfiguration.loadConfiguration(this.file);
/*    */   
/*    */   @org.bukkit.event.EventHandler
/* 18 */   public void onBlockPlace(BlockPlaceEvent e) { if (Var.state == State.INGAME) {
/* 19 */       Var.blocks.add(e.getBlock().getLocation());
/* 20 */       if (e.getBlock().getLocation().distance(Locations.getHigh(Join_Listener.endnumber)) >= Var.getConfigEditINTEGER(this.cfg, "buildrange", this.file).intValue()) {
/* 21 */         e.setCancelled(true);
/*    */       }
/*    */     }
/* 24 */     if ((Var.state != State.INGAME) && 
/* 25 */       (!Var.build.contains(e.getPlayer()))) {
/* 26 */       e.setCancelled(true);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Max\Desktop\MLGRush.jar!\de\mr\listeners\Place_Listener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */