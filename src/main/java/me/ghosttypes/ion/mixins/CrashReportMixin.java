/* Decompiler 1ms, total 155ms, lines 25 */
package me.ghosttypes.ion.mixins;

import me.ghosttypes.ion.utils.misc.Class22;
import me.ghosttypes.ion.utils.misc.Class29;
import net.minecraft.util.crash.CrashReport;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({CrashReport.class})
public class CrashReportMixin {
   @Inject(
      method = {"asString"},
      at = {@At("RETURN")},
      cancellable = true
   )
   public void toString(CallbackInfoReturnable<String> ゆゆゆゆゆゆゅゅゆゆゅゅゆゆゆゅゆゅゆゅゆゆゆゆゅゅゆゅゆゆゅゆゅゅゆゆゅゆゅゅゅゅゆゆゆゅゆゆゆゅQueSrzxiBq) {
      if (Class29.fd_boolean_967) {
         SSssSssssSsSSsSssSSssSsSSsSsssSSSSsssSSSSSsSSsSsSsSsssSssSsSSSSsssssSSSsSSssSssssSSsSSssSSssssssSSSSSSSsSssSSSSSsssSsIHBYupDQIa.setReturnValue(Class22.vaugeMap((String)SSssSssssSsSSsSssSSssSsSSsSsssSSSSsssSSSSSsSSsSsSsSsssSssSsSSSSsssssSSSsSSssSssssSSsSSssSSssssssSSSSSSSsSssSSSSSsssSsIHBYupDQIa.getReturnValue()).replace("/", "."));
      }

   }
}
