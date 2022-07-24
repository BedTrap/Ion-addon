/* Decompiler 7ms, total 184ms, lines 38 */
package me.ghosttypes.ion.modules.misc;

import me.ghosttypes.ion.modules.render.Notifications.mode;
import me.ghosttypes.ion.utils.Class68;
import me.ghosttypes.ion.utils.services.Class52;
import meteordevelopment.meteorclient.events.world.TickEvent.Post;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.EnumSetting.Builder;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.player.ChatUtils;
import meteordevelopment.orbit.EventHandler;

public class SpotifyAlerts extends Module {
   String fd_String_746;
   private final SettingGroup fd_SettingGroup_747;
   private final Setting<mode> fd_Setting_748;

   @EventHandler
   private void onTick(Post 怀) {
      // $FF: Couldn't be decompiled
   }

   private void sendChatNotif(String 怀, String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      ChatUtils.info("Now Playing: " + 怀 + " - " + 怀, new Object[0]);
   }

   public SpotifyAlerts() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      byte[] var2 = new byte[0];
      super(Class68.fd_Category_1062, "spotify-alerts", new String(var2));
      怀.fd_SettingGroup_747 = 怀.settings.getDefaultGroup();
      怀.fd_Setting_748 = 怀.fd_SettingGroup_747.add(((Builder)((Builder)((Builder)(new Builder()).name("notification-mode")).description("How notifications are displayed.")).defaultValue(mode.fd_mode_881)).build());
      怀.fd_String_746 = null;
   }
}
