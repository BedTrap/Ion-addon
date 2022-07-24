/* Decompiler 39ms, total 224ms, lines 316 */
package me.ghosttypes.ion.modules.combat;

import me.ghosttypes.ion.modules.render.Notifications.mode;
import me.ghosttypes.ion.utils.Class68;
import me.ghosttypes.ion.utils.sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS;
import me.ghosttypes.ion.utils.combat.Class11;
import me.ghosttypes.ion.utils.combat.Class5_Enum;
import me.ghosttypes.ion.utils.combat.Class8_Enum;
import me.ghosttypes.ion.utils.player.Class44;
import me.ghosttypes.ion.utils.player.Class46;
import me.ghosttypes.ion.utils.world.Class57;
import me.ghosttypes.ion.utils.world.Class66;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent.Post;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.IntSetting.Builder;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.entity.SortPriority;
import meteordevelopment.meteorclient.utils.entity.TargetUtils;
import meteordevelopment.meteorclient.utils.player.FindItemResult;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.meteorclient.utils.world.BlockUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.RaycastContext;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.class_240;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.class_2847;
import net.minecraft.world.RaycastContext.class_242;
import net.minecraft.world.RaycastContext.class_3960;

public class AutoCityPlus extends Module {
   private final Setting<Integer> pPqPQQQqQppqPQQpqPqpqqQQQqPpQPQQQqPPPqPpqqqPpPPqpQQPqpppQqpQQpqqqpppPqPqpqpPpPqppPpqpPqPQqqQppqppQQQppPqPpQPQPpqQPqp;
   private final SettingGroup fd_SettingGroup_192;
   private int fd_int_193;
   private int fd_int_194;
   private boolean fd_boolean_195;
   private PlayerEntity fd_PlayerEntity_196;
   private final SettingGroup fd_SettingGroup_197;
   private final Setting<Boolean> fd_Setting_198;
   private boolean fd_boolean_199;
   private final Setting<Boolean> fd_Setting_200;
   public final Setting<Class5_Enum> fd_Setting_201;
   public final Setting<Class8_Enum> QPpqPQpqQqqqQQqPPqPQqqPppQPPPPqQQQPQQQpQqqppQqPPpQqqqQpQpqqppqQqP;
   private int fd_int_202;
   private BlockPos fd_BlockPos_203;
   private FindItemResult fd_FindItemResult_204;
   private boolean fd_boolean_205;
   private final Setting<Boolean> fd_Setting_206;
   private final Setting<Boolean> ssSssssssSSsssSSSssSsssssSSSsSssssssSssSsssSSsSsSSSSsSSSsSsSs;
   private final Setting<SettingColor> fd_Setting_207;
   private boolean fd_boolean_208;
   private final SettingGroup fd_SettingGroup_209;
   private final Setting<mode> fd_Setting_210;
   private final Setting<Double> fd_Setting_211;
   private final Setting<SettingColor> fd_Setting_212;
   public final Setting<Integer> fd_Setting_213;
   private final Setting<Boolean> fd_Setting_214;
   private final SettingGroup fd_SettingGroup_215;
   private final Setting<Integer> fd_Setting_216;
   private final Setting<ShapeMode> fd_Setting_217;
   private final Setting<Boolean> fd_Setting_218;
   private boolean fd_boolean_219;

   @EventHandler
   private void onRender(Render3DEvent 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if ((Boolean)怀.fd_Setting_214.get() && 怀.fd_BlockPos_203 != null) {
         怀.renderer.box(怀.fd_BlockPos_203, (Color)怀.fd_Setting_207.get(), (Color)怀.fd_Setting_212.get(), (ShapeMode)怀.fd_Setting_217.get(), 0);
      }

   }

