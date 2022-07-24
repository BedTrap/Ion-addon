/* Decompiler 2ms, total 136ms, lines 20 */
package me.ghosttypes.ion.utils;

import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.mixin.ClientPlayerEntityAccessor;
import net.minecraft.text.Text;
import net.minecraft.network.message.MessageSignature;
import net.minecraft.network.message.ChatMessageSigner;

public class Class70 {
   public static MessageSignature signMessage(String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return ((ClientPlayerEntityAccessor)MeteorClient.mc.player)._signChatMessage(ChatMessageSigner.create(MeteorClient.mc.player.getUuid()), Text.literal(怀));
   }

   public Class70() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }
}
