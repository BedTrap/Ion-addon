/* Decompiler 16ms, total 159ms, lines 82 */
package me.ghosttypes.ion.modules.misc.elytrabot.utils;

import me.ghosttypes.ion.modules.misc.elytrabot.ElytraBotThreaded;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.systems.modules.Modules;
import net.minecraft.util.math.BlockPos;

public class ElytraFly {
   public static boolean fd_boolean_832;

   public ElytraFly() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }

   public static void toggle(boolean 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_boolean_832 = 怀;
   }

   public static void setMotion(BlockPos 怀, BlockPos 怀, BlockPos 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (fd_boolean_832) {
         怀 怀 = 0.0D;
         怀 怀 = 0.0D;
         怀 怀 = 0.0D;
         怀 怀 = (double)怀.getX() + 0.5D - MeteorClient.mc.player.getX();
         怀 怀 = (double)怀.getY() + 0.4D - MeteorClient.mc.player.getY();
         怀 怀 = (double)怀.getZ() + 0.5D - MeteorClient.mc.player.getZ();
         怀 怀 = (Double)((ElytraBotThreaded)Modules.get().get(ElytraBotThreaded.class)).fd_Setting_794.get();
         怀 怀 = 0;
         if (Math.abs(怀.getX() - 怀.getX()) > 0) {
            ++怀;
         }

         if (Math.abs(怀.getY() - 怀.getY()) > 0) {
            ++怀;
         }

         if (Math.abs(怀.getZ() - 怀.getZ()) > 0) {
            ++怀;
         }

         if (怀 > 1) {
            怀 = (Double)((ElytraBotThreaded)Modules.get().get(ElytraBotThreaded.class)).fd_Setting_780.get();
            if (怀.getX() - 怀.getX() == 怀.getZ() - 怀.getZ() && 怀.getY() - 怀.getY() == 0 && (怀 >= 1.0D && 怀 >= 1.0D || 怀 <= -1.0D && 怀 <= -1.0D)) {
               Double var23 = (Double)((ElytraBotThreaded)Modules.get().get(ElytraBotThreaded.class)).fd_Setting_794.get();

               try {
                  怀 = var23;
               } catch (Exception var22) {
                  怀 = (Double)((ElytraBotThreaded)Modules.get().get(ElytraBotThreaded.class)).fd_Setting_780.get();
               }
            }
         }

         if ((int)怀 > 0) {
            怀 = 怀;
         } else if ((int)怀 < 0) {
            怀 = -怀;
         }

         if ((int)怀 > 0) {
            怀 = (Double)((ElytraBotThreaded)Modules.get().get(ElytraBotThreaded.class)).fd_Setting_780.get();
         } else if ((int)怀 < 0) {
            怀 = -(Double)((ElytraBotThreaded)Modules.get().get(ElytraBotThreaded.class)).fd_Setting_780.get();
         }

         if ((int)怀 > 0) {
            怀 = 怀;
         } else if ((int)怀 < 0) {
            怀 = -怀;
         }

         MeteorClient.mc.player.setVelocity(怀, 怀, 怀);
         怀 怀 = 0.2D;
         怀 怀 = 0.1D;
         MeteorClient.mc.player.setVelocity(怀 == 0.0D ? (怀 > 怀 ? 怀 : (怀 < -怀 ? -怀 : 0.0D)) : MeteorClient.mc.player.getVelocity().x, 怀 == 0.0D ? (怀 > 怀 ? 怀 : (怀 < -怀 ? -怀 : 0.0D)) : MeteorClient.mc.player.getVelocity().y, 怀 == 0.0D ? (怀 > 怀 ? 怀 : (怀 < -怀 ? -怀 : 0.0D)) : MeteorClient.mc.player.getVelocity().z);
      }
   }
}
