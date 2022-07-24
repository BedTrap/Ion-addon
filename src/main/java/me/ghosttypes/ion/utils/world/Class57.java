/* Decompiler 24ms, total 174ms, lines 210 */
package me.ghosttypes.ion.utils.world;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import me.ghosttypes.ion.utils.player.Class44;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.MathHelper;

public class Class57 {
   public static BlockState getState(BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return 怀 == null ? null : MeteorClient.mc.world.getBlockState(怀);
   }

   public static boolean isArrayComplete(ArrayList<BlockPos> 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀 == null) {
         return false;
      } else if (怀.isEmpty()) {
         return false;
      } else {
         Iterator var1 = 怀.iterator();

         BlockPos 怀;
         do {
            if (!var1.hasNext()) {
               return true;
            }

            怀 = (BlockPos)var1.next();
         } while(getBlock(怀) != Blocks.AIR);

         return false;
      }
   }

   public static BlockPos getCityBlock(PlayerEntity 怀, Boolean 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀 != null && (double)MeteorClient.mc.player.distanceTo(怀) <= 4.8D) {
         怀 怀 = Class44.getSurroundBlocks(怀);
         if (怀 == null) {
            return null;
         } else if (怀.isEmpty()) {
            return null;
         } else {
            怀.sort(Comparator.comparingDouble(PlayerUtils::distanceTo));
            怀.removeIf((怀x) -> {
               String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
               return isOurSurroundBlock(怀x) || outOfRange(怀x);
            });
            return !怀.isEmpty() ? (BlockPos)怀.get(0) : null;
         }
      } else {
         return null;
      }
   }

   public static double distanceBetween(BlockPos 怀, BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = (double)(怀.getX() - 怀.getX());
      怀 怀 = (double)(怀.getY() - 怀.getY());
      怀 怀 = (double)(怀.getZ() - 怀.getZ());
      return (double)MathHelper.sqrt((float)(怀 * 怀 + 怀 * 怀 + 怀 * 怀));
   }

   public static BlockPos getBlockPosFromDirection(Direction 怀, BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      BlockPos var2;
      switch(Class58.fd_array_1032[怀.ordinal()]) {
      case 1:
         var2 = 怀.up();
         break;
      case 2:
         var2 = 怀.down();
         break;
      case 3:
         var2 = 怀.east();
         break;
      case 4:
         var2 = 怀.west();
         break;
      case 5:
         var2 = 怀.north();
         break;
      case 6:
         var2 = 怀.south();
         break;
      default:
         throw new IncompatibleClassChangeError();
      }

      return var2;
   }

   public static boolean isTargetVecComplete(PlayerEntity 怀, ArrayList<Vec3d> 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀 == null) {
         return false;
      } else if (怀.isEmpty()) {
         return false;
      } else {
         怀 怀 = 怀.getBlockPos();
         Iterator var3 = 怀.iterator();

         BlockPos 怀;
         do {
            if (!var3.hasNext()) {
               return true;
            }

            怀 怀 = (Vec3d)var3.next();
            怀 = 怀.add(怀.x, 怀.y, 怀.z);
         } while(getBlock(怀) != Blocks.AIR);

         return false;
      }
   }

   public Class57() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }

   public static boolean isOurSurroundBlock(BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = MeteorClient.mc.player.getBlockPos();
      Direction[] var2 = Direction.values();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         怀 怀 = var2[var4];
         if (怀 != Direction.UP && 怀 != Direction.DOWN) {
            怀 怀 = 怀.offset(怀);
            if (怀.equals(怀)) {
               return true;
            }
         }
      }

      return false;
   }

   public static boolean isVecComplete(ArrayList<Vec3d> 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀 == null) {
         return false;
      } else if (怀.isEmpty()) {
         return false;
      } else {
         怀 怀 = MeteorClient.mc.player.getBlockPos();
         Iterator var2 = 怀.iterator();

         BlockPos 怀;
         do {
            if (!var2.hasNext()) {
               return true;
            }

            怀 怀 = (Vec3d)var2.next();
            怀 = 怀.add(怀.x, 怀.y, 怀.z);
         } while(getBlock(怀) != Blocks.AIR);

         return false;
      }
   }

   public static boolean isAir(BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return getBlock(怀) == Blocks.AIR;
   }

   public static Block getBlock(BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return 怀 == null ? null : MeteorClient.mc.world.getBlockState(怀).getBlock();
   }

   public static List<BlockPos> getSphere(BlockPos 怀, int 怀, int 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = new ArrayList();

      for(int 怀 = 怀.getX() - 怀; 怀 < 怀.getX() + 怀; ++怀) {
         for(int 怀 = 怀.getY() - 怀; 怀 < 怀.getY() + 怀; ++怀) {
            for(int 怀 = 怀.getZ() - 怀; 怀 < 怀.getZ() + 怀; ++怀) {
               怀 怀 = new BlockPos(怀, 怀, 怀);
               if (distanceBetween(怀, 怀) <= (double)怀 && !怀.contains(怀)) {
                  怀.add(怀);
               }
            }
         }
      }

      return 怀;
   }

   public static boolean outOfRange(BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return MathHelper.sqrt((float)MeteorClient.mc.player.squaredDistanceTo((double)怀.getX(), (double)怀.getY(), (double)怀.getZ())) > MeteorClient.mc.interactionManager.getReachDistance();
   }
}
