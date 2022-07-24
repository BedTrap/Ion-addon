/* Decompiler 6ms, total 147ms, lines 64 */
package me.ghosttypes.ion.utils.world;

import baritone.api.BaritoneAPI;
import baritone.api.pathing.goals.GoalBlock;
import meteordevelopment.meteorclient.MeteorClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;

public class Class56 {
   public static void forceStopPathing() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().forceCancel();
   }

   public static void stopFollowing() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      BaritoneAPI.getProvider().getPrimaryBaritone().getFollowProcess().cancel();
   }

   public static boolean isAtGoal(BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return Class57.distanceBetween(MeteorClient.mc.player.getBlockPos(), 怀) <= 0.5D;
   }

   public static boolean hasPath() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().hasPath();
   }

   public static void followPlayer(PlayerEntity 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      BaritoneAPI.getProvider().getPrimaryBaritone().getMineProcess().cancel();
      BaritoneAPI.getProvider().getPrimaryBaritone().getFollowProcess().follow((怀x) -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         return 怀x.getEntityName().equalsIgnoreCase(怀.getEntityName());
      });
   }

   public static void pathToBlockPos(BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      BaritoneAPI.getProvider().getPrimaryBaritone().getCustomGoalProcess().setGoalAndPath(new GoalBlock(怀));
   }

   public Class56() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }

   public static boolean isFollowing() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return BaritoneAPI.getProvider().getPrimaryBaritone().getFollowProcess().isActive();
   }

   public static void stopPathing() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().cancelEverything();
   }

   public static boolean hasGoal() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().getGoal() != null;
   }
}
