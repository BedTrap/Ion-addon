/* Decompiler 1ms, total 156ms, lines 25 */
package me.ghosttypes.ion.mixins;

import me.ghosttypes.ion.utils.events.Class16_Cancellable;
import meteordevelopment.meteorclient.MeteorClient;
import net.minecraft.client.render.item.HeldItemRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({HeldItemRenderer.class})
public class HeldItemRendererMixin {
   @Inject(
      method = {"updateHeldItems"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onUpdateHeldItem(CallbackInfo ララララララうラララララううううラううララうララううラう) {
      if (((Class16_Cancellable)MeteorClient.EVENT_BUS.post(Class16_Cancellable.get())).isCancelled()) {
         木森林森木森林森林林木林林森林木木林森森木林木森林森林森林木木森林林森木林木森林木林森木木林森林森木林木林木森木木林森森木森林林林林木森森森森森木林森林木森林木木林木森林木林林木林木林木木木林林森.cancel();
      }

   }
}
