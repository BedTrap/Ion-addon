/* Decompiler 4ms, total 591ms, lines 70 */
package me.ghosttypes.ion;

import java.io.File;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import me.ghosttypes.ion.utils.Class68;
import me.ghosttypes.ion.utils.sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.hud.HudGroup;
import meteordevelopment.meteorclient.systems.modules.Modules;
import net.fabricmc.loader.api.FabricLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ion extends MeteorAddon {
   public static final File JjLiLjljljIlILiLiJIlljIjjlIliIlIIjjJjLiJLjiIilJLIjLIJJJILLilJLJlIiiLJjljlJL;
   public static final File fd_File_1;
   public static final HudGroup fd_HudGroup_2;
   public static final String fd_String_3;
   public static final Logger fd_Logger_4;

   public static void log(String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_Logger_4.info("[Ion] " + 怀);
   }

   static {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_String_3 = "1.4.2";
      fd_Logger_4 = LogManager.getLogger();
      JjLiLjljljIlILiLiJIlljIjjlIliIlIIjjJjLiJLjiIilJLIjLIJJJILLilJLJlIiiLJjljlJL = new File(System.getProperty("user.home"), "Ion");
      fd_File_1 = new File(FabricLoader.getInstance().getGameDir().toString(), "ion-addon");
      fd_HudGroup_2 = new HudGroup("Ion");
   }

   public void onRegisterCategories() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      Modules.registerCategory(Class68.fd_Category_1060);
      Modules.registerCategory(Class68.fd_Category_1059);
      Modules.registerCategory(Class68.fd_Category_1062);
   }

   public Ion() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }

   public void onInitialize() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = System.currentTimeMillis();
      log("Loading...");
      log("Thank you to everyone who donated to Ion. It was a fun but my time has come - GhostTypes");
      log("I guess I'm here now. Let's try and make it good while it lasts - Wide_Cat");
      if (!fd_File_1.exists()) {
         fd_File_1.mkdirs();
      }

      if (!JjLiLjljljIlILiLiJIlljIjjlIliIlIIjjJjLiJLjiIilJLIjLIJJJILLilJLJlIiiLJjljlJL.exists()) {
         JjLiLjljljIlILiLiJIlljIjjlIliIlIIjjJjLiJLjiIilJLIjLIJJJILLilJLJlIiiLJjljlJL.mkdirs();
      }

      MeteorClient.EVENT_BUS.registerLambdaFactory("me.ghosttypes.ion", (怀x, 怀xx) -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         return (Lookup)怀x.invoke((Object)null, 怀xx, MethodHandles.lookup());
      });
      sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.init(怀);
   }
}
