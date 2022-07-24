/* Decompiler 4ms, total 138ms, lines 48 */
package me.ghosttypes.ion.modules.autopvp;

import java.util.Iterator;
import me.ghosttypes.ion.Ion;
import meteordevelopment.meteorclient.MeteorClient;
import net.minecraft.entity.player.PlayerEntity;

public class CommandParser {
   public static PlayerEntity getPlayerFromName(String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      Iterator var1 = MeteorClient.mc.world.getPlayers().iterator();

      PlayerEntity 怀;
      do {
         if (!var1.hasNext()) {
            return null;
         }

         怀 = (PlayerEntity)var1.next();
      } while(!怀.getEntityName().equalsIgnoreCase(怀));

      return 怀;
   }

   public static String[] parseCommand(String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 = 怀.stripLeading();
      if (怀.startsWith("attack")) {
         怀 怀 = 怀.split("attack ")[1];
         var10000 = 怀;

         try {
            return getPlayerFromName(var10000) != null ? new String[]{"follow", 怀} : new String[]{"error", "target not found"};
         } catch (Exception var5) {
            Ion.log("PvP Bot | Attack Command | Error: " + var5);
            return new String[]{"error", "Invalid syntax"};
         }
      } else {
         return new String[]{"error", "Unknown or invalid command"};
      }
   }

   public CommandParser() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }
}
