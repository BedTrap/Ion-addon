/* Decompiler 7ms, total 183ms, lines 76 */
package me.ghosttypes.ion.modules.chat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.ghosttypes.ion.modules.render.Notifications.mode;
import me.ghosttypes.ion.utils.Class68;
import me.ghosttypes.ion.utils.sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS;
import me.ghosttypes.ion.utils.player.Class44;
import meteordevelopment.meteorclient.events.world.TickEvent.Post;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.IntSetting.Builder;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.player.PlayerEntity;

public class BurrowAlert extends Module {
   public static List<PlayerEntity> fd_List_47;
   private final SettingGroup fd_SettingGroup_48;
   private final Setting<mode> fd_Setting_49;
   private int PPPqQqQQpPpqpPQqqqpPQpPpQqqqqqpqPpPPqqQpQpQQQqpqQqQppPqQpppPPqpQqPPQQPQqqQqqqppQqQqqqQQPQQpQPPQQPqpqPQ;
   private final Setting<Integer> fd_Setting_50;

   private boolean isValid(PlayerEntity 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀 == 怀.mc.player) {
         return false;
      } else {
         return 怀.mc.player.distanceTo(怀) <= (float)(Integer)怀.fd_Setting_50.get() && !fd_List_47.contains(怀) && Class44.isBurrowed(怀, true) && !sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.isPlayerMoving(怀);
      }
   }

   public void onActivate() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀.PPPqQqQQpPpqpPQqqqpPQpPpQqqqqqpqPpPPqqQpQpQQQqpqQqQppPqQpppPPqpQqPPQQPQqqQqqqppQqQqqqQQPQQpQPPQQPqpqPQ = 0;
   }

   @EventHandler
   private void onTick(Post 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      Iterator var2 = 怀.mc.world.getPlayers().iterator();

      while(var2.hasNext()) {
         怀 怀 = (PlayerEntity)var2.next();
         if (怀.isValid(怀)) {
            fd_List_47.add(怀);
            怀.notify(怀.getEntityName() + " is burrowed!");
         }

         if (fd_List_47.contains(怀) && !Class44.isBurrowed(怀, true)) {
            fd_List_47.remove(怀);
            怀.notify(怀.getEntityName() + " is no longer burrowed.");
         }
      }

   }

   public BurrowAlert() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super(Class68.fd_Category_1059, "burrow-alert", "Alerts you when players are burrowed.");
      怀.fd_SettingGroup_48 = 怀.settings.getDefaultGroup();
      怀.fd_Setting_50 = 怀.fd_SettingGroup_48.add(((Builder)((Builder)((Builder)(new Builder()).name("range")).description("How far away from you to check for burrowed players.")).defaultValue(2)).min(0).sliderMax(10).build());
      怀.fd_Setting_49 = 怀.fd_SettingGroup_48.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("notification-mode")).description("How notifications are displayed.")).defaultValue(mode.fd_mode_881)).build());
   }

   static {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_List_47 = new ArrayList();
   }

   private void notify(String 怀) {
      // $FF: Couldn't be decompiled
   }
}
