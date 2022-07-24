/* Decompiler 14ms, total 157ms, lines 145 */
package me.ghosttypes.ion.utils;

import java.util.Iterator;
import me.ghosttypes.ion.Ion;
import me.ghosttypes.ion.utils.misc.Class21;
import me.ghosttypes.ion.utils.misc.Class22;
import me.ghosttypes.ion.utils.player.Class44;
import me.ghosttypes.ion.utils.services.Class54;
import me.ghosttypes.ion.utils.world.Class57;
import me.ghosttypes.ion.utils.world.Class66;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.utils.world.TickRate;
import net.minecraft.client.tutorial.TutorialStep;
import net.minecraft.util.Hand;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.c2s.play.ChatMessageC2SPacket;

public class sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS {
   // $FF: synthetic field
   static final boolean fd_boolean_1015;
   public static boolean fd_boolean_1016;

   public static boolean isLagging() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return (double)TickRate.INSTANCE.getTimeSinceLastTick() >= 0.8D;
   }

   public static void sendMessage(String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (MeteorClient.mc.player != null && 怀 != null) {
         MeteorClient.mc.player.networkHandler.sendPacket(new ChatMessageC2SPacket(怀, Class70.signMessage(怀), false));
      }
   }

   public sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }

   public static void messagePlayer(String 怀, String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (!fd_boolean_1015 && MeteorClient.mc.player == null) {
         throw new AssertionError();
      } else {
         sendMessage("/msg " + 怀 + " " + 怀);
      }
   }

   public static int randomNum(int 怀, int 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return 怀 + (int)(Math.random() * (double)(怀 - 怀 + 1));
   }

   public static void init(long param0) {
      // $FF: Couldn't be decompiled
   }

   private static void startServices() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      Class54.startServices();
      Class22.init();
   }

   public static float getTotalHealth(PlayerEntity 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return 怀.getHealth() + 怀.getAbsorptionAmount();
   }

   public static void shutdown() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = System.currentTimeMillis();
      Ion.log("Shutting down.");
      Class66.shutdown();
      Class54.stopServices();
      Class21.shutdown();
      怀 怀 = System.currentTimeMillis() - 怀;
      Ion.log("Shutdown Ion in " + 怀 + "ms!");
   }

   public static void swingHand(boolean 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀) {
         MeteorClient.mc.player.swingHand(Hand.OFF_HAND);
      } else {
         MeteorClient.mc.player.swingHand(Hand.MAIN_HAND);
      }

   }

   public static boolean isInHole(PlayerEntity 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = 怀.getBlockPos();
      Iterator var2 = Class44.fd_ArrayList_1009.iterator();

      Vec3d 怀;
      do {
         if (!var2.hasNext()) {
            return true;
         }

         怀 = (Vec3d)var2.next();
      } while(Class57.getBlock(怀.add(怀.x, 怀.y, 怀.z)) != Blocks.AIR);

      return false;
   }

   public static Item getItemFromSlot(Integer 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀 == -1) {
         return null;
      } else {
         return 怀 == 45 ? MeteorClient.mc.player.getOffHandStack().getItem() : MeteorClient.mc.player.getInventory().getStack(怀).getItem();
      }
   }

   public static void updateSlot(int 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      MeteorClient.mc.player.getInventory().selectedSlot = 怀;
   }

   public static boolean isPlayerMoving(PlayerEntity 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return 怀.forwardSpeed != 0.0F || 怀.sidewaysSpeed != 0.0F;
   }

   static {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_boolean_1015 = !sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.class.desiredAssertionStatus();
      fd_boolean_1016 = false;
   }

   public static void disableTutorial() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      MeteorClient.mc.getTutorialManager().setStep(TutorialStep.NONE);
   }

   public static void setTitle(String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      MeteorClient.mc.getWindow().setTitle(怀);
   }
}
