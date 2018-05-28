/*     */ package de.mr.commands;
/*     */ 
/*     */ import de.mr.extras.Var;
/*     */ import java.io.File;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.command.Command;
/*     */ import org.bukkit.command.CommandExecutor;
/*     */ import org.bukkit.command.CommandSender;
/*     */ import org.bukkit.configuration.file.YamlConfiguration;
/*     */ import org.bukkit.entity.Player;
/*     */ 
/*     */ public class Translate_CMD implements CommandExecutor
/*     */ {
/*  14 */   File file = new File("plugins//MLGRush//config.yml");
/*  15 */   YamlConfiguration cfg = YamlConfiguration.loadConfiguration(this.file);
/*     */   
/*     */   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
/*  18 */     Player p = (Player)sender;
/*  19 */     if ((cmd.getName().equalsIgnoreCase("mrtranslate")) && (
/*  20 */       (p.hasPermission("mr.translate")) || (p.hasPermission("mr.*")))) {
/*  21 */       if (args.length == 1) {
/*  22 */         if (args[0].equalsIgnoreCase("english")) {
/*  23 */           this.cfg.set(".serverfull", "&cThe Server is full&8.");
/*  24 */           this.cfg.set(".playernotfound", "&7This player has never been on the server&8.");
/*  25 */           this.cfg.set(".joinmessage", "&ePLAYER &7connected to the Server&8.");
/*  26 */           this.cfg.set(".countdown1", "&7The Game starts in &b10 &7seconds&8.");
/*  27 */           this.cfg.set(".countdown2", "&7The Game starts in &bCOUNT &7seconds&8.");
/*  28 */           this.cfg.set(".countdown3", "&7The Game starts &bnow&8.");
/*  29 */           this.cfg.set(".endcountdown1", "&7The Game ends in &b10 &7seconds&8.");
/*  30 */           this.cfg.set(".endcountdown2", "&7The Game ends in &bCOUNT &7seconds&8.");
/*  31 */           this.cfg.set(".endcountdown3", "&7The Game ends &bnow&8.");
/*  32 */           this.cfg.set(".set", "&7You've set the Spawn &bSPAWN &7for the Map MAPNAME&8.");
/*  33 */           this.cfg.set(".vote", "&7You've voted for &bMAPNAME");
/*  34 */           this.cfg.set(".votewon", "&7MAP has won the Voting");
/*  35 */           this.cfg.set(".sbtitle", "&bMLGRush");
/*  36 */           this.cfg.set(".sbtext1", "&7State&8:");
/*  37 */           this.cfg.set(".sbtext2", "&bSTATE");
/*  38 */           this.cfg.set(".sbtext3", "&7Score&8:");
/*  39 */           this.cfg.set(".sbtext4", "&cRed &cTEAMRED &8| &bTEAMBLUE &bBlue");
/*  40 */           this.cfg.set(".sbtext5", "&7Remaining");
/*  41 */           this.cfg.set(".sbtext6", "&bCOUNT &7Rounds");
/*  42 */           this.cfg.set(".pickaxename", "&7Pickaxe");
/*  43 */           this.cfg.set(".sandname", "&7Sandstone");
/*  44 */           this.cfg.set(".stickname", "&7Knockbackstick");
/*  45 */           this.cfg.set(".inventoryitemname", "&bSort your inventory");
/*  46 */           this.cfg.set(".saveitemname", "&aSave");
/*  47 */           this.cfg.set(".destroymessage1", "&cRed &7has destroyed the Bed from Team &bBlue&8.");
/*  48 */           this.cfg.set(".destroymessage2", "&bBlue &7has destroyed the Bed from Team &cRed&8.");
/*  49 */           this.cfg.set(".quitmessage", "&bPLAYER &7disconnected&8.");
/*  50 */           this.cfg.set(".enoughplayer", "&cThere are not enough Players to play&8!");
/*  51 */           this.cfg.set(".statsheadertext", "&8&m------------------------");
/*  52 */           this.cfg.set(".statsfootertext", "&8&m------------------------");
/*  53 */           this.cfg.set(".statsline1", "&7PLAYER");
/*  54 */           this.cfg.set(".statsline2", "&7Played Games&8: &bCOUNT");
/*  55 */           this.cfg.set(".statsline3", "&7Won Games&8: &bCOUNT");
/*  56 */           this.cfg.set(".statsline4", "&7Lost Games&8: &bCOUNT");
/*  57 */           this.cfg.set(".statsline5", "&7Points&8: &bCOUNT");
/*  58 */           this.cfg.set(".statsline6", "&7Ranking&8: &b#COUNT");
/*     */           try {
/*  60 */             this.cfg.save(this.file);
/*     */           } catch (Exception e) {
/*  62 */             e.printStackTrace();
/*     */           }
/*  64 */           p.sendMessage(Var.prefix + " §7You've translated all the Messages§8.");
/*  65 */           Bukkit.shutdown();
/*  66 */         } else if (args[0].equalsIgnoreCase("german")) {
/*  67 */           this.cfg.set(".serverfull", "&cDer Server ist voll&8.");
/*  68 */           this.cfg.set(".playernotfound", "&7Dieser Spieler war noch nie auf dem Server&8.");
/*  69 */           this.cfg.set(".joinmessage", "&ePLAYER &7hat das Spiel betreten&8.");
/*  70 */           this.cfg.set(".countdown1", "&7Das Spiel startet in &b10 &7Sekunden&8.");
/*  71 */           this.cfg.set(".countdown2", "&7Das Spiel startet in &bCOUNT &7Sekunden&8.");
/*  72 */           this.cfg.set(".countdown3", "&7Das Spiel startet &bjetzt&8.");
/*  73 */           this.cfg.set(".endcountdown1", "&7Das Spiel endet in &b10 &7Sekunden&8.");
/*  74 */           this.cfg.set(".endcountdown2", "&7Das Spiel endet in &bCOUNT &7Sekunden&8.");
/*  75 */           this.cfg.set(".endcountdown3", "&7Das Spiel endet &bjetzt&8.");
/*  76 */           this.cfg.set(".set", "&7Du hast den Spawn &bSPAWN &7für die Map MAPNAME gesetzt&8.");
/*  77 */           this.cfg.set(".vote", "&7Du hast gestimmt für &bMAPNAME");
/*  78 */           this.cfg.set(".alreadyvoted", "&7Du hast in diesem Spiel bereits abgestimmt&8.");
/*  79 */           this.cfg.set(".votewon", "&7MAP hat das Voting gewonnen");
/*  80 */           this.cfg.set(".sbtitle", "&bMLGRush");
/*  81 */           this.cfg.set(".sbtext1", "&7Status&8:");
/*  82 */           this.cfg.set(".sbtext2", "&bSTATE");
/*  83 */           this.cfg.set(".sbtext3", "&7Punkte&8:");
/*  84 */           this.cfg.set(".sbtext4", "&cRot &cTEAMRED &8| &bTEAMBLUE &bBlau");
/*  85 */           this.cfg.set(".sbtext5", "&7Verbleibend");
/*  86 */           this.cfg.set(".sbtext6", "&bCOUNT &7Runden");
/*  87 */           this.cfg.set(".pickaxename", "&7Spitzhacke");
/*  88 */           this.cfg.set(".sandname", "&7Sandstein");
/*  89 */           this.cfg.set(".stickname", "&7Knockbackstick");
/*  90 */           this.cfg.set(".inventoryitemname", "&bSortiere dein Inventar");
/*  91 */           this.cfg.set(".saveitemname", "&aSpeichern");
/*  92 */           this.cfg.set(".destroymessage1", "&cRot &7hat das Bett von &bBlau &7zerstört&8.");
/*  93 */           this.cfg.set(".destroymessage2", "&bBlau &7hat das Bett von &cRot &7zerstört&8.");
/*  94 */           this.cfg.set(".quitmessage", "&bPLAYER &7hat das Spiel verlassen&8.");
/*  95 */           this.cfg.set(".enoughplayer", "&cEs sind nicht genügend Spieler auf dem Server&8!");
/*  96 */           this.cfg.set(".statsheadertext", "&8&m------------------------");
/*  97 */           this.cfg.set(".statsfootertext", "&8&m------------------------");
/*  98 */           this.cfg.set(".statsline1", "&7PLAYER");
/*  99 */           this.cfg.set(".statsline2", "&7Gespielte Spiele&8: &bCOUNT");
/* 100 */           this.cfg.set(".statsline3", "&7Gewonnene Spiele&8: &bCOUNT");
/* 101 */           this.cfg.set(".statsline4", "&7Verlorene Spiele&8: &bCOUNT");
/* 102 */           this.cfg.set(".statsline5", "&7Punkte&8: &bCOUNT");
/* 103 */           this.cfg.set(".statsline6", "&7Rang&8: &b#COUNT");
/*     */           try {
/* 105 */             this.cfg.save(this.file);
/*     */           } catch (Exception e) {
/* 107 */             e.printStackTrace();
/*     */           }
/* 109 */           p.sendMessage(Var.prefix + " §7Du hast alle Nachrichten übersetzt§8.");
/* 110 */           Bukkit.shutdown();
/*     */         } else {
/* 112 */           Var.getTranslateCommandHelp(p);
/*     */         }
/*     */       } else {
/* 115 */         Var.getTranslateCommandHelp(p);
/*     */       }
/*     */     }
/*     */     
/* 119 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Max\Desktop\MLGRush.jar!\de\mr\commands\Translate_CMD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */