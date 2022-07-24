/* Decompiler 79ms, total 250ms, lines 292 */
package me.ghosttypes.ion.modules.combat;

import java.util.Objects;
import me.ghosttypes.ion.modules.render.Notifications.mode;
import me.ghosttypes.ion.utils.Class68;
import me.ghosttypes.ion.utils.sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS;
import me.ghosttypes.ion.utils.events.Class17;
import me.ghosttypes.ion.utils.player.Class44;
import me.ghosttypes.ion.utils.player.Class46;
import me.ghosttypes.ion.utils.world.Class57;
import me.ghosttypes.ion.utils.world.Class66;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent.Post;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.DoubleSetting.Builder;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.Utils;
import meteordevelopment.meteorclient.utils.entity.EntityUtils;
import meteordevelopment.meteorclient.utils.entity.SortPriority;
import meteordevelopment.meteorclient.utils.entity.TargetUtils;
import meteordevelopment.meteorclient.utils.player.DamageUtils;
import meteordevelopment.meteorclient.utils.player.FindItemResult;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.player.Safety;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.hit.BlockHitResult;

public class AnchorAura extends Module {
   private final Setting<Boolean> fd_Setting_76;
   private final Setting<Double> fd_Setting_77;
   private final Setting<Double> SSSssssSSsSSsSsSssSSsssssSsssSSSSSsSSSsSssssssSSsSSssSsSsSsSssSssssSssssSsSSsSssSSssSsssSsSSSSssssSsSSSSssSsSSssSsS;
   private final Setting<Boolean> fd_Setting_78;
   private final Setting<SettingColor> fd_Setting_79;
   private final SettingGroup fd_SettingGroup_80;
   private final Setting<AnchorAura$RotationMode> fd_Setting_81;
   private final Setting<AnchorAura$PlaceMode> fd_Setting_82;
   private final Setting<Boolean> fd_Setting_83;
   private final SettingGroup fd_SettingGroup_84;
   private final SettingGroup fd_SettingGroup_85;
   private final Setting<SortPriority> fd_Setting_86;
   private boolean fd_boolean_87;
   private final Setting<Integer> fd_Setting_88;
   private final Setting<Safety> fd_Setting_89;
   private final Setting<Integer> fd_Setting_90;
   private int fd_int_91;
   private final Setting<Double> SSSssSssSssSsSSSSSssssSSSsSsssSssSsSsSsSsSSsSSSssSSsssSssssSsssSssSSsssSSssSssSsSsSSSssSssSsSsSSsSSsSSSsSsSssSSssSsSSSSSssS;
   private final Setting<SettingColor> fd_Setting_92;
   private final Setting<Boolean> fd_Setting_93;
   private final Setting<Boolean> fd_Setting_94;
   private int fd_int_95;
   private final SettingGroup fd_SettingGroup_96;
   private final Setting<ShapeMode> fd_Setting_97;
   private final Setting<SettingColor> fd_Setting_98;
   private final Setting<Boolean> fd_Setting_99;
   private final Setting<Boolean> sSSSSSssSSSsSssSsssSSSssSSssSsssSSssSSSSsssssSSSsSsssSsssSSssSSSssSssssSSsssSSSSssssssSSSS;
   private final Setting<Boolean> jLJiIiiILLlijiiIIJjJJijLJJjjIllLjLlLjijIJlilLILlilIijlJjjiI;
   private final Setting<Boolean> qqQpPQqpPqp;
   private boolean fd_boolean_100;
   private final Setting<Integer> fd_Setting_101;
   private final Setting<Double> fd_Setting_102;
   private final SettingGroup fd_SettingGroup_103;
   private final Setting<Boolean> fd_Setting_104;
   private final Setting<SettingColor> fd_Setting_105;
   private final Setting<mode> fd_Setting_106;
   private final Setting<Double> fd_Setting_107;
   private PlayerEntity fd_PlayerEntity_108;
   private final Setting<Safety> fd_Setting_109;
   private final SettingGroup fd_SettingGroup_110;
   private boolean fd_boolean_111;
   private final Setting<Boolean> pPqpqQPqPqQqpppPpPqqQQqqQqpqQpqPQQPpPqQqpQpqQPpqpqpqPQQppQPpQPqqQQqpPQqpQPqPpQqpQppPpQPPpqqPqqqpqQPPpQqPPQq;

