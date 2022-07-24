/* Decompiler 6ms, total 138ms, lines 78 */
package me.ghosttypes.ion.utils.misc;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import me.ghosttypes.ion.modules.chat.BurrowAlert;
import org.apache.commons.lang3.time.DurationFormatUtils;

public class Class30 {
   public static int fd_int_969;
   public static String fd_String_970;
   public static int fd_int_971;
   public static int fd_int_972;
   public static long ijLJJJLijLJLjiILJliLiJliiLLJJjiLllljJLlilJllLiLIlIlLjJiiJIIlIJLLLJIllljIJJljiJlLJJLJljiLlLj;
   public static long fd_long_973;
   public static int fd_int_974;
   public static ArrayList<String> fd_ArrayList_975;
   public static long fd_long_976;

   public static String getKD() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (fd_int_969 == 0) {
         return String.valueOf(fd_int_974);
      } else {
         怀 怀 = (double)(fd_int_974 / fd_int_969);
         怀 怀 = new DecimalFormat("#.##");
         怀.setRoundingMode(RoundingMode.CEILING);
         return 怀.format(怀);
      }
   }

   public static void addKill(String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_ArrayList_975.removeIf((怀x) -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         return 怀x.contains(怀);
      });
      fd_ArrayList_975.add(怀);
      if (fd_ArrayList_975.size() > 10) {
         fd_ArrayList_975.remove(0);
      }

   }

   public static String getPlayTime() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return DurationFormatUtils.formatDuration(System.currentTimeMillis() - fd_long_973, "HH:mm:ss");
   }

   public static void reset() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_int_974 = 0;
      fd_int_969 = 0;
      fd_int_972 = 0;
      fd_int_971 = 0;
      BurrowAlert.fd_List_47.clear();
   }

   public Class30() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }

   static {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_int_974 = 0;
      fd_int_969 = 0;
      fd_int_972 = 0;
      fd_int_971 = 0;
      fd_ArrayList_975 = new ArrayList();
      fd_long_976 = System.currentTimeMillis() / 1000L;
      fd_long_973 = System.currentTimeMillis();
      ijLJJJLijLJLjiILJliLiJliiLLJJjiLllljJLlilJllLiLIlIlLjJiiJIIlIJLLLJIllljIJJljiJlLJJLJljiLlLj = 0L;
      byte[] var1 = new byte[0];
      fd_String_970 = new String(var1);
   }
}
