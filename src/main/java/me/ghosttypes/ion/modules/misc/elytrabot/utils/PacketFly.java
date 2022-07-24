/* Decompiler 8ms, total 164ms, lines 82 */
package me.ghosttypes.ion.modules.misc.elytrabot.utils;

import me.ghosttypes.ion.modules.misc.elytrabot.events.CancellablePlayerMoveEvent;
import me.ghosttypes.ion.utils.network.Class42;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.events.packets.PacketEvent.Receive;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.network.packet.c2s.play.TeleportConfirmC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.class_2830;

public class PacketFly {
   private static final TimerUtil fd_TimerUtil_833;
   public static boolean fd_boolean_834;
   private static double fd_double_835;

   @EventHandler
   private void onPacketRecieve(Receive 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (fd_boolean_834) {
         Packet var3 = Class42.getPacket(怀);
         if (var3 instanceof PlayerPositionLookS2CPacket) {
            怀 怀 = (PlayerPositionLookS2CPacket)var3;
            if (MeteorClient.mc.currentScreen == null) {
               MeteorClient.mc.getNetworkHandler().sendPacket(new TeleportConfirmC2SPacket(怀.getTeleportId()));
               MeteorClient.mc.getNetworkHandler().sendPacket(new class_2830(怀.getX(), 怀.getY(), 怀.getZ(), 怀.getYaw(), 怀.getPitch(), false));
               MeteorClient.mc.player.setPosition(怀.getX(), 怀.getY(), 怀.getZ());
               怀.cancel();
            }
         }

      }
   }

   static {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_TimerUtil_833 = new TimerUtil();
   }

   public static void toggle(boolean 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_boolean_834 = 怀;
      if (怀) {
         fd_double_835 = MeteorClient.mc.player.getY();
      }

   }

   @EventHandler
   private void onMove(CancellablePlayerMoveEvent 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (fd_boolean_834) {
         MeteorClient.mc.player.setVelocity(0.0D, 0.0D, 0.0D);
         怀.cancel();
         怀 怀 = 0.0F;
         if (MeteorClient.mc.player.getY() < fd_double_835) {
            if (!fd_TimerUtil_833.hasPassed(3000)) {
               怀 = MeteorClient.mc.player.age % 20 == 0 ? -0.1F : 0.031F;
            } else {
               fd_TimerUtil_833.reset();
               怀 = -0.1F;
            }
         } else if (MeteorClient.mc.player.age % 4 == 0) {
            怀 = -0.1F;
         }

         怀 怀 = MeteorClient.mc.player.getVelocity();
         MeteorClient.mc.player.setVelocity(怀.x, (double)怀, 怀.z);
         MeteorClient.mc.getNetworkHandler().sendPacket(new class_2830(MeteorClient.mc.player.getX() + 怀.x, MeteorClient.mc.player.getY() + 怀.y, MeteorClient.mc.player.getZ() + 怀.z, MeteorClient.mc.player.getYaw(), MeteorClient.mc.player.getPitch(), MeteorClient.mc.player.isOnGround()));
         怀 怀 = MeteorClient.mc.player.getY() + 怀.y;
         怀 += 1337.0D;
         MeteorClient.mc.getNetworkHandler().sendPacket(new class_2830(MeteorClient.mc.player.getX() + 怀.x, 怀, MeteorClient.mc.player.getZ() + 怀.z, MeteorClient.mc.player.getYaw(), MeteorClient.mc.player.getPitch(), MeteorClient.mc.player.isOnGround()));
      }
   }

   public PacketFly() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }
}
