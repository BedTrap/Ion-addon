/* Decompiler 23ms, total 252ms, lines 72 */
package me.ghosttypes.ion.modules.combat.bedaura;

import me.ghosttypes.ion.utils.combat.Class11;
import me.ghosttypes.ion.utils.misc.Class19;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.systems.modules.combat.CrystalAura;
import meteordevelopment.meteorclient.utils.player.ChatUtils;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import net.minecraft.screen.CraftingScreenHandler;
import net.minecraft.util.math.BlockPos;

public class BedUtil2 {
   public static BlockPos LLijiiLLJjjJiJJiILlLLLJJLiIjllilIijlIJLLIljJLJJiJjiJIIi;
   public static BlockPos fd_BlockPos_587;

   public static boolean shouldPause(boolean 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = (BedAuraV3)Modules.get().get(BedAuraV3.class);
      怀 怀 = (Integer)怀.fd_Setting_525.get();
      怀 怀 = (Boolean)怀.fd_Setting_527.get();
      怀 怀 = (Boolean)怀.fd_Setting_564.get();
      怀 怀 = (Boolean)怀.fd_Setting_564.get();
      怀 怀 = (Boolean)怀.fd_Setting_571.get();
      怀 怀 = (Boolean)怀.fd_Setting_541.get();
      if (PlayerUtils.shouldPause(怀, 怀, 怀)) {
         if (怀) {
            ChatUtils.info("Pausing on mine/eat/drink", new Object[0]);
         }

         return true;
      } else if (怀 && ((CrystalAura)Modules.get().get(CrystalAura.class)).isActive()) {
         if (怀) {
            ChatUtils.info("Pausing on CA", new Object[0]);
         }

         return true;
      } else if (怀 && MeteorClient.mc.player.currentScreenHandler instanceof CraftingScreenHandler) {
         if (怀) {
            ChatUtils.info("Pausing on Crafting Screen", new Object[0]);
         }

         return true;
      } else if (Class11.fd_boolean_899) {
         if (怀) {
            ChatUtils.info("Pausing on MineHelper override", new Object[0]);
         }

         return true;
      } else if (Class19.beds() <= 怀) {
         if (怀) {
            ChatUtils.info("Pausing on minBeds", new Object[0]);
         }

         return true;
      } else {
         return false;
      }
   }

   public BedUtil2() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }

   static {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      LLijiiLLJjjJiJJiILlLLLJJLiIjllilIijlIJLLIljJLJJiJjiJIIi = null;
      fd_BlockPos_587 = null;
   }
}
