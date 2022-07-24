/* Decompiler 5ms, total 148ms, lines 52 */
package me.ghosttypes.ion.utils.world;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import meteordevelopment.meteorclient.MeteorClient;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;

public class Class59 {
   public Class59() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }

   public static List<EndCrystalEntity> getNearbyCrystals(BlockPos 怀, int 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = new ArrayList();
      Iterator var3 = MeteorClient.mc.world.getEntities().iterator();

      while(var3.hasNext()) {
         怀 怀 = (Entity)var3.next();
         if (怀 instanceof EndCrystalEntity && Class57.distanceBetween(怀, 怀.getBlockPos()) <= (double)怀) {
            怀.add((EndCrystalEntity)怀);
         }
      }

      return 怀;
   }

   public static EndCrystalEntity getNearbyCrystal(BlockPos 怀, int 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = getNearbyCrystals(怀, 怀);
      if (怀 == null) {
         return null;
      } else {
         return 怀.isEmpty() ? null : (EndCrystalEntity)怀.get(0);
      }
   }

   public static void hitEntity(Entity 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀 != null) {
         MeteorClient.mc.player.networkHandler.sendPacket(PlayerInteractEntityC2SPacket.attack(怀, MeteorClient.mc.player.isSneaking()));
         MeteorClient.mc.player.swingHand(Hand.MAIN_HAND);
      }
   }
}
