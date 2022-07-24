/* Decompiler 23ms, total 163ms, lines 253 */
package me.ghosttypes.ion.utils.misc;

import com.google.common.net.UrlEscapers;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.CopyOption;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import me.ghosttypes.ion.Ion;
import meteordevelopment.meteorclient.MeteorClient;
import net.fabricmc.mapping.reader.v2.TinyV2Factory;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.Logger;

public class Class22 {
   private static final Logger fd_Logger_913;
   private static Map<String, String> fd_Map_914;
   private static final String fd_String_915;
   private static final String fd_String_916;
   private static final String[] fd_array_917;
   private static String ljilJLillliLlJJJjLJJJJjjIjIIliiJI;
   private static final File fd_File_918;

   public static String exactMap(String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = (String)fd_Map_914.get(怀);
      return 怀 == null ? 怀 : 怀;
   }

   private static String mapByRegex(String 怀, String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (fd_Map_914 == null) {
         return 怀;
      } else {
         怀 怀 = new String[]{怀};
         怀 怀 = 怀[0].contains("/");
         怀[0] = 怀[0].replaceAll("/", ".");
         怀 怀 = Pattern.compile(怀);
         Matcher 怀 = 怀.matcher(怀[0]);

         while(怀.find()) {
            怀 怀 = 怀.group(0);
            fd_Map_914.forEach((怀x, 怀xx) -> {
               String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
               if (怀x.contains(怀)) {
                  怀[0] = 怀[0].replace(怀x, 怀xx.replaceAll("\\$", "\\."));
                  怀[0] = 怀[0].replace(trimClassName(怀x), trimClassName(怀xx.replaceAll("\\$", "\\.")));
               }

            });
         }

         return 怀 ? 怀[0].replaceAll("\\.", "\\/") : 怀[0];
      }
   }

   static {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_String_916 = "https://meta.fabricmc.net/v2/versions/yarn/1.18";
      fd_String_915 = "1.18";
      fd_File_918 = new File(Ion.fd_File_1, "mappings-1.18.tiny");
      fd_array_917 = new String[]{"(net(\\.|\\/)minecraft(\\.|\\/))([a-z]+)?([a-ln-z]{5,}_\\d+|\\.|\\\\|\\$)+(?<!\\.|\\\\|[^0-9])", "class_\\d+", "method_\\d+", "field_\\d+"};
      fd_Logger_913 = Ion.fd_Logger_4;
      fd_Map_914 = null;
   }

   public Class22() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }

   public static String vaugeMap(String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      String[] var1 = fd_array_917;
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         怀 怀 = var1[var3];
         怀 = mapByRegex(怀, 怀);
      }

      return 怀;
   }

   private static void downloadAndCacheMappings() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_Logger_913.info("Downloading yarn " + ljilJLillliLlJJJjLJJJJjjIjIIliiJI + " deobfuscation mappings.");
      怀 怀 = new File(MeteorClient.FOLDER, "yarn-mappings.jar");
      怀 怀 = UrlEscapers.urlFragmentEscaper().escape(ljilJLillliLlJJJjLJJJJjjIjIIliiJI);
      怀 怀 = "https://maven.fabricmc.net/net/fabricmc/yarn/" + 怀 + "/yarn-" + 怀 + "-v2.jar";
      URL var9 = new URL(怀);
      File var10001 = 怀;

      try {
         FileUtils.copyURLToFile(var9, var10001);
      } catch (IOException var5) {
         fd_Logger_913.error("Failed to download mappings!", var5);
         return;
      }

      怀 怀 = FileSystems.newFileSystem(怀.toPath(), (ClassLoader)null);
      Path var10 = 怀.getPath("mappings/mappings.tiny");
      Path var11 = fd_File_918.toPath();
      CopyOption[] var10002 = new CopyOption[]{StandardCopyOption.REPLACE_EXISTING};

      try {
         try {
            Files.copy(var10, var11, var10002);
         } catch (Throwable var6) {
            if (怀 != null) {
               try {
                  怀.close();
               } catch (Throwable var4) {
                  var6.addSuppressed(var4);
               }
            }

            throw var6;
         }

         if (怀 != null) {
            怀.close();
         }
      } catch (IOException var7) {
         fd_Logger_913.error("Failed to extract mappings!", var7);
      }

      怀.delete();
   }

   private static String trimClassName(String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = 怀.lastIndexOf(46);
      if (怀 != -1) {
         怀 = 怀.substring(怀 + 1);
      }

      return 怀.replaceAll("\\$", ".");
   }

   private static void loadMappings() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (!fd_File_918.exists()) {
         fd_Logger_913.warn("Could not download mappings.");
      } else {
         怀 怀 = new HashMap();
         怀 怀 = Files.newBufferedReader(fd_File_918.toPath());
         BufferedReader var9 = 怀;
         Class31_TinyVisitor var10001 = new Class31_TinyVisitor(怀);

         label40: {
            try {
               TinyV2Factory.visit(var9, var10001);
            } catch (Throwable var7) {
               IOException var11;
               label37: {
                  Throwable var2 = var7;
                  boolean var13;
                  if (怀 != null) {
                     var9 = 怀;

                     try {
                        var9.close();
                     } catch (Throwable var6) {
                        Throwable var10 = var7;
                        Throwable var12 = var6;

                        try {
                           var10.addSuppressed(var12);
                        } catch (IOException var5) {
                           var11 = var5;
                           var13 = false;
                           break label37;
                        }
                     }
                  }

                  try {
                     throw var2;
                  } catch (IOException var4) {
                     var11 = var4;
                     var13 = false;
                  }
               }

               怀 怀 = var11;
               fd_Logger_913.error("Could not load mappings", 怀);
               break label40;
            }

            if (怀 != null) {
               怀.close();
            }
         }

         fd_Map_914 = 怀;
         fd_Logger_913.info(String.format("Successfully loaded yarn %s mappings.", ljilJLillliLlJJJjLJJJJjjIjIIliiJI));
      }
   }

   public static void init() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      ljilJLillliLlJJJjLJJJJjjIjIIliiJI = getLatestYarn();
      if (ljilJLillliLlJJJjLJJJJjjIjIIliiJI != null) {
         if (!fd_File_918.exists()) {
            downloadAndCacheMappings();
         }

         loadMappings();
      }
   }

   private static String getLatestYarn() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      byte[] var6 = new byte[0];
      怀 怀 = new String(var6);
      怀 怀 = new URL("https://meta.fabricmc.net/v2/versions/yarn/1.18");
      怀 怀 = 怀.openConnection();
      怀.connect();
      怀 怀 = (Class28[])(new Gson()).fromJson(new InputStreamReader((InputStream)怀.getContent()), Class28[].class);
      Stream var8 = Arrays.stream(怀);
      Comparator var10001 = Comparator.comparingInt((怀x) -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         return 怀x.fd_int_966;
      });

      try {
         怀 怀 = var8.max(var10001);
         if (怀.isPresent()) {
            怀 = ((Class28)怀.get()).fd_String_965;
         }
      } catch (IOException var7) {
         var7.printStackTrace();
      }

      return 怀;
   }
}
