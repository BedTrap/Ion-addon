/* Decompiler 2ms, total 140ms, lines 38 */
package me.ghosttypes.ion.mixins;

import me.ghosttypes.ion.modules.render.NametagsPlus;
import meteordevelopment.meteorclient.mixininterface.IEntityRenderer;
import meteordevelopment.meteorclient.systems.modules.Modules;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({EntityRenderer.class})
public abstract class NametagMixin<T extends Entity> implements IEntityRenderer {
   @Inject(
      method = {"renderLabelIfPresent"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onRenderLabel(T 徊佪徊佪回徊茴佪徊茴佪茴回佪佪佪佪茴回回徊佪茴佪回佪回回茴佪回徊回佪徊徊徊, Text ゅゅゅゅゆゆゅゆゅゅゆゆゅゆゅゅゆゆゆゆゅゆゅゅゆゅゅゆゅゅゆゅゅゆゅゅゆゅゅゆゆゆゆゆゅゆゆゆゅゅゅゅゅゅゅゅゅゆゆゅゅゅゅゆゅゅゅゅゅゅゆゆゅゅゆゅゆ, MatrixStack 㵘水沝水水淼淼沝淼淼水沝水淼淼㵘水沝淼沝淼水沝水㵘淼水沝淼㵘沝㵘淼沝淼㵘水㵘水沝水沝㵘㵘沝水沝水淼沝沝沝淼沝淼水水水沝水沝淼淼㵘淼淼水淼淼水沝㵘沝沝水水㵘水㵘水淼水㵘沝㵘㵘淼淼沝水淼沝沝沝水水淼㵘, VertexConsumerProvider シシヅシシシジシジンシゾゾツゾツジツシシンゾヅツンンツゾヅゾソンゾヅゾソヅジツソシジソゾンヅジシソシンンシゾヅヅソンンンンシヅソジゾゾジジツジシジジンツツゾツヅゾジヅシツソツ, int ゅゆゅゅゅゅゅゆゅゆゅゅゆゅゅゅゆゅゆゅゅゅゆゅゅゅゆゆゅゅゆゆゆゅゆゆゅゆゆゅゅゅゅゅゅゅゆゆゆゆゆゆゆゆゅゆゅゆゅゆゆゅゅゅゅゅゆゆゅゅゆゆゆゆゅゅゆゆゆゆゆゆゅゅゆゆゆ, CallbackInfo qQPQpqPpqQpQqqpPQpQp) {
      if (O〇〇〇〇oOO〇oOO〇〇〇〇O〇〇O instanceof PlayerEntity) {
         if (Modules.get().isActive(NametagsPlus.class)) {
            SSsSSsSSsSSSSSsssssSSsSSSsSSsssSsssSssSSSsSSsSSSsSssSSssssSssSSSssSsSssssSSsss.cancel();
         }

      }
   }

   @Shadow
   public abstract Identifier getTexture(Entity var1);
}
