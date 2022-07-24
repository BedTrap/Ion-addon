/* Decompiler 2ms, total 140ms, lines 35 */
package me.ghosttypes.ion.utils.services;

import me.ghosttypes.ion.Ion;
import me.ghosttypes.ion.utils.qPpPqPqpQQPppQPqPqQpQPqqppQpQPQpPPQQpQQqPqPPPqqPQppqqpQpqPQqqPPQqQPqqPQqqqpqPpqPppQPqqPQpPppppPPQppPpqpqPqppppPpQqQQQpPPPqpPP;
import me.ghosttypes.ion.utils.stats.Class55;
import meteordevelopment.meteorclient.MeteorClient;

public class Class54 {
   public static void stopServices() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      Ion.log("Stopping services.");
      Class51.shutdown();
      Class52.shutdown();
      Class55.shutdown();
      MeteorClient.EVENT_BUS.unsubscribe(DeathManager.class);
      MeteorClient.EVENT_BUS.unsubscribe(Class53.class);
   }

   public static void startServices() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      Ion.log("Starting services.");
      Class51.init();
      Class52.init();
      qPpPqPqpQQPppQPqPqQpQPqqppQpQPQpPPQQpQQqPqPPPqqPQppqqpQpqPQqqPPQqQPqqPQqqqpqPpqPppQPqqPQpPppppPPQppPpqpqPqppppPpQqQQQpPPPqpPP.init();
      Class55.init();
      MeteorClient.EVENT_BUS.subscribe(DeathManager.class);
      MeteorClient.EVENT_BUS.subscribe(Class53.class);
   }

   public Class54() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }
}
