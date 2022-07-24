/* Decompiler 17ms, total 155ms, lines 183 */
package me.ghosttypes.ion.utils.player;

import java.util.ArrayList;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.utils.misc.Names;
import meteordevelopment.meteorclient.utils.player.FindItemResult;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import net.minecraft.item.AirBlockItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BedItem;
import net.minecraft.item.EndCrystalItem;
import net.minecraft.item.EnchantedGoldenAppleItem;
import net.minecraft.item.EnderPearlItem;
import net.minecraft.item.ExperienceBottleItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
import net.minecraft.block.AnvilBlock;
import net.minecraft.block.AbstractPressurePlateBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.block.AbstractButtonBlock;
import net.minecraft.block.EnderChestBlock;
import net.minecraft.block.ShulkerBoxBlock;

public class Class46 {
   public static ArrayList<Item> fd_ArrayList_1010;
   public static ArrayList<Item> fd_ArrayList_1011;
   public static ArrayList<Item> fd_ArrayList_1012;

   public static FindItemResult findChorus() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return InvUtils.findInHotbar(new Item[]{Items.CHORUS_FRUIT});
   }

   public static FindItemResult findXPinAll() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return InvUtils.find(new Item[]{Items.EXPERIENCE_BOTTLE});
   }

   static {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_ArrayList_1012 = new Class49_ArrayList();
      fd_ArrayList_1010 = new Class47_ArrayList();
      fd_ArrayList_1011 = new Class50_ArrayList();
   }

   public static boolean isInventoryFull() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";

      for(int 怀 = 0; 怀 < 36; ++怀) {
         怀 怀 = MeteorClient.mc.player.getInventory().getStack(怀);
         if (怀 == null || 怀.getItem() instanceof AirBlockItem) {
            return false;
         }
      }

      return true;
   }

   public Class46() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }

   public static FindItemResult findObby() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return InvUtils.findInHotbar(new Item[]{Blocks.OBSIDIAN.asItem()});
   }

   public static FindItemResult findButton() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return InvUtils.findInHotbar((怀) -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         return Block.getBlockFromItem(怀.getItem()) instanceof AbstractPressurePlateBlock || Block.getBlockFromItem(怀.getItem()) instanceof AbstractButtonBlock;
      });
   }

   public static FindItemResult findAxe() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return InvUtils.findInHotbar((怀) -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         return 怀.getItem() instanceof AxeItem;
      });
   }

   public static FindItemResult findShulker(boolean 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return 怀 ? InvUtils.find((怀x) -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         return Block.getBlockFromItem(怀x.getItem()) instanceof ShulkerBoxBlock;
      }) : InvUtils.findInHotbar((怀x) -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         return Block.getBlockFromItem(怀x.getItem()) instanceof ShulkerBoxBlock;
      });
   }

   public static FindItemResult findPick() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return InvUtils.findInHotbar((怀) -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         return 怀.getItem() instanceof PickaxeItem;
      });
   }

   public static FindItemResult findAnvil() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return InvUtils.findInHotbar((怀) -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         return Block.getBlockFromItem(怀.getItem()) instanceof AnvilBlock;
      });
   }

   public static FindItemResult findCraftTable() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return InvUtils.findInHotbar(new Item[]{Blocks.CRAFTING_TABLE.asItem()});
   }

   public static String getCommonName(Item 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀 instanceof BedItem) {
         return "Beds";
      } else if (怀 instanceof ExperienceBottleItem) {
         return "XP";
      } else if (怀 instanceof EndCrystalItem) {
         return "Crystals";
      } else if (怀 instanceof EnchantedGoldenAppleItem) {
         return "EGaps";
      } else if (怀 instanceof EnderPearlItem) {
         return "Pearls";
      } else if (怀.equals(Items.TOTEM_OF_UNDYING)) {
         return "Totems";
      } else if (Block.getBlockFromItem(怀) == Blocks.OBSIDIAN) {
         return "Obby";
      } else {
         return Block.getBlockFromItem(怀) instanceof EnderChestBlock ? "Echests" : Names.get(怀);
      }
   }

   public static FindItemResult findEgap() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return InvUtils.findInHotbar(new Item[]{Items.ENCHANTED_GOLDEN_APPLE});
   }

   public static String getItemNameBySlot(int 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return MeteorClient.mc.player.getInventory().getStack(怀).getName().getString();
   }

   public static String getItemName(Item 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return 怀.getName().getString();
   }

   public static FindItemResult findXP() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return InvUtils.findInHotbar(new Item[]{Items.EXPERIENCE_BOTTLE});
   }

   public static Integer getEmptySlots() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = 0;

      for(int 怀 = 0; 怀 < 36; ++怀) {
         怀 怀 = MeteorClient.mc.player.getInventory().getStack(怀);
         if (怀 == null || 怀.getItem() instanceof AirBlockItem) {
            ++怀;
         }
      }

      return 怀;
   }

   public static FindItemResult findSword() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return InvUtils.findInHotbar((怀) -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         return 怀.getItem() instanceof SwordItem;
      });
   }
}
