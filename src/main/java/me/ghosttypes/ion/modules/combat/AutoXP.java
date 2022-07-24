/* Decompiler 29ms, total 212ms, lines 285 */
package me.ghosttypes.ion.modules.combat;

import java.util.Objects;
import me.ghosttypes.ion.modules.combat.bedaura.BedAuraV2;
import me.ghosttypes.ion.modules.combat.bedaura.BedAuraV3;
import me.ghosttypes.ion.modules.render.Notifications.mode;
import me.ghosttypes.ion.utils.Class68;
import me.ghosttypes.ion.utils.sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS;
import me.ghosttypes.ion.utils.player.Class46;
import me.ghosttypes.ion.utils.player.SsSSssSsssssSsSSsSSs;
import me.ghosttypes.ion.utils.world.Class66;
import meteordevelopment.meteorclient.events.world.TickEvent.Pre;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.DoubleSetting.Builder;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.systems.modules.combat.CrystalAura;
import meteordevelopment.meteorclient.systems.modules.combat.KillAura;
import meteordevelopment.meteorclient.systems.modules.combat.Offhand;
import meteordevelopment.meteorclient.utils.player.FindItemResult;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.player.Rotations;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.item.Items;

public class AutoXP extends Module {
   private boolean fd_boolean_221;
   private boolean fd_boolean_222;
   private final Setting<Boolean> fd_Setting_223;
   // $FF: synthetic field
   static final boolean ppqPppPqPqQPqQqQQPpQpQqqQppQQPPPPpppQPqpQqPpQqQppqQpQqQqPppQpQPqQQQqpqQPqQQPPqppppQPqQQqqQpQqpQQQPPQqQqPPPQpqqqPPqQQqpP;
   private final Setting<Boolean> fd_Setting_224;
   private int fd_int_225;
   private final Setting<Boolean> fd_Setting_226;
   private int fd_int_227;
   private final Setting<Boolean> fd_Setting_228;
   private boolean fd_boolean_229;
   private final Setting<Boolean> fd_Setting_230;
   private final SettingGroup fd_SettingGroup_231;
   private final Setting<mode> fd_Setting_232;
   private final Setting<Boolean> fd_Setting_233;
   private final Setting<Double> fd_Setting_234;
   private final SettingGroup fd_SettingGroup_235;
   private final Setting<Boolean> fd_Setting_236;
   private final Setting<Boolean> fd_Setting_237;
   private final Setting<Boolean> fd_Setting_238;
   private final Setting<Integer> fd_Setting_239;
   private final Setting<Double> fd_Setting_240;
   private final Setting<Boolean> jlJlljlljJJiIJIJijIIIlJliliIliijiILLLiLJiIjllijLLlijIliiiLIIIlililllJiLLLLJJLIIllJjiJJjllljJlJiIili;

   public void onActivate() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      Class66.moduleAuth();
      if ((Boolean)怀.fd_Setting_237.get()) {
         怀 怀 = (CrystalAura)Modules.get().get(CrystalAura.class);
         怀 怀 = (KillAura)Modules.get().get(KillAura.class);
         怀 怀 = (BedAuraV3)Modules.get().get(BedAuraV3.class);
         怀 怀 = (BedAuraV2)Modules.get().get(BedAuraV2.class);
         怀 怀 = (Offhand)Modules.get().get(Offhand.class);
         if (怀.isActive()) {
            怀.toggle();
         }

         if (怀.isActive()) {
            怀.toggle();
         }

         if (怀.isActive()) {
            怀.toggle();
         }

         if (怀.isActive()) {
            怀.toggle();
         }

         if (怀.isActive() && (Boolean)怀.jlJlljlljJJiIJIJijIIIlJliliIliijiILLLiLJiIjllijLLlijIliiiLIIIlililllJiLLLLJJLIIllJjiJJjllljJlJiIili.get()) {
            怀.fd_boolean_221 = true;
            怀.toggle();
         }
      }

