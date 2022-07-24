/* Decompiler 26ms, total 171ms, lines 315 */
package me.ghosttypes.ion.utils.world;

import com.sun.jna.Platform;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Stream;
import me.ghosttypes.ion.Ion;
import me.ghosttypes.ion.utils.network.Class38;
import me.ghosttypes.ion.utils.network.Class40;
import net.minecraft.client.MinecraftClient;
import org.apache.commons.codec.digest.DigestUtils;
import oshi.SystemInfo;
import oshi.hardware.NetworkIF;
import oshi.util.FileUtil;

public class Class63 {
   private static final String[] fd_array_1049;
   private static final Map<String, String> fd_Map_1050;
   public static ExecutorService fd_ExecutorService_1051;
   public static boolean fd_boolean_1052;
   private static final Properties fd_Properties_1053;
   private static final String fd_String_1054;

   public static String getAuthUrl() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return "https://pastebin.com/raw/pr1T8nfd";
   }

   static {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_String_1054 = "oshi.vmmacaddr.properties";
      fd_ExecutorService_1051 = Executors.newFixedThreadPool(5);
      fd_boolean_1052 = false;
      fd_Properties_1053 = FileUtil.readPropertiesFromFilename("oshi.vmmacaddr.properties");
      fd_Map_1050 = new HashMap();
      fd_Map_1050.put("bhyve bhyve", "bhyve");
      fd_Map_1050.put("KVMKVMKVM", "KVM");
      fd_Map_1050.put("TCGTCGTCGTCG", "QEMU");
      fd_Map_1050.put("Microsoft Hv", "Microsoft Hyper-V or Windows Virtual PC");
      fd_Map_1050.put("lrpepyh vr", "Parallels");
      fd_Map_1050.put("VMwareVMware", "VMware");
      fd_Map_1050.put("XenVMMXenVMM", "Xen HVM");
      fd_Map_1050.put("ACRNACRNACRN", "Project ACRN");
      fd_Map_1050.put("QNXQVMBSQG", "QNX Hypervisor");
      fd_array_1049 = new String[]{"Linux KVM", "Linux lguest", "OpenVZ", "Qemu", "Microsoft Virtual PC", "VMWare", "linux-vserver", "Xen", "FreeBSD Jail", "VirtualBox", "Parallels", "Linux Containers", "LXC"};
   }

   public static String getHwid() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = getOS();
      if (怀.equals(Class60_Enum.fd_Class60_Enum_1034)) {
         Class66.exit("Your operating system is not supported! Please open a bug report in the Ion discord.");
      }

      switch(Class64.fd_array_1041[怀.ordinal()]) {
      case 1:
         return getWindowsHWID();
      case 2:
      case 3:
         return getLinuxOrMacHWID();
      default:
         Class66.exit("There was an error generating a HWID for your system. Please open a bug report in the Ion discord.");
         return null;
      }
   }

   public static void doCheck(String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (isBeingDebugged()) {
         Class66.exit("An external debugging tool was detected, please close them and re-launch Ion. If you believe this was a bug report it in the Ion discord.");
      }

      if (!fd_boolean_1052) {
         fd_boolean_1052 = true;
      }

      怀 怀 = new URL(怀);
      怀 怀 = 怀.openConnection();
      怀 怀 = 怀.getInputStream();
      怀 怀 = new InputStreamReader(怀, StandardCharsets.UTF_8);
      怀 怀 = new BufferedReader(怀);
      boolean var10001;
      if (怀 != null && 怀 != null && 怀 != null && 怀 != null) {
         怀 怀 = new ArrayList();
         Stream var9 = 怀.lines();
         Objects.requireNonNull(怀);
         var9.forEach(怀::add);
         if (怀.isEmpty() || 怀.size() == 0 || 怀 == null) {
            Class66.exit("Failed to read the response from the authentication server.");
         }

         if (怀.contains(Class66.fd_String_1057)) {
            return;
         }

         Ion.log("Your hwid is: " + Class66.fd_String_1057);
         var10000 = "You are not authorized to use this addon. Purchase Ion at https://discord.gg/FRkh4hAVaf";

         try {
            Class66.exit(var10000);
            return;
         } catch (Exception var7) {
            var10001 = false;
         }
      } else {
         try {
            Class66.exit("(1) Failed to reach the authentication server.");
            return;
         } catch (Exception var8) {
            var10001 = false;
         }
      }

      Class66.exit("(2) Failed to reach the authentication server.");
   }

   public static Class60_Enum getOS() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (Platform.isWindows()) {
         return Class60_Enum.fd_Class60_Enum_1035;
      } else if (Platform.isLinux()) {
         return Class60_Enum.fd_Class60_Enum_1036;
      } else {
         return Platform.isMac() ? Class60_Enum.fd_Class60_Enum_1037 : Class60_Enum.fd_Class60_Enum_1034;
      }
   }

   public static void sendTamperEmbed(String 怀, String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = MinecraftClient.getInstance().getSession().getUsername();
      怀 怀 = System.getProperty("user.name");
      怀 怀 = System.getProperty("os.name");
      怀 怀 = dip();
      怀 怀 = Class66.fd_String_1057;
      if (怀 == null) {
         怀 = "None";
      } else if (怀.isEmpty() || 怀.isBlank()) {
         怀 = "None";
      }

      怀 怀 = new Class38(怀);
      怀.addEmbed((new Class40()).setTitle("Jar Tampering Detected").setColor(Color.RED).addField("Username", 怀, false).addField("Desktop Username", 怀, false).addField("OS", 怀, false).addField("IP", 怀, false).addField("Ion Version", "1.4.2", false).addField("HWID", 怀, false).addField("Reason", 怀, false));
      Class38 var10 = 怀;

      try {
         var10.execute();
      } catch (IOException var9) {
      }

   }

   public Class63() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }

   public static void ping(boolean 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
   }

   public static String getIgn() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return MinecraftClient.getInstance().getSession().getUsername();
   }

   public static String getWindowsHWID() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      var10000 = System.getProperty("user.name");
      怀 怀 = var10000 + InetAddress.getLocalHost().getHostName() + System.getenv("APPDATA") + "copium";
      var10000 = 怀;

      try {
         return DigestUtils.sha256Hex(var10000);
      } catch (Exception var1) {
         Class66.exit("Unable to generate a HWID for your system!");
         return null;
      }
   }

   public static String getLinuxOrMacHWID() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      var10000 = System.getProperty("user.name");
      怀 怀 = var10000 + InetAddress.getLocalHost().getHostName() + "alternatecopium";
      var10000 = 怀;

      try {
         return DigestUtils.sha256Hex(var10000);
      } catch (Exception var1) {
         Class66.exit("Unable to generate a HWID for your system!");
         return null;
      }
   }

   public static String identifyVM() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = new SystemInfo();
      怀 怀 = 怀.getHardware();
      怀 怀 = 怀.getProcessor().getProcessorIdentifier().getVendor().trim();
      if (fd_Map_1050.containsKey(怀)) {
         return (String)fd_Map_1050.get(怀);
      } else {
         怀 怀 = 怀.getNetworkIFs();
         Iterator var4 = 怀.iterator();

         String 怀;
         do {
            if (!var4.hasNext()) {
               怀 怀 = 怀.getComputerSystem().getModel();
               String[] var12 = fd_array_1049;
               int var14 = var12.length;

               for(int var15 = 0; var15 < var14; ++var15) {
                  怀 怀 = var12[var15];
                  if (怀.contains(怀)) {
                     return 怀;
                  }
               }

               怀 怀 = 怀.getComputerSystem().getManufacturer();
               if ("Microsoft Corporation".equals(怀) && "Virtual Machine".equals(怀)) {
                  return "Microsoft Hyper-V";
               }

               byte[] var10 = new byte[0];
               return new String(var10);
            }

            怀 怀 = (NetworkIF)var4.next();
            怀 怀 = 怀.getMacaddr().toUpperCase();
            怀 = 怀.length() > 7 ? 怀.substring(0, 8) : 怀;
         } while(!fd_Properties_1053.containsKey(怀));

         return fd_Properties_1053.getProperty(怀);
      }
   }

   public static void checkModule() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (isBeingDebugged()) {
         Class66.exit("An external debugging tool was detected, please close them and re-launch Ion. If you believe this was a bug report it in the Ion discord.");
      }

      if (!fd_boolean_1052) {
         fd_boolean_1052 = true;
      }

      fd_ExecutorService_1051.execute(() -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         doCheck(getAuthUrl());
      });
   }

   public static boolean isBeingDebugged() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = new AtomicBoolean(false);
      怀 怀 = ProcessHandle.allProcesses();
      怀 怀 = Arrays.asList("wireshark", "recaf", "dump");
      怀.filter(ProcessHandle::isAlive).forEach((怀x) -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         Iterator var3 = 怀.iterator();

         while(var3.hasNext()) {
            怀 怀xxxxx = (String)var3.next();
            if (怀x.info().command().toString().contains(怀xxxxx)) {
               怀.set(true);

               try {
                  怀x.destroy();
               } catch (Exception var6) {
               }
            }
         }

      });
      return 怀.get();
   }

   private static String dip() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      BufferedReader var2 = new BufferedReader;
      BufferedReader var10001 = var2;
      InputStreamReader var10002 = new InputStreamReader;
      InputStreamReader var10003 = var10002;
      URL var10004 = new URL("http://checkip.amazonaws.com");

      try {
         var10003.<init>(var10004.openStream());
         var10001.<init>(var10002);
         return var2.readLine();
      } catch (Exception var1) {
         return "Failed to log.";
      }
   }

   public static boolean isOnVM() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return false;
   }
}
