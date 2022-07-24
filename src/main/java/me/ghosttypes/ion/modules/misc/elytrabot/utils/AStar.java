/* Decompiler 34ms, total 302ms, lines 188 */
package me.ghosttypes.ion.modules.misc.elytrabot.utils;

import java.util.ArrayList;
import java.util.Iterator;
import me.ghosttypes.ion.modules.misc.elytrabot.ElytraBotThreaded;
import me.ghosttypes.ion.modules.misc.elytrabot.ElytraBotThreaded.Mode;
import meteordevelopment.meteorclient.systems.modules.Modules;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;

public class AStar {
   private static boolean fd_boolean_820;

   private static ArrayList<BlockPos> getPath(BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = new ArrayList();
      怀 怀 = AStar$AStarNode.getNodeFromBlockpos(怀);
      if (怀 == null) {
         怀 = (AStar$AStarNode)AStar$AStarNode.fd_ArrayList_822.get(AStar$AStarNode.fd_ArrayList_822.size() - 1);
      }

      怀.add(怀.fd_BlockPos_821);

      while(怀 != null && 怀.fd_BlockPos_823 != null) {
         怀.add(怀.fd_BlockPos_823);
         AStar$AStarNode var4 = 怀;

         try {
            怀 = AStar$AStarNode.getNodeFromBlockpos(var4.fd_BlockPos_823);
         } catch (IndexOutOfBoundsException var3) {
            break;
         }
      }

      return 怀;
   }

   public static ArrayList<BlockPos> addToOpen(BlockPos[] 怀, ArrayList<BlockPos> 怀, BlockPos 怀, BlockPos 怀, BlockPos 怀, ArrayList<BlockPos> 怀, ArrayList<BlockPos> 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = new ArrayList();
      怀 怀 = new ArrayList();
      BlockPos[] var9 = 怀;
      int var10 = 怀.length;

      for(int var11 = 0; var11 < var10; ++var11) {
         怀 怀 = var9[var11];
         怀.add(怀.add(怀.getX(), 怀.getY(), 怀.getZ()));
      }

      Iterator var15 = 怀.iterator();

      while(true) {
         AStar$AStarNode 怀;
         do {
            label72:
            while(true) {
               BlockPos 怀;
               do {
                  do {
                     if (!var15.hasNext()) {
                        return 怀;
                     }

                     怀 = (BlockPos)var15.next();
                  } while(MiscUtil.isSolid(怀));
               } while(怀.contains(怀));

               怀 怀 = new ArrayList();
               Iterator var18 = 怀.iterator();

               BlockPos 怀;
               while(var18.hasNext()) {
                  怀 = (BlockPos)var18.next();
                  怀.add(怀.add(怀.getX(), 怀.getY(), 怀.getZ()));
               }

               var18 = 怀.iterator();

               while(var18.hasNext()) {
                  怀 = (BlockPos)var18.next();
                  if (((ElytraBotThreaded)Modules.get().get(ElytraBotThreaded.class)).fd_Setting_769.get() == Mode.fd_Mode_812 && !MiscUtil.isInRenderDistance(怀)) {
                     return null;
                  }

                  if (MiscUtil.isSolid(怀) || !MiscUtil.isInRenderDistance(怀) || MiscUtil.getBlock(怀) == Blocks.LAVA && (Boolean)((ElytraBotThreaded)Modules.get().get(ElytraBotThreaded.class)).SssSsSSssSSsssSsSsssssSsSSsSSsSsSSssssSsSsSsSssssSss.get()) {
                     continue label72;
                  }

                  怀 怀 = (Integer)((ElytraBotThreaded)Modules.get().get(ElytraBotThreaded.class)).fd_Setting_782.get();
                  if (怀 != -1 && 怀.getY() > 怀) {
                     continue label72;
                  }
               }

               怀 = AStar$AStarNode.getNodeFromBlockpos(怀);
               if (怀 == null) {
                  怀 = new AStar$AStarNode(怀);
               }

               if (!怀.contains(怀)) {
                  怀.add(怀);
               }
               break;
            }
         } while(怀.fd_BlockPos_823 != null && gCost(怀, 怀) >= gCost(怀.fd_BlockPos_823, 怀));

         怀.fd_BlockPos_823 = 怀;
      }
   }

   public AStar() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }

   public static ArrayList<BlockPos> generatePath(BlockPos 怀, BlockPos 怀, BlockPos[] 怀, ArrayList<BlockPos> 怀, int 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      AStar$AStarNode.fd_ArrayList_822.clear();
      怀 怀 = 怀;
      怀 怀 = 怀;
      怀 怀 = new ArrayList();
      怀 怀 = new ArrayList();
      怀 怀 = 0;

      for(int 怀 = 0; 怀 < 怀; ++怀) {
         if (怀.equals(怀)) {
            fd_boolean_820 = false;
            return getPath(怀);
         }

         怀 怀 = 2.147483647E9D;
         Iterator var13 = 怀.iterator();

         while(var13.hasNext()) {
            怀 怀 = (BlockPos)var13.next();
            怀 怀 = fCost(怀, 怀, 怀);
            if (怀 < 怀) {
               怀 = 怀;
               怀 = 怀;
            }
         }

         怀.add(怀);
         怀.remove(怀);
         怀 怀 = addToOpen(怀, 怀, 怀, 怀, 怀, 怀, 怀);
         if (怀 == null) {
            break;
         }

         怀.addAll(怀);
         if (怀 < fCost(怀, 怀, 怀)) {
            怀 = 怀;
            怀 = 0;
         } else {
            ++怀;
            if (怀 > 200) {
               break;
            }
         }
      }

      if (!fd_boolean_820) {
         fd_boolean_820 = true;
         return generatePath(怀, 怀, 怀, 怀, 怀);
      } else {
         fd_boolean_820 = false;
         return new ArrayList();
      }
   }

   public static double gCost(BlockPos 怀, BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = (double)(怀.getX() - 怀.getX());
      怀 怀 = (double)(怀.getY() - 怀.getY());
      怀 怀 = (double)(怀.getZ() - 怀.getZ());
      return Math.sqrt(Math.abs(怀) + Math.abs(怀) + Math.abs(怀));
   }

   public static double fCost(BlockPos 怀, BlockPos 怀, BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = (double)(怀.getX() - 怀.getX());
      怀 怀 = (double)(怀.getZ() - 怀.getZ());
      怀 怀 = Math.sqrt(怀 * 怀 + 怀 * 怀);
      怀 怀 = gCost(怀, 怀) + 怀;
      return 怀;
   }
}
