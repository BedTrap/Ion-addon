/* Decompiler 109ms, total 381ms, lines 405 */
package me.ghosttypes.ion.modules.combat.bedaura;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import me.ghosttypes.ion.modules.combat.bedaura.BedAuraV2.DamageCalc;
import me.ghosttypes.ion.utils.sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS;
import me.ghosttypes.ion.utils.player.Class44;
import me.ghosttypes.ion.utils.world.Class57;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.utils.Utils;
import meteordevelopment.meteorclient.utils.player.ChatUtils;
import meteordevelopment.meteorclient.utils.player.DamageUtils;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.world.BlockUtils;
import meteordevelopment.meteorclient.utils.world.CardinalDirection;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BedItem;
import net.minecraft.item.Items;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class BedUtil {
   public static ArrayList<Vec3d> fd_ArrayList_581;
   public static BlockPos fd_BlockPos_582;
   public static Executor fd_Executor_583;
   public static BlockPos fd_BlockPos_584;
   public static BlockPos fd_BlockPos_585;

   public static boolean shouldMineTrapBlock(PlayerEntity 怀, BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = (BedAuraV2)Modules.get().get(BedAuraV2.class);

      for(int 怀 = 0; 怀 < 3; ++怀) {
         怀 怀 = 怀 == 0 ? 1 : (怀 == 1 ? 0 : 2);
         CardinalDirection[] var5 = CardinalDirection.values();
         int var6 = var5.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            怀 怀 = var5[var7];
            if (!(Boolean)怀.fd_Setting_461.get() || 怀.toDirection() == MeteorClient.mc.player.getHorizontalFacing() || 怀.toDirection().getOpposite() == MeteorClient.mc.player.getHorizontalFacing()) {
               怀 怀 = 怀.getBlockPos().up(怀);
               怀 怀 = 怀.offset(怀.toDirection());
               if (怀.equals(怀)) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public static Boolean shouldBypassSelfDmg(double 怀, double 怀, double 怀, double 怀, double 怀, boolean 怀, boolean 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (!怀) {
         return false;
      } else {
         怀 怀 = (BedAuraV2)Modules.get().get(BedAuraV2.class);
         怀 怀 = (Double)怀.QqqpQqQpqQPpqQQqpPpQQqPQqQpqqPPpppqppPPqQPQQPqqqqPqqQpq.get();
         怀 怀 = (Double)怀.fd_Setting_418.get();
         怀 怀 = false;
         if (怀 - 怀 <= 0.0D && 怀 >= 怀 && 怀 - 怀 >= 怀 && 怀 - 怀 >= 怀) {
            怀 = !怀 || PlayerUtils.getTotalHealth() - 怀 > 0.0D;
         }

         return 怀;
      }
   }

   public static boolean isValidTrapBlock(BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return 怀 == null ? false : Class44.isTrapBlock(怀);
   }

   public static BlockPos findPlace(PlayerEntity 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (!InvUtils.find((怀x) -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         return 怀x.getItem() instanceof BedItem;
      }).found()) {
         return null;
      } else {
         怀 怀 = (BedAuraV2)Modules.get().get(BedAuraV2.class);
         if ((Boolean)怀.fd_Setting_447.get()) {
            ChatUtils.info("findPlace debug", new Object[0]);
         }

         怀 怀 = (Double)怀.fd_Setting_425.get();
         怀 怀 = (Double)怀.fd_Setting_444.get();
         怀 怀 = (Boolean)怀.fd_Setting_480.get();
         怀 怀 = (Boolean)怀.fd_Setting_483.get();

         for(int 怀 = 0; 怀 < 3; ++怀) {
            怀 怀 = 怀 == 0 ? 1 : (怀 == 1 ? 0 : 2);
            CardinalDirection[] var10 = CardinalDirection.values();
            int var11 = var10.length;

            for(int var12 = 0; var12 < var11; ++var12) {
               怀 怀 = var10[var12];
               if (!(Boolean)怀.fd_Setting_461.get() || 怀.toDirection() == MeteorClient.mc.player.getHorizontalFacing() || 怀.toDirection().getOpposite() == MeteorClient.mc.player.getHorizontalFacing()) {
                  怀 怀 = 怀.getBlockPos().up(怀);
                  int var21;
                  if ((Boolean)怀.fd_Setting_447.get()) {
                     var21 = 怀.getX();
                     ChatUtils.info("checking place pos at " + var21 + "," + 怀.getY() + "," + 怀.getZ(), new Object[0]);
                  }

                  if ((Boolean)怀.fd_Setting_447.get()) {
                     ChatUtils.info("checking if we should predict movement", new Object[0]);
                  }

                  double 怀;
                  double 怀;
                  double 怀;
                  if ((Boolean)怀.fd_Setting_427.get() && shouldPredict(怀)) {
                     if ((Boolean)怀.fd_Setting_447.get()) {
                        ChatUtils.info("we should, calculating predict pos", new Object[0]);
                     }

                     怀 = (double)Math.round(怀.getVelocity().x);
                     怀 = (double)Math.round(怀.getVelocity().y);
                     怀 = (double)Math.round(怀.getVelocity().z);
                     怀 = 怀.add(怀, 怀, 怀);
                     if ((Boolean)怀.fd_Setting_447.get()) {
                        var21 = 怀.getX();
                        ChatUtils.info("predicting next position to " + var21 + "," + 怀.getY() + "," + 怀.getZ(), new Object[0]);
                     }
                  }

                  if ((Boolean)怀.fd_Setting_447.get()) {
                     ChatUtils.info("checking if we can place", new Object[0]);
                  }

                  if (!canPlace(怀, 怀)) {
                     return null;
                  }

                  if ((Boolean)怀.fd_Setting_447.get()) {
                     ChatUtils.info("we can place", new Object[0]);
                  }

                  怀 = DamageUtils.bedDamage(MeteorClient.mc.player, Utils.vec3d(怀));
                  怀 = DamageUtils.bedDamage(MeteorClient.mc.player, Utils.vec3d(怀.offset(怀.toDirection())));
                  怀 = DamageUtils.bedDamage(怀, Utils.vec3d(怀));
                  if ((Boolean)怀.fd_Setting_447.get()) {
                     ChatUtils.info("Self damage: " + 怀 + " | Target damage: " + 怀, new Object[0]);
                  }

                  if ((Boolean)怀.fd_Setting_447.get()) {
                     ChatUtils.info("damageCheck running", new Object[0]);
                  }

                  if (damageCheck(怀, 怀, 怀, 怀, 怀, 怀, 怀, 怀)) {
                     if ((Boolean)怀.fd_Setting_447.get()) {
                        ChatUtils.info("position is valid, setting nextDamage and returning centerPos offset", new Object[0]);
                     }

                     怀.fd_double_477 = 怀;
                     return 怀.offset((怀.fd_CardinalDirection_479 = 怀).toDirection());
                  }
               }
            }
         }

         return null;
      }
   }

   public static boolean shouldPredict(PlayerEntity 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = (BedAuraV2)Modules.get().get(BedAuraV2.class);
      if ((Boolean)怀.fd_Setting_428.get() && 怀.getEquippedStack(EquipmentSlot.CHEST).getItem() == Items.ELYTRA) {
         return false;
      } else {
         return !sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.isInHole(怀);
      }
   }

   public static void calcPlaceForY(PlayerEntity 怀, int 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (fd_BlockPos_582 == null) {
         怀 怀 = (BedAuraV2)Modules.get().get(BedAuraV2.class);
         if ((Boolean)怀.fd_Setting_447.get()) {
            ChatUtils.info("calcPlaceForY " + 怀 + " running", new Object[0]);
         }

         怀 怀 = (Double)怀.fd_Setting_425.get();
         怀 怀 = (Double)怀.fd_Setting_444.get();
         怀 怀 = (Boolean)怀.fd_Setting_480.get();
         怀 怀 = (Boolean)怀.fd_Setting_483.get();
         if (InvUtils.find((怀x) -> {
            String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
            return 怀x.getItem() instanceof BedItem;
         }).found()) {
            CardinalDirection[] var9 = CardinalDirection.values();
            int var10 = var9.length;

            for(int var11 = 0; var11 < var10; ++var11) {
               怀 怀 = var9[var11];
               if (!(Boolean)怀.fd_Setting_461.get() || 怀.toDirection() == MeteorClient.mc.player.getHorizontalFacing() || 怀.toDirection().getOpposite() == MeteorClient.mc.player.getHorizontalFacing()) {
                  怀 怀 = 怀.getBlockPos().up(怀);
                  if ((Boolean)怀.fd_Setting_447.get()) {
                     int var20 = 怀.getX();
                     ChatUtils.info("centerPos is " + var20 + "," + 怀.getY() + "," + 怀.getZ(), new Object[0]);
                  }

                  double 怀;
                  double 怀;
                  double 怀;
                  if ((Boolean)怀.fd_Setting_427.get() && shouldPredict(怀)) {
                     if ((Boolean)怀.fd_Setting_447.get()) {
                        ChatUtils.info("predicting target movement", new Object[0]);
                     }

                     怀 = (double)Math.round(怀.getVelocity().x);
                     怀 = (double)Math.round(怀.getVelocity().y);
                     怀 = (double)Math.round(怀.getVelocity().z);
                     怀 = 怀.add(怀, 怀, 怀);
                  }

                  if ((Boolean)怀.fd_Setting_447.get()) {
                     ChatUtils.info("checking canPlace", new Object[0]);
                  }

                  if (!canPlace(怀, 怀)) {
                     return;
                  }

                  if ((Boolean)怀.fd_Setting_447.get()) {
                     ChatUtils.info("we can place", new Object[0]);
                  }

                  怀 = DamageUtils.bedDamage(MeteorClient.mc.player, Utils.vec3d(怀));
                  怀 = DamageUtils.bedDamage(MeteorClient.mc.player, Utils.vec3d(怀.offset(怀.toDirection())));
                  怀 = DamageUtils.bedDamage(怀, Utils.vec3d(怀));
                  if ((Boolean)怀.fd_Setting_447.get()) {
                     ChatUtils.info("Self Damage: " + 怀 + " | Target Damage: " + 怀, new Object[0]);
                  }

                  if ((Boolean)怀.fd_Setting_447.get()) {
                     ChatUtils.info("damageCheck running", new Object[0]);
                  }

                  if (damageCheck(怀, 怀, 怀, 怀, 怀, 怀, 怀, 怀)) {
                     if ((Boolean)怀.fd_Setting_447.get()) {
                        ChatUtils.info("position is valid, setting placePos and nextDamage", new Object[0]);
                     }

                     fd_BlockPos_582 = 怀.offset((怀.fd_CardinalDirection_479 = 怀).toDirection());
                     怀.fd_double_477 = 怀;
                  }
               }
            }

         }
      }
   }

   public static boolean canPlace(BlockPos 怀, CardinalDirection 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = (BedAuraV2)Modules.get().get(BedAuraV2.class);
      怀 怀 = 怀.offset(怀.toDirection());
      if ((Boolean)怀.fd_Setting_447.get()) {
         int var5 = 怀.getX();
         ChatUtils.info("offsetPos is " + var5 + "," + 怀.getY() + "," + 怀.getZ(), new Object[0]);
      }

      怀 怀 = MeteorClient.mc.world.getBlockState(怀).getMaterial().isReplaceable() && BlockUtils.canPlace(怀.offset(怀.toDirection()));
      if (怀.getY() <= 1) {
         if ((Boolean)怀.fd_Setting_447.get()) {
            ChatUtils.info("canPlace Y check failed", new Object[0]);
         }

         怀 = false;
      }

      return 怀;
   }

   static {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_BlockPos_582 = null;
      fd_BlockPos_585 = null;
      fd_BlockPos_584 = null;
      fd_Executor_583 = Executors.newCachedThreadPool();
      fd_ArrayList_581 = new BedUtil$1();
   }

   public BedUtil() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }

   public static Boolean damageCheck(PlayerEntity 怀, double 怀, double 怀, double 怀, double 怀, double 怀, boolean 怀, boolean 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = (BedAuraV2)Modules.get().get(BedAuraV2.class);
      怀 怀 = false;
      怀 怀 = shouldBypassSelfDmg(PlayerUtils.getTotalHealth(), 怀, 怀, 怀, (double)(怀.getHealth() + 怀.getAbsorptionAmount()), 怀, 怀);
      怀 怀 = (double)(怀.getHealth() + 怀.getAbsorptionAmount()) - 怀 <= 0.0D;
      if (怀 >= 怀 || 怀) {
         if (!怀) {
            if ((Boolean)怀.fd_Setting_447.get()) {
               ChatUtils.info("we are not bypassing self damage", new Object[0]);
            }

            if (怀 <= 怀 && 怀 <= 怀) {
               怀 = !怀 || PlayerUtils.getTotalHealth() - 怀 > 0.0D;
            }
         } else {
            if ((Boolean)怀.fd_Setting_447.get()) {
               ChatUtils.info("bypassing self damage, target will pop after taking " + 怀 + " damage", new Object[0]);
            }

            怀 = !怀 || PlayerUtils.getTotalHealth() - 怀 > 0.0D;
         }
      }

      return 怀;
   }

   public static BlockPos findPlaceStrong(PlayerEntity 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";

      for(int 怀 = 0; 怀 < 3; ++怀) {
         fd_Executor_583.execute(() -> {
            String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
            calcPlaceForY(怀, 怀);
         });
         怀 怀 = fd_BlockPos_582;
         if (怀 != null) {
            fd_BlockPos_582 = null;
            return 怀;
         }
      }

      return null;
   }

   public static BlockPos findPlaceWrapper(PlayerEntity 怀) {
      // $FF: Couldn't be decompiled
   }

   public static BlockPos getSelfTrapBlock(PlayerEntity 怀, boolean 怀, boolean 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = 怀.getBlockPos();
      怀 怀 = new ArrayList();
      if (!怀 && Class44.isTrapBlock(怀.up(2))) {
         return 怀.up(2);
      } else {
         Iterator var5 = fd_ArrayList_581.iterator();

         while(var5.hasNext()) {
            怀 怀 = (Vec3d)var5.next();
            怀 怀 = 怀.add(怀.x, 怀.y, 怀.z);
            if (Class44.isTrapBlock(怀) && PlayerUtils.distanceTo(怀) <= (double)MeteorClient.mc.interactionManager.getReachDistance()) {
               怀.add(怀);
            }
         }

         怀.removeIf(Class57::isOurSurroundBlock);
         怀.removeIf((怀x) -> {
            String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
            return !shouldMineTrapBlock(怀, 怀x);
         });
         if (怀.isEmpty()) {
            return null;
         } else {
            BlockPos 怀;
            if (怀) {
               怀 = (BlockPos)怀.get((new Random()).nextInt(怀.size()));
            } else {
               怀 = (BlockPos)怀.get(0);
            }

            return 怀;
         }
      }
   }

   public static boolean isSelfTrapped(PlayerEntity 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = 怀.getBlockPos();
      Iterator var2 = fd_ArrayList_581.iterator();

      BlockPos 怀;
      do {
         if (!var2.hasNext()) {
            return true;
         }

         怀 怀 = (Vec3d)var2.next();
         怀 = 怀.add(怀.x, 怀.y, 怀.z);
      } while(Class57.getBlock(怀) != Blocks.AIR || !BlockUtils.canPlace(怀));

      return false;
   }
}
