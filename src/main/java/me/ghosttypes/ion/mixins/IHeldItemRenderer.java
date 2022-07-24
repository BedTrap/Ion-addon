/* Decompiler 0ms, total 136ms, lines 46 */
package me.ghosttypes.ion.mixins;

import net.minecraft.item.ItemStack;
import net.minecraft.client.render.item.HeldItemRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({HeldItemRenderer.class})
public interface IHeldItemRenderer {
   @Accessor("equipProgressMainHand")
   void setEquipProgressMainHand(float var1);

   @Accessor("prevEquipProgressMainHand")
   void setPrevEquipProgressMainHand(float var1);

   @Accessor("equipProgressOffHand")
   void setEquipProgressOffHand(float var1);

   @Accessor("equipProgressOffHand")
   float getEquipProgressOffHand();

   @Accessor("mainHand")
   ItemStack getMainHand();

   @Accessor("prevEquipProgressOffHand")
   float getPrevEquipProgressOffHand();

   @Accessor("prevEquipProgressOffHand")
   void setPrevEquipProgressOffHand(float var1);

   @Accessor("offHand")
   void setOffHand(ItemStack var1);

   @Accessor("mainHand")
   void setMainHand(ItemStack var1);

   @Accessor("prevEquipProgressMainHand")
   float getPrevEquipProgressMainHand();

   @Accessor("equipProgressMainHand")
   float getEquipProgressMainHand();

   @Accessor("offHand")
   ItemStack getOffHand();
}
