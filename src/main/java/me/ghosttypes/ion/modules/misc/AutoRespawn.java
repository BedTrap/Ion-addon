/* Decompiler 12ms, total 185ms, lines 161 */
package me.ghosttypes.ion.modules.misc;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import me.ghosttypes.ion.modules.chat.BurrowAlert;
import me.ghosttypes.ion.modules.render.Notifications.mode;
import me.ghosttypes.ion.utils.Class68;
import me.ghosttypes.ion.utils.sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS;
import me.ghosttypes.ion.utils.misc.Class30;
import me.ghosttypes.ion.utils.world.Class66;
import meteordevelopment.meteorclient.events.game.OpenScreenEvent;
import meteordevelopment.meteorclient.events.world.TickEvent.Post;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.BoolSetting.Builder;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.systems.modules.render.WaypointsModule;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.gui.screen.DeathScreen;

public class AutoRespawn extends Module {
   private final SettingGroup fd_SettingGroup_629;
   private final SettingGroup PQQPpPpPQpppPPQPPPQqPQQQpQqpQqQQ;
   private final SettingGroup fd_SettingGroup_630;
   private final Setting<String> fd_Setting_631;
   private final Setting<mode> fd_Setting_632;
   private boolean fd_boolean_633;
   private boolean fd_boolean_634;
   private final SettingGroup fd_SettingGroup_635;
   private final Setting<Boolean> SssSSSsSSS;
   private boolean fd_boolean_636;
   private final Setting<Boolean> fd_Setting_637;
   private final Setting<Boolean> fd_Setting_638;
   private int PQPpQQqpQpQqpPqpPPPpQqQPPqQPpPpPqpqqpqQQPPPQPQPPQPqQQpqpqQPPQpQPqppQPpqQpQqQQppppqpQQqPpqqpPpqqP;
   private final Setting<List<String>> fd_Setting_639;
   private final Setting<Boolean> fd_Setting_640;
   private int fd_int_641;
   private final Setting<Boolean> fd_Setting_642;
   private int fd_int_643;

