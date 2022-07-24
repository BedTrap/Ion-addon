/* Decompiler 5ms, total 145ms, lines 61 */
package me.ghosttypes.ion.mixins;

import me.ghosttypes.ion.utils.events.Class14_Cancellable;
import me.ghosttypes.ion.utils.events.Class18_Cancellable;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.utils.player.Rotations;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin({ClientPlayerInteractionManager.class})
public class ClientPlayerInteractionManagerMixin {
   @Inject(
      method = {"attackBlock"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onAttackBlock(BlockPos 㵘㵘水水水㵘水沝水水㵘㵘㵘沝沝㵘沝水沝淼㵘㵘水淼水淼沝㵘㵘淼淼㵘沝沝沝水水淼沝水水水㵘㵘沝沝淼水沝沝淼水淼淼沝沝淼淼沝淼㵘水㵘水㵘沝沝水㵘淼水㵘淼㵘淼淼水㵘㵘沝沝水㵘㵘水㵘水㵘沝沝沝㵘水水淼水㵘水淼淼水沝水沝沝水淼淼淼沝淼淼沝沝㵘淼㵘水沝㵘沝wauLasrzBp, Direction ょよょょょよよよょょよよょよょよょょよよよょよよょよよょよよよょょょよょょょょよよょょょょよよょょよよよよよょよよよょょょょょょょよよよょよAYUcPYYJZY, CallbackInfoReturnable<Boolean> PqPqQQPPppqPPPqpPQQqPPQQpQPPQPqqPqpPQqppQqPqPqpQppQqPpPPqQWfjYKJMZqj) {
      if (((Class14_Cancellable)MeteorClient.EVENT_BUS.post(Class14_Cancellable.get(〇〇oOo〇ooOo〇〇O〇OOOoOoO〇Ooo〇〇OO〇ooCXkucRCnVU, lLLJlijIilljiIjJlIjIIJlIjjJiliJlIJjiILLILILLlilJlLlijjJlLIiLAiGUzJDLCi))).isCancelled()) {
         乀ㇸ乀ㇸㇸへ乀乀へ乀へへㇸ乀ㇸへへへへへㇸへへ乀乀乀ㇸへへㇸㇸfkMvDDIjfE.cancel();
      }

   }

   @ModifyArgs(
      method = {"interactItem"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/network/packet/c2s/play/PlayerMoveC2SPacket$Full;<init>(DDDFFZ)V"
)
   )
   private void onInteractItem(Args メノメメノノノメノメメノメメノノノメBMMwMfKQyN) {
      if (Rotations.rotating) {
         メメメノノメノメノメメノメメメメメメメメノメノノノメノノノメノノノメノメノノメメノメメメメノメメメメノノノノノメノノメノノノメノメノノメノメノメノノノメメメノノメメノノメメノメノノメメノメノノメノノメノメノLAMnzdfMiS.set(3, Rotations.serverYaw);
         メメメノノメノメノメメノメメメメメメメメノメノノノメノノノメノノノメノメノノメメノメメメメノメメメメノノノノノメノノメノノノメノメノノメノメノメノノノメメメノノメメノノメメノメノノメメノメノノメノノメノメノLAMnzdfMiS.set(4, Rotations.serverPitch);
      }

   }

   @Inject(
      method = {"attackEntity"},
      at = {@At("TAIL")},
      cancellable = true
   )
   private void onAttackEntity(PlayerEntity 晩晚晚晚晚晩晩晩晩晚晚晩晚晚晚晚晚晚晩晚晚晩晩晩晩晚晚晩晩晚晩晩晚晩晩晩晩晚晩晩晩晩晚晩晩晚晚gkfnHRdukI, Entity OO〇oOOooooO〇oOO〇oooo〇oo〇oOoOo〇oO〇oO〇OoOooOooOO〇oOO〇oooO〇〇OooOOOOoo〇〇〇〇〇〇〇〇〇OOoo〇〇〇〇〇oOo〇naGzuQRZRU, CallbackInfo 壿壿壿壿壿墫壿壿墫壿墫墫壿墫墫墫壿墫壿墫墫墫壿壿壿墫壿墫墫墫墫墫壿墫YYCourXOMY) {
      if (((Class18_Cancellable)MeteorClient.EVENT_BUS.post(Class18_Cancellable.get(㬺幐㬺幐幐幐幐㬺㬺㬺㬺㬺㬺㬺幐㬺㬺幐㬺㬺幐㬺幐幐㬺幐幐幐㬺㬺㬺㬺幐幐㬺㬺PPtvNEPuOe))).isCancelled()) {
         沝㵘淼水㵘水㵘㵘沝沝沝水水㵘淼淼淼㵘淼沝沝沝沝水淼沝水㵘水淼㵘水淼㵘㵘沝淼㵘㵘AysgQLNaoA.cancel();
      }

   }
}
