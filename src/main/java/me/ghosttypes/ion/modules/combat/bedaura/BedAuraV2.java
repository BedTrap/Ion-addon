/* Decompiler 168ms, total 369ms, lines 422 */
package me.ghosttypes.ion.modules.combat.bedaura;

import java.util.Iterator;
import java.util.Objects;
import me.ghosttypes.ion.modules.render.Notifications.mode;
import me.ghosttypes.ion.utils.Class68;
import me.ghosttypes.ion.utils.sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS;
import me.ghosttypes.ion.utils.combat.Class11;
import me.ghosttypes.ion.utils.combat.Class5_Enum;
import me.ghosttypes.ion.utils.combat.Class8_Enum;
import me.ghosttypes.ion.utils.events.Class17;
import me.ghosttypes.ion.utils.misc.Class19;
import me.ghosttypes.ion.utils.player.Class46;
import me.ghosttypes.ion.utils.world.Class66;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.events.render.Render2DEvent;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent.Post;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.renderer.text.TextRenderer;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.BoolSetting.Builder;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.systems.modules.combat.CrystalAura;
import meteordevelopment.meteorclient.utils.Utils;
import meteordevelopment.meteorclient.utils.entity.EntityUtils;
import meteordevelopment.meteorclient.utils.entity.SortPriority;
import meteordevelopment.meteorclient.utils.entity.TargetUtils;
import meteordevelopment.meteorclient.utils.misc.Vec3;
import meteordevelopment.meteorclient.utils.player.DamageUtils;
import meteordevelopment.meteorclient.utils.player.FindItemResult;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.player.Rotations;
import meteordevelopment.meteorclient.utils.render.NametagUtils;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.meteorclient.utils.world.BlockUtils;
import meteordevelopment.meteorclient.utils.world.CardinalDirection;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.CraftingScreenHandler;
import net.minecraft.item.BedItem;
import net.minecraft.item.Item;
import net.minecraft.block.BedBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BedBlockEntity;
import net.minecraft.util.hit.BlockHitResult;

