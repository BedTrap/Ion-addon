/* Decompiler 9ms, total 143ms, lines 83 */
package me.ghosttypes.ion.utils.combat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.ghosttypes.ion.utils.player.Class44;
import me.ghosttypes.ion.utils.world.Class57;
import meteordevelopment.meteorclient.MeteorClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class pPpPPPqQQpQQqPQppQPQqPPQppQPQPQpQqPqqPpQPQPQPppQPPppQQqQQpQPqQpqPqpQqppqpQQqQpqpQQQpPpPPpQpppqpqQQPPQpqPp {
   public static BlockPos getHoleNearPlayer(PlayerEntity 怀, int 怀, int 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀 == null) {
         return null;
      } else {
         怀 怀 = getHoles(怀.getBlockPos(), 怀, 怀);
         怀.removeIf(pPpPPPqQQpQQqPQppQPQqPPQppQPQPQpQqPqqPpQPQPQPppQPPppQQqQQpQPqQpqPqpQqppqpQQqQpqpQQQpPpPPpQpppqpqQQPPQpqPp::isHoleObstructed);
         怀.removeIf((怀x) -> {
            String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
            return MeteorClient.mc.player.getBlockPos().equals(怀x);
         });
         return 怀.isEmpty() ? null : (BlockPos)怀.get(0);
      }
   }

   public static boolean isHoleObstructed(BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return Class57.getBlock(怀.up()) != Blocks.AIR || Class57.getBlock(怀.up(2)) != Blocks.AIR;
   }

   public static boolean isHole(BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      Iterator var1 = Class44.fd_ArrayList_1009.iterator();

      Vec3d 怀;
      do {
         if (!var1.hasNext()) {
            return true;
         }

         怀 = (Vec3d)var1.next();
      } while(Class57.getBlock(怀.add(怀.x, 怀.y, 怀.z)) != Blocks.AIR);

      return false;
   }

   public pPpPPPqQQpQQqPQppQPQqPPQppQPQPQpQqPqqPpQPQPQPppQPPppQQqQQpQPqQpqPqpQqppqpQQqQpqpQQQpPpPPpQpppqpqQQPPQpqPp() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }

   public static List<BlockPos> getHoles(BlockPos 怀, int 怀, int 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = new ArrayList();
      怀 怀 = Class57.getSphere(怀, 怀, 怀);
      怀.removeIf((怀x) -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         return Class57.getBlock(怀x) != Blocks.AIR;
      });
      怀.removeIf((怀x) -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         return Class57.getBlock(怀x.down()) == Blocks.AIR;
      });
      怀.removeIf((怀x) -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         return !isHole(怀x);
      });
      怀.removeIf((怀x) -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         return MeteorClient.mc.player.getBlockPos().equals(怀x);
      });
      if (!怀.isEmpty()) {
         怀.addAll(怀);
      }

      return 怀;
   }
}
