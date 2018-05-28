/*    */ package de.mr.commands;
/*    */ 
/*    */ import de.mr.extras.Var;
/*    */ import java.util.ArrayList;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ public class Build_CMD implements CommandExecutor
/*    */ {
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
/*    */   {
/* 14 */     Player p = (Player)sender;
/* 15 */     if (cmd.getName().equalsIgnoreCase("mrbuild")) {
/* 16 */       if ((p.hasPermission("mr.build")) || (p.hasPermission("mr.*"))) {
/* 17 */         if (args.length == 0) {
/* 18 */           if (!Var.build.contains(p)) {
/* 19 */             Var.build.add(p);
/* 20 */             p.sendMessage(Var.prefix + " §7You are now able to build§8.");
/*    */           } else {
/* 22 */             Var.build.remove(p);
/* 23 */             p.sendMessage(Var.prefix + " §7You aren't able to build now§8.");
/*    */           }
/*    */         } else {
/* 26 */           p.sendMessage(Var.prefix + " §cUse §6/build");
/*    */         }
/*    */       } else {
/* 29 */         p.sendMessage(Var.prefix + " §cYou don't have the Permission to do that§8.");
/*    */       }
/*    */     }
/* 32 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Max\Desktop\MLGRush.jar!\de\mr\commands\Build_CMD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */