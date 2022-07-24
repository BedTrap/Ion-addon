/* Decompiler 16ms, total 160ms, lines 200 */
package me.ghosttypes.ion.modules.misc;

import java.util.Collections;
import java.util.List;
import me.ghosttypes.ion.utils.Class68;
import me.ghosttypes.ion.utils.sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS;
import me.ghosttypes.ion.utils.misc.Class23;
import me.ghosttypes.ion.utils.misc.Class32;
import me.ghosttypes.ion.utils.services.Class52;
import me.ghosttypes.ion.utils.world.Class66;
import meteordevelopment.discordipc.DiscordIPC;
import meteordevelopment.discordipc.RichPresence;
import meteordevelopment.meteorclient.events.world.TickEvent.Post;
import meteordevelopment.meteorclient.gui.WidgetScreen;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.StringListSetting.Builder;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.systems.modules.misc.DiscordPresence;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.SharedConstants;
import net.minecraft.client.gui.screen.LevelLoadingScreen;
import net.minecraft.client.gui.screen.option.ChatOptionsScreen;
import net.minecraft.client.gui.screen.ConnectScreen;
import net.minecraft.client.gui.screen.option.AccessibilityOptionsScreen;
import net.minecraft.client.gui.screen.DirectConnectScreen;
import net.minecraft.client.gui.screen.AddServerScreen;
import net.minecraft.client.gui.screen.option.LanguageOptionsScreen;
import net.minecraft.client.gui.screen.option.OptionsScreen;
import net.minecraft.client.gui.screen.option.SkinOptionsScreen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.screen.option.SoundOptionsScreen;
import net.minecraft.client.gui.screen.CreditsScreen;
import net.minecraft.client.gui.screen.option.VideoOptionsScreen;
import net.minecraft.client.gui.screen.option.ControlsOptionsScreen;
import net.minecraft.client.realms.gui.screen.RealmsScreen;
import net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen;
import net.minecraft.client.gui.screen.world.EditGameRulesScreen;
import net.minecraft.client.gui.screen.world.EditWorldScreen;
import net.minecraft.client.gui.screen.world.CreateWorldScreen;
import net.minecraft.client.gui.screen.world.SelectWorldScreen;
import net.minecraft.client.gui.screen.pack.PackScreen;

public class RPC extends Module {
   public final Setting<List<String>> fd_Setting_739;
   public final Setting<Integer> fd_Setting_740;
   public final Setting<List<String>> fd_Setting_741;
   private static final RichPresence fd_RichPresence_742;
   private final SettingGroup QQPQqQQQpQpQPqpQq;
   public static int fd_int_743;
   public final Setting<Boolean> fd_Setting_744;
   public static int SSSsSSSsssSssSSSSSsSSs;
   public static int fd_int_745;

