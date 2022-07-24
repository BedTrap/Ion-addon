/* Decompiler 3ms, total 166ms, lines 41 */
package me.ghosttypes.ion.mixins;

import io.netty.util.concurrent.GenericFutureListener;
import java.util.Set;
import me.ghosttypes.ion.modules.misc.PacketLogger;
import meteordevelopment.meteorclient.systems.modules.Modules;
import net.minecraft.network.ClientConnection;
import net.minecraft.network.listener.PacketListener;
import net.minecraft.network.Packet;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({ClientConnection.class})
public class ClientConnectionMixin {
   @Inject(
      method = {"handlePacket"},
      at = {@At("HEAD")}
   )
   private static void logReceivedPacket(Packet<?> りりぃリリリリりぃリいりぃいいりいいいりいりいりぃリぃりリりりリリぃぃいりぃリいいいリいリリリぃいいぃぃいリりリぃリリぃりりぃぃいぃぃぃぃりリリりぃりいりいりぃぃりりいいいいぃぃいいりいりぃぃいいりリぃbhTMkNKpuI, PacketListener 鬬鬬鬬鬬鬭鬬鬭鬭鬭鬭鬬鬭鬭鬭鬭鬬鬬鬬鬭鬭鬬鬬鬭鬬鬭鬬鬭鬬鬭鬬鬬鬬鬬鬬鬭鬭鬭鬭鬬鬭鬬鬬鬭鬬鬭鬭鬬鬬鬬鬬鬬鬬鬭鬬鬬鬭鬬鬭鬬鬬鬭鬭鬭鬭鬭鬭鬬鬭鬬鬭鬬鬭鬭鬬鬭鬬鬭鬬鬭鬬鬭鬬鬬鬭鬭鬬鬬鬬鬬鬭鬬鬭鬬鬬鬭鬭鬬鬭鬭鬬鬬鬭鬭鬭鬭鬭wGbgqyPITv, CallbackInfo 鬭鬭鬬鬭鬬鬬鬭鬬鬭鬬鬭鬭鬬鬬鬬鬬鬬鬭鬬鬭鬭鬭鬬鬬鬭鬬鬭鬭鬭鬭鬬鬬鬭鬬鬭鬬鬭鬬鬬鬭鬬鬬鬭鬬鬭鬭鬭鬭鬬鬭鬭鬬鬬鬭鬬鬬鬭鬭鬭鬬VgpCbDosaE) {
      PacketLogger LlLjijljijIlIiIjILLlLjIIiLiJlLLjLILILIlijjLLlJIijjjlIiJiLLIJIJCIbvQGxlKQ = (PacketLogger)Modules.get().get(PacketLogger.class);
      if (LlLjijljijIlIiIjILLlLjIIiLiJlLLjLILILIlijjLLlJIijjjlIiJiLLIJIJCIbvQGxlKQ.isActive() && ((Set)LlLjijljijIlIiIjILLlLjIIiLiJlLLjLILILIlijjLLlJIijjjlIiJiLLIJIJCIbvQGxlKQ.fd_Setting_726.get()).contains(へ乀へ乀ㇸ乀へへㇸㇸㇸ乀乀へへへ乀へㇸㇸへ乀乀乀へㇸ乀へㇸへㇸㇸㇸㇸ乀へㇸㇸへ乀へ乀ㇸㇸㇸㇸへ乀乀へへへへ乀ㇸㇸへへへ乀へへ乀へへへㇸ乀乀ㇸ乀ㇸ乀ㇸㇸ乀へへへㇸlWbPtDXfgp.getClass())) {
         LlLjijljijIlIiIjILLlLjIIiLiJlLLjLILILIlijjLLlJIijjjlIiJiLLIJIJCIbvQGxlKQ.logReceivedPacket(へ乀へ乀ㇸ乀へへㇸㇸㇸ乀乀へへへ乀へㇸㇸへ乀乀乀へㇸ乀へㇸへㇸㇸㇸㇸ乀へㇸㇸへ乀へ乀ㇸㇸㇸㇸへ乀乀へへへへ乀ㇸㇸへへへ乀へへ乀へへへㇸ乀乀ㇸ乀ㇸ乀ㇸㇸ乀へへへㇸlWbPtDXfgp);
      }

   }

   @Inject(
      method = {"sendImmediately"},
      at = {@At("HEAD")}
   )
   private void logSentPacket(Packet<?> ムムㄙㄙㄙムムㄙムㄙムムㄙムムムㄙㄙㄙㄙムムㄙムㄙムムムㄙㄙムムㄙムムムムムㄙムㄙㄙㄙムムムㄙムㄙムムㄙムムムㄙムムムㄙムムㄙㄙㄙムムムㄙムㄙムㄙムㄙムㄙㄙㄙムムㄙㄙㄙㄙムㄙㄙㄙムㄙㄙㄙㄙムㄙㄙㄙムㄙㄙムムムㄙoqXURUoMbm, GenericFutureListener<?> 壿壿壿壿墫墫壿壿壿壿墫墫墫壿壿壿墫墫壿墫壿墫壿墫墫壿mSntUaTtof, CallbackInfo 鹅鵞鵞鹅鹅鹅鹅鹅鵞鵞鹅鹅鹅鵞鹅鹅鵞鵞鵞鵞鵞鵞鵞鵞鹅鵞鹅鵞鵞鵞鵞鵞鹅鵞鵞鹅鹅鵞鵞鹅鵞鹅鵞鹅鹅鹅鹅鵞鹅鵞鹅鹅鹅鹅鹅鹅鹅鹅鹅鵞fCmxLjvPgR) {
      PacketLogger ああおおあおおあおおあおGOHnrdRMTt = (PacketLogger)Modules.get().get(PacketLogger.class);
      if (ああおおあおおあおおあおGOHnrdRMTt.isActive() && ((Set)ああおおあおおあおおあおGOHnrdRMTt.fd_Setting_725.get()).contains(回茴回茴回茴茴徊徊徊佪徊佪回佪佪徊徊徊徊茴徊回茴回回茴茴徊徊徊茴茴回徊茴佪徊茴佪回回回佪回回徊茴佪回佪徊茴徊茴佪茴回茴茴茴茴佪佪徊徊茴回回回佪茴回茴佪徊回回回ERYtJQDsuj.getClass())) {
         ああおおあおおあおおあおGOHnrdRMTt.logSentPacket(回茴回茴回茴茴徊徊徊佪徊佪回佪佪徊徊徊徊茴徊回茴回回茴茴徊徊徊茴茴回徊茴佪徊茴佪回回回佪回回徊茴佪回佪徊茴徊茴佪茴回茴茴茴茴佪佪徊徊茴回回回佪茴回茴佪徊回回回ERYtJQDsuj);
      }

   }
}
