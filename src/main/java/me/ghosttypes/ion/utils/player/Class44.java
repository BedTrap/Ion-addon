/* Decompiler 24ms, total 167ms, lines 253 */
package me.ghosttypes.ion.utils.player;

import java.util.ArrayList;
import java.util.Iterator;
import me.ghosttypes.ion.utils.sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS;
import me.ghosttypes.ion.utils.world.Class57;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.utils.player.Rotations;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.class_2847;

public class Class44 {
   public static int fd_int_1007;
   public static ArrayList<Vec3d> fd_ArrayList_1008;
   public static ArrayList<Vec3d> fd_ArrayList_1009;

   public static boolean isBurrowed(PlayerEntity 怀, boolean 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = 怀.getBlockPos();
      if (怀 && !sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.isInHole(怀)) {
         return false;
      } else {
         return Class57.getBlock(怀) == Blocks.ENDER_CHEST || Class57.getBlock(怀) == Blocks.OBSIDIAN || isAnvilBlock(怀);
      }
   }

   public Class44() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }

   public static void doRegularMine(BlockPos 怀, boolean 怀, int 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = false;
      if (怀 && fd_int_1007 <= 0) {
         fd_int_1007 = 5;
         怀 = true;
      } else {
         --fd_int_1007;
      }

      if (怀) {
         Rotations.rotate(Rotations.getYaw(怀), Rotations.getPitch(怀), 怀, () -> {
            String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
            sendRegularMine(怀);
         });
      } else {
         sendRegularMine(怀);
      }

   }

   public static boolean isSurroundBlock(BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return Class57.getBlock(怀) == Blocks.OBSIDIAN || Class57.getBlock(怀) == Blocks.ENDER_CHEST || Class57.getBlock(怀) == Blocks.RESPAWN_ANCHOR;
   }

   public static boolean isSelfTrapped(PlayerEntity 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = 怀.getBlockPos();
      Iterator var2 = fd_ArrayList_1008.iterator();

      BlockPos 怀;
      do {
         if (!var2.hasNext()) {
            return true;
         }

         怀 怀 = (Vec3d)var2.next();
         怀 = 怀.add(怀.x, 怀.y, 怀.z);
      } while(Class57.isAir(怀));

      return false;
   }

   public static BlockPos getStringPos(PlayerEntity 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = 怀.getBlockPos();
      Iterator var2 = fd_ArrayList_1009.iterator();

      BlockPos 怀;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         怀 怀 = (Vec3d)var2.next();
         怀 = 怀.add(怀.x, 怀.y, 怀.z);
      } while(!isWeb(怀));

      return 怀;
   }

   static {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_int_1007 = 0;
      fd_ArrayList_1009 = new Class45_ArrayList();
      fd_ArrayList_1008 = new Class48_ArrayList();
   }

   public static ArrayList<BlockPos> getSurroundBlocks(PlayerEntity 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = new ArrayList();
      怀 怀 = 怀.getBlockPos();
      Iterator var3 = fd_ArrayList_1009.iterator();

      while(var3.hasNext()) {
         怀 怀 = (Vec3d)var3.next();
         怀 怀 = 怀.add(怀.x, 怀.y, 怀.z);
         if (isTrapBlock(怀)) {
            怀.add(怀);
         }
      }

      if (怀.isEmpty()) {
         return null;
      } else {
         return 怀;
      }
   }

   public static BlockPos getOpenPos(PlayerEntity 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = 怀.getBlockPos();
      Iterator var2 = fd_ArrayList_1009.iterator();

      BlockPos 怀;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         怀 怀 = (Vec3d)var2.next();
         怀 = 怀.add(怀.x, 怀.y, 怀.z);
      } while(Class57.getBlock(怀) != Blocks.AIR);

      return 怀;
   }

   public static boolean isWeb(BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return Class57.getBlock(怀) == Blocks.COBWEB || Class57.getBlock(怀) == Block.getBlockFromItem(Items.STRING);
   }

   public static boolean canCrystal(PlayerEntity 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = 怀.getBlockPos();
      Iterator var2 = fd_ArrayList_1009.iterator();

      BlockPos 怀;
      do {
         if (!var2.hasNext()) {
            return false;
         }

         怀 怀 = (Vec3d)var2.next();
         怀 = 怀.add(怀.x, 怀.y, 怀.z);
      } while(Class57.getBlock(怀) != Blocks.AIR);

      return true;
   }

   public static BlockPos getSelfTrapBlock(PlayerEntity 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = 怀.getBlockPos();
      Iterator var2 = fd_ArrayList_1008.iterator();

      BlockPos 怀;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         怀 怀 = (Vec3d)var2.next();
         怀 = 怀.add(怀.x, 怀.y, 怀.z);
      } while(!isTrapBlock(怀));

      return 怀;
   }

   public static void doPacketMine(BlockPos 怀, boolean 怀, int 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀) {
         Rotations.rotate(Rotations.getYaw(怀), Rotations.getPitch(怀), 怀, () -> {
            String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
            sendPacketMine(怀);
         });
      } else {
         sendPacketMine(怀);
      }

   }

   public static boolean isAnvilBlock(BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return Class57.getBlock(怀) == Blocks.ANVIL || Class57.getBlock(怀) == Blocks.CHIPPED_ANVIL || Class57.getBlock(怀) == Blocks.DAMAGED_ANVIL;
   }

   public static boolean isWebbed(PlayerEntity 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = 怀.getBlockPos();
      return isWeb(怀) ? true : isWeb(怀.up());
   }

   public static void mineWeb(PlayerEntity 怀, int 怀, boolean 怀, int 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀 != null && 怀 != -1) {
         怀 怀 = 怀.getBlockPos();
         怀 怀 = null;
         if (isWeb(怀)) {
            怀 = 怀;
         }

         if (isWeb(怀.up())) {
            怀 = 怀.up();
         }

         if (isWeb(怀.up(2))) {
            怀 = 怀.up(2);
         }

         if (怀 != null) {
            sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.updateSlot(怀);
            doRegularMine(怀, 怀, 怀);
         }
      }
   }

   public static void sendRegularMine(BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      MeteorClient.mc.interactionManager.updateBlockBreakingProgress(怀, Direction.UP);
      sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.swingHand(false);
   }

   public static void sendPacketMine(BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      MeteorClient.mc.player.networkHandler.sendPacket(new PlayerActionC2SPacket(class_2847.START_DESTROY_BLOCK, 怀, Direction.UP));
      MeteorClient.mc.player.networkHandler.sendPacket(new PlayerActionC2SPacket(class_2847.STOP_DESTROY_BLOCK, 怀, Direction.UP));
   }

   public static boolean isTrapBlock(BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return Class57.getBlock(怀) == Blocks.OBSIDIAN || Class57.getBlock(怀) == Blocks.ENDER_CHEST;
   }
}