   @EventHandler
   private void onRender(Render3DEvent 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀.fd_PlayerEntity_108 != null) {
         BlockPos 怀;
         if ((Boolean)怀.fd_Setting_78.get()) {
            怀 = 怀.findPlacePos(怀.fd_PlayerEntity_108.getBlockPos());
            if (怀 == null) {
               return;
            }

            怀.renderer.box(怀, (Color)怀.fd_Setting_92.get(), (Color)怀.fd_Setting_98.get(), (ShapeMode)怀.fd_Setting_97.get(), 0);
         }

         if ((Boolean)怀.jLJiIiiILLlijiiIIJjJJijLJJjjIllLjLlLjijIJlilLILlilIijlJjjiI.get()) {
            怀 = 怀.findBreakPos(怀.fd_PlayerEntity_108.getBlockPos());
            if (怀 == null) {
               return;
            }

            怀.renderer.box(怀, (Color)怀.fd_Setting_105.get(), (Color)怀.fd_Setting_79.get(), (ShapeMode)怀.fd_Setting_97.get(), 0);
         }

         if ((Boolean)怀.fd_Setting_76.get() && 怀.fd_PlayerEntity_108 != null) {
            if (怀.fd_boolean_111) {
               怀.renderer.box(怀.fd_PlayerEntity_108.getBlockPos(), (Color)怀.fd_Setting_105.get(), (Color)怀.fd_Setting_79.get(), (ShapeMode)怀.fd_Setting_97.get(), 0);
            }

            if (怀.fd_boolean_87) {
               怀.renderer.box(怀.fd_PlayerEntity_108.getBlockPos().up(2), (Color)怀.fd_Setting_105.get(), (Color)怀.fd_Setting_79.get(), (ShapeMode)怀.fd_Setting_97.get(), 0);
            }
         }

      }
   }

   public void onActivate() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      Class66.moduleAuth();
      怀.fd_int_91 = 0;
      怀.fd_int_95 = 0;
      怀.fd_PlayerEntity_108 = null;
      怀.fd_boolean_87 = false;
      怀.fd_boolean_111 = false;
      怀.fd_boolean_100 = false;
   }

   @EventHandler
   private void onTick(Post 怀) {
      // $FF: Couldn't be decompiled
   }

   private boolean isValidPlace(BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return 怀.mc.world.getBlockState(怀).isAir() && Math.sqrt(怀.mc.player.getBlockPos().getSquaredDistance(怀)) <= (Double)怀.SSSssSssSssSsSSSSSssssSSSsSsssSssSsSsSsSsSSsSSSssSSsssSssssSsssSssSSsssSSssSssSsSsSSSssSssSsSsSSsSSsSSSsSsSssSSssSsSSSSSssS.get() && 怀.getDamagePlace(怀);
   }

   private BlockPos findPlacePos(BlockPos 怀) {
      // $FF: Couldn't be decompiled
   }

   private void breakAnchor(BlockPos 怀, FindItemResult 怀, FindItemResult 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀 != null && 怀.mc.world.getBlockState(怀).getBlock() == Blocks.RESPAWN_ANCHOR) {
         怀.mc.player.setSneaking(false);
         怀 怀 = 怀.mc.player.getInventory().selectedSlot;
         if (怀.isOffhand()) {
            怀.mc.interactionManager.interactBlock(怀.mc.player, Hand.OFF_HAND, new BlockHitResult(new Vec3d((double)怀.getX() + 0.5D, (double)怀.getY() + 0.5D, (double)怀.getZ() + 0.5D), Direction.UP, 怀, true));
         } else {
            InvUtils.swap(怀.slot(), true);
            怀.mc.interactionManager.interactBlock(怀.mc.player, Hand.MAIN_HAND, new BlockHitResult(new Vec3d((double)怀.getX() + 0.5D, (double)怀.getY() + 0.5D, (double)怀.getZ() + 0.5D), Direction.UP, 怀, true));
         }

         if (怀.isOffhand()) {
            怀.mc.interactionManager.interactBlock(怀.mc.player, Hand.OFF_HAND, new BlockHitResult(new Vec3d((double)怀.getX() + 0.5D, (double)怀.getY() + 0.5D, (double)怀.getZ() + 0.5D), Direction.UP, 怀, true));
         } else {
            InvUtils.swap(怀.slot(), true);
            怀.mc.interactionManager.interactBlock(怀.mc.player, Hand.MAIN_HAND, new BlockHitResult(new Vec3d((double)怀.getX() + 0.5D, (double)怀.getY() + 0.5D, (double)怀.getZ() + 0.5D), Direction.UP, 怀, true));
         }

         InvUtils.swap(怀, true);
      }
   }

   public String getInfoString() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return EntityUtils.getName(怀.fd_PlayerEntity_108);
   }

   private boolean getDamageBreak(BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return 怀.fd_Setting_109.get() == Safety.Suicide || DamageUtils.anchorDamage(怀.mc.player, Utils.vec3d(怀.add(0.5D, 0.5D, 0.5D))) <= (Double)怀.fd_Setting_107.get();
   }

   public AnchorAura() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super(Class68.fd_Category_1060, "anchor-aura", "Anchor Aura v2.");
      怀.fd_SettingGroup_96 = 怀.settings.getDefaultGroup();
      怀.fd_SettingGroup_85 = 怀.settings.createGroup("Place");
      怀.fd_SettingGroup_110 = 怀.settings.createGroup("Break");
      怀.fd_SettingGroup_103 = 怀.settings.createGroup("Automation");
      怀.fd_SettingGroup_80 = 怀.settings.createGroup("Pause");
      怀.fd_SettingGroup_84 = 怀.settings.createGroup("Render");
      怀.fd_Setting_77 = 怀.fd_SettingGroup_96.add(((Builder)((Builder)(new Builder()).name("target-range")).description("The radius in which players get targeted.")).defaultValue(4.0D).min(0.0D).sliderMax(5.0D).build());
      怀.fd_Setting_86 = 怀.fd_SettingGroup_96.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("target-priority")).description("How to select the player to target.")).defaultValue(SortPriority.LowestHealth)).build());
      怀.fd_Setting_81 = 怀.fd_SettingGroup_96.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("rotation-mode")).description("The mode to rotate you server-side.")).defaultValue(AnchorAura$RotationMode.fd_RotationMode_121)).build());
      怀.fd_Setting_101 = 怀.fd_SettingGroup_96.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("rotate-priority")).description("Rotation priority.")).defaultValue(50)).min(1).max(100).build());
      怀.fd_Setting_107 = 怀.fd_SettingGroup_96.add(((Builder)((Builder)(new Builder()).name("max-self-damage")).description("The maximum self-damage allowed.")).defaultValue(8.0D).build());
      怀.fd_Setting_102 = 怀.fd_SettingGroup_96.add(((Builder)((Builder)(new Builder()).name("min-health")).description("The minimum health you have to be for Anchor Aura to work.")).defaultValue(15.0D).build());
      怀.fd_Setting_93 = 怀.fd_SettingGroup_96.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("anti-stuck")).description("Prevent getting stuck when glowstone is placed on the target's head.")).defaultValue(true)).build());
      怀.fd_Setting_106 = 怀.fd_SettingGroup_96.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("notification-mode")).description("How notifications are displayed.")).defaultValue(mode.fd_mode_881)).build());
      怀.qqQpPQqpPqp = 怀.fd_SettingGroup_85.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("place")).description("Allows Anchor Aura to place anchors.")).defaultValue(true)).build());
      SettingGroup var10001 = 怀.fd_SettingGroup_85;
      meteordevelopment.meteorclient.settings.IntSetting.Builder var10002 = ((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("place-delay")).description("The tick delay between placing anchors.")).defaultValue(4)).min(0).max(20);
      Setting var10003 = 怀.qqQpPQqpPqp;
      Objects.requireNonNull(var10003);
      怀.fd_Setting_88 = var10001.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)var10002.visible(var10003::get)).build());
      var10001 = 怀.fd_SettingGroup_85;
      meteordevelopment.meteorclient.settings.EnumSetting.Builder var1 = (meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("place-mode")).description("The way anchors are allowed to be placed near you.")).defaultValue(Safety.Safe);
      var10003 = 怀.qqQpPQqpPqp;
      Objects.requireNonNull(var10003);
      怀.fd_Setting_89 = var10001.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)var1.visible(var10003::get)).build());
      var10001 = 怀.fd_SettingGroup_85;
      Builder var2 = ((Builder)((Builder)(new Builder()).name("place-range")).description("The radius in which anchors are placed in.")).defaultValue(5.0D).min(0.0D).sliderMax(5.0D);
      var10003 = 怀.qqQpPQqpPqp;
      Objects.requireNonNull(var10003);
      怀.SSSssSssSssSsSSSSSssssSSSsSsssSssSsSsSsSsSSsSSSssSSsssSssssSsssSssSSsssSSssSssSsSsSSSssSssSsSsSSsSSsSSSsSsSssSSssSsSSSSSssS = var10001.add(((Builder)var2.visible(var10003::get)).build());
      var10001 = 怀.fd_SettingGroup_85;
      var1 = (meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("placement-positions")).description("Where the Anchors will be placed on the entity.")).defaultValue(AnchorAura$PlaceMode.fd_PlaceMode_115);
      var10003 = 怀.qqQpPQqpPqp;
      Objects.requireNonNull(var10003);
      怀.fd_Setting_82 = var10001.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)var1.visible(var10003::get)).build());
      怀.fd_Setting_90 = 怀.fd_SettingGroup_110.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("break-delay")).description("The tick delay between breaking anchors.")).defaultValue(10)).min(0).max(10).build());
      怀.fd_Setting_109 = 怀.fd_SettingGroup_110.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("break-mode")).description("The way anchors are allowed to be broken near you.")).defaultValue(Safety.Safe)).build());
      怀.SSSssssSSsSSsSsSssSSsssssSsssSSSSSsSSSsSssssssSSsSSssSsSsSsSssSssssSssssSsSSsSssSSssSsssSsSSSSssssSsSSSSssSsSSssSsS = 怀.fd_SettingGroup_110.add(((Builder)((Builder)(new Builder()).name("break-range")).description("The radius in which anchors are broken in.")).defaultValue(5.0D).min(0.0D).sliderMax(5.0D).build());
      怀.fd_Setting_104 = 怀.fd_SettingGroup_103.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("break-self-trap")).description("Break target's self-trap before placing/breaking.")).defaultValue(true)).build());
      怀.fd_Setting_94 = 怀.fd_SettingGroup_103.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("break-burrow")).description("Break target's burrow before placing/breaking.")).defaultValue(true)).build());
      怀.fd_Setting_99 = 怀.fd_SettingGroup_103.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("fast-place-after-break")).description("Place the next anchor immediately after breaking target's self-trap.")).defaultValue(true)).build());
      怀.fd_Setting_76 = 怀.fd_SettingGroup_103.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("render-break")).description("Render mining self-trap/burrow.")).defaultValue(true)).build());
      怀.fd_Setting_83 = 怀.fd_SettingGroup_80.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("pause-on-eat")).description("Pauses while eating.")).defaultValue(false)).build());
      怀.pPqpqQPqPqQqpppPpPqqQQqqQqpqQpqPQQPpPqQqpQpqQPpqpqpqPQQppQPpQPqqQQqpPQqpQPqPpQqpQppPpQPPpqqPqqqpqQPPpQqPPQq = 怀.fd_SettingGroup_80.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("pause-on-drink")).description("Pauses while drinking potions.")).defaultValue(false)).build());
      怀.sSSSSSssSSSsSssSsssSSSssSSssSsssSSssSSSSsssssSSSsSsssSsssSSssSSSssSssssSSsssSSSSssssssSSSS = 怀.fd_SettingGroup_80.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("pause-on-mine")).description("Pauses while mining blocks.")).defaultValue(false)).build());
      怀.fd_Setting_97 = 怀.fd_SettingGroup_84.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("shape-mode")).description("How the shapes are rendered.")).defaultValue(ShapeMode.Both)).build());
      怀.fd_Setting_78 = 怀.fd_SettingGroup_84.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("render-place")).description("Renders the block where it is placing an anchor.")).defaultValue(true)).build());
      var10001 = 怀.fd_SettingGroup_84;
      meteordevelopment.meteorclient.settings.ColorSetting.Builder var3 = (meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)(new meteordevelopment.meteorclient.settings.ColorSetting.Builder()).name("place-side-color")).description("The side color for positions to be placed.")).defaultValue(new SettingColor(255, 0, 0, 75));
      var10003 = 怀.fd_Setting_78;
      Objects.requireNonNull(var10003);
      怀.fd_Setting_92 = var10001.add(((meteordevelopment.meteorclient.settings.ColorSetting.Builder)var3.visible(var10003::get)).build());
      var10001 = 怀.fd_SettingGroup_84;
      var3 = (meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)(new meteordevelopment.meteorclient.settings.ColorSetting.Builder()).name("place-line-color")).description("The line color for positions to be placed.")).defaultValue(new SettingColor(255, 0, 0, 255));
      var10003 = 怀.fd_Setting_78;
      Objects.requireNonNull(var10003);
      怀.fd_Setting_98 = var10001.add(((meteordevelopment.meteorclient.settings.ColorSetting.Builder)var3.visible(var10003::get)).build());
      怀.jLJiIiiILLlijiiIIJjJJijLJJjjIllLjLlLjijIJlilLILlilIijlJjjiI = 怀.fd_SettingGroup_84.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("render-break")).description("Renders the block where it is breaking an anchor.")).defaultValue(true)).build());
      var10001 = 怀.fd_SettingGroup_84;
      var3 = (meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)(new meteordevelopment.meteorclient.settings.ColorSetting.Builder()).name("break-side-color")).description("The side color for anchors to be broken.")).defaultValue(new SettingColor(255, 0, 0, 75));
      var10003 = 怀.jLJiIiiILLlijiiIIJjJJijLJJjjIllLjLlLjijIJlilLILlilIijlJjjiI;
      Objects.requireNonNull(var10003);
      怀.fd_Setting_105 = var10001.add(((meteordevelopment.meteorclient.settings.ColorSetting.Builder)var3.visible(var10003::get)).build());
      var10001 = 怀.fd_SettingGroup_84;
      var3 = (meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)(new meteordevelopment.meteorclient.settings.ColorSetting.Builder()).name("break-line-color")).description("The line color for anchors to be broken.")).defaultValue(new SettingColor(255, 0, 0, 255));
      var10003 = 怀.jLJiIiiILLlijiiIIJjJJijLJJjjIllLjLlLjijIJlilLILlilIijlJjjiI;
      Objects.requireNonNull(var10003);
      怀.fd_Setting_79 = var10001.add(((meteordevelopment.meteorclient.settings.ColorSetting.Builder)var3.visible(var10003::get)).build());
   }

   private void notify(String 怀) {
      // $FF: Couldn't be decompiled
   }

   private boolean getDamagePlace(BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return 怀.fd_Setting_89.get() == Safety.Suicide || DamageUtils.bedDamage(怀.mc.player, Utils.vec3d(怀.add(0.5D, 0.5D, 0.5D))) <= (Double)怀.fd_Setting_107.get();
   }

   private boolean isValidBreak(BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return 怀.mc.world.getBlockState(怀).getBlock() == Blocks.RESPAWN_ANCHOR && Math.sqrt(怀.mc.player.getBlockPos().getSquaredDistance(怀)) <= (Double)怀.SSSssssSSsSSsSsSssSSsssssSsssSSSSSsSSSsSssssssSSsSSssSsSsSsSssSssssSssssSsSSsSssSSssSsssSsSSSSssssSsSSSSssSsSSssSsS.get() && 怀.getDamageBreak(怀);
   }

   private BlockPos findBreakPos(BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀.isValidBreak(怀.down())) {
         return 怀.down();
      } else if (怀.isValidBreak(怀.up(2))) {
         return 怀.up(2);
      } else if (怀.isValidBreak(怀.add(1, 0, 0))) {
         return 怀.add(1, 0, 0);
      } else if (怀.isValidBreak(怀.add(-1, 0, 0))) {
         return 怀.add(-1, 0, 0);
      } else if (怀.isValidBreak(怀.add(0, 0, 1))) {
         return 怀.add(0, 0, 1);
      } else if (怀.isValidBreak(怀.add(0, 0, -1))) {
         return 怀.add(0, 0, -1);
      } else if (怀.isValidBreak(怀.add(1, 1, 0))) {
         return 怀.add(1, 1, 0);
      } else if (怀.isValidBreak(怀.add(-1, -1, 0))) {
         return 怀.add(-1, -1, 0);
      } else if (怀.isValidBreak(怀.add(0, 1, 1))) {
         return 怀.add(0, 1, 1);
      } else {
         return 怀.isValidBreak(怀.add(0, 0, -1)) ? 怀.add(0, 0, -1) : null;
      }
   }
}
