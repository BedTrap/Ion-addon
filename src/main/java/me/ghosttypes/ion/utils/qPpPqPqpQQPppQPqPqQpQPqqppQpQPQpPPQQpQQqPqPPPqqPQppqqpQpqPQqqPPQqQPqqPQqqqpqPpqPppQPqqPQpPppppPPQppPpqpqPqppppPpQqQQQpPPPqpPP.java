/* Decompiler 14ms, total 157ms, lines 49 */
package me.ghosttypes.ion.utils;

import java.util.ArrayList;
import me.ghosttypes.ion.utils.misc.Class20;

public class qPpPqPqpQQPppQPqPqQpQPqqppQpQPQpPPQQpQQqPqPPPqqPQppqqpQpqPQqqPPQqQPqqPQqqqpqPpqPppQPqqPQpPppppPPQppPpqpqPqppppPpQqQQQpPPPqpPP {
   public static ArrayList<Class69> fd_ArrayList_1013;
   public static ArrayList<Class69> fd_ArrayList_1014;

   public static void init() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_ArrayList_1013 = new ArrayList();
      fd_ArrayList_1014 = new ArrayList();
   }

   public static void updateQueue() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_ArrayList_1013.forEach(qPpPqPqpQQPppQPqPqQpQPqqppQpQPQpPPQQpQQqPqPPPqqPQppqqpQpqPQqqPPQqQPqqPQqqqpqPpqPppQPqqPQpPppppPPQppPpqpqPqppppPpQqQQQpPPPqpPP::checkEz);
      fd_ArrayList_1014.forEach((怀) -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         fd_ArrayList_1013.remove(怀);
      });
   }

   public static void checkEz(Class69 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀.tick();
      if (怀.fd_int_1063 <= 0) {
         fd_ArrayList_1014.add(怀);
         sendEz(怀);
      }

   }

   public qPpPqPqpQQPppQPqPqQpQPqqppQpQPQpPPQQpQQqPqPPPqqPQppqqpQpqPQqqPPQqQPqqPQqqqpqPpqPppQPqqPQpPppppPPQppPpqpqPqppppPpQqQQQpPPPqpPP() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }

   public static void sendEz(Class69 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.sendMessage(怀.fd_String_1064);
      if (怀.fd_boolean_1065) {
         sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.messagePlayer(怀.fd_String_1066, Class20.stripName(怀.fd_String_1066, 怀.fd_String_1064));
      }

   }
}
