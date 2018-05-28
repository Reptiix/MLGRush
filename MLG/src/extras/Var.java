/*     */ package de.mr.extras;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.util.ArrayList;
/*     */ import org.bukkit.Location;
/*     */ import org.bukkit.configuration.file.YamlConfiguration;
/*     */ import org.bukkit.entity.Player;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Var
/*     */ {
/*     */   public static Enum state;
/*     */   public static String prefix;
/*     */   public static Integer redpoints;
/*     */   public static Integer bluepoints;
/*     */   public static Integer reaminingrounds;
/*  21 */   public static ArrayList<Location> blocks = new ArrayList();
/*  22 */   public static ArrayList<Player> build = new ArrayList();
/*     */   
/*     */   public static Integer mapvote1;
/*     */   
/*     */   public static Integer mapvote2;
/*     */   public static Integer mapvote3;
/*     */   public static Integer mapvote4;
/*     */   public static Integer mapvote5;
/*     */   public static Integer mapvote6;
/*     */   public static Integer mapvote7;
/*  32 */   public static ArrayList<Player> voted = new ArrayList();
/*     */   
/*     */   public static String getConfigEditSTRING(YamlConfiguration cfg, String pfad, File file) {
/*  35 */     if (file.exists()) {
/*  36 */       return cfg.getString("." + pfad.toLowerCase()).replaceAll("&", "§");
/*     */     }
/*  38 */     cfg.set(".mysql", Boolean.valueOf(false));
/*  39 */     cfg.set(".hologram", Boolean.valueOf(false));
/*  40 */     cfg.set(".prefix", "&8| &eMLGRush &8| ");
/*  41 */     cfg.set(".serverfull", "&cThe Server is full&8.");
/*  42 */     cfg.set(".playernotfound", "&7This player has never been on the server&8.");
/*  43 */     cfg.set(".joinmessage", "&ePLAYER &7connected to the Server&8.");
/*  44 */     cfg.set(".countdown1", "&7The Game starts in &b10 &7seconds&8.");
/*  45 */     cfg.set(".countdown2", "&7The Game starts in &bCOUNT &7seconds&8.");
/*  46 */     cfg.set(".countdown3", "&7The Game starts &bnow&8.");
/*  47 */     cfg.set(".endcountdown1", "&7The Game ends in &b10 &7seconds&8.");
/*  48 */     cfg.set(".endcountdown2", "&7The Game ends in &bCOUNT &7seconds&8.");
/*  49 */     cfg.set(".endcountdown3", "&7The Game ends &bnow&8.");
/*  50 */     cfg.set(".set", "&7You've set the Spawn &bSPAWN &7for the Map MAPNAME&8.");
/*  51 */     cfg.set(".vote", "&7You've voted for &bMAPNAME");
/*  52 */     cfg.set(".alreadyvoted", "&7You've already voted in this Game");
/*  53 */     cfg.set(".nomapitem", "&cNO MAP");
/*  54 */     cfg.set(".votewon", "&7MAP has won the Voting");
/*  55 */     cfg.set(".sbtitle", "&bMLGRush");
/*  56 */     cfg.set(".sbtext1", "&7State&8:");
/*  57 */     cfg.set(".sbtext2", "&bSTATE");
/*  58 */     cfg.set(".sbtext3", "&7Score&8:");
/*  59 */     cfg.set(".sbtext4", "&cRed &cTEAMRED &8| &bTEAMBLUE &bBlue");
/*  60 */     cfg.set(".sbtext5", "&7Remaining");
/*  61 */     cfg.set(".sbtext6", "&bCOUNT &7Rounds");
/*  62 */     cfg.set(".rounds", Integer.valueOf(3));
/*  63 */     cfg.set(".buildrange", Integer.valueOf(10));
/*  64 */     cfg.set(".pickaxename", "&7Pickaxe");
/*  65 */     cfg.set(".sandname", "&7Sandstone");
/*  66 */     cfg.set(".stickname", "&7Knockbackstick");
/*  67 */     cfg.set(".voteitemname", "&bVoting");
/*  68 */     cfg.set(".inventoryitemname", "&bSort your inventory");
/*  69 */     cfg.set(".saveitemname", "&aSave");
/*  70 */     cfg.set(".stickknockback", Integer.valueOf(1));
/*  71 */     cfg.set(".destroymessage1", "&cRed &7has destroyed the Bed from Team &bBlue&8.");
/*  72 */     cfg.set(".destroymessage2", "&bBlue &7has destroyed the Bed from Team &cRed&8.");
/*  73 */     cfg.set(".quitmessage", "&bPLAYER &7disconnected&8.");
/*  74 */     cfg.set(".enoughplayer", "&cThere are not enough Players to play&8!");
/*  75 */     cfg.set(".statsheadertext", "&8&m------------------------");
/*  76 */     cfg.set(".statsfootertext", "&8&m------------------------");
/*  77 */     cfg.set(".statsline1", "&7PLAYER");
/*  78 */     cfg.set(".statsline2", "&7Played Games&8: &bCOUNT");
/*  79 */     cfg.set(".statsline3", "&7Won Games&8: &bCOUNT");
/*  80 */     cfg.set(".statsline4", "&7Lost Games&8: &bCOUNT");
/*  81 */     cfg.set(".statsline5", "&7Points&8: &bCOUNT");
/*  82 */     cfg.set(".statsline6", "&7Ranking&8: &b#COUNT");
/*  83 */     cfg.set(".Mapname1", "&NO MAP");
/*  84 */     cfg.set(".Mapname2", "&NO MAP");
/*  85 */     cfg.set(".Mapname3", "&NO MAP");
/*  86 */     cfg.set(".Mapname4", "&NO MAP");
/*  87 */     cfg.set(".Mapname5", "&NO MAP");
/*  88 */     cfg.set(".Mapname6", "&NO MAP");
/*  89 */     cfg.set(".Mapname7", "&NO MAP");
/*  90 */     cfg.set("Host", "Host.net");
/*  91 */     cfg.set("Database", "Testdatabase");
/*  92 */     cfg.set("Username", "Testusername");
/*  93 */     cfg.set("Password", "Testpassword");
/*     */     try {
/*  95 */       cfg.save(file);
/*     */     } catch (Exception e) {
/*  97 */       e.printStackTrace();
/*     */     }
/*  99 */     return cfg.getString("." + pfad.toLowerCase()).replaceAll("&", "§");
/*     */   }
/*     */   
/*     */   public static Integer getConfigEditINTEGER(YamlConfiguration cfg, String pfad, File file)
/*     */   {
/* 104 */     if (file.exists()) {
/* 105 */       return Integer.valueOf(cfg.getInt("." + pfad.toLowerCase()));
/*     */     }
/* 107 */     cfg.set(".mysql", Boolean.valueOf(false));
/* 108 */     cfg.set(".hologram", Boolean.valueOf(false));
/* 109 */     cfg.set(".prefix", "&8| &eMLGRush &8| ");
/* 110 */     cfg.set(".serverfull", "&cThe Server is full&8.");
/* 111 */     cfg.set(".playernotfound", "&7This player has never been on the server&8.");
/* 112 */     cfg.set(".joinmessage", "&ePLAYER &7connected to the Server&8.");
/* 113 */     cfg.set(".countdown1", "&7The Game starts in &b10 &7seconds&8.");
/* 114 */     cfg.set(".countdown2", "&7The Game starts in &bCOUNT &7seconds&8.");
/* 115 */     cfg.set(".countdown2", "&7The Game starts &bnow&8.");
/* 116 */     cfg.set(".endcountdown1", "&7The Game ends in &b10 &7seconds&8.");
/* 117 */     cfg.set(".endcountdown2", "&7The Game ends in &bCOUNT &7seconds&8.");
/* 118 */     cfg.set(".endcountdown3", "&7The Game ends &bnow&8.");
/* 119 */     cfg.set(".set", "&7You've set the Spawn &bSPAWN &7for the Map MAPNAME&8.");
/* 120 */     cfg.set(".vote", "&7You've voted for &bMAPNAME");
/* 121 */     cfg.set(".alreadyvoted", "&7You've already voted in this Game");
/* 122 */     cfg.set(".nomapitem", "&cNO MAP");
/* 123 */     cfg.set(".votewon", "&7MAP has won the Voting");
/* 124 */     cfg.set(".sbtitle", "&bMLGRush");
/* 125 */     cfg.set(".sbtext1", "&7State&8:");
/* 126 */     cfg.set(".sbtext2", "&bSTATE");
/* 127 */     cfg.set(".sbtext3", "&7Score&8:");
/* 128 */     cfg.set(".sbtext4", "&cRed &cTEAMRED &8| &bTEAMBLUE &bBlue");
/* 129 */     cfg.set(".sbtext5", "&7Remaining");
/* 130 */     cfg.set(".sbtext6", "&bCOUNT &7Rounds");
/* 131 */     cfg.set(".rounds", Integer.valueOf(3));
/* 132 */     cfg.set(".buildrange", Integer.valueOf(10));
/* 133 */     cfg.set(".pickaxename", "&7Pickaxe");
/* 134 */     cfg.set(".sandname", "&7Sandstone");
/* 135 */     cfg.set(".stickname", "&7Knockbackstick");
/* 136 */     cfg.set(".voteitemname", "&bVoting");
/* 137 */     cfg.set(".inventoryitemname", "&bSort your inventory");
/* 138 */     cfg.set(".saveitemname", "&aSave");
/* 139 */     cfg.set(".stickknockback", Integer.valueOf(1));
/* 140 */     cfg.set(".destroymessage1", "&cRed &7has destroyed the Bed from Team &bBlue&8.");
/* 141 */     cfg.set(".destroymessage2", "&bBlue &7has destroyed the Bed from Team &cRed&8.");
/* 142 */     cfg.set(".quitmessage", "&bPLAYER &7disconnected&8.");
/* 143 */     cfg.set(".enoughplayer", "&cThere are not enough Players to play&8!");
/* 144 */     cfg.set(".statsheadertext", "&8&m------------------------");
/* 145 */     cfg.set(".statsfootertext", "&8&m------------------------");
/* 146 */     cfg.set(".statsline1", "&7PLAYER");
/* 147 */     cfg.set(".statsline2", "&7Played Games&8: &bCOUNT");
/* 148 */     cfg.set(".statsline3", "&7Won Games&8: &bCOUNT");
/* 149 */     cfg.set(".statsline4", "&7Lost Games&8: &bCOUNT");
/* 150 */     cfg.set(".statsline5", "&7Points&8: &bCOUNT");
/* 151 */     cfg.set(".statsline6", "&7Ranking&8: &b#COUNT");
/* 152 */     cfg.set(".Mapname1", "&NO MAP");
/* 153 */     cfg.set(".Mapname2", "&NO MAP");
/* 154 */     cfg.set(".Mapname3", "&NO MAP");
/* 155 */     cfg.set(".Mapname4", "&NO MAP");
/* 156 */     cfg.set(".Mapname5", "&NO MAP");
/* 157 */     cfg.set(".Mapname6", "&NO MAP");
/* 158 */     cfg.set(".Mapname7", "&NO MAP");
/* 159 */     cfg.set("Host", "Host.net");
/* 160 */     cfg.set("Database", "Testdatabase");
/* 161 */     cfg.set("Username", "Testusername");
/* 162 */     cfg.set("Password", "Testpassword");
/*     */     try {
/* 164 */       cfg.save(file);
/*     */     } catch (Exception e) {
/* 166 */       e.printStackTrace();
/*     */     }
/* 168 */     return Integer.valueOf(cfg.getInt("." + pfad.toLowerCase()));
/*     */   }
/*     */   
/*     */ 
/*     */   public static Boolean getConfigEditBOOLEAN(YamlConfiguration cfg, String pfad, File file)
/*     */   {
/* 174 */     if (file.exists()) {
/* 175 */       return Boolean.valueOf(cfg.getBoolean("." + pfad.toLowerCase()));
/*     */     }
/* 177 */     cfg.set(".mysql", Boolean.valueOf(false));
/* 178 */     cfg.set(".hologram", Boolean.valueOf(false));
/* 179 */     cfg.set(".prefix", "&8| &eMLGRush &8| ");
/* 180 */     cfg.set(".serverfull", "&cThe Server is full&8.");
/* 181 */     cfg.set(".playernotfound", "&7This player has never been on the server&8.");
/* 182 */     cfg.set(".joinmessage", "&ePLAYER &7connected to the Server&8.");
/* 183 */     cfg.set(".countdown1", "&7The Game starts in &b10 &7seconds&8.");
/* 184 */     cfg.set(".countdown2", "&7The Game starts in &bCOUNT &7seconds&8.");
/* 185 */     cfg.set(".countdown2", "&7The Game starts &bnow&8.");
/* 186 */     cfg.set(".endcountdown1", "&7The Game ends in &b10 &7seconds&8.");
/* 187 */     cfg.set(".endcountdown2", "&7The Game ends in &bCOUNT &7seconds&8.");
/* 188 */     cfg.set(".endcountdown3", "&7The Game ends &bnow&8.");
/* 189 */     cfg.set(".set", "&7You've set the Spawn &bSPAWN &7for the Map MAPNAME&8.");
/* 190 */     cfg.set(".vote", "&7You've voted for &bMAPNAME");
/* 191 */     cfg.set(".alreadyvoted", "&7You've already voted in this Game");
/* 192 */     cfg.set(".nomapitem", "&cNO MAP");
/* 193 */     cfg.set(".votewon", "&7MAP has won the Voting");
/* 194 */     cfg.set(".sbtitle", "&bMLGRush");
/* 195 */     cfg.set(".sbtext1", "&7State&8:");
/* 196 */     cfg.set(".sbtext2", "&bSTATE");
/* 197 */     cfg.set(".sbtext3", "&7Score&8:");
/* 198 */     cfg.set(".sbtext4", "&cRed &cTEAMRED &8| &bTEAMBLUE &bBlue");
/* 199 */     cfg.set(".sbtext5", "&7Remaining");
/* 200 */     cfg.set(".sbtext6", "&bCOUNT &7Rounds");
/* 201 */     cfg.set(".rounds", Integer.valueOf(3));
/* 202 */     cfg.set(".buildrange", Integer.valueOf(10));
/* 203 */     cfg.set(".pickaxename", "&7Pickaxe");
/* 204 */     cfg.set(".sandname", "&7Sandstone");
/* 205 */     cfg.set(".stickname", "&7Knockbackstick");
/* 206 */     cfg.set(".voteitemname", "&bVoting");
/* 207 */     cfg.set(".inventoryitemname", "&bSort your inventory");
/* 208 */     cfg.set(".saveitemname", "&aSave");
/* 209 */     cfg.set(".stickknockback", Integer.valueOf(1));
/* 210 */     cfg.set(".destroymessage1", "&cRed &7has destroyed the Bed from Team &bBlue&8.");
/* 211 */     cfg.set(".destroymessage2", "&bBlue &7has destroyed the Bed from Team &cRed&8.");
/* 212 */     cfg.set(".quitmessage", "&bPLAYER &7disconnected&8.");
/* 213 */     cfg.set(".enoughplayer", "&cThere are not enough Players to play&8!");
/* 214 */     cfg.set(".statsheadertext", "&8&m------------------------");
/* 215 */     cfg.set(".statsfootertext", "&8&m------------------------");
/* 216 */     cfg.set(".statsline1", "&7PLAYER");
/* 217 */     cfg.set(".statsline2", "&7Played Games&8: &bCOUNT");
/* 218 */     cfg.set(".statsline3", "&7Won Games&8: &bCOUNT");
/* 219 */     cfg.set(".statsline4", "&7Lost Games&8: &bCOUNT");
/* 220 */     cfg.set(".statsline5", "&7Points&8: &bCOUNT");
/* 221 */     cfg.set(".statsline6", "&7Ranking&8: &b#COUNT");
/* 222 */     cfg.set(".Mapname1", "&NO MAP");
/* 223 */     cfg.set(".Mapname2", "&NO MAP");
/* 224 */     cfg.set(".Mapname3", "&NO MAP");
/* 225 */     cfg.set(".Mapname4", "&NO MAP");
/* 226 */     cfg.set(".Mapname5", "&NO MAP");
/* 227 */     cfg.set(".Mapname6", "&NO MAP");
/* 228 */     cfg.set(".Mapname7", "&NO MAP");
/* 229 */     cfg.set("Host", "Host.net");
/* 230 */     cfg.set("Database", "Testdatabase");
/* 231 */     cfg.set("Username", "Testusername");
/* 232 */     cfg.set("Password", "Testpassword");
/*     */     try {
/* 234 */       cfg.save(file);
/*     */     } catch (Exception e) {
/* 236 */       e.printStackTrace();
/*     */     }
/* 238 */     return Boolean.valueOf(cfg.getBoolean("." + pfad.toLowerCase()));
/*     */   }
/*     */   
/*     */ 
/*     */   public static void getSetCommandHelp(Player p)
/*     */   {
/* 244 */     p.sendMessage("§8§m----------------------------");
/* 245 */     p.sendMessage("§b/mrset §8[§7Red§8,§7Blue§8,§7Height§8] §8[§7MAPNUMBER§8]");
/* 246 */     p.sendMessage("§b/mrset §7Spawn");
/* 247 */     p.sendMessage("§8§m----------------------------");
/*     */   }
/*     */   
/* 250 */   public static void getTranslateCommandHelp(Player p) { p.sendMessage("§8§m----------------------------");
/* 251 */     p.sendMessage("§b/mrtranslate §8[§7German§8,§7English§8]");
/* 252 */     p.sendMessage("§8§m----------------------------");
/*     */   }
/*     */   
/*     */   public static void getHelpCommandHelp(Player p) {
/* 256 */     p.sendMessage("§8§m----------------------------");
/* 257 */     p.sendMessage("§b/mrhelp");
/* 258 */     p.sendMessage("§8§m----------------------------");
/*     */   }
/*     */   
/* 261 */   public static void getCommandsHelp(Player p) { p.sendMessage("§8§m----------------------------");
/* 262 */     p.sendMessage("§b/mrset §8[§7Red§8,§7Blue§8,§7Height§8] §8[§7MAPNUMBER§8]");
/* 263 */     p.sendMessage("§b/mrset §7Spawn");
/* 264 */     p.sendMessage("§b/mrtranslate §8[§7German§8,§7English§8]");
/* 265 */     p.sendMessage("§b/mrhelp");
/* 266 */     p.sendMessage("§e1 §7/ §e1");
/* 267 */     p.sendMessage("§bDeveloped by GGK0mbo");
/* 268 */     p.sendMessage("§8§m----------------------------");
/*     */   }
/*     */ }


/* Location:              C:\Users\Max\Desktop\MLGRush.jar!\de\mr\extras\Var.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */