/* Decompiler 7ms, total 148ms, lines 25 */
package me.ghosttypes.ion.commands;

import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import me.ghosttypes.ion.utils.misc.Class22;
import meteordevelopment.meteorclient.systems.commands.Command;
import net.minecraft.command.CommandSource;

public class Class3_Command extends Command {
   public void build(LiteralArgumentBuilder<CommandSource> 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀.then(argument("name", StringArgumentType.word()).executes((怀x) -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         怀 怀xxx = StringArgumentType.getString(怀x, "name");
         怀.info("'" + 怀xxx + "' translates to: " + Class22.vaugeMap(怀xxx), new Object[0]);
         return 1;
      }));
   }

   public Class3_Command() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super("id", "Deobfuscate mojang's obfuscation to yarn mappings.", new String[]{"deobf"});
   }
}
