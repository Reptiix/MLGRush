/*     */ package de.mr.commands;
/*     */ 
/*     */ import de.mr.extras.Var;
/*     */ import java.io.File;
/*     */ import org.bukkit.command.Command;
/*     */ import org.bukkit.command.CommandExecutor;
/*     */ import org.bukkit.command.CommandSender;
/*     */ import org.bukkit.configuration.file.YamlConfiguration;
/*     */ import org.bukkit.entity.Player;
/*     */ 
/*     */ 
/*     */ public class Set_CMD
/*     */   implements CommandExecutor
/*     */ {
/*  15 */   File file = new File("plugins//MLGRush//config.yml");
/*  16 */   YamlConfiguration cfg = YamlConfiguration.loadConfiguration(this.file);
/*     */   
/*  18 */   File file2 = new File("plugins//MLGRush//Locations.yml");
/*  19 */   YamlConfiguration cfg2 = YamlConfiguration.loadConfiguration(this.file);
/*     */   private static Integer newNumber;
/*     */   
/*     */   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
/*  23 */     Player p = (Player)sender;
/*  24 */     if (cmd.getName().equalsIgnoreCase("mrset")) {
/*  25 */       if ((p.hasPermission("mr.set")) || (p.hasPermission("mr.*"))) {
/*  26 */         if (args.length == 2) {
/*  27 */           newNumber = Integer.valueOf(0);
/*  28 */           if (args[0].equalsIgnoreCase("Red"))
/*     */           {
/*     */ 
/*  31 */             if (args[1].equals("1")) {
/*  32 */               Locations.setRed(p, Integer.valueOf(1));
/*  33 */               p.sendMessage(Var.prefix + " " + Var.getConfigEditSTRING(this.cfg, "set", this.file).replaceAll("SPAWN", "Red").replaceAll("MAPNAME", Locations.getMapNameByNumber(Integer.valueOf(1))));
/*  34 */             } else if (args[1].equals("2")) {
/*  35 */               Locations.setRed(p, Integer.valueOf(2));
/*  36 */               p.sendMessage(Var.prefix + " " + Var.getConfigEditSTRING(this.cfg, "set", this.file).replaceAll("SPAWN", "Red").replaceAll("MAPNAME", Locations.getMapNameByNumber(Integer.valueOf(2))));
/*     */             }
/*  38 */             else if (args[1].equals("3")) {
/*  39 */               Locations.setRed(p, Integer.valueOf(3));
/*  40 */               p.sendMessage(Var.prefix + " " + Var.getConfigEditSTRING(this.cfg, "set", this.file).replaceAll("SPAWN", "Red").replaceAll("MAPNAME", Locations.getMapNameByNumber(Integer.valueOf(3))));
/*  41 */             } else if (args[1].equals("4")) {
/*  42 */               Locations.setRed(p, Integer.valueOf(4));
/*  43 */               p.sendMessage(Var.prefix + " " + Var.getConfigEditSTRING(this.cfg, "set", this.file).replaceAll("SPAWN", "Red").replaceAll("MAPNAME", Locations.getMapNameByNumber(Integer.valueOf(4))));
/*     */             }
/*  45 */             else if (args[1].equals("5")) {
/*  46 */               Locations.setRed(p, Integer.valueOf(5));
/*  47 */               p.sendMessage(Var.prefix + " " + Var.getConfigEditSTRING(this.cfg, "set", this.file).replaceAll("SPAWN", "Red").replaceAll("MAPNAME", Locations.getMapNameByNumber(Integer.valueOf(5))));
/*     */             }
/*  49 */             else if (args[1].equals("6")) {
/*  50 */               Locations.setRed(p, Integer.valueOf(6));
/*  51 */               p.sendMessage(Var.prefix + " " + Var.getConfigEditSTRING(this.cfg, "set", this.file).replaceAll("SPAWN", "Red").replaceAll("MAPNAME", Locations.getMapNameByNumber(Integer.valueOf(6))));
/*     */             }
/*  53 */             else if (args[1].equals("7")) {
/*  54 */               Locations.setRed(p, Integer.valueOf(7));
/*  55 */               p.sendMessage(Var.prefix + " " + Var.getConfigEditSTRING(this.cfg, "set", this.file).replaceAll("SPAWN", "Red").replaceAll("MAPNAME", Locations.getMapNameByNumber(Integer.valueOf(7))));
/*     */             }
/*     */             else {
/*  58 */               Var.getSetCommandHelp(p);
/*     */             }
/*  60 */           } else if (args[0].equalsIgnoreCase("Blue")) {
/*  61 */             if (args[1].equals("1")) {
/*  62 */               Locations.setBlue(p, Integer.valueOf(1));
/*  63 */               p.sendMessage(Var.prefix + " " + Var.getConfigEditSTRING(this.cfg, "set", this.file).replaceAll("SPAWN", "Blue").replaceAll("MAPNAME", Locations.getMapNameByNumber(Integer.valueOf(1))));
/*  64 */             } else if (args[1].equals("2")) {
/*  65 */               Locations.setBlue(p, Integer.valueOf(2));
/*  66 */               p.sendMessage(Var.prefix + " " + Var.getConfigEditSTRING(this.cfg, "set", this.file).replaceAll("SPAWN", "Blue").replaceAll("MAPNAME", Locations.getMapNameByNumber(Integer.valueOf(2))));
/*     */             }
/*  68 */             else if (args[1].equals("3")) {
/*  69 */               Locations.setBlue(p, Integer.valueOf(3));
/*  70 */               p.sendMessage(Var.prefix + " " + Var.getConfigEditSTRING(this.cfg, "set", this.file).replaceAll("SPAWN", "Blue").replaceAll("MAPNAME", Locations.getMapNameByNumber(Integer.valueOf(3))));
/*  71 */             } else if (args[1].equals("4")) {
/*  72 */               Locations.setBlue(p, Integer.valueOf(4));
/*  73 */               p.sendMessage(Var.prefix + " " + Var.getConfigEditSTRING(this.cfg, "set", this.file).replaceAll("SPAWN", "Blue").replaceAll("MAPNAME", Locations.getMapNameByNumber(Integer.valueOf(4))));
/*     */             }
/*  75 */             else if (args[1].equals("5")) {
/*  76 */               Locations.setBlue(p, Integer.valueOf(5));
/*  77 */               p.sendMessage(Var.prefix + " " + Var.getConfigEditSTRING(this.cfg, "set", this.file).replaceAll("SPAWN", "Blue").replaceAll("MAPNAME", Locations.getMapNameByNumber(Integer.valueOf(5))));
/*     */             }
/*  79 */             else if (args[1].equals("6")) {
/*  80 */               Locations.setBlue(p, Integer.valueOf(6));
/*  81 */               p.sendMessage(Var.prefix + " " + Var.getConfigEditSTRING(this.cfg, "set", this.file).replaceAll("SPAWN", "Blue").replaceAll("MAPNAME", Locations.getMapNameByNumber(Integer.valueOf(6))));
/*     */             }
/*  83 */             else if (args[1].equals("7")) {
/*  84 */               Locations.setBlue(p, Integer.valueOf(7));
/*  85 */               p.sendMessage(Var.prefix + " " + Var.getConfigEditSTRING(this.cfg, "set", this.file).replaceAll("SPAWN", "Blue").replaceAll("MAPNAME", Locations.getMapNameByNumber(Integer.valueOf(7))));
/*     */             }
/*     */             else {
/*  88 */               Var.getSetCommandHelp(p);
/*     */             }
/*  90 */           } else if (args[0].equalsIgnoreCase("height")) {
/*  91 */             if (args[1].equals("1")) {
/*  92 */               Locations.setHigh(p, Integer.valueOf(1));
/*  93 */               p.sendMessage(Var.prefix + " " + Var.getConfigEditSTRING(this.cfg, "set", this.file).replaceAll("SPAWN", "Height").replaceAll("MAPNAME", Locations.getMapNameByNumber(Integer.valueOf(1))));
/*  94 */             } else if (args[1].equals("2")) {
/*  95 */               Locations.setHigh(p, Integer.valueOf(2));
/*  96 */               p.sendMessage(Var.prefix + " " + Var.getConfigEditSTRING(this.cfg, "set", this.file).replaceAll("SPAWN", "Height").replaceAll("MAPNAME", Locations.getMapNameByNumber(Integer.valueOf(2))));
/*     */             }
/*  98 */             else if (args[1].equals("3")) {
/*  99 */               Locations.setHigh(p, Integer.valueOf(3));
/* 100 */               p.sendMessage(Var.prefix + " " + Var.getConfigEditSTRING(this.cfg, "set", this.file).replaceAll("SPAWN", "Height").replaceAll("MAPNAME", Locations.getMapNameByNumber(Integer.valueOf(3))));
/* 101 */             } else if (args[1].equals("4")) {
/* 102 */               Locations.setHigh(p, Integer.valueOf(4));
/* 103 */               p.sendMessage(Var.prefix + " " + Var.getConfigEditSTRING(this.cfg, "set", this.file).replaceAll("SPAWN", "Height").replaceAll("MAPNAME", Locations.getMapNameByNumber(Integer.valueOf(4))));
/*     */             }
/* 105 */             else if (args[1].equals("5")) {
/* 106 */               Locations.setHigh(p, Integer.valueOf(5));
/* 107 */               p.sendMessage(Var.prefix + " " + Var.getConfigEditSTRING(this.cfg, "set", this.file).replaceAll("SPAWN", "Height").replaceAll("MAPNAME", Locations.getMapNameByNumber(Integer.valueOf(5))));
/*     */             }
/* 109 */             else if (args[1].equals("6")) {
/* 110 */               Locations.setHigh(p, Integer.valueOf(6));
/* 111 */               p.sendMessage(Var.prefix + " " + Var.getConfigEditSTRING(this.cfg, "set", this.file).replaceAll("SPAWN", "Height").replaceAll("MAPNAME", Locations.getMapNameByNumber(Integer.valueOf(6))));
/*     */             }
/* 113 */             else if (args[1].equals("7")) {
/* 114 */               Locations.setHigh(p, Integer.valueOf(7));
/* 115 */               p.sendMessage(Var.prefix + " " + Var.getConfigEditSTRING(this.cfg, "set", this.file).replaceAll("SPAWN", "Height").replaceAll("MAPNAME", Locations.getMapNameByNumber(Integer.valueOf(7))));
/*     */             }
/*     */             else {
/* 118 */               Var.getSetCommandHelp(p);
/*     */             }
/*     */           } else {
/* 121 */             Var.getSetCommandHelp(p);
/*     */           }
/* 123 */         } else if (args[0].equalsIgnoreCase("spawn")) {
/* 124 */           if (args[0].equalsIgnoreCase("Spawn")) {
/* 125 */             p.sendMessage(Var.prefix + " " + Var.getConfigEditSTRING(this.cfg, "set", this.file).replaceAll("SPAWN", "Spawn").replaceAll("MAPNAME", "ALL"));
/* 126 */             Locations.setSpawn(p);
/*     */           }
/*     */         }
/* 129 */         else if (args[0].equalsIgnoreCase("hologram")) {
/* 130 */           p.sendMessage(Var.prefix + " " + Var.getConfigEditSTRING(this.cfg, "set", this.file).replaceAll("SPAWN", "Hologram").replaceAll("MAPNAME", "ALL"));
/* 131 */           Locations.setHologram(p);
/*     */         } else {
/* 133 */           Var.getSetCommandHelp(p);
/*     */         }
/*     */       } else {
/* 136 */         p.sendMessage(Var.prefix + " §cYou don't have the Permission to do that§8.");
/*     */       }
/*     */     }
/* 139 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Max\Desktop\MLGRush.jar!\de\mr\commands\Set_CMD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */