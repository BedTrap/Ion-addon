/* Decompiler 42ms, total 218ms, lines 226 */
package me.ghosttypes.ion.modules.combat;

import java.util.ArrayList;
import java.util.Iterator;
import me.ghosttypes.ion.modules.render.Notifications.mode;
import me.ghosttypes.ion.utils.Class68;
import me.ghosttypes.ion.utils.sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS;
import me.ghosttypes.ion.utils.combat.pPpPPPqQQpQQqPQppQPQqPPQppQPQPQpQqPqqPpQPQPQPppQPPppQQqQQpQPqQpqPqpQqppqpQQqQpqpQQQpPpPPpQpppqpqQQPPQpqPp;
import me.ghosttypes.ion.utils.player.Class43;
import me.ghosttypes.ion.utils.player.Class44;
import me.ghosttypes.ion.utils.player.Class46;
import me.ghosttypes.ion.utils.world.Class57;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent.Post;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.BoolSetting.Builder;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.entity.EntityUtils;
import meteordevelopment.meteorclient.utils.entity.SortPriority;
import meteordevelopment.meteorclient.utils.entity.TargetUtils;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.meteorclient.utils.world.BlockUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;

public class SmartHoleFill extends Module {
   private final SettingGroup fd_SettingGroup_319;
   private final Setting<Integer> fd_Setting_320;
   private final Setting<Boolean> fd_Setting_321;
   private final ArrayList<BlockPos> fd_ArrayList_322;
   private final Setting<Integer> fd_Setting_323;
   private final Setting<Integer> fd_Setting_324;
   private PlayerEntity fd_PlayerEntity_325;
   public final Setting<SettingColor> fd_Setting_326;
   public final Setting<ShapeMode> fd_Setting_327;
   private final SettingGroup fd_SettingGroup_328;
   private final Setting<Integer> fd_Setting_329;
   private final SettingGroup fd_SettingGroup_330;
   public final Setting<Boolean> SSssSssssSsSSsSssSSssSsSSsSsssSSSSsssSSSSSsSSsSsSsSsssSssSsSSSSsssssSSSsSSssSssssSSsSSssSSssssssSSSSSSSsSssSSSSSsssSs;
   private final Setting<Integer> fd_Setting_331;
   private final Setting<SmartHoleFill$CheckMode> fd_Setting_332;
   private final Setting<Integer> fd_Setting_333;
   private final SettingGroup fd_SettingGroup_334;
   private final Setting<mode> fd_Setting_335;
   private int fd_int_336;
   public final Setting<Boolean> fd_Setting_337;
   private final Setting<Integer> fd_Setting_338;
   public final Setting<SettingColor> sSsssSSsSsssSsSs;
   public final Setting<Boolean> qpQPPPppqpQqqpQqqPqPqppQppp;
   private final Setting<SortPriority> fd_Setting_339;
   private final Setting<Boolean> LLlLIlJLiJlijlJiLiiiJjLjiILIILIiJiljJiiILilJLjlIlijJjJIIiJjijLJlIIilJllljIlLljIJILJiljjiiLIjjJlIIliJiilillliI;
   public final Setting<Boolean> fd_Setting_340;
   public final Setting<Boolean> fd_Setting_341;

   @EventHandler
   private void onTick(Post 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = Class46.findObby();
      if (!怀.found()) {
         怀.error("No obby in hotbar!", new Object[0]);
         怀.toggle();
      } else {
         怀.fd_PlayerEntity_325 = TargetUtils.getPlayerTarget((double)(Integer)怀.fd_Setting_324.get(), (SortPriority)怀.fd_Setting_339.get());
         if (TargetUtils.isBadTarget(怀.fd_PlayerEntity_325, (double)(Integer)怀.fd_Setting_324.get())) {
            怀.fd_PlayerEntity_325 = TargetUtils.getPlayerTarget((double)(Integer)怀.fd_Setting_324.get(), (SortPriority)怀.fd_Setting_339.get());
         }

         if (怀.fd_PlayerEntity_325 == null) {
            怀.fd_ArrayList_322.clear();
         } else {
            if ((Boolean)怀.fd_Setting_321.get()) {
               怀.info("Checking pauses", new Object[0]);
            }

            if (!怀.shouldFill()) {
               if ((Boolean)怀.fd_Setting_321.get()) {
                  怀.info("ShouldFill is false", new Object[0]);
               }

            } else if (PlayerUtils.shouldPause((Boolean)怀.fd_Setting_337.get(), (Boolean)怀.SSssSssssSsSSsSssSSssSsSSsSsssSSSSsssSSSSSsSSsSsSsSsssSssSsSSSSsssssSSSsSSssSssssSSsSSssSSssssssSSSSSSSsSssSSSSSsssSs.get(), (Boolean)怀.qpQPPPppqpQqqpQqqPqPqppQppp.get())) {
               if ((Boolean)怀.fd_Setting_321.get()) {
                  怀.info("Pausing on mine/eat/drink", new Object[0]);
               }

            } else if (Class43.isHoldingGap() && (Boolean)怀.fd_Setting_341.get()) {
               if ((Boolean)怀.fd_Setting_321.get()) {
                  怀.info("Pausing on heldGap", new Object[0]);
               }

            } else {
               --怀.fd_int_336;
               if (怀.fd_int_336 <= 0) {
                  怀.fd_int_336 = (Integer)怀.fd_Setting_333.get();
                  if ((Boolean)怀.fd_Setting_321.get()) {
                     怀.info("Getting holes", new Object[0]);
                  }

                  怀 怀 = pPpPPPqQQpQQqPQppQPQqPPQppQPQPQpQqPqqPpQPQPQPppQPPppQQqQQpQPqQpqPqpQqppqpQQqQpqpQQQpPpPPpQpppqpqQQPPQpqPp.getHoles(怀.mc.player.getBlockPos(), (Integer)怀.fd_Setting_320.get(), (Integer)怀.fd_Setting_329.get());
                  if ((Boolean)怀.fd_Setting_321.get()) {
                     怀.info("Starting list size: " + 怀.size(), new Object[0]);
                  }

                  怀.removeIf((怀x) -> {
                     String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
                     return Class57.distanceBetween(怀.fd_PlayerEntity_325.getBlockPos(), 怀x) <= (double)(Integer)怀.fd_Setting_338.get();
                  });
                  if ((Boolean)怀.fd_Setting_321.get()) {
                     怀.info("List size after range check: " + 怀.size(), new Object[0]);
                  }

                  怀.fd_ArrayList_322.addAll(怀);
                  怀 怀 = 0;
                  Iterator var5 = 怀.iterator();

                  while(var5.hasNext()) {
                     怀 怀 = (BlockPos)var5.next();
                     BlockUtils.place(怀, 怀, (Boolean)怀.LLlLIlJLiJlijlJiLiiiJjLjiILIILIiJiljJiiILilJLjlIlijJjJIIiJjijLJlIIilJllljIlLljIJILJiljjiiLIjjJlIIliJiilillliI.get(), (Integer)怀.fd_Setting_323.get(), true);
                     怀.fd_ArrayList_322.removeIf((怀x) -> {
                        String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
                        return Class57.getBlock(怀x) != Blocks.AIR;
                     });
                     ++怀;
                     if (怀 >= (Integer)怀.fd_Setting_331.get()) {
                        break;
                     }
                  }
               }

            }
         }
      }
   }

   @EventHandler
   private void onRender(Render3DEvent 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if ((Boolean)怀.fd_Setting_340.get()) {
         怀.fd_ArrayList_322.removeIf((怀x) -> {
            String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
            return Class57.getBlock(怀x) != Blocks.AIR;
         });
         怀.fd_ArrayList_322.forEach((怀x) -> {
            String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
            怀.renderer.box(怀x, (Color)怀xx.fd_Setting_326.get(), (Color)怀xx.sSsssSSsSsssSsSs.get(), (ShapeMode)怀xx.fd_Setting_327.get(), 0);
         });
      }

   }

   public String getInfoString() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return EntityUtils.getName(怀.fd_PlayerEntity_325);
   }

   private boolean shouldFill() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if ((Boolean)怀.fd_Setting_321.get()) {
         怀.info("Checking should fill", new Object[0]);
      }

      怀 怀 = (SmartHoleFill$CheckMode)怀.fd_Setting_332.get();
      if (怀 == SmartHoleFill$CheckMode.fd_CheckMode_345) {
         if ((Boolean)怀.fd_Setting_321.get()) {
            怀.info("Checking mode either", new Object[0]);
         }

         if (sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.isInHole(怀.mc.player) || Class44.isBurrowed(怀.mc.player, false)) {
            return true;
         }
      }

      if (怀 == SmartHoleFill$CheckMode.fd_CheckMode_343) {
         if ((Boolean)怀.fd_Setting_321.get()) {
            怀.info("Checking mode burrowed", new Object[0]);
         }

         return Class44.isBurrowed(怀.mc.player, false);
      } else if (怀 == SmartHoleFill$CheckMode.fd_CheckMode_342) {
         if ((Boolean)怀.fd_Setting_321.get()) {
            怀.info("Checking mode inHole", new Object[0]);
         }

         return sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.isInHole(怀.mc.player);
      } else {
         return false;
      }
   }

   public SmartHoleFill() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super(Class68.fd_Category_1060, "smart-holefill", "Hole fill but smart");
      怀.fd_SettingGroup_319 = 怀.settings.getDefaultGroup();
      怀.fd_SettingGroup_330 = 怀.settings.createGroup("Ranges");
      怀.fd_SettingGroup_334 = 怀.settings.createGroup("Pause");
      怀.fd_SettingGroup_328 = 怀.settings.createGroup("Pause");
      怀.fd_Setting_321 = 怀.fd_SettingGroup_319.add(((Builder)((Builder)(new Builder()).name("debug")).defaultValue(false)).build());
      怀.fd_Setting_332 = 怀.fd_SettingGroup_319.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("fill-mode")).description("When to fill holes.")).defaultValue(SmartHoleFill$CheckMode.fd_CheckMode_345)).build());
      怀.fd_Setting_333 = 怀.fd_SettingGroup_319.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("fill-delay")).description("Delay between filling holes.")).defaultValue(1)).min(0).sliderMax(10).build());
      怀.fd_Setting_331 = 怀.fd_SettingGroup_319.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("holes-per-tick")).description("How many holes to fill per tick.")).defaultValue(3)).min(0).sliderMax(10).build());
      怀.fd_Setting_324 = 怀.fd_SettingGroup_319.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("target-range")).description("How far to target players from.")).defaultValue(4)).min(1).sliderMax(10).build());
      怀.fd_Setting_339 = 怀.fd_SettingGroup_319.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("target-priority")).description("How to select the player to target.")).defaultValue(SortPriority.LowestHealth)).build());
      怀.LLlLIlJLiJlijlJiLiiiJjLjiILIILIiJiljJiiILilJLjlIlijJjJIIiJjijLJlIIilJllljIlLljIJILJiljjiiLIjjJlIIliJiilillliI = 怀.fd_SettingGroup_319.add(((Builder)((Builder)(new Builder()).name("rotate")).defaultValue(true)).build());
      怀.fd_Setting_323 = 怀.fd_SettingGroup_319.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("rotate-priority")).defaultValue(50)).min(1).sliderMax(100).build());
      怀.fd_Setting_320 = 怀.fd_SettingGroup_330.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("self-range-horizontal")).description("Horizontal place range.")).defaultValue(4)).min(0).sliderMax(10).build());
      怀.fd_Setting_329 = 怀.fd_SettingGroup_330.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("self-range-vertical")).description("Vertical place range.")).defaultValue(2)).min(0).sliderMax(10).build());
      怀.fd_Setting_338 = 怀.fd_SettingGroup_330.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("target-range")).description("How close the target needs to be to the hole.")).defaultValue(2)).min(0).sliderMax(10).build());
      怀.SSssSssssSsSSsSssSSssSsSSsSsssSSSSsssSSSSSsSSsSsSsSsssSssSsSSSSsssssSSSsSSssSssssSSsSSssSSssssssSSSSSSSsSssSSSSSsssSs = 怀.fd_SettingGroup_334.add(((Builder)((Builder)((Builder)(new Builder()).name("pause-on-eat")).description("Pauses while eating.")).defaultValue(true)).build());
      怀.qpQPPPppqpQqqpQqqPqPqppQppp = 怀.fd_SettingGroup_334.add(((Builder)((Builder)((Builder)(new Builder()).name("pause-on-drink")).description("Pauses while drinking.")).defaultValue(true)).build());
      怀.fd_Setting_337 = 怀.fd_SettingGroup_334.add(((Builder)((Builder)((Builder)(new Builder()).name("pause-on-mine")).description("Pauses while mining.")).defaultValue(true)).build());
      怀.fd_Setting_341 = 怀.fd_SettingGroup_334.add(((Builder)((Builder)((Builder)(new Builder()).name("pause-on-gap")).description("Pauses while holding a gap.")).defaultValue(false)).build());
      怀.fd_Setting_340 = 怀.fd_SettingGroup_328.add(((Builder)((Builder)(new Builder()).name("render")).defaultValue(true)).build());
      怀.fd_Setting_327 = 怀.fd_SettingGroup_328.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("shape-mode")).defaultValue(ShapeMode.Both)).build());
      怀.fd_Setting_326 = 怀.fd_SettingGroup_328.add(((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)(new meteordevelopment.meteorclient.settings.ColorSetting.Builder()).name("side-color")).defaultValue(new SettingColor(114, 11, 135, 75))).build());
      怀.sSsssSSsSsssSsSs = 怀.fd_SettingGroup_328.add(((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)(new meteordevelopment.meteorclient.settings.ColorSetting.Builder()).name("line-color")).defaultValue(new SettingColor(114, 11, 135))).build());
      怀.fd_Setting_335 = 怀.fd_SettingGroup_319.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("notification-mode")).description("How notifications are displayed.")).defaultValue(mode.fd_mode_881)).build());
      怀.fd_int_336 = 0;
      怀.fd_ArrayList_322 = new ArrayList();
   }
}
