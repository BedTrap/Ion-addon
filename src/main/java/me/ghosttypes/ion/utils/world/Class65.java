/* Decompiler 23ms, total 163ms, lines 268 */
package me.ghosttypes.ion.utils.world;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.stream.Stream;
import me.ghosttypes.ion.Ion;
import me.ghosttypes.ion.utils.sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS;
import net.fabricmc.loader.api.FabricLoader;
import org.apache.commons.io.IOUtils;

public class Class65 {
   public static Process fd_Process_1042;
   public static File fd_File_1043;
   public static File fd_File_1044;
   public static boolean fd_boolean_1045;
   public static File fd_File_1046;
   public static ScheduledExecutorService fd_ScheduledExecutorService_1047;
   public static File fd_File_1048;

   public static void startUpdate(String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (!fd_File_1046.exists() || !fd_File_1046.canExecute()) {
         Class66.exit("Could not verify the integrity of Ion (4). Please report this bug in the Ion Discord");
      }

      怀 怀 = new String[]{"java", "-jar", getFormattedPath(fd_File_1046), "-update", getFormattedPath(fd_File_1048), "-version", 怀};
      怀 怀 = new ProcessBuilder(怀);
      ProcessBuilder var4 = 怀;

      try {
         fd_Process_1042 = var4.start();
      } catch (Exception var3) {
         Class66.exit("Failed to start the update. Please report this bug in the Ion Discord");
      }

   }

   public static File findIon(String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = Ion.class.getProtectionDomain().getCodeSource().getLocation().getPath();
      File var8 = new File;
      File var10001 = var8;
      String var10002 = 怀;

      try {
         var10001.<init>(URLDecoder.decode(var10002, StandardCharsets.UTF_8));
         return var8;
      } catch (Exception var7) {
         Ion.log("Failed to locate Ion, falling back to folder scanning.");
         Ion.log("Exception: " + var7);
         怀 怀 = new ArrayList();
         Stream var9 = Files.walk(Paths.get(怀), FileVisitOption.FOLLOW_LINKS).filter((怀x) -> {
            String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
            return 怀x.toString().contains("ion") && 怀x.toString().contains(".jar");
         });
         Consumer var10 = (怀x) -> {
            String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
            怀.add(怀x.getFileName().toFile());
         };

         boolean var11;
         try {
            var9.forEach(var10);
            if (怀.isEmpty()) {
               return null;
            }
         } catch (Exception var6) {
            var11 = false;
            return null;
         }

         var8 = new File;
         var10001 = var8;
         File var12 = fd_File_1044;
         File var10003 = (File)怀.get(0);

         try {
            var10001.<init>(var12, var10003.getPath());
            return var8;
         } catch (Exception var5) {
            var11 = false;
            return null;
         }
      }
   }

   public static void startExternal() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (!fd_File_1046.exists()) {
         Class66.exit("Could not verify the integrity of Ion (4). Please report this bug in the Ion Discord");
      }

      怀 怀 = new String[]{"java", "-jar", getFormattedPath(fd_File_1046), "-start", getFormattedPath(fd_File_1048), "-name", Class63.getIgn(), "-version", "1.4.2"};
      怀 怀 = new ProcessBuilder(怀);
      fd_Process_1042 = 怀.start();
      long var3 = fd_Process_1042.pid();

      try {
         Ion.log("External Auth started! | PID: " + var3);
      } catch (Exception var2) {
         Class66.exit("Could not verify the integrity of Ion (4) . Please report this bug in the Ion Discord");
      }