      怀.fd_boolean_229 = false;
      怀.fd_int_225 = 25;
      怀.fd_boolean_222 = false;
      怀.fd_int_227 = (Integer)怀.fd_Setting_239.get() - 1;
   }

   private boolean refillSlotEmpty(boolean 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀) {
         return sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.getItemFromSlot(45) != Items.EXPERIENCE_BOTTLE;
      } else {
         return sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.getItemFromSlot(怀.fd_int_227) != Items.EXPERIENCE_BOTTLE;
      }
   }

   private void moduleCheck() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = (CrystalAura)Modules.get().get(CrystalAura.class);
      怀 怀 = (KillAura)Modules.get().get(KillAura.class);
      怀 怀 = (BedAuraV3)Modules.get().get(BedAuraV3.class);
      if (怀.isActive() || 怀.isActive() || 怀.isActive()) {
         怀.toggle();
      }

   }

   private void repair() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if ((Boolean)怀.fd_Setting_228.get()) {
         Rotations.rotate((double)怀.mc.player.getYaw(), 90.0D, 50, 怀::throwXP);
      } else {
         怀.throwXP();
      }

   }

   private void throwXP() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = 怀.mc.player.getInventory().selectedSlot;
      if (怀.mc.player.getInventory().getStack(怀).getItem() != Items.ENCHANTED_GOLDEN_APPLE || !(Boolean)怀.fd_Setting_233.get()) {
         if ((Boolean)怀.jlJlljlljJJiIJIJijIIIlJliliIliijiILLLiLJiIjllijLLlijIliiiLIIIlililllJiLLLLJJLIIllJjiJJjllljJlJiIili.get()) {
            怀.mc.interactionManager.interactItem(怀.mc.player, Hand.OFF_HAND);
         } else {
            sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.updateSlot(怀.fd_int_227);
            怀.mc.interactionManager.interactItem(怀.mc.player, Hand.MAIN_HAND);
            if ((Boolean)怀.fd_Setting_236.get() && 怀 != -1) {
               sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.updateSlot(怀);
            }
         }

      }
   }

   public void onDeactivate() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = (Offhand)Modules.get().get(Offhand.class);
      if ((Boolean)怀.fd_Setting_237.get() && 怀.fd_boolean_221 && !怀.isActive()) {
         怀.toggle();
      }

   }

   public AutoXP() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super(Class68.fd_Category_1060, "auto-xp", "Automatically repair your armor.");
      怀.fd_SettingGroup_231 = 怀.settings.getDefaultGroup();
      怀.fd_SettingGroup_235 = 怀.settings.createGroup("Pause");
      怀.fd_Setting_240 = 怀.fd_SettingGroup_231.add(((Builder)((Builder)(new Builder()).name("threshold")).description("What durability to enable at.")).defaultValue(20.0D).min(1.0D).sliderMin(1.0D).sliderMax(100.0D).max(100.0D).build());
      怀.fd_Setting_234 = 怀.fd_SettingGroup_231.add(((Builder)((Builder)(new Builder()).name("min-health")).description("Min health for repairing.")).defaultValue(10.0D).min(0.0D).sliderMax(36.0D).max(36.0D).build());
      怀.fd_Setting_226 = 怀.fd_SettingGroup_231.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("passive")).description("Keep AutoXP on and repair automatically.")).defaultValue(false)).build());
      怀.fd_Setting_237 = 怀.fd_SettingGroup_231.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("module-control")).description("Disable combat modules while repairing armor.")).defaultValue(true)).build());
      怀.fd_Setting_238 = 怀.fd_SettingGroup_231.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("only-in-hole")).description("Only throw XP while in a hole.")).defaultValue(false)).build());
      怀.fd_Setting_236 = 怀.fd_SettingGroup_231.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("silent")).description("Allows you to use other hotbar slots while throwing XP.")).defaultValue(false)).build());
      怀.fd_Setting_223 = 怀.fd_SettingGroup_231.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("refill")).description("Moves XP from your inventory to your hotbar when you run out.")).defaultValue(false)).build());
      怀.jlJlljlljJJiIJIJijIIIlJliliIliijiILLLiLJiIjllijLLlijIliiiLIIIlililllJiLLLLJJLIIllJjiJJjllljJlJiIili = 怀.fd_SettingGroup_231.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("use-offhand")).description("Uses your offhand for XP.")).defaultValue(false)).build());
      SettingGroup var10001 = 怀.fd_SettingGroup_231;
      meteordevelopment.meteorclient.settings.IntSetting.Builder var10002 = ((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("refill-slot")).description("Which slot to refill.")).defaultValue(1)).min(1).sliderMin(1).max(9).sliderMax(9);
      Setting var10003 = 怀.fd_Setting_223;
      Objects.requireNonNull(var10003);
      怀.fd_Setting_239 = var10001.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)var10002.visible(var10003::get)).build());
      怀.fd_Setting_228 = 怀.fd_SettingGroup_231.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("look-down")).description("Throws the XP at your feet.")).defaultValue(true)).build());
      怀.fd_Setting_232 = 怀.fd_SettingGroup_231.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("notification-mode")).description("How notifications are displayed.")).defaultValue(mode.fd_mode_881)).build());
      怀.fd_Setting_233 = 怀.fd_SettingGroup_235.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("pause-on-eat")).description("Pauses while eating.")).defaultValue(true)).build());
      怀.fd_Setting_224 = 怀.fd_SettingGroup_235.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("pause-on-drink")).description("Pauses while drinking.")).defaultValue(true)).build());
      怀.fd_Setting_230 = 怀.fd_SettingGroup_235.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("pause-on-mine")).description("Pauses while mining.")).defaultValue(true)).build());
   }

   private void notify(String 怀) {
      // $FF: Couldn't be decompiled
   }

   private void refill() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      FindItemResult 怀;
      if (怀.refillSlotEmpty(false) && !(Boolean)怀.jlJlljlljJJiIJIJijIIIlJliliIliijiILLLiLJiIjllijLLlijIliiiLIIIlililllJiLLLLJJLIIllJjiJJjllljJlJiIili.get()) {
         if (!(Boolean)怀.fd_Setting_223.get()) {
            怀.notify("No XP in hotbar!");
            怀.toggle();
            return;
         }

         怀 = Class46.findXPinAll();
         if (!怀.found()) {
            怀.notify("You're out of XP!");
            怀.toggle();
            return;
         }

         InvUtils.move().from(怀.slot()).toHotbar(怀.fd_int_227);
      }

      if (怀.refillSlotEmpty(true) && (Boolean)怀.jlJlljlljJJiIJIJijIIIlJliliIliijiILLLiLJiIjllijLLlijIliiiLIIIlililllJiLLLLJJLIIllJjiJJjllljJlJiIili.get()) {
         怀 = Class46.findXPinAll();
         if (怀.found()) {
            InvUtils.move().from(怀.slot()).toOffhand();
         } else {
            怀.notify("You're out of XP!");
            怀.toggle();
         }
      }

   }

   private boolean shouldRepair() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";

      for(int 怀 = 0; 怀 < 4; ++怀) {
         if (SsSSssSsssssSsSSsSSs.checkThreshold(SsSSssSsssssSsSSsSSs.getArmor(怀), (Double)怀.fd_Setting_240.get())) {
            return true;
         }
      }

      return false;
   }

   @EventHandler
   private void onTick(Pre 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (!ppqPppPqPqQPqQqQQPpQpQqqQppQQPPPPpppQPqpQqPpQqQppqQpQqQqPppQpQPqQQQqpqQPqQQPPqppppQPqQQqqQpQqpQQQPPQqQqPPPQpqqqPPqQQqpP && 怀.mc.player == null) {
         throw new AssertionError();
      } else if (!PlayerUtils.shouldPause((Boolean)怀.fd_Setting_230.get(), (Boolean)怀.fd_Setting_233.get(), (Boolean)怀.fd_Setting_224.get())) {
         if ((Boolean)怀.fd_Setting_226.get()) {
            if ((Boolean)怀.fd_Setting_238.get() && !sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.isInHole(怀.mc.player)) {
               if (怀.fd_boolean_229) {
                  怀.notify("Auto Repair cancelled.");
                  怀.fd_boolean_229 = false;
                  怀.fd_int_225 = 25;
               }

               return;
            }

            if (!怀.shouldRepair() || 怀.fd_int_225 > 0) {
               --怀.fd_int_225;
               怀.fd_boolean_229 = false;
               return;
            }

            if (!怀.fd_boolean_229) {
               怀.notify("Auto Repairing to " + 怀.fd_Setting_240.get() + "%%");
               怀.fd_boolean_229 = true;
            }

            怀.moduleCheck();
            怀.refill();
            怀.repair();
         }

         if ((double)sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.getTotalHealth(怀.mc.player) <= (Double)怀.fd_Setting_234.get()) {
            怀.notify("Your health is too low!");
            怀.toggle();
         } else if ((Boolean)怀.fd_Setting_238.get() && !sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.isInHole(怀.mc.player)) {
            怀.notify("You're not in a hole!");
            怀.toggle();
         } else if (!怀.shouldRepair()) {
            if (怀.fd_boolean_222) {
               怀.notify("Finished repair.");
            } else {
               怀.notify("Your armor is above the threshold.");
            }

            怀.toggle();
         } else {
            怀.moduleCheck();
            怀.refill();
            if (!怀.fd_boolean_222) {
               怀.notify("Repairing armor to " + 怀.fd_Setting_240.get() + "%%");
               怀.fd_boolean_222 = true;
            }

            怀.repair();
         }
      }
   }

   static {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      ppqPppPqPqQPqQqQQPpQpQqqQppQQPPPPpppQPqpQqPpQqQppqQpQqQqPppQpQPqQQQqpqQPqQQPPqppppQPqQQqqQpQqpQQQPPQqQqPPPQpqqqPPqQQqpP = !AutoXP.class.desiredAssertionStatus();
   }
}
