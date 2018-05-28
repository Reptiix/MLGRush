/*    */ package de.mr.mysql;
/*    */ 
/*    */ import java.sql.Connection;
/*    */ import java.sql.PreparedStatement;
/*    */ import java.sql.SQLException;
/*    */ 
/*    */ public class MySQL
/*    */ {
/*    */   public static Connection con;
/*    */   public static String host;
/*    */   public static String database;
/*    */   public static String username;
/*    */   public static String password;
/*    */   
/*    */   public static void connect()
/*    */   {
/* 17 */     if (!isConnected()) {
/*    */       try
/*    */       {
/* 20 */         con = java.sql.DriverManager.getConnection("jdbc:mysql://" + host + "/" + database + "?autoReconnect=true", username, password);
/* 21 */         System.out.println("MySQL connected for MLGRush.");
/*    */       } catch (SQLException e) {
/* 23 */         e.printStackTrace();
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public static void disconnect() {
/* 29 */     if (isConnected()) {
/*    */       try
/*    */       {
/* 32 */         con.close();
/* 33 */         System.out.println("MySQL disconnected for MLGRush.");
/*    */       }
/*    */       catch (SQLException e)
/*    */       {
/* 37 */         e.printStackTrace();
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public static boolean isConnected() {
/* 43 */     return con != null;
/*    */   }
/*    */   
/*    */   public static void createTableForStats() {
/*    */     try {
/* 48 */       con.prepareStatement("CREATE TABLE IF NOT EXISTS MR_Stats (UUID VARCHAR(100), NAME VARCHAR(100), WINS VARCHAR(100), GAMES VARCHAR(100), POINTS VARCHAR(100))").executeUpdate();
/*    */     } catch (SQLException e) {
/* 50 */       e.printStackTrace();
/*    */     }
/*    */   }
/*    */   
/*    */   public static void createTableForInventory() {
/* 55 */     try { con.prepareStatement("CREATE TABLE IF NOT EXISTS MR_Inv (UUID VARCHAR(100), SLOT1 VARCHAR(100), SLOT2 VARCHAR(100), SLOT3 VARCHAR(100))").executeUpdate();
/*    */     } catch (SQLException e) {
/* 57 */       e.printStackTrace();
/*    */     }
/*    */   }
/*    */   
/*    */   public static java.sql.ResultSet getResult(String query)
/*    */   {
/* 63 */     if (isConnected()) {
/*    */       try {
/* 65 */         return con.createStatement().executeQuery(query);
/*    */       } catch (SQLException e) {
/* 67 */         e.printStackTrace();
/*    */       }
/*    */     }
/* 70 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\Max\Desktop\MLGRush.jar!\de\mr\mysql\MySQL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */