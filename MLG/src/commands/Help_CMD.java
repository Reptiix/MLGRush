/*    */ package de.mr.commands;
/*    */ 
/*    */ import de.mr.extras.Var;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ public class Help_CMD implements CommandExecutor
/*    */ {
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
/*    */   {
/* 13 */     Player p = (Player)sender;
/* 14 */     if (cmd.getName().equalsIgnoreCase("mrhelp")) {
/* 15 */       if (args.length == 0) {
/* 16 */         Var.getCommandsHelp(p);
/*    */       } else {
/* 18 */         Var.getHelpCommandHelp(p);
/*    */       }
/*    */     }
/* 21 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Max\Desktop\MLGRush.jar!\de\mr\commands\Help_CMD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */