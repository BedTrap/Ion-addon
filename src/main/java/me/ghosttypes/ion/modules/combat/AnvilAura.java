/* Decompiler 125ms, total 324ms, lines 263 */
package me.ghosttypes.ion.modules.combat;

import java.util.ArrayList;
import java.util.Iterator;
import me.ghosttypes.ion.utils.Class68;
import me.ghosttypes.ion.utils.sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS;
import me.ghosttypes.ion.utils.combat.Class11;
import me.ghosttypes.ion.utils.combat.Class5_Enum;
import me.ghosttypes.ion.utils.combat.Class6;
import me.ghosttypes.ion.utils.events.Class17;
import me.ghosttypes.ion.utils.player.Class44;
import me.ghosttypes.ion.utils.player.Class46;
import me.ghosttypes.ion.utils.world.Class57;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.events.world.TickEvent.Post;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.DoubleSetting.Builder;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.entity.SortPriority;
import meteordevelopment.meteorclient.utils.entity.TargetUtils;
import meteordevelopment.meteorclient.utils.player.FindItemResult;
import meteordevelopment.meteorclient.utils.world.BlockUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class AnvilAura extends Module {
   private final Setting<Boolean> fd_Setting_124;
   public final Setting<AnvilAura.LegacyMode> fd_Setting_125;
   private int fd_int_126;
   private int fd_int_127;
   private final Setting<Integer> fd_Setting_128;
   private PlayerEntity fd_PlayerEntity_129;
   private final SettingGroup fd_SettingGroup_130;
   private final SettingGroup fd_SettingGroup_131;
   private final Setting<AnvilAura.AnvilMode> fd_Setting_132;
   private final Setting<Boolean> fd_Setting_133;
   public final Setting<SortPriority> fd_Setting_134;
   private final Setting<AnvilAura.RotationMode> fd_Setting_135;
   private final Setting<Integer> fd_Setting_136;
   private final Setting<Integer> fd_Setting_137;
   private final Setting<Integer> fd_Setting_138;
   private final Setting<Double> fd_Setting_139;
   private final Setting<AnvilAura.ButtonMode> fd_Setting_140;
   public final Setting<Class5_Enum> fd_Setting_141;
   private boolean fd_boolean_142;
   private final Setting<Boolean> fd_Setting_143;

   @EventHandler
   private void onTick(Post 壿墫墫墫壿墫墫壿墫壿壿壿墫壿墫壿壿壿壿墫墫墫墫墫墫壿墫壿壿壿壿壿墫壿壿墫墫壿壿墫墫壿墫壿壿壿墫壿壿墫墫壿墫墫墫壿壿壿壿墫壿墫壿墫壿墫壿墫壿墫墫壿壿壿壿墫壿壿墫壿墫壿墫壿壿墫墫墫墫壿墫) {
      ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_int_127 = 0;
      if (ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_PlayerEntity_129 == null) {
         ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_PlayerEntity_129 = TargetUtils.getPlayerTarget((Double)ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_Setting_139.get(), (SortPriority)ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_Setting_134.get());
         if (TargetUtils.isBadTarget(ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_PlayerEntity_129, (Double)ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_Setting_139.get())) {
            ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_PlayerEntity_129 = null;
         }

         if (ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_PlayerEntity_129 == null) {
            ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.error("No targets in range.", new Object[0]);
            ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.toggle();
            return;
         }
      } else {
         if (ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_PlayerEntity_129.deathTime > 0 || ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_PlayerEntity_129.getHealth() <= 0.0F) {
            MeteorClient.EVENT_BUS.post(Class17.get(ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_PlayerEntity_129, ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_PlayerEntity_129.getPos()));
         }

         ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_PlayerEntity_129 = null;
      }

      FindItemResult ょょよょょょよよよよょよょょょょょょょよよょょよよよよょよょよょょょよよょよよょょよよよよょよょよょょょよよょよょょょよよよょょ = Class46.findAnvil();
      FindItemResult 晆䞨㤬眭佳茥佳䞨茥茥茥眭㤬垚垚䞨烓烓佳晆䞨眭桂茥茥㤬晆茥茥洼䞨晆桂茥眭㤬垚茥洼桂茥茥晆䞨㤬佳佳茥眭䞨㤬垚茥晆烓洼䞨眭晆眭茥䞨晆洼茥茥佳洼垚烓烓桂晆䞨䞨垚䞨洼烓佳㤬烓䞨垚桂垚桂垚洼茥垚烓垚眭桂佳垚䞨眭㤬垚㤬洼晆烓佳 = Class46.findButton();
      if (!ょょよょょょよよよよょよょょょょょょょよよょょよよよよょよょよょょょよよょよよょょよよよよょよょよょょょよよょよょょょよよよょょ.found()) {
         ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.error("No anvils in hotbar.", new Object[0]);
         ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.toggle();
      } else if (!晆䞨㤬眭佳茥佳䞨茥茥茥眭㤬垚垚䞨烓烓佳晆䞨眭桂茥茥㤬晆茥茥洼䞨晆桂茥眭㤬垚茥洼桂茥茥晆䞨㤬佳佳茥眭䞨㤬垚茥晆烓洼䞨眭晆眭茥䞨晆洼茥茥佳洼垚烓烓桂晆䞨䞨垚䞨洼烓佳㤬烓䞨垚桂垚桂垚洼茥垚烓垚眭桂佳垚䞨眭㤬垚㤬洼晆烓佳.found()) {
         ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.error("No buttons or pressure plates in hotbar.", new Object[0]);
         ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.toggle();
      } else {
         boolean ゆゅゅゅゅゆゆゆゅゆゅゆゅゆゆゅゆゆゅゅゅゅゆゅゅゅゆゅゆゅゆゅゆゆゆゅゅゅゅゆゅゆゆゆゅゆゆゆゅゆゆゅゅゆゅゆゆゅゅゅゆゆゅゆゆゅゅゅゅゅゅゆゆゅゆゆゆゅゅ;
         if ((Boolean)ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_Setting_124.get() || (Boolean)ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_Setting_143.get()) {
            BlockPos OO〇O〇o〇OOO〇o〇oOo〇Oo〇〇〇〇OoOo〇〇〇〇o〇〇OoOo〇〇〇O = ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.getAntiAnvilBlock(ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_PlayerEntity_129);
            if ((Boolean)ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_Setting_124.get() && OO〇O〇o〇OOO〇o〇oOo〇Oo〇〇〇〇OoOo〇〇〇〇o〇〇OoOo〇〇〇O != null) {
               ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.toggle();
               return;
            }

            ゆゅゅゅゅゆゆゆゅゆゅゆゅゆゆゅゆゆゅゅゅゅゆゅゅゅゆゅゆゅゆゅゆゆゆゅゅゅゅゆゅゆゆゆゅゆゆゆゅゆゆゅゅゆゅゆゆゅゅゅゆゆゅゆゆゅゅゅゅゅゅゆゆゅゆゆゆゅゅ = ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_Setting_135.get() == AnvilAura.RotationMode.fd_RotationMode_153 || ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_Setting_135.get() == AnvilAura.RotationMode.fd_RotationMode_156;
            if ((Boolean)ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_Setting_143.get() && OO〇O〇o〇OOO〇o〇oOo〇Oo〇〇〇〇OoOo〇〇〇〇o〇〇OoOo〇〇〇O != null) {
               if (ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_Setting_141.get() == Class5_Enum.fd_Class5_Enum_886) {
                  FindItemResult oo〇Oo〇ooOoO〇o〇OOoOo〇o〇oooOOooOoOoooOoO〇o〇Oo〇oOo〇〇〇〇〇OoOooO〇OoOoOo〇oooOoo = Class46.findPick();
                  if (!oo〇Oo〇ooOoO〇o〇OOoOo〇o〇oooOOooOoOoooOoO〇o〇Oo〇oOo〇〇〇〇〇OoOooO〇OoOoOo〇oooOoo.found()) {
                     ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.error("No pickaxe in hotbar.", new Object[0]);
                     ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.toggle();
                  } else {
                     sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.updateSlot(oo〇Oo〇ooOoO〇o〇OOoOo〇o〇oooOOooOoOoooOoO〇o〇Oo〇oOo〇〇〇〇〇OoOooO〇OoOoOo〇oooOoo.slot());
                     Class44.doRegularMine(OO〇O〇o〇OOO〇o〇oOo〇Oo〇〇〇〇OoOo〇〇〇〇o〇〇OoOo〇〇〇O, ゆゅゅゅゅゆゆゆゅゆゅゆゅゆゆゅゆゆゅゅゅゅゆゅゅゅゆゅゆゅゆゅゆゆゆゅゅゅゅゆゅゆゆゆゅゆゆゆゅゆゆゅゅゆゅゆゆゅゅゅゆゆゅゆゆゅゅゅゅゅゅゆゆゅゆゆゆゅゅ, (Integer)ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_Setting_137.get());
                  }
               } else {
                  Class11.handlePacketMine(OO〇O〇o〇OOO〇o〇oOo〇Oo〇〇〇〇OoOo〇〇〇〇o〇〇OoOo〇〇〇O, (Class5_Enum)ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_Setting_141.get(), ゆゅゅゅゅゆゆゆゅゆゅゆゅゆゆゅゆゆゅゅゅゅゆゅゅゅゆゅゆゅゆゅゆゆゆゅゅゅゅゆゅゆゆゆゅゆゆゆゅゆゆゅゅゆゅゆゆゅゅゅゆゆゅゆゆゅゅゅゅゅゅゆゆゅゆゆゆゅゅ, (Integer)ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_Setting_137.get());
               }

               return;
            }
         }

         boolean 㬺㬺幐㬺㬺㬺㬺㬺幐幐幐㬺㬺;
         if (ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_Setting_140.get() == AnvilAura.ButtonMode.fd_ButtonMode_147 && !Class6.isValidFloorBlock(ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_PlayerEntity_129.getBlockPos())) {
            㬺㬺幐㬺㬺㬺㬺㬺幐幐幐㬺㬺 = ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_Setting_135.get() == AnvilAura.RotationMode.fd_RotationMode_156 || ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_Setting_135.get() == AnvilAura.RotationMode.fd_RotationMode_153;
            BlockUtils.place(ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_PlayerEntity_129.getBlockPos(), 晆䞨㤬眭佳茥佳䞨茥茥茥眭㤬垚垚䞨烓烓佳晆䞨眭桂茥茥㤬晆茥茥洼䞨晆桂茥眭㤬垚茥洼桂茥茥晆䞨㤬佳佳茥眭䞨㤬垚茥晆烓洼䞨眭晆眭茥䞨晆洼茥茥佳洼垚烓烓桂晆䞨䞨垚䞨洼烓佳㤬烓䞨垚桂垚桂垚洼茥垚烓垚眭桂佳垚䞨眭㤬垚㤬洼晆烓佳, 㬺㬺幐㬺㬺㬺㬺㬺幐幐幐㬺㬺, (Integer)ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_Setting_137.get(), true);
            ++ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_int_127;
         }

         if (ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_int_126 <= 0) {
            ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_int_126 = (Integer)ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_Setting_138.get();
            ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_boolean_142 = true;
         } else {
            --ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_int_126;
         }

         if (ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_Setting_132.get() == AnvilAura.AnvilMode.fd_AnvilMode_146) {
            FindItemResult ううラララうララララうラうううラララララうララ = Class46.findObby();
            ゆゅゅゅゅゆゆゆゅゆゅゆゅゆゆゅゆゆゅゅゅゅゆゅゅゅゆゅゆゅゆゅゆゆゆゅゅゅゅゆゅゆゆゆゅゆゆゆゅゆゆゅゅゆゅゆゆゅゅゅゆゆゅゆゆゅゅゅゅゅゅゆゆゅゆゆゆゅゅ = ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_Setting_135.get() == AnvilAura.RotationMode.fd_RotationMode_156 || ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_Setting_135.get() == AnvilAura.RotationMode.fd_RotationMode_153;
            if (!ううラララうララララうラうううラララララうララ.found()) {
               ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.error("No obsidian in hotbar.", new Object[0]);
               ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.toggle();
               return;
            }

            ArrayList<Vec3d> 乀へㇸㇸへ乀へ乀へ乀ㇸㇸ乀乀へ乀へ乀へへ乀ㇸへへ乀乀へ乀ㇸ乀ㇸㇸㇸㇸへへㇸ乀へ乀乀ㇸへㇸㇸㇸへへへ乀ㇸㇸ乀へㇸ乀ㇸㇸ乀ㇸㇸㇸへ乀へへへへ乀ㇸへへへへ乀へ乀乀乀へへへㇸㇸㇸ乀ㇸㇸㇸ乀へㇸㇸ乀ㇸㇸ乀乀乀ㇸㇸ乀へへㇸ乀ㇸ = Class6.getDesign(ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_PlayerEntity_129);
            if (!Class57.isTargetVecComplete(ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_PlayerEntity_129, 乀へㇸㇸへ乀へ乀へ乀ㇸㇸ乀乀へ乀へ乀へへ乀ㇸへへ乀乀へ乀ㇸ乀ㇸㇸㇸㇸへへㇸ乀へ乀乀ㇸへㇸㇸㇸへへへ乀ㇸㇸ乀へㇸ乀ㇸㇸ乀ㇸㇸㇸへ乀へへへへ乀ㇸへへへへ乀へ乀乀乀へへへㇸㇸㇸ乀ㇸㇸㇸ乀へㇸㇸ乀ㇸㇸ乀乀乀ㇸㇸ乀へへㇸ乀ㇸ)) {
               Iterator var16 = 乀へㇸㇸへ乀へ乀へ乀ㇸㇸ乀乀へ乀へ乀へへ乀ㇸへへ乀乀へ乀ㇸ乀ㇸㇸㇸㇸへへㇸ乀へ乀乀ㇸへㇸㇸㇸへへへ乀ㇸㇸ乀へㇸ乀ㇸㇸ乀ㇸㇸㇸへ乀へへへへ乀ㇸへへへへ乀へ乀乀乀へへへㇸㇸㇸ乀ㇸㇸㇸ乀へㇸㇸ乀ㇸㇸ乀乀乀ㇸㇸ乀へへㇸ乀ㇸ.iterator();

               while(var16.hasNext()) {
                  Vec3d ゾツシジンンジシヅソゾツツゾソツヅヅジツツヅツソンジゾシソソゾシ = (Vec3d)var16.next();
                  if (ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_int_127 >= (Integer)ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_Setting_128.get()) {
                     return;
                  }

                  BlockPos 〇OoO〇o〇oOOoOoO〇O〇〇ooOo〇oOoO〇ooooOOo〇〇O〇〇〇O〇〇oooo〇〇Oo〇OOooo〇Ooooo〇o〇o〇o〇oo〇oooOo〇o〇o〇〇〇OO〇〇o〇Oooo〇oooO〇O = ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_PlayerEntity_129.getBlockPos();
                  BlockPos 佳晆洼茥㤬䞨晆烓䞨䞨桂垚佳佳垚桂眭晆佳䞨晆茥桂茥茥桂桂垚茥㤬佳䞨洼眭佳䞨佳晆烓烓垚佳眭䞨佳䞨桂洼眭䞨茥烓茥䞨烓烓烓桂桂垚晆烓㤬晆烓垚㤬洼垚洼洼烓佳眭烓垚垚烓桂洼茥洼茥洼垚桂垚䞨洼垚洼晆茥垚佳眭佳㤬茥桂洼䞨㤬眭茥䞨眭垚晆晆垚晆洼佳桂洼晆洼洼佳㤬烓㤬佳䞨佳 = 〇OoO〇o〇oOOoOoO〇O〇〇ooOo〇oOoO〇ooooOOo〇〇O〇〇〇O〇〇oooo〇〇Oo〇OOooo〇Ooooo〇o〇o〇o〇oo〇oooOo〇o〇o〇〇〇OO〇〇o〇Oooo〇oooO〇O.add(ゾツシジンンジシヅソゾツツゾソツヅヅジツツヅツソンジゾシソソゾシ.x, ゾツシジンンジシヅソゾツツゾソツヅヅジツツヅツソンジゾシソソゾシ.y, ゾツシジンンジシヅソゾツツゾソツヅヅジツツヅツソンジゾシソソゾシ.z);
                  if (Class57.getBlock(佳晆洼茥㤬䞨晆烓䞨䞨桂垚佳佳垚桂眭晆佳䞨晆茥桂茥茥桂桂垚茥㤬佳䞨洼眭佳䞨佳晆烓烓垚佳眭䞨佳䞨桂洼眭䞨茥烓茥䞨烓烓烓桂桂垚晆烓㤬晆烓垚㤬洼垚洼洼烓佳眭烓垚垚烓桂洼茥洼茥洼垚桂垚䞨洼垚洼晆茥垚佳眭佳㤬茥桂洼䞨㤬眭茥䞨眭垚晆晆垚晆洼佳桂洼晆洼洼佳㤬烓㤬佳䞨佳) == Blocks.AIR) {
                     BlockUtils.place(佳晆洼茥㤬䞨晆烓䞨䞨桂垚佳佳垚桂眭晆佳䞨晆茥桂茥茥桂桂垚茥㤬佳䞨洼眭佳䞨佳晆烓烓垚佳眭䞨佳䞨桂洼眭䞨茥烓茥䞨烓烓烓桂桂垚晆烓㤬晆烓垚㤬洼垚洼洼烓佳眭烓垚垚烓桂洼茥洼茥洼垚桂垚䞨洼垚洼晆茥垚佳眭佳㤬茥桂洼䞨㤬眭茥䞨眭垚晆晆垚晆洼佳桂洼晆洼洼佳㤬烓㤬佳䞨佳, ううラララうララララうラうううラララララうララ, ゆゅゅゅゅゆゆゆゅゆゅゆゅゆゆゅゆゆゅゅゅゅゆゅゅゅゆゅゆゅゆゅゆゆゆゅゅゅゅゆゅゆゆゆゅゆゆゆゅゆゆゅゅゆゅゆゆゅゅゅゆゆゅゆゆゅゅゅゅゅゅゆゆゅゆゆゆゅゅ, (Integer)ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_Setting_137.get(), true);
                     ++ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_int_127;
                  }
               }

               return;
            }

            if (ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_boolean_142) {
               ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_boolean_142 = false;
               if (ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_Setting_140.get() == AnvilAura.ButtonMode.fd_ButtonMode_149 && !Class6.isValidFloorBlock(ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_PlayerEntity_129.getBlockPos())) {
                  BlockUtils.place(ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_PlayerEntity_129.getBlockPos(), 晆䞨㤬眭佳茥佳䞨茥茥茥眭㤬垚垚䞨烓烓佳晆䞨眭桂茥茥㤬晆茥茥洼䞨晆桂茥眭㤬垚茥洼桂茥茥晆䞨㤬佳佳茥眭䞨㤬垚茥晆烓洼䞨眭晆眭茥䞨晆洼茥茥佳洼垚烓烓桂晆䞨䞨垚䞨洼烓佳㤬烓䞨垚桂垚桂垚洼茥垚烓垚眭桂佳垚䞨眭㤬垚㤬洼晆烓佳, ゆゅゅゅゅゆゆゆゅゆゅゆゅゆゆゅゆゆゅゅゅゅゆゅゅゅゆゅゆゅゆゅゆゆゆゅゅゅゅゆゅゆゆゆゅゆゆゆゅゆゆゅゅゆゅゆゆゅゅゅゆゆゅゆゆゅゅゅゅゅゅゆゆゅゆゆゆゅゅ, (Integer)ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_Setting_137.get(), true);
               }

               ゆゅゅゅゅゆゆゆゅゆゅゆゅゆゆゅゆゆゅゅゅゅゆゅゅゅゆゅゆゅゆゅゆゆゆゅゅゅゅゆゅゆゆゆゅゆゆゆゅゆゆゅゅゆゅゆゆゅゅゅゆゆゅゆゆゅゅゅゅゅゅゆゆゅゆゆゆゅゅ = ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_Setting_135.get() == AnvilAura.RotationMode.fd_RotationMode_154 || ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_Setting_135.get() == AnvilAura.RotationMode.fd_RotationMode_153;
               int 佪茴佪茴徊徊徊茴茴回徊回徊茴佪回徊回回茴茴回茴茴徊茴茴回徊回佪佪回佪回佪徊回佪回徊佪回回回佪徊徊回茴佪徊回徊回徊回佪佪徊徊茴佪佪徊徊回徊回徊回徊佪徊茴徊徊徊佪徊徊佪回佪徊回徊回 = Class6.getLegacyAnvilPos((AnvilAura.LegacyMode)ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_Setting_125.get());
               BlockPos りリいリいりリリぃぃリリリぃぃぃいリぃりいいぃぃぃぃ = ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_PlayerEntity_129.getBlockPos().up(佪茴佪茴徊徊徊茴茴回徊回徊茴佪回徊回回茴茴回茴茴徊茴茴回徊回佪佪回佪回佪徊回佪回徊佪回回回佪徊徊回茴佪徊回徊回徊回佪佪徊徊茴佪佪徊徊回徊回徊回徊佪徊茴徊徊徊佪徊徊佪回佪徊回徊回);
               BlockUtils.place(りリいリいりリリぃぃリリリぃぃぃいリぃりいいぃぃぃぃ, ょょよょょょよよよよょよょょょょょょょよよょょよよよよょよょよょょょよよょよよょょよよよよょよょよょょょよよょよょょょよよよょょ, ゆゅゅゅゅゆゆゆゅゆゅゆゅゆゆゅゆゆゅゅゅゅゆゅゅゅゆゅゆゅゆゅゆゆゆゅゅゅゅゆゅゆゆゆゅゆゆゆゅゆゆゅゅゆゅゆゆゅゅゅゆゆゅゆゆゅゅゅゅゅゅゆゆゅゆゆゆゅゅ, (Integer)ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_Setting_137.get());
            }
         }

         if (ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_Setting_132.get() == AnvilAura.AnvilMode.fd_AnvilMode_144 && ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_boolean_142) {
            ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_boolean_142 = false;
            㬺㬺幐㬺㬺㬺㬺㬺幐幐幐㬺㬺 = ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_Setting_135.get() == AnvilAura.RotationMode.fd_RotationMode_154 || ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_Setting_135.get() == AnvilAura.RotationMode.fd_RotationMode_153;
            BlockPos 淼沝水沝淼沝淼淼㵘沝淼沝㵘水沝㵘沝㵘水水水沝沝㵘沝沝淼㵘沝㵘沝水淼㵘沝沝淼㵘淼㵘淼㵘水㵘水㵘㵘淼水沝沝㵘淼沝淼淼水㵘淼淼水水水沝㵘沝㵘㵘水 = ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_PlayerEntity_129.getBlockPos();
            BlockPos 茴回茴佪徊佪茴茴茴回徊茴佪徊回茴佪徊茴徊茴 = 淼沝水沝淼沝淼淼㵘沝淼沝㵘水沝㵘沝㵘水水水沝沝㵘沝沝淼㵘沝㵘沝水淼㵘沝沝淼㵘淼㵘淼㵘水㵘水㵘㵘淼水沝沝㵘淼沝淼淼水㵘淼淼水水水沝㵘沝㵘㵘水.up((Integer)ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_Setting_136.get());
            BlockUtils.place(茴回茴佪徊佪茴茴茴回徊茴佪徊回茴佪徊茴徊茴, ょょよょょょよよよよょよょょょょょょょよよょょよよよよょよょよょょょよよょよよょょよよよよょよょよょょょよよょよょょょよよよょょ, 㬺㬺幐㬺㬺㬺㬺㬺幐幐幐㬺㬺, (Integer)ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_Setting_137.get());
            if ((Boolean)ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_Setting_133.get()) {
               BlockUtils.place(茴回茴佪徊佪茴茴茴回徊茴佪徊回茴佪徊茴徊茴.up(2), ょょよょょょよよよよょよょょょょょょょよよょょよよよよょよょよょょょよよょよよょょよよよよょよょよょょょよよょよょょょよよよょょ, 㬺㬺幐㬺㬺㬺㬺㬺幐幐幐㬺㬺, (Integer)ㄑㄑくくㄑくㄑくくㄑくくくくㄑくくㄑㄑくくくくくㄑㄑㄑㄑくくㄑくㄑㄑくㄑくくㄑㄑくくㄑくくㄑㄑㄑㄑㄑㄑㄑくㄑくくくくㄑくㄑくくㄑくㄑㄑくくㄑㄑくくㄑ.fd_Setting_137.get());
            }
         }

      }
   }

   public void onActivate() {
      鬬鬬鬬鬬鬬鬬鬬鬭鬭鬬鬭鬭鬭鬭鬬鬭鬭鬬鬭鬬鬬鬭鬬鬬鬬鬬鬭鬬鬭鬬鬭鬭鬭鬬鬬鬭鬬鬭鬭鬬鬬鬬鬬鬬鬭鬬鬭鬬鬭鬬鬭鬬鬬鬬鬬鬬鬬鬬鬭鬬鬭鬭鬭鬬鬭鬬鬬鬬鬭鬭鬬鬬鬭鬬鬭鬭鬬鬭鬬鬬鬭鬭鬬鬬鬬鬬鬭鬭鬬鬬鬬鬬鬬鬬鬬鬬鬭鬭鬭鬬鬭鬭鬭鬬鬬鬬鬭鬬鬭鬬鬭鬭鬭鬬鬬鬭鬭鬬鬭鬬鬬.fd_PlayerEntity_129 = null;
      鬬鬬鬬鬬鬬鬬鬬鬭鬭鬬鬭鬭鬭鬭鬬鬭鬭鬬鬭鬬鬬鬭鬬鬬鬬鬬鬭鬬鬭鬬鬭鬭鬭鬬鬬鬭鬬鬭鬭鬬鬬鬬鬬鬬鬭鬬鬭鬬鬭鬬鬭鬬鬬鬬鬬鬬鬬鬬鬭鬬鬭鬭鬭鬬鬭鬬鬬鬬鬭鬭鬬鬬鬭鬬鬭鬭鬬鬭鬬鬬鬭鬭鬬鬬鬬鬬鬭鬭鬬鬬鬬鬬鬬鬬鬬鬬鬭鬭鬭鬬鬭鬭鬭鬬鬬鬬鬭鬬鬭鬬鬭鬭鬭鬬鬬鬭鬭鬬鬭鬬鬬.fd_int_127 = 0;
      鬬鬬鬬鬬鬬鬬鬬鬭鬭鬬鬭鬭鬭鬭鬬鬭鬭鬬鬭鬬鬬鬭鬬鬬鬬鬬鬭鬬鬭鬬鬭鬭鬭鬬鬬鬭鬬鬭鬭鬬鬬鬬鬬鬬鬭鬬鬭鬬鬭鬬鬭鬬鬬鬬鬬鬬鬬鬬鬭鬬鬭鬭鬭鬬鬭鬬鬬鬬鬭鬭鬬鬬鬭鬬鬭鬭鬬鬭鬬鬬鬭鬭鬬鬬鬬鬬鬭鬭鬬鬬鬬鬬鬬鬬鬬鬬鬭鬭鬭鬬鬭鬭鬭鬬鬬鬬鬭鬬鬭鬬鬭鬭鬭鬬鬬鬭鬭鬬鬭鬬鬬.fd_int_126 = (Integer)鬬鬬鬬鬬鬬鬬鬬鬭鬭鬬鬭鬭鬭鬭鬬鬭鬭鬬鬭鬬鬬鬭鬬鬬鬬鬬鬭鬬鬭鬬鬭鬭鬭鬬鬬鬭鬬鬭鬭鬬鬬鬬鬬鬬鬭鬬鬭鬬鬭鬬鬭鬬鬬鬬鬬鬬鬬鬬鬭鬬鬭鬭鬭鬬鬭鬬鬬鬬鬭鬭鬬鬬鬭鬬鬭鬭鬬鬭鬬鬬鬭鬭鬬鬬鬬鬬鬭鬭鬬鬬鬬鬬鬬鬬鬬鬬鬭鬭鬭鬬鬭鬭鬭鬬鬬鬬鬭鬬鬭鬬鬭鬭鬭鬬鬬鬭鬭鬬鬭鬬鬬.fd_Setting_138.get();
      鬬鬬鬬鬬鬬鬬鬬鬭鬭鬬鬭鬭鬭鬭鬬鬭鬭鬬鬭鬬鬬鬭鬬鬬鬬鬬鬭鬬鬭鬬鬭鬭鬭鬬鬬鬭鬬鬭鬭鬬鬬鬬鬬鬬鬭鬬鬭鬬鬭鬬鬭鬬鬬鬬鬬鬬鬬鬬鬭鬬鬭鬭鬭鬬鬭鬬鬬鬬鬭鬭鬬鬬鬭鬬鬭鬭鬬鬭鬬鬬鬭鬭鬬鬬鬬鬬鬭鬭鬬鬬鬬鬬鬬鬬鬬鬬鬭鬭鬭鬬鬭鬭鬭鬬鬬鬬鬭鬬鬭鬬鬭鬭鬭鬬鬬鬭鬭鬬鬭鬬鬬.fd_boolean_142 = false;
   }

   private BlockPos getAntiAnvilBlock(PlayerEntity 㬺幐幐幐㬺幐㬺㬺幐㬺幐㬺㬺㬺㬺幐幐㬺幐幐幐㬺㬺幐㬺㬺幐㬺幐㬺幐幐幐幐㬺幐㬺㬺幐㬺幐幐幐幐㬺幐幐幐㬺㬺㬺幐幐㬺㬺幐幐幐幐㬺幐幐㬺㬺幐㬺㬺㬺幐㬺㬺幐㬺㬺幐幐㬺㬺㬺㬺㬺㬺幐幐㬺幐㬺幐㬺幐幐㬺㬺幐㬺幐幐㬺㬺幐幐幐幐幐幐㬺幐㬺㬺) {
      BlockPos りいいいリリぃぃいりぃぃりリリりリりいリぃいりいりリりぃぃりぃリりいいりいリぃぃいリりいいぃぃりぃぃリぃいいぃ = へへへへ乀ㇸㇸㇸㇸㇸㇸㇸへ乀へへㇸへ乀ㇸㇸへ乀乀ㇸ乀ㇸ乀へㇸㇸㇸ乀へへㇸ乀へへ乀ㇸ乀へ乀乀乀乀乀乀へへㇸ乀乀.getBlockPos();
      if (Class44.isTrapBlock(りいいいリリぃぃいりぃぃりリリりリりいリぃいりいりリりぃぃりぃリりいいりいリぃぃいリりいいぃぃりぃぃリぃいいぃ.up(2))) {
         return りいいいリリぃぃいりぃぃりリリりリりいリぃいりいりリりぃぃりぃリりいいりいリぃぃいリりいいぃぃりぃぃリぃいいぃ.up(2);
      } else {
         return Class44.isTrapBlock(りいいいリリぃぃいりぃぃりリリりリりいリぃいりいりリりぃぃりぃリりいいりいリぃぃいリりいいぃぃりぃぃリぃいいぃ.up(3)) ? りいいいリリぃぃいりぃぃりリリりリりいリぃいりいりリりぃぃりぃリりいいりいリぃぃいリりいいぃぃりぃぃリぃいいぃ.up(3) : null;
      }
   }

   public AnvilAura() {
      super(Class68.fd_Category_1060, "anvil-aura", "Nice helmet");
      へㇸへㇸ乀乀乀へ乀ㇸ乀へㇸ乀へㇸ乀へへ乀ㇸへへへへㇸ乀乀へ乀ㇸㇸへへへ乀へㇸㇸㇸㇸㇸㇸへへへ乀へ乀乀ㇸㇸへへへ乀へへへ.fd_SettingGroup_130 = へㇸへㇸ乀乀乀へ乀ㇸ乀へㇸ乀へㇸ乀へへ乀ㇸへへへへㇸ乀乀へ乀ㇸㇸへへへ乀へㇸㇸㇸㇸㇸㇸへへへ乀へ乀乀ㇸㇸへへへ乀へへへ.settings.getDefaultGroup();
      へㇸへㇸ乀乀乀へ乀ㇸ乀へㇸ乀へㇸ乀へへ乀ㇸへへへへㇸ乀乀へ乀ㇸㇸへへへ乀へㇸㇸㇸㇸㇸㇸへへへ乀へ乀乀ㇸㇸへへへ乀へへへ.fd_SettingGroup_131 = へㇸへㇸ乀乀乀へ乀ㇸ乀へㇸ乀へㇸ乀へへ乀ㇸへへへへㇸ乀乀へ乀ㇸㇸへへへ乀へㇸㇸㇸㇸㇸㇸへへへ乀へ乀乀ㇸㇸへへへ乀へへへ.settings.createGroup("Automation");
      へㇸへㇸ乀乀乀へ乀ㇸ乀へㇸ乀へㇸ乀へへ乀ㇸへへへへㇸ乀乀へ乀ㇸㇸへへへ乀へㇸㇸㇸㇸㇸㇸへへへ乀へ乀乀ㇸㇸへへへ乀へへへ.fd_Setting_139 = へㇸへㇸ乀乀乀へ乀ㇸ乀へㇸ乀へㇸ乀へへ乀ㇸへへへへㇸ乀乀へ乀ㇸㇸへへへ乀へㇸㇸㇸㇸㇸㇸへへへ乀へ乀乀ㇸㇸへへへ乀へへへ.fd_SettingGroup_130.add(((Builder)((Builder)(new Builder()).name("range")).description("Maximum targeting range.")).defaultValue(4.0D).min(0.0D).build());
      へㇸへㇸ乀乀乀へ乀ㇸ乀へㇸ乀へㇸ乀へへ乀ㇸへへへへㇸ乀乀へ乀ㇸㇸへへへ乀へㇸㇸㇸㇸㇸㇸへへへ乀へ乀乀ㇸㇸへへへ乀へへへ.fd_Setting_134 = へㇸへㇸ乀乀乀へ乀ㇸ乀へㇸ乀へㇸ乀へへ乀ㇸへへへへㇸ乀乀へ乀ㇸㇸへへへ乀へㇸㇸㇸㇸㇸㇸへへへ乀へ乀乀ㇸㇸへへへ乀へへへ.fd_SettingGroup_130.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("target-priority")).description("How to filter the players to target.")).defaultValue(SortPriority.LowestHealth)).build());
      へㇸへㇸ乀乀乀へ乀ㇸ乀へㇸ乀へㇸ乀へへ乀ㇸへへへへㇸ乀乀へ乀ㇸㇸへへへ乀へㇸㇸㇸㇸㇸㇸへへへ乀へ乀乀ㇸㇸへへへ乀へへへ.fd_Setting_138 = へㇸへㇸ乀乀乀へ乀ㇸ乀へㇸ乀へㇸ乀へへ乀ㇸへへへへㇸ乀乀へ乀ㇸㇸへへへ乀へㇸㇸㇸㇸㇸㇸへへへ乀へ乀乀ㇸㇸへへへ乀へへへ.fd_SettingGroup_130.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("delay")).description("Delay between anvil placements.")).min(1).defaultValue(4)).sliderMax(50).build());
      へㇸへㇸ乀乀乀へ乀ㇸ乀へㇸ乀へㇸ乀へへ乀ㇸへへへへㇸ乀乀へ乀ㇸㇸへへへ乀へㇸㇸㇸㇸㇸㇸへへへ乀へ乀乀ㇸㇸへへへ乀へへへ.fd_Setting_128 = へㇸへㇸ乀乀乀へ乀ㇸ乀へㇸ乀へㇸ乀へへ乀ㇸへへへへㇸ乀乀へ乀ㇸㇸへへへ乀へㇸㇸㇸㇸㇸㇸへへへ乀へ乀乀ㇸㇸへへへ乀へへへ.fd_SettingGroup_130.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("blocks-per-tick")).description("Maximum blocks per tick.")).defaultValue(4)).min(2).max(8).sliderMin(2).sliderMax(8).build());
      へㇸへㇸ乀乀乀へ乀ㇸ乀へㇸ乀へㇸ乀へへ乀ㇸへへへへㇸ乀乀へ乀ㇸㇸへへへ乀へㇸㇸㇸㇸㇸㇸへへへ乀へ乀乀ㇸㇸへへへ乀へへへ.fd_Setting_135 = へㇸへㇸ乀乀乀へ乀ㇸ乀へㇸ乀へㇸ乀へへ乀ㇸへへへへㇸ乀乀へ乀ㇸㇸへへへ乀へㇸㇸㇸㇸㇸㇸへへへ乀へ乀乀ㇸㇸへへへ乀へへへ.fd_SettingGroup_130.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("rotation-mode")).description("When to rotate.")).defaultValue(AnvilAura.RotationMode.fd_RotationMode_154)).build());
      へㇸへㇸ乀乀乀へ乀ㇸ乀へㇸ乀へㇸ乀へへ乀ㇸへへへへㇸ乀乀へ乀ㇸㇸへへへ乀へㇸㇸㇸㇸㇸㇸへへへ乀へ乀乀ㇸㇸへへへ乀へへへ.fd_Setting_137 = へㇸへㇸ乀乀乀へ乀ㇸ乀へㇸ乀へㇸ乀へへ乀ㇸへへへへㇸ乀乀へ乀ㇸㇸへへへ乀へㇸㇸㇸㇸㇸㇸへへへ乀へ乀乀ㇸㇸへへへ乀へへへ.fd_SettingGroup_130.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("rotation-priority")).description("Rotation priority.")).min(1).defaultValue(50)).sliderMax(100).max(100).build());
      へㇸへㇸ乀乀乀へ乀ㇸ乀へㇸ乀へㇸ乀へへ乀ㇸへへへへㇸ乀乀へ乀ㇸㇸへへへ乀へㇸㇸㇸㇸㇸㇸへへへ乀へ乀乀ㇸㇸへへへ乀へへへ.fd_Setting_132 = へㇸへㇸ乀乀乀へ乀ㇸ乀へㇸ乀へㇸ乀へへ乀ㇸへへへへㇸ乀乀へ乀ㇸㇸへへへ乀へㇸㇸㇸㇸㇸㇸへへへ乀へ乀乀ㇸㇸへへへ乀へへへ.fd_SettingGroup_130.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("place-mode")).description("How to place anvils.")).defaultValue(AnvilAura.AnvilMode.fd_AnvilMode_144)).build());
      へㇸへㇸ乀乀乀へ乀ㇸ乀へㇸ乀へㇸ乀へへ乀ㇸへへへへㇸ乀乀へ乀ㇸㇸへへへ乀へㇸㇸㇸㇸㇸㇸへへへ乀へ乀乀ㇸㇸへへへ乀へへへ.fd_Setting_136 = へㇸへㇸ乀乀乀へ乀ㇸ乀へㇸ乀へㇸ乀へへ乀ㇸへへへへㇸ乀乀へ乀ㇸㇸへへへ乀へㇸㇸㇸㇸㇸㇸへへへ乀へ乀乀ㇸㇸへへへ乀へへへ.fd_SettingGroup_130.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("height")).description("How high to place anvils.")).min(3).defaultValue(4)).sliderMax(5).max(5).visible(() -> {
         return ぃりいリぃぃぃりリぃいぃリりリぃぃぃリリいぃいりいりりりいいりいりりりいいいりぃリいぃいりいリいリいいいリいぃりぃいいいリぃリぃいいりリリぃぃリリりいリリりりぃぃりりリいりりリりりぃり.fd_Setting_132.get() == AnvilAura.AnvilMode.fd_AnvilMode_144;
      })).build());
      へㇸへㇸ乀乀乀へ乀ㇸ乀へㇸ乀へㇸ乀へへ乀ㇸへへへへㇸ乀乀へ乀ㇸㇸへへへ乀へㇸㇸㇸㇸㇸㇸへへへ乀へ乀乀ㇸㇸへへへ乀へへへ.fd_Setting_133 = へㇸへㇸ乀乀乀へ乀ㇸ乀へㇸ乀へㇸ乀へへ乀ㇸへへへへㇸ乀乀へ乀ㇸㇸへへへ乀へㇸㇸㇸㇸㇸㇸへへへ乀へ乀乀ㇸㇸへへへ乀へへへ.fd_SettingGroup_130.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("multi-place")).description("Place multiple anvils at once.")).defaultValue(false)).visible(() -> {
         return o〇〇〇〇〇〇oO〇OOOoOoOOoO〇O〇ooOO〇〇ooO〇o〇OOOOOoOoOooOoOOoo.fd_Setting_132.get() == AnvilAura.AnvilMode.fd_AnvilMode_144;
      })).build());
      へㇸへㇸ乀乀乀へ乀ㇸ乀へㇸ乀へㇸ乀へへ乀ㇸへへへへㇸ乀乀へ乀ㇸㇸへへへ乀へㇸㇸㇸㇸㇸㇸへへへ乀へ乀乀ㇸㇸへへへ乀へへへ.fd_Setting_140 = へㇸへㇸ乀乀乀へ乀ㇸ乀へㇸ乀へㇸ乀へへ乀ㇸへへへへㇸ乀乀へ乀ㇸㇸへへへ乀へㇸㇸㇸㇸㇸㇸへへへ乀へ乀乀ㇸㇸへへへ乀へへへ.fd_SettingGroup_130.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("place-mode")).description("How to place anvils.")).defaultValue(AnvilAura.ButtonMode.fd_ButtonMode_147)).build());
      へㇸへㇸ乀乀乀へ乀ㇸ乀へㇸ乀へㇸ乀へへ乀ㇸへへへへㇸ乀乀へ乀ㇸㇸへへへ乀へㇸㇸㇸㇸㇸㇸへへへ乀へ乀乀ㇸㇸへへへ乀へへへ.fd_Setting_125 = へㇸへㇸ乀乀乀へ乀ㇸ乀へㇸ乀へㇸ乀へへ乀ㇸへへへへㇸ乀乀へ乀ㇸㇸへへへ乀へㇸㇸㇸㇸㇸㇸへへへ乀へ乀乀ㇸㇸへへへ乀へへへ.fd_SettingGroup_130.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("legacy-mode")).description("Which support design to use.")).defaultValue(AnvilAura.LegacyMode.fd_LegacyMode_152)).build());
      へㇸへㇸ乀乀乀へ乀ㇸ乀へㇸ乀へㇸ乀へへ乀ㇸへへへへㇸ乀乀へ乀ㇸㇸへへへ乀へㇸㇸㇸㇸㇸㇸへへへ乀へ乀乀ㇸㇸへへへ乀へへへ.fd_Setting_124 = へㇸへㇸ乀乀乀へ乀ㇸ乀へㇸ乀へㇸ乀へへ乀ㇸへへへへㇸ乀乀へ乀ㇸㇸへへへ乀へㇸㇸㇸㇸㇸㇸへへへ乀へ乀乀ㇸㇸへへへ乀へへへ.fd_SettingGroup_131.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("toggle-on-anti-anvil")).description("Disable if the target places blocks above their head.")).defaultValue(false)).build());
      へㇸへㇸ乀乀乀へ乀ㇸ乀へㇸ乀へㇸ乀へへ乀ㇸへへへへㇸ乀乀へ乀ㇸㇸへへへ乀へㇸㇸㇸㇸㇸㇸへへへ乀へ乀乀ㇸㇸへへへ乀へへへ.fd_Setting_143 = へㇸへㇸ乀乀乀へ乀ㇸ乀へㇸ乀へㇸ乀へへ乀ㇸへへへへㇸ乀乀へ乀ㇸㇸへへへ乀へㇸㇸㇸㇸㇸㇸへへへ乀へ乀乀ㇸㇸへへへ乀へへへ.fd_SettingGroup_131.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("break-anti-anvil")).description("Break blocks the target puts above their head.")).defaultValue(true)).build());
      へㇸへㇸ乀乀乀へ乀ㇸ乀へㇸ乀へㇸ乀へへ乀ㇸへへへへㇸ乀乀へ乀ㇸㇸへへへ乀へㇸㇸㇸㇸㇸㇸへへへ乀へ乀乀ㇸㇸへへへ乀へへへ.fd_Setting_141 = へㇸへㇸ乀乀乀へ乀ㇸ乀へㇸ乀へㇸ乀へへ乀ㇸへへへへㇸ乀乀へ乀ㇸㇸへへへ乀へㇸㇸㇸㇸㇸㇸへへへ乀へ乀乀ㇸㇸへへへ乀へへへ.fd_SettingGroup_131.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("mine-mode")).description("How to mine blocks.")).defaultValue(Class5_Enum.fd_Class5_Enum_888)).build());
   }

   public static enum ButtonMode {
      fd_ButtonMode_147,
      fd_ButtonMode_149;

      // $FF: synthetic method
      private static AnvilAura.ButtonMode[] $values() {
         return new AnvilAura.ButtonMode[]{fd_ButtonMode_147, fd_ButtonMode_149};
      }
   }

   public static enum AnvilMode {
      fd_AnvilMode_144,
      fd_AnvilMode_146;

      // $FF: synthetic method
      private static AnvilAura.AnvilMode[] $values() {
         return new AnvilAura.AnvilMode[]{fd_AnvilMode_144, fd_AnvilMode_146};
      }
   }

   public static enum LegacyMode {
      fd_LegacyMode_150,
      fd_LegacyMode_152;

      // $FF: synthetic method
      private static AnvilAura.LegacyMode[] $values() {
         return new AnvilAura.LegacyMode[]{fd_LegacyMode_152, fd_LegacyMode_150};
      }
   }

   public static enum RotationMode {
      fd_RotationMode_153,
      fd_RotationMode_154,
      fd_RotationMode_156,
      fd_RotationMode_157;

      // $FF: synthetic method
      private static AnvilAura.RotationMode[] $values() {
         return new AnvilAura.RotationMode[]{fd_RotationMode_154, fd_RotationMode_156, fd_RotationMode_153, fd_RotationMode_157};
      }
   }
}
