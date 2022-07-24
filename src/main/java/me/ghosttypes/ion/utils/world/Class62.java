/* Decompiler 5ms, total 153ms, lines 66 */
package me.ghosttypes.ion.utils.world;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.systems.modules.Modules;

public class Class62 {
   public static ScheduledExecutorService ijIjlILLIjjlILJLijLLJlIJILLJlILJLiJjLJiiIlIiLJiILLLjLiLJJlllIJIjljIJilJjJLIlJIijILijJJIljilililijjLJlLlJ;
   public static String fd_String_1039;
   public static boolean fd_boolean_1040;

   public static void integrityCheck() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (Class66.fd_String_1057.isEmpty() || Class66.fd_String_1057.isBlank()) {
         copium1000("HWID was blank or empty.");
      }

      if (!Class66.sSssSSSssSsSssSSSsssSsSSSSsSsSSSSSSSSSsSsSsSSSsSsssssssSSSSsssSsSssSSsssSssSsSsssSSSsSssSSSsssSsssSssssSsssSSSSsss) {
         copium1000("Loader integrity check failed.");
      }

      if (!Class63.fd_boolean_1052) {
         copium1000("Authentication was not run.");
      }

   }

   public static void copium1000(String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (!Objects.equals(fd_String_1039, 怀)) {
         Class63.sendTamperEmbed(Class66.pQQQqqqqQppqpQpQPqPqqPPQQQpPQqpPPqPQPPPqqQQppQppQppqqPPqPqqppQPPPqPQPPqqpQqpPQPqQPpQPQPQqqPppPqQqppPQpppQqqPQqQPqPQpQP, 怀);
      }

      Modules.get().getAll().forEach((怀x) -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         怀x.settings.forEach((怀xx) -> {
            String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
            怀xx.forEach(Setting::reset);
         });
      });
      (new ArrayList(Modules.get().getActive())).forEach(Module::toggle);
   }

   public static void copiumDoser() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_boolean_1040 = true;
      ijIjlILLIjjlILJLijLLJlIJILLJlILJLiJjLJiiIlIiLJiILLLjLiLJJlllIJIjljIJilJjJLIlJIijILijJJIljilililijjLJlLlJ.scheduleAtFixedRate(Class62::integrityCheck, 5L, 1L, TimeUnit.MINUTES);
   }

   static {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      ijIjlILLIjjlILJLijLLJlIJILLJlILJLiJjLJiiIlIiLJiILLLjLiLJJlllIJIjljIJilJjJLIlJIijILijJJIljilililijjLJlLlJ = Executors.newScheduledThreadPool(1);
      fd_boolean_1040 = false;
   }

   public Class62() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }
}
