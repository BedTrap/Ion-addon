/* Decompiler 8ms, total 153ms, lines 89 */
package me.ghosttypes.ion.utils.stats;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import net.minecraft.entity.player.PlayerEntity;

public class Class55 {
   public static ArrayList<QqPpPQQQQpQppqPqPqpQqQqQpqPQQQqQQPQQQPpqQPpQQPPpPqQQPqPqQqQ> fd_ArrayList_1030;
   public static ScheduledExecutorService fd_ScheduledExecutorService_1031;

   public static QqPpPQQQQpQppqPqPqpQqQqQpqPQQQqQQPQQQPpqQPpQQPPpPqQQPqPqQqQ getDeathInstanceByName(String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      Iterator var1 = fd_ArrayList_1030.iterator();

      QqPpPQQQQpQppqPqPqpQqQqQpqPQQQqQQPQQQPpqQPpQQPPpPqQQPqPqQqQ 怀;
      do {
         if (!var1.hasNext()) {
            return null;
         }

         怀 = (QqPpPQQQQpQppqPqPqpQqQqQpqPQQQqQQPQQQPpqQPpQQPPpPqQQPqPqQqQ)var1.next();
      } while(!怀.fd_PlayerEntity_1026.getEntityName().equals(怀));

      return 怀;
   }

   public static void init() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_ScheduledExecutorService_1031.scheduleAtFixedRate(Class55::trackDeaths, 10L, 5L, TimeUnit.SECONDS);
   }

   static {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_ScheduledExecutorService_1031 = Executors.newScheduledThreadPool(1);
      fd_ArrayList_1030 = new ArrayList();
   }

   public static void shutdown() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_ScheduledExecutorService_1031.shutdown();
   }

   public static void trackDeaths() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (!fd_ArrayList_1030.isEmpty()) {
         怀 怀 = new ArrayList();
         Iterator var1 = fd_ArrayList_1030.iterator();

         while(var1.hasNext()) {
            怀 怀 = (QqPpPQQQQpQppqPqPqpQqQqQpqPQQQqQQPQQQPpqQPpQQPPpPqQQPqPqQqQ)var1.next();
            --怀.fd_int_1028;
            if (怀.fd_int_1028 <= 0) {
               怀.add(怀);
            }
         }

         怀.forEach((怀x) -> {
            String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
            fd_ArrayList_1030.remove(怀x);
         });
      }

   }

   public static QqPpPQQQQpQppqPqPqpQqQqQpqPQQQqQQPQQQPpqQPpQQPPpPqQQPqPqQqQ getDeathInstance(PlayerEntity 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      Iterator var1 = fd_ArrayList_1030.iterator();

      QqPpPQQQQpQppqPqPqpQqQqQpqPQQQqQQPQQQPpqQPpQQPPpPqQQPqPqQqQ 怀;
      do {
         if (!var1.hasNext()) {
            return null;
         }

         怀 = (QqPpPQQQQpQppqPqPqpQqQqQpqPQQQqQQPQQQPpqQPpQQPPpPqQQPqPqQqQ)var1.next();
      } while(!怀.fd_PlayerEntity_1026.equals(怀));

      return 怀;
   }

   public Class55() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }
}
