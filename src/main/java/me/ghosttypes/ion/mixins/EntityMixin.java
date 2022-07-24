/* Decompiler 2ms, total 141ms, lines 27 */
package me.ghosttypes.ion.mixins;

import me.ghosttypes.ion.modules.misc.elytrabot.events.CancellablePlayerMoveEvent;
import meteordevelopment.meteorclient.MeteorClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.MovementType;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({Entity.class})
public class EntityMixin {
   @Inject(
      method = {"move"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onMove(MovementType 垚土烓洼澆茥茥㙓烓澆洼澆澆洼垚茥㙓桂㙓洼桂桂圭㙓洼桂垚圭茥垚垚㙓桂澆烓桂桂桂桂圭茥圭茥圭土土澆茥桂澆洼垚茥垚圭圭烓垚桂烓洼桂桂㙓洼土澆圭澆桂圭垚洼洼垚澆垚洼桂澆桂㙓桂垚圭烓桂垚洼土烓㙓土茥烓洼澆圭, Vec3d 㬺幐幐㬺㬺幐㬺幐幐㬺幐幐幐幐㬺㬺㬺㬺幐幐幐幐幐幐幐㬺幐㬺幐㬺㬺㬺㬺㬺幐㬺㬺㬺幐幐㬺㬺㬺㬺㬺㬺㬺㬺㬺㬺㬺㬺㬺幐幐幐㬺幐幐幐幐幐幐幐幐幐㬺幐幐㬺幐, CallbackInfo qqPpPpqqqqpPQQQqQQqPppPQQQPPppQPpQqqQppPpPqPqpqQQqpQpqqPpqQPq) {
      if (いいりぃぃリりりぃぃリりリぃぃリりいぃいりぃりリリリいいいいりぃりいリりりりいりいリりりりリぃぃリりりぃいいぃりぃぃいいぃリいリりぃいいぃりりりリリいぃリ == MeteorClient.mc.player && ((CancellablePlayerMoveEvent)MeteorClient.EVENT_BUS.post(CancellablePlayerMoveEvent.get(おあああおおおおあおおおああ, 㬺㬺㬺㬺幐㬺幐㬺㬺㬺幐㬺幐㬺㬺幐幐幐㬺㬺幐㬺㬺幐㬺㬺幐㬺㬺㬺幐㬺㬺㬺㬺幐幐㬺幐㬺幐))).isCancelled()) {
         o〇O〇〇〇〇〇〇oooo〇〇O〇〇ooOoo〇o〇〇ooo〇oOOoOOO〇Oo〇oO〇〇oOooOOOOoOOO〇OOoO〇OOOoO〇〇〇oOOoOO〇〇OO〇〇〇〇oooOO〇ooOO〇oooOO〇o〇〇〇.cancel();
      }

   }
}
