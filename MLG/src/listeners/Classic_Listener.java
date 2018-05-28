/*    */ package de.mr.listeners;
/*    */ 
/*    */ import de.mr.extras.State;
/*    */ import de.mr.extras.Var;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.entity.EntityDamageByEntityEvent;
/*    */ import org.bukkit.event.entity.EntityDamageEvent;
/*    */ import org.bukkit.event.entity.FoodLevelChangeEvent;
/*    */ import org.bukkit.event.entity.PlayerDeathEvent;
/*    */ import org.bukkit.event.player.PlayerDropItemEvent;
/*    */ import org.bukkit.event.weather.WeatherChangeEvent;
/*    */ 
/*    */ 
/*    */ public class Classic_Listener
/*    */   implements org.bukkit.event.Listener
/*    */ {
/*    */   @EventHandler
/* 18 */   public void onDeath(PlayerDeathEvent e) { e.setDeathMessage(null); }
/*    */   
/*    */   @EventHandler
/*    */   public void onEntityDamage(EntityDamageEvent e) {
/* 22 */     if ((Var.state == State.LOBBY) || (Var.state == State.END)) {
/* 23 */       e.setCancelled(true);
/*    */     }
/* 25 */     else if (e.getCause() == org.bukkit.event.entity.EntityDamageEvent.DamageCause.FALL) {
/* 26 */       e.setCancelled(true);
/*    */     }
/*    */   }
/*    */   
/*    */   @EventHandler
/*    */   public void onEntityDamageByEntity(EntityDamageByEntityEvent e) {
/* 32 */     if ((Var.state == State.LOBBY) || (Var.state == State.END))
/* 33 */       e.setCancelled(true);
/*    */   }
/*    */   
/*    */   @EventHandler
/*    */   public void onFoodChange(FoodLevelChangeEvent e) {
/* 38 */     e.setCancelled(true);
/*    */   }
/*    */   
/*    */   @EventHandler
/*    */   public void onItemDrop(PlayerDropItemEvent e) {
/* 43 */     if (!Var.build.contains(e.getPlayer())) {
/* 44 */       e.setCancelled(true);
/*    */     }
/*    */   }
/*    */   
/*    */   @EventHandler
/*    */   public void onWeatherChange(WeatherChangeEvent e) {
/* 50 */     if (e.toWeatherState()) {
/* 51 */       e.setCancelled(true);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Max\Desktop\MLGRush.jar!\de\mr\listeners\Classic_Listener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */