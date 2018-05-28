/*    */ package de.mr.commands;
/*    */ 
/*    */ import de.mr.extras.UUIDFetcher;
/*    */ import de.mr.extras.Var;
/*    */ import de.mr.mysql.Manager;
/*    */ import java.io.File;
/*    */ import java.util.UUID;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.configuration.file.YamlConfiguration;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ 
/*    */ public class Stats_CMD
/*    */   implements CommandExecutor
/*    */ {
/* 18 */   File file = new File("plugins//MLGRush//config.yml");
/* 19 */   YamlConfiguration cfg = YamlConfiguration.loadConfiguration(this.file);
/*    */   
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
/* 22 */     Player p = (Player)sender;
/* 23 */     if (cmd.getName().equalsIgnoreCase("stats")) {
/* 24 */       if (args.length == 0) {
/* 25 */         if ((sender instanceof Player)) {
/* 26 */           Integer games = Manager.getGames(p.getUniqueId().toString(), p.getName());
/* 27 */           Integer wins = Manager.getWins(p.getUniqueId().toString(), p.getName());
/* 28 */           Integer lost = Integer.valueOf(games.intValue() - wins.intValue());
/* 29 */           p.sendMessage(Var.getConfigEditSTRING(this.cfg, "statsheadertext", this.file) + "");
/* 30 */           p.sendMessage(Var.getConfigEditSTRING(this.cfg, "statsline1", this.file).replaceAll("PLAYER", p.getName()) + "");
/* 31 */           p.sendMessage(Var.getConfigEditSTRING(this.cfg, "statsline2", this.file).replaceAll("COUNT", new StringBuilder().append(Manager.getGames(p.getUniqueId().toString(), p.getName())).append("").toString()) + "");
/* 32 */           p.sendMessage(Var.getConfigEditSTRING(this.cfg, "statsline3", this.file).replaceAll("COUNT", new StringBuilder().append(Manager.getWins(p.getUniqueId().toString(), p.getName())).append("").toString()) + "");
/* 33 */           p.sendMessage(Var.getConfigEditSTRING(this.cfg, "statsline4", this.file).replaceAll("COUNT", new StringBuilder().append(lost).append("").toString()) + "");
/* 34 */           p.sendMessage(Var.getConfigEditSTRING(this.cfg, "statsline5", this.file).replaceAll("COUNT", new StringBuilder().append(Manager.getPoints(p.getUniqueId().toString(), p.getName())).append("").toString()) + "");
/* 35 */           p.sendMessage(Var.getConfigEditSTRING(this.cfg, "statsline6", this.file).replaceAll("COUNT", new StringBuilder().append(Manager.getRanking(p.getUniqueId().toString(), p.getName())).append("").toString()) + "");
/* 36 */           p.sendMessage(Var.getConfigEditSTRING(this.cfg, "statsfootertext", this.file) + "");
/*    */         }
/* 38 */       } else if ((args.length == 1) && 
/* 39 */         ((sender instanceof Player))) {
/* 40 */         if (Manager.wasOnServer(UUIDFetcher.getUUID(args[0]).toString())) {
/* 41 */           Integer games = Manager.getGames(Manager.getUUIDfromPlayer(args[0]), args[0]);
/* 42 */           Integer wins = Manager.getWins(Manager.getUUIDfromPlayer(args[0]), args[0]);
/* 43 */           Integer lost = Integer.valueOf(games.intValue() - wins.intValue());
/* 44 */           p.sendMessage(Var.getConfigEditSTRING(this.cfg, "statsheadertext", this.file) + "");
/* 45 */           p.sendMessage(Var.getConfigEditSTRING(this.cfg, "statsline1", this.file).replaceAll("PLAYER", args[0]) + "");
/* 46 */           p.sendMessage(Var.getConfigEditSTRING(this.cfg, "statsline2", this.file).replaceAll("COUNT", new StringBuilder().append(Manager.getGames(Manager.getUUIDfromPlayer(args[0]), args[0])).append("").toString()) + "");
/* 47 */           p.sendMessage(Var.getConfigEditSTRING(this.cfg, "statsline3", this.file).replaceAll("COUNT", new StringBuilder().append(Manager.getWins(Manager.getUUIDfromPlayer(args[0]), args[0])).append("").toString()) + "");
/* 48 */           p.sendMessage(Var.getConfigEditSTRING(this.cfg, "statsline4", this.file).replaceAll("COUNT", new StringBuilder().append(lost).append("").toString()) + "");
/* 49 */           p.sendMessage(Var.getConfigEditSTRING(this.cfg, "statsline5", this.file).replaceAll("COUNT", new StringBuilder().append(Manager.getPoints(Manager.getUUIDfromPlayer(args[0]), args[0])).append("").toString()) + "");
/* 50 */           p.sendMessage(Var.getConfigEditSTRING(this.cfg, "statsline6", this.file).replaceAll("COUNT", new StringBuilder().append(Manager.getRanking(Manager.getUUIDfromPlayer(args[0]), args[0])).append("").toString()) + "");
/* 51 */           p.sendMessage(Var.getConfigEditSTRING(this.cfg, "statsfootertext", this.file) + "");
/*    */         } else {
/* 53 */           p.sendMessage(Var.prefix + "" + Var.getConfigEditSTRING(this.cfg, "", this.file));
/*    */         }
/*    */       }
/*    */     }
/*    */     
/* 58 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Max\Desktop\MLGRush.jar!\de\mr\commands\Stats_CMD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */