/* Decompiler 17ms, total 161ms, lines 38 */
package me.ghosttypes.ion.utils.misc;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Class20 {
   public static String stripName(String 怀, String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      byte[] var3 = new byte[0];
      return 怀.replace(怀, new String(var3));
   }

   public static String makeTS(Long 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(怀), TimeUnit.MILLISECONDS.toMinutes(怀) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(怀)), TimeUnit.MILLISECONDS.toSeconds(怀) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(怀)));
   }

   public static String randomizeCase(String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = new Random();
      怀 怀 = new StringBuilder(怀.length());
      char[] var3 = 怀.toCharArray();
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         怀 怀 = var3[var5];
         怀.append(怀.nextBoolean() ? Character.toLowerCase(怀) : Character.toUpperCase(怀));
      }

      return 怀.toString();
   }

   public Class20() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }
}
