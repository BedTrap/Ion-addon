/* Decompiler 0ms, total 134ms, lines 13 */
package me.ghosttypes.ion.mixins;

import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.network.PendingUpdateManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({ClientWorld.class})
public interface IClientWorld {
   @Accessor("pendingUpdateManager")
   PendingUpdateManager getPendingUpdateManager();
}
