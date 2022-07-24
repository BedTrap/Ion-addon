/* Decompiler 50ms, total 239ms, lines 377 */
package me.ghosttypes.ion.modules.combat;

import java.util.Iterator;
import java.util.List;
import me.ghosttypes.ion.modules.hud.visual.NotificationsHUD;
import me.ghosttypes.ion.modules.render.Notifications.mode;
import me.ghosttypes.ion.utils.Class68;
import me.ghosttypes.ion.utils.sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS;
import me.ghosttypes.ion.utils.player.Class43;
import me.ghosttypes.ion.utils.player.Class46;
import me.ghosttypes.ion.utils.world.Class57;
import me.ghosttypes.ion.utils.world.Class66;
import meteordevelopment.meteorclient.events.world.TickEvent.Post;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.BoolSetting.Builder;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.player.FindItemResult;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.world.BlockUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.screen.CraftingScreenHandler;
import net.minecraft.item.BedItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Recipe;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.recipebook.RecipeBookGroup;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.client.gui.screen.recipebook.RecipeResultCollection;

public class AutoBedCraft extends Module {
   private int fd_int_165;
   private final Setting<Boolean> fd_Setting_166;
   private boolean fd_boolean_167;
   private final Setting<mode> fd_Setting_168;
   private final Setting<Boolean> fd_Setting_169;
   private final Setting<Integer> fd_Setting_170;
   private int fd_int_171;
   private boolean fd_boolean_172;
   private final Setting<Boolean> fd_Setting_173;
   private final Setting<Integer> fd_Setting_174;
   private final Setting<Boolean> SSsSSSSSsSssssSSsSsSSsS;
   private final Setting<Boolean> fd_Setting_175;
   private final Setting<Integer> fd_Setting_176;
   private final Setting<Boolean> fd_Setting_177;
   private final Setting<Integer> fd_Setting_178;
   private final Setting<Boolean> jJJILJJlJJlJlJLLLijlJiillLIiLJIIILlljjjLlLJjJLLJijijLJlLjjiJjiJljjjjIjJIiLJjiII;
   private final SettingGroup fd_SettingGroup_179;
   private final Setting<Boolean> fd_Setting_180;
   private final SettingGroup fd_SettingGroup_181;
   private final Setting<Integer> fd_Setting_182;
   private final Setting<Boolean> fd_Setting_183;
   private final Setting<Integer> fd_Setting_184;
   private final Setting<Boolean> fd_Setting_185;
   private final Setting<Double> fd_Setting_186;
   private int fd_int_187;
   private final Setting<Boolean> fd_Setting_188;
   private boolean fd_boolean_189;

   private void openCraftingTable(BlockPos 森森木林林木森森森木林森木林森林木林木森森木木森林木林森木林森森木林林林森林木林木木木森木林木林森森森林森森林木木林木林木木木林森木木林林木木木木林木森森林林木木林yqMEQVVrxu) {
      Vec3d ょょよよょよょよょよよょよよよよよょよよょょよよよょよよょよよょょょよょよょょょょよよょょょよよょよょょょょよよよよよよょよょょよよょよょよよょょょよょょよょよょよょょょょょよよょよよよょょょょょょょょよよよょょよょょょよよMKJkpERlkm = new Vec3d((double)佪茴回佪佪佪佪茴茴徊佪茴佪回佪回徊回徊佪徊茴徊徊徊佪茴佪回茴茴徊佪佪徊茴回茴回回茴茴徊佪茴回回佪佪徊佪回回徊佪徊回徊徊佪徊茴佪茴佪茴佪徊茴茴徊回徊茴徊回茴徊茴徊回徊茴徊茴徊徊佪回回回徊茴茴茴徊回回回徊回徊佪佪徊徊茴佪佪回徊回佪徊佪回佪茴回quBZWTAFYj.getX(), (double)佪茴回佪佪佪佪茴茴徊佪茴佪回佪回徊回徊佪徊茴徊徊徊佪茴佪回茴茴徊佪佪徊茴回茴回回茴茴徊佪茴回回佪佪徊佪回回徊佪徊回徊徊佪徊茴佪茴佪茴佪徊茴茴徊回徊茴徊回茴徊茴徊回徊茴徊茴徊徊佪回回回徊茴茴茴徊回回回徊回徊佪佪徊徊茴佪佪回徊回佪徊佪回佪茴回quBZWTAFYj.getY(), (double)佪茴回佪佪佪佪茴茴徊佪茴佪回佪回徊回徊佪徊茴徊徊徊佪茴佪回茴茴徊佪佪徊茴回茴回回茴茴徊佪茴回回佪佪徊佪回回徊佪徊回徊徊佪徊茴佪茴佪茴佪徊茴茴徊回徊茴徊回茴徊茴徊回徊茴徊茴徊徊佪回回回徊茴茴茴徊回回回徊回徊佪佪徊徊茴佪佪回徊回佪徊佪回佪茴回quBZWTAFYj.getZ());
      BlockHitResult ノノメノメノノノメノメメメノノメメメノノノノメメメノメメメメメメノメノノノメメメメノノメメノメノメメノメメメメノメノメメメノメIYiAuofnfB = new BlockHitResult(ょょよよょよょよょよよょよよよよよょよよょょよよよょよよょよよょょょよょよょょょょよよょょょよよょよょょょょよよよよよよょよょょよよょよょよよょょょよょょよょよょよょょょょょよよょよよよょょょょょょょょよよよょょよょょょよよMKJkpERlkm, Direction.UP, 佪茴回佪佪佪佪茴茴徊佪茴佪回佪回徊回徊佪徊茴徊徊徊佪茴佪回茴茴徊佪佪徊茴回茴回回茴茴徊佪茴回回佪佪徊佪回回徊佪徊回徊徊佪徊茴佪茴佪茴佪徊茴茴徊回徊茴徊回茴徊茴徊回徊茴徊茴徊徊佪回回回徊茴茴茴徊回回回徊回徊佪佪徊徊茴佪佪回徊回佪徊佪回佪茴回quBZWTAFYj, false);
      ょょよょょょょょょょょよよょよょょょよょょょよょょよよょよよょよよよょGlJtXWGUiD.mc.interactionManager.interactBlock(ょょよょょょょょょょょよよょよょょょよょょょよょょよよょよよょよよよょGlJtXWGUiD.mc.player, Hand.MAIN_HAND, ノノメノメノノノメノメメメノノメメメノノノノメメメノメメメメメメノメノノノメメメメノノメメノメノメメノメメメメノメノメメメノメIYiAuofnfB);
   }

