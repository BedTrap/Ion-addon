/* Decompiler 36ms, total 223ms, lines 204 */
package me.ghosttypes.ion.modules.combat;

import java.util.Objects;
import me.ghosttypes.ion.modules.render.Notifications.mode;
import me.ghosttypes.ion.utils.Class68;
import me.ghosttypes.ion.utils.sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS;
import me.ghosttypes.ion.utils.player.Class44;
import me.ghosttypes.ion.utils.world.Class57;
import meteordevelopment.meteorclient.events.world.TickEvent.Pre;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.EnumSetting.Builder;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.systems.modules.world.Timer;
import meteordevelopment.meteorclient.utils.Utils;
import meteordevelopment.meteorclient.utils.player.FindItemResult;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.player.Rotations;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.item.BlockItem;
import net.minecraft.util.math.Direction;
import net.minecraft.network.packet.c2s.play.HandSwingC2SPacket;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos.class_2339;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.class_2829;

public class BurrowPlus extends Module {
   private final class_2339 fd_class_2339_268;
   private final Setting<BurrowPlus$BurrowMode> fd_Setting_269;
   private final Setting<Double> fd_Setting_270;
   private final Setting<Double> fd_Setting_271;
   private final Setting<Boolean> fd_Setting_272;
   private final SettingGroup fd_SettingGroup_273;
   private final Setting<Boolean> fd_Setting_274;
   private final Setting<Boolean> fd_Setting_275;
   private final Setting<Integer> fd_Setting_276;
   private final Setting<Boolean> fd_Setting_277;
   private final Setting<BurrowPlus$Block> qqQpQpqpqpP;
   private int fd_int_278;
   private final Setting<Boolean> fd_Setting_279;
   public final Setting<mode> fd_Setting_280;

