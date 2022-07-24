/* Decompiler 2ms, total 151ms, lines 28 */
package me.ghosttypes.ion.mixins.meteor;

import me.ghosttypes.ion.modules.chat.BetterChatPlus;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.utils.player.ChatUtils;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({ChatUtils.class})
public class ChatUtilsMixin {
   @Inject(
      method = {"getPrefix"},
      at = {@At("HEAD")},
      cancellable = true,
      remap = false
   )
   private static void onGetPrefix(CallbackInfoReturnable<Text> 鬬鬭鬬鬭鬭鬬鬭鬭鬭鬬鬭鬬鬭鬭鬭鬬鬬鬬鬬鬭鬬鬬鬭鬬鬬鬭鬬鬭鬬鬭鬬鬭鬭鬬鬭鬭鬬鬬鬭鬭鬭鬭鬭鬬鬭) {
      BetterChatPlus 炎燚火炏火炎火火欻欻火炎炎火欻焱火炎炎火炎燚燚火燚燚焱炎欻欻燚燚炏炏焱欻焱燚欻炎炎欻燚焱炏燚欻欻焱燚焱欻火欻炏焱火炏 = (BetterChatPlus)Modules.get().get(BetterChatPlus.class);
      if ((Boolean)炎燚火炏火炎火火欻欻火炎炎火欻焱火炎炎火炎燚燚火燚燚焱炎欻欻燚燚炏炏焱欻焱燚欻炎炎欻燚焱炏燚欻欻焱燚焱欻火欻炏焱火炏.fd_Setting_46.get()) {
         へへへ乀へㇸ乀へ乀へへㇸへㇸㇸへへ乀へㇸへへ乀ㇸ乀へ乀ㇸへ乀乀ㇸㇸへ乀ㇸㇸへ乀へへ乀へ乀乀乀乀乀乀乀へへ乀ㇸへへㇸㇸㇸ乀乀乀乀ㇸへㇸㇸ.setReturnValue(炎燚火炏火炎火火欻欻火炎炎火欻焱火炎炎火炎燚燚火燚燚焱炎欻欻燚燚炏炏焱欻焱燚欻炎炎欻燚焱炏燚欻欻焱燚焱欻火欻炏焱火炏.getPrefix());
      }

   }
}
