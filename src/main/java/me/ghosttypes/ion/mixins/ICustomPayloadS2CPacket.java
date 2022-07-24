/* Decompiler 0ms, total 132ms, lines 13 */
package me.ghosttypes.ion.mixins;

import net.minecraft.network.packet.s2c.play.CustomPayloadS2CPacket;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({CustomPayloadS2CPacket.class})
public interface ICustomPayloadS2CPacket {
   @Accessor("channel")
   Identifier getChannel();
}
