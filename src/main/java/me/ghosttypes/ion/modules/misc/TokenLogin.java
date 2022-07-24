/* Decompiler 4ms, total 144ms, lines 42 */
package me.ghosttypes.ion.modules.misc;

import me.ghosttypes.ion.utils.Class68;
import me.ghosttypes.ion.utils.network.Class39;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.StringSetting.Builder;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.player.ChatUtils;
import net.minecraft.text.Text;
import net.minecraft.network.packet.s2c.play.DisconnectS2CPacket;

public class TokenLogin extends Module {
   private final SettingGroup fd_SettingGroup_749;
   private final Setting<String> fd_Setting_750;
   private final Setting<String> fd_Setting_751;

   public void onActivate() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (Class39.isTokenValid((String)怀.fd_Setting_750.get())) {
         ChatUtils.info("Token validated! Logging in...", new Object[0]);
         if (Class39.setSession((String)怀.fd_Setting_751.get(), (String)怀.fd_Setting_750.get())) {
            怀.mc.player.networkHandler.onDisconnect(new DisconnectS2CPacket(Text.literal("Logged into " + (String)怀.fd_Setting_751.get() + " successfully!")));
         } else {
            ChatUtils.error("An error occurred, please check minecraft logs.", new Object[0]);
         }
      } else {
         ChatUtils.error("Invalid token!", new Object[0]);
      }

      怀.toggle();
   }

   public TokenLogin() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super(Class68.fd_Category_1062, "token-login", "Log in with an access token.");
      怀.fd_SettingGroup_749 = 怀.settings.getDefaultGroup();
      怀.fd_Setting_751 = 怀.fd_SettingGroup_749.add(((Builder)((Builder)((Builder)(new Builder()).name("username")).description("The username the access token belongs to")).defaultValue("Steve")).build());
      怀.fd_Setting_750 = 怀.fd_SettingGroup_749.add(((Builder)((Builder)((Builder)(new Builder()).name("token")).description("The access token")).defaultValue("12345")).build());
   }
}
