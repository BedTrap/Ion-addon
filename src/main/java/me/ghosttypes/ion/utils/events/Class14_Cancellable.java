/* Decompiler 4ms, total 160ms, lines 30 */
package me.ghosttypes.ion.utils.events;

import meteordevelopment.meteorclient.events.Cancellable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

public class Class14_Cancellable extends Cancellable {
   public Direction fd_Direction_900;
   private static final Class14_Cancellable fd_Class14_Cancellable_901;
   public BlockPos fd_BlockPos_902;

   public Class14_Cancellable() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }

   static {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_Class14_Cancellable_901 = new Class14_Cancellable();
   }

   public static Class14_Cancellable get(BlockPos 怀, Direction 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_Class14_Cancellable_901.setCancelled(false);
      fd_Class14_Cancellable_901.fd_BlockPos_902 = 怀;
      fd_Class14_Cancellable_901.fd_Direction_900 = 怀;
      return fd_Class14_Cancellable_901;
   }
}
