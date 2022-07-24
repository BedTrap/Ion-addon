/* Decompiler 8ms, total 146ms, lines 76 */
package me.ghosttypes.ion.modules.render;

import java.util.Objects;
import me.ghosttypes.ion.mixins.IHeldItemRenderer;
import me.ghosttypes.ion.utils.Class68;
import me.ghosttypes.ion.utils.events.Class16_Cancellable;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.BoolSetting.Builder;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;

public class OldAnimations extends Module {
   private final Setting<Boolean> fd_Setting_884;
   private final SettingGroup fd_SettingGroup_885;

   private boolean shouldCauseReequipAnimation(ItemStack 怀, ItemStack 怀, int 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = 怀.isEmpty();
      怀 怀 = 怀.isEmpty();
      if (怀 && 怀) {
         return false;
      } else if (!怀 && !怀) {
         return !怀.equals(怀);
      } else {
         return true;
      }
   }

   @EventHandler
   private void onUpdateHeldItem(Class16_Cancellable 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀.setCancelled(true);
      怀 怀 = (IHeldItemRenderer)怀.mc.getEntityRenderDispatcher().getHeldItemRenderer();
      怀 怀 = 怀.mc.player.getMainHandStack();
      怀 怀 = 怀.mc.player.getOffHandStack();
      怀.setPrevEquipProgressMainHand(怀.getEquipProgressMainHand());
      怀.setPrevEquipProgressOffHand(怀.getEquipProgressOffHand());
      if (怀.mc.player.isRiding()) {
         怀.setEquipProgressMainHand(MathHelper.clamp(怀.getEquipProgressMainHand() - 0.4F, 0.0F, 1.0F));
         怀.setEquipProgressOffHand(MathHelper.clamp(怀.getEquipProgressOffHand() - 0.4F, 0.0F, 1.0F));
      } else {
         怀 怀 = (Boolean)怀.fd_Setting_884.get() && 怀.shouldCauseReequipAnimation(怀.getMainHand(), 怀, 怀.mc.player.getInventory().selectedSlot);
         怀 怀 = (Boolean)怀.fd_Setting_884.get() && 怀.shouldCauseReequipAnimation(怀.getOffHand(), 怀, -1);
         if (!怀 && !Objects.equals(怀.getMainHand(), 怀)) {
            怀.setMainHand(怀);
         }

         if (!怀 && !Objects.equals(怀.getMainHand(), 怀)) {
            怀.setOffHand(怀);
         }

         怀.setEquipProgressMainHand(怀.getEquipProgressMainHand() + MathHelper.clamp((!怀 ? 1.0F : 0.0F) - 怀.getEquipProgressMainHand(), -0.4F, 0.4F));
         怀.setEquipProgressOffHand(怀.getEquipProgressOffHand() + MathHelper.clamp((!怀 ? 1.0F : 0.0F) - 怀.getEquipProgressOffHand(), -0.4F, 0.4F));
      }

      if (怀.getPrevEquipProgressMainHand() < 0.1F) {
         怀.setMainHand(怀);
      }

      if (怀.getEquipProgressOffHand() < 0.1F) {
         怀.setOffHand(怀);
      }

   }

   public OldAnimations() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super(Class68.fd_Category_1062, "old-animations", "Changes hit animations to those of 1.8");
      怀.fd_SettingGroup_885 = 怀.settings.getDefaultGroup();
      怀.fd_Setting_884 = 怀.fd_SettingGroup_885.add(((Builder)((Builder)((Builder)(new Builder()).name("show-swapping")).description("Whether or not to show the item swapping animation.")).defaultValue(true)).build());
   }
}
