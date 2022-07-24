/* Decompiler 5ms, total 141ms, lines 64 */
package me.ghosttypes.ion.utils.combat;

import java.util.ArrayList;
import me.ghosttypes.ion.modules.combat.AnvilAura;
import me.ghosttypes.ion.modules.combat.AnvilAura.LegacyMode;
import me.ghosttypes.ion.utils.world.Class57;
import meteordevelopment.meteorclient.systems.modules.Modules;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.AbstractPressurePlateBlock;
import net.minecraft.block.AbstractButtonBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class Class6 {
   public static final ArrayList<Vec3d> sssSsSsSsSSSsSssSSssSSSSsSSSSssSSSSsSSsssSsSSssSsSsS;
   public static final ArrayList<Vec3d> fd_ArrayList_890;
   public static final ArrayList<Vec3d> fd_ArrayList_891;

   static {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      sssSsSsSsSSSsSssSSssSSSSsSSSSssSSSSsSSsssSsSSssSsSsS = new Class12_ArrayList();
      fd_ArrayList_890 = new Class10_ArrayList();
      fd_ArrayList_891 = new Class7_ArrayList();
   }

   public static ArrayList<Vec3d> getDesign(PlayerEntity 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = (AnvilAura)Modules.get().get(AnvilAura.class);
      怀 怀 = (LegacyMode)怀.fd_Setting_125.get();
      怀 怀 = new ArrayList();
      switch(Class9.sSsSSSSsSSSssssssSsSSSsSssSSssSSSSSSSSSssSsssSSSSsSSssSSSssSSSSsSsSsSSSSsSssSSSSsSsSSsSSsSSsSsssSSssssSs[怀.ordinal()]) {
      case 1:
         怀.addAll(fd_ArrayList_890);
         break;
      case 2:
         怀.addAll(fd_ArrayList_891);
      }

      return 怀;
   }

   public static int getLegacyAnvilPos(LegacyMode 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      switch(Class9.sSsSSSSsSSSssssssSsSSSsSssSSssSSSSSSSSSssSsssSSSSsSSssSSSssSSSSsSsSsSSSSsSssSSSSsSsSSsSSsSSsSsssSSssssSs[怀.ordinal()]) {
      case 1:
         return 3;
      case 2:
         return 4;
      default:
         return 0;
      }
   }

   public Class6() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }

   public static boolean isValidFloorBlock(BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return Class57.getBlock(怀) instanceof AbstractButtonBlock || Class57.getBlock(怀) instanceof AbstractPressurePlateBlock;
   }
}
