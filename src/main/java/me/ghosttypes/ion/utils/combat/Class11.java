/* Decompiler 12ms, total 154ms, lines 164 */
package me.ghosttypes.ion.utils.combat;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import me.ghosttypes.ion.utils.sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS;
import me.ghosttypes.ion.utils.player.Class44;
import me.ghosttypes.ion.utils.player.Class46;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.systems.modules.combat.CrystalAura;
import meteordevelopment.meteorclient.utils.player.FindItemResult;
import net.minecraft.entity.effect.StatusEffectUtil;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.block.BlockState;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.tag.FluidTags;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.class_2847;

public class Class11 {
   public static boolean fd_boolean_897;
   public static Executor fd_Executor_898;
   public static boolean fd_boolean_899;

   static {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_Executor_898 = Executors.newCachedThreadPool();
      fd_boolean_899 = false;
      fd_boolean_897 = false;
   }

   public static void handlePostPacketMine(BlockPos 怀, FindItemResult 怀, long 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";

      try {
         Thread.sleep(怀);
      } catch (Exception var5) {
      }

      if (怀.found()) {
         if (怀.isHotbar()) {
            fd_boolean_899 = true;
            MeteorClient.mc.player.networkHandler.sendPacket(new UpdateSelectedSlotC2SPacket(怀.slot()));
            MeteorClient.mc.getNetworkHandler().sendPacket(new PlayerActionC2SPacket(class_2847.ABORT_DESTROY_BLOCK, 怀, Direction.UP));
            sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.swingHand(false);
            fd_boolean_899 = false;
         }
      }
   }

   public static double getBlockBreakingSpeed(int 怀, BlockState 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = (double)((ItemStack)MeteorClient.mc.player.getInventory().main.get(怀)).getMiningSpeedMultiplier(怀);
      if (怀 > 1.0D) {
         怀 怀 = MeteorClient.mc.player.getInventory().getStack(怀);
         怀 怀 = EnchantmentHelper.getLevel(Enchantments.EFFICIENCY, 怀);
         if (怀 > 0 && !怀.isEmpty()) {
            怀 += (double)(怀 * 怀 + 1);
         }
      }

      if (StatusEffectUtil.hasHaste(MeteorClient.mc.player)) {
         怀 *= (double)(1.0F + (float)(StatusEffectUtil.getHasteAmplifier(MeteorClient.mc.player) + 1) * 0.2F);
      }

      if (MeteorClient.mc.player.hasStatusEffect(StatusEffects.MINING_FATIGUE)) {
         float var7;
         switch(MeteorClient.mc.player.getStatusEffect(StatusEffects.MINING_FATIGUE).getAmplifier()) {
         case 0:
            var7 = 0.3F;
            break;
         case 1:
            var7 = 0.09F;
            break;
         case 2:
            var7 = 0.0027F;
            break;
         default:
            var7 = 8.1E-4F;
         }

         怀 怀 = var7;
         怀 *= (double)怀;
      }

      if (MeteorClient.mc.player.isSubmergedIn(FluidTags.WATER) && !EnchantmentHelper.hasAquaAffinity(MeteorClient.mc.player)) {
         怀 /= 5.0D;
      }

      if (!MeteorClient.mc.player.isOnGround()) {
         怀 /= 5.0D;
      }

      return 怀;
   }

   public static void syncSlot() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      MeteorClient.mc.getNetworkHandler().sendPacket(new UpdateSelectedSlotC2SPacket(MeteorClient.mc.player.getInventory().selectedSlot));
   }

   public Class11() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }

   public static void handleModules(boolean 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = (CrystalAura)Modules.get().get(CrystalAura.class);
      fd_boolean_897 = false;
      if (怀.isActive() && 怀) {
         fd_boolean_897 = true;
         怀.toggle();
      }

      if (!怀.isActive() && !怀 && fd_boolean_897) {
         怀.toggle();
      }

   }

   public static void handlePacketMine(BlockPos 怀, Class5_Enum 怀, boolean 怀, int 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = false;
      怀 怀 = 0L;
      怀 怀 = Class46.findPick();
      if (怀.found()) {
         怀 = true;
         怀 = (long)getBlockBreakingSpeed(怀.slot(), MeteorClient.mc.world.getBlockState(怀));
         怀 怀 = MeteorClient.mc.player.getInventory().selectedSlot;
         MeteorClient.mc.player.networkHandler.sendPacket(new UpdateSelectedSlotC2SPacket(怀.slot()));
         MeteorClient.mc.player.networkHandler.sendPacket(new UpdateSelectedSlotC2SPacket(怀));
      }

      if (怀 == Class5_Enum.fd_Class5_Enum_888) {
         Class44.doPacketMine(怀, 怀, 怀);
      }

      if (怀 == Class5_Enum.fd_Class5_Enum_889) {
         Class44.doPacketMine(怀, 怀, 怀);
         Class44.doPacketMine(怀, false, 0);
      }

      if (怀 == Class5_Enum.LjjilLjjjLiJIIJIijiIILIJliJIjLJLjIIIllJJJJLjLjIJjJLlJiJLIjJljJILiiiIJjjlLLjLjillLiLjjijjijLjLLLIjj) {
         Class44.doPacketMine(怀, 怀, 怀);
         Class44.doPacketMine(怀, false, 0);
         Class44.doPacketMine(怀, false, 0);
      }

      if (怀) {
         fd_Executor_898.execute(() -> {
            String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
            handlePostPacketMine(怀, 怀, 怀);
         });
      }

   }
}