   private BlockPos findCraftingTable() {
      List<BlockPos> 〇ooO〇OooOOo〇〇oOO〇oo〇Ooo〇o〇OO〇〇O〇O〇O〇oOoOooo〇〇OOoOoO〇〇oO〇〇o〇o〇〇oooOoo〇O〇o〇〇oOO〇OoooOo〇〇〇OooO〇oo〇oooo〇oOOOooo〇o〇Oo〇O〇〇OoooaCEYZiYlcr = Class57.getSphere(ノメノノノノメノノノメメメメメノメメノメメメノノメメノノメノノノメメメメメメメメメメノノノメメメノノメメメノノノノメメノメノノノメメメノメノメメメノメメメノノメTtWZNYocfO.mc.player.getBlockPos(), (Integer)ノメノノノノメノノノメメメメメノメメノメメメノノメメノノメノノノメメメメメメメメメメノノノメメメノノメメメノノノノメメノメノノノメメメノメノメメメノメメメノノメTtWZNYocfO.fd_Setting_176.get(), (Integer)ノメノノノノメノノノメメメメメノメメノメメメノノメメノノメノノノメメメメメメメメメメノノノメメメノノメメメノノノノメメノメノノノメメメノメノメメメノメメメノノメTtWZNYocfO.fd_Setting_176.get());
      Iterator var2 = 〇ooO〇OooOOo〇〇oOO〇oo〇Ooo〇o〇OO〇〇O〇O〇O〇oOoOooo〇〇OOoOoO〇〇oO〇〇o〇o〇〇oooOoo〇O〇o〇〇oOO〇OoooOo〇〇〇OooO〇oo〇oooo〇oOOOooo〇o〇Oo〇O〇〇OoooaCEYZiYlcr.iterator();

      BlockPos 墫壿墫壿墫壿墫墫墫墫壿墫墫壿墫墫墫壿壿壿墫墫壿壿墫qeRhKDlxyy;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         墫壿墫壿墫壿墫墫墫墫壿墫墫壿墫墫墫壿壿壿墫墫壿壿墫qeRhKDlxyy = (BlockPos)var2.next();
      } while(Class57.getBlock(墫壿墫壿墫壿墫墫墫墫壿墫墫壿墫墫墫壿壿壿墫墫壿壿墫qeRhKDlxyy) != Blocks.CRAFTING_TABLE);

