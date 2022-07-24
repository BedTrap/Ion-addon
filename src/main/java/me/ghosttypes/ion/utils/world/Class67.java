/* Decompiler 4ms, total 174ms, lines 42 */
package me.ghosttypes.ion.utils.world;

import me.ghosttypes.ion.Ion;
import meteordevelopment.meteorclient.utils.network.Http;

public class Class67 {
   public Class67() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }

   public static void checkUpdate() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      Ion.log("Checking for an update...");
      怀 怀 = "https://pastebin.com/raw/iULANkuw";
      怀 怀 = Http.get(怀).sendString();
      if (怀 == null) {
         Ion.log("Failed to check the latest version.");
      } else if (!怀.isBlank() && !怀.isEmpty()) {
         byte[] var3 = new byte[0];
         怀 = 怀.replaceAll("\\s", new String(var3));
         if (needsUpdate(怀)) {
            Ion.log("Update v" + 怀 + " is available! Preparing to update...");
            Class65.startUpdate(怀);
         } else {
            Ion.log("You're on the latest version.");
         }
      } else {
         Ion.log("Failed to check the latest version");
      }

   }

   public static boolean needsUpdate(String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = new Class61_Comparable("1.4.2");
      怀 怀 = new Class61_Comparable(怀);
      怀 怀 = 怀.compareTo(怀);
      return 怀 < 0;
   }
}
