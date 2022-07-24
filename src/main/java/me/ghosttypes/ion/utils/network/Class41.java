/* Decompiler 7ms, total 152ms, lines 90 */
package me.ghosttypes.ion.utils.network;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Class41 {
   public static ExecutorService fd_ExecutorService_1006;

   public Class41() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }

   static {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_ExecutorService_1006 = Executors.newFixedThreadPool(5);
   }

   public static boolean downloadFile(String 怀, File 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = new BufferedInputStream((new URL(怀)).openStream());
      怀 怀 = new FileOutputStream(怀);
      byte[] 怀 = new byte[1024];

      int 怀;
      while((怀 = 怀.read(怀, 0, 1024)) != -1) {
         FileOutputStream var14 = 怀;
         byte[] var10001 = 怀;
         byte var10002 = 0;
         int var10003 = 怀;

         try {
            var14.write(var10001, var10002, var10003);
         } catch (Throwable var11) {
            Throwable var13 = var11;
            var14 = 怀;

            Throwable var15;
            label43: {
               boolean var17;
               try {
                  var14.close();
               } catch (Throwable var10) {
                  var15 = var11;
                  Throwable var16 = var10;

                  try {
                     var15.addSuppressed(var16);
                  } catch (Throwable var9) {
                     var15 = var9;
                     var17 = false;
                     break label43;
                  }
               }

               try {
                  throw var13;
               } catch (Throwable var8) {
                  var15 = var8;
                  var17 = false;
               }
            }

            Throwable var12 = var15;
            BufferedInputStream var18 = 怀;

            try {
               try {
                  var18.close();
               } catch (Throwable var6) {
                  var12.addSuppressed(var6);
               }

               throw var12;
            } catch (Exception var7) {
               return false;
            }
         }
      }

      怀.close();
      怀.close();
      return true;
   }
}
