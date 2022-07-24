/* Decompiler 10ms, total 191ms, lines 96 */
package me.ghosttypes.ion.modules.misc.elytrabot.utils;

import meteordevelopment.meteorclient.MeteorClient;
import net.minecraft.util.math.Direction;

public enum DirectionUtil {
   fd_DirectionUtil_824,
   fd_DirectionUtil_825,
   fd_DirectionUtil_826,
   QqqPpqPPQqPPqQQqqPpqQPpppPQqQqpqQQPPQqpqqPqqqPpQQpQPppppQpPpp,
   fd_DirectionUtil_829,
   fd_DirectionUtil_830,
   fd_DirectionUtil_831,
   ssSSSsSSSSSsSSsssSSsSssSssSSsSSs;

   public String fd_String_827;
   private static Direction fd_Direction_828;

   static {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_DirectionUtil_826 = new DirectionUtil("XP", 0, "X-Plus");
      QqqPpqPPQqPPqQQqqPpqQPpppPQqQqpqQQPPQqpqqPqqqPpQQpQPppppQpPpp = new DirectionUtil("XM", 1, "X-Minus");
      fd_DirectionUtil_830 = new DirectionUtil("ZP", 2, "Z-Plus");
      fd_DirectionUtil_825 = new DirectionUtil("ZM", 3, "Z-Minus");
      fd_DirectionUtil_829 = new DirectionUtil("XP_ZP", 4, "X-Plus, Z-Plus");
      fd_DirectionUtil_824 = new DirectionUtil("XM_ZP", 5, "X-Minus, Z-Plus");
      fd_DirectionUtil_831 = new DirectionUtil("XM_ZM", 6, "X-Minus, Z-Minus");
      ssSSSsSSSSSsSSsssSSsSssSssSSsSSs = new DirectionUtil("XP_ZM", 7, "X-Plus, Z-Minus");
   }

   // $FF: synthetic method
   private static DirectionUtil[] $values() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return new DirectionUtil[]{fd_DirectionUtil_826, QqqPpqPPQqPPqQQqqPpqQPpppPQqQqpqQQPPQqpqqPqqqPpQQpQPppppQpPpp, fd_DirectionUtil_830, fd_DirectionUtil_825, fd_DirectionUtil_829, fd_DirectionUtil_824, fd_DirectionUtil_831, ssSSSsSSSSSsSSsssSSsSssSssSSsSSs};
   }

   public static DirectionUtil getDiagonalDirection() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = MeteorClient.mc.player.getHorizontalFacing();
      Direction var10001 = fd_Direction_828;
      double 怀;
      if (怀.equals(Direction.NORTH)) {
         怀 = getClosest(135.0D, -135.0D);
         return 怀 == -135.0D ? ssSSSsSSSSSsSSsssSSsSssSssSSsSSs : fd_DirectionUtil_831;
      } else {
         var10001 = fd_Direction_828;
         if (怀.equals(Direction.WEST)) {
            怀 = getClosest(135.0D, 45.0D);
            return 怀 == 135.0D ? fd_DirectionUtil_831 : fd_DirectionUtil_824;
         } else {
            var10001 = fd_Direction_828;
            if (怀.equals(Direction.EAST)) {
               怀 = getClosest(-45.0D, -135.0D);
               return 怀 == -135.0D ? ssSSSsSSSSSsSSsssSSsSssSssSSsSSs : fd_DirectionUtil_829;
            } else {
               怀 = getClosest(45.0D, -45.0D);
               return 怀 == 45.0D ? fd_DirectionUtil_824 : fd_DirectionUtil_829;
            }
         }
      }
   }

   private static double getClosest(double 怀, double 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = (double)MeteorClient.mc.player.getYaw();
      怀 = 怀 < -180.0D ? (怀 += 360.0D) : (怀 > 180.0D ? (怀 -= 360.0D) : 怀);
      return Math.abs(怀 - 怀) < Math.abs(怀 - 怀) ? 怀 : 怀;
   }

   private DirectionUtil(String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super(var1, var2);
      怀.fd_String_827 = 怀;
   }

   public static DirectionUtil getDirection() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = MeteorClient.mc.player.getHorizontalFacing();
      Direction var10001 = fd_Direction_828;
      DirectionUtil var1;
      if (怀 == Direction.NORTH) {
         var1 = fd_DirectionUtil_825;
      } else {
         var10001 = fd_Direction_828;
         if (怀 == Direction.WEST) {
            var1 = QqqPpqPPQqPPqQQqqPpqQPpppPQqQqpqQQPPQqpqqPqqqPpQQpQPppppQpPpp;
         } else {
            var10001 = fd_Direction_828;
            var1 = 怀 == Direction.SOUTH ? fd_DirectionUtil_830 : fd_DirectionUtil_826;
         }
      }

      return var1;
   }
}
