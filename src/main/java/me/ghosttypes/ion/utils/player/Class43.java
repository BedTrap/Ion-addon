/* Decompiler 7ms, total 147ms, lines 54 */
package me.ghosttypes.ion.utils.player;

import java.util.Iterator;
import me.ghosttypes.ion.modules.chat.PopCounter;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.systems.modules.Modules;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;

public class Class43 {
   public static boolean isHoldingGap() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return MeteorClient.mc.player.getMainHandStack().getItem() == Items.ENCHANTED_GOLDEN_APPLE;
   }

   public static int getPops(PlayerEntity 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = (PopCounter)Modules.get().get(PopCounter.class);
      if (!怀.isActive()) {
         return 0;
      } else {
         return !怀.fd_Object2IntMap_67.containsKey(怀.getUuid()) ? 0 : 怀.fd_Object2IntMap_67.getOrDefault(怀.getUuid(), 0);
      }
   }

   public static boolean isDead(PlayerEntity 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return !怀.isAlive() || 怀.isDead() || 怀.getHealth() <= 0.0F;
   }

   public Class43() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }

   public static PlayerEntity getPlayerByName(String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      Iterator var1 = MeteorClient.mc.world.getEntities().iterator();

      while(var1.hasNext()) {
         怀 怀 = (Entity)var1.next();
         if (怀 instanceof PlayerEntity) {
            怀 怀 = (PlayerEntity)怀;
            if (怀.getEntityName().equalsIgnoreCase(怀)) {
               return 怀;
            }
         }
      }

      return null;
   }
}