public class BedAuraV2 extends Module {
   private final SettingGroup fd_SettingGroup_413;
   private boolean fd_boolean_414;
   public final Setting<Boolean> fd_Setting_415;
   private final SettingGroup fd_SettingGroup_416;
   public final Setting<Boolean> fd_Setting_417;
   public final Setting<Boolean> iiLLiJlilLIjljLlii;
   public final Setting<Double> fd_Setting_418;
   public final Setting<Boolean> fd_Setting_419;
   public final Setting<Boolean> fd_Setting_420;
   private PlayerEntity fd_PlayerEntity_421;
   public final Setting<SettingColor> fd_Setting_422;
   private final SettingGroup fd_SettingGroup_423;
   public final Setting<BedAuraV2$BedRotate> fd_Setting_424;
   public final Setting<Double> fd_Setting_425;
   public final Setting<Boolean> fd_Setting_426;
   public final Setting<Boolean> fd_Setting_427;
   public final Setting<Boolean> fd_Setting_428;
   private final SettingGroup fd_SettingGroup_429;
   public final Setting<Boolean> fd_Setting_430;
   private int fd_int_431;
   public final Setting<SortPriority> fd_Setting_432;
   public final Setting<Boolean> fd_Setting_433;
   public final Setting<SettingColor> fd_Setting_434;
   private int fd_int_435;
   private Item fd_Item_436;
   private int fd_int_437;
   public final Setting<Integer> fd_Setting_438;
   public final Setting<Integer> fd_Setting_439;
   public final Setting<Boolean> IijLiLJjjJijilIjjiJJJJiiIlIjJJiIIJJLjlljIIllijjlJIIjJljlilJJLIjIlJJJIllLJIjJJilIllI;
   public final Setting<Boolean> fd_Setting_440;
   public final Setting<Double> fd_Setting_441;
   public final Setting<Integer> fd_Setting_442;
   private final SettingGroup fd_SettingGroup_443;
   public final Setting<Double> fd_Setting_444;
   public final Setting<Double> fd_Setting_445;
   public final Setting<Boolean> fd_Setting_446;
   public final Setting<Boolean> fd_Setting_447;
   private final SettingGroup fd_SettingGroup_448;
   private final SettingGroup fd_SettingGroup_449;
   public final Setting<Integer> fd_Setting_450;
   public final Setting<Integer> fd_Setting_451;
   public final Setting<BedAuraV2$DamageCalc> fd_Setting_452;
   public final Setting<Boolean> fd_Setting_453;
   public final Setting<Integer> fd_Setting_454;
   private boolean fd_boolean_455;
   private boolean fd_boolean_456;
   public final Setting<Integer> fd_Setting_457;
   public final Setting<Boolean> fd_Setting_458;
   public final Setting<Boolean> fd_Setting_459;
   public final Setting<mode> fd_Setting_460;
   public final Setting<Boolean> fd_Setting_461;
   private final SettingGroup fd_SettingGroup_462;
   private final SettingGroup ssssSSSsSsssSSsssSssSSssssssSssSSsSsSSsSSsSsSsssssSs;
   public final Setting<Integer> fd_Setting_463;
   public final Setting<BedAuraV2$BreakHand> fd_Setting_464;
   public final Setting<Boolean> sSSSssSSSsSssSSssSsssSSsSsSSsSssSSSSSssssSSSSSSsSSsssSSssSsssSSsSsssS;
   public final Setting<Boolean> fd_Setting_465;
   private BlockPos fd_BlockPos_466;
   private boolean fd_boolean_467;
   public final Setting<Boolean> fd_Setting_468;
   private boolean fd_boolean_469;
   public final Setting<Boolean> fd_Setting_470;
   public final Setting<SettingColor> fd_Setting_471;
   public final Setting<Integer> fd_Setting_472;
   private BlockPos QpqqpqQqPPQqpqqQpQppppPPqPPQqpqQPqqPqqqPqPqPQqpQpqqQPPqpqqppPPPqpqpqqQQPqppqq;
   public final Setting<Class8_Enum> fd_Setting_473;
   public final Setting<Boolean> sSSSSSSssSssssSsssSssSSSSSSssSsSssSSssSSsssSSSSssSS;
   public final Setting<Boolean> fd_Setting_474;
   public final Setting<Double> QqqpQqQpqQPpqQQqpPpQQqPQqQpqqPPpppqppPPqQPQQPqqqqPqqQpq;
   public final Setting<Boolean> fd_Setting_475;
   public final Setting<Boolean> fd_Setting_476;
   public double fd_double_477;
   public final Setting<Boolean> fd_Setting_478;
   public CardinalDirection fd_CardinalDirection_479;
   public final Setting<Boolean> fd_Setting_480;
   public final Setting<BedAuraV2$DamageCalc> iJLLlJILJiLlLjJIJLJIJJJIlliljJJJJijjLLLjIliJIIIjJLi;
   public final Setting<ShapeMode> fd_Setting_481;
   public final Setting<Double> fd_Setting_482;
   public final Setting<Boolean> fd_Setting_483;
   public final Setting<Boolean> iLLjIILljjLJIlJliJjlli;
   public final Setting<Class5_Enum> fd_Setting_484;
   private final SettingGroup QPpQPQQQPppQPppqQqqpPPPpQppqpPPpqPpqQPQqQPPPqQQPQqppPQQqQpPpqPpqppqQppPPQqqPqpQPQPpPqQqQQQppQpQPqPpqQPqQpqpQQqqqPqPP;

   @EventHandler
   private void onTick(Post 怀) {
      // $FF: Couldn't be decompiled
   }

