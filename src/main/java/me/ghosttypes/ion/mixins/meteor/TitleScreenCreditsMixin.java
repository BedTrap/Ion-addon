/* Decompiler 1ms, total 152ms, lines 27 */
package me.ghosttypes.ion.mixins.meteor;

import me.ghosttypes.ion.utils.misc.Class27;
import meteordevelopment.meteorclient.utils.player.TitleScreenCredits;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin({TitleScreenCredits.class})
public class TitleScreenCreditsMixin {
   @ModifyArgs(
      method = {"render"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/font/TextRenderer;drawWithShadow(Lnet/minecraft/client/util/math/MatrixStack;Ljava/lang/String;FFI)I"
)
   )
   private static void onDrawCredits(Args ソソゾゾツソソシソゾソシソツソジンジンシジゾツソジンシシンツヅソゾソツシゾシジツンンンヅンヅヅジヅソゾツゾジゾソツソヅソゾンジヅゾゾソジヅソソゾゾツツツツジゾシツシツヅツシヅンンツヅンシツツシジソゾンツヅソヅジンツジゾシンンツツンツジシンソツジツツジxZiFTMfuvP) {
      if ((Boolean)Class27.fd_Class27_962.fd_Setting_961.get() && ((String)おおおおあおおおおおおおああああああおおおおあおああおおおあああおあおおああおおあああおあおおおああおああおああおあおおあおあおおあおおああおおあおおおおあおあおおああおああああおおああおおおおおあああtJPhgRMXHg.get(1)).contains("Ion")) {
         おおおおあおおおおおおおああああああおおおおあおああおおおあああおあおおああおおあああおあおおおああおああおああおあおおあおあおおあおおああおおあおおおおあおあおおああおああああおおああおおおおおあああtJPhgRMXHg.set(4, ((SettingColor)Class27.fd_Class27_962.fd_Setting_964.get()).getPacked());
      }

   }
}
