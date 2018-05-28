/*     */ package de.mr.listeners;
/*     */ 
/*     */ import de.mr.commands.Locations;
/*     */ import de.mr.extras.Var;
/*     */ import java.io.File;
/*     */ import java.util.ArrayList;
/*     */ import org.bukkit.Material;
/*     */ import org.bukkit.configuration.file.YamlConfiguration;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.event.inventory.InventoryClickEvent;
/*     */ import org.bukkit.inventory.Inventory;
/*     */ import org.bukkit.inventory.ItemStack;
/*     */ import org.bukkit.inventory.PlayerInventory;
/*     */ import org.bukkit.inventory.meta.ItemMeta;
/*     */ 
/*     */ public class InventoryClick_Listener implements org.bukkit.event.Listener
/*     */ {
/*  18 */   File file = new File("plugins//MLGRush//config.yml");
/*  19 */   YamlConfiguration cfg = YamlConfiguration.loadConfiguration(this.file);
/*     */   private static Integer result;
/*  21 */   File file2 = new File("plugins//MLGRush//Locations.yml");
/*  22 */   YamlConfiguration cfg2 = YamlConfiguration.loadConfiguration(this.file2);
/*     */   private static String mapname;
/*     */   private static Integer slot1;
/*     */   private static Integer slot2;
/*     */   private static Integer slot3;
/*     */   
/*     */   @org.bukkit.event.EventHandler
/*  29 */   public void onInventoryClick(InventoryClickEvent e) { Player p = (Player)e.getWhoClicked();
/*     */     try {
/*  31 */       if (e.getCurrentItem() != null) {
/*  32 */         if ((!e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Var.getConfigEditSTRING(this.cfg, "sandname", this.file) + "")) && (!e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Var.getConfigEditSTRING(this.cfg, "stickname", this.file) + "")) && (!e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Var.getConfigEditSTRING(this.cfg, "pickaxename", this.file) + "")) && 
/*  33 */           (!Var.build.contains(p))) {
/*  34 */           e.setCancelled(true);
/*     */         }
/*     */         
/*  37 */         if (Var.state == de.mr.extras.State.LOBBY) { Integer localInteger1;
/*     */           Integer localInteger2;
/*  39 */           if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Locations.getMapNameByNumber(Integer.valueOf(1)))) {
/*  40 */             if (!Locations.getMapNameByNumber(Integer.valueOf(1)).equalsIgnoreCase(Var.getConfigEditSTRING(this.cfg, "nomapitem", this.file)))
/*     */             {
/*  42 */               localInteger1 = Var.mapvote1;localInteger2 = Var.mapvote1 = Integer.valueOf(Var.mapvote1.intValue() + 1);
/*  43 */               p.getInventory().clear();
/*  44 */               p.sendMessage(Var.prefix + "" + Var.getConfigEditSTRING(this.cfg, "vote", this.file).replaceAll("MAPNAME", Locations.getMapNameByNumber(Integer.valueOf(1))));
/*  45 */               p.closeInventory();
/*  46 */               Var.voted.add(p);
/*     */             }
/*  48 */           } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Locations.getMapNameByNumber(Integer.valueOf(2)))) {
/*  49 */             if (!Locations.getMapNameByNumber(Integer.valueOf(2)).equalsIgnoreCase(Var.getConfigEditSTRING(this.cfg, "nomapitem", this.file))) {
/*  50 */               localInteger1 = Var.mapvote2;localInteger2 = Var.mapvote2 = Integer.valueOf(Var.mapvote2.intValue() + 1);
/*  51 */               p.getInventory().clear();
/*  52 */               p.sendMessage(Var.prefix + "" + Var.getConfigEditSTRING(this.cfg, "vote", this.file).replaceAll("MAPNAME", Locations.getMapNameByNumber(Integer.valueOf(2))));
/*  53 */               p.closeInventory();
/*  54 */               Var.voted.add(p);
/*     */             }
/*  56 */           } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Locations.getMapNameByNumber(Integer.valueOf(3)))) {
/*  57 */             if (!Locations.getMapNameByNumber(Integer.valueOf(3)).equalsIgnoreCase(Var.getConfigEditSTRING(this.cfg, "nomapitem", this.file))) {
/*  58 */               localInteger1 = Var.mapvote3;localInteger2 = Var.mapvote3 = Integer.valueOf(Var.mapvote3.intValue() + 1);
/*  59 */               p.getInventory().clear();
/*  60 */               p.sendMessage(Var.prefix + "" + Var.getConfigEditSTRING(this.cfg, "vote", this.file).replaceAll("MAPNAME", Locations.getMapNameByNumber(Integer.valueOf(3))));
/*  61 */               p.closeInventory();
/*  62 */               Var.voted.add(p);
/*     */             }
/*  64 */           } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Locations.getMapNameByNumber(Integer.valueOf(4)))) {
/*  65 */             if (!Locations.getMapNameByNumber(Integer.valueOf(4)).equalsIgnoreCase(Var.getConfigEditSTRING(this.cfg, "nomapitem", this.file))) {
/*  66 */               localInteger1 = Var.mapvote4;localInteger2 = Var.mapvote4 = Integer.valueOf(Var.mapvote4.intValue() + 1);
/*  67 */               p.getInventory().clear();
/*  68 */               p.sendMessage(Var.prefix + "" + Var.getConfigEditSTRING(this.cfg, "vote", this.file).replaceAll("MAPNAME", Locations.getMapNameByNumber(Integer.valueOf(4))));
/*  69 */               p.closeInventory();
/*  70 */               Var.voted.add(p);
/*     */             }
/*  72 */           } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Locations.getMapNameByNumber(Integer.valueOf(5)))) {
/*  73 */             if (!Locations.getMapNameByNumber(Integer.valueOf(5)).equalsIgnoreCase(Var.getConfigEditSTRING(this.cfg, "nomapitem", this.file))) {
/*  74 */               localInteger1 = Var.mapvote5;localInteger2 = Var.mapvote5 = Integer.valueOf(Var.mapvote5.intValue() + 1);
/*  75 */               p.getInventory().clear();
/*  76 */               p.sendMessage(Var.prefix + "" + Var.getConfigEditSTRING(this.cfg, "vote", this.file).replaceAll("MAPNAME", Locations.getMapNameByNumber(Integer.valueOf(5))));
/*  77 */               p.closeInventory();
/*  78 */               Var.voted.add(p);
/*     */             }
/*  80 */           } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Locations.getMapNameByNumber(Integer.valueOf(6)))) {
/*  81 */             if (!Locations.getMapNameByNumber(Integer.valueOf(6)).equalsIgnoreCase(Var.getConfigEditSTRING(this.cfg, "nomapitem", this.file))) {
/*  82 */               localInteger1 = Var.mapvote6;localInteger2 = Var.mapvote6 = Integer.valueOf(Var.mapvote6.intValue() + 1);
/*  83 */               p.getInventory().clear();
/*  84 */               p.sendMessage(Var.prefix + "" + Var.getConfigEditSTRING(this.cfg, "vote", this.file).replaceAll("MAPNAME", Locations.getMapNameByNumber(Integer.valueOf(6))));
/*  85 */               p.closeInventory();
/*  86 */               Var.voted.add(p);
/*     */             }
/*  88 */           } else if ((e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Locations.getMapNameByNumber(Integer.valueOf(7)))) && 
/*  89 */             (!Locations.getMapNameByNumber(Integer.valueOf(7)).equalsIgnoreCase(Var.getConfigEditSTRING(this.cfg, "nomapitem", this.file)))) {
/*  90 */             localInteger1 = Var.mapvote7;localInteger2 = Var.mapvote7 = Integer.valueOf(Var.mapvote7.intValue() + 1);
/*  91 */             p.getInventory().clear();
/*  92 */             p.sendMessage(Var.prefix + "" + Var.getConfigEditSTRING(this.cfg, "vote", this.file).replaceAll("MAPNAME", Locations.getMapNameByNumber(Integer.valueOf(7))));
/*  93 */             p.closeInventory();
/*  94 */             Var.voted.add(p);
/*     */           }
/*     */           
/*  97 */           if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Var.getConfigEditSTRING(this.cfg, "saveitemname", this.file)))
/*     */           {
/*     */ 
/* 100 */             if ((e.getInventory().contains(Material.STICK)) && (e.getInventory().contains(Material.SANDSTONE)) && (e.getInventory().contains(Material.STONE_PICKAXE)))
/*     */             {
/* 102 */               if (e.getInventory().getItem(0) != null) {
/* 103 */                 if (e.getInventory().getItem(0).getType() == Material.SANDSTONE) {
/* 104 */                   slot3 = Integer.valueOf(0);
/* 105 */                 } else if (e.getInventory().getItem(0).getType() == Material.STONE_PICKAXE) {
/* 106 */                   slot2 = Integer.valueOf(0);
/* 107 */                 } else if (e.getInventory().getItem(0).getType() == Material.STICK) {
/* 108 */                   slot1 = Integer.valueOf(0);
/*     */                 }
/*     */               }
/* 111 */               if (e.getInventory().getItem(1) != null) {
/* 112 */                 if (e.getInventory().getItem(1).getType() == Material.SANDSTONE) {
/* 113 */                   slot3 = Integer.valueOf(1);
/* 114 */                 } else if (e.getInventory().getItem(1).getType() == Material.STONE_PICKAXE) {
/* 115 */                   slot2 = Integer.valueOf(1);
/* 116 */                 } else if (e.getInventory().getItem(1).getType() == Material.STICK) {
/* 117 */                   slot1 = Integer.valueOf(1);
/*     */                 }
/*     */               }
/* 120 */               if (e.getInventory().getItem(2) != null) {
/* 121 */                 if (e.getInventory().getItem(2).getType() == Material.SANDSTONE) {
/* 122 */                   slot3 = Integer.valueOf(2);
/* 123 */                 } else if (e.getInventory().getItem(2).getType() == Material.STONE_PICKAXE) {
/* 124 */                   slot2 = Integer.valueOf(2);
/* 125 */                 } else if (e.getInventory().getItem(2).getType() == Material.STICK) {
/* 126 */                   slot1 = Integer.valueOf(2);
/*     */                 }
/*     */               }
/* 129 */               if (e.getInventory().getItem(3) != null) {
/* 130 */                 if (e.getInventory().getItem(3).getType() == Material.SANDSTONE) {
/* 131 */                   slot3 = Integer.valueOf(3);
/* 132 */                 } else if (e.getInventory().getItem(3).getType() == Material.STONE_PICKAXE) {
/* 133 */                   slot2 = Integer.valueOf(3);
/* 134 */                 } else if (e.getInventory().getItem(3).getType() == Material.STICK) {
/* 135 */                   slot1 = Integer.valueOf(3);
/*     */                 }
/*     */               }
/* 138 */               if (e.getInventory().getItem(4) != null) {
/* 139 */                 if (e.getInventory().getItem(4).getType() == Material.SANDSTONE) {
/* 140 */                   slot3 = Integer.valueOf(4);
/* 141 */                 } else if (e.getInventory().getItem(4).getType() == Material.STONE_PICKAXE) {
/* 142 */                   slot2 = Integer.valueOf(4);
/* 143 */                 } else if (e.getInventory().getItem(4).getType() == Material.STICK) {
/* 144 */                   slot1 = Integer.valueOf(4);
/*     */                 }
/*     */               }
/* 147 */               if (e.getInventory().getItem(5) != null) {
/* 148 */                 if (e.getInventory().getItem(5).getType() == Material.SANDSTONE) {
/* 149 */                   slot3 = Integer.valueOf(5);
/* 150 */                 } else if (e.getInventory().getItem(5).getType() == Material.STONE_PICKAXE) {
/* 151 */                   slot2 = Integer.valueOf(5);
/* 152 */                 } else if (e.getInventory().getItem(5).getType() == Material.STICK) {
/* 153 */                   slot1 = Integer.valueOf(5);
/*     */                 }
/*     */               }
/* 156 */               if (e.getInventory().getItem(6) != null) {
/* 157 */                 if (e.getInventory().getItem(6).getType() == Material.SANDSTONE) {
/* 158 */                   slot3 = Integer.valueOf(6);
/* 159 */                 } else if (e.getInventory().getItem(6).getType() == Material.STONE_PICKAXE) {
/* 160 */                   slot2 = Integer.valueOf(6);
/* 161 */                 } else if (e.getInventory().getItem(6).getType() == Material.STICK) {
/* 162 */                   slot1 = Integer.valueOf(6);
/*     */                 }
/*     */               }
/* 165 */               if (e.getInventory().getItem(7) != null) {
/* 166 */                 if (e.getInventory().getItem(7).getType() == Material.SANDSTONE) {
/* 167 */                   slot3 = Integer.valueOf(7);
/* 168 */                 } else if (e.getInventory().getItem(7).getType() == Material.STONE_PICKAXE) {
/* 169 */                   slot2 = Integer.valueOf(7);
/* 170 */                 } else if (e.getInventory().getItem(7).getType() == Material.STICK) {
/* 171 */                   slot1 = Integer.valueOf(7);
/*     */                 }
/*     */               }
/*     */               
/* 175 */               if (e.getInventory().getItem(8) != null) {
/* 176 */                 if (e.getInventory().getItem(8).getType() == Material.SANDSTONE) {
/* 177 */                   slot3 = Integer.valueOf(8);
/* 178 */                 } else if (e.getInventory().getItem(8).getType() == Material.STONE_PICKAXE) {
/* 179 */                   slot2 = Integer.valueOf(8);
/* 180 */                 } else if (e.getInventory().getItem(8).getType() == Material.STICK) {
/* 181 */                   slot1 = Integer.valueOf(8);
/*     */                 }
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 256 */               p.getInventory().remove(Material.STICK);
/* 257 */               p.getInventory().remove(Material.SANDSTONE);
/* 258 */               p.getInventory().remove(Material.STONE_PICKAXE);
/* 259 */               de.mr.mysql.Manager.setSlot1(p.getUniqueId().toString(), slot1);
/* 260 */               de.mr.mysql.Manager.setSlot2(p.getUniqueId().toString(), slot2);
/* 261 */               de.mr.mysql.Manager.setSlot3(p.getUniqueId().toString(), slot3);
/* 262 */               p.closeInventory();
/*     */             } else {
/* 264 */               p.closeInventory();
/* 265 */               return;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     catch (Exception localException1) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\Max\Desktop\MLGRush.jar!\de\mr\listeners\InventoryClick_Listener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */