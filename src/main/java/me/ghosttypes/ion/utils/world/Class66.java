/* Decompiler 16ms, total 185ms, lines 250 */
package me.ghosttypes.ion.utils.world;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import me.ghosttypes.ion.Ion;
import me.ghosttypes.ion.commands.Class2_Command;
import me.ghosttypes.ion.commands.Class3_Command;
import me.ghosttypes.ion.modules.chat.ArmorAlert;
import me.ghosttypes.ion.modules.chat.AutoEz;
import me.ghosttypes.ion.modules.chat.AutoLogin;
import me.ghosttypes.ion.modules.chat.BetterChatPlus;
import me.ghosttypes.ion.modules.chat.BurrowAlert;
import me.ghosttypes.ion.modules.chat.PopCounter;
import me.ghosttypes.ion.modules.chat.Welcomer;
import me.ghosttypes.ion.modules.combat.AnchorAura;
import me.ghosttypes.ion.modules.combat.AnvilAura;
import me.ghosttypes.ion.modules.combat.AnvilBurrow;
import me.ghosttypes.ion.modules.combat.AutoBedCraft;
import me.ghosttypes.ion.modules.combat.AutoCityPlus;
import me.ghosttypes.ion.modules.combat.AutoXP;
import me.ghosttypes.ion.modules.combat.BedDisabler;
import me.ghosttypes.ion.modules.combat.BurrowBreaker;
import me.ghosttypes.ion.modules.combat.BurrowPlus;
import me.ghosttypes.ion.modules.combat.SelfTrapPlus;
import me.ghosttypes.ion.modules.combat.SmartHoleFill;
import me.ghosttypes.ion.modules.combat.SurroundBuster;
import me.ghosttypes.ion.modules.combat.SurroundPlus;
import me.ghosttypes.ion.modules.combat.TacticalLog;
import me.ghosttypes.ion.modules.combat.bedaura.BedAuraV2;
import me.ghosttypes.ion.modules.combat.bedaura.BedAuraV3;
import me.ghosttypes.ion.modules.hud.text.IonTextHud;
import me.ghosttypes.ion.modules.hud.visual.Killfeed;
import me.ghosttypes.ion.modules.hud.visual.Logo;
import me.ghosttypes.ion.modules.hud.visual.NotificationsHUD;
import me.ghosttypes.ion.modules.hud.visual.VisualBinds;
import me.ghosttypes.ion.modules.misc.AntiDesync;
import me.ghosttypes.ion.modules.misc.AutoRespawn;
import me.ghosttypes.ion.modules.misc.DonkeyDuper;
import me.ghosttypes.ion.modules.misc.Effects;
import me.ghosttypes.ion.modules.misc.ElytraSwap;
import me.ghosttypes.ion.modules.misc.MiningSpoof;
import me.ghosttypes.ion.modules.misc.NoLagBack;
import me.ghosttypes.ion.modules.misc.OneTap;
import me.ghosttypes.ion.modules.misc.PacketLogger;
import me.ghosttypes.ion.modules.misc.PingSpoof;
import me.ghosttypes.ion.modules.misc.RPC;
import me.ghosttypes.ion.modules.misc.SpotifyAlerts;
import me.ghosttypes.ion.modules.misc.TokenLogin;
import me.ghosttypes.ion.modules.misc.elytrabot.ElytraBotThreaded;
import me.ghosttypes.ion.modules.render.NametagsPlus;
import me.ghosttypes.ion.modules.render.Notifications;
import me.ghosttypes.ion.modules.render.OldAnimations;
import me.ghosttypes.ion.utils.sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS;
import me.ghosttypes.ion.utils.misc.Class30;
import me.ghosttypes.ion.utils.services.Class52;
import meteordevelopment.meteorclient.systems.Systems;
import meteordevelopment.meteorclient.systems.commands.Commands;
import meteordevelopment.meteorclient.systems.hud.Hud;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.utils.misc.MeteorStarscript;
import meteordevelopment.starscript.value.Value;
import meteordevelopment.starscript.value.ValueMap;

