/* Decompiler 172ms, total 374ms, lines 501 */
package me.ghosttypes.ion.modules.combat.bedaura;

import java.util.Iterator;
import java.util.Objects;
import me.ghosttypes.ion.modules.render.Notifications.mode;
import me.ghosttypes.ion.utils.Class68;
import me.ghosttypes.ion.utils.sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS;
import me.ghosttypes.ion.utils.combat.Class5_Enum;
import me.ghosttypes.ion.utils.combat.Class8_Enum;
import me.ghosttypes.ion.utils.events.Class17;
import me.ghosttypes.ion.utils.player.Class46;
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
import meteordevelopment.meteorclient.utils.Utils;
import meteordevelopment.meteorclient.utils.entity.EntityUtils;
import meteordevelopment.meteorclient.utils.entity.SortPriority;
import meteordevelopment.meteorclient.utils.entity.TargetUtils;
import meteordevelopment.meteorclient.utils.misc.Vec3;
import meteordevelopment.meteorclient.utils.player.DamageUtils;
import meteordevelopment.meteorclient.utils.player.FindItemResult;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.render.NametagUtils;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.meteorclient.utils.world.BlockUtils;
import meteordevelopment.meteorclient.utils.world.CardinalDirection;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BedItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.block.BedBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BedBlockEntity;
import net.minecraft.util.hit.BlockHitResult;

public class BedAuraV3 extends Module {
   public final Setting<Boolean> SsSsssSsSSssSSSsSSSssSSsssssssSsSssSssSssSSSssSssssSsssSsSSs;
   public final Setting<Integer> fd_Setting_494;
   private final SettingGroup fd_SettingGroup_495;
   public final Setting<Integer> fd_Setting_496;
   private CardinalDirection fd_CardinalDirection_497;
   private Item SssSsSSssSSssSsSSSssssSSSsSsssSSSssSSsSSssSssssSssssSssSsSSsSSssSSssSSssSSSsssSsSssS;
   public final Setting<Boolean> fd_Setting_498;
   public final Setting<Class8_Enum> LiJlilJiLiIlllljJJjjIljljiILllljJLjlIILjliiijJlilllllJJIiLLilJjLliiLljIIJijlJlJjLJJjIiiJJiLiJJIilLlLjLLIlJLLIiLjiLijjijiIj;
   public final Setting<Double> fd_Setting_499;
   public final Setting<Double> fd_Setting_500;
   private final SettingGroup fd_SettingGroup_501;
   public final Setting<BedAuraV3$BreakHand> qpPqpqQQqqQpqpQPqpqP;
   private final SettingGroup fd_SettingGroup_502;
   public final Setting<Boolean> fd_Setting_503;
   public final Setting<Boolean> fd_Setting_504;
   private final SettingGroup fd_SettingGroup_505;
   public final Setting<Boolean> fd_Setting_506;
   public final Setting<Boolean> fd_Setting_507;
   private int fd_int_508;
   public final Setting<Double> fd_Setting_509;
   public final Setting<Boolean> fd_Setting_510;
   private boolean fd_boolean_511;
   public final Setting<Boolean> fd_Setting_512;
   public final Setting<Boolean> fd_Setting_513;
   private final SettingGroup fd_SettingGroup_514;
   private int fd_int_515;
   public final Setting<Boolean> sSsSssSSsSSSSssssSSsSssSSsSSssSSsssSssSSssSsssssSSSsssSssssssSSssSSsSsSssSSSsSSSSSsSsSsSSsSssSSSsssSsSssSSss;
   public final Setting<Boolean> fd_Setting_516;
   private BlockPos fd_BlockPos_517;
   public final Setting<SettingColor> ssSsSSssSSsSSsSsSsSsSssssSSsSSssSSSSsSSSsSSsssSs;
   public final Setting<ShapeMode> fd_Setting_518;
   public final Setting<Boolean> lJJJijlliJjIIlJLllJiILLLLlLJiLLl;
   private BlockPos fd_BlockPos_519;
   public final Setting<SettingColor> fd_Setting_520;
   public final Setting<Double> fd_Setting_521;
   public final Setting<Integer> fd_Setting_522;
   public final Setting<SettingColor> fd_Setting_523;
   public final Setting<Integer> fd_Setting_524;
   public final Setting<Integer> fd_Setting_525;
   private BlockPos fd_BlockPos_526;
   public final Setting<Boolean> fd_Setting_527;
   private PlayerEntity QPpqQqQPqQqpQpQQppQqqPPqPPPpQqqQqQPpQqppqppppqpPQQPPQQPPpPPPqQqQpPpQPpqqqQqPPqqPpPPppQQqQpPPQPQPqqQpqpQQPQPPpq;
   public final Setting<BedAuraV3$RenderMode> fd_Setting_528;
   private final SettingGroup fd_SettingGroup_529;
   public final Setting<Class5_Enum> fd_Setting_530;
   private final SettingGroup jJljjjJllJJlIiIilJIjIilJljjIliiIJiILjJLLlL;
   public final Setting<Boolean> fd_Setting_531;
   public final Setting<Boolean> fd_Setting_532;
   private boolean fd_boolean_533;
   public final Setting<Boolean> fd_Setting_534;
   public final Setting<Boolean> fd_Setting_535;
   public final Setting<Boolean> fd_Setting_536;
   private final SettingGroup fd_SettingGroup_537;
   private final SettingGroup fd_SettingGroup_538;
   public final Setting<Boolean> fd_Setting_539;
   public final Setting<Boolean> fd_Setting_540;
   public final Setting<Boolean> fd_Setting_541;
   private boolean fd_boolean_542;
   public final Setting<mode> fd_Setting_543;
   public final Setting<Integer> fd_Setting_544;
   public final Setting<SettingColor> fd_Setting_545;
   public final Setting<Boolean> fd_Setting_546;
   public final Setting<Double> fd_Setting_547;
   private int fd_int_548;
   public final Setting<Double> fd_Setting_549;
   public final Setting<Double> fd_Setting_550;
   public final Setting<Integer> fd_Setting_551;
   private boolean fd_boolean_552;
   private final SettingGroup fd_SettingGroup_553;
   public final Setting<SettingColor> fd_Setting_554;
   public final Setting<Boolean> fd_Setting_555;
   private final SettingGroup fd_SettingGroup_556;
   private boolean QpppppQpqpQpQQQQQqPqPqppPPQqqPPqqqpQPQPQQpqpp;
   public final Setting<Boolean> fd_Setting_557;
   public final Setting<SortPriority> fd_Setting_558;
   public final Setting<Boolean> fd_Setting_559;
   public final Setting<Integer> fd_Setting_560;
   private int fd_int_561;
   public final Setting<Integer> fd_Setting_562;
   public final Setting<SettingColor> fd_Setting_563;
   public final Setting<Boolean> fd_Setting_564;
   public final Setting<Boolean> fd_Setting_565;
   private final SettingGroup lLjIIlILjLLLjiiijJiLilJIiljlljJ;
   public final Setting<SettingColor> fd_Setting_566;
   public final Setting<Boolean> fd_Setting_567;
   public final Setting<Integer> fd_Setting_568;
   public final Setting<Boolean> fd_Setting_569;
   public final Setting<ShapeMode> fd_Setting_570;
   public final Setting<Boolean> fd_Setting_571;
   public final Setting<Boolean> pQQQqqPqQQppqqPppppQpqppQpqpQQQQpqPqQPPQqppqPQPQqppQPqqpPPpPqpPpQQQQqqqQQ;
   public final Setting<Boolean> fd_Setting_572;
   private double fd_double_573;

