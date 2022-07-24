/* Decompiler 11ms, total 157ms, lines 138 */
package me.ghosttypes.ion.modules.misc.elytrabot.utils;

import me.ghosttypes.ion.modules.misc.elytrabot.ElytraBotThreaded;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.utils.Utils;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.meteorclient.utils.player.Rotations;
import net.minecraft.util.Hand;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.PickaxeItem;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.block.BlockState;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.MathHelper;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.class_2847;

public class MiscUtil {
   public static void eat(int 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      InvUtils.swap(怀, false);
      MeteorClient.mc.options.useKey.setPressed(true);
      Utils.rightClick();
   }

   public static Block getBlock(BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      MinecraftClient var6 = MeteorClient.mc;

      try {
         return var6.world.getBlockState(怀).getBlock();
      } catch (NullPointerException var5) {
         return null;
      }
   }

   public static int distance(BlockPos 怀, BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return Math.abs(怀.getX() - 怀.getX()) + Math.abs(怀.getY() - 怀.getY()) + Math.abs(怀.getZ() - 怀.getZ());
   }

   public static void mine(BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (!(MeteorClient.mc.player.getMainHandStack().getItem() instanceof PickaxeItem)) {
         怀 怀 = InvUtils.findInHotbar(new Item[]{Items.DIAMOND_PICKAXE, Items.NETHERITE_PICKAXE, Items.IRON_PICKAXE});
         if (怀.slot() != -1) {
            InvUtils.swap(怀.slot(), false);
         }
      }

      Rotations.rotate(Rotations.getYaw(怀), Rotations.getPitch(怀));
      MeteorClient.mc.getNetworkHandler().sendPacket(new PlayerActionC2SPacket(class_2847.START_DESTROY_BLOCK, 怀, Direction.UP));
      MeteorClient.mc.player.swingHand(Hand.MAIN_HAND);
      MeteorClient.mc.getNetworkHandler().sendPacket(new PlayerActionC2SPacket(class_2847.STOP_DESTROY_BLOCK, 怀, Direction.UP));
      ElytraBotThreaded.sleepUntil(() -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         return !isSolid(怀);
      }, 15000);
   }

   public static double distanceTo(BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = (float)(MeteorClient.mc.player.getX() - (double)怀.getX());
      怀 怀 = (float)(MeteorClient.mc.player.getZ() - (double)怀.getZ());
      return (double)MathHelper.sqrt(怀 * 怀 + 怀 * 怀);
   }

   public static boolean shouldEatItem(Item 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀 != Items.ENCHANTED_GOLDEN_APPLE && (怀 != Items.GOLDEN_APPLE || (Boolean)((ElytraBotThreaded)Modules.get().get(ElytraBotThreaded.class)).pQPppqppPQpqpppqPQQQppppQQQQPpPPQqPQPqQqPQQqppQQPqPpQQPPPPppQqPQQqpPQ.get())) {
         return 怀 != Items.CHORUS_FRUIT && 怀 != Items.POISONOUS_POTATO && 怀 != Items.PUFFERFISH && 怀 != Items.CHICKEN && 怀 != Items.ROTTEN_FLESH && 怀 != Items.SPIDER_EYE && 怀 != Items.SUSPICIOUS_STEW;
      } else {
         return false;
      }
   }

   public static void suspend(Thread 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀 != null) {
         怀.suspend();
      }

   }

   public static double getSpeed() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return (new Vec3d(MeteorClient.mc.player.getX(), MeteorClient.mc.player.getY(), MeteorClient.mc.player.getZ())).distanceTo(new Vec3d(MeteorClient.mc.player.prevX, MeteorClient.mc.player.prevY, MeteorClient.mc.player.prevZ));
   }

   public MiscUtil() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }

   public static boolean isSolid(BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      BlockState var6 = MeteorClient.mc.world.getBlockState(怀);

      try {
         return var6.getMaterial().isSolid();
      } catch (NullPointerException var5) {
         return false;
      }
   }

   public static boolean isInRenderDistance(BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = 怀.getX() / 16;
      怀 怀 = 怀.getZ() / 16;
      return MeteorClient.mc.world.getChunkManager().isChunkLoaded(怀, 怀);
   }

   public static void useItem() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      MeteorClient.mc.options.useKey.setPressed(true);
      if (!MeteorClient.mc.player.isUsingItem()) {
         Utils.rightClick();
      }

      MeteorClient.mc.options.useKey.setPressed(false);
   }

   public static void toggle(Thread 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      suspend(怀);
      怀 怀 = Modules.get().get(ElytraBotThreaded.class);
      if (怀.isActive()) {
         怀.toggle();
      }

   }
}
