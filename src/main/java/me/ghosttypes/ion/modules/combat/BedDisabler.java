/* Decompiler 11ms, total 185ms, lines 107 */
package me.ghosttypes.ion.modules.combat;

import java.util.ArrayList;
import java.util.Iterator;
import me.ghosttypes.ion.modules.render.Notifications.mode;
import me.ghosttypes.ion.utils.Class68;
import me.ghosttypes.ion.utils.sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS;
import me.ghosttypes.ion.utils.world.Class66;
import meteordevelopment.meteorclient.events.world.TickEvent.Pre;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.IntSetting.Builder;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.player.FindItemResult;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.world.BlockUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.math.Vec3d;

public class BedDisabler extends Module {
   private final ArrayList<Vec3d> fd_ArrayList_242;
   private final Setting<Boolean> fd_Setting_243;
   private final Setting<Boolean> fd_Setting_244;
   private final Setting<Integer> fd_Setting_245;
   private final SettingGroup fd_SettingGroup_246;
   private final Setting<Boolean> QqPQQPQqQQQppQQPQpPPqQQQpppPPqpPPqpPQP;
   private int fd_int_247;
   private int fd_int_248;
   private final Setting<mode> fd_Setting_249;
   private final SettingGroup fd_SettingGroup_250;
   private final Setting<Boolean> fd_Setting_251;
   private final Setting<Boolean> fd_Setting_252;
   private final Setting<Integer> fd_Setting_253;

   private void notify(String 怀) {
      // $FF: Couldn't be decompiled
   }

   public BedDisabler() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super(Class68.fd_Category_1060, "bed-disabler", "Anti bed that works.");
      怀.fd_SettingGroup_250 = 怀.settings.getDefaultGroup();
      怀.fd_SettingGroup_246 = 怀.settings.createGroup("Pause");
      怀.fd_Setting_245 = 怀.fd_SettingGroup_250.add(((Builder)((Builder)((Builder)(new Builder()).name("webs-per-tick")).description("Web placements per tick.")).defaultValue(2)).min(1).sliderMax(3).build());
      怀.fd_Setting_253 = 怀.fd_SettingGroup_250.add(((Builder)((Builder)((Builder)(new Builder()).name("delay")).description("Delay between attempts.")).defaultValue(4)).min(1).sliderMax(10).build());
      怀.fd_Setting_244 = 怀.fd_SettingGroup_250.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("ignore-feet")).description("Don't place on your feet.")).defaultValue(false)).build());
      怀.fd_Setting_251 = 怀.fd_SettingGroup_250.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("only-in-hole")).description("Only place while you're in a hole.")).defaultValue(true)).build());
      怀.fd_Setting_249 = 怀.fd_SettingGroup_250.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("notification-mode")).description("How notifications are displayed.")).defaultValue(mode.fd_mode_881)).build());
      怀.fd_Setting_243 = 怀.fd_SettingGroup_246.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("pause-on-eat")).description("Pauses while eating.")).defaultValue(true)).build());
      怀.QqPQQPQqQQQppQQPQpPPqQQQpppPPqpPPqpPQP = 怀.fd_SettingGroup_246.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("pause-on-drink")).description("Pauses while drinking.")).defaultValue(true)).build());
      怀.fd_Setting_252 = 怀.fd_SettingGroup_246.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("pause-on-mine")).description("Pauses while mining.")).defaultValue(true)).build());
      怀.fd_ArrayList_242 = new BedDisabler$1(怀);
   }

   public void onActivate() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      Class66.moduleAuth();
      怀.fd_int_248 = 0;
      怀.fd_int_247 = (Integer)怀.fd_Setting_253.get();
   }

   private void doPlace(FindItemResult 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀.fd_int_248 = 0;
      怀 怀 = new ArrayList(怀.fd_ArrayList_242);
      if (!(Boolean)怀.fd_Setting_244.get()) {
         怀.add(new Vec3d(0.0D, 0.0D, 0.0D));
      }

      怀 怀 = 怀.mc.player.getBlockPos();

      for(Iterator var4 = 怀.iterator(); var4.hasNext(); ++怀.fd_int_248) {
         怀 怀 = (Vec3d)var4.next();
         if (怀.fd_int_248 >= (Integer)怀.fd_Setting_245.get()) {
            break;
         }

         怀 怀 = 怀.add(怀.x, 怀.y, 怀.z);
         BlockUtils.place(怀, 怀, 50, false);
      }

   }

   @EventHandler
   private void onTick(Pre 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = InvUtils.findInHotbar(new Item[]{Items.STRING});
      if (!怀.found()) {
         怀.notify("No string found in hotbar.");
         怀.toggle();
      } else if ((Boolean)怀.fd_Setting_251.get() && !sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.isInHole(怀.mc.player)) {
         怀.notify("You're not in a hole!");
         怀.toggle();
      } else if (!PlayerUtils.shouldPause((Boolean)怀.fd_Setting_252.get(), (Boolean)怀.fd_Setting_243.get(), (Boolean)怀.QqPQQPQqQQQppQQPQpPPqQQQpppPPqpPPqpPQP.get())) {
         if (怀.fd_int_247 <= 0) {
            怀.fd_int_247 = (Integer)怀.fd_Setting_253.get();
            怀.doPlace(怀);
         } else {
            --怀.fd_int_247;
         }
      }
   }
}
