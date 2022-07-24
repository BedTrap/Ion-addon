/* Decompiler 32ms, total 207ms, lines 138 */
package me.ghosttypes.ion.modules.combat;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.ghosttypes.ion.modules.render.Notifications.mode;
import me.ghosttypes.ion.utils.Class68;
import me.ghosttypes.ion.utils.combat.Class11;
import me.ghosttypes.ion.utils.player.Class44;
import me.ghosttypes.ion.utils.world.Class57;
import me.ghosttypes.ion.utils.world.Class66;
import meteordevelopment.meteorclient.events.world.TickEvent.Pre;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.BlockListSetting.Builder;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.entity.SortPriority;
import meteordevelopment.meteorclient.utils.entity.TargetUtils;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Items;
import net.minecraft.block.Block;
import net.minecraft.block.AbstractButtonBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.block.PressurePlateBlock;

public class SurroundBuster extends Module {
   private final SettingGroup fd_SettingGroup_347;
   private final Setting<SurroundBuster$MineMode> fd_Setting_348;
   boolean fd_boolean_349;
   private final Setting<Boolean> fd_Setting_350;
   int fd_int_351;
   private final Setting<Integer> fd_Setting_352;
   private final Setting<Boolean> fd_Setting_353;
   boolean fd_boolean_354;
   private final Setting<mode> fd_Setting_355;
   int fd_int_356;
   private final Setting<Integer> fd_Setting_357;
   private final Setting<Integer> ssssSsSssSSssSSsssssSsSSssssSssSSSsSsSSssss;
   private final Setting<Integer> fd_Setting_358;
   BlockPos fd_BlockPos_359;
   private final Setting<Integer> fd_Setting_360;
   private final Setting<Boolean> fd_Setting_361;
   PlayerEntity fd_PlayerEntity_362;
   private final Setting<List<Block>> fd_Setting_363;
   int qqQppQQQQqqqPPpPpQQPpQqPqq;

   @EventHandler
   private void onTick(Pre 怀) {
      // $FF: Couldn't be decompiled
   }

   public SurroundBuster() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super(Class68.fd_Category_1060, "surround-buster", "Try to prevent a target from re-surrounding by placing string next to them.");
      怀.fd_SettingGroup_347 = 怀.settings.getDefaultGroup();
      怀.fd_Setting_363 = 怀.fd_SettingGroup_347.add(((Builder)((Builder)((Builder)(new Builder()).name("block")).description("What blocks to use.")).defaultValue(Collections.singletonList(((BlockItem)Items.STRING).getBlock()))).filter(怀::blockFilter).build());
      怀.fd_Setting_350 = 怀.fd_SettingGroup_347.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("toggle-off")).description("Toggle off after placement.")).defaultValue(true)).build());
      怀.fd_Setting_357 = 怀.fd_SettingGroup_347.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("toggle-delay")).description("How long to wait before toggling.")).defaultValue(10)).min(1).sliderMax(50).build());
      怀.fd_Setting_353 = 怀.fd_SettingGroup_347.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("break-after")).description("Break the string after placement.")).defaultValue(true)).build());
      怀.ssssSsSssSSssSSsssssSsSSssssSssSSSsSsSSssss = 怀.fd_SettingGroup_347.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("break-delay")).description("The delay between breaking the string.")).defaultValue(4)).min(1).sliderMax(20).build());
      怀.fd_Setting_348 = 怀.fd_SettingGroup_347.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("break-mode")).description("How to break the string.")).defaultValue(SurroundBuster$MineMode.fd_MineMode_366)).build());
      怀.fd_Setting_360 = 怀.fd_SettingGroup_347.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("range")).description("The max targeting range.")).defaultValue(5)).min(1).sliderMax(5).build());
      怀.fd_Setting_358 = 怀.fd_SettingGroup_347.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("delay")).description("The delay between placing string.")).defaultValue(1)).min(0).sliderMax(10).build());
      怀.fd_Setting_361 = 怀.fd_SettingGroup_347.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("rotate")).description("Rotate on block interactions.")).defaultValue(true)).build());
      怀.fd_Setting_352 = 怀.fd_SettingGroup_347.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("rotate-priority")).description("Rotation priority.")).defaultValue(50)).min(1).max(100).build());
      怀.fd_Setting_355 = 怀.fd_SettingGroup_347.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("notification-mode")).description("How notifications are displayed.")).defaultValue(mode.fd_mode_881)).build());
   }

   private void doRegularMine(BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (!怀.fd_boolean_349) {
         怀.fd_boolean_349 = true;
      }

      Class44.doRegularMine(怀, (Boolean)怀.fd_Setting_361.get(), (Integer)怀.fd_Setting_352.get());
   }

   private void doPacketMine(BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (!怀.fd_boolean_354) {
         怀.fd_boolean_354 = true;
         Class44.doPacketMine(怀, (Boolean)怀.fd_Setting_361.get(), (Integer)怀.fd_Setting_352.get());
      }
   }

   private BlockPos bustedPos(PlayerEntity 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = 怀.getBlockPos();
      Iterator var3 = Class44.fd_ArrayList_1009.iterator();

      BlockPos 怀;
      do {
         if (!var3.hasNext()) {
            return null;
         }

         怀 怀 = (Vec3d)var3.next();
         怀 = 怀.add(怀.x, 怀.y, 怀.z);
      } while(!怀.blockFilter(Class57.getBlock(怀)));

      return 怀;
   }

   private void notify(String 怀) {
      // $FF: Couldn't be decompiled
   }

   private boolean blockFilter(Block 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return 怀 == ((BlockItem)Items.STRING).getBlock() || 怀 instanceof AbstractButtonBlock || 怀 instanceof PressurePlateBlock;
   }

   public void onActivate() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      Class66.moduleAuth();
      怀.fd_int_356 = 0;
      怀.fd_int_351 = (Integer)怀.ssssSsSssSSssSSsssssSsSSssssSssSSSsSsSSssss.get();
      怀.qqQppQQQQqqqPPpPpQQPpQqPqq = (Integer)怀.fd_Setting_357.get();
      怀.fd_boolean_354 = false;
      怀.fd_BlockPos_359 = null;
   }

   public String getInfoString() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return 怀.fd_PlayerEntity_362 != null ? 怀.fd_PlayerEntity_362.getEntityName() : null;
   }

   private boolean shouldToggle() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = 怀.fd_boolean_349 || 怀.fd_boolean_354;
      return Class57.getBlock(怀.fd_BlockPos_359) != Block.getBlockFromItem(Items.STRING) && 怀;
   }
}
