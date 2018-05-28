/*     */ package de.mr.commands;
/*     */ 
/*     */ import de.mr.extras.Var;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.Location;
/*     */ import org.bukkit.World;
/*     */ import org.bukkit.configuration.file.YamlConfiguration;
/*     */ import org.bukkit.entity.Player;
/*     */ 
/*     */ public class Locations
/*     */ {
/*     */   public static void setRed(Player p, Integer nr)
/*     */   {
/*  16 */     File file = new File("plugins//MLGRush//Locations.yml");
/*  17 */     Location loc = p.getLocation();
/*     */     
/*  19 */     YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
/*     */     
/*     */ 
/*  22 */     cfg.set(nr + "Red.X", Double.valueOf(loc.getX()));
/*  23 */     cfg.set(nr + "Red.Y", Double.valueOf(loc.getY()));
/*  24 */     cfg.set(nr + "Red.Z", Double.valueOf(loc.getZ()));
/*  25 */     cfg.set(nr + "Red.World", loc.getWorld().getName());
/*  26 */     cfg.set(nr + "Red.Yaw", Float.valueOf(loc.getYaw()));
/*  27 */     cfg.set(nr + "Red.Pitch", Float.valueOf(loc.getPitch()));
/*     */     try {
/*  29 */       cfg.save(file);
/*     */     } catch (IOException e) {
/*  31 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public static Location getRed(Integer nr)
/*     */   {
/*  38 */     File file = new File("plugins//MLGRush//Locations.yml");
/*  39 */     Location loc = new Location(Bukkit.getWorld(""), 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
/*  40 */     YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
/*     */     
/*  42 */     loc.setX(cfg.getDouble(nr + "Red.X"));
/*  43 */     loc.setY(cfg.getDouble(nr + "Red.Y"));
/*  44 */     loc.setZ(cfg.getDouble(nr + "Red.Z"));
/*  45 */     loc.setYaw((float)cfg.getDouble(nr + "Red.Yaw"));
/*  46 */     loc.setPitch((float)cfg.getDouble(nr + "Red.Pitch"));
/*     */     try {
/*  48 */       loc.setWorld(Bukkit.getWorld(cfg.getString(nr + "Red.World")));
/*     */     } catch (IllegalArgumentException e) {
/*  50 */       Bukkit.broadcastMessage(Var.prefix + " §cYou need to set every spawn before playing§8.");
/*     */     }
/*  52 */     return loc;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static void setBlue(Player p, Integer nr)
/*     */   {
/*  59 */     File file = new File("plugins//MLGRush//Locations.yml");
/*  60 */     Location loc = p.getLocation();
/*     */     
/*  62 */     YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
/*     */     
/*  64 */     cfg.set(nr + "Blue.X", Double.valueOf(loc.getX()));
/*  65 */     cfg.set(nr + "Blue.Y", Double.valueOf(loc.getY()));
/*  66 */     cfg.set(nr + "Blue.Z", Double.valueOf(loc.getZ()));
/*  67 */     cfg.set(nr + "Blue.World", loc.getWorld().getName());
/*  68 */     cfg.set(nr + "Blue.Yaw", Float.valueOf(loc.getYaw()));
/*  69 */     cfg.set(nr + "Blue.Pitch", Float.valueOf(loc.getPitch()));
/*     */     try {
/*  71 */       cfg.save(file);
/*     */     } catch (IOException e) {
/*  73 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   public static Location getBlue(Integer nr)
/*     */   {
/*  79 */     File file = new File("plugins//MLGRush//Locations.yml");
/*  80 */     Location loc = new Location(Bukkit.getWorld(""), 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
/*  81 */     YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
/*     */     
/*  83 */     loc.setX(cfg.getDouble(nr + "Blue.X"));
/*  84 */     loc.setY(cfg.getDouble(nr + "Blue.Y"));
/*  85 */     loc.setZ(cfg.getDouble(nr + "Blue.Z"));
/*  86 */     loc.setYaw((float)cfg.getDouble(nr + "Blue.Yaw"));
/*  87 */     loc.setPitch((float)cfg.getDouble(nr + "Blue.Pitch"));
/*     */     try {
/*  89 */       loc.setWorld(Bukkit.getWorld(cfg.getString(nr + "Blue.World")));
/*     */     } catch (IllegalArgumentException e) {
/*  91 */       Bukkit.broadcastMessage(Var.prefix + " §cYou need to set every spawn before playing§8.");
/*     */     }
/*  93 */     return loc;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void setSpawn(Player p)
/*     */   {
/*  99 */     File file = new File("plugins//MLGRush//Locations.yml");
/* 100 */     Location loc = p.getLocation();
/*     */     
/* 102 */     YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
/*     */     
/* 104 */     cfg.set("Spawn.X", Double.valueOf(loc.getX()));
/* 105 */     cfg.set("Spawn.Y", Double.valueOf(loc.getY()));
/* 106 */     cfg.set("Spawn.Z", Double.valueOf(loc.getZ()));
/* 107 */     cfg.set("Spawn.World", loc.getWorld().getName());
/* 108 */     cfg.set("Spawn.Yaw", Float.valueOf(loc.getYaw()));
/* 109 */     cfg.set("Spawn.Pitch", Float.valueOf(loc.getPitch()));
/*     */     try
/*     */     {
/* 112 */       cfg.save(file);
/*     */     } catch (IOException e) {
/* 114 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   public static Location getSpawn()
/*     */   {
/* 120 */     File file = new File("plugins//MLGRush//Locations.yml");
/* 121 */     Location loc = new Location(Bukkit.getWorld(""), 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
/* 122 */     YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
/* 123 */     loc.setX(cfg.getDouble("Spawn.X"));
/* 124 */     loc.setY(cfg.getDouble("Spawn.Y"));
/* 125 */     loc.setZ(cfg.getDouble("Spawn.Z"));
/* 126 */     loc.setYaw((float)cfg.getDouble("Spawn.Yaw"));
/* 127 */     loc.setPitch((float)cfg.getDouble("Spawn.Pitch"));
/*     */     try {
/* 129 */       loc.setWorld(Bukkit.getWorld(cfg.getString("Spawn.World")));
/*     */     } catch (IllegalArgumentException e) {
/* 131 */       Bukkit.broadcastMessage(Var.prefix + " §cYou need to set every spawn before playing§8.");
/*     */     }
/* 133 */     return loc;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void setHologram(Player p)
/*     */   {
/* 139 */     File file = new File("plugins//MLGRush//Locations.yml");
/* 140 */     Location loc = p.getLocation();
/*     */     
/* 142 */     YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
/*     */     
/* 144 */     cfg.set("Hologram.X", Double.valueOf(loc.getX()));
/* 145 */     cfg.set("Hologram.Y", Double.valueOf(loc.getY()));
/* 146 */     cfg.set("Hologram.Z", Double.valueOf(loc.getZ()));
/* 147 */     cfg.set("Hologram.World", loc.getWorld().getName());
/* 148 */     cfg.set("Hologram.Yaw", Float.valueOf(loc.getYaw()));
/* 149 */     cfg.set("Hologram.Pitch", Float.valueOf(loc.getPitch()));
/*     */     try
/*     */     {
/* 152 */       cfg.save(file);
/*     */     } catch (IOException e) {
/* 154 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   public static Location getHologram()
/*     */   {
/* 160 */     File file = new File("plugins//MLGRush//Locations.yml");
/* 161 */     Location loc = new Location(Bukkit.getWorld(""), 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
/* 162 */     YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
/* 163 */     loc.setX(cfg.getDouble("Hologram.X"));
/* 164 */     loc.setY(cfg.getDouble("Hologram.Y"));
/* 165 */     loc.setZ(cfg.getDouble("Hologram.Z"));
/* 166 */     loc.setYaw((float)cfg.getDouble("Hologram.Yaw"));
/* 167 */     loc.setPitch((float)cfg.getDouble("Hologram.Pitch"));
/*     */     try {
/* 169 */       loc.setWorld(Bukkit.getWorld(cfg.getString("Hologram.World")));
/*     */     } catch (IllegalArgumentException e) {
/* 171 */       Bukkit.broadcastMessage(Var.prefix + " §cYou need to set every spawn before playing§8.");
/*     */     }
/* 173 */     return loc;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void setHigh(Player p, Integer nr)
/*     */   {
/* 179 */     File file = new File("plugins//MLGRush//Locations.yml");
/* 180 */     Location loc = p.getLocation();
/*     */     
/* 182 */     YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
/*     */     
/* 184 */     cfg.set(nr + "High.X", Double.valueOf(loc.getX()));
/* 185 */     cfg.set(nr + "High.Y", Double.valueOf(loc.getY()));
/* 186 */     cfg.set(nr + "High.Z", Double.valueOf(loc.getZ()));
/* 187 */     cfg.set(nr + "High.World", loc.getWorld().getName());
/* 188 */     cfg.set(nr + "High.Yaw", Float.valueOf(loc.getYaw()));
/* 189 */     cfg.set(nr + "High.Pitch", Float.valueOf(loc.getPitch()));
/*     */     try {
/* 191 */       cfg.save(file);
/*     */     } catch (IOException e) {
/* 193 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   public static Location getHigh(Integer nr)
/*     */   {
/* 199 */     File file = new File("plugins//MLGRush//Locations.yml");
/* 200 */     Location loc = new Location(Bukkit.getWorld(""), 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
/* 201 */     YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
/* 202 */     loc.setX(cfg.getDouble(nr + "High.X"));
/* 203 */     loc.setY(cfg.getDouble(nr + "High.Y"));
/* 204 */     loc.setZ(cfg.getDouble(nr + "High.Z"));
/* 205 */     loc.setYaw((float)cfg.getDouble(nr + "High.Yaw"));
/* 206 */     loc.setPitch((float)cfg.getDouble(nr + "High.Pitch"));
/*     */     try {
/* 208 */       loc.setWorld(Bukkit.getWorld(cfg.getString(nr + "High.World")));
/*     */     } catch (IllegalArgumentException e) {
/* 210 */       Bukkit.broadcastMessage(Var.prefix + " §cYou need to set every spawn before playing§8.");
/*     */     }
/* 212 */     return loc;
/*     */   }
/*     */   
/*     */   public static String getMapNameByNumber(Integer number)
/*     */   {
/* 217 */     File file = new File("plugins//MLGRush//config.yml");
/* 218 */     YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
/* 219 */     if (cfg.getString("Mapname" + number).contains("NO MAP")) {
/* 220 */       return Var.getConfigEditSTRING(cfg, "nomapitem", file);
/*     */     }
/*     */     
/* 223 */     String newstring = cfg.getString("Mapname" + number);
/* 224 */     return cfg.getString("Mapname" + number).replaceAll("&", "§");
/*     */   }
/*     */ }


/* Location:              C:\Users\Max\Desktop\MLGRush.jar!\de\mr\commands\Locations.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */