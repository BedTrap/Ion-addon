/* Decompiler 6ms, total 223ms, lines 42 */
package me.ghosttypes.ion.modules.render;

import java.util.Iterator;
import me.ghosttypes.ion.modules.hud.visual.NotificationsHUD;
import me.ghosttypes.ion.modules.hud.visual.NotificationsHUD.Notif;
import me.ghosttypes.ion.utils.Class68;
import meteordevelopment.meteorclient.events.world.TickEvent.Post;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.IntSetting.Builder;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.orbit.EventHandler;

public class Notifications extends Module {
   public final Setting<Integer> fd_Setting_876;
   private final SettingGroup fd_SettingGroup_877;
   public final Setting<Boolean> fd_Setting_878;
   public final Setting<SettingColor> fd_Setting_879;

   public Notifications() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super(Class68.fd_Category_1062, "notifications", "Show notifications on the hud.");
      怀.fd_SettingGroup_877 = 怀.settings.getDefaultGroup();
      怀.fd_Setting_876 = 怀.fd_SettingGroup_877.add(((Builder)((Builder)((Builder)(new Builder()).name("display-time")).description("How long each notification displays for.")).defaultValue(2)).min(1).build());
      怀.fd_Setting_878 = 怀.fd_SettingGroup_877.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("render-background")).defaultValue(true)).build());
      怀.fd_Setting_879 = 怀.fd_SettingGroup_877.add(((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)(new meteordevelopment.meteorclient.settings.ColorSetting.Builder()).name("background-color")).defaultValue(new SettingColor(156, 56, 56, 75))).build());
   }

   @EventHandler
   private void onTick(Post 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      Iterator var2 = NotificationsHUD.fd_ArrayList_616.iterator();

      while(var2.hasNext()) {
         怀 怀 = (Notif)var2.next();
         怀.tick();
      }

   }
}
