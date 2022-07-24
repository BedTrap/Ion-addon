/* Decompiler 11ms, total 197ms, lines 143 */
package me.ghosttypes.ion.utils.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import me.ghosttypes.ion.utils.sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS;

public class Class52 {
   public static String fd_String_1021;
   public static ScheduledExecutorService fd_ScheduledExecutorService_1022;
   public static boolean fd_boolean_1023;
   public static boolean fd_boolean_1024;
   public static String lijlIjliiLiJljjJjliljIJLJljJljLILjlIJiiljijLJIjiIillIjJIjLijLjLILJJLLlJjijLIjJJlIjILjl;
   public static String fd_String_1025;

   public static void shutdown() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_ScheduledExecutorService_1022.shutdown();
   }

   public static void init() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_ScheduledExecutorService_1022.scheduleAtFixedRate(Class52::updateCurrentTrack, 0L, 1500L, TimeUnit.MILLISECONDS);
   }

   public static String[] getCurrentTrack() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.fd_boolean_1016) {
         return null;
      } else {
         怀 怀 = new ArrayList();
         怀 怀 = new ProcessBuilder(new String[]{"cmd", "/c", "for /f \"tokens=* skip=9 delims= \" %g in ('tasklist /v /fo list /fi \"imagename eq spotify*\"') do @echo %g"});
         怀.redirectErrorStream(true);
         怀 怀 = 怀.start();
         BufferedReader 怀 = new BufferedReader(new InputStreamReader(怀.getInputStream()));

         while(true) {
            怀 怀 = 怀.readLine();
            if (怀 == null) {
               if (怀.isEmpty()) {
                  return null;
               } else {
                  byte[] var7 = new byte[0];
                  怀 怀 = new String(var7);
                  Iterator var10 = 怀.iterator();

                  while(var10.hasNext()) {
                     怀 怀 = (String)var10.next();
                     if (怀.contains("-")) {
                        怀 = 怀;
                        break;
                     }
                  }

                  var7 = new byte[0];
                  if (怀.equals(new String(var7))) {
                     return null;
                  } else {
                     var7 = new byte[0];
                     怀 = 怀.replace("Window Title: ", new String(var7));
                     怀 怀 = 怀.split("-", 0);
                     return 怀;
                  }
               }
            }

            if (怀.contains("Window Title:")) {
               ArrayList var12 = 怀;
               String var10001 = 怀;

               try {
                  var12.add(var10001);
               } catch (IOException var8) {
                  var8.printStackTrace();
                  return null;
               }
            }
         }
      }
   }

   public static boolean isSpotifyActive() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = new AtomicBoolean(false);
      怀 怀 = ProcessHandle.allProcesses();
      怀.filter(ProcessHandle::isAlive).forEach((怀x) -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         if (怀x.info().command().toString().contains("Spotify") || 怀x.info().command().toString().contains("spotify")) {
            怀.set(true);
         }

      });
      return 怀.get();
   }

   static {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_boolean_1023 = false;
      fd_boolean_1024 = false;
      fd_ScheduledExecutorService_1022 = Executors.newScheduledThreadPool(1);
   }

   public static void reset() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_String_1021 = null;
      fd_String_1025 = null;
      lijlIjliiLiJljjJjliljIJLJljJljLILjlIJiiljijLJIjiIillIjJIjLijLjLILJJLLlJjijLIjJJlIjILjl = null;
   }

   public static void updateCurrentTrack() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_boolean_1024 = isSpotifyActive();
      if (!fd_boolean_1024) {
         reset();
      } else {
         怀 怀 = getCurrentTrack();
         if (怀 == null) {
            reset();
         } else {
            怀 怀 = 怀[0];
            怀 怀 = 怀[1];
            if (怀 != null && 怀 != null) {
               fd_String_1025 = 怀.trim();
               fd_String_1021 = 怀.trim();
            } else {
               reset();
            }
         }
      }
   }

   public Class52() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }
}
