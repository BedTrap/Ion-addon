/* Decompiler 24ms, total 195ms, lines 150 */
package me.ghosttypes.ion.modules.chat;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import me.ghosttypes.ion.Ion;
import me.ghosttypes.ion.utils.Class68;
import me.ghosttypes.ion.utils.sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS;
import me.ghosttypes.ion.utils.network.Class42;
import meteordevelopment.meteorclient.events.packets.PacketEvent.Receive;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.IntSetting.Builder;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.packet.s2c.play.PlayerListS2CPacket;
import net.minecraft.network.packet.s2c.play.ChatMessageS2CPacket;
import net.minecraft.Entry;
import net.minecraft.network.packet.s2c.play.PlayerListS2CPacket.class_5893;

public class Welcomer extends Module {
   public final Setting<Boolean> fd_Setting_70;
   private final Executor fd_Executor_71;
   // $FF: synthetic field
   static final boolean fd_boolean_72;
   private final Setting<List<String>> fd_Setting_73;
   private final Setting<Integer> fd_Setting_74;
   private final SettingGroup fd_SettingGroup_75;
   private final Setting<List<String>> IJLjjjLLiLlLJLjjLLIJljJ;

   static {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_boolean_72 = !Welcomer.class.desiredAssertionStatus();
   }

   private void sendJoinMsg(String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (!((List)怀.fd_Setting_73.get()).isEmpty()) {
         怀 怀 = (String)((List)怀.fd_Setting_73.get()).get((new Random()).nextInt(((List)怀.fd_Setting_73.get()).size()));
         怀 = 怀.replace("{player}", 怀);
         if (!(Boolean)怀.fd_Setting_70.get()) {
            怀.fd_Executor_71.execute(() -> {
               String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
               怀x.queueMsg(怀);
            });
         } else {
            怀.info(怀, new Object[0]);
         }

      }
   }

   @EventHandler
   private void onReceivePacket(Receive 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = Class42.getPacket(怀);
      if (!fd_boolean_72 && 怀.mc.player == null) {
         throw new AssertionError();
      } else if (怀.mc.player.age >= 30) {
         if (怀 instanceof ChatMessageS2CPacket) {
            怀 怀 = (ChatMessageS2CPacket)怀;
            if (怀.comp_760().toString().contains("000000000")) {
               怀 怀 = 怀.comp_833().getString();
               if (怀.contains("left")) {
                  怀 怀 = false;
                  怀 怀 = 怀.substring(0, 怀.indexOf(" "));
                  Iterator var7 = 怀.mc.world.getPlayers().iterator();

                  label42: {
                     PlayerEntity 怀;
                     do {
                        if (!var7.hasNext()) {
                           break label42;
                        }

                        怀 = (PlayerEntity)var7.next();
                     } while(!怀.getEntityName().equals(怀) && !怀.getDisplayName().getString().contains(怀));

                     怀 = true;
                  }

                  if (怀) {
                     怀.sendLeaveMsg(怀);
                  }
               }
            }
         }

         if (怀 instanceof PlayerListS2CPacket) {
            怀 怀 = (PlayerListS2CPacket)怀;
            if (怀.getAction() == class_5893.ADD_PLAYER) {
               怀 怀 = (class_2705)怀.getEntries().get(0);
               if (怀 != null) {
                  怀 怀 = 怀.getProfile().getName();
                  if (怀 != null) {
                     怀.sendJoinMsg(怀);
                  }
               }
            }
         }

      }
   }

   private void queueMsg(String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      long var4 = (long)((Integer)怀.fd_Setting_74.get() * 1000);

      try {
         Thread.sleep(var4);
      } catch (Exception var3) {
         Ion.log("Welcomer error: " + var3);
      }

      sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.sendMessage(怀);
   }

   public Welcomer() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super(Class68.fd_Category_1059, "welcomer", "Sends a message when somebody joins or leaves the server.");
      怀.fd_Executor_71 = Executors.newSingleThreadExecutor();
      怀.fd_SettingGroup_75 = 怀.settings.getDefaultGroup();
      怀.fd_Setting_74 = 怀.fd_SettingGroup_75.add(((Builder)((Builder)((Builder)(new Builder()).name("delay")).description("The delay between sending messages.")).defaultValue(1)).min(1).sliderMax(10).max(10).build());
      怀.fd_Setting_73 = 怀.fd_SettingGroup_75.add(((meteordevelopment.meteorclient.settings.StringListSetting.Builder)((meteordevelopment.meteorclient.settings.StringListSetting.Builder)((meteordevelopment.meteorclient.settings.StringListSetting.Builder)(new meteordevelopment.meteorclient.settings.StringListSetting.Builder()).name("join-messages")).description("Messages to send when a player joins.")).defaultValue(Collections.emptyList())).build());
      怀.IJLjjjLLiLlLJLjjLLIJljJ = 怀.fd_SettingGroup_75.add(((meteordevelopment.meteorclient.settings.StringListSetting.Builder)((meteordevelopment.meteorclient.settings.StringListSetting.Builder)((meteordevelopment.meteorclient.settings.StringListSetting.Builder)(new meteordevelopment.meteorclient.settings.StringListSetting.Builder()).name("leave-messages")).description("Messages to send when a player leaves.")).defaultValue(Collections.emptyList())).build());
      怀.fd_Setting_70 = 怀.fd_SettingGroup_75.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("clientside")).description("Whether or not the messages are sent clientside.")).defaultValue(false)).build());
   }

   private void sendLeaveMsg(String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (!((List)怀.IJLjjjLLiLlLJLjjLLIJljJ.get()).isEmpty()) {
         怀 怀 = (String)((List)怀.IJLjjjLLiLlLJLjjLLIJljJ.get()).get((new Random()).nextInt(((List)怀.IJLjjjLLiLlLJLjjLLIJljJ.get()).size()));
         怀 = 怀.replace("{player}", 怀);
         if (!(Boolean)怀.fd_Setting_70.get()) {
            怀.fd_Executor_71.execute(() -> {
               String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
               怀x.queueMsg(怀);
            });
         } else {
            怀.info(怀, new Object[0]);
         }

      }
   }
}
