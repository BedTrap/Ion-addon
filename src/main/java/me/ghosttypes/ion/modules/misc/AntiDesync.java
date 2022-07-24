/* Decompiler 4ms, total 148ms, lines 52 */
package me.ghosttypes.ion.modules.misc;

import me.ghosttypes.ion.utils.Class68;
import meteordevelopment.meteorclient.events.entity.player.BreakBlockEvent;
import meteordevelopment.meteorclient.events.entity.player.InteractBlockEvent;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.BoolSetting.Builder;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.math.Direction;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.class_2847;

public class AntiDesync extends Module {
   private final Setting<Boolean> fd_Setting_626;
   private final Setting<Boolean> fd_Setting_627;
   private final SettingGroup fd_SettingGroup_628;

   @EventHandler
   private void onBlockPlace(InteractBlockEvent 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if ((Boolean)怀.fd_Setting_627.get()) {
         怀 怀 = 怀.result.getBlockPos();
         if (怀 != null) {
            怀.mc.player.networkHandler.sendPacket(new PlayerActionC2SPacket(class_2847.STOP_DESTROY_BLOCK, 怀, Direction.UP));
         }

      }
   }

   @EventHandler
   private void onBlockBreak(BreakBlockEvent 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if ((Boolean)怀.fd_Setting_626.get()) {
         怀 怀 = 怀.blockPos;
         if (怀 != null) {
            怀.mc.player.networkHandler.sendPacket(new PlayerActionC2SPacket(class_2847.STOP_DESTROY_BLOCK, 怀, Direction.UP));
         }

      }
   }

   public AntiDesync() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super(Class68.fd_Category_1062, "anti-desync", "Prevent ghost block placements.");
      怀.fd_SettingGroup_628 = 怀.settings.getDefaultGroup();
      怀.fd_Setting_626 = 怀.fd_SettingGroup_628.add(((Builder)((Builder)((Builder)(new Builder()).name("break")).description("Anti-desync for block breaking.")).defaultValue(true)).build());
      怀.fd_Setting_627 = 怀.fd_SettingGroup_628.add(((Builder)((Builder)((Builder)(new Builder()).name("place")).description("Anti-desync for block placing.")).defaultValue(true)).build());
   }
}
