/* Decompiler 6ms, total 161ms, lines 62 */
package me.ghosttypes.ion.utils.world;

import net.minecraft.util.math.Direction;

// $FF: synthetic class
class Class58 {
   // $FF: synthetic field
   static final int[] fd_array_1032;

   static {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_array_1032 = new int[Direction.values().length];
      int[] var7 = fd_array_1032;
      Direction var10001 = Direction.UP;

      try {
         var7[var10001.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      var7 = fd_array_1032;
      var10001 = Direction.DOWN;

      try {
         var7[var10001.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      var7 = fd_array_1032;
      var10001 = Direction.EAST;

      try {
         var7[var10001.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      var7 = fd_array_1032;

      try {
         var7[Direction.WEST.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
      }

      var7 = fd_array_1032;
      var10001 = Direction.NORTH;

      try {
         var7[var10001.ordinal()] = 5;
      } catch (NoSuchFieldError var2) {
      }

      var7 = fd_array_1032;
      var10001 = Direction.SOUTH;

      try {
         var7[var10001.ordinal()] = 6;
      } catch (NoSuchFieldError var1) {
      }

   }
}