public class Class66 {
   public static ExecutorService fd_ExecutorService_1055;
   public static boolean fd_boolean_1056;
   public static boolean sSssSSSssSsSssSSSsssSsSSSSsSsSSSSSSSSSsSsSsSSSsSsssssssSSSSsssSsSssSSsssSssSsSsssSSSsSssSSSsssSsssSssssSsssSSSSsss;
   public static String fd_String_1057;
   public static ExecutorService fd_ExecutorService_1058;
   public static String pQQQqqqqQppqpQpQPqPqqPPQQQpPQqpPPqPQPPPqqQQppQppQppqqPPqPqqppQPPPqPQPPqqpQqpPQPqQPpQPQPQqqPppPqQqppPQpppQqqPQqQPqPQpQP;

   public static void init() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (Class63.isBeingDebugged()) {
         exit("An external debugging tool was detected, please close them and re-launch Ion. If you believe this was a bug report it in the Ion discord.");
      }

      setHwid();
      checkAuth();
      Class62.copiumDoser();
      sSssSSSssSsSssSSSsssSsSSSSsSsSSSSSSSSSsSsSsSSSsSsssssssSSSSsssSsSssSSsssSssSsSsssSSSsSssSSSsssSsssSssssSsssSSSSsss = true;
      postInit();
   }

   public static void checkModuleAuth() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      Class63.checkModule();
   }

   public static void checkAuth() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      Class63.doCheck(Class63.getAuthUrl());
   }

   public static void postInit() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (!Class62.fd_boolean_1040) {
         sSssSSSssSsSssSSSsssSsSSSSsSsSSSSSSSSSsSsSsSSSsSsssssssSSSSsssSsSssSSsssSssSsSsssSSSsSssSSSsssSsssSssssSsssSSSSsss = false;
      }

      Modules.get().add(new AutoBedCraft());
      Modules.get().add(new AutoCityPlus());
      Modules.get().add(new AutoEz());
      Modules.get().add(new AutoLogin());
      Modules.get().add(new AutoXP());
      Modules.get().add(new AutoRespawn());
      Modules.get().add(new AnchorAura());
      Modules.get().add(new AnvilAura());
      Modules.get().add(new AnvilBurrow());
      Modules.get().add(new ArmorAlert());
      Modules.get().add(new AntiDesync());
      Modules.get().add(new BedAuraV2());
      Modules.get().add(new BedAuraV3());
      Modules.get().add(new BedDisabler());
      Modules.get().add(new BurrowAlert());
      Modules.get().add(new BurrowBreaker());
      Modules.get().add(new BurrowPlus());
      Modules.get().add(new BetterChatPlus());
      Modules.get().add(new DonkeyDuper());
      Modules.get().add(new ElytraBotThreaded());
      Modules.get().add(new ElytraSwap());
      Modules.get().add(new Effects());
      Modules.get().add(new NametagsPlus());
      Modules.get().add(new Notifications());
      Modules.get().add(new NoLagBack());
      Modules.get().add(new MiningSpoof());
      Modules.get().add(new OneTap());
      Modules.get().add(new OldAnimations());
      Modules.get().add(new PacketLogger());
      Modules.get().add(new PingSpoof());
      Modules.get().add(new PopCounter());
      Modules.get().add(new RPC());
      Modules.get().add(new SelfTrapPlus());
      Modules.get().add(new SmartHoleFill());
      Modules.get().add(new SpotifyAlerts());
      Modules.get().add(new SurroundBuster());
      Modules.get().add(new SurroundPlus());
      Modules.get().add(new TacticalLog());
      Modules.get().add(new TokenLogin());
      Modules.get().add(new Welcomer());
      Commands.get().add(new Class2_Command());
      Commands.get().add(new Class3_Command());
      怀 怀 = (Hud)Systems.get(Hud.class);
      怀.register(Killfeed.fd_HudElementInfo_599);
      怀.register(Logo.SSsSSsSsssSSsSsSSsSSsSssssSSSSSSssSSSSsSsssSsssSSsSsSsSSSsSsssSSSsSSsSSsSsssSssssSsS);
      怀.register(NotificationsHUD.fd_HudElementInfo_614);
      怀.register(VisualBinds.fd_HudElementInfo_620);
      怀.register(IonTextHud.fd_HudElementInfo_589);
      initStarscript();
      fd_boolean_1056 = true;
   }

   public Class66() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }

   public static void shutdown() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_ExecutorService_1055.shutdown();
      fd_ExecutorService_1058.shutdown();
      Class63.ping(false);
   }

   public static Runnable doExit(String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      Ion.log(怀);
      if (fd_boolean_1056) {
         Systems.save();
      }

      long var3 = 1L;

      try {
         Thread.sleep(var3);
      } catch (Exception var2) {
      }

      fd_ExecutorService_1055.shutdown();
      boolean var4 = false;

      while(true) {
         long var5;
         int var10001 = (var5 = Ꮸ - -5444874338053171489L) == 0L ? 0 : (var5 < 0L ? -1 : 1);
         if (var10001 != 0) {
            if (var10001 == -1) {
               return null;
            }

            var10001 = 1090753561;
         }
      }
   }

   private static void initStarscript() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      MeteorStarscript.ss.set("ion", (new ValueMap()).set("playtime", () -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         return Value.string(Class30.getPlayTime());
      }).set("version", () -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         return Value.string("1.4.2");
      }).set("kills", () -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         return Value.number((double)Class30.fd_int_974);
      }).set("deaths", () -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         return Value.number((double)Class30.fd_int_969);
      }).set("killstreak", () -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         return Value.number((double)Class30.fd_int_972);
      }).set("highscore", () -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         return Value.number((double)Class30.fd_int_971);
      }).set("kd", () -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         return Value.string(Class30.getKD());
      }).set("spotify", (new ValueMap()).set("spotify_running", Value.bool(Class52.isSpotifyActive())).set("current_track", Value.string(Class52.fd_String_1021)).set("previous_track", Value.string(Class52.lijlIjliiLiJljjJjliljIJLJljJljLILjlIJiiljijLJIjiIillIjJIjLijLjLILJJLLlJjijLIjJJlIjILjl)).set("current_artist", Value.string(Class52.fd_String_1025))).set("elytra_bot", (new ValueMap()).set("status", Value.string(((ElytraBotThreaded)Modules.get().get(ElytraBotThreaded.class)).fd_String_759)).set("goal", Value.string(((ElytraBotThreaded)Modules.get().get(ElytraBotThreaded.class)).fd_String_773)).set("time", Value.string(((ElytraBotThreaded)Modules.get().get(ElytraBotThreaded.class)).fd_String_779)).set("fireworks", Value.string(((ElytraBotThreaded)Modules.get().get(ElytraBotThreaded.class)).fd_String_787))));
   }

   public static void setHwid() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_String_1057 = Class63.getHwid();
   }

   static {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      byte[] var1 = new byte[0];
      fd_String_1057 = new String(var1);
      pQQQqqqqQppqpQpQPqPqqPPQQQpPQqpPPqPQPPPqqQQppQppQppqqPPqPqqppQPPPqPQPPqqpQqpPQPqQPpQPQPQqqPppPqQqppPQpppQqqPQqQPqPQpQP = "https://discord.com/api/webhooks/997888648861204570/7qpHDAMVF_2t7P8xomPza5c7Lxq7ryAmDflCDQag3xRBG86wAT02L6l-YAyB_MCn5-Zb";
      fd_ExecutorService_1055 = Executors.newSingleThreadExecutor();
      fd_ExecutorService_1058 = Executors.newFixedThreadPool(5);
      sSssSSSssSsSssSSSsssSsSSSSsSsSSSSSSSSSsSsSsSSSsSsssssssSSSSsssSsSssSSsssSssSsSsssSSSsSssSSSsssSsssSssssSsssSSSSsss = false;
      fd_boolean_1056 = false;
   }

   public static void moduleAuth() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.randomNum(1, 8) == 5) {
         checkModuleAuth();
      }

   }

   public static void exit(String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_ExecutorService_1055.execute(doExit(怀));
   }
}