      return 墫壿墫壿墫壿墫墫墫墫壿墫墫壿墫墫墫壿壿壿墫墫壿壿墫qeRhKDlxyy;
   }

   @EventHandler
   private void onTick(Post 鬬鬭鬭鬭鬬鬬鬭鬭鬬鬬鬭鬬鬬鬭鬭鬬鬬鬭鬬鬭鬬鬬鬭鬬鬭鬭鬭鬭鬬鬭鬬鬬鬭鬬鬬鬬鬬鬭鬬鬬鬬鬭鬭鬭鬬鬭鬭鬬鬭鬭鬬鬭鬭鬬鬬鬬鬭鬭鬭鬬鬬鬬鬬鬭鬭鬬鬬鬭鬬鬭鬬鬭鬬鬬鬭鬭鬭鬭鬭鬬鬭鬭鬭鬭鬭鬬鬬鬭鬭鬭鬬鬬鬬鬬鬭鬭鬬鬭鬬鬬鬭鬬鬭鬬鬬鬬鬬鬭鬭鬭鬬鬭鬬鬭鬭鬬鬬鬭鬬鬭鬭鬭PvvxauGPeO) {
      if (PlayerUtils.getTotalHealth() <= (Double)りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.fd_Setting_186.get()) {
         りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.closeCraftingTable();
      } else if (Class43.isHoldingGap()) {
         りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.closeCraftingTable();
      } else if (りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.willTotemFail()) {
         りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.closeCraftingTable();
      } else {
         if ((Boolean)りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.fd_Setting_175.get() && りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.isOutOfMaterial() && !りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.fd_boolean_172) {
            りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.notify("Cannot activate auto mode, no material left.");
            りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.fd_boolean_172 = true;
         }

         if ((Boolean)りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.fd_Setting_175.get() && りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.needsRefill() && りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.canRefill(true) && !りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.isOutOfMaterial() && !(りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.mc.player.currentScreenHandler instanceof CraftingScreenHandler)) {
            FindItemResult 淼㵘㵘水㵘水淼水淼㵘沝沝水沝淼水水沝水沝水淼㵘沝㵘水水水淼水水沝淼水沝cmmJGocBbS = Class46.findCraftTable();
            if (!淼㵘㵘水㵘水淼水淼㵘沝沝水沝淼水水沝水沝水淼㵘沝㵘水水水淼水水沝淼水沝cmmJGocBbS.found()) {
               りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.toggle();
               りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.notify("No crafting tables in hotbar!");
            } else {
               if ((Boolean)りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.fd_Setting_166.get()) {
                  りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.notify("Searching for nearby crafting tables");
               }

               BlockPos 森林林林木森林森木森林木森木森林森森林森木林林林林木森木森林森林林林林森木林木木木林木森森木木森森森林木林森林林林木森木木森森木木林森森林木木木木木森木林木森森林木林木木林森林森林木林林林森木森森木森林木木林木木森木木木木林林木木木木林木林森林森森森林ldocwpkHvd = りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.findCraftingTable();
               if (森林林林木森林森木森林木森木森林森森林森木林林林林木森木森林森林林林林森木林木木木林木森森木木森森森林木林森林林林木森木木森森木木林森森林木木木木木森木林木森森林木林木木林森林森林木林林林森木森森木森林木木林木木森木木木木林林木木木木林木林森林森森森林ldocwpkHvd == null) {
                  if ((Boolean)りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.fd_Setting_166.get()) {
                     りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.notify("None nearby, placing table and returning.");
                  }

                  if (りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.fd_int_171 <= 0) {
                     りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.fd_int_171 = (Integer)りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.fd_Setting_184.get();
                     りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.placeCraftingTable(淼㵘㵘水㵘水淼水淼㵘沝沝水沝淼水水沝水沝水淼㵘沝㵘水水水淼水水沝淼水沝cmmJGocBbS);
                  } else {
                     --りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.fd_int_171;
                  }
               } else {
                  if ((Boolean)りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.fd_Setting_166.get()) {
                     りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.notify("Located usable crafting table, opening and refilling");
                  }

                  if (りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.fd_int_165 <= 0) {
                     りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.openCraftingTable(森林林林木森林森木森林木森木森林森森林森木林林林林木森木森林森林林林林森木林木木木林木森森木木森森森林木林森林林林木森木木森森木木林森森林木木木木木森木林木森森林木林木木林森林森林木林林林森木森森木森林木木林木木森木木木木林林木木木木林木林森林森森森林ldocwpkHvd);
                     りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.fd_int_165 = (Integer)りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.fd_Setting_174.get();
                     if ((Boolean)りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.fd_Setting_177.get() && !りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.fd_boolean_167) {
                        りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.notify("Refilling...");
                        りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.fd_boolean_167 = true;
                     }

                     りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.fd_boolean_189 = true;
                  } else {
                     --りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.fd_int_165;
                  }
               }
            }
         } else {
            if (りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.fd_boolean_189 && !りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.needsRefill()) {
               if ((Boolean)りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.fd_Setting_177.get()) {
                  りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.notify("Refill complete.");
               }

               りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.fd_boolean_189 = false;
               りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.fd_boolean_167 = false;
               if ((Boolean)りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.fd_Setting_166.get()) {
                  りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.notify("Automatic finished.");
               }
            }

            ScreenHandler var3 = りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.mc.player.currentScreenHandler;
            if (var3 instanceof CraftingScreenHandler) {
               CraftingScreenHandler ああおああおおあああおあおおあおあおおあおおあおおあおあおmFqluzcbOw = (CraftingScreenHandler)var3;
               if (PlayerUtils.getTotalHealth() <= (Double)りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.fd_Setting_186.get() || りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.willTotemFail()) {
                  りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.closeCraftingTable();
                  return;
               }

               if (!りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.canRefill(false)) {
                  if ((Boolean)りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.fd_Setting_166.get()) {
                     りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.notify("Cancelling current refill because canRefill is false");
                  }

                  りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.closeCraftingTable();
                  if ((Boolean)りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.fd_Setting_185.get()) {
                     りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.mc.player.getInventory().updateItems();
                  }

                  return;
               }

               if (りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.isOutOfMaterial()) {
                  if ((Boolean)りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.fd_Setting_177.get()) {
                     りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.notify("You are out of material!");
                  }

                  if ((Boolean)りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.fd_Setting_173.get()) {
                     りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.toggle();
                  }

                  りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.closeCraftingTable();
                  if ((Boolean)りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.fd_Setting_185.get()) {
                     りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.mc.player.getInventory().updateItems();
                  }

                  return;
               }

               if (Class46.isInventoryFull()) {
                  if ((Boolean)りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.fd_Setting_169.get()) {
                     りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.toggle();
                  }

                  if ((Boolean)りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.fd_Setting_188.get()) {
                     りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.closeCraftingTable();
                     if ((Boolean)りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.fd_Setting_185.get()) {
                        りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.mc.player.getInventory().updateItems();
                     }
                  }

                  if ((Boolean)りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.fd_Setting_177.get() && !(Boolean)りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.fd_Setting_175.get()) {
                     りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.notify("Your inventory is full.");
                  }

                  return;
               }

               List<RecipeResultCollection> QQPQqQQQpQpQPqpQqpTGdyvarHI = りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.mc.player.getRecipeBook().getResultsForGroup(RecipeBookGroup.CRAFTING_MISC);
               if (りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.fd_int_187 > 0) {
                  --りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.fd_int_187;
                  return;
               }

               りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.fd_int_187 = (Integer)りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.fd_Setting_178.get();
               Iterator var4 = QQPQqQQQpQpQPqpQqpTGdyvarHI.iterator();

               while(var4.hasNext()) {
                  RecipeResultCollection iliLjjjlIJJJJIljlilljIlljJjJLIjjJiJlILjLLlILiIIljJLilIjiIiiJLLlIJllJiJjlliJiJliIjJIljllIJIJyUuZAGHQc = (RecipeResultCollection)var4.next();
                  Iterator var6 = iliLjjjlIJJJJIljlilljIlljJjJLIjjJiJlILjLLlILiIIljJLilIjiIiiJLLlIJllJiJjlliJiJliIjJIljllIJIJyUuZAGHQc.getRecipes(true).iterator();

                  while(var6.hasNext()) {
                     Recipe<?> ソンジジゾシソシンンンツジンツヅツゾソツjsDWXVjGYF = (Recipe)var6.next();
                     if (ソンジジゾシソシンンンツジンツヅツゾソツjsDWXVjGYF.getOutput().getItem() instanceof BedItem) {
                        assert りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.mc.interactionManager != null;

                        りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.mc.interactionManager.clickRecipe(ああおああおおあああおあおおあおあおおあおおあおおあおあおmFqluzcbOw.syncId, ソンジジゾシソシンンンツジンツヅツゾソツjsDWXVjGYF, false);
                        りリぃいりぃぃぃリぃりりリリリりいリリいぃいいぃいぃリリぃいリリリリりリいいいいぃリりリりぃぃいいいリいぃいりぃいぃぃぃいりりいぃりぃぃぃぃりぃぃぃDOWzgiJHdw.windowClick(ああおああおおあああおあおおあおあおおあおおあおおあおあおmFqluzcbOw, 0, SlotActionType.QUICK_MOVE, 1);
                     }
                  }
               }
            }

         }
      }
   }

   private void notify(String 晆洼㤬䞨烓烓桂桂晆垚垚佳烓䞨茥㤬茥眭㤬㤬烓垚茥眭洼佳茥佳眭䞨茥烓䞨桂佳洼㤬桂桂佳䞨垚洼垚晆眭眭㤬佳佳佳晆垚晆眭垚䞨烓茥洼㤬佳洼垚眭㤬茥茥眭茥茥晆桂佳桂茥茥晆洼䞨烓䞨晆晆眭洼洼晆䞨佳䞨桂眭晆佳佳洼垚晆烓眭洼㤬茥垚晆烓烓眭眭烓㤬晆烓垚茥㤬眭晆眭烓垚烓洼晆眭VQpVUkAida) {
      String SSSsSSSsssSssSSSSSsSSszincKEESSN = "[" + ムムㄙㄙムㄙㄙムムㄙムムㄙㄙムムㄙムムRQAhrhUhIq.name + "] ";
      switch((mode)ムムㄙㄙムㄙㄙムムㄙムムㄙㄙムムㄙムムRQAhrhUhIq.fd_Setting_168.get()) {
      case fd_mode_881:
         ムムㄙㄙムㄙㄙムムㄙムムㄙㄙムムㄙムムRQAhrhUhIq.info(淼㵘㵘㵘淼㵘沝㵘㵘水㵘水㵘水水淼淼水淼水淼㵘淼淼水㵘水淼㵘沝沝淼㵘水㵘沝淼水淼水沝沝水水淼淼㵘水沝水淼㵘㵘㵘沝淼淼淼淼淼㵘水沝淼水水OLKfCIRXBA, new Object[0]);
         break;
      case fd_mode_883:
         NotificationsHUD.addNotification(SSSsSSSsssSssSSSSSsSSszincKEESSN + 淼㵘㵘㵘淼㵘沝㵘㵘水㵘水㵘水水淼淼水淼水淼㵘淼淼水㵘水淼㵘沝沝淼㵘水㵘沝淼水淼水沝沝水水淼淼㵘水沝水淼㵘㵘㵘沝淼淼淼淼淼㵘水沝淼水水OLKfCIRXBA);
      }

   }

   private void windowClick(ScreenHandler 洼晆䞨洼㤬烓眭䞨茥垚眭桂洼䞨眭垚桂桂佳垚桂桂垚垚洼垚䞨眭眭䞨佳㤬垚茥䞨洼晆桂晆䞨桂㤬佳烓佳晆佳茥烓㤬烓晆桂佳眭烓桂茥佳㤬洼烓㤬㤬㤬佳佳茥䞨垚烓佳佳桂茥佳眭䞨㤬眭垚㤬晆洼垚㤬㤬桂烓㤬茥洼桂眭垚烓眭眭眭佳垚㤬佳晆晆桂烓洼㤬㤬洼桂晆rztdGXgzCM, int 鬬鬭鬬鬬鬭鬬鬭鬬鬬鬬鬭鬭鬭鬭鬬鬬鬭鬭鬭鬬鬭鬬鬭鬭鬬鬬鬭鬬鬭鬬鬭鬭鬭鬬鬭鬬鬭鬭鬬鬬鬭鬭鬬鬭鬬鬬鬬鬭鬭鬬鬬鬬鬬鬭鬬鬬鬬鬭鬬鬭鬬鬭鬭鬭鬭鬭鬬鬭鬬鬬鬬鬬鬭鬭鬭鬭鬬鬭鬭鬭鬬鬬鬬鬬鬭鬭鬭鬬鬬鬭鬭鬭鬬鬭鬬MjkFjqtvma, SlotActionType いいいぃいぃいぃいぃりりいいぃいぃりリりいいリぃぃリjgfaAMHdzA, int いいいリりりぃりリぃりぃいぃいりリリいりりりりりリぃリリぃりいぃぃりぃぃりいいりリりりりりいぃぃリりぃぃいぃりぃぃいぃいりりいぃぃぃリリいりいリリいリリりリりぃいりりぃぃリいぃリぃりいぃいりリいリリリリリりリリりいいいいリりりりいりりリいリぃぃリぃぃcoxPkXMNvL) {
      assert りリりぃぃいいぃぃいリりいいりりリいぃぃぃりぃりぃりぃリリリりいリりeqxirPTPJa.mc.interactionManager != null;

      りリりぃぃいいぃぃいリりいいりりリいぃぃぃりぃりぃりぃリリリりいリりeqxirPTPJa.mc.interactionManager.clickSlot(鬬鬭鬭鬭鬭鬭鬬鬬鬭鬬鬭鬭鬭鬬鬭鬭鬭鬬鬭鬬鬬鬭鬬鬬鬭鬭鬬鬬鬭鬬鬬鬭鬬鬭鬭鬭鬬鬭鬭鬭鬬鬭鬬鬬鬬鬬鬬鬭鬭鬭鬭鬬鬭鬭鬭鬭鬬鬬鬬鬭鬬鬬鬭鬭鬭鬭鬬鬭鬭鬬鬬鬬鬭鬭鬬鬬鬬鬭鬬鬭鬭QmtOrAwyYu.syncId, 木森林木森木森木木林木林林木森dkQCxammiS, 〇oo〇Oo〇oO〇o〇O〇O〇oOOOO〇Oo〇o〇OooO〇OooOoo〇OcBoLmsdocn, 森林森森林林森木森木木林木木木森林森森木木木森木林木林木森林木林木木木森森木木林林森木木木木林木木木森木林木森木林森林林木森木木森林林木林木森木木林森森森木林林森木森木林木森林林木木木木森林林林木林木xVsJdadqnQ, りリりぃぃいいぃぃいリりいいりりリいぃぃぃりぃりぃりぃリリリりいリりeqxirPTPJa.mc.player);
   }

   private void closeCraftingTable() {
      if (ㇸへ乀乀へ乀ㇸㇸ乀乀へへㇸへ乀へへへ乀へㇸへ乀へ乀乀ㇸ乀へㇸ乀ㇸ乀乀乀ㇸへㇸㇸへへへへㇸへㇸ乀乀へへへㇸㇸ乀ㇸㇸㇸへへㇸ乀ㇸㇸ乀へ乀乀乀ㇸ乀へ乀乀へへへㇸへへへへへ乀へへ乀ㇸ乀ㇸㇸ乀乀へ乀乀へ乀乀へㇸㇸㇸへへㇸㇸへへ乀ㇸ乀ㇸDhHsbMEVpM.mc.player.currentScreenHandler instanceof CraftingScreenHandler) {
         ㇸへ乀乀へ乀ㇸㇸ乀乀へへㇸへ乀へへへ乀へㇸへ乀へ乀乀ㇸ乀へㇸ乀ㇸ乀乀乀ㇸへㇸㇸへへへへㇸへㇸ乀乀へへへㇸㇸ乀ㇸㇸㇸへへㇸ乀ㇸㇸ乀へ乀乀乀ㇸ乀へ乀乀へへへㇸへへへへへ乀へへ乀ㇸ乀ㇸㇸ乀乀へ乀乀へ乀乀へㇸㇸㇸへへㇸㇸへへ乀ㇸ乀ㇸDhHsbMEVpM.mc.player.closeHandledScreen();
      }

   }

   public void onActivate() {
      Class66.moduleAuth();
      㙓㙓桂垚烓洼桂澆土澆垚烓桂茥gwTzDjJlKO.fd_int_187 = (Integer)㙓㙓桂垚烓洼桂澆土澆垚烓桂茥gwTzDjJlKO.fd_Setting_178.get();
      㙓㙓桂垚烓洼桂澆土澆垚烓桂茥gwTzDjJlKO.fd_int_171 = (Integer)㙓㙓桂垚烓洼桂澆土澆垚烓桂茥gwTzDjJlKO.fd_Setting_184.get();
      㙓㙓桂垚烓洼桂澆土澆垚烓桂茥gwTzDjJlKO.fd_int_165 = (Integer)㙓㙓桂垚烓洼桂澆土澆垚烓桂茥gwTzDjJlKO.fd_Setting_174.get();
   }

   private boolean canRefill(boolean 茴回徊徊茴徊回茴徊佪佪回徊佪回佪茴徊徊徊佪佪Wvbzibkief) {
      if (!(Boolean)炎欻欻炏炎焱炏焱炏炎燚炎燚欻火燚欻燚火欻燚炎焱炏炏燚焱炎焱火燚燚火炏焱炏炏炎欻欻燚焱火焱火欻燚炎焱炎炏火火炎燚炎炎炏炏火炎燚火燚火欻炎燚炎欻火焱火炏RwBQqtTBVX.fd_Setting_183.get() && sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.isPlayerMoving(炎欻欻炏炎焱炏焱炏炎燚炎燚欻火燚欻燚火欻燚炎焱炏炏燚焱炎焱火燚燚火炏焱炏炏炎欻欻燚焱火焱火欻燚炎焱炎炏火火炎燚炎炎炏炏火炎燚火燚火欻炎燚炎欻火焱火炏RwBQqtTBVX.mc.player)) {
         return false;
      } else if ((Boolean)炎欻欻炏炎焱炏焱炏炎燚炎燚欻火燚欻燚火欻燚炎焱炏炏燚焱炎焱火燚燚火炏焱炏炏炎欻欻燚焱火焱火欻燚炎焱炎炏火火炎燚炎炎炏炏火炎燚火燚火欻炎燚炎欻火焱火炏RwBQqtTBVX.jJJILJJlJJlJlJLLLijlJiillLIiLJIIILlljjjLlLJjJLLJijijLJlLjjiJjiJljjjjIjJIiLJjiII.get() && !sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.isInHole(炎欻欻炏炎焱炏焱炏炎燚炎燚欻火燚欻燚火欻燚炎焱炏炏燚焱炎焱火燚燚火炏焱炏炏炎欻欻燚焱火焱火欻燚炎焱炎炏火火炎燚炎炎炏炏火炎燚火燚火欻炎燚炎欻火焱火炏RwBQqtTBVX.mc.player)) {
         return false;
      } else if ((Boolean)炎欻欻炏炎焱炏焱炏炎燚炎燚欻火燚欻燚火欻燚炎焱炏炏燚焱炎焱火燚燚火炏焱炏炏炎欻欻燚焱火焱火欻燚炎焱炎炏火火炎燚炎炎炏炏火炎燚火燚火欻炎燚炎欻火焱火炏RwBQqtTBVX.fd_Setting_180.get() && !炎欻欻炏炎焱炏焱炏炎燚炎燚欻火燚欻燚火欻燚炎焱炏炏燚焱炎焱火燚燚火炏焱炏炏炎欻欻燚焱火焱火欻燚炎焱炎炏火火炎燚炎炎炏炏火炎燚火燚火欻炎燚炎欻火焱火炏RwBQqtTBVX.mc.player.isOnGround()) {
         return false;
      } else if (Class46.isInventoryFull()) {
         return false;
      } else if (ノノノノノメノメノノノノgGJEEyCOeY && Class46.getEmptySlots() < (Integer)炎欻欻炏炎焱炏焱炏炎燚炎燚欻火燚欻燚火欻燚炎焱炏炏燚焱炎焱火燚燚火炏焱炏炏炎欻欻燚焱火焱火欻燚炎焱炎炏火火炎燚炎炎炏炏火炎燚火燚火欻炎燚炎欻火焱火炏RwBQqtTBVX.fd_Setting_170.get()) {
         return false;
      } else {
         return PlayerUtils.getTotalHealth() > (Double)炎欻欻炏炎焱炏焱炏炎燚炎燚欻火燚欻燚火欻燚炎焱炏炏燚焱炎焱火燚燚火炏焱炏炏炎欻欻燚焱火焱火欻燚炎焱炎炏火火炎燚炎炎炏炏火炎燚火燚火欻炎燚炎欻火焱火炏RwBQqtTBVX.fd_Setting_186.get();
      }
   }

   private boolean isOutOfMaterial() {
      FindItemResult ゅゆゅゆゅゆゆゅゅゅゅゅゆゆゆゆゅゅゅゆゆゅゅゅゅゅゅゆゅゅゅゅゅゆゅゆゆゅゆゆゅゅゅゆゅゅゆゅゆゅゆゆゅゅゅゆゅゆゆゆゅゅゅゆゆゅゅゅゆゅゆゆゅゅゅゆゅゅゆゅゅゅゅゅゅゅゅゆゅゆゅゆゅゅゅゅゆゆゅゅゅゅDjsGaNYkny = InvUtils.find((壿墫墫壿壿墫墫壿墫墫墫壿墫壿墫墫壿墫墫壿墫壿壿壿壿壿墫壿墫墫墫壿墫壿墫壿壿墫壿墫壿壿壿壿壿壿壿壿壿墫壿壿墫壿墫墫墫壿壿墫墫墫墫壿壿壿壿壿墫壿墫壿壿墫墫墫壿壿壿壿墫壿壿墫壿壿壿壿壿壿墫墫壿墫墫壿壿壿墫壿壿墫壿壿墫墫壿墫壿墫壿壿壿壿壿壿vIQctYHQTS) -> {
         return Class46.fd_ArrayList_1012.contains(壿墫墫壿壿墫墫壿墫墫墫壿墫壿墫墫壿墫墫壿墫壿壿壿壿壿墫壿墫墫墫壿墫壿墫壿壿墫壿墫壿壿壿壿壿壿壿壿壿墫壿壿墫壿墫墫墫壿壿墫墫墫墫壿壿壿壿壿墫壿墫壿壿墫墫墫壿壿壿壿墫壿壿墫壿壿壿壿壿壿墫墫壿墫墫壿壿壿墫壿壿墫壿壿墫墫壿墫壿墫壿壿壿壿壿壿vIQctYHQTS.getItem());
      });
      FindItemResult qqQpQpqpqpPvdvSfqVvOf = InvUtils.find((ㇸㇸㇸ乀ㇸへㇸㇸㇸへㇸ乀へㇸへへ乀乀ㇸㇸへへへ乀乀ㇸㇸㇸへへ乀乀乀ㇸへㇸ乀へ乀乀ㇸㇸへ乀へ乀へ乀乀ㇸ乀乀ㇸへへへへへへへへ乀ㇸへ乀へへㇸ乀へへ乀へへ乀乀ㇸㇸㇸ乀乀ㇸiUlUYwrDjJ) -> {
         return Class46.fd_ArrayList_1010.contains(ㇸㇸㇸ乀ㇸへㇸㇸㇸへㇸ乀へㇸへへ乀乀ㇸㇸへへへ乀乀ㇸㇸㇸへへ乀乀乀ㇸへㇸ乀へ乀乀ㇸㇸへ乀へ乀へ乀乀ㇸ乀乀ㇸへへへへへへへへ乀ㇸへ乀へへㇸ乀へへ乀へへ乀乀ㇸㇸㇸ乀乀ㇸiUlUYwrDjJ.getItem());
      });
      FindItemResult 淼沝㵘沝沝淼㵘水水沝水㵘水沝淼淼沝淼淼淼淼水㵘水淼㵘淼水沝㵘水㵘淼沝㵘淼㵘水㵘沝水水水水㵘㵘㵘水淼㵘沝㵘淼水水沝淼㵘淼淼淼沝淼水淼㵘沝沝淼淼淼沝沝㵘水xNiVxwTWkn = Class46.findCraftTable();
      if (!淼沝㵘沝沝淼㵘水水沝水㵘水沝淼淼沝淼淼淼淼水㵘水淼㵘淼水沝㵘水㵘淼沝㵘淼㵘水㵘沝水水水水㵘㵘㵘水淼㵘沝㵘淼水水沝淼㵘淼淼淼沝淼水淼㵘沝沝淼淼淼沝沝㵘水xNiVxwTWkn.found()) {
         return true;
      } else if (ゅゆゅゆゅゆゆゅゅゅゅゅゆゆゆゆゅゅゅゆゆゅゅゅゅゅゅゆゅゅゅゅゅゆゅゆゆゅゆゆゅゅゅゆゅゅゆゅゆゅゆゆゅゅゅゆゅゆゆゆゅゅゅゆゆゅゅゅゆゅゆゆゅゅゅゆゅゅゆゅゅゅゅゅゅゅゅゆゅゆゅゆゅゅゅゅゆゆゅゅゅゅDjsGaNYkny.found() && qqQpQpqpqpPvdvSfqVvOf.found()) {
         return ゅゆゅゆゅゆゆゅゅゅゅゅゆゆゆゆゅゅゅゆゆゅゅゅゅゅゅゆゅゅゅゅゅゆゅゆゆゅゆゆゅゅゅゆゅゅゆゅゆゅゆゆゅゅゅゆゅゆゆゆゅゅゅゆゆゅゅゅゆゅゆゆゅゅゅゆゅゅゆゅゅゅゅゅゅゅゅゆゅゆゅゆゅゅゅゅゆゆゅゅゅゅDjsGaNYkny.count() < 3 || qqQpQpqpqpPvdvSfqVvOf.count() < 3;
      } else {
         return true;
      }
   }

   private void placeCraftingTable(FindItemResult よょよょよょよよよょょYEHwWvrtZo) {
      List<BlockPos> あおあおおあおあおおおあおあおおおおおあおあおおおおkfboZKzohh = Class57.getSphere(ヅシソヅシツンツジゾシジシヅジゾゾシジソソジジンンジジヅンシソジンヅンンゾジソジソソジゾツソジシジゾンヅンゾジヅヅンヅゾンゾシシジジンソソシシソツシンヅジツジジシツツジツゾソヅンジツヅヅヅジヅジシジヅツンヅシシヅヅヅqJVaRGfQSG.mc.player.getBlockPos(), (Integer)ヅシソヅシツンツジゾシジシヅジゾゾシジソソジジンンジジヅンシソジンヅンンゾジソジソソジゾツソジシジゾンヅンゾジヅヅンヅゾンゾシシジジンソソシシソツシンヅジツジジシツツジツゾソヅンジツヅヅヅジヅジシジヅツンヅシシヅヅヅqJVaRGfQSG.fd_Setting_176.get(), (Integer)ヅシソヅシツンツジゾシジシヅジゾゾシジソソジジンンジジヅンシソジンヅンンゾジソジソソジゾツソジシジゾンヅンゾジヅヅンヅゾンゾシシジジンソソシシソツシンヅジツジジシツツジツゾソヅンジツヅヅヅジヅジシジヅツンヅシシヅヅヅqJVaRGfQSG.fd_Setting_176.get());
      Iterator var3 = あおあおおあおあおおおあおあおおおおおあおあおおおおkfboZKzohh.iterator();

      while(var3.hasNext()) {
         BlockPos ょょよよょよよょよよよょょよょょょょょよょょょょよよよょよよよょょょょょょょょよょよよよよょょょよょよよょょょよよよよよよよょょょょょょょょょよよょょよよよょよょよoHKGDxTfwB = (BlockPos)var3.next();
         if (Class57.getBlock(ょょよよょよよょよよよょょよょょょょょよょょょょよよよょよよよょょょょょょょょよょよよよよょょょよょよよょょょよよよよよよよょょょょょょょょょよよょょよよよょよょよoHKGDxTfwB) == Blocks.AIR && BlockUtils.canPlace(ょょよよょよよょよよよょょよょょょょょよょょょょよよよょよよよょょょょょょょょよょよよよよょょょよょよよょょょよよよよよよよょょょょょょょょょよよょょよよよょよょよoHKGDxTfwB, true)) {
            BlockUtils.place(ょょよよょよよょよよよょょよょょょょょよょょょょよよよょよよよょょょょょょょょよょよよよよょょょよょよよょょょよよよよよよよょょょょょょょょょよよょょよよよょよょよoHKGDxTfwB, よょよょよよよよよょよよよよょよよよょょょょょょよょよょょょよょょょよょよよょよよよよょょよよょょよょょょよよょよょょょよよよょよょよょよょよょょょょょょょょょょょよよょょよょよよょょよょょよGMBLpGZKmL, 0, true);
            break;
         }
      }

   }

   public AutoBedCraft() {
      super(Class68.fd_Category_1060, "auto-bed-craft", "Automatically craft beds.");
      SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_SettingGroup_179 = SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.settings.getDefaultGroup();
      SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_SettingGroup_181 = SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.settings.createGroup("Auto (Buggy)");
      SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_Setting_169 = SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_SettingGroup_179.add(((Builder)((Builder)((Builder)(new Builder()).name("disable-after")).description("Toggle off after filling your inv with beds.")).defaultValue(false)).build());
      SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_Setting_173 = SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_SettingGroup_179.add(((Builder)((Builder)((Builder)(new Builder()).name("disable-on-no-mats")).description("Toggle off if you run out of material.")).defaultValue(false)).build());
      SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_Setting_188 = SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_SettingGroup_179.add(((Builder)((Builder)((Builder)(new Builder()).name("close-after")).description("Close the crafting GUI after filling.")).defaultValue(true)).build());
      SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_Setting_178 = SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_SettingGroup_179.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("craft-delay")).description("Delay between crafting beds.")).defaultValue(0)).min(0).sliderMax(10).build());
      SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_Setting_184 = SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_SettingGroup_179.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("table-place-delay")).description("Delay between placing crafting tables.")).defaultValue(3)).min(1).sliderMax(10).build());
      SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_Setting_174 = SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_SettingGroup_179.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("table-open-delay")).description("Delay between opening crafting tables.")).defaultValue(3)).min(1).sliderMax(10).build());
      SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_Setting_168 = SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_SettingGroup_179.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("notification-mode")).description("How notifications are displayed.")).defaultValue(mode.fd_mode_881)).build());
      SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_Setting_175 = SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_SettingGroup_181.add(((Builder)((Builder)((Builder)(new Builder()).name("automatic")).description("Automatically place/search for and open crafting tables when you're out of beds.")).defaultValue(false)).build());
      SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.SSsSSSSSsSssssSSsSsSSsS = SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_SettingGroup_181.add(((Builder)((Builder)((Builder)(new Builder()).name("anti-totem-fail")).description("Will not open / close current crafting table if you don't have a totem.")).defaultValue(false)).build());
      SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_Setting_185 = SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_SettingGroup_181.add(((Builder)((Builder)((Builder)(new Builder()).name("anti-desync")).description("Try to prevent inventory desync.")).defaultValue(false)).build());
      SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_Setting_166 = SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_SettingGroup_181.add(((Builder)((Builder)((Builder)(new Builder()).name("debug")).description("Don't enable")).defaultValue(false)).build());
      SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_Setting_177 = SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_SettingGroup_181.add(((Builder)((Builder)((Builder)(new Builder()).name("chat-info")).description("Alerts you in chat when auto refill is starting.")).defaultValue(false)).build());
      SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.jJJILJJlJJlJlJLLLijlJiillLIiLJIIILlljjjLlLJjJLLJijijLJlLjjiJjiJljjjjIjJIiLJjiII = SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_SettingGroup_181.add(((Builder)((Builder)((Builder)(new Builder()).name("in-hole-only")).description("Only auto refill while in a hole.")).defaultValue(false)).build());
      SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_Setting_180 = SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_SettingGroup_181.add(((Builder)((Builder)((Builder)(new Builder()).name("on-ground-only")).description("Only auto refill while on the ground.")).defaultValue(false)).build());
      SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_Setting_183 = SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_SettingGroup_181.add(((Builder)((Builder)((Builder)(new Builder()).name("while-moving")).description("Allow auto refill while in motion")).defaultValue(false)).build());
      SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_Setting_182 = SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_SettingGroup_181.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("refill-at")).description("How many beds are left in your inventory to start filling.")).defaultValue(3)).min(1).build());
      SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_Setting_170 = SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_SettingGroup_181.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("required-empty-slots")).description("How many empty slots are required for activation.")).defaultValue(5)).min(1).build());
      SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_Setting_176 = SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_SettingGroup_181.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("radius")).description("How far to search for crafting tables near you.")).defaultValue(3)).min(1).build());
      SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_Setting_186 = SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_SettingGroup_181.add(((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)(new meteordevelopment.meteorclient.settings.DoubleSetting.Builder()).name("min-health")).description("Min health require to activate.")).defaultValue(10.0D).min(1.0D).max(36.0D).sliderMax(36.0D).build());
      SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_boolean_189 = false;
      SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_boolean_167 = false;
      SsSSSsSSSSsSSSSSSssSSSsssSSsSsSssSSSSSSsSsSSssSssSSSSsSSssSSSsSSSsSsSSSsSSSSsSssSSsSSSsSssSsssSssSSSSSsSssSSSSHgeMjicRHV.fd_boolean_172 = false;
   }

   private boolean willTotemFail() {
      if (!(Boolean)炏火炏炎焱火炎焱炏焱燚炎燚欻燚燚火燚燚欻炎炏炎欻炏炎炏欻燚炏焱炎火焱燚火炎欻火欻炏炏焱燚炎欻炏炎炏燚火火炏炏欻炏欻炎欻欻炏火焱欻燚炏炏燚焱炎火火炏燚欻炏燚炏火炎炏燚炏炎phMPtLRveu.SSsSSSSSsSssssSSsSsSSsS.get()) {
         return false;
      } else {
         Item ㄑくㄑくくくくㄑくㄑㄑくㄑㄑㄑくㄑくㄑくㄑくㄑくくくㄑㄑㄑくくㄑくくくㄑくくㄑBFaBcIRSJI = 炏火炏炎焱火炎焱炏焱燚炎燚欻燚燚火燚燚欻炎炏炎欻炏炎炏欻燚炏焱炎火焱燚火炎欻火欻炏炏焱燚炎欻炏炎炏燚火火炏炏欻炏欻炎欻欻炏火焱欻燚炏炏燚焱炎火火炏燚欻炏燚炏火炎炏燚炏炎phMPtLRveu.mc.player.getOffHandStack().getItem();
         if (ㄑくㄑくくくくㄑくㄑㄑくㄑㄑㄑくㄑくㄑくㄑくㄑくくくㄑㄑㄑくくㄑくくくㄑくくㄑBFaBcIRSJI == null) {
            return true;
         } else {
            return ㄑくㄑくくくくㄑくㄑㄑくㄑㄑㄑくㄑくㄑくㄑくㄑくくくㄑㄑㄑくくㄑくくくㄑくくㄑBFaBcIRSJI != Items.TOTEM_OF_UNDYING;
         }
      }
   }

   private boolean needsRefill() {
      FindItemResult ijLJJJLijLJLjiILJliLiJliiLLJJjiLllljJLlilJllLiLIlIlLjJiiJIIlIJLLLJIllljIJJljiJlLJJLJljiLlLjgMaUlEmEiX = InvUtils.find((㬺幐㬺幐㬺幐㬺㬺㬺幐幐幐㬺㬺幐幐㬺㬺幐幐㬺㬺幐幐幐幐㬺幐㬺㬺㬺幐㬺㬺㬺幐幐幐㬺㬺㬺㬺㬺㬺㬺幐㬺㬺幐幐幐㬺幐幐幐幐幐㬺㬺㬺oiQxuMDURH) -> {
         return 㬺幐㬺幐㬺幐㬺㬺㬺幐幐幐㬺㬺幐幐㬺㬺幐幐㬺㬺幐幐幐幐㬺幐㬺㬺㬺幐㬺㬺㬺幐幐幐㬺㬺㬺㬺㬺㬺㬺幐㬺㬺幐幐幐㬺幐幐幐幐幐㬺㬺㬺oiQxuMDURH.getItem() instanceof BedItem;
      });
      if (!ijLJJJLijLJLjiILJliLiJliiLLJJjiLllljJLlilJllLiLIlIlLjJiiJIIlIJLLLJIllljIJJljiJlLJJLJljiLlLjgMaUlEmEiX.found()) {
         return true;
      } else if (ijLJJJLijLJLjiILJliLiJliiLLJJjiLllljJLlilJllLiLIlIlLjJiiJIIlIJLLLJIllljIJJljiJlLJJLJljiLlLjgMaUlEmEiX.count() <= (Integer)晚晚晩晩晩晩晚晩晚晩晩晚晩晚晚晚晚晩晩晩晚cGPNqIxZbV.fd_Setting_182.get()) {
         return true;
      } else {
         return !Class46.isInventoryFull();
      }
   }
}
