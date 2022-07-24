/* Decompiler 9ms, total 155ms, lines 104 */
package me.ghosttypes.ion.utils.player;

import meteordevelopment.meteorclient.MeteorClient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class SsSSssSsssssSsSSsSSs {
   public static boolean isBoots(ItemStack 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀 == null) {
         return false;
      } else if (怀.getItem() == Items.NETHERITE_BOOTS) {
         return true;
      } else if (怀.getItem() == Items.DIAMOND_BOOTS) {
         return true;
      } else if (怀.getItem() == Items.GOLDEN_BOOTS) {
         return true;
      } else if (怀.getItem() == Items.IRON_BOOTS) {
         return true;
      } else if (怀.getItem() == Items.CHAINMAIL_BOOTS) {
         return true;
      } else {
         return 怀.getItem() == Items.LEATHER_BOOTS;
      }
   }

   public static boolean isHelm(ItemStack 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀 == null) {
         return false;
      } else if (怀.getItem() == Items.NETHERITE_HELMET) {
         return true;
      } else if (怀.getItem() == Items.DIAMOND_HELMET) {
         return true;
      } else if (怀.getItem() == Items.GOLDEN_HELMET) {
         return true;
      } else if (怀.getItem() == Items.IRON_HELMET) {
         return true;
      } else if (怀.getItem() == Items.CHAINMAIL_HELMET) {
         return true;
      } else {
         return 怀.getItem() == Items.LEATHER_HELMET;
      }
   }

   public static boolean isChest(ItemStack 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀 == null) {
         return false;
      } else if (怀.getItem() == Items.NETHERITE_CHESTPLATE) {
         return true;
      } else if (怀.getItem() == Items.DIAMOND_CHESTPLATE) {
         return true;
      } else if (怀.getItem() == Items.GOLDEN_CHESTPLATE) {
         return true;
      } else if (怀.getItem() == Items.IRON_CHESTPLATE) {
         return true;
      } else if (怀.getItem() == Items.CHAINMAIL_CHESTPLATE) {
         return true;
      } else {
         return 怀.getItem() == Items.LEATHER_CHESTPLATE;
      }
   }

   public static ItemStack getArmor(int 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return (ItemStack)MeteorClient.mc.player.getInventory().armor.get(怀);
   }

   public static boolean checkThreshold(ItemStack 怀, double 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return getDamage(怀) <= 怀;
   }

   public static double getDamage(ItemStack 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return (double)(怀.getMaxDamage() - 怀.getDamage()) / (double)怀.getMaxDamage() * 100.0D;
   }

   public SsSSssSsssssSsSSsSSs() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }

   public static boolean isLegs(ItemStack 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀 == null) {
         return false;
      } else if (怀.getItem() == Items.NETHERITE_LEGGINGS) {
         return true;
      } else if (怀.getItem() == Items.DIAMOND_LEGGINGS) {
         return true;
      } else if (怀.getItem() == Items.GOLDEN_LEGGINGS) {
         return true;
      } else if (怀.getItem() == Items.IRON_LEGGINGS) {
         return true;
      } else if (怀.getItem() == Items.CHAINMAIL_LEGGINGS) {
         return true;
      } else {
         return 怀.getItem() == Items.LEATHER_LEGGINGS;
      }
   }
}