   public AutoCityPlus() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super(Class68.fd_Category_1060, "auto-city-plus", "Auto city but better.");
      怀.fd_SettingGroup_197 = 怀.settings.getDefaultGroup();
      怀.fd_SettingGroup_209 = 怀.settings.createGroup("Rotation");
      怀.fd_SettingGroup_192 = 怀.settings.createGroup("SurroundBreak");
      怀.fd_SettingGroup_215 = 怀.settings.createGroup("Render");
      怀.pPqPQQQqQppqPQQpqPqpqqQQQqPpQPQQQqPPPqPpqqqPpPPqpQQPqpppQqpQQpqqqpppPqPqpqpPpPqppPpqpPqPQqqQppqppQQQppPqPpQPQPpqQPqp = 怀.fd_SettingGroup_197.add(((Builder)((Builder)((Builder)(new Builder()).name("delay")).description("The delay between city attempts.")).defaultValue(10)).min(0).sliderMax(50).build());
      怀.fd_Setting_211 = 怀.fd_SettingGroup_197.add(((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)(new meteordevelopment.meteorclient.settings.DoubleSetting.Builder()).name("range")).description("The maximum range to check for a city block.")).defaultValue(5.0D).min(0.0D).sliderMax(20.0D).build());
      怀.fd_Setting_200 = 怀.fd_SettingGroup_197.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("support")).description("Place a block below the city block if needed.")).defaultValue(true)).build());
      怀.fd_Setting_218 = 怀.fd_SettingGroup_197.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("instant")).description("Insta mines the city block if it's replaced by the target.")).defaultValue(false)).build());
      怀.fd_Setting_201 = 怀.fd_SettingGroup_197.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("mine-mode")).description("How to mine blocks.")).defaultValue(Class5_Enum.fd_Class5_Enum_888)).build());
      怀.ssSssssssSSsssSSSssSsssssSSSsSssssssSssSsssSSsSsSSSSsSSSsSsSs = 怀.fd_SettingGroup_197.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("randomize")).description("Randomize the block being mined each time.")).defaultValue(true)).build());
      怀.fd_Setting_198 = 怀.fd_SettingGroup_197.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("disable-after")).description("Disable after the first city attempt.")).defaultValue(true)).build());
      怀.fd_Setting_210 = 怀.fd_SettingGroup_197.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("notification-mode")).description("How notifications are displayed.")).defaultValue(mode.fd_mode_881)).build());
      怀.QPpqPQpqQqqqQQqPPqPQqqPppQPPPPqQQQPQQQpQqqppQqPPpQqqqQpQpqqppqQqP = 怀.fd_SettingGroup_209.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("block-rotations")).description("How to rotate on block place/break.")).defaultValue(Class8_Enum.fd_Class8_Enum_895)).build());
      怀.fd_Setting_213 = 怀.fd_SettingGroup_209.add(((Builder)((Builder)((Builder)(new Builder()).name("rotate-priority")).description("Rotation priority")).defaultValue(50)).min(1).sliderMax(100).max(100).build());
      怀.fd_Setting_206 = 怀.fd_SettingGroup_192.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("place-crystal-inside")).description("Place a crystal after the surround is mined.")).defaultValue(false)).build());
      怀.fd_Setting_216 = 怀.fd_SettingGroup_192.add(((Builder)((Builder)((Builder)(new Builder()).name("city-hold-time")).description("How long to wait before disabling auto city.")).defaultValue(10)).min(0).sliderMax(50).build());
      怀.fd_Setting_214 = 怀.fd_SettingGroup_215.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("render")).description("Renders the current block being mined.")).defaultValue(true)).build());
      怀.fd_Setting_217 = 怀.fd_SettingGroup_215.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("shape-mode")).description("How the shapes are rendered.")).defaultValue(ShapeMode.Both)).build());
      怀.fd_Setting_207 = 怀.fd_SettingGroup_215.add(((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)(new meteordevelopment.meteorclient.settings.ColorSetting.Builder()).name("side-color")).description("The side color.")).defaultValue(new SettingColor(15, 255, 211, 75))).build());
      怀.fd_Setting_212 = 怀.fd_SettingGroup_215.add(((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)(new meteordevelopment.meteorclient.settings.ColorSetting.Builder()).name("line-color")).description("The line color.")).defaultValue(new SettingColor(15, 255, 211))).build());
   }

   private boolean needsSupport() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = 怀.fd_BlockPos_203.down();
      return Class57.getBlock(怀) != Blocks.OBSIDIAN || Class57.getBlock(怀) != Blocks.BEDROCK;
   }

   private void notify(String 怀) {
      // $FF: Couldn't be decompiled
   }

   private boolean outOfRange() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return MathHelper.sqrt((float)怀.mc.player.squaredDistanceTo((double)怀.fd_BlockPos_203.getX(), (double)怀.fd_BlockPos_203.getY(), (double)怀.fd_BlockPos_203.getZ())) > 怀.mc.interactionManager.getReachDistance();
   }

   public void onActivate() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      Class66.moduleAuth();
      怀.fd_PlayerEntity_196 = null;
      怀.fd_BlockPos_203 = null;
      怀.fd_int_202 = 0;
      怀.fd_int_193 = 0;
      怀.fd_int_194 = (Integer)怀.fd_Setting_216.get();
      怀.fd_boolean_205 = false;
      怀.fd_boolean_195 = false;
      怀 怀 = false;
      怀.fd_boolean_219 = false;
      怀.fd_boolean_199 = false;
      怀.fd_boolean_208 = false;
      怀.fd_FindItemResult_204 = Class46.findPick();
      if (!怀.fd_FindItemResult_204.found()) {
         怀.notify("No pickaxe in hotbar.");
         怀.toggle();
      }

   }

   private Direction getDirection(BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = new Vec3d(怀.mc.player.getX(), 怀.mc.player.getY() + (double)怀.mc.player.getEyeHeight(怀.mc.player.getPose()), 怀.mc.player.getZ());
      Direction[] var3 = Direction.values();
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         怀 怀 = var3[var5];
         怀 怀 = new RaycastContext(怀, new Vec3d((double)怀.getX() + 0.5D + (double)怀.getVector().getX() * 0.5D, (double)怀.getY() + 0.5D + (double)怀.getVector().getY() * 0.5D, (double)怀.getZ() + 0.5D + (double)怀.getVector().getZ() * 0.5D), class_3960.COLLIDER, class_242.NONE, 怀.mc.player);
         怀 怀 = 怀.mc.world.raycast(怀);
         if (怀 != null && 怀.getType() == class_240.BLOCK && 怀.getBlockPos().equals(怀)) {
            return 怀;
         }
      }

      if ((double)怀.getY() > 怀.y) {
         return Direction.DOWN;
      } else {
         return Direction.UP;
      }
   }

   private void mine(BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (!(Boolean)怀.fd_Setting_218.get()) {
         怀.mc.getNetworkHandler().sendPacket(new PlayerActionC2SPacket(class_2847.START_DESTROY_BLOCK, 怀, Direction.UP));
      }

      怀.mc.player.swingHand(Hand.MAIN_HAND);
      怀.mc.getNetworkHandler().sendPacket(new PlayerActionC2SPacket(class_2847.STOP_DESTROY_BLOCK, 怀, Direction.UP));
   }

   @EventHandler
   private void onTick(Post 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (!Class11.fd_boolean_899) {
         怀.fd_PlayerEntity_196 = TargetUtils.getPlayerTarget((Double)怀.fd_Setting_211.get(), SortPriority.ClosestAngle);
         if (怀.fd_PlayerEntity_196 == null) {
            怀.notify("No target in range.");
            怀.toggle();
         } else {
            if (Class44.canCrystal(怀.fd_PlayerEntity_196) && 怀.fd_BlockPos_203 != null && (Boolean)怀.fd_Setting_206.get()) {
               怀.placeCrystal(怀.fd_BlockPos_203.down());
            }

            if (怀.fd_BlockPos_203 == null) {
               怀.fd_boolean_195 = false;
               怀.fd_BlockPos_203 = Class57.getCityBlock(怀.fd_PlayerEntity_196, (Boolean)怀.ssSssssssSSsssSSSssSsssssSSSsSssssssSssSsssSSsSsSSSSsSSSsSsSs.get());
            }

            if (怀.fd_BlockPos_203 == null) {
               if (!怀.fd_boolean_219) {
                  怀.notify("No city block available.");
                  怀.fd_boolean_219 = true;
               }

               if (怀.fd_int_194 <= 0) {
                  怀.toggle();
               } else {
                  --怀.fd_int_194;
               }

            } else {
               if (怀.fd_boolean_219) {
                  怀.fd_boolean_219 = false;
               }

               if (怀.outOfRange()) {
                  怀.notify("City block is unreachable.");
                  怀.toggle();
               } else {
                  if (!Class44.isSurroundBlock(怀.fd_BlockPos_203)) {
                     怀.fd_BlockPos_203 = null;
                     怀.fd_int_202 = (Integer)怀.pPqPQQQqQppqPQQpqPqpqqQQQqPpQPQQQqPPPqPpqqqPpPPqpQQPqpppQqpQQpqqqpppPqPqpqpPpPqppPpqpPqPQqqQppqppQQQppPqPpQPQPpqQPqp.get();
                     怀.fd_int_193 = 0;
                     怀.fd_boolean_205 = false;
                     怀.fd_boolean_199 = false;
                     Class11.syncSlot();
                     if ((Boolean)怀.fd_Setting_198.get()) {
                        怀.notify("City complete, disabling.");
                        怀.toggle();
                     }
                  }

                  if (怀.fd_boolean_205) {
                     ++怀.fd_int_193;
                  }

                  if (怀.fd_int_202 > 0) {
                     --怀.fd_int_202;
                  } else {
                     if ((Boolean)怀.fd_Setting_200.get() && 怀.needsSupport() && !怀.fd_boolean_195) {
                        怀.placeSupport();
                     }

                     if (怀.fd_boolean_199) {
                        sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.updateSlot(怀.fd_FindItemResult_204.slot());
                     }

                     if (!怀.fd_boolean_205 || 怀.fd_boolean_199) {
                        怀.fd_boolean_205 = true;
                        if (!怀.fd_boolean_208) {
                           怀.notify("Citying " + 怀.fd_PlayerEntity_196.getEntityName() + ".");
                           怀.fd_boolean_208 = true;
                        }

                        怀 怀 = 怀.QPpqPQpqQqqqQQqPPqPQqqPppQPPPPqQQQPQQQpQqqppQqPPpQqqqQpQpqqppqQqP.get() == Class8_Enum.fd_Class8_Enum_892 || 怀.QPpqPQpqQqqqQQqPPqPQqqPppQPPPPqQQQPQQQpQqqppQqPPpQqqqQpQpqqppqQqP.get() == Class8_Enum.fd_Class8_Enum_893;
                        if (怀.fd_Setting_201.get() != Class5_Enum.fd_Class5_Enum_886) {
                           Class11.handlePacketMine(怀.fd_BlockPos_203, (Class5_Enum)怀.fd_Setting_201.get(), 怀, (Integer)怀.fd_Setting_213.get());
                        } else {
                           Class44.doRegularMine(怀.fd_BlockPos_203, 怀, (Integer)怀.fd_Setting_213.get());
                           if (!怀.fd_boolean_199) {
                              怀.fd_boolean_199 = true;
                           }
                        }
                     }

                  }
               }
            }
         }
      }
   }

   private void placeCrystal(BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = InvUtils.findInHotbar(new Item[]{Items.END_CRYSTAL});
      Hand 怀;
      if (怀.mc.player.getOffHandStack().getItem() == Items.END_CRYSTAL) {
         怀 = Hand.OFF_HAND;
      } else {
         怀 = Hand.MAIN_HAND;
      }

      if (怀 != Hand.MAIN_HAND || 怀.found()) {
         if (怀 == Hand.MAIN_HAND) {
            sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.updateSlot(怀.slot());
         }

         怀.mc.player.networkHandler.sendPacket(new PlayerInteractBlockC2SPacket(怀, new BlockHitResult(怀.mc.player.getPos(), 怀.getDirection(怀), 怀, false), 0));
         sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.swingHand(怀 != Hand.MAIN_HAND);
      }
   }

   private void placeSupport() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀.fd_boolean_195 = true;
      怀 怀 = InvUtils.findInHotbar(new Item[]{Items.OBSIDIAN});
      怀 怀 = 怀.fd_BlockPos_203.down();
      if (!BlockUtils.canPlace(怀) && Class57.getBlock(怀) != Blocks.OBSIDIAN && Class57.getBlock(怀) != Blocks.BEDROCK) {
         怀.notify("Couldn't place support block, mining anyway.");
      } else if (!怀.found()) {
         怀.notify("No obsidian found for support, mining anyway.");
      } else if (怀.QPpqPQpqQqqqQQqPPqPQqqPppQPPPPqQQQPQQQpQqqppQqPPpQqqqQpQpqqppqQqP.get() != Class8_Enum.fd_Class8_Enum_892 && 怀.QPpqPQpqQqqqQQqPPqPQqqPppQPPPPqQQQPQQQpQqqppQqPPpQqqqQpQpqqppqQqP.get() != Class8_Enum.fd_Class8_Enum_896) {
         BlockUtils.place(怀, 怀, false, 0, true);
      } else {
         BlockUtils.place(怀, 怀, true, (Integer)怀.fd_Setting_213.get(), true);
      }

   }

   public String getInfoString() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return 怀.fd_PlayerEntity_196 != null ? 怀.fd_PlayerEntity_196.getEntityName() : null;
   }
}
