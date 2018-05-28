/*     */ package de.mr.mysql;
/*     */ 
/*     */ import de.mr.extras.Var;
/*     */ import java.io.File;
/*     */ import java.sql.Connection;
/*     */ import java.sql.PreparedStatement;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.SQLException;
/*     */ 
/*     */ public class Manager
/*     */ {
/*  12 */   static File file = new File("plugins//MLGRush//config.yml");
/*  13 */   static org.bukkit.configuration.file.YamlConfiguration cfg = org.bukkit.configuration.file.YamlConfiguration.loadConfiguration(file);
/*     */   
/*  15 */   public static boolean isRegistered(String uuid) { ResultSet rs = MySQL.getResult("SELECT * FROM MR_Stats WHERE UUID ='" + uuid + "'");
/*     */     try
/*     */     {
/*  18 */       if (rs.next()) {
/*  19 */         return rs != null;
/*     */       }
/*     */     }
/*     */     catch (SQLException e1) {
/*  23 */       e1.printStackTrace();
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*  28 */     return false;
/*     */   }
/*     */   
/*  31 */   public static boolean isRegisteredInv(String uuid) { ResultSet rs = MySQL.getResult("SELECT * FROM MR_Inv WHERE UUID ='" + uuid + "'");
/*     */     try
/*     */     {
/*  34 */       if (rs.next()) {
/*  35 */         return rs != null;
/*     */       }
/*     */     }
/*     */     catch (SQLException e1) {
/*  39 */       e1.printStackTrace();
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*  44 */     return false;
/*     */   }
/*     */   
/*  47 */   public static boolean wasOnServer(String uuid) { ResultSet rs = MySQL.getResult("SELECT * FROM MR_Stats WHERE UUID ='" + uuid + "'");
/*     */     try
/*     */     {
/*  50 */       if (rs.next()) {
/*  51 */         return rs != null;
/*     */       }
/*     */     }
/*     */     catch (SQLException e1) {
/*  55 */       e1.printStackTrace();
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*  60 */     return false;
/*     */   }
/*     */   
/*     */   public static void insertIntoDatabase(String uuid, String playername)
/*     */   {
/*     */     try
/*     */     {
/*  67 */       if (!Var.getConfigEditBOOLEAN(cfg, "mysql", file).booleanValue())
/*  68 */         return;
/*  69 */       if (!isRegistered(uuid)) {
/*  70 */         PreparedStatement st = MySQL.con.prepareStatement("INSERT INTO MR_Stats (UUID, NAME, WINS, GAMES, POINTS) VALUES (?,?,?,?,?)");
/*  71 */         st.setString(1, uuid);
/*  72 */         st.setString(2, playername);
/*  73 */         st.setInt(3, 0);
/*  74 */         st.setInt(4, 0);
/*  75 */         st.setInt(5, 0);
/*  76 */         st.executeUpdate();
/*     */       } else {
/*  78 */         PreparedStatement st2 = MySQL.con.prepareStatement("UPDATE MR_Stats set NAME = ? WHERE UUID = ?");
/*  79 */         st2.setString(1, playername);
/*  80 */         st2.setString(2, uuid);
/*  81 */         st2.executeUpdate();
/*     */       }
/*     */     } catch (SQLException e) {
/*  84 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   public static void insertIntoDatabaseForInventory(String uuid) {
/*  89 */     try { if (!Var.getConfigEditBOOLEAN(cfg, "mysql", file).booleanValue())
/*  90 */         return;
/*  91 */       if (!isRegisteredInv(uuid)) {
/*  92 */         PreparedStatement st = MySQL.con.prepareStatement("INSERT INTO MR_Inv (UUID, SLOT1, SLOT2, SLOT3) VALUES (?,?,?,?)");
/*  93 */         st.setString(1, uuid);
/*  94 */         st.setInt(2, 0);
/*  95 */         st.setInt(3, 1);
/*  96 */         st.setInt(4, 2);
/*  97 */         st.executeUpdate();
/*     */       }
/*     */     } catch (SQLException e) {
/* 100 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   public static void setSlot1(String uuid, Integer Count) {
/*     */     try {
/* 106 */       if (!Var.getConfigEditBOOLEAN(cfg, "mysql", file).booleanValue())
/* 107 */         return;
/* 108 */       if (!isRegistered(uuid)) {
/* 109 */         insertIntoDatabaseForInventory(uuid);
/*     */       } else {
/* 111 */         PreparedStatement st2 = MySQL.con.prepareStatement("UPDATE MR_Inv set SLOT1 = ? WHERE UUID = ?");
/* 112 */         st2.setInt(1, Count.intValue());
/* 113 */         st2.setString(2, uuid);
/* 114 */         st2.executeUpdate();
/*     */       }
/*     */     } catch (SQLException e) {
/* 117 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   public static void setSlot2(String uuid, Integer Count) {
/*     */     try {
/* 123 */       if (!Var.getConfigEditBOOLEAN(cfg, "mysql", file).booleanValue())
/* 124 */         return;
/* 125 */       if (!isRegistered(uuid)) {
/* 126 */         insertIntoDatabaseForInventory(uuid);
/*     */       } else {
/* 128 */         PreparedStatement st2 = MySQL.con.prepareStatement("UPDATE MR_Inv set SLOT2 = ? WHERE UUID = ?");
/* 129 */         st2.setInt(1, Count.intValue());
/* 130 */         st2.setString(2, uuid);
/* 131 */         st2.executeUpdate();
/*     */       }
/*     */     } catch (SQLException e) {
/* 134 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   public static void setSlot3(String uuid, Integer Count) {
/* 139 */     try { if (!Var.getConfigEditBOOLEAN(cfg, "mysql", file).booleanValue())
/* 140 */         return;
/* 141 */       if (!isRegistered(uuid)) {
/* 142 */         insertIntoDatabaseForInventory(uuid);
/*     */       } else {
/* 144 */         PreparedStatement st2 = MySQL.con.prepareStatement("UPDATE MR_Inv set SLOT3 = ? WHERE UUID = ?");
/* 145 */         st2.setInt(1, Count.intValue());
/* 146 */         st2.setString(2, uuid);
/* 147 */         st2.executeUpdate();
/*     */       }
/*     */     } catch (SQLException e) {
/* 150 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   public static Integer getSlot1(String uuid)
/*     */   {
/*     */     try
/*     */     {
/* 158 */       if (!Var.getConfigEditBOOLEAN(cfg, "mysql", file).booleanValue())
/* 159 */         return Integer.valueOf(0);
/* 160 */       if (!isRegistered(uuid))
/*     */       {
/* 162 */         insertIntoDatabaseForInventory(uuid);
/* 163 */         return Integer.valueOf(0);
/*     */       }
/* 165 */       PreparedStatement st = MySQL.con.prepareStatement("SELECT * FROM MR_Inv WHERE UUID = ?");
/* 166 */       st.setString(1, uuid);
/* 167 */       ResultSet rs = st.executeQuery();
/* 168 */       if (rs.next()) {
/* 169 */         return Integer.valueOf(rs.getInt("SLOT1"));
/*     */       }
/*     */     }
/*     */     catch (SQLException e)
/*     */     {
/* 174 */       e.printStackTrace();
/*     */     }
/*     */     
/*     */ 
/* 178 */     return null;
/*     */   }
/*     */   
/*     */   public static String getUUIDfromPlayer(String playername)
/*     */   {
/*     */     try {
/* 184 */       if (!Var.getConfigEditBOOLEAN(cfg, "mysql", file).booleanValue()) {
/* 185 */         return null;
/*     */       }
/* 187 */       PreparedStatement st = MySQL.con.prepareStatement("SELECT * FROM MR_Stats WHERE NAME = ?");
/* 188 */       st.setString(1, playername);
/* 189 */       ResultSet rs = st.executeQuery();
/* 190 */       if (rs.next()) {
/* 191 */         return rs.getString("UUID");
/*     */       }
/*     */     }
/*     */     catch (SQLException e)
/*     */     {
/* 196 */       e.printStackTrace();
/*     */     }
/*     */     
/*     */ 
/* 200 */     return null;
/*     */   }
/*     */   
/*     */   public static Integer getSlot2(String uuid)
/*     */   {
/*     */     try {
/* 206 */       if (!Var.getConfigEditBOOLEAN(cfg, "mysql", file).booleanValue())
/* 207 */         return Integer.valueOf(0);
/* 208 */       if (!isRegistered(uuid))
/*     */       {
/* 210 */         insertIntoDatabaseForInventory(uuid);
/* 211 */         return Integer.valueOf(0);
/*     */       }
/* 213 */       PreparedStatement st = MySQL.con.prepareStatement("SELECT * FROM MR_Inv WHERE UUID = ?");
/* 214 */       st.setString(1, uuid);
/* 215 */       ResultSet rs = st.executeQuery();
/* 216 */       if (rs.next()) {
/* 217 */         return Integer.valueOf(rs.getInt("SLOT2"));
/*     */       }
/*     */     }
/*     */     catch (SQLException e)
/*     */     {
/* 222 */       e.printStackTrace();
/*     */     }
/*     */     
/*     */ 
/* 226 */     return null;
/*     */   }
/*     */   
/*     */   public static Integer getSlot3(String uuid) {
/*     */     try {
/* 231 */       if (!Var.getConfigEditBOOLEAN(cfg, "mysql", file).booleanValue())
/* 232 */         return Integer.valueOf(0);
/* 233 */       if (!isRegistered(uuid))
/*     */       {
/* 235 */         insertIntoDatabaseForInventory(uuid);
/* 236 */         return Integer.valueOf(0);
/*     */       }
/* 238 */       PreparedStatement st = MySQL.con.prepareStatement("SELECT * FROM MR_Inv WHERE UUID = ?");
/* 239 */       st.setString(1, uuid);
/* 240 */       ResultSet rs = st.executeQuery();
/* 241 */       if (rs.next()) {
/* 242 */         return Integer.valueOf(rs.getInt("SLOT3"));
/*     */       }
/*     */     }
/*     */     catch (SQLException e)
/*     */     {
/* 247 */       e.printStackTrace();
/*     */     }
/*     */     
/*     */ 
/* 251 */     return null;
/*     */   }
/*     */   
/*     */   public static void setWins(String uuid, String playername, Integer Count)
/*     */   {
/*     */     try {
/* 257 */       if (!Var.getConfigEditBOOLEAN(cfg, "mysql", file).booleanValue())
/* 258 */         return;
/* 259 */       if (!isRegistered(uuid)) {
/* 260 */         insertIntoDatabase(uuid, playername);
/*     */       } else {
/* 262 */         PreparedStatement st2 = MySQL.con.prepareStatement("UPDATE MR_Stats set WINS = ? WHERE UUID = ?");
/* 263 */         st2.setInt(1, Count.intValue());
/* 264 */         st2.setString(2, uuid);
/* 265 */         st2.executeUpdate();
/*     */       }
/*     */     } catch (SQLException e) {
/* 268 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   public static Integer getWins(String uuid, String playername) {
/*     */     try {
/* 274 */       if (!Var.getConfigEditBOOLEAN(cfg, "mysql", file).booleanValue())
/* 275 */         return Integer.valueOf(0);
/* 276 */       if (!isRegistered(uuid))
/*     */       {
/* 278 */         insertIntoDatabase(uuid, playername);
/* 279 */         return Integer.valueOf(0);
/*     */       }
/* 281 */       PreparedStatement st = MySQL.con.prepareStatement("SELECT * FROM MR_Stats WHERE UUID = ?");
/* 282 */       st.setString(1, uuid);
/* 283 */       ResultSet rs = st.executeQuery();
/* 284 */       if (rs.next()) {
/* 285 */         return Integer.valueOf(rs.getInt("WINS"));
/*     */       }
/*     */     }
/*     */     catch (SQLException e)
/*     */     {
/* 290 */       e.printStackTrace();
/*     */     }
/*     */     
/*     */ 
/* 294 */     return null;
/*     */   }
/*     */   
/*     */   public static void addWin(String uuid, String playername, Integer Count)
/*     */   {
/* 299 */     if (!Var.getConfigEditBOOLEAN(cfg, "mysql", file).booleanValue())
/* 300 */       return;
/* 301 */     setWins(uuid, playername, Integer.valueOf(getWins(uuid, playername).intValue() + Count.intValue()));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public static void setGames(String uuid, String playername, Integer Count)
/*     */   {
/*     */     try
/*     */     {
/* 311 */       if (!Var.getConfigEditBOOLEAN(cfg, "mysql", file).booleanValue())
/* 312 */         return;
/* 313 */       if (!isRegistered(uuid)) {
/* 314 */         insertIntoDatabase(uuid, playername);
/*     */       } else {
/* 316 */         PreparedStatement st2 = MySQL.con.prepareStatement("UPDATE MR_Stats set GAMES = ? WHERE UUID = ?");
/* 317 */         st2.setInt(1, Count.intValue());
/* 318 */         st2.setString(2, uuid);
/* 319 */         st2.executeUpdate();
/*     */       }
/*     */     } catch (SQLException e) {
/* 322 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   public static Integer getGames(String uuid, String playername) {
/*     */     try {
/* 328 */       if (!Var.getConfigEditBOOLEAN(cfg, "mysql", file).booleanValue())
/* 329 */         return Integer.valueOf(0);
/* 330 */       if (!isRegistered(uuid))
/*     */       {
/* 332 */         insertIntoDatabase(uuid, playername);
/* 333 */         return Integer.valueOf(0);
/*     */       }
/* 335 */       PreparedStatement st = MySQL.con.prepareStatement("SELECT * FROM MR_Stats WHERE UUID = ?");
/* 336 */       st.setString(1, uuid);
/* 337 */       ResultSet rs = st.executeQuery();
/* 338 */       if (rs.next()) {
/* 339 */         return Integer.valueOf(rs.getInt("GAMES"));
/*     */       }
/*     */     }
/*     */     catch (SQLException e)
/*     */     {
/* 344 */       e.printStackTrace();
/*     */     }
/*     */     
/*     */ 
/* 348 */     return null;
/*     */   }
/*     */   
/*     */   public static void addGame(String uuid, String playername, Integer Count)
/*     */   {
/* 353 */     if (!Var.getConfigEditBOOLEAN(cfg, "mysql", file).booleanValue())
/* 354 */       return;
/* 355 */     setGames(uuid, playername, Integer.valueOf(getGames(uuid, playername).intValue() + Count.intValue()));
/*     */   }
/*     */   
/*     */ 
/*     */   public static void setPoints(String uuid, String playername, Integer Count)
/*     */   {
/*     */     try
/*     */     {
/* 363 */       if (!Var.getConfigEditBOOLEAN(cfg, "mysql", file).booleanValue())
/* 364 */         return;
/* 365 */       if (!isRegistered(uuid)) {
/* 366 */         insertIntoDatabase(uuid, playername);
/*     */       } else {
/* 368 */         PreparedStatement st2 = MySQL.con.prepareStatement("UPDATE MR_Stats set POINTS = ? WHERE UUID = ?");
/* 369 */         st2.setInt(1, Count.intValue());
/* 370 */         st2.setString(2, uuid);
/* 371 */         st2.executeUpdate();
/*     */       }
/*     */     } catch (SQLException e) {
/* 374 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   public static Integer getPoints(String uuid, String playername) {
/*     */     try {
/* 380 */       if (!Var.getConfigEditBOOLEAN(cfg, "mysql", file).booleanValue())
/* 381 */         return Integer.valueOf(0);
/* 382 */       if (!isRegistered(uuid))
/*     */       {
/* 384 */         insertIntoDatabase(uuid, playername);
/* 385 */         return Integer.valueOf(0);
/*     */       }
/* 387 */       PreparedStatement st = MySQL.con.prepareStatement("SELECT * FROM MR_Stats WHERE UUID = ?");
/* 388 */       st.setString(1, uuid);
/* 389 */       ResultSet rs = st.executeQuery();
/* 390 */       if (rs.next()) {
/* 391 */         return Integer.valueOf(rs.getInt("POINTS"));
/*     */       }
/*     */     }
/*     */     catch (SQLException e)
/*     */     {
/* 396 */       e.printStackTrace();
/*     */     }
/*     */     
/*     */ 
/* 400 */     return null;
/*     */   }
/*     */   
/*     */   public static Integer getRanking(String uuid, String playername)
/*     */   {
/*     */     try {
/* 406 */       if (!Var.getConfigEditBOOLEAN(cfg, "mysql", file).booleanValue())
/* 407 */         return Integer.valueOf(0);
/* 408 */       if (!isRegistered(uuid))
/*     */       {
/* 410 */         insertIntoDatabase(uuid, playername);
/* 411 */         return Integer.valueOf(0);
/*     */       }
/* 413 */       PreparedStatement st = MySQL.con.prepareStatement("SELECT * FROM MR_Stats ORDER BY POINTS DESC");
/* 414 */       int count = 0;
/* 415 */       ResultSet rs = st.executeQuery();
/* 416 */       while (rs.next()) {
/* 417 */         count++;
/* 418 */         String nameuuid = rs.getString("UUID");
/* 419 */         if (nameuuid.equalsIgnoreCase(uuid)) {
/* 420 */           return Integer.valueOf(count);
/*     */         }
/*     */       }
/*     */     }
/*     */     catch (SQLException e)
/*     */     {
/* 426 */       e.printStackTrace();
/*     */     }
/*     */     
/*     */ 
/* 430 */     return null;
/*     */   }
/*     */   
/*     */   public static void addPoints(String uuid, String playername, Integer Count) {
/* 434 */     if (!Var.getConfigEditBOOLEAN(cfg, "mysql", file).booleanValue())
/* 435 */       return;
/* 436 */     setPoints(uuid, playername, Integer.valueOf(getPoints(uuid, playername).intValue() + Count.intValue()));
/*     */   }
/*     */ }


/* Location:              C:\Users\Max\Desktop\MLGRush.jar!\de\mr\mysql\Manager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */