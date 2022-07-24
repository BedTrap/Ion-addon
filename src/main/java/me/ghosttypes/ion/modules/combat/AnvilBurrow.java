/* Decompiler 10ms, total 197ms, lines 120 */
package me.ghosttypes.ion.modules.combat;

import me.ghosttypes.ion.utils.sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS;
import me.ghosttypes.ion.utils.player.Class46;
import me.ghosttypes.ion.utils.world.Class57;
import meteordevelopment.meteorclient.events.game.OpenScreenEvent;
import meteordevelopment.meteorclient.events.world.TickEvent.Pre;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.IntSetting.Builder;
import meteordevelopment.meteorclient.systems.modules.Categories;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.world.BlockUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.block.AnvilBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.client.gui.screen.ingame.AnvilScreen;

public class AnvilBurrow extends Module {
   private final Setting<Integer> fd_Setting_158;
   private final Setting<Boolean> sSSsssSSSsSSSSSSsSSSSsSSsssssSssssSsSSSSSSss;
   private final Setting<Boolean> fd_Setting_159;
   private int fd_int_160;
   private final Setting<Boolean> fd_Setting_161;
   private final SettingGroup fd_SettingGroup_162;
   private boolean fd_boolean_163;
   private final Setting<Boolean> fd_Setting_164;

   @EventHandler
   private void onOpenScreen(OpenScreenEvent 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀.screen instanceof AnvilScreen) {
         怀.cancel();
      }

   }

   public AnvilBurrow() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super(Categories.Combat, "anvil-burrow", "Burrow but with anvils.");
      怀.fd_SettingGroup_162 = 怀.settings.getDefaultGroup();
      怀.fd_Setting_158 = 怀.fd_SettingGroup_162.add(((Builder)((Builder)((Builder)(new Builder()).name("place-delay")).description("Delay between anvil placement.")).defaultValue(3)).min(1).sliderMax(10).build());
      怀.fd_Setting_161 = 怀.fd_SettingGroup_162.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("double-place")).description("Place at your feet and head.")).defaultValue(false)).build());
      怀.fd_Setting_159 = 怀.fd_SettingGroup_162.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("instant-double-place")).description("Place both anvils at once (this will override persist).")).defaultValue(false)).build());
      怀.sSSsssSSSsSSSSSSsSSSSsSSsssssSssssSsSSSSSSss = 怀.fd_SettingGroup_162.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("only-in-holes")).description("Only burrow in a hole.")).defaultValue(false)).build());
      怀.fd_Setting_164 = 怀.fd_SettingGroup_162.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("persist")).description("Replace mined anvils.")).defaultValue(false)).build());
   }

   private void placeAnvil(BlockPos 怀, boolean 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀) {
         BlockUtils.place(怀, Class46.findAnvil(), false, 0);
         BlockUtils.place(怀.up(1), Class46.findAnvil(), false, 0);
      } else {
         BlockUtils.place(怀, Class46.findAnvil(), false, 0);
      }

   }

   @EventHandler
   private void onTick(Pre 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if ((Boolean)怀.sSSsssSSSsSSSSSSsSSSSsSSsssssSssssSsSSSSSSss.get() && !sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.isInHole(怀.mc.player)) {
         怀.error("You're not in a hole!", new Object[0]);
         怀.toggle();
      } else {
         if (怀.isComplete()) {
            if ((Boolean)怀.fd_Setting_159.get()) {
               怀.fd_boolean_163 = true;
            }

            if (!(Boolean)怀.fd_Setting_164.get()) {
               怀.toggle();
               return;
            }
         }

         if ((Boolean)怀.fd_Setting_159.get()) {
            if (怀.fd_boolean_163) {
               怀.toggle();
            } else {
               怀.placeAnvil(怀.mc.player.getBlockPos().up(2), true);
            }

         } else {
            if (怀.fd_int_160 <= 0) {
               怀.fd_int_160 = (Integer)怀.fd_Setting_158.get();
               if (!(Class57.getBlock(怀.mc.player.getBlockPos()) instanceof AnvilBlock)) {
                  怀.placeAnvil(怀.mc.player.getBlockPos().up(2), false);
                  return;
               }

               if (!(Class57.getBlock(怀.mc.player.getBlockPos().up()) instanceof AnvilBlock) && (Boolean)怀.fd_Setting_161.get()) {
                  怀.placeAnvil(怀.mc.player.getBlockPos().up(2), false);
                  return;
               }
            } else {
               --怀.fd_int_160;
            }

         }
      }
   }

   private boolean isComplete() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (!(Boolean)怀.fd_Setting_161.get()) {
         return Class57.getBlock(怀.mc.player.getBlockPos()) instanceof AnvilBlock;
      } else {
         return Class57.getBlock(怀.mc.player.getBlockPos()) instanceof AnvilBlock && Class57.getBlock(怀.mc.player.getBlockPos().up()) instanceof AnvilBlock;
      }
   }

   public void onActivate() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀.fd_int_160 = 0;
      怀.fd_boolean_163 = false;
   }
}
