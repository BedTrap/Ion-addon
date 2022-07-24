/* Decompiler 12ms, total 150ms, lines 80 */
package me.ghosttypes.ion.utils.network;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

class Class34 {
   private final HashMap<String, Object> fd_HashMap_983;
   // $FF: synthetic field
   final Class38 fd_Class38_984;

   private Class34(Class38 var1) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀.fd_Class38_984 = var1;
      super();
      怀.fd_HashMap_983 = new HashMap();
   }

   private String quote(String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return "\"" + 怀 + "\"";
   }

   void put(String 怀, Object 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀 != null) {
         怀.fd_HashMap_983.put(怀, 怀);
      }

   }

   public String toString() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = new StringBuilder();
      怀 怀 = 怀.fd_HashMap_983.entrySet();
      怀.append("{");
      怀 怀 = 0;
      Iterator var4 = 怀.iterator();

      while(var4.hasNext()) {
         怀 怀 = (Entry)var4.next();
         怀 怀 = 怀.getValue();
         怀.append(怀.quote((String)怀.getKey())).append(":");
         if (怀 instanceof String) {
            怀.append(怀.quote(String.valueOf(怀)));
         } else if (怀 instanceof Integer) {
            怀.append(Integer.valueOf(String.valueOf(怀)));
         } else if (怀 instanceof Boolean) {
            怀.append(怀);
         } else if (怀 instanceof Class34) {
            怀.append(怀.toString());
         } else if (怀.getClass().isArray()) {
            怀.append("[");
            怀 怀 = Array.getLength(怀);

            for(int 怀 = 0; 怀 < 怀; ++怀) {
               StringBuilder var11 = 怀.append(Array.get(怀, 怀).toString());
               String var10001;
               if (怀 != 怀 - 1) {
                  var10001 = ",";
               } else {
                  byte[] var10 = new byte[0];
                  var10001 = new String(var10);
               }

               var11.append(var10001);
            }

            怀.append("]");
         }

         ++怀;
         怀.append(怀 == 怀.size() ? "}" : ",");
      }

      return 怀.toString();
   }
}
