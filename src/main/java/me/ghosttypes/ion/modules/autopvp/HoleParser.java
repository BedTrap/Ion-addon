/* Decompiler 14ms, total 151ms, lines 58 */
package me.ghosttypes.ion.modules.autopvp;

import java.util.Iterator;
import java.util.Random;
import me.ghosttypes.ion.utils.combat.pPpPPPqQQpQQqPQppQPQqPPQppQPQPQpQqPqqPpQPQPQPppQPPppQQqQQpQPqQpqPqpQqppqpQQqQpqpQQQpPpPPpQpppqpqQQPPQpqPp;
import meteordevelopment.meteorclient.MeteorClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;

public class HoleParser {
   public HoleParser() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }

   public static BlockPos getSafeHole(int 怀, int 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = pPpPPPqQQpQQqPQppQPQqPPQppQPQPQpQqPqqPpQPQPQPppQPPppQQqQQpQPqQpqPqpQqppqpQQqQpqpQQQpPpPPpQpppqpqQQPPQpqPp.getHoles(MeteorClient.mc.player.getBlockPos(), 怀, 怀);
      Iterator var3 = MeteorClient.mc.world.getPlayers().iterator();

      while(var3.hasNext()) {
         怀 怀 = (PlayerEntity)var3.next();
         怀.removeIf((怀x) -> {
            String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
            return 怀x.equals(怀.getBlockPos());
         });
      }

      怀.removeIf(pPpPPPqQQpQQqPQppQPQqPPQppQPQPQpQqPqqPpQPQPQPppQPPppQQqQQpQPqQpqPqpQqppqpQQqQpqpQQQpPpPPpQpppqpqQQPPQpqPp::isHoleObstructed);
      if (怀.isEmpty()) {
         return null;
      } else {
         return 怀.size() > 1 ? (BlockPos)怀.get((new Random()).nextInt(怀.size())) : (BlockPos)怀.get(0);
      }
   }

   public static BlockPos getHoleNearTarget(PlayerEntity 怀, int 怀, int 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = pPpPPPqQQpQQqPQppQPQqPPQppQPQPQpQqPqqPpQPQPQPppQPPppQQqQQpQPqQpqPqpQqppqpQQqQpqpQQQpPpPPpQpppqpqQQPPQpqPp.getHoles(怀.getBlockPos(), 怀, 怀);
      Iterator var4 = MeteorClient.mc.world.getPlayers().iterator();

      while(var4.hasNext()) {
         怀 怀 = (PlayerEntity)var4.next();
         怀.removeIf((怀x) -> {
            String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
            return 怀x.equals(怀.getBlockPos());
         });
      }

      怀.removeIf(pPpPPPqQQpQQqPQppQPQqPPQppQPQPQpQqPqqPpQPQPQPppQPPppQQqQQpQPqQpqPqpQqppqpQQqQpqpQQQpPpPPpQpppqpqQQPPQpqPp::isHoleObstructed);
      if (怀.isEmpty()) {
         return null;
      } else {
         return 怀.size() > 1 ? (BlockPos)怀.get((new Random()).nextInt(怀.size())) : (BlockPos)怀.get(0);
      }
   }
}
