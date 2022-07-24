/* Decompiler 0ms, total 138ms, lines 14 */
package me.ghosttypes.ion.mixins;

import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.network.SequencedPacketCreator;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({ClientPlayerInteractionManager.class})
public interface IClientPlayerInteractionManager {
   @Invoker("sendSequencedPacket")
   void invokeSendSequencedPacket(ClientWorld var1, SequencedPacketCreator var2);
}