   private BlockPos findBreak() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      Iterator var1 = Utils.blockEntities().iterator();

      while(var1.hasNext()) {
         怀 怀 = (BlockEntity)var1.next();
         if (怀 instanceof BedBlockEntity) {
            怀 怀 = 怀.getPos();
            怀 怀 = Utils.vec3d(怀);
            怀 怀 = DamageUtils.bedDamage(怀.mc.player, 怀);
            怀 怀 = DamageUtils.bedDamage(怀.QPpqQqQPqQqpQpQQppQqqPPqPPPpQqqQqQPpQqppqppppqpPQQPPQQPPpPPPqQqQpPpQPpqqqQqPPqqPpPPppQQqQpPPQPQPqqQpqpQQPQPPpq, 怀);
            if (PlayerUtils.distanceTo(怀) <= (double)怀.mc.interactionManager.getReachDistance()) {
               怀 怀 = 怀.shouldPopOverride(怀.QPpqQqQPqQqpQpQQppQqqPPqPPPpQqqQqQPpQqppqppppqpPQQPPQQPPpPPPqQqQpPpQPpqqqQqPPqqPpPPppQQqQpPPQPQPqqQpqpQQPQPPpq, 怀, 怀);
               if (怀) {
                  if ((Boolean)怀.fd_Setting_539.get()) {
                     if (PlayerUtils.getTotalHealth() - 怀 > 0.0D) {
                        return 怀;
                     }

                     return null;
                  }

                  return 怀;
               }

               if (怀 <= (Double)怀.fd_Setting_549.get()) {
                  if ((Boolean)怀.fd_Setting_539.get()) {
                     if (PlayerUtils.getTotalHealth() - 怀 > 0.0D) {
                        return 怀;
                     }

                     return null;
                  }

                  return 怀;
               }

               return null;
            }
         }
      }

