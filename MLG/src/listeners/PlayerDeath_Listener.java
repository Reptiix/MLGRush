/*    */ package de.mr.listeners;
/*    */ 
/*    */ import de.mr.commands.Locations;
/*    */ import de.mr.extras.Items;
/*    */ import de.mr.extras.State;
/*    */ import de.mr.extras.Var;
/*    */ import de.mr.mysql.Manager;
/*    */ import java.io.File;
/*    */ import java.util.UUID;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.configuration.file.YamlConfiguration;
/*    */ import org.bukkit.enchantments.Enchantment;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.entity.PlayerDeathEvent;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ import org.bukkit.inventory.PlayerInventory;
/*    */ import org.bukkit.inventory.meta.ItemMeta;
/*    */ 
/*    */ public class PlayerDeath_Listener implements org.bukkit.event.Listener
/*    */ {
/*    */   private static Player red;
/*    */   private static Player blue;
/* 25 */   File file = new File("plugins//MLGRush//config.yml");
/* 26 */   YamlConfiguration cfg = YamlConfiguration.loadConfiguration(this.file);
/*    */   
/*    */   @EventHandler
/* 29 */   public void onPlayerDeath(PlayerDeathEvent e) { Player p = e.getEntity();
/* 30 */     red = Join_Listener.red;
/* 31 */     blue = Join_Listener.blue;
/* 32 */     e.setKeepInventory(true);
/* 33 */     if (Var.state == State.INGAME) {
/* 34 */       if (red == p) {
/* 35 */         p.teleport(Locations.getRed(Join_Listener.endnumber));
/* 36 */         e.setDeathMessage(null);
/* 37 */         Manager.addPoints(e.getEntity().getKiller().getUniqueId().toString(), e.getEntity().getKiller().getName(), Integer.valueOf(10));
/* 38 */         red.setHealth(20.0D);
/* 39 */         red.getInventory().clear();
/* 40 */         ItemStack item = new ItemStack(Material.STICK);
/* 41 */         ItemMeta meta = item.getItemMeta();
/* 42 */         meta.setDisplayName(Var.getConfigEditSTRING(this.cfg, "stickname", this.file) + "");
/* 43 */         meta.addEnchant(Enchantment.KNOCKBACK, Var.getConfigEditINTEGER(this.cfg, "stickknockback", this.file).intValue(), true);
/* 44 */         item.setItemMeta(meta);
/* 45 */         red.getInventory().setItem(Manager.getSlot1(red.getUniqueId().toString()).intValue(), item);
/* 46 */         red.getInventory().setItem(Manager.getSlot2(red.getUniqueId().toString()).intValue(), Items.createItemmitAnzahl(Material.STONE_PICKAXE, 0, Var.getConfigEditSTRING(this.cfg, "pickaxename", this.file), Integer.valueOf(1)));
/* 47 */         red.getInventory().setItem(Manager.getSlot3(red.getUniqueId().toString()).intValue(), Items.createItemmitAnzahl(Material.SANDSTONE, 0, Var.getConfigEditSTRING(this.cfg, "sandname", this.file), Integer.valueOf(10)));
/* 48 */       } else if (blue == p) {
/* 49 */         p.teleport(Locations.getBlue(Join_Listener.endnumber));
/* 50 */         e.setDeathMessage(null);
/* 51 */         Manager.addPoints(e.getEntity().getKiller().getUniqueId().toString(), e.getEntity().getKiller().getName(), Integer.valueOf(10));
/* 52 */         blue.setHealth(20.0D);
/* 53 */         blue.getInventory().clear();
/* 54 */         ItemStack item = new ItemStack(Material.STICK);
/* 55 */         ItemMeta meta = item.getItemMeta();
/* 56 */         meta.setDisplayName(Var.getConfigEditSTRING(this.cfg, "stickname", this.file) + "");
/* 57 */         meta.addEnchant(Enchantment.KNOCKBACK, Var.getConfigEditINTEGER(this.cfg, "stickknockback", this.file).intValue(), true);
/* 58 */         item.setItemMeta(meta);
/* 59 */         blue.getInventory().setItem(Manager.getSlot1(blue.getUniqueId().toString()).intValue(), item);
/* 60 */         blue.getInventory().setItem(Manager.getSlot2(blue.getUniqueId().toString()).intValue(), Items.createItemmitAnzahl(Material.STONE_PICKAXE, 0, Var.getConfigEditSTRING(this.cfg, "pickaxename", this.file), Integer.valueOf(1)));
/* 61 */         blue.getInventory().setItem(Manager.getSlot3(blue.getUniqueId().toString()).intValue(), Items.createItemmitAnzahl(Material.SANDSTONE, 0, Var.getConfigEditSTRING(this.cfg, "sandname", this.file), Integer.valueOf(10)));
/*    */       } else {
/* 63 */         Bukkit.reload();
/* 64 */         Bukkit.broadcastMessage("§4ERROR§8: §cPLAYERS CANNOT BE LOADED§8.");
/*    */       }
/*    */     } else {
/* 67 */       e.setDeathMessage(null);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Max\Desktop\MLGRush.jar!\de\mr\listeners\PlayerDeath_Listener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */