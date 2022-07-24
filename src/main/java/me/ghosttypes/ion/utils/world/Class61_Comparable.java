/* Decompiler 8ms, total 146ms, lines 68 */
package me.ghosttypes.ion.utils.world;

public class Class61_Comparable implements Comparable<Class61_Comparable> {
   private String fd_String_1038;

   public final String get() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return 怀.fd_String_1038;
   }

   public boolean equals(Object 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀 == 怀) {
         return true;
      } else if (怀 == null) {
         return false;
      } else if (怀.getClass() != 怀.getClass()) {
         return false;
      } else {
         return 怀.compareTo((Class61_Comparable)怀) == 0;
      }
   }

   public int compareTo(Class61_Comparable 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀 == null) {
         return 1;
      } else {
         怀 怀 = 怀.get().split("\\.");
         怀 怀 = 怀.get().split("\\.");
         怀 怀 = Math.max(怀.length, 怀.length);

         for(int 怀 = 0; 怀 < 怀; ++怀) {
            怀 怀 = 怀 < 怀.length ? Integer.parseInt(怀[怀]) : 0;
            怀 怀 = 怀 < 怀.length ? Integer.parseInt(怀[怀]) : 0;
            if (怀 < 怀) {
               return -1;
            }

            if (怀 > 怀) {
               return 1;
            }
         }

         return 0;
      }
   }

   public Class61_Comparable(String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
      if (怀 == null) {
         throw new IllegalArgumentException("Version can not be null");
      } else if (!怀.matches("[0-9]+(\\.[0-9]+)*")) {
         throw new IllegalArgumentException("Invalid version format");
      } else {
         怀.fd_String_1038 = 怀;
      }
   }

   // $FF: synthetic method
   // $FF: bridge method
   public int compareTo(Object var1) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return 怀.compareTo((Class61_Comparable)var1);
   }
}
