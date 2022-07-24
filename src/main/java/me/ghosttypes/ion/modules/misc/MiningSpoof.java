/* Decompiler 20ms, total 222ms, lines 162 */
package me.ghosttypes.ion.modules.misc;

import java.util.Set;
import java.util.stream.Collectors;
import me.ghosttypes.ion.utils.Class68;
import me.ghosttypes.ion.utils.events.Class14_Cancellable;
import meteordevelopment.meteorclient.events.world.TickEvent.Pre;
import meteordevelopment.meteorclient.mixininterface.IClientPlayerInteractionManager;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.BoolSetting.Builder;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.Utils;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShearsItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.world.GameMode;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.class_240;

public class MiningSpoof extends Module {
   private boolean fd_boolean_698;
   private final Setting<Boolean> fd_Setting_699;
   private int fd_int_700;
   private final Setting<Boolean> fd_Setting_701;
   private final Setting<Boolean> fd_Setting_702;
   private final Setting<Boolean> fd_Setting_703;
   private final Setting<Boolean> fd_Setting_704;
   private final SettingGroup fd_SettingGroup_705;

   public void onDeactivate() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀.fd_boolean_698 = false;
      怀.fd_int_700 = -1;
   }

   @EventHandler
   private void onBreakBlock(Class14_Cancellable 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀.mc.player.getInventory().selectedSlot != 怀.findTool(((BlockHitResult)怀.mc.crosshairTarget).getBlockPos()) && !怀.fd_boolean_698 && 怀.shouldMineSpoof()) {
         怀.cancel();
      }

   }

   private int findPickaxe() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = InvUtils.findInHotbar((怀x) -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         return 怀x.getItem() instanceof PickaxeItem;
      });
      return 怀.found() ? 怀.slot() : -1;
   }

   @EventHandler
   private void onTick(Pre 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (Utils.canUpdate() && 怀.mc.options.attackKey.isPressed() && 怀.mc.crosshairTarget.getPos() != null && 怀.mc.crosshairTarget.getType() == class_240.BLOCK) {
         怀 怀 = ((BlockHitResult)怀.mc.crosshairTarget).getBlockPos();
         if (怀.mc.world.getBlockState(怀).getHardness(怀.mc.world, 怀) <= 0.0F) {
            怀.fd_boolean_698 = true;
         } else if (怀.shouldMineSpoof()) {
            怀.fd_int_700 = 怀.findTool(怀);
            if (怀.fd_int_700 == -1) {
               怀.fd_boolean_698 = true;
            } else if (怀.mc.player.getInventory().selectedSlot != 怀.fd_int_700) {
               怀.fd_boolean_698 = false;
               怀 怀 = 怀.mc.player.getInventory().selectedSlot;
               怀.mc.player.getInventory().selectedSlot = 怀.fd_int_700;
               ((IClientPlayerInteractionManager)怀.mc.interactionManager).syncSelected();
               怀.mc.player.swingHand(Hand.MAIN_HAND);
               怀.mc.interactionManager.updateBlockBreakingProgress(怀, ((BlockHitResult)怀.mc.crosshairTarget).getSide());
               怀.mc.player.getInventory().selectedSlot = 怀;
               ((IClientPlayerInteractionManager)怀.mc.interactionManager).syncSelected();
            }
         }
      }
   }

   private boolean shouldMineSpoof() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = 怀.mc.player.getInventory().getMainHandStack().getItem();
      怀 怀 = 怀.mc.world.getBlockState(((BlockHitResult)怀.mc.crosshairTarget).getBlockPos());
      if (PlayerUtils.getGameMode() == GameMode.CREATIVE) {
         return false;
      } else if ((Boolean)怀.fd_Setting_704.get() && 怀 instanceof AxeItem || (Boolean)怀.fd_Setting_703.get() && 怀 instanceof SwordItem || (Boolean)怀.fd_Setting_701.get() && 怀 instanceof ShovelItem) {
         return false;
      } else if (!(Boolean)怀.fd_Setting_702.get() && (Boolean)怀.fd_Setting_699.get()) {
         怀 怀 = (Set)怀.streamTags().collect(Collectors.toSet());
         return 怀.contains(BlockTags.PICKAXE_MINEABLE);
      } else {
         return true;
      }
   }

   private double getScore(ItemStack 怀, BlockState 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (!怀.isTool(怀)) {
         return -1.0D;
      } else {
         怀 怀 = 0.0D;
         怀 += (double)(怀.getMiningSpeedMultiplier(怀) * 1000.0F);
         怀 += (double)EnchantmentHelper.getLevel(Enchantments.UNBREAKING, 怀);
         怀 += (double)EnchantmentHelper.getLevel(Enchantments.EFFICIENCY, 怀);
         怀 += (double)EnchantmentHelper.getLevel(Enchantments.MENDING, 怀);
         return 怀;
      }
   }

   private int findTool(BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (!(Boolean)怀.fd_Setting_702.get()) {
         return 怀.findPickaxe();
      } else {
         怀 怀 = -1.0D;
         怀 怀 = -1;

         for(int 怀 = 0; 怀 < 9; ++怀) {
            怀 怀 = 怀.getScore(怀.mc.player.getInventory().getStack(怀), 怀.mc.world.getBlockState(怀));
            if (怀 >= 0.0D && 怀 > 怀) {
               怀 = 怀;
               怀 = 怀;
            }
         }

         return 怀;
      }
   }

   private boolean isTool(ItemStack 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return 怀.getItem() instanceof ToolItem || 怀.getItem() instanceof ShearsItem;
   }

   public MiningSpoof() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super(Class68.fd_Category_1062, "mining-spoof", "Allows you to mine blocks with your pickaxe, even when you're not actually holding it.");
      怀.fd_SettingGroup_705 = 怀.settings.getDefaultGroup();
      怀.fd_Setting_702 = 怀.fd_SettingGroup_705.add(((Builder)((Builder)((Builder)(new Builder()).name("auto-tool")).description("Automatically choose and spoof the best tool for the job.")).defaultValue(true)).build());
      怀.fd_Setting_699 = 怀.fd_SettingGroup_705.add(((Builder)((Builder)((Builder)((Builder)(new Builder()).name("only-pickaxe-mineable")).description("Only spoofs mining if the block has the 'pickaxe mineable' tag.")).defaultValue(true)).visible(() -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         return !(Boolean)怀.fd_Setting_702.get();
      })).build());
      怀.fd_Setting_703 = 怀.fd_SettingGroup_705.add(((Builder)((Builder)((Builder)(new Builder()).name("ignore-sword")).description("If to not spoof mining when holding a sword.")).defaultValue(false)).build());
      怀.fd_Setting_704 = 怀.fd_SettingGroup_705.add(((Builder)((Builder)((Builder)(new Builder()).name("ignore-axe")).description("If to not spoof mining when holding an axe.")).defaultValue(false)).build());
      怀.fd_Setting_701 = 怀.fd_SettingGroup_705.add(((Builder)((Builder)((Builder)(new Builder()).name("ignore-shovel")).description("If to not spoof mining when holding a shovel.")).defaultValue(false)).build());
   }
}
