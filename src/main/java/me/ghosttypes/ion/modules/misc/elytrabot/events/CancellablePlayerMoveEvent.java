/* Decompiler 2ms, total 303ms, lines 30 */
package me.ghosttypes.ion.modules.misc.elytrabot.events;

import meteordevelopment.meteorclient.events.Cancellable;
import net.minecraft.entity.MovementType;
import net.minecraft.util.math.Vec3d;

public class CancellablePlayerMoveEvent extends Cancellable {
   public Vec3d jLiLllLijlIlilLJiIJiliiiJLJLLliLIJLiLJIlljJJLI;
   public MovementType fd_MovementType_818;
   private static final CancellablePlayerMoveEvent fd_CancellablePlayerMoveEvent_819;

   static {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_CancellablePlayerMoveEvent_819 = new CancellablePlayerMoveEvent();
   }

   public CancellablePlayerMoveEvent() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }

   public static CancellablePlayerMoveEvent get(MovementType 怀, Vec3d 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_CancellablePlayerMoveEvent_819.setCancelled(false);
      fd_CancellablePlayerMoveEvent_819.fd_MovementType_818 = 怀;
      fd_CancellablePlayerMoveEvent_819.jLiLllLijlIlilLJiIJiliiiJLJLLliLIJLiLJIlljJJLI = 怀;
      return fd_CancellablePlayerMoveEvent_819;
   }
}