   public String getCurrentScreen() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀.mc.currentScreen instanceof TitleScreen) {
         return "Looking at title screen";
      } else if (怀.mc.currentScreen instanceof SelectWorldScreen) {
         return "Selecting world";
      } else if (!(怀.mc.currentScreen instanceof CreateWorldScreen) && !(怀.mc.currentScreen instanceof EditGameRulesScreen)) {
         if (怀.mc.currentScreen instanceof EditWorldScreen) {
            return "Editing world";
         } else if (怀.mc.currentScreen instanceof LevelLoadingScreen) {
            return "Loading world";
         } else if (怀.mc.currentScreen instanceof MultiplayerScreen) {
            return "Selecting server";
         } else if (怀.mc.currentScreen instanceof AddServerScreen) {
            return "Adding server";
         } else if (!(怀.mc.currentScreen instanceof ConnectScreen) && !(怀.mc.currentScreen instanceof DirectConnectScreen)) {
            if (怀.mc.currentScreen instanceof WidgetScreen) {
               return "Browsing Meteor's GUI";
            } else if (!(怀.mc.currentScreen instanceof OptionsScreen) && !(怀.mc.currentScreen instanceof SkinOptionsScreen) && !(怀.mc.currentScreen instanceof SoundOptionsScreen) && !(怀.mc.currentScreen instanceof VideoOptionsScreen) && !(怀.mc.currentScreen instanceof ControlsOptionsScreen) && !(怀.mc.currentScreen instanceof LanguageOptionsScreen) && !(怀.mc.currentScreen instanceof ChatOptionsScreen) && !(怀.mc.currentScreen instanceof PackScreen) && !(怀.mc.currentScreen instanceof AccessibilityOptionsScreen)) {
               if (怀.mc.currentScreen instanceof CreditsScreen) {
                  return "Reading credits";
               } else if (怀.mc.currentScreen instanceof RealmsScreen) {
                  return "Browsing Realms";
               } else {
                  怀 怀 = 怀.mc.currentScreen.getClass().getName();
                  if (怀.startsWith("com.terraformersmc.modmenu.gui")) {
                     return "Browsing mods";
                  } else {
                     return 怀.startsWith("me.jellysquid.mods.sodium.client") ? "Changing options" : "none";
                  }
               }
            } else {
               return "Changing options";
            }
         } else {
            return "Connecting to server";
         }
      } else {
         return "Creating world";
      }
   }

   static {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_int_743 = 0;
      fd_int_745 = 0;
      fd_RichPresence_742 = new RichPresence();
   }

   public RPC() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super(Class68.fd_Category_1062, "RPC", "Ion RPC for Discord!");
      怀.QQPQqQQQpQpQPqpQq = 怀.settings.getDefaultGroup();
      怀.fd_Setting_741 = 怀.QQPQqQQQpQpQPqpQq.add(((Builder)((Builder)((Builder)(new Builder()).name("line-1")).description("Messages for the first RPC line.")).defaultValue(Collections.emptyList())).build());
      怀.fd_Setting_739 = 怀.QQPQqQQQpQpQPqpQq.add(((Builder)((Builder)((Builder)(new Builder()).name("line-2")).description("Messages for the second RPC line.")).defaultValue(Collections.emptyList())).build());
      怀.fd_Setting_740 = 怀.QQPQqQQQpQpQPqpQq.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("update-delay")).description("How many seconds before switching to a new RPC message.")).defaultValue(5)).min(0).sliderMax(30).build());
      怀.fd_Setting_744 = 怀.QQPQqQQQpQpQPqpQq.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("show-spotify")).description("Show what you are listening to on Spotify.")).defaultValue(false)).build());
      怀.runInMainMenu = true;
   }

   @EventHandler
   public void onTick(Post 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (SSSsSSSsssSssSSSSSsSSs <= 0) {
         怀.updateRPC();
         SSSsSSSsssSssSSSSSsSSs = (Integer)怀.fd_Setting_740.get();
      } else {
         --SSSsSSSsssSssSSSSSsSSs;
      }

   }

   public void updateRPC() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = (List)怀.fd_Setting_741.get();
      怀 怀 = (List)怀.fd_Setting_739.get();
      if (怀.isEmpty() || 怀.isEmpty()) {
         怀.add("{username} | {hp}");
         怀.add("Winning with the power of Ion!");
      }

      String 怀;
      String 怀;
      int 怀;
      if (!怀.isInGame()) {
         怀 = "Ion 1.4.2";
         怀 怀 = 怀.getCurrentScreen();
         if (!怀.equals("none")) {
            怀 = 怀;
         } else {
            怀 = "Minecraft " + SharedConstants.getGameVersion().getName();
         }
      } else {
         if (fd_int_743 >= 怀.size()) {
            fd_int_743 = 0;
         }

         if (fd_int_745 >= 怀.size()) {
            fd_int_745 = 0;
         }

         怀 = fd_int_743++;
         怀 怀 = fd_int_745++;
         怀 = Class23.apply((String)怀.get(怀));
         怀 = Class23.apply((String)怀.get(怀));
      }

      怀 = sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.randomNum(1, 3);
      if (怀 == 1 && Class52.fd_boolean_1024 && (Boolean)怀.fd_Setting_744.get()) {
         fd_RichPresence_742.setDetails(Class23.apply("Listening to {songtitle}"));
         fd_RichPresence_742.setState(Class23.apply("By {songartist}"));
      } else {
         fd_RichPresence_742.setDetails(Class23.apply(怀));
         fd_RichPresence_742.setState(Class23.apply(怀));
      }

      DiscordIPC.setActivity(fd_RichPresence_742);
   }

   public boolean isInGame() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return 怀.mc.world != null && 怀.mc.player != null;
   }

   public void onActivate() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      Class66.moduleAuth();
      if (Modules.get().isActive(DiscordPresence.class)) {
         怀.error("Default Meteor RPC is already enabled! Overriding.", new Object[0]);
         ((DiscordPresence)Modules.get().get(DiscordPresence.class)).toggle();
      }

      SSSsSSSsssSssSSSSSsSSs = Class32.intToTicks((Integer)怀.fd_Setting_740.get());
      DiscordIPC.start(882748200744783913L, (Runnable)null);
      fd_RichPresence_742.setStart(System.currentTimeMillis() / 1000L);
      fd_RichPresence_742.setLargeImage("ion", "Ion 1.4.2");
      怀.updateRPC();
   }

   public void onDeactivate() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      DiscordIPC.stop();
   }
}