   public BedAuraV2() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super(Class68.fd_Category_1060, "bed-aura-v2", "The famous troll module.");
      怀.fd_SettingGroup_462 = 怀.settings.getDefaultGroup();
      怀.fd_SettingGroup_429 = 怀.settings.createGroup("Rotation");
      怀.fd_SettingGroup_448 = 怀.settings.createGroup("Targeting");
      怀.fd_SettingGroup_443 = 怀.settings.createGroup("PopOverride");
      怀.fd_SettingGroup_416 = 怀.settings.createGroup("Trap");
      怀.fd_SettingGroup_413 = 怀.settings.createGroup("Inventory");
      怀.ssssSSSsSsssSSsssSssSSssssssSssSSsSsSSsSSsSsSsssssSs = 怀.settings.createGroup("Automation");
      怀.fd_SettingGroup_449 = 怀.settings.createGroup("Safety");
      怀.fd_SettingGroup_423 = 怀.settings.createGroup("Pause");
      怀.QPpQPQQQPppQPppqQqqpPPPpQppqpPPpqPpqQPQqQPPPqQQPQqppPQQqQpPpqPpqppqQppPPQqqPqpQPQPpPqQqQQQppQpQPqPpqQPqQpqpQQqqqPqPP = 怀.settings.createGroup("Render");
      怀.fd_Setting_447 = 怀.fd_SettingGroup_462.add(((Builder)((Builder)((Builder)(new Builder()).name("debug")).description("Spam chat with shit you won't understand.")).defaultValue(false)).build());
      怀.fd_Setting_439 = 怀.fd_SettingGroup_462.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("delay")).description("The delay between placing beds in ticks.")).defaultValue(9)).min(0).sliderMax(20).build());
      怀.fd_Setting_461 = 怀.fd_SettingGroup_462.add(((Builder)((Builder)((Builder)(new Builder()).name("strict-direction")).description("Only places beds in the direction you are facing.")).defaultValue(false)).build());
      怀.fd_Setting_464 = 怀.fd_SettingGroup_462.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("break-hand")).description("Which hand to break beds with.")).defaultValue(BedAuraV2$BreakHand.pPQpPPqQQqQpQQpPQpQQQQQqPQQQqpppQqPPQQQQqPPpqqQppqPPQQpPQPQppPPPQpqPpQqQqPppQQpqqPPQqqpQppqPPqppqQqPqPppQpPQqqpPPPp)).build());
      怀.fd_Setting_460 = 怀.fd_SettingGroup_462.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("notification-mode")).description("How notifications are displayed.")).defaultValue(mode.fd_mode_881)).build());
      怀.fd_Setting_442 = 怀.fd_SettingGroup_462.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("place-delay-hole")).description("The delay between placing beds in ticks if the target is in a hole.")).defaultValue(9)).min(0).sliderMax(20).build());
      怀.fd_Setting_454 = 怀.fd_SettingGroup_462.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("place-delay-moving")).description("The delay between placing beds in ticks if the target is moving.")).defaultValue(7)).min(0).sliderMax(20).build());
      怀.fd_Setting_474 = 怀.fd_SettingGroup_462.add(((Builder)((Builder)((Builder)(new Builder()).name("instant-break")).description("Break beds in the same tick they are placed in.")).defaultValue(false)).build());
      怀.fd_Setting_438 = 怀.fd_SettingGroup_462.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("break-delay-hole")).description("The delay between breaking beds in ticks if the target is in a hole.")).defaultValue(9)).min(0).sliderMax(20).build());
      怀.fd_Setting_463 = 怀.fd_SettingGroup_462.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("break-delay-moving")).description("The delay between breaking beds in ticks if the target is moving.")).defaultValue(7)).min(0).sliderMax(20).build());
      怀.fd_Setting_424 = 怀.fd_SettingGroup_429.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("bed-rotations")).description("How to rotate on bed place/break.")).defaultValue(BedAuraV2$BedRotate.fd_BedRotate_489)).build());
      怀.fd_Setting_473 = 怀.fd_SettingGroup_429.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("block-rotations")).description("How to rotate on block place/break.")).defaultValue(Class8_Enum.fd_Class8_Enum_895)).build());
      怀.fd_Setting_472 = 怀.fd_SettingGroup_429.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("rotate-priority")).description("Rotation priority")).defaultValue(50)).min(1).sliderMax(100).max(100).build());
      怀.fd_Setting_452 = 怀.fd_SettingGroup_448.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("hole-damage-calc")).description("How to calculate damage to targets in a hole.")).defaultValue(BedAuraV2$DamageCalc.fd_DamageCalc_493)).build());
      怀.iJLLlJILJiLlLjJIJLJIJJJIlliljJJJJijjLLLjIliJIIIjJLi = 怀.fd_SettingGroup_448.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("moving-damage-calc")).description("How to calculate damage to moving targets.")).defaultValue(BedAuraV2$DamageCalc.fd_DamageCalc_492)).build());
      怀.fd_Setting_427 = 怀.fd_SettingGroup_448.add(((Builder)((Builder)((Builder)(new Builder()).name("predict")).description("Predict where to place next.")).defaultValue(false)).build());
      怀.fd_Setting_428 = 怀.fd_SettingGroup_448.add(((Builder)((Builder)((Builder)(new Builder()).name("ignore-elytra")).description("Ignore predict if you or the target is in an elytra.")).defaultValue(false)).build());
      怀.fd_Setting_441 = 怀.fd_SettingGroup_448.add(((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)(new meteordevelopment.meteorclient.settings.DoubleSetting.Builder()).name("target-range")).description("The range at which players can be targeted.")).defaultValue(4.0D).min(0.0D).sliderMax(5.0D).build());
      怀.fd_Setting_432 = 怀.fd_SettingGroup_448.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("target-priority")).description("How to filter the players to target.")).defaultValue(SortPriority.LowestHealth)).build());
      怀.fd_Setting_425 = 怀.fd_SettingGroup_448.add(((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)(new meteordevelopment.meteorclient.settings.DoubleSetting.Builder()).name("min-damage")).description("The minimum damage to inflict on your target.")).defaultValue(7.0D).min(0.0D).max(36.0D).sliderMax(36.0D).build());
      怀.fd_Setting_444 = 怀.fd_SettingGroup_448.add(((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)(new meteordevelopment.meteorclient.settings.DoubleSetting.Builder()).name("max-self-damage")).description("The maximum damage to inflict on yourself.")).defaultValue(7.0D).min(0.0D).max(36.0D).sliderMax(36.0D).build());
      怀.fd_Setting_480 = 怀.fd_SettingGroup_448.add(((Builder)((Builder)((Builder)(new Builder()).name("anti-suicide")).description("Will not place and break beds if they will kill you.")).defaultValue(true)).build());
      怀.fd_Setting_483 = 怀.fd_SettingGroup_443.add(((Builder)((Builder)((Builder)(new Builder()).name("pop-override")).description("Ignore max self damage if the target pops and you wont.")).defaultValue(false)).build());
      怀.QqqpQqQpqQPpqQQqpPpQQqPQqQpqqPPpppqppPPqQPQQPqqqqPqqQpq = 怀.fd_SettingGroup_443.add(((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)(new meteordevelopment.meteorclient.settings.DoubleSetting.Builder()).name("min-health")).description("How much health you must have.")).defaultValue(10.0D).min(1.0D).max(36.0D).sliderMax(36.0D).build());
      怀.fd_Setting_418 = 怀.fd_SettingGroup_443.add(((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)(new meteordevelopment.meteorclient.settings.DoubleSetting.Builder()).name("min-health-after")).description("How much health you must have after placing.")).defaultValue(6.0D).min(1.0D).max(36.0D).sliderMax(36.0D).build());
      怀.fd_Setting_415 = 怀.fd_SettingGroup_413.add(((Builder)((Builder)((Builder)(new Builder()).name("auto-move")).description("Moves beds into a selected hotbar slot.")).defaultValue(false)).build());
      SettingGroup var10001 = 怀.fd_SettingGroup_413;
      meteordevelopment.meteorclient.settings.IntSetting.Builder var10002 = ((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("auto-move-slot")).description("The slot auto move moves beds to.")).defaultValue(9)).min(1).max(9).sliderMin(1).sliderMax(9);
      Setting var10003 = 怀.fd_Setting_415;
      Objects.requireNonNull(var10003);
      怀.fd_Setting_450 = var10001.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)var10002.visible(var10003::get)).build());
      怀.fd_Setting_420 = 怀.fd_SettingGroup_413.add(((Builder)((Builder)((Builder)(new Builder()).name("auto-switch")).description("Switches to and from beds automatically.")).defaultValue(true)).build());
      怀.fd_Setting_426 = 怀.fd_SettingGroup_413.add(((Builder)((Builder)((Builder)(new Builder()).name("restore-on-disable")).description("Put whatever was in your auto move slot back after disabling.")).defaultValue(true)).build());
      怀.fd_Setting_457 = 怀.fd_SettingGroup_413.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("min-beds")).description("How many beds are required in your inventory to place.")).defaultValue(2)).min(1).build());
      怀.fd_Setting_430 = 怀.fd_SettingGroup_416.add(((Builder)((Builder)((Builder)(new Builder()).name("auto-trap")).description("Prevent the target from escaping before placing beds.")).defaultValue(true)).build());
      怀.sSSSssSSSsSssSSssSsssSSsSsSSsSssSSSSSssssSSSSSSsSSsssSSssSsssSSsSsssS = 怀.fd_SettingGroup_416.add(((Builder)((Builder)((Builder)(new Builder()).name("hole-only")).description("Only trap the target if they are in a hole.")).defaultValue(false)).build());
      怀.fd_Setting_446 = 怀.fd_SettingGroup_416.add(((Builder)((Builder)((Builder)(new Builder()).name("hold")).description("Wait for the target to be trapped before placing beds.")).defaultValue(false)).build());
      怀.fd_Setting_458 = 怀.fd_SettingGroup_416.add(((Builder)((Builder)((Builder)(new Builder()).name("bypass-on-no-obby")).description("Will place normally rather than stopping if you're out of obby.")).defaultValue(false)).build());
      怀.fd_Setting_484 = 怀.fd_SettingGroup_448.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("mine-mode")).description("How to mine blocks.")).defaultValue(Class5_Enum.fd_Class5_Enum_888)).build());
      怀.fd_Setting_470 = 怀.ssssSSSsSsssSSsssSssSSssssssSssSSsSsSSsSSsSsSsssssSs.add(((Builder)((Builder)((Builder)(new Builder()).name("break-self-trap")).description("Break target's self-trap automatically.")).defaultValue(true)).build());
      怀.fd_Setting_453 = 怀.ssssSSSsSsssSSsssSssSSssssssSssSSsSsSSsSSsSsSsssssSs.add(((Builder)((Builder)((Builder)(new Builder()).name("randomize")).description("Break a random block from the target's self trap. Can improve success rate.")).defaultValue(false)).build());
      怀.fd_Setting_475 = 怀.ssssSSSsSsssSSsssSssSSssssssSssSSsSsSSsSSsSsSsssssSs.add(((Builder)((Builder)((Builder)(new Builder()).name("break-burrow")).description("Break target's burrow automatically.")).defaultValue(true)).build());
      怀.fd_Setting_417 = 怀.ssssSSSsSsssSSsssSssSSssssssSssSSsSsSSsSSsSsSsssssSs.add(((Builder)((Builder)((Builder)(new Builder()).name("break-web")).description("Break target's webs/string automatically.")).defaultValue(true)).build());
      怀.sSSSSSSssSssssSsssSssSSSSSSssSsSssSSssSSsssSSSSssSS = 怀.ssssSSSsSsssSSsssSssSSssssssSssSSsSsSSsSSsSsSsssssSs.add(((Builder)((Builder)((Builder)(new Builder()).name("render-break")).description("Render mining self-trap/burrow.")).defaultValue(false)).build());
      怀.fd_Setting_440 = 怀.ssssSSSsSsssSSsssSssSSssssssSssSSsSsSSsSSsSsSsssssSs.add(((Builder)((Builder)((Builder)(new Builder()).name("disable-on-no-beds")).description("Disable if you run out of beds.")).defaultValue(false)).build());
      怀.IijLiLJjjJijilIjjiJJJJiiIlIjJJiIIJJLjlljIIllijjlJIIjJljlilJJLIjIlJJJIllLJIjJJilIllI = 怀.fd_SettingGroup_449.add(((Builder)((Builder)((Builder)(new Builder()).name("disable-on-safety")).description("Disable BedAuraPlus when safety activates.")).defaultValue(true)).build());
      怀.fd_Setting_445 = 怀.fd_SettingGroup_449.add(((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)(new meteordevelopment.meteorclient.settings.DoubleSetting.Builder()).name("safety-hp")).description("What health safety activates at.")).defaultValue(10.0D).min(1.0D).max(36.0D).sliderMax(36.0D).build());
      怀.fd_Setting_468 = 怀.fd_SettingGroup_449.add(((Builder)((Builder)((Builder)(new Builder()).name("swap-to-gap")).description("Swap to egaps after activating safety.")).defaultValue(false)).build());
      怀.fd_Setting_478 = 怀.fd_SettingGroup_423.add(((Builder)((Builder)((Builder)(new Builder()).name("pause-on-eat")).description("Pauses while eating.")).defaultValue(true)).build());
      怀.iiLLiJlilLIjljLlii = 怀.fd_SettingGroup_423.add(((Builder)((Builder)((Builder)(new Builder()).name("pause-on-drink")).description("Pauses while drinking.")).defaultValue(true)).build());
      怀.iLLjIILljjLJIlJliJjlli = 怀.fd_SettingGroup_423.add(((Builder)((Builder)((Builder)(new Builder()).name("pause-on-mine")).description("Pauses while mining.")).defaultValue(true)).build());
      怀.fd_Setting_459 = 怀.fd_SettingGroup_423.add(((Builder)((Builder)((Builder)(new Builder()).name("pause-on-ca")).description("Pause while Crystal Aura is active.")).defaultValue(false)).build());
      怀.fd_Setting_476 = 怀.fd_SettingGroup_423.add(((Builder)((Builder)((Builder)(new Builder()).name("pause-on-crafting")).description("Pauses while you're in a crafting table.")).defaultValue(false)).build());
      怀.fd_Setting_419 = 怀.QPpQPQQQPppQPppqQqqpPPPpQppqpPPpqPpqQPQqQPPPqQQPQqppPQQqQpPpqPpqppqQppPPQqqPqpQPQPpPqQqQQQppQpQPqPpqQPqQpqpQQqqqPqPP.add(((Builder)((Builder)((Builder)(new Builder()).name("swing")).description("Whether to swing hand clientside clientside.")).defaultValue(true)).build());
      怀.fd_Setting_433 = 怀.QPpQPQQQPppQPppqQqqpPPPpQppqpPPpqPpqQPQqQPPPqQQPQqppPQQqQpPpqPpqppqQppPPQqqPqpQPQPpPqQqQQQppQpQPqPpqQPqQpqpQQqqqPqPP.add(((Builder)((Builder)((Builder)(new Builder()).name("render")).description("Renders the block where it is placing a bed.")).defaultValue(true)).build());
      怀.fd_Setting_481 = 怀.QPpQPQQQPppQPppqQqqpPPPpQppqpPPpqPpqQPQqQPPPqQQPQqppPQQqQpPpqPpqppqQppPPQqqPqpQPQPpPqQqQQQppQpQPqPpqQPqQpqpQQqqqPqPP.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("shape-mode")).description("How the shapes are rendered.")).defaultValue(ShapeMode.Both)).build());
      怀.fd_Setting_434 = 怀.QPpQPQQQPppQPppqQqqpPPPpQppqpPPpqPpqQPQqQPPPqQQPQqppPQQqQpPpqPpqppqQppPPQqqPqpQPQPpPqQqQQQppQpQPqPpqQPqQpqpQQqqqPqPP.add(((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)(new meteordevelopment.meteorclient.settings.ColorSetting.Builder()).name("side-color")).description("The side color for positions to be placed.")).defaultValue(new SettingColor(15, 255, 211, 75))).build());
      怀.fd_Setting_471 = 怀.QPpQPQQQPppQPppqQqqpPPPpQppqpPPpqPpqQPQqQPPPqQQPQqppPQQqQpPpqPpqppqQppPPQqqPqpQPQPpPqQqQQQppQpQPqPpqQPqQpqpQQqqqPqPP.add(((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)(new meteordevelopment.meteorclient.settings.ColorSetting.Builder()).name("line-color")).description("The line color for positions to be placed.")).defaultValue(new SettingColor(15, 255, 211))).build());
      怀.fd_Setting_465 = 怀.QPpQPQQQPppQPppqQqqpPPPpQppqpPPpqPpqQPQqQPPPqQQPQqppPQQqQpPpqPpqppqQppPPQqqPqpQPQPpPqQqQQQppQpQPqPpqQPqQpqpQQqqqPqPP.add(((Builder)((Builder)((Builder)(new Builder()).name("render-damage")).description("Renders bed damage.")).defaultValue(true)).build());
      怀.fd_Setting_451 = 怀.QPpQPQQQPppQPppqQqqpPPPpQppqpPPpqPpqQPQqQPPPqQQPQqppPQQqQpPpqPpqppqQppPPQqqPqpQPQPpPqQqQQQppQpQPqPpqQPqQpqpQQqqqPqPP.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("round-damage")).description("Round damage to x decimal places.")).defaultValue(2)).min(0).max(3).sliderMax(3).build());
      怀.fd_Setting_482 = 怀.fd_SettingGroup_449.add(((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)(new meteordevelopment.meteorclient.settings.DoubleSetting.Builder()).name("damage-scale")).description("The scale of the damage text.")).defaultValue(1.4D).min(0.0D).max(5.0D).sliderMax(5.0D).build());
      怀.fd_Setting_422 = 怀.QPpQPQQQPppQPppqQqqpPPPpQppqpPPpqPpqQPQqQPPPqQQPQqppPQQqQpPpqPpqppqQppPPQqqPqpQPQPpPqQqQQQppQpQPqPpqQPqQpqpQQqqqPqPP.add(((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)(new meteordevelopment.meteorclient.settings.ColorSetting.Builder()).name("damage-color")).description("The color of the damage text.")).defaultValue(new SettingColor(15, 255, 211))).build());
   }

   @EventHandler
   private void onRender2D(Render2DEvent 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if ((Boolean)怀.fd_Setting_465.get() && 怀.QpqqpqQqPPQqpqqQpQppppPPqPPQqpqQPqqPqqqPqPqPQqpQpqqQPPqpqqppPPPqpqpqqQQPqppqq != null) {
         怀 怀 = 怀.QpqqpqQqPPQqpqqQpQppppPPqPPQqpqQPqqPqqqPqPqPQqpQpqqQPPqpqqppPPPqpqpqqQQPqppqq.getX();
         怀 怀 = 怀.QpqqpqQqPPQqpqqQpQppppPPqPPQqpqQPqqPqqqPqPqPQqpQpqqQPPqpqqppPPPqpqpqqQQPqppqq.getY();
         怀 怀 = 怀.QpqqpqQqPPQqpqqQpQppppPPqPPQqpqQPqqPqqqPqPqPQqpQpqqQPPqpqqppPPPqpqpqqQQPqppqq.getZ();
         怀 怀 = Utils.vec3d(怀.QpqqpqQqPPQqpqqQpQppppPPqPPQqpqQPqqPqqqPqPqPQqpQpqqQPPqpqqppPPPqpqpqqQQPqppqq);
         怀 怀 = new Vec3();
         怀.set((double)怀, (double)怀, (double)怀);
         if (NametagUtils.to2D(怀, (Double)怀.fd_Setting_482.get())) {
            NametagUtils.begin(怀);
            TextRenderer.get().begin(1.0D, false, true);
            怀 怀 = 怀.fd_double_477;
            怀 怀 = "0";
            switch((Integer)怀.fd_Setting_451.get()) {
            case 0:
               怀 = String.valueOf(Math.round(怀));
               break;
            case 1:
               怀 = String.valueOf((double)Math.round(怀 * 10.0D) / 10.0D);
               break;
            case 2:
               怀 = String.valueOf((double)Math.round(怀 * 100.0D) / 100.0D);
               break;
            case 3:
               怀 = String.valueOf((double)Math.round(怀 * 1000.0D) / 1000.0D);
            }

            怀 怀 = TextRenderer.get().getWidth(怀) / 2.0D;
            TextRenderer.get().render(怀, -怀, 0.0D, (Color)怀.fd_Setting_422.get());
            TextRenderer.get().end();
            NametagUtils.end();
         }
      }

   }

   public void onDeactivate() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      FindItemResult 怀;
      if (怀.fd_boolean_467) {
         怀.notify("Your health is too low!");
         if ((Boolean)怀.fd_Setting_468.get()) {
            怀 = Class46.findEgap();
            if (怀.found()) {
               怀.mc.player.getInventory().selectedSlot = 怀.slot();
            }
         }
      }

      if (!怀.fd_boolean_467 && (Boolean)怀.fd_Setting_426.get() && 怀.fd_Item_436 != null) {
         怀 = InvUtils.find(new Item[]{怀.fd_Item_436});
         if (怀.found()) {
            InvUtils.move().from(怀.slot()).toHotbar((Integer)怀.fd_Setting_450.get() - 1);
         }
      }

   }

   private BlockPos findBreak() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = false;
      Iterator var3 = Utils.blockEntities().iterator();

      BlockPos 怀;
      do {
         Vec3d 怀;
         do {
            BlockEntity 怀;
            do {
               if (!var3.hasNext()) {
                  return null;
               }

               怀 = (BlockEntity)var3.next();
            } while(!(怀 instanceof BedBlockEntity));

            怀 = 怀.getPos();
            怀 = Utils.vec3d(怀);
         } while(PlayerUtils.distanceTo(怀) > (double)怀.mc.interactionManager.getReachDistance());

         怀 怀 = DamageUtils.bedDamage(怀.fd_PlayerEntity_421, 怀);
         怀 怀 = DamageUtils.bedDamage(怀.mc.player, 怀);
         if (怀 >= (Double)怀.fd_Setting_425.get()) {
            boolean 怀;
            if ((Boolean)怀.fd_Setting_483.get()) {
               怀 = BedUtil.shouldBypassSelfDmg(PlayerUtils.getTotalHealth(), 怀, 怀, 怀, (double)(怀.fd_PlayerEntity_421.getHealth() + 怀.fd_PlayerEntity_421.getAbsorptionAmount()), (Boolean)怀.fd_Setting_480.get(), true);
            } else {
               怀 = false;
            }

            if (!怀) {
               if (怀 <= (Double)怀.fd_Setting_444.get()) {
                  怀 = !(Boolean)怀.fd_Setting_480.get() || PlayerUtils.getTotalHealth() - 怀 > 0.0D;
               }
            } else {
               怀 = !(Boolean)怀.fd_Setting_480.get() || PlayerUtils.getTotalHealth() - 怀 > 0.0D;
            }
         }
      } while(!怀);

      return 怀;
   }

   private void breakBed(BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀 != null) {
         怀.fd_BlockPos_466 = null;
         if (怀.mc.world.getBlockState(怀).getBlock() instanceof BedBlock) {
            怀 怀 = 怀.mc.player.isSneaking();
            if (怀) {
               怀.mc.player.setSneaking(false);
            }

            Hand 怀;
            if (怀.fd_Setting_464.get() == BedAuraV2$BreakHand.fd_BreakHand_490) {
               怀 = Hand.MAIN_HAND;
            } else {
               怀 = Hand.OFF_HAND;
            }

            if (怀.fd_Setting_424.get() == BedAuraV2$BedRotate.fd_BedRotate_488) {
               Rotations.rotate(Rotations.getYaw(怀), Rotations.getPitch(怀), () -> {
                  String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
                  怀x.mc.interactionManager.interactBlock(怀x.mc.player, 怀, new BlockHitResult(怀x.mc.player.getPos(), Direction.UP, 怀, false));
               });
            } else {
               怀.mc.interactionManager.interactBlock(怀.mc.player, 怀, new BlockHitResult(怀.mc.player.getPos(), Direction.UP, 怀, false));
            }

            怀.mc.player.setSneaking(怀);
         }
      }
   }

   public void resetBurrowVars() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀.fd_boolean_455 = false;
      怀.fd_boolean_456 = false;
   }

   public void onActivate() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      Class66.moduleAuth();
      怀.fd_PlayerEntity_421 = null;
      怀.QpqqpqQqPPQqpqqQpQppppPPqPPQqpqQPqqPqqqPqPqPQqpQpqqQPPqpqqppPPPqpqpqqQQPqppqq = null;
      怀.fd_BlockPos_466 = null;
      怀.fd_Item_436 = sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.getItemFromSlot((Integer)怀.fd_Setting_450.get() - 1);
      if (怀.fd_Item_436 instanceof BedItem) {
         怀.fd_Item_436 = null;
      }

      怀.fd_boolean_467 = false;
      怀.fd_boolean_414 = false;
      怀.fd_boolean_456 = false;
      怀.fd_boolean_469 = false;
      怀.fd_boolean_455 = false;
      怀.fd_int_437 = 0;
      怀.fd_int_435 = 0;
      怀.fd_int_431 = 0;
      怀.fd_CardinalDirection_479 = CardinalDirection.North;
   }

   private void notify(String 怀) {
      // $FF: Couldn't be decompiled
   }

   private int getNextBreakTimer(PlayerEntity 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.isPlayerMoving(怀) ? (Integer)怀.fd_Setting_463.get() : (Integer)怀.fd_Setting_438.get();
   }

   private int getNextPlaceTimer(PlayerEntity 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.isPlayerMoving(怀) ? (Integer)怀.fd_Setting_454.get() : (Integer)怀.fd_Setting_442.get();
   }

   private void resetTrapVars() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀.fd_boolean_469 = false;
      怀.fd_boolean_414 = false;
      BedUtil.fd_BlockPos_585 = null;
      BedUtil.fd_BlockPos_584 = null;
   }

   private boolean placeBed(BlockPos 怀) {
      // $FF: Couldn't be decompiled
   }

   public String getInfoString() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return EntityUtils.getName(怀.fd_PlayerEntity_421);
   }

   @EventHandler
   private void onRender(Render3DEvent 怀) {
      // $FF: Couldn't be decompiled
   }
}
