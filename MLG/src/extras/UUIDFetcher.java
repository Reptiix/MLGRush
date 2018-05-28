/*     */ package de.mr.extras;
/*     */ 
/*     */ import java.io.BufferedReader;
/*     */ import java.io.InputStreamReader;
/*     */ import java.net.URL;
/*     */ import java.net.URLConnection;
/*     */ import java.nio.charset.Charset;
/*     */ import java.util.UUID;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class UUIDFetcher
/*     */ {
/*     */   public static UUID getUUID(String playername)
/*     */   {
/*  68 */     String output = callURL("https://api.mojang.com/users/profiles/minecraft/" + playername);
/*     */     
/*     */ 
/*     */ 
/*  72 */     StringBuilder result = new StringBuilder();
/*     */     
/*     */ 
/*     */ 
/*  76 */     readData(output, result);
/*     */     
/*     */ 
/*     */ 
/*  80 */     String u = result.toString();
/*     */     
/*     */ 
/*     */ 
/*  84 */     String uuid = "";
/*     */     
/*     */ 
/*     */ 
/*  88 */     for (int i = 0; i <= 31; i++)
/*     */     {
/*  90 */       uuid = uuid + u.charAt(i);
/*     */       
/*  92 */       if ((i == 7) || (i == 11) || (i == 15) || (i == 19))
/*     */       {
/*  94 */         uuid = uuid + "-";
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 102 */     return UUID.fromString(uuid);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   private static void readData(String toRead, StringBuilder result)
/*     */   {
/* 110 */     int i = 7;
/*     */     
/*     */ 
/*     */ 
/* 114 */     while (i < 200)
/*     */     {
/* 116 */       if (String.valueOf(toRead.charAt(i)).equalsIgnoreCase("\"")) {
/*     */         break;
/*     */       }
/*     */       
/* 120 */       result.append(String.valueOf(toRead.charAt(i)));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 132 */       i++;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private static String callURL(String URL)
/*     */   {
/* 142 */     StringBuilder sb = new StringBuilder();
/*     */     
/* 144 */     URLConnection urlConn = null;
/*     */     
/* 146 */     InputStreamReader in = null;
/*     */     
/*     */     try
/*     */     {
/* 150 */       URL url = new URL(URL);
/*     */       
/* 152 */       urlConn = url.openConnection();
/*     */       
/*     */ 
/*     */ 
/* 156 */       if (urlConn != null) { urlConn.setReadTimeout(60000);
/*     */       }
/*     */       
/*     */ 
/* 160 */       if ((urlConn != null) && (urlConn.getInputStream() != null))
/*     */       {
/* 162 */         in = new InputStreamReader(urlConn.getInputStream(), Charset.defaultCharset());
/*     */         
/* 164 */         BufferedReader bufferedReader = new BufferedReader(in);
/*     */         
/*     */ 
/*     */ 
/* 168 */         if (bufferedReader != null)
/*     */         {
/*     */           int cp;
/*     */           
/*     */ 
/*     */ 
/* 174 */           while ((cp = bufferedReader.read()) != -1)
/*     */           {
/* 176 */             sb.append((char)cp);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 182 */           bufferedReader.close();
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 190 */       in.close();
/*     */     }
/*     */     catch (Exception e)
/*     */     {
/* 194 */       e.printStackTrace();
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 200 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\Max\Desktop\MLGRush.jar!\de\mr\extras\UUIDFetcher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */