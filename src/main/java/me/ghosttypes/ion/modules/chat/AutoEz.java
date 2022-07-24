/* Decompiler 17ms, total 171ms, lines 143 */
package me.ghosttypes.ion.modules.chat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import me.ghosttypes.ion.utils.Class68;
import me.ghosttypes.ion.utils.Class69;
import me.ghosttypes.ion.utils.qPpPqPqpQQPppQPqPqQpQPqqppQpQPQpPPQQpQQqPqPPPqqPQppqqpQpqPQqqPPQqQPqqPQqqqpqPpqPppQPqqPQpPppppPPQppPpqpqPqppppPpQqQQQpPPPqpPP;
import me.ghosttypes.ion.utils.events.Class15;
import me.ghosttypes.ion.utils.events.Class17;
import me.ghosttypes.ion.utils.events.SSssSSsSSsssssSsSssS;
import me.ghosttypes.ion.utils.misc.Class23;
import me.ghosttypes.ion.utils.misc.Class30;
import me.ghosttypes.ion.utils.services.DeathManager.KillDetection;
import me.ghosttypes.ion.utils.stats.Class55;
import meteordevelopment.meteorclient.events.world.TickEvent.Post;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.EnumSetting.Builder;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.player.ChatUtils;
import meteordevelopment.orbit.EventHandler;

public class AutoEz extends Module {
   private final Setting<List<String>> JLlJLjJIliLjjilijlJIljLlLIJJLjLLlJJjjJiI;
   public final Setting<KillDetection> fd_Setting_19;
   private final SettingGroup fd_SettingGroup_20;
   public final Setting<Boolean> fd_Setting_21;
   public final Setting<Boolean> fd_Setting_22;
   public final Setting<Boolean> fd_Setting_23;
   public final Setting<Boolean> fd_Setting_24;
   private final SettingGroup fd_SettingGroup_25;
   private final Setting<Integer> fd_Setting_26;

   @EventHandler
   public void onTick(Post 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      qPpPqPqpQQPppQPqPqQpQPqqppQpQPQpPPQQpQQqPqPPPqqPQppqqpQpqPQqqPPQqQPqqPQqqqpqPpqPppQPqqPQpPppppPPQppPpqpqPqppppPpQqQQQpPPPqpPP.updateQueue();
   }