      if (!isLoaded()) {
         Class66.exit("Could not verify the integrity of Ion (3). Please report this bug in the Ion Discord");
      }

   }

   static {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_ScheduledExecutorService_1047 = Executors.newScheduledThreadPool(1);
      fd_Process_1042 = null;
      fd_boolean_1045 = false;
      fd_File_1046 = new File(Ion.JjLiLjljljIlILiLiJIlljIjjlIliIlIIjjJjLiJLjiIilJLIjLIJJJILLilJLJlIiiLJjljlJL, "IonExternal.jar");
      fd_File_1043 = new File(Ion.JjLiLjljljIlILiLiJIlljIjjlIliIlIIjjJjLiJLjiIilJLIjLIJJJILLilJLJlIiiLJjljlJL, "ion.lock");
   }

   public Class65() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }

   public static void check() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (!isLoaded()) {
         Class66.exit("Could not verify the integrity of Ion (3). Please report this bug in the Ion Discord");
      }

   }

   public static void shutdown() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_File_1043.delete();
      if (fd_Process_1042 != null) {
         Process var2 = fd_Process_1042;

         try {
            var2.destroy();
         } catch (Exception var1) {
         }
      }

   }

   public static void init() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = Class63.getOS();
      if (怀 == Class60_Enum.fd_Class60_Enum_1036 || 怀 == Class60_Enum.fd_Class60_Enum_1037) {
         fd_boolean_1045 = true;
      }

      sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.fd_boolean_1016 = fd_boolean_1045;
      fd_File_1044 = new File(FabricLoader.getInstance().getGameDir().toString(), "mods");
      if (!fd_File_1044.exists() || !fd_File_1044.canRead() || !fd_File_1044.canWrite()) {
         Class66.exit("Could not locate your minecraft folder! Report this bug in the Ion Discord.");
      }

      Ion.log("Mods folder found at " + fd_File_1044);
      fd_File_1048 = findIon(fd_File_1044.getPath());
      if (fd_File_1048 == null) {
         Class66.exit("Could not locate ion inside your minecraft folder! Report this bug in the Ion Discord.");
      }

      Ion.log("Ion found at " + fd_File_1048);
      setup();
   }

   public static boolean isLoaded() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return fd_Process_1042 == null ? false : fd_Process_1042.isAlive();
   }

   public static void setup() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (Class63.isBeingDebugged()) {
         Class66.exit("An external debugging tool was detected, please close them and re-launch Ion. If you believe this was a bug report it in the Ion discord.");
      }

      怀 怀 = Class65.class.getResourceAsStream("/assets/ion/IonExternal.jar");
      if (怀 == null) {
         Class66.exit("Could not verify the integrity of Ion (1). Please report this bug in the Ion Discord.");
      } else {
         FileOutputStream var7 = new FileOutputStream;
         FileOutputStream var10001 = var7;
         File var10002 = fd_File_1046;

         try {
            var10001.<init>(var10002);
            怀 怀 = var7;
            IOUtils.copy(怀, 怀);
         } catch (Exception var4) {
            Class66.exit("Could not verify the integrity of Ion (2). Please report this bug in the Ion Discord");
         }
      }

      fd_File_1043.mkdirs();
      if (fd_boolean_1045) {
         怀 怀 = new String[]{"chmod", "+x", getFormattedPath(fd_File_1046)};
         怀 怀 = new ProcessBuilder(怀);
         ProcessBuilder var8 = 怀;

         try {
            var8.start();
         } catch (Exception var3) {
            Class66.exit("Could not verify the integrity of Ion (5). Please report this bug in the Ion Discord.");
         }
      }

      startExternal();
      fd_ScheduledExecutorService_1047.scheduleAtFixedRate(Class65::check, 10L, 10L, TimeUnit.SECONDS);
      Runtime.getRuntime().addShutdownHook(new Thread(Class65::shutdown));
   }

   public static String getFormattedPath(File 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return "\"" + 怀.getPath() + "\"";
   }

   public static void logExternal(Process 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      BufferedReader 怀 = new BufferedReader(new InputStreamReader(怀.getInputStream()));

      while(true) {
         String 怀;
         boolean var10001;
         Exception var6;
         if ((怀 = 怀.readLine()) != null) {
            var10000 = 怀;

            try {
               Ion.log("[ExternalAuth] " + var10000);
               continue;
            } catch (Exception var3) {
               var6 = var3;
               var10001 = false;
            }
         } else {
            try {
               怀.close();
               Ion.log("[ExternalAuth] Shutdown");
               break;
            } catch (Exception var4) {
               var6 = var4;
               var10001 = false;
            }
         }

         怀 怀 = var6;
         Ion.log("logExternal error: " + 怀);
         break;
      }

   }
}
