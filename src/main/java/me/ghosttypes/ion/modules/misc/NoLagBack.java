/* Decompiler 6ms, total 168ms, lines 78 */
package me.ghosttypes.ion.modules.misc;

import me.ghosttypes.ion.modules.render.Notifications.mode;
import me.ghosttypes.ion.utils.Class68;
import me.ghosttypes.ion.utils.network.Class42;
import meteordevelopment.meteorclient.events.packets.PacketEvent.Receive;
import meteordevelopment.meteorclient.events.world.TickEvent.Post;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.EnumSetting.Builder;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.systems.modules.movement.speed.Speed;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;

public class NoLagBack extends Module {
   private final Setting<Integer> lLLJlijIilljiIjJlIjIIJlIjjJiliJlIJjiILLILILLlilJlLlijjJlLIiL;
   private int fd_int_706;
   private final SettingGroup SsSsSSsssSSSSsSSssSSsSSSSsSSsSSssSSsSSssSsSsSSSSssSssSSSSSsssSsssssSSSSssSsSsSssS;
   private boolean fd_boolean_707;
   private final Setting<mode> fd_Setting_708;
   private boolean fd_boolean_709;

   private void notify(String 怀) {
      // $FF: Couldn't be decompiled
   }

   public NoLagBack() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super(Class68.fd_Category_1062, "no-lag-back", "Detect and mitigate lagback caused by movement modules.");
      怀.SsSsSSsssSSSSsSSssSSsSSSSsSSsSSssSSsSSssSsSsSSSSssSssSSSSSsssSsssssSSSSssSsSsSssS = 怀.settings.getDefaultGroup();
      怀.fd_Setting_708 = 怀.SsSsSSsssSSSSsSSssSSsSSSSsSSsSSssSSsSSssSsSsSSSSssSssSSSSSsssSsssssSSSSssSsSsSssS.add(((Builder)((Builder)((Builder)(new Builder()).name("notification-mode")).description("How notifications are displayed.")).defaultValue(mode.fd_mode_881)).build());
      怀.lLLJlijIilljiIjJlIjIIJlIjjJiliJlIJjiILLILILLlilJlLlijjJlLIiL = 怀.SsSsSSsssSSSSsSSssSSsSSSSsSSsSSssSSsSSssSsSsSSSSssSssSSSSSsssSsssssSSSSssSsSsSssS.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("re-enable-delay")).description("Delay between re-enabling movement modules after lagback.")).defaultValue(10)).min(0).sliderMax(100).build());
   }

   @EventHandler
   private void onPacketReceive(Receive 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (Class42.getPacket(怀) instanceof PlayerPositionLookS2CPacket && !怀.fd_boolean_709) {
         怀.notify("Lagback detected");
         怀.fd_boolean_709 = true;
         怀 怀 = (Speed)Modules.get().get(Speed.class);
         if (怀.isActive()) {
            怀.fd_boolean_707 = true;
            怀.toggle();
         }
      }

   }

   public void onActivate() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀.fd_boolean_707 = false;
      怀.fd_boolean_709 = false;
      怀.fd_int_706 = (Integer)怀.lLLJlijIilljiIjJlIjIIJlIjjJiliJlIJjiILLILILLlilJlLlijjJlLIiL.get();
   }

   @EventHandler
   private void onTick(Post 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀.fd_boolean_709) {
         --怀.fd_int_706;
         if (怀.fd_int_706 <= 0) {
            怀.fd_int_706 = (Integer)怀.lLLJlijIilljiIjJlIjIIJlIjjJiliJlIJjiILLILILLlilJlLlijjJlLIiL.get();
            怀.fd_boolean_709 = false;
            if (怀.fd_boolean_707) {
               怀 怀 = (Speed)Modules.get().get(Speed.class);
               if (!怀.isActive()) {
                  怀.toggle();
               }
            }
         }
      }

   }
}