   public void onActivate() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      Class66.moduleAuth();
   }

   private String getExcuseMessage() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (((List)怀.fd_Setting_639.get()).isEmpty()) {
         怀.notify("Your excuse message list is empty!");
         return "Lag";
      } else {
         String 怀;
         if ((Boolean)怀.fd_Setting_642.get()) {
            怀 = (String)((List)怀.fd_Setting_639.get()).get((new Random()).nextInt(((List)怀.fd_Setting_639.get()).size()));
         } else {
            if (怀.fd_int_643 >= ((List)怀.fd_Setting_639.get()).size()) {
               怀.fd_int_643 = 0;
            }

            怀 怀 = 怀.fd_int_643++;
            怀 = (String)((List)怀.fd_Setting_639.get()).get(怀);
         }

         return 怀;
      }
   }

   public AutoRespawn() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super(Class68.fd_Category_1062, "auto-respawn", "Automatically respawns after death.");
      怀.PQQPpPpPQpppPPQPPPQqPQQQpQqpQqQQ = 怀.settings.getDefaultGroup();
      怀.fd_SettingGroup_629 = 怀.settings.createGroup("Rekit");
      怀.fd_SettingGroup_635 = 怀.settings.createGroup("AutoExcuse");
      怀.fd_SettingGroup_630 = 怀.settings.createGroup("HighScore");
      怀.SssSSSsSSS = 怀.fd_SettingGroup_629.add(((Builder)((Builder)((Builder)(new Builder()).name("rekit")).description("Rekit after dying on pvp servers.")).defaultValue(false)).build());
      怀.fd_Setting_631 = 怀.fd_SettingGroup_629.add(((meteordevelopment.meteorclient.settings.StringSetting.Builder)((meteordevelopment.meteorclient.settings.StringSetting.Builder)((meteordevelopment.meteorclient.settings.StringSetting.Builder)(new meteordevelopment.meteorclient.settings.StringSetting.Builder()).name("kit-name")).description("The name of your kit.")).defaultValue("default")).build());
      怀.fd_Setting_632 = 怀.PQQPpPpPQpppPPQPPPQqPQQQpQqpQqQQ.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("notification-mode")).description("How notifications are displayed.")).defaultValue(mode.fd_mode_881)).build());
      怀.fd_Setting_640 = 怀.fd_SettingGroup_635.add(((Builder)((Builder)((Builder)(new Builder()).name("excuse")).description("Send an excuse to global chat after death.")).defaultValue(false)).build());
      怀.fd_Setting_642 = 怀.fd_SettingGroup_635.add(((Builder)((Builder)((Builder)(new Builder()).name("randomize")).description("Randomizes the excuse message.")).defaultValue(false)).build());
      怀.fd_Setting_639 = 怀.fd_SettingGroup_635.add(((meteordevelopment.meteorclient.settings.StringListSetting.Builder)((meteordevelopment.meteorclient.settings.StringListSetting.Builder)((meteordevelopment.meteorclient.settings.StringListSetting.Builder)(new meteordevelopment.meteorclient.settings.StringListSetting.Builder()).name("excuse-messages")).description("Messages to use for AutoExcuse")).defaultValue(Collections.emptyList())).build());
      怀.fd_Setting_638 = 怀.fd_SettingGroup_630.add(((Builder)((Builder)((Builder)(new Builder()).name("alert")).description("Alerts you client side when you reach a new highscore.")).defaultValue(false)).build());
      怀.fd_Setting_637 = 怀.fd_SettingGroup_630.add(((Builder)((Builder)((Builder)(new Builder()).name("announce")).description("Announce when you reach a new highscore.")).defaultValue(false)).build());
      怀.fd_boolean_636 = false;
      怀.fd_boolean_634 = false;
      怀.fd_boolean_633 = false;
      怀.fd_int_641 = 50;
      怀.PQPpQQqpQpQqpPqpPPPpQqQPPqQPpPpPqpqqpqQQPPPQPQPPQPqQQpqpqQPPQpQPqppQPpqQpQqQQppppqpQQqPpqqpPpqqP = 50;
      怀.fd_int_643 = 0;
   }

   private void notify(String 怀) {
      // $FF: Couldn't be decompiled
   }

   @EventHandler
   private void onTick(Post 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (!sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.isLagging()) {
         if (怀.fd_boolean_636 && 怀.PQPpQQqpQpQqpPqpPPPpQqQPPqQPpPpPqpqqpqQQPPPQPQPPQPqQQpqpqQPPQpQPqppQPpqQpQqQQppppqpQQqPpqqpPpqqP <= 1) {
            if (怀.fd_boolean_633) {
               if ((Boolean)怀.fd_Setting_638.get()) {
                  怀.notify("You reached a new highscore of " + Class30.fd_int_971 + "!");
               }

               if ((Boolean)怀.fd_Setting_637.get()) {
                  sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.sendMessage("I reached a new highscore of " + Class30.fd_int_971 + " thanks to Ion!");
               }

               怀.fd_boolean_633 = false;
            }

            怀.notify("Rekitting with kit " + (String)怀.fd_Setting_631.get());
            sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.sendMessage("/kit " + (String)怀.fd_Setting_631.get());
            怀.fd_boolean_636 = false;
            怀.fd_boolean_633 = false;
            怀.PQPpQQqpQpQqpPqpPPPpQqQPPqQPpPpPqpqqpqQQPPPQPQPPQPqQQpqpqQPPQpQPqppQPpqQpQqQQppppqpQQqPpqqpPpqqP = 50;
         } else {
            --怀.PQPpQQqpQpQqpPqpPPPpQqQPPqQPpPpPqpqqpqQQPPPQPQPPQPqQQpqpqQPPQpQPqppQPpqQpQqQQppppqpQQqPpqqpPpqqP;
            if (怀.fd_boolean_634 && 怀.fd_int_641 <= 1) {
               怀 怀 = 怀.getExcuseMessage();
               sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.sendMessage(怀);
               怀.fd_boolean_634 = false;
               怀.fd_int_641 = 50;
            } else {
               --怀.fd_int_641;
            }

         }
      }
   }

   @EventHandler
   private void onOpenScreenEvent(OpenScreenEvent 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀.screen instanceof DeathScreen) {
         怀.mc.player.requestRespawn();
         ((WaypointsModule)Modules.get().get(WaypointsModule.class)).addDeath(怀.mc.player.getPos());
         if ((Boolean)怀.SssSSSsSSS.get()) {
            怀.fd_boolean_636 = true;
         }

         if ((Boolean)怀.fd_Setting_640.get()) {
            怀.fd_boolean_634 = true;
         }

         ++Class30.fd_int_969;
         BurrowAlert.fd_List_47.clear();
         if (Class30.fd_int_972 > Class30.fd_int_971) {
            怀.fd_boolean_633 = true;
            Class30.fd_int_971 = Class30.fd_int_972;
         }

         Class30.fd_int_972 = 0;
         Class30.fd_ArrayList_975.clear();
         怀.cancel();
      }
   }
}
