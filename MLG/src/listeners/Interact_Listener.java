/*     */ package de.mr.listeners;
/*     */ 
/*     */ import de.mr.commands.Locations;
/*     */ import de.mr.extras.Items;
/*     */ import de.mr.extras.Var;
/*     */ import de.mr.mysql.Manager;
/*     */ import java.io.File;
/*     */ import java.util.UUID;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.Material;
/*     */ import org.bukkit.Sound;
/*     */ import org.bukkit.configuration.file.YamlConfiguration;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.event.block.Action;
/*     */ import org.bukkit.event.player.PlayerInteractEvent;
/*     */ import org.bukkit.inventory.Inventory;
/*     */ import org.bukkit.inventory.ItemStack;
/*     */ import org.bukkit.inventory.meta.ItemMeta;
/*     */ 
/*     */ public class Interact_Listener implements org.bukkit.event.Listener
/*     */ {
/*  22 */   File file = new File("plugins//MLGRush//config.yml");
/*  23 */   YamlConfiguration cfg = YamlConfiguration.loadConfiguration(this.file);
/*     */   
/*  25 */   File file2 = new File("plugins//MLGRush//Locations.yml");
/*  26 */   YamlConfiguration cfg2 = YamlConfiguration.loadConfiguration(this.file2);
/*     */   private static Integer result;
/*     */   private static Integer fehlend;
/*     */   
/*     */   @org.bukkit.event.EventHandler
/*  31 */   public void onInteract(PlayerInteractEvent e) { Player p = e.getPlayer();
/*  32 */     if ((e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) || (e.getAction().equals(Action.RIGHT_CLICK_AIR))) {
/*     */       try {
/*  34 */         if (e.getItem().getItemMeta().getDisplayName().equals(Var.getConfigEditSTRING(this.cfg, "voteitemname", this.file) + "")) {
/*  35 */           e.setCancelled(true);
/*  36 */           result = Integer.valueOf(0);
/*  37 */           fehlend = Integer.valueOf(0);
/*  38 */           if (Bukkit.getOnlinePlayers().size() == 1) {
/*  39 */             if (Var.state == de.mr.extras.State.LOBBY) {
/*  40 */               Inventory inv = Bukkit.createInventory(null, 9, Var.getConfigEditSTRING(this.cfg, "voteitemname", this.file) + "");
/*  41 */               p.openInventory(inv);
/*     */               
/*  43 */               for (int i = 0; i < 25; i++) {
/*  44 */                 if (i == 0) {
/*  45 */                   p.playSound(p.getLocation(), Sound.CLICK, 2.0F, 2.0F);
/*  46 */                   inv.setItem(0, Items.createItemmitAnzahl(Material.STAINED_GLASS_PANE, 15, " ", Integer.valueOf(1)));
/*  47 */                   p.openInventory(inv);
/*  48 */                   Thread.sleep(50L);
/*     */                 }
/*  50 */                 if (i == 1) {
/*  51 */                   p.playSound(p.getLocation(), Sound.CLICK, 2.0F, 2.0F);
/*  52 */                   inv.setItem(0, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(7)), Integer.valueOf(1)));
/*  53 */                   inv.setItem(1, Items.createItemmitAnzahl(Material.STAINED_GLASS_PANE, 15, " ", Integer.valueOf(1)));
/*  54 */                   p.openInventory(inv);
/*  55 */                   Thread.sleep(50L);
/*     */                 }
/*  57 */                 if (i == 2) {
/*  58 */                   p.playSound(p.getLocation(), Sound.CLICK, 2.0F, 2.0F);
/*  59 */                   inv.setItem(0, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(6)), Integer.valueOf(1)));
/*  60 */                   inv.setItem(1, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(7)), Integer.valueOf(1)));
/*  61 */                   inv.setItem(2, Items.createItemmitAnzahl(Material.STAINED_GLASS_PANE, 15, " ", Integer.valueOf(1)));
/*  62 */                   p.openInventory(inv);
/*  63 */                   Thread.sleep(50L);
/*     */                 }
/*  65 */                 if (i == 3) {
/*  66 */                   p.playSound(p.getLocation(), Sound.CLICK, 2.0F, 2.0F);
/*  67 */                   inv.setItem(0, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(5)), Integer.valueOf(1)));
/*  68 */                   inv.setItem(1, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(6)), Integer.valueOf(1)));
/*  69 */                   inv.setItem(2, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(7)), Integer.valueOf(1)));
/*  70 */                   inv.setItem(3, Items.createItemmitAnzahl(Material.STAINED_GLASS_PANE, 15, " ", Integer.valueOf(1)));
/*  71 */                   p.openInventory(inv);
/*  72 */                   Thread.sleep(50L);
/*     */                 }
/*  74 */                 if (i == 4) {
/*  75 */                   p.playSound(p.getLocation(), Sound.CLICK, 2.0F, 2.0F);
/*  76 */                   inv.setItem(0, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(4)), Integer.valueOf(1)));
/*  77 */                   inv.setItem(1, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(5)), Integer.valueOf(1)));
/*  78 */                   inv.setItem(2, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(6)), Integer.valueOf(1)));
/*  79 */                   inv.setItem(3, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(7)), Integer.valueOf(1)));
/*  80 */                   inv.setItem(4, Items.createItemmitAnzahl(Material.STAINED_GLASS_PANE, 15, " ", Integer.valueOf(1)));
/*  81 */                   p.openInventory(inv);
/*  82 */                   Thread.sleep(50L);
/*     */                 }
/*  84 */                 if (i == 5) {
/*  85 */                   p.playSound(p.getLocation(), Sound.CLICK, 2.0F, 2.0F);
/*  86 */                   inv.setItem(0, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(3)), Integer.valueOf(1)));
/*  87 */                   inv.setItem(1, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(4)), Integer.valueOf(1)));
/*  88 */                   inv.setItem(2, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(5)), Integer.valueOf(1)));
/*  89 */                   inv.setItem(3, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(6)), Integer.valueOf(1)));
/*  90 */                   inv.setItem(4, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(7)), Integer.valueOf(1)));
/*  91 */                   inv.setItem(5, Items.createItemmitAnzahl(Material.STAINED_GLASS_PANE, 15, " ", Integer.valueOf(1)));
/*  92 */                   p.openInventory(inv);
/*  93 */                   Thread.sleep(50L);
/*     */                 }
/*  95 */                 if (i == 6) {
/*  96 */                   p.playSound(p.getLocation(), Sound.CLICK, 2.0F, 2.0F);
/*  97 */                   inv.setItem(0, Items.createItemmitAnzahl(Material.STAINED_GLASS_PANE, 15, " ", Integer.valueOf(1)));
/*  98 */                   inv.setItem(1, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(1)), Integer.valueOf(1)));
/*  99 */                   inv.setItem(0, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(2)), Integer.valueOf(1)));
/* 100 */                   inv.setItem(1, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(3)), Integer.valueOf(1)));
/* 101 */                   inv.setItem(2, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(4)), Integer.valueOf(1)));
/* 102 */                   inv.setItem(3, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(5)), Integer.valueOf(1)));
/* 103 */                   inv.setItem(4, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(6)), Integer.valueOf(1)));
/* 104 */                   inv.setItem(5, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(7)), Integer.valueOf(1)));
/* 105 */                   inv.setItem(6, Items.createItemmitAnzahl(Material.STAINED_GLASS_PANE, 15, " ", Integer.valueOf(1)));
/* 106 */                   p.openInventory(inv);
/* 107 */                   Thread.sleep(50L);
/*     */                 }
/* 109 */                 if (i == 7) {
/* 110 */                   p.playSound(p.getLocation(), Sound.CLICK, 2.0F, 2.0F);
/* 111 */                   inv.setItem(0, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(1)), Integer.valueOf(1)));
/* 112 */                   inv.setItem(1, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(2)), Integer.valueOf(1)));
/* 113 */                   inv.setItem(2, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(3)), Integer.valueOf(1)));
/* 114 */                   inv.setItem(3, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(4)), Integer.valueOf(1)));
/* 115 */                   inv.setItem(4, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(5)), Integer.valueOf(1)));
/* 116 */                   inv.setItem(5, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(6)), Integer.valueOf(1)));
/* 117 */                   inv.setItem(6, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(7)), Integer.valueOf(1)));
/* 118 */                   inv.setItem(7, Items.createItemmitAnzahl(Material.STAINED_GLASS_PANE, 15, " ", Integer.valueOf(1)));
/* 119 */                   p.openInventory(inv);
/* 120 */                   Thread.sleep(50L);
/*     */                 }
/* 122 */                 if (i == 8) {
/* 123 */                   p.playSound(p.getLocation(), Sound.CLICK, 2.0F, 2.0F);
/* 124 */                   inv.setItem(0, Items.createItemmitAnzahl(Material.STAINED_GLASS_PANE, 15, " ", Integer.valueOf(1)));
/* 125 */                   inv.setItem(1, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(1)), Integer.valueOf(1)));
/* 126 */                   inv.setItem(2, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(2)), Integer.valueOf(1)));
/* 127 */                   inv.setItem(3, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(3)), Integer.valueOf(1)));
/* 128 */                   inv.setItem(4, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(4)), Integer.valueOf(1)));
/* 129 */                   inv.setItem(5, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(5)), Integer.valueOf(1)));
/* 130 */                   inv.setItem(6, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(6)), Integer.valueOf(1)));
/* 131 */                   inv.setItem(7, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(7)), Integer.valueOf(1)));
/* 132 */                   inv.setItem(8, Items.createItemmitAnzahl(Material.STAINED_GLASS_PANE, 15, " ", Integer.valueOf(1)));
/* 133 */                   p.openInventory(inv);
/* 134 */                   Thread.sleep(50L);
/*     */                 }
/* 136 */                 if (i == 9) {
/* 137 */                   p.playSound(p.getLocation(), Sound.CLICK, 2.0F, 2.0F);
/* 138 */                   inv.setItem(1, Items.createItemmitAnzahl(Material.STAINED_GLASS_PANE, 15, " ", Integer.valueOf(1)));
/* 139 */                   inv.setItem(2, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(1)), Integer.valueOf(1)));
/* 140 */                   inv.setItem(3, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(2)), Integer.valueOf(1)));
/* 141 */                   inv.setItem(4, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(3)), Integer.valueOf(1)));
/* 142 */                   inv.setItem(5, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(4)), Integer.valueOf(1)));
/* 143 */                   inv.setItem(6, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(5)), Integer.valueOf(1)));
/* 144 */                   inv.setItem(7, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(6)), Integer.valueOf(1)));
/* 145 */                   inv.setItem(8, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(7)), Integer.valueOf(1)));
/* 146 */                   p.openInventory(inv);
/* 147 */                   Thread.sleep(50L);
/*     */                 }
/* 149 */                 if (i == 10) {
/* 150 */                   p.playSound(p.getLocation(), Sound.CLICK, 2.0F, 2.0F);
/* 151 */                   inv.setItem(2, Items.createItemmitAnzahl(Material.STAINED_GLASS_PANE, 15, " ", Integer.valueOf(1)));
/* 152 */                   inv.setItem(3, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(1)), Integer.valueOf(1)));
/* 153 */                   inv.setItem(4, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(2)), Integer.valueOf(1)));
/* 154 */                   inv.setItem(5, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(3)), Integer.valueOf(1)));
/* 155 */                   inv.setItem(6, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(4)), Integer.valueOf(1)));
/* 156 */                   inv.setItem(7, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(5)), Integer.valueOf(1)));
/* 157 */                   inv.setItem(8, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(6)), Integer.valueOf(1)));
/* 158 */                   p.openInventory(inv);
/* 159 */                   Thread.sleep(50L);
/*     */                 }
/* 161 */                 if (i == 11) {
/* 162 */                   p.playSound(p.getLocation(), Sound.CLICK, 2.0F, 2.0F);
/* 163 */                   inv.setItem(3, Items.createItemmitAnzahl(Material.STAINED_GLASS_PANE, 15, " ", Integer.valueOf(1)));
/* 164 */                   inv.setItem(4, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(1)), Integer.valueOf(1)));
/* 165 */                   inv.setItem(5, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(2)), Integer.valueOf(1)));
/* 166 */                   inv.setItem(6, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(3)), Integer.valueOf(1)));
/* 167 */                   inv.setItem(7, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(4)), Integer.valueOf(1)));
/* 168 */                   inv.setItem(8, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(5)), Integer.valueOf(1)));
/* 169 */                   p.openInventory(inv);
/* 170 */                   Thread.sleep(50L);
/*     */                 }
/* 172 */                 if (i == 12) {
/* 173 */                   p.playSound(p.getLocation(), Sound.CLICK, 2.0F, 2.0F);
/* 174 */                   inv.setItem(4, Items.createItemmitAnzahl(Material.STAINED_GLASS_PANE, 15, " ", Integer.valueOf(1)));
/* 175 */                   inv.setItem(5, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(1)), Integer.valueOf(1)));
/* 176 */                   inv.setItem(6, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(2)), Integer.valueOf(1)));
/* 177 */                   inv.setItem(7, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(3)), Integer.valueOf(1)));
/* 178 */                   inv.setItem(8, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(4)), Integer.valueOf(1)));
/* 179 */                   p.openInventory(inv);
/* 180 */                   Thread.sleep(50L);
/*     */                 }
/* 182 */                 if (i == 13) {
/* 183 */                   p.playSound(p.getLocation(), Sound.CLICK, 2.0F, 2.0F);
/* 184 */                   inv.setItem(5, Items.createItemmitAnzahl(Material.STAINED_GLASS_PANE, 15, " ", Integer.valueOf(1)));
/* 185 */                   inv.setItem(6, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(1)), Integer.valueOf(1)));
/* 186 */                   inv.setItem(7, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(2)), Integer.valueOf(1)));
/* 187 */                   inv.setItem(8, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(3)), Integer.valueOf(1)));
/* 188 */                   p.openInventory(inv);
/* 189 */                   Thread.sleep(50L);
/*     */                 }
/* 191 */                 if (i == 14) {
/* 192 */                   p.playSound(p.getLocation(), Sound.CLICK, 2.0F, 2.0F);
/* 193 */                   inv.setItem(6, Items.createItemmitAnzahl(Material.STAINED_GLASS_PANE, 15, " ", Integer.valueOf(1)));
/* 194 */                   inv.setItem(7, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(1)), Integer.valueOf(1)));
/* 195 */                   inv.setItem(8, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(2)), Integer.valueOf(1)));
/* 196 */                   p.openInventory(inv);
/* 197 */                   Thread.sleep(50L);
/*     */                 }
/* 199 */                 if (i == 15) {
/* 200 */                   p.playSound(p.getLocation(), Sound.CLICK, 2.0F, 2.0F);
/* 201 */                   inv.setItem(7, Items.createItemmitAnzahl(Material.STAINED_GLASS_PANE, 15, " ", Integer.valueOf(1)));
/* 202 */                   inv.setItem(8, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(1)), Integer.valueOf(1)));
/* 203 */                   p.openInventory(inv);
/* 204 */                   Thread.sleep(50L);
/*     */                 }
/* 206 */                 if (i == 16) {
/* 207 */                   p.playSound(p.getLocation(), Sound.CLICK, 2.0F, 2.0F);
/* 208 */                   inv.setItem(8, Items.createItemmitAnzahl(Material.STAINED_GLASS_PANE, 15, " ", Integer.valueOf(1)));
/* 209 */                   p.openInventory(inv);
/* 210 */                   Thread.sleep(50L);
/*     */                 }
/* 212 */                 if (i == 17) {
/* 213 */                   p.playSound(p.getLocation(), Sound.CLICK, 2.0F, 2.0F);
/* 214 */                   inv.setItem(7, Items.createItemmitAnzahl(Material.STAINED_GLASS_PANE, 15, " ", Integer.valueOf(1)));
/* 215 */                   inv.setItem(8, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(1)), Integer.valueOf(1)));
/* 216 */                   p.openInventory(inv);
/* 217 */                   Thread.sleep(100L);
/*     */                 }
/* 219 */                 if (i == 18) {
/* 220 */                   p.playSound(p.getLocation(), Sound.CLICK, 2.0F, 2.0F);
/* 221 */                   inv.setItem(6, Items.createItemmitAnzahl(Material.STAINED_GLASS_PANE, 15, " ", Integer.valueOf(1)));
/* 222 */                   inv.setItem(7, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(1)), Integer.valueOf(1)));
/* 223 */                   inv.setItem(8, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(2)), Integer.valueOf(1)));
/* 224 */                   p.openInventory(inv);
/* 225 */                   Thread.sleep(120L);
/*     */                 }
/* 227 */                 if (i == 19) {
/* 228 */                   p.playSound(p.getLocation(), Sound.CLICK, 2.0F, 2.0F);
/* 229 */                   inv.setItem(5, Items.createItemmitAnzahl(Material.STAINED_GLASS_PANE, 15, " ", Integer.valueOf(1)));
/* 230 */                   inv.setItem(6, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(1)), Integer.valueOf(1)));
/* 231 */                   inv.setItem(7, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(2)), Integer.valueOf(1)));
/* 232 */                   inv.setItem(8, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(3)), Integer.valueOf(1)));
/* 233 */                   p.openInventory(inv);
/* 234 */                   Thread.sleep(140L);
/*     */                 }
/* 236 */                 if (i == 20) {
/* 237 */                   p.playSound(p.getLocation(), Sound.CLICK, 2.0F, 2.0F);
/* 238 */                   inv.setItem(4, Items.createItemmitAnzahl(Material.STAINED_GLASS_PANE, 15, " ", Integer.valueOf(1)));
/* 239 */                   inv.setItem(5, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(1)), Integer.valueOf(1)));
/* 240 */                   inv.setItem(6, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(2)), Integer.valueOf(1)));
/* 241 */                   inv.setItem(7, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(3)), Integer.valueOf(1)));
/* 242 */                   inv.setItem(8, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(4)), Integer.valueOf(1)));
/* 243 */                   p.openInventory(inv);
/* 244 */                   Thread.sleep(160L);
/*     */                 }
/* 246 */                 if (i == 21) {
/* 247 */                   p.playSound(p.getLocation(), Sound.CLICK, 2.0F, 2.0F);
/* 248 */                   inv.setItem(3, Items.createItemmitAnzahl(Material.STAINED_GLASS_PANE, 15, " ", Integer.valueOf(1)));
/* 249 */                   inv.setItem(4, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(1)), Integer.valueOf(1)));
/* 250 */                   inv.setItem(5, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(2)), Integer.valueOf(1)));
/* 251 */                   inv.setItem(6, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(3)), Integer.valueOf(1)));
/* 252 */                   inv.setItem(7, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(4)), Integer.valueOf(1)));
/* 253 */                   inv.setItem(8, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(5)), Integer.valueOf(1)));
/* 254 */                   p.openInventory(inv);
/* 255 */                   Thread.sleep(180L);
/*     */                 }
/* 257 */                 if (i == 22) {
/* 258 */                   p.playSound(p.getLocation(), Sound.CLICK, 2.0F, 2.0F);
/* 259 */                   inv.setItem(2, Items.createItemmitAnzahl(Material.STAINED_GLASS_PANE, 15, " ", Integer.valueOf(1)));
/* 260 */                   inv.setItem(3, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(1)), Integer.valueOf(1)));
/* 261 */                   inv.setItem(4, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(2)), Integer.valueOf(1)));
/* 262 */                   inv.setItem(5, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(3)), Integer.valueOf(1)));
/* 263 */                   inv.setItem(6, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(4)), Integer.valueOf(1)));
/* 264 */                   inv.setItem(7, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(5)), Integer.valueOf(1)));
/* 265 */                   inv.setItem(8, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(6)), Integer.valueOf(1)));
/* 266 */                   p.openInventory(inv);
/* 267 */                   Thread.sleep(200L);
/*     */                 }
/* 269 */                 if (i == 23) {
/* 270 */                   p.playSound(p.getLocation(), Sound.CLICK, 2.0F, 2.0F);
/* 271 */                   inv.setItem(1, Items.createItemmitAnzahl(Material.STAINED_GLASS_PANE, 15, " ", Integer.valueOf(1)));
/* 272 */                   inv.setItem(2, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(1)), Integer.valueOf(1)));
/* 273 */                   inv.setItem(3, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(2)), Integer.valueOf(1)));
/* 274 */                   inv.setItem(4, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(3)), Integer.valueOf(1)));
/* 275 */                   inv.setItem(5, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(4)), Integer.valueOf(1)));
/* 276 */                   inv.setItem(6, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(5)), Integer.valueOf(1)));
/* 277 */                   inv.setItem(7, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(6)), Integer.valueOf(1)));
/* 278 */                   inv.setItem(8, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(7)), Integer.valueOf(1)));
/* 279 */                   p.openInventory(inv);
/* 280 */                   Thread.sleep(220L);
/*     */                 }
/* 282 */                 if (i == 24) {
/* 283 */                   p.playSound(p.getLocation(), Sound.CLICK, 2.0F, 2.0F);
/* 284 */                   inv.setItem(0, Items.createItemmitAnzahl(Material.STAINED_GLASS_PANE, 15, " ", Integer.valueOf(1)));
/* 285 */                   inv.setItem(1, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(1)), Integer.valueOf(1)));
/* 286 */                   inv.setItem(2, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(2)), Integer.valueOf(2)));
/* 287 */                   inv.setItem(3, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(3)), Integer.valueOf(3)));
/* 288 */                   inv.setItem(4, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(4)), Integer.valueOf(4)));
/* 289 */                   inv.setItem(5, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(5)), Integer.valueOf(5)));
/* 290 */                   inv.setItem(6, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(6)), Integer.valueOf(6)));
/* 291 */                   inv.setItem(7, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(7)), Integer.valueOf(7)));
/* 292 */                   inv.setItem(8, Items.createItemmitAnzahl(Material.STAINED_GLASS_PANE, 15, " ", Integer.valueOf(1)));
/* 293 */                   p.openInventory(inv);
/* 294 */                   Thread.sleep(240L);
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/*     */           else
/*     */           {
/* 301 */             Inventory inv = Bukkit.createInventory(null, 9, Var.getConfigEditSTRING(this.cfg, "voteitemname", this.file) + "");
/* 302 */             p.playSound(p.getLocation(), Sound.CLICK, 2.0F, 2.0F);
/* 303 */             inv.setItem(0, Items.createItemmitAnzahl(Material.STAINED_GLASS_PANE, 15, " ", Integer.valueOf(1)));
/* 304 */             inv.setItem(1, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(1)), Integer.valueOf(1)));
/* 305 */             inv.setItem(2, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(2)), Integer.valueOf(2)));
/* 306 */             inv.setItem(3, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(3)), Integer.valueOf(3)));
/* 307 */             inv.setItem(4, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(4)), Integer.valueOf(4)));
/* 308 */             inv.setItem(5, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(5)), Integer.valueOf(5)));
/* 309 */             inv.setItem(6, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(6)), Integer.valueOf(6)));
/* 310 */             inv.setItem(7, Items.createItemmitAnzahl(Material.EMPTY_MAP, 0, Locations.getMapNameByNumber(Integer.valueOf(7)), Integer.valueOf(7)));
/* 311 */             inv.setItem(8, Items.createItemmitAnzahl(Material.STAINED_GLASS_PANE, 15, " ", Integer.valueOf(1)));
/* 312 */             p.openInventory(inv);
/*     */           }
/* 314 */         } else if (e.getItem().getItemMeta().getDisplayName().equals(Var.getConfigEditSTRING(this.cfg, "inventoryitemname", this.file) + "")) {
/* 315 */           p.playSound(p.getLocation(), Sound.CLICK, 2.0F, 2.0F);
/* 316 */           Inventory inv = Bukkit.createInventory(null, 9, Var.getConfigEditSTRING(this.cfg, "inventoryitemname", this.file) + "");
/* 317 */           inv.setItem(Manager.getSlot1(p.getUniqueId().toString()).intValue(), Items.createItemmitAnzahl(Material.STICK, 0, Var.getConfigEditSTRING(this.cfg, "stickname", this.file) + "", Integer.valueOf(1)));
/* 318 */           inv.setItem(Manager.getSlot2(p.getUniqueId().toString()).intValue(), Items.createItemmitAnzahl(Material.STONE_PICKAXE, 0, Var.getConfigEditSTRING(this.cfg, "pickaxename", this.file) + "", Integer.valueOf(1)));
/* 319 */           inv.setItem(Manager.getSlot3(p.getUniqueId().toString()).intValue(), Items.createItemmitAnzahl(Material.SANDSTONE, 0, Var.getConfigEditSTRING(this.cfg, "sandname", this.file) + "", Integer.valueOf(1)));
/* 320 */           inv.setItem(8, Items.createItemmitAnzahl(Material.STAINED_GLASS_PANE, 5, Var.getConfigEditSTRING(this.cfg, "saveitemname", this.file), Integer.valueOf(1)));
/* 321 */           p.openInventory(inv);
/*     */         }
/*     */       }
/*     */       catch (Exception localException) {}
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Max\Desktop\MLGRush.jar!\de\mr\listeners\Interact_Listener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */