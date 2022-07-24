/* Decompiler 13ms, total 169ms, lines 116 */
package me.ghosttypes.ion.modules.combat;

import me.ghosttypes.ion.modules.render.Notifications.mode;
import me.ghosttypes.ion.utils.Class68;
import me.ghosttypes.ion.utils.sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS;
import me.ghosttypes.ion.utils.player.Class44;
import me.ghosttypes.ion.utils.player.Class46;
import me.ghosttypes.ion.utils.world.Class66;
import meteordevelopment.meteorclient.events.world.TickEvent.Pre;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.DoubleSetting.Builder;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.entity.SortPriority;
import meteordevelopment.meteorclient.utils.entity.TargetUtils;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.meteorclient.utils.world.BlockUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.AbstractPressurePlateBlock;
import net.minecraft.block.Block;
import net.minecraft.block.AbstractButtonBlock;

public class BurrowBreaker extends Module {
   private final Setting<Double> fd_Setting_256;
   private final Setting<Boolean> fd_Setting_257;
   private final Setting<Integer> fd_Setting_258;
   private final Setting<Boolean> fd_Setting_259;
   private boolean fd_boolean_260;
   private boolean fd_boolean_261;
   private final Setting<Boolean> fd_Setting_262;
   private final Setting<mode> fd_Setting_263;
   private boolean fd_boolean_264;
   private PlayerEntity fd_PlayerEntity_265;
   private final SettingGroup fd_SettingGroup_266;

   public void onActivate() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      Class66.moduleAuth();
      怀.fd_PlayerEntity_265 = null;
      怀.fd_boolean_264 = false;
      怀.fd_boolean_261 = false;
      怀.fd_boolean_260 = false;
   }

   public BurrowBreaker() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super(Class68.fd_Category_1060, "burrow-breaker", "Automatically destroy target's burrow block.");
      怀.fd_SettingGroup_266 = 怀.settings.getDefaultGroup();
      怀.fd_Setting_256 = 怀.fd_SettingGroup_266.add(((Builder)((Builder)(new Builder()).name("range")).description("Max targeting range.")).defaultValue(4.0D).min(0.0D).sliderMax(5.0D).build());
      怀.fd_Setting_262 = 怀.fd_SettingGroup_266.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("rotate")).description("Face the burrow block while mining.")).defaultValue(true)).build());
      怀.fd_Setting_258 = 怀.fd_SettingGroup_266.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("rotate-priority")).description("Rotation priority.")).defaultValue(50)).min(1).max(100).build());
      怀.fd_Setting_259 = 怀.fd_SettingGroup_266.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("packet-mine")).description("Hide mining progress on the target block.")).defaultValue(true)).build());
      怀.fd_Setting_257 = 怀.fd_SettingGroup_266.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("prevent-after")).description("Prevent the target from placing another burrow block in their current hole.")).defaultValue(false)).build());
      怀.fd_Setting_263 = 怀.fd_SettingGroup_266.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("notification-mode")).description("How notifications are displayed.")).defaultValue(mode.fd_mode_881)).build());
   }

   @EventHandler
   private void onTick(Pre 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = Class46.findPick();
      if (!怀.found()) {
         怀.notify("No pickaxe in hotbar!");
         怀.toggle();
      } else if (怀.fd_PlayerEntity_265 == null && TargetUtils.getPlayerTarget((Double)怀.fd_Setting_256.get(), SortPriority.LowestDistance) == null) {
         怀.notify("No burrowed targets in range!");
         怀.toggle();
      } else {
         怀.fd_PlayerEntity_265 = TargetUtils.getPlayerTarget((Double)怀.fd_Setting_256.get(), SortPriority.LowestDistance);
         if (怀.fd_PlayerEntity_265 != null) {
            if (Class44.isBurrowed(怀.fd_PlayerEntity_265, true)) {
               怀.fd_boolean_260 = true;
               怀 怀 = 怀.fd_PlayerEntity_265.getBlockPos();
               if (!怀.fd_boolean_261) {
                  怀.notify("Breaking " + 怀.fd_PlayerEntity_265.getEntityName() + "'s burrow!");
                  怀.fd_boolean_261 = true;
               }

               sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.updateSlot(怀.slot());
               if ((Boolean)怀.fd_Setting_259.get() && !怀.fd_boolean_264) {
                  Class44.doPacketMine(怀, (Boolean)怀.fd_Setting_262.get(), (Integer)怀.fd_Setting_258.get());
                  怀.fd_boolean_264 = true;
               } else {
                  Class44.doRegularMine(怀, (Boolean)怀.fd_Setting_262.get(), (Integer)怀.fd_Setting_258.get());
               }

            } else {
               if (!Class44.isBurrowed(怀.fd_PlayerEntity_265, true) && 怀.fd_boolean_260) {
                  怀.notify("Broke " + 怀.fd_PlayerEntity_265.getEntityName() + "'s burrow!");
                  if ((Boolean)怀.fd_Setting_257.get()) {
                     怀 怀 = InvUtils.findInHotbar((怀x) -> {
                        String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
                        return Block.getBlockFromItem(怀x.getItem()) instanceof AbstractPressurePlateBlock || Block.getBlockFromItem(怀x.getItem()) instanceof AbstractButtonBlock;
                     });
                     if (!怀.found()) {
                        怀.notify("No buttons or plates in hotbar, cannot prevent re-burrow.");
                        怀.toggle();
                     }

                     BlockUtils.place(怀.fd_PlayerEntity_265.getBlockPos(), 怀, true, 0, false);
                     怀.notify("Blocked " + 怀.fd_PlayerEntity_265.getEntityName() + " from re-burrowing!");
                  }

                  怀.toggle();
               }

            }
         }
      }
   }

   private void notify(String 怀) {
      // $FF: Couldn't be decompiled
   }
}