      return null;
   }

   private boolean placeBed(BlockPos 怀) {
      // $FF: Couldn't be decompiled
   }

   private void resetTrapVars() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀.fd_boolean_511 = false;
      怀.fd_boolean_542 = false;
      BedUtil2.LLijiiLLJjjJiJJiILlLLLJJLiIjllilIijlIJLLIljJLJJiJjiJIIi = null;
      BedUtil2.fd_BlockPos_587 = null;
   }

   private void breakBed(BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀 != null) {
         怀.fd_BlockPos_517 = null;
         if (怀.mc.world.getBlockState(怀).getBlock() instanceof BedBlock) {
            怀 怀 = 怀.mc.player.isSneaking();
            if (怀) {
               怀.mc.player.setSneaking(false);
            }

            Hand 怀;
            if (怀.qpPqpqQQqqQpqpQPqpqP.get() == BedAuraV3$BreakHand.fd_BreakHand_576) {
               怀 = Hand.MAIN_HAND;
            } else {
               怀 = Hand.OFF_HAND;
            }

            怀.mc.interactionManager.interactBlock(怀.mc.player, 怀, new BlockHitResult(怀.mc.player.getPos(), Direction.UP, 怀, false));
            怀.mc.player.setSneaking(怀);
         }
      }
   }

   @EventHandler
   private void onRender(Render3DEvent 怀) {
      // $FF: Couldn't be decompiled
   }

   public void onActivate() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀.fd_int_548 = 0;
      怀.fd_int_515 = 0;
      怀.fd_int_561 = (Integer)怀.fd_Setting_524.get();
      怀.QPpqQqQPqQqpQpQQppQqqPPqPPPpQqqQqQPpQqppqppppqpPQQPPQQPPpPPPqQqQpPpQPpqqqQqPPqqPpPPppQQqQpPPQPQPqqQpqpQQPQPPpq = null;
      怀.fd_boolean_533 = false;
      怀.fd_CardinalDirection_497 = CardinalDirection.North;
      怀.SssSsSSssSSssSsSSSssssSSSsSsssSSSssSSsSSssSssssSssssSssSsSSsSSssSSssSSssSSSsssSsSssS = sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.getItemFromSlot((Integer)怀.fd_Setting_568.get() - 1);
      if (怀.SssSsSSssSSssSsSSSssssSSSsSsssSSSssSSsSSssSssssSssssSssSsSSsSSssSSssSSssSSSsssSsSssS instanceof BedItem) {
         怀.SssSsSSssSSssSsSSSssssSSSsSsssSSSssSSsSSssSssssSssssSssSsSSsSSssSSssSSssSSSsssSsSssS = null;
      }

   }

   private void notify(String 怀) {
      // $FF: Couldn't be decompiled
   }

   @EventHandler
   private void onTick(Post 怀) {
      // $FF: Couldn't be decompiled
   }

   private boolean shouldPredict(PlayerEntity 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if ((Boolean)怀.sSsSssSSsSSSSssssSSsSssSSsSSssSSsssSssSSssSsssssSSSsssSssssssSSssSSsSsSssSSSsSSSSSsSsSsSSsSssSSSsssSsSssSSss.get() && 怀.getEquippedStack(EquipmentSlot.CHEST).getItem() == Items.ELYTRA) {
         return false;
      } else {
         return sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.isPlayerMoving(怀) && !sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.isInHole(怀);
      }
   }

   private BlockPos findPlace(PlayerEntity 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (!InvUtils.find((怀x) -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         return 怀x.getItem() instanceof BedItem;
      }).found()) {
         return null;
      } else {
         for(int 怀 = 0; 怀 < 3; ++怀) {
            怀 怀 = 怀 == 0 ? 1 : (怀 == 1 ? 0 : 2);
            CardinalDirection[] var4 = CardinalDirection.values();
            int var5 = var4.length;

            for(int var6 = 0; var6 < var5; ++var6) {
               怀 怀 = var4[var6];
               if (!(Boolean)怀.fd_Setting_559.get() || 怀.toDirection() == 怀.mc.player.getHorizontalFacing() || 怀.toDirection().getOpposite() == 怀.mc.player.getHorizontalFacing()) {
                  怀 怀 = 怀.getBlockPos().up(怀);
                  double 怀;
                  double 怀;
                  double 怀;
                  if ((Boolean)怀.fd_Setting_540.get() && 怀.shouldPredict(怀)) {
                     怀 = (double)Math.round(怀.getVelocity().x);
                     怀 = (double)Math.round(怀.getVelocity().y);
                     怀 = (double)Math.round(怀.getVelocity().z);
                     怀 = 怀.add(怀, 怀, 怀);
                  }

                  怀 = DamageUtils.bedDamage(怀.mc.player, Utils.vec3d(怀));
                  怀 = DamageUtils.bedDamage(怀.mc.player, Utils.vec3d(怀.offset(怀.toDirection())));
                  怀 = DamageUtils.bedDamage(怀, Utils.vec3d(怀));
                  怀.fd_double_573 = 怀;
                  怀 怀 = 怀.offset((怀.fd_CardinalDirection_497 = 怀).toDirection());
                  if (怀.mc.world.getBlockState(怀).getMaterial().isReplaceable() && BlockUtils.canPlace(怀.offset(怀.toDirection()))) {
                     怀 怀 = 怀.shouldPopOverride(怀, 怀, 怀);
                     if (怀) {
                        if ((Boolean)怀.fd_Setting_539.get()) {
                           if (PlayerUtils.getTotalHealth() - 怀 > 0.0D) {
                              return 怀;
                           }

                           return null;
                        }

                        return 怀;
                     }

                     if (怀 < (Double)怀.fd_Setting_521.get()) {
                        return null;
                     }

                     if (怀 > (Double)怀.fd_Setting_549.get() || 怀 > (Double)怀.fd_Setting_549.get()) {
                        return null;
                     }

                     if ((Boolean)怀.fd_Setting_539.get()) {
                        if (PlayerUtils.getTotalHealth() - 怀 > 0.0D) {
                           return 怀;
                        }

                        return null;
                     }
                  }
               }
            }
         }

         return null;
      }
   }

   public BedAuraV3() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super(Class68.fd_Category_1060, "bed-aura-v3", "Bed Aura v3");
      怀.jJljjjJllJJlIiIilJIjIilJljjIliiIJiILjJLLlL = 怀.settings.getDefaultGroup();
      怀.fd_SettingGroup_501 = 怀.settings.createGroup("HoleDelay");
      怀.fd_SettingGroup_502 = 怀.settings.createGroup("MovingDelay");
      怀.fd_SettingGroup_556 = 怀.settings.createGroup("Rotation");
      怀.fd_SettingGroup_553 = 怀.settings.createGroup("Targeting");
      怀.fd_SettingGroup_505 = 怀.settings.createGroup("PopOverride");
      怀.fd_SettingGroup_538 = 怀.settings.createGroup("Trap");
      怀.fd_SettingGroup_537 = 怀.settings.createGroup("Inventory");
      怀.fd_SettingGroup_529 = 怀.settings.createGroup("Automation");
      怀.fd_SettingGroup_514 = 怀.settings.createGroup("Safety");
      怀.fd_SettingGroup_495 = 怀.settings.createGroup("Pause");
      怀.lLjIIlILjLLLjiiijJiLilJIiljlljJ = 怀.settings.createGroup("Render");
      怀.fd_Setting_531 = 怀.jJljjjJllJJlIiIilJIjIilJljjIliiIJiILjJLLlL.add(((Builder)((Builder)((Builder)(new Builder()).name("debug")).description("Spam chat with shit you won't understand.")).defaultValue(false)).build());
      怀.fd_Setting_522 = 怀.jJljjjJllJJlIiIilJIjIilJljjIliiIJiILjJLLlL.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("delay")).description("The delay between placing beds in ticks.")).defaultValue(9)).min(0).sliderMax(20).build());
      怀.fd_Setting_559 = 怀.jJljjjJllJJlIiIilJIjIilJljjIliiIJiILjJLLlL.add(((Builder)((Builder)((Builder)(new Builder()).name("strict-direction")).description("Only places beds in the direction you are facing.")).defaultValue(false)).build());
      怀.qpPqpqQQqqQpqpQPqpqP = 怀.jJljjjJllJJlIiIilJIjIilJljjIliiIJiILjJLLlL.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("break-hand")).description("Which hand to break beds with.")).defaultValue(BedAuraV3$BreakHand.sSsssssSSsSssSsSSssSsSSSSSSsSSs)).build());
      怀.fd_Setting_543 = 怀.jJljjjJllJJlIiIilJIjIilJljjIliiIJiILjJLLlL.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("notification-mode")).description("How notifications are displayed.")).defaultValue(mode.fd_mode_881)).build());
      怀.fd_Setting_551 = 怀.fd_SettingGroup_501.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("place-delay-hole")).description("The delay between placing beds in ticks if the target is in a hole.")).defaultValue(9)).min(0).sliderMax(20).build());
      怀.fd_Setting_494 = 怀.fd_SettingGroup_501.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("place-delay-moving")).description("The delay between placing beds in ticks if the target is moving.")).defaultValue(7)).min(0).sliderMax(20).build());
      怀.fd_Setting_562 = 怀.fd_SettingGroup_502.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("break-delay-hole")).description("The delay between placing beds in ticks if the target is in a hole.")).defaultValue(9)).min(0).sliderMax(20).build());
      怀.fd_Setting_496 = 怀.fd_SettingGroup_502.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("break-delay-moving")).description("The delay between placing beds in ticks if the target is moving.")).defaultValue(7)).min(0).sliderMax(20).build());
      怀.LiJlilJiLiIlllljJJjjIljljiILllljJLjlIILjliiijJlilllllJJIiLLilJjLliiLljIIJijlJlJjLJJjIiiJJiLiJJIilLlLjLLIlJLLIiLjiLijjijiIj = 怀.fd_SettingGroup_556.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("block-rotations")).description("How to rotate on block place/break.")).defaultValue(Class8_Enum.fd_Class8_Enum_895)).build());
      怀.fd_Setting_544 = 怀.fd_SettingGroup_556.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("rotate-priority")).description("Rotation priority")).defaultValue(50)).min(1).sliderMax(100).max(100).build());
      怀.fd_Setting_540 = 怀.fd_SettingGroup_553.add(((Builder)((Builder)((Builder)(new Builder()).name("predict")).description("Predict where to place next.")).defaultValue(false)).build());
      怀.sSsSssSSsSSSSssssSSsSssSSsSSssSSsssSssSSssSsssssSSSsssSssssssSSssSSsSsSssSSSsSSSSSsSsSsSSsSssSSSsssSsSssSSss = 怀.fd_SettingGroup_553.add(((Builder)((Builder)((Builder)(new Builder()).name("ignore-elytra")).description("Ignore predict if you or the target is in an elytra.")).defaultValue(false)).build());
      怀.fd_Setting_499 = 怀.fd_SettingGroup_553.add(((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)(new meteordevelopment.meteorclient.settings.DoubleSetting.Builder()).name("target-range")).description("The range at which players can be targeted.")).defaultValue(4.0D).min(0.0D).sliderMax(5.0D).build());
      怀.fd_Setting_558 = 怀.fd_SettingGroup_553.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("target-priority")).description("How to filter the players to target.")).defaultValue(SortPriority.LowestHealth)).build());
      怀.fd_Setting_521 = 怀.fd_SettingGroup_553.add(((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)(new meteordevelopment.meteorclient.settings.DoubleSetting.Builder()).name("min-damage")).description("The minimum damage to inflict on your target.")).defaultValue(7.0D).min(0.0D).max(36.0D).sliderMax(36.0D).build());
      怀.fd_Setting_549 = 怀.fd_SettingGroup_553.add(((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)(new meteordevelopment.meteorclient.settings.DoubleSetting.Builder()).name("max-self-damage")).description("The maximum damage to inflict on yourself.")).defaultValue(7.0D).min(0.0D).max(36.0D).sliderMax(36.0D).build());
      怀.fd_Setting_539 = 怀.fd_SettingGroup_553.add(((Builder)((Builder)((Builder)(new Builder()).name("anti-suicide")).description("Will not place and break beds if they will kill you.")).defaultValue(true)).build());
      怀.fd_Setting_498 = 怀.fd_SettingGroup_505.add(((Builder)((Builder)((Builder)(new Builder()).name("pop-override")).description("Ignore max self damage if the target pops and you wont.")).defaultValue(false)).build());
      怀.fd_Setting_550 = 怀.fd_SettingGroup_505.add(((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)(new meteordevelopment.meteorclient.settings.DoubleSetting.Builder()).name("min-health")).description("How much health you must have.")).defaultValue(10.0D).min(1.0D).max(36.0D).sliderMax(36.0D).build());
      怀.fd_Setting_509 = 怀.fd_SettingGroup_505.add(((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)(new meteordevelopment.meteorclient.settings.DoubleSetting.Builder()).name("min-health-after")).description("How much health you must have after placing.")).defaultValue(6.0D).min(1.0D).max(36.0D).sliderMax(36.0D).build());
      怀.fd_Setting_555 = 怀.fd_SettingGroup_537.add(((Builder)((Builder)((Builder)(new Builder()).name("auto-move")).description("Moves beds into a selected hotbar slot.")).defaultValue(false)).build());
      SettingGroup var10001 = 怀.fd_SettingGroup_537;
      meteordevelopment.meteorclient.settings.IntSetting.Builder var10002 = ((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("auto-move-slot")).description("The slot auto move moves beds to.")).defaultValue(9)).min(1).max(9).sliderMin(1).sliderMax(9);
      Setting var10003 = 怀.fd_Setting_555;
      Objects.requireNonNull(var10003);
      怀.fd_Setting_568 = var10001.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)var10002.visible(var10003::get)).build());
      怀.fd_Setting_546 = 怀.fd_SettingGroup_537.add(((Builder)((Builder)((Builder)(new Builder()).name("auto-switch")).description("Switches to and from beds automatically.")).defaultValue(true)).build());
      怀.pQQQqqPqQQppqqPppppQpqppQpqpQQQQpqPqQPPQqppqPQPQqppQPqqpPPpPqpPpQQQQqqqQQ = 怀.fd_SettingGroup_537.add(((Builder)((Builder)((Builder)(new Builder()).name("restore-on-disable")).description("Put whatever was in your auto move slot back after disabling.")).defaultValue(true)).build());
      怀.fd_Setting_525 = 怀.fd_SettingGroup_537.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("min-beds")).description("How many beds are required in your inventory to place.")).defaultValue(2)).min(1).build());
      怀.fd_Setting_569 = 怀.fd_SettingGroup_538.add(((Builder)((Builder)((Builder)(new Builder()).name("auto-trap")).description("Prevent the target from escaping before placing beds.")).defaultValue(true)).build());
      怀.fd_Setting_557 = 怀.fd_SettingGroup_538.add(((Builder)((Builder)((Builder)(new Builder()).name("hole-only")).description("Only trap the target if they are in a hole.")).defaultValue(false)).build());
      怀.fd_Setting_513 = 怀.fd_SettingGroup_538.add(((Builder)((Builder)((Builder)(new Builder()).name("hold")).description("Wait for the target to be trapped before placing beds.")).defaultValue(false)).build());
      怀.fd_Setting_532 = 怀.fd_SettingGroup_538.add(((Builder)((Builder)((Builder)(new Builder()).name("bypass-on-no-obby")).description("Will place normally rather than stopping if you're out of obby.")).defaultValue(false)).build());
      怀.fd_Setting_504 = 怀.fd_SettingGroup_529.add(((Builder)((Builder)((Builder)(new Builder()).name("disable-on-no-beds")).description("Disable if you run out of beds.")).defaultValue(false)).build());
      怀.fd_Setting_506 = 怀.fd_SettingGroup_529.add(((Builder)((Builder)((Builder)(new Builder()).name("break-blocking-crystals")).description("Break crystals blocking bed placement.")).defaultValue(true)).build());
      怀.fd_Setting_524 = 怀.fd_SettingGroup_537.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("crystal-delay")).description("Delay in ticks between breaking crystals in the way of bed placements.")).defaultValue(2)).min(1).build());
      怀.fd_Setting_565 = 怀.fd_SettingGroup_529.add(((Builder)((Builder)((Builder)(new Builder()).name("break-self-trap")).description("Break target's self-trap automatically.")).defaultValue(true)).build());
      怀.fd_Setting_503 = 怀.fd_SettingGroup_529.add(((Builder)((Builder)((Builder)(new Builder()).name("randomize")).description("Break a random block from the target's self trap. Can improve success rate.")).defaultValue(false)).build());
      怀.fd_Setting_530 = 怀.fd_SettingGroup_553.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("mine-mode")).description("How to mine blocks.")).defaultValue(Class5_Enum.fd_Class5_Enum_888)).build());
      怀.fd_Setting_567 = 怀.fd_SettingGroup_529.add(((Builder)((Builder)((Builder)(new Builder()).name("break-burrow")).description("Break target's burrow automatically.")).defaultValue(true)).build());
      怀.fd_Setting_534 = 怀.fd_SettingGroup_529.add(((Builder)((Builder)((Builder)(new Builder()).name("break-web")).description("Break target's webs/string automatically.")).defaultValue(true)).build());
      怀.SsSsssSsSSssSSSsSSSssSSsssssssSsSssSssSssSSSssSssssSsssSsSSs = 怀.fd_SettingGroup_529.add(((Builder)((Builder)((Builder)(new Builder()).name("render-break")).description("Render mining self-trap/burrow.")).defaultValue(false)).build());
      怀.fd_Setting_570 = 怀.fd_SettingGroup_529.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("shape-mode")).description("How burrow blocks/webs are rendered.")).defaultValue(ShapeMode.Both)).build());
      怀.fd_Setting_545 = 怀.fd_SettingGroup_529.add(((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)(new meteordevelopment.meteorclient.settings.ColorSetting.Builder()).name("side-color-automation")).description("The side color.")).defaultValue(new SettingColor(156, 56, 56, 75))).build());
      怀.fd_Setting_523 = 怀.fd_SettingGroup_529.add(((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)(new meteordevelopment.meteorclient.settings.ColorSetting.Builder()).name("line-color-automation")).description("The line color.")).defaultValue(new SettingColor(156, 56, 56))).build());
      怀.fd_Setting_507 = 怀.fd_SettingGroup_514.add(((Builder)((Builder)((Builder)(new Builder()).name("disable-on-safety")).description("Disable BedAuraPlus when safety activates.")).defaultValue(true)).build());
      怀.fd_Setting_500 = 怀.fd_SettingGroup_514.add(((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)(new meteordevelopment.meteorclient.settings.DoubleSetting.Builder()).name("safety-hp")).description("What health safety activates at.")).defaultValue(10.0D).min(1.0D).max(36.0D).sliderMax(36.0D).build());
      怀.fd_Setting_572 = 怀.fd_SettingGroup_514.add(((Builder)((Builder)((Builder)(new Builder()).name("swap-to-gap")).description("Swap to egaps after activating safety.")).defaultValue(false)).build());
      怀.fd_Setting_510 = 怀.fd_SettingGroup_514.add(((Builder)((Builder)((Builder)(new Builder()).name("rage")).description("Ignore safety if your current target will pop with the next placement.")).defaultValue(false)).build());
      怀.fd_Setting_536 = 怀.fd_SettingGroup_495.add(((Builder)((Builder)((Builder)(new Builder()).name("pause-on-eat")).description("Pauses while eating.")).defaultValue(true)).build());
      怀.fd_Setting_571 = 怀.fd_SettingGroup_495.add(((Builder)((Builder)((Builder)(new Builder()).name("pause-on-drink")).description("Pauses while drinking.")).defaultValue(true)).build());
      怀.fd_Setting_541 = 怀.fd_SettingGroup_495.add(((Builder)((Builder)((Builder)(new Builder()).name("pause-on-mine")).description("Pauses while mining.")).defaultValue(true)).build());
      怀.fd_Setting_564 = 怀.fd_SettingGroup_495.add(((Builder)((Builder)((Builder)(new Builder()).name("pause-on-ca")).description("Pause while Crystal Aura is active.")).defaultValue(false)).build());
      怀.fd_Setting_527 = 怀.fd_SettingGroup_495.add(((Builder)((Builder)((Builder)(new Builder()).name("pause-on-crafting")).description("Pauses while you're in a crafting table.")).defaultValue(false)).build());
      怀.lJJJijlliJjIIlJLllJiILLLLlLJiLLl = 怀.lLjIIlILjLLLjiiijJiLilJIiljlljJ.add(((Builder)((Builder)((Builder)(new Builder()).name("render-swing")).description("Render hand swings")).defaultValue(true)).build());
      怀.fd_Setting_516 = 怀.lLjIIlILjLLLjiiijJiLilJIiljlljJ.add(((Builder)((Builder)((Builder)(new Builder()).name("render-beds")).description("Render bed placement.")).defaultValue(true)).build());
      怀.fd_Setting_518 = 怀.lLjIIlILjLLLjiiijJiLilJIiljlljJ.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("shape-mode")).description("How bed placements are rendered.")).defaultValue(ShapeMode.Both)).build());
      怀.ssSsSSssSSsSSsSsSsSsSssssSSsSSssSSSSsSSSsSSsssSs = 怀.lLjIIlILjLLLjiiijJiLilJIiljlljJ.add(((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)(new meteordevelopment.meteorclient.settings.ColorSetting.Builder()).name("side-color")).description("The side color.")).defaultValue(new SettingColor(114, 11, 135, 75))).build());
      怀.fd_Setting_554 = 怀.lLjIIlILjLLLjiiijJiLilJIiljlljJ.add(((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)(new meteordevelopment.meteorclient.settings.ColorSetting.Builder()).name("line-color")).description("The line color.")).defaultValue(new SettingColor(114, 11, 135))).build());
      怀.fd_Setting_535 = 怀.lLjIIlILjLLLjiiijJiLilJIiljlljJ.add(((Builder)((Builder)((Builder)(new Builder()).name("render-pops")).description("Use a different color for beds that will pop the target.")).defaultValue(true)).build());
      怀.fd_Setting_566 = 怀.lLjIIlILjLLLjiiijJiLilJIiljlljJ.add(((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)(new meteordevelopment.meteorclient.settings.ColorSetting.Builder()).name("side-color-pop")).description("The side color.")).defaultValue(new SettingColor(156, 56, 56, 75))).build());
      怀.fd_Setting_563 = 怀.lLjIIlILjLLLjiiijJiLilJIiljlljJ.add(((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)(new meteordevelopment.meteorclient.settings.ColorSetting.Builder()).name("line-color-pop")).description("The line color.")).defaultValue(new SettingColor(156, 56, 56))).build());
      怀.fd_Setting_512 = 怀.lLjIIlILjLLLjiiijJiLilJIiljlljJ.add(((Builder)((Builder)((Builder)(new Builder()).name("render-damage")).description("Render bed damage.")).defaultValue(true)).build());
      怀.fd_Setting_528 = 怀.lLjIIlILjLLLjiiijJiLilJIiljlljJ.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("render-mode")).description("Where to render bed damage.")).defaultValue(BedAuraV3$RenderMode.fd_RenderMode_578)).build());
      怀.fd_Setting_560 = 怀.lLjIIlILjLLLjiiijJiLilJIiljlljJ.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("round-damage")).description("Round damage to x decimal places.")).defaultValue(2)).min(0).max(3).sliderMax(3).build());
      怀.fd_Setting_547 = 怀.lLjIIlILjLLLjiiijJiLilJIiljlljJ.add(((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)(new meteordevelopment.meteorclient.settings.DoubleSetting.Builder()).name("damage-scale")).description("The scale of the damage text.")).defaultValue(1.4D).min(0.0D).max(5.0D).sliderMax(5.0D).build());
      怀.fd_Setting_520 = 怀.lLjIIlILjLLLjiiijJiLilJIiljlljJ.add(((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)(new meteordevelopment.meteorclient.settings.ColorSetting.Builder()).name("damage-color")).description("The color of the damage text.")).defaultValue(new SettingColor(15, 255, 211))).build());
   }

   private boolean shouldPopOverride(PlayerEntity 怀, double 怀, double 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (!(Boolean)怀.fd_Setting_498.get()) {
         return false;
      } else if (PlayerUtils.getTotalHealth() < (Double)怀.fd_Setting_550.get()) {
         return false;
      } else {
         怀 怀 = (double)EntityUtils.getTotalHealth(怀) - 怀;
         怀 怀 = PlayerUtils.getTotalHealth() - 怀;
         return 怀 <= 0.0D && 怀 >= (Double)怀.fd_Setting_509.get();
      }
   }

   public String getInfoString() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return EntityUtils.getName(怀.QPpqQqQPqQqpQpQQppQqqPPqPPPpQqqQqQPpQqppqppppqpPQQPPQQPPpPPPqQqQpPpQPpqqqQqPPqqPpPPppQQqQpPPQPQPqqQpqpQQPQPPpq);
   }

   @EventHandler
   private void onRender2D(Render2DEvent 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if ((Boolean)怀.fd_Setting_512.get() && 怀.fd_BlockPos_519 != null && 怀.fd_BlockPos_517 == null) {
         BlockPos 怀;
         if (怀.fd_Setting_528.get() == BedAuraV3$RenderMode.fd_RenderMode_578) {
            怀 = 怀.fd_BlockPos_519.offset(怀.fd_CardinalDirection_497.toDirection().getOpposite());
         } else {
            怀 = 怀.fd_BlockPos_519;
         }

         怀 怀 = 怀.getX();
         怀 怀 = 怀.getY();
         怀 怀 = 怀.getZ();
         怀 怀 = new Vec3();
         怀.set((double)怀, (double)怀, (double)怀);
         if (NametagUtils.to2D(怀, (Double)怀.fd_Setting_547.get())) {
            NametagUtils.begin(怀);
            TextRenderer.get().begin(1.0D, false, true);
            怀 怀 = 怀.fd_double_573;
            怀 怀 = "0";
            switch((Integer)怀.fd_Setting_560.get()) {
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
            TextRenderer.get().render(怀, -怀, 0.0D, (Color)怀.fd_Setting_520.get());
            TextRenderer.get().end();
            NametagUtils.end();
         }
      }

   }

   public void onDeactivate() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      FindItemResult 怀;
      if (怀.fd_boolean_533) {
         怀.notify("Your health is too low.");
         if ((Boolean)怀.fd_Setting_572.get()) {
            怀 = Class46.findEgap();
            if (怀.found()) {
               怀.mc.player.getInventory().selectedSlot = 怀.slot();
            }
         }
      }

      if (!怀.fd_boolean_533 && (Boolean)怀.pQQQqqPqQQppqqPppppQpqppQpqpQQQQpqPqQPPQqppqPQPQqppQPqqpPPpPqpPpQQQQqqqQQ.get() && 怀.SssSsSSssSSssSsSSSssssSSSsSsssSSSssSSsSSssSssssSssssSssSsSSsSSssSSssSSssSSSsssSsSssS != null) {
         怀 = InvUtils.find(new Item[]{怀.SssSsSSssSSssSsSSSssssSSSsSsssSSSssSSsSSssSssssSssssSssSsSSsSSssSSssSSssSSSsssSsSssS});
         if (怀.found()) {
            InvUtils.move().from(怀.slot()).toHotbar((Integer)怀.fd_Setting_568.get() - 1);
         }
      }

   }
}