   @EventHandler
   public void onKill(Class17 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀.fd_Setting_19.get() == KillDetection.fd_KillDetection_1018) {
         怀.queueEz(怀.fd_String_906);
      }

   }

   public AutoEz() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super(Class68.fd_Category_1059, "ion-auto-ez", "Sends a message when you kill a player.");
      怀.fd_SettingGroup_25 = 怀.settings.getDefaultGroup();
      怀.fd_SettingGroup_20 = 怀.settings.createGroup("Messages");
      怀.fd_Setting_19 = 怀.fd_SettingGroup_25.add(((Builder)((Builder)((Builder)(new Builder()).name("kill-detection-mode")).description("How kills are detected.")).defaultValue(KillDetection.IJJJJJILIiJjlijLILLlIJjljiliIIJlLiIlLLJIIJlJLLIIiiIjLLjjjJIJijj)).build());
      怀.fd_Setting_26 = 怀.fd_SettingGroup_20.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("ez-delay")).description("How many seconds before sending an ez message.")).defaultValue(5)).min(1).sliderMax(100).build());
      怀.fd_Setting_21 = 怀.fd_SettingGroup_20.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("pm-ez")).description("Send the AutoEz message to the player's dm.")).defaultValue(false)).build());
      怀.fd_Setting_23 = 怀.fd_SettingGroup_20.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("killstreak")).description("Add your killstreak to the end of AutoEz messages.")).defaultValue(false)).build());
      怀.fd_Setting_24 = 怀.fd_SettingGroup_20.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("suffix")).description("Add Ion suffix to the end of pop messages.")).defaultValue(false)).build());
      怀.fd_Setting_22 = 怀.fd_SettingGroup_20.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("placeholders")).description("Enable global placeholders for messages.")).defaultValue(false)).build());
      怀.JLlJLjJIliLjjilijlJIljLlLIJJLjLLlJJjjJiI = 怀.fd_SettingGroup_20.add(((meteordevelopment.meteorclient.settings.StringListSetting.Builder)((meteordevelopment.meteorclient.settings.StringListSetting.Builder)((meteordevelopment.meteorclient.settings.StringListSetting.Builder)(new meteordevelopment.meteorclient.settings.StringListSetting.Builder()).name("ez-messages")).description("Messages to use for AutoEz.")).defaultValue(Collections.emptyList())).build());
   }

   public void queueEz(String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      ++Class30.fd_int_974;
      ++Class30.fd_int_972;
      Class30.addKill(怀);
      if (((List)怀.JLlJLjJIliLjjilijlJIljLlLIJJLjLLlJJjjJiI.get()).isEmpty()) {
         ChatUtils.warning("Your auto ez message list is empty!", new Object[0]);
      } else {
         qPpPqPqpQQPppQPqPqQpQPqqppQpQPQpPPQQpQQqPqPPPqqPQppqqpQpqPQqqPPQqQPqqPQqqqpqPpqPppQPqqPQpPppppPPQppPpqpqPqppppPpQqQQQpPPPqpPP.fd_ArrayList_1013.removeIf((怀x) -> {
            String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
            return 怀x.fd_String_1066.contains(怀);
         });
         怀 怀 = new ArrayList();
         怀 怀 = Class55.getDeathInstanceByName(怀);
         怀 怀 = 0;
         String 怀;
         if (怀 == null) {
            Iterator var6 = ((List)怀.JLlJLjJIliLjjilijlJIljLlLIJJLjLLlJJjjJiI.get()).iterator();

            while(var6.hasNext()) {
               怀 怀 = (String)var6.next();
               if (!怀.contains("{pops}")) {
                  ++怀;
                  怀.add(怀);
               }
            }

            if (怀 > 0) {
               怀 = (String)怀.get((new Random()).nextInt(怀.size()));
            } else {
               怀 = "GG {player}, Ion owns me and all";
            }
         } else {
            怀 = (String)((List)怀.JLlJLjJIliLjjilijlJIljLlLIJJLjLLlJJjjJiI.get()).get((new Random()).nextInt(((List)怀.JLlJLjJIliLjjilijlJIljLlLIJJLjLLlJJjjJiI.get()).size()));
            if (怀.contains("{pops}")) {
               怀 = 怀.replace("{pops}", String.valueOf(怀.fd_int_1027));
            }
         }

         if (怀.contains("{player}")) {
            怀 = 怀.replace("{player}", 怀);
         }

         if ((Boolean)怀.fd_Setting_22.get()) {
            怀 = Class23.apply(怀);
         }

         if ((Boolean)怀.fd_Setting_23.get()) {
            怀 = 怀 + " | Killstreak: " + Class30.fd_int_972;
         }

         if ((Boolean)怀.fd_Setting_24.get()) {
            怀 = 怀 + " | Ion 1.4.2";
         }

         qPpPqPqpQQPppQPqPqQpQPqqppQpQPQpPPQQpQQqPqPPPqqPQppqqpQpqPQqqPPQqQPqqPQqqqpqPpqPppQPqqPQpPppppPPQppPpqpqPqppppPpQqQQQpPPPqpPP.fd_ArrayList_1013.add(new Class69(怀, 怀, (Integer)怀.fd_Setting_26.get(), (Boolean)怀.fd_Setting_21.get()));
      }
   }

   @EventHandler
   public void onKill(SSssSSsSSsssssSsSssS 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀.fd_Setting_19.get() == KillDetection.fd_KillDetection_1017) {
         怀.queueEz(怀.fd_String_906);
      }

   }

   @EventHandler
   public void onKill(Class15 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀.fd_Setting_19.get() == KillDetection.IJJJJJILIiJjlijLILLlIJjljiliIIJlLiIlLLJIIJlJLLIIiiIjLLjjjJIJijj) {
         怀.queueEz(怀.fd_String_906);
      }

   }
}
