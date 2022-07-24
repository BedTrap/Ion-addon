/* Decompiler 2ms, total 138ms, lines 36 */
package me.ghosttypes.ion.utils.misc;

import java.io.File;
import me.ghosttypes.ion.Ion;
import meteordevelopment.meteorclient.MeteorClient;
import org.apache.commons.io.FileUtils;

public class Class29 {
   public static boolean fd_boolean_967;
   public static File fd_File_968;

   public static void backup() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      File var2 = MeteorClient.FOLDER;
      File var10001 = fd_File_968;

      try {
         FileUtils.copyDirectory(var2, var10001);
      } catch (Exception var1) {
         Ion.log("Error backing up current settings: " + var1);
      }

   }

   static {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_File_968 = new File(Ion.fd_File_1, "backup");
      fd_boolean_967 = true;
   }

   public Class29() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }
}
