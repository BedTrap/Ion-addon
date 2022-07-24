/* Decompiler 7ms, total 147ms, lines 34 */
package me.ghosttypes.ion.commands;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import me.ghosttypes.ion.modules.autopvp.AutoPVP;
import meteordevelopment.meteorclient.systems.commands.Command;
import meteordevelopment.meteorclient.systems.commands.arguments.PlayerArgumentType;
import meteordevelopment.meteorclient.systems.modules.Modules;
import net.minecraft.command.CommandSource;

public class Class1_Command extends Command {
   public void build(LiteralArgumentBuilder<CommandSource> 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀.then(argument("player", PlayerArgumentType.player()).executes((怀x) -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         怀 怀xx = PlayerArgumentType.getPlayer(怀x);
         怀 怀xxx = (AutoPVP)Modules.get().get(AutoPVP.class);
         怀xxx.ツシゾンツソヅゾゾンジゾソシシジツソゾシヅツンゾゾツシツゾヅゾゾソシゾンヅジジソンゾソツジジゾゾヅンゾソソツツツンツツンゾシシシゾヅシジシツソソシヅヅジンソジジシヅンツンヅシ.set(怀xx.getEntityName());
         if (怀xxx.isActive()) {
            怀xxx.toggle();
            怀xxx.toggle();
         } else {
            怀xxx.toggle();
         }

         return 1;
      }));
   }

   public Class1_Command() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super("autopvp", "Set autopvp's current target.", new String[0]);
   }
}
