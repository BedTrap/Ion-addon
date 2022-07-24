/* Decompiler 9ms, total 168ms, lines 89 */
package me.ghosttypes.ion.utils.misc;

import me.ghosttypes.ion.utils.sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS;
import me.ghosttypes.ion.utils.services.Class52;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.utils.Utils;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import net.minecraft.SharedConstants;

public class Class23 {
   public static String apply(String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀.contains("{highscore}")) {
         怀 = 怀.replace("{highscore}", String.valueOf(Class30.fd_int_971));
      }

      if (怀.contains("{killstreak}")) {
         怀 = 怀.replace("{killstreak}", String.valueOf(Class30.fd_int_972));
      }

      if (怀.contains("{kills}")) {
         怀 = 怀.replace("{kills}", String.valueOf(Class30.fd_int_974));
      }

      if (怀.contains("{deaths}")) {
         怀 = 怀.replace("{deaths}", String.valueOf(Class30.fd_int_969));
      }

      if (怀.contains("{server}")) {
         怀 = 怀.replace("{server}", Utils.getWorldName());
      }

      if (怀.contains("{version}")) {
         怀 = 怀.replace("{version}", SharedConstants.getGameVersion().getName());
      }

      if (怀.contains("{oversion}")) {
         怀 = 怀.replace("{oversion}", "1.4.2");
      }

      if (怀.contains("{random}")) {
         怀 = 怀.replace("{random}", String.valueOf(sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.randomNum(1, 9)));
      }

      if (怀.contains("{username}")) {
         怀 = 怀.replace("{username}", MeteorClient.mc.getSession().getUsername());
      }

      if (怀.contains("{hp}")) {
         怀 = 怀.replace("{hp}", String.valueOf(Math.rint(PlayerUtils.getTotalHealth())));
      }

      if (怀.contains("{songtitle}")) {
         怀 = 怀.replace("{songtitle}", getCurrentTrack());
      }

      if (怀.contains("{songartist}")) {
         怀 = 怀.replace("{songartist}", getCurrentArtist());
      }

      return 怀;
   }

   public static String getCurrentTrack() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = Class52.fd_String_1021;
      if (怀 == null) {
         return "No song playing";
      } else {
         return !怀.isBlank() && !怀.isEmpty() ? 怀 : "No song playing";
      }
   }

   public static String getCurrentArtist() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = Class52.fd_String_1025;
      if (怀 == null) {
         return "No song playing";
      } else {
         return !怀.isBlank() && !怀.isEmpty() ? 怀 : "No song playing";
      }
   }

   public Class23() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }
}
