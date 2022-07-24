/* Decompiler 10ms, total 150ms, lines 56 */
package me.ghosttypes.ion.commands;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;
import meteordevelopment.meteorclient.systems.commands.Command;
import meteordevelopment.meteorclient.utils.network.MeteorExecutor;
import meteordevelopment.meteorclient.utils.player.ChatUtils;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.command.CommandSource;

public class Class2_Command extends Command {
   public static Consumer<PlayerEntity> downloadSkin() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return (param0) -> {
         // $FF: Couldn't be decompiled
      };
   }

   public Class2_Command() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super("dumpskins", "Save the skins for all online players", new String[0]);
   }

   public void build(LiteralArgumentBuilder<CommandSource> 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀.executes((var0) -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         怀 怀 = new ArrayList();
         Iterator var2 = mc.world.getEntities().iterator();

         while(var2.hasNext()) {
            怀 怀x = (Entity)var2.next();
            if (怀x instanceof PlayerEntity) {
               怀.add((PlayerEntity)怀x);
            }
         }

         ChatUtils.info("Downloading " + 怀.size() + " skins.", new Object[0]);
         var2 = 怀.iterator();

         while(var2.hasNext()) {
            怀 怀xx = (PlayerEntity)var2.next();
            MeteorExecutor.execute(() -> {
               String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
               downloadSkin().accept(怀xx);
            });
         }

         return 1;
      });
   }
}
