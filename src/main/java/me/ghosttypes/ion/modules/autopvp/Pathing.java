/* Decompiler 21ms, total 178ms, lines 134 */
package me.ghosttypes.ion.modules.autopvp;

import baritone.api.BaritoneAPI;
import baritone.api.pathing.goals.GoalBlock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import me.ghosttypes.ion.utils.world.Class57;
import meteordevelopment.meteorclient.MeteorClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class Pathing {
   public static boolean fd_boolean_5;
   public static final ArrayList<Vec3d> fd_ArrayList_6;

   public static List<BlockPos> getNearbyPlayerPos(BlockPos 怀, int 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = new ArrayList();
      Iterator var3 = MeteorClient.mc.world.getEntities().iterator();

      while(var3.hasNext()) {
         怀 怀 = (Entity)var3.next();
         if (!(怀 instanceof PlayerEntity) && Class57.distanceBetween(怀, 怀.getBlockPos()) <= (double)怀) {
            怀.add(怀.getBlockPos());
         }
      }

      return 怀;
   }

   static {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_boolean_5 = false;
      fd_ArrayList_6 = new Pathing$1();
   }

   public static void stopFollowing() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      BaritoneAPI.getProvider().getPrimaryBaritone().getFollowProcess().cancel();
   }

   public static BlockPos getHoleNearPlayer(PlayerEntity 怀, int 怀, Pathing$HoleType 怀, boolean 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = getHoles(怀.getBlockPos(), 怀, 怀, 怀);
      return 怀.isEmpty() ? null : (BlockPos)怀.get(0);
   }

   public static boolean isBothHole(BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return isBedrockHole(怀) || isObbyHole(怀);
   }

   public static boolean canPathToPlayer(PlayerEntity 怀, int 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return MeteorClient.mc.player.distanceTo(怀) <= (float)怀;
   }

   public Pathing() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }

   public static void pathToBlock(BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      BaritoneAPI.getProvider().getPrimaryBaritone().getCustomGoalProcess().setGoalAndPath(new GoalBlock(怀));
      fd_boolean_5 = true;
   }

   public static boolean isValidHole(BlockPos 怀, Pathing$HoleType 怀) {
      // $FF: Couldn't be decompiled
   }

   public static boolean isObbyHole(BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      Iterator var1 = fd_ArrayList_6.iterator();

      BlockPos 怀;
      do {
         if (!var1.hasNext()) {
            return true;
         }

         怀 怀 = (Vec3d)var1.next();
         怀 = 怀.add(怀.x, 怀.y, 怀.z);
      } while(Class57.getBlock(怀) == Blocks.OBSIDIAN);

      return false;
   }

   public static List<BlockPos> getHoles(BlockPos 怀, int 怀, Pathing$HoleType 怀, boolean 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = Class57.getSphere(怀, 怀, 怀);
      怀.removeIf((怀x) -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         return !isValidHole(怀x, 怀);
      });
      if (怀) {
         怀 怀 = getNearbyPlayerPos(怀, 怀);
         Objects.requireNonNull(怀);
         怀.removeIf(怀::contains);
      }

      return 怀;
   }

   public static void stopPathing() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_boolean_5 = false;
      BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().cancelEverything();
   }

   public static boolean isBedrockHole(BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      Iterator var1 = fd_ArrayList_6.iterator();

      BlockPos 怀;
      do {
         if (!var1.hasNext()) {
            return true;
         }

         怀 怀 = (Vec3d)var1.next();
         怀 = 怀.add(怀.x, 怀.y, 怀.z);
      } while(Class57.getBlock(怀) == Blocks.BEDROCK);

      return false;
   }
}
