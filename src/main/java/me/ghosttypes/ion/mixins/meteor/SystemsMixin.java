/* Decompiler 1ms, total 158ms, lines 24 */
package me.ghosttypes.ion.mixins.meteor;

import me.ghosttypes.ion.utils.misc.Class27;
import meteordevelopment.meteorclient.systems.Systems;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({Systems.class})
public class SystemsMixin {
   @Inject(
      method = {"init"},
      at = {@At(
   value = "INVOKE",
   target = "Lmeteordevelopment/meteorclient/systems/System;load()V"
)},
      remap = false
   )
   private static void onInitialiseSystem(CallbackInfo 焱燚焱炎火火火炏燚炎燚火燚炎炏火燚燚炏燚火炏火火炎欻火焱炏炏焱火炎炎燚欻炎焱炎欻炏燚焱炏火燚火炎炎焱燚焱炏欻欻焱火焱炏火欻燚) {
      new Class27();
   }
}