   private boolean checkHead() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = 怀.mc.world.getBlockState(怀.fd_class_2339_268.set(怀.mc.player.getX() + 0.3D, 怀.mc.player.getY() + 2.3D, 怀.mc.player.getZ() + 0.3D));
      怀 怀 = 怀.mc.world.getBlockState(怀.fd_class_2339_268.set(怀.mc.player.getX() + 0.3D, 怀.mc.player.getY() + 2.3D, 怀.mc.player.getZ() - 0.3D));
      怀 怀 = 怀.mc.world.getBlockState(怀.fd_class_2339_268.set(怀.mc.player.getX() - 0.3D, 怀.mc.player.getY() + 2.3D, 怀.mc.player.getZ() - 0.3D));
      怀 怀 = 怀.mc.world.getBlockState(怀.fd_class_2339_268.set(怀.mc.player.getX() - 0.3D, 怀.mc.player.getY() + 2.3D, 怀.mc.player.getZ() + 0.3D));
      怀 怀 = 怀.getMaterial().isReplaceable();
      怀 怀 = 怀.getMaterial().isReplaceable();
      怀 怀 = 怀.getMaterial().isReplaceable();
      怀 怀 = 怀.getMaterial().isReplaceable();
      return 怀 & 怀 & 怀 & 怀;
   }

   private void doBurrow() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if ((Boolean)怀.fd_Setting_279.get()) {
         Rotations.rotate(Rotations.getYaw(怀.mc.player.getBlockPos()), Rotations.getPitch(怀.mc.player.getBlockPos()), 50, 怀::burrow);
      } else {
         怀.burrow();
      }

   }

   private boolean shouldBurrow() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return 怀.mc.world.getBlockState(怀.mc.player.getBlockPos()).getMaterial().isReplaceable();
   }

   public void onDeactivate() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      ((Timer)Modules.get().get(Timer.class)).setOverride(1.0D);
   }

   private void notify(String 怀) {
      // $FF: Couldn't be decompiled
   }

   private void burrow() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if ((Boolean)怀.fd_Setting_272.get()) {
         PlayerUtils.centerPlayer();
      }

      怀.mc.player.networkHandler.sendPacket(new class_2829(怀.mc.player.getX(), 怀.mc.player.getY() + 0.4D, 怀.mc.player.getZ(), true));
      怀.mc.player.networkHandler.sendPacket(new class_2829(怀.mc.player.getX(), 怀.mc.player.getY() + 0.75D, 怀.mc.player.getZ(), true));
      怀.mc.player.networkHandler.sendPacket(new class_2829(怀.mc.player.getX(), 怀.mc.player.getY() + 1.01D, 怀.mc.player.getZ(), true));
      怀.mc.player.networkHandler.sendPacket(new class_2829(怀.mc.player.getX(), 怀.mc.player.getY() + 1.15D, 怀.mc.player.getZ(), true));
      怀 怀 = 怀.getItem();
      if (怀.mc.player.getInventory().getStack(怀.slot()).getItem() instanceof BlockItem) {
         InvUtils.swap(怀.slot(), true);
         怀.mc.interactionManager.interactBlock(怀.mc.player, Hand.MAIN_HAND, new BlockHitResult(Utils.vec3d(怀.fd_class_2339_268), Direction.UP, 怀.fd_class_2339_268, false));
         怀.mc.player.networkHandler.sendPacket(new HandSwingC2SPacket(Hand.MAIN_HAND));
         InvUtils.swapBack();
         怀.mc.player.networkHandler.sendPacket(new class_2829(怀.mc.player.getX(), 怀.mc.player.getY() + (Double)怀.fd_Setting_270.get(), 怀.mc.player.getZ(), false));
      }
   }

   public BurrowPlus() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super(Class68.fd_Category_1060, "burrow-plus", "Easily.");
      怀.fd_SettingGroup_273 = 怀.settings.getDefaultGroup();
      怀.fd_Setting_269 = 怀.fd_SettingGroup_273.add(((Builder)((Builder)((Builder)(new Builder()).name("mode")).description("Which burrow mode to use.")).defaultValue(BurrowPlus$BurrowMode.sssSSSSSsSSSsssSsSsssssSSsSSSsSsSsSSSsssSsSSSSSsssSSSSSSSsSSsSSSSSSSSsssSssSSSSSsSssssSSsSSsSss)).build());
      怀.fd_Setting_276 = 怀.fd_SettingGroup_273.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("persist-delay")).description("Delay between re-burrowing.")).defaultValue(3)).min(1).sliderMax(10).visible(() -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         return 怀.fd_Setting_269.get() == BurrowPlus$BurrowMode.fd_BurrowMode_288;
      })).build());
      怀.qqQpQpqpqpP = 怀.fd_SettingGroup_273.add(((Builder)((Builder)((Builder)(new Builder()).name("block-to-use")).description("The block to use for Burrow.")).defaultValue(BurrowPlus$Block.fd_Block_284)).build());
      怀.fd_Setting_270 = 怀.fd_SettingGroup_273.add(((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)(new meteordevelopment.meteorclient.settings.DoubleSetting.Builder()).name("rubberband-height")).description("How far to attempt to cause rubberband.")).defaultValue(12.0D).sliderMin(-30.0D).sliderMax(30.0D).build());
      怀.fd_Setting_271 = 怀.fd_SettingGroup_273.add(((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)(new meteordevelopment.meteorclient.settings.DoubleSetting.Builder()).name("timer")).description("Timer override.")).defaultValue(1.0D).min(0.01D).sliderMax(10.0D).build());
      怀.fd_Setting_274 = 怀.fd_SettingGroup_273.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("auto-surround")).description("Turn on surround before burrowing.")).defaultValue(false)).build());
      SettingGroup var10001 = 怀.fd_SettingGroup_273;
      meteordevelopment.meteorclient.settings.BoolSetting.Builder var10002 = (meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("toggle-after")).description("Turn surround off after you are surrounded.")).defaultValue(false);
      Setting var10003 = 怀.fd_Setting_274;
      Objects.requireNonNull(var10003);
      怀.fd_Setting_275 = var10001.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)var10002.visible(var10003::get)).build());
      怀.fd_Setting_277 = 怀.fd_SettingGroup_273.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("only-in-holes")).description("Stops you from burrowing when not in a hole.")).defaultValue(false)).build());
      怀.fd_Setting_272 = 怀.fd_SettingGroup_273.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("center")).description("Centers you to the middle of the block before burrowing.")).defaultValue(true)).build());
      怀.fd_Setting_279 = 怀.fd_SettingGroup_273.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("rotate")).description("Faces the block you place server-side.")).defaultValue(true)).build());
      怀.fd_Setting_280 = 怀.fd_SettingGroup_273.add(((Builder)((Builder)((Builder)(new Builder()).name("notification-mode")).description("How notifications are displayed.")).defaultValue(mode.fd_mode_881)).build());
      怀.fd_class_2339_268 = new class_2339();
   }

   @EventHandler
   private void onTick(Pre 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = (SurroundPlus)Modules.get().get(SurroundPlus.class);
      if (怀.shouldBurrow()) {
         if (!怀.mc.player.isOnGround()) {
            怀.toggle();
            return;
         }

         if ((Boolean)怀.fd_Setting_274.get()) {
            if (!Class57.isArrayComplete(Class44.getSurroundBlocks(怀.mc.player))) {
               if (!怀.isActive()) {
                  怀.toggle();
               }

               return;
            }

            if (怀.isActive() && (Boolean)怀.fd_Setting_275.get()) {
               怀.toggle();
            }
         }

         if (怀.fd_Setting_269.get() == BurrowPlus$BurrowMode.fd_BurrowMode_288) {
            if (怀.fd_int_278 <= 0) {
               怀.doBurrow();
               怀.fd_int_278 = (Integer)怀.fd_Setting_276.get();
            } else {
               --怀.fd_int_278;
            }
         } else {
            怀.doBurrow();
            怀.toggle();
         }
      } else {
         怀.fd_class_2339_268.set(怀.mc.player.getBlockPos());
      }

   }

   private FindItemResult getItem() {
      // $FF: Couldn't be decompiled
   }

   public void onActivate() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀.fd_int_278 = 0;
      if (!怀.mc.world.getBlockState(怀.mc.player.getBlockPos()).getMaterial().isReplaceable()) {
         if (怀.fd_Setting_269.get() != BurrowPlus$BurrowMode.fd_BurrowMode_288) {
            怀.error("You are already burrowed.", new Object[0]);
            怀.toggle();
            return;
         }

         怀.fd_int_278 = (Integer)怀.fd_Setting_276.get();
      }

      if (!sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.isInHole(怀.mc.player) && (Boolean)怀.fd_Setting_277.get()) {
         怀.error("You are not in a hole.", new Object[0]);
         怀.toggle();
      } else if (!怀.checkHead()) {
         怀.error("You have blocks too close to your head, cannot burrow.", new Object[0]);
         怀.toggle();
      } else {
         怀 怀 = 怀.getItem();
         if (!怀.isHotbar() && !怀.isOffhand()) {
            怀.error("No burrow block found.", new Object[0]);
            怀.toggle();
         } else {
            怀.fd_class_2339_268.set(怀.mc.player.getBlockPos());
            ((Timer)Modules.get().get(Timer.class)).setOverride((Double)怀.fd_Setting_271.get());
         }
      }
   }
}
