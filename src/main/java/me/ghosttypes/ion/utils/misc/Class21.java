/* Decompiler 2ms, total 139ms, lines 31 */
package me.ghosttypes.ion.utils.misc;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class Class21 {
   public static ExecutorService fd_ExecutorService_910;
   public static Executor fd_Executor_911;
   public static ScheduledExecutorService fd_ScheduledExecutorService_912;

   public Class21() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }

   static {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_ScheduledExecutorService_912 = Executors.newScheduledThreadPool(5);
      fd_ExecutorService_910 = Executors.newFixedThreadPool(20);
      fd_Executor_911 = Executors.newCachedThreadPool();
   }

   public static void shutdown() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_ScheduledExecutorService_912.shutdown();
      fd_ExecutorService_910.shutdown();
   }
}
