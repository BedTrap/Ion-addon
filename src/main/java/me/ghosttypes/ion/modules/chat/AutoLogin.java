/* Decompiler 3ms, total 163ms, lines 49 */
package me.ghosttypes.ion.modules.chat;

import java.util.ArrayList;
import java.util.Iterator;
import me.ghosttypes.ion.utils.Class68;
import me.ghosttypes.ion.utils.sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS;
import meteordevelopment.meteorclient.events.game.ReceiveMessageEvent;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.StringSetting.Builder;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.orbit.EventHandler;

public class AutoLogin extends Module {
   private final SettingGroup fd_SettingGroup_27;
   private final ArrayList<String> fd_ArrayList_28;
   private final Setting<String> fd_Setting_29;

   public AutoLogin() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super(Class68.fd_Category_1059, "auto-login", "Automatically log into servers that use /login.");
      怀.fd_SettingGroup_27 = 怀.settings.getDefaultGroup();
      怀.fd_Setting_29 = 怀.fd_SettingGroup_27.add(((Builder)((Builder)((Builder)(new Builder()).name("password")).description("The password to log in with.")).defaultValue("password")).build());
      怀.fd_ArrayList_28 = new AutoLogin$1(怀);
   }

   @EventHandler(
      priority = 200
   )
   private void onMessageRecieve(ReceiveMessageEvent 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀.mc.world != null && 怀.mc.player != null) {
         怀 怀 = 怀.getMessage().getString();
         if (!怀.startsWith(">")) {
            Iterator var3 = 怀.fd_ArrayList_28.iterator();

            while(var3.hasNext()) {
               怀 怀 = (String)var3.next();
               if (怀.contains(怀)) {
                  sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.sendMessage("/login " + (String)怀.fd_Setting_29.get());
                  break;
               }
            }

         }
      }
   }
}
