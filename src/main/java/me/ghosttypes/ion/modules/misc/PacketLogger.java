/* Decompiler 22ms, total 166ms, lines 96 */
package me.ghosttypes.ion.modules.misc;

import java.lang.reflect.Field;
import java.util.Set;
import me.ghosttypes.ion.mixins.ICustomPayloadS2CPacket;
import me.ghosttypes.ion.utils.Class68;
import me.ghosttypes.ion.utils.misc.Class22;
import meteordevelopment.meteorclient.mixin.CustomPayloadC2SPacketAccessor;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.EnumSetting.Builder;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.network.PacketUtils;
import net.minecraft.network.Packet;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PacketLogger extends Module {
   private final Setting<PacketLogger$Mode> fd_Setting_723;
   private final SettingGroup fd_SettingGroup_724;
   public final Setting<Set<Class<? extends Packet<?>>>> fd_Setting_725;
   public final Setting<Set<Class<? extends Packet<?>>>> fd_Setting_726;
   private final Logger fd_Logger_727;

   private Identifier getPacketChannel(Packet<?> 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀 instanceof CustomPayloadC2SPacketAccessor) {
         return ((CustomPayloadC2SPacketAccessor)怀).getChannel();
      } else {
         return 怀 instanceof ICustomPayloadS2CPacket ? ((ICustomPayloadS2CPacket)怀).getChannel() : null;
      }
   }

   public PacketLogger() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super(Class68.fd_Category_1062, "packet-logger", "Logs sent and received packets for both the client and server.");
      怀.fd_SettingGroup_724 = 怀.settings.getDefaultGroup();
      怀.fd_Setting_723 = 怀.fd_SettingGroup_724.add(((Builder)((Builder)((Builder)(new Builder()).name("logging-mode")).description("The mode by which to log the packets.")).defaultValue(PacketLogger$Mode.fd_Mode_731)).build());
      怀.fd_Setting_726 = 怀.fd_SettingGroup_724.add(((meteordevelopment.meteorclient.settings.PacketListSetting.Builder)((meteordevelopment.meteorclient.settings.PacketListSetting.Builder)(new meteordevelopment.meteorclient.settings.PacketListSetting.Builder()).name("S2C-packets")).description("Server-to-client packets to log.")).filter((怀x) -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         return PacketUtils.getS2CPackets().contains(怀x);
      }).build());
      怀.fd_Setting_725 = 怀.fd_SettingGroup_724.add(((meteordevelopment.meteorclient.settings.PacketListSetting.Builder)((meteordevelopment.meteorclient.settings.PacketListSetting.Builder)(new meteordevelopment.meteorclient.settings.PacketListSetting.Builder()).name("C2S-packets")).description("Client-to-server packets to log.")).filter((怀x) -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         return PacketUtils.getC2SPackets().contains(怀x);
      }).build());
      怀.fd_Logger_727 = LogManager.getLogger("Packet Logger");
   }

   private String formatAndMapObjectFields(Object 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = new StringBuilder();
      怀.append("\nData: {\n");
      Field[] var3 = 怀.getClass().getDeclaredFields();
      int var4 = var3.length;
      int var5 = 0;

      while(var5 < var4) {
         怀 怀 = var3[var5];
         怀.setAccessible(true);
         StringBuilder var8 = 怀.append("    \"").append(Class22.exactMap(怀.getName())).append("\"").append(" : ").append("\"");
         String var10001 = String.valueOf(怀.get(怀));

         try {
            var8.append(Class22.vaugeMap(var10001)).append("\"").append("\n");
            ++var5;
         } catch (Exception var7) {
            var7.printStackTrace();
            break;
         }
      }

      怀.append("}");
      return 怀.toString();
   }

   public void logSentPacket(Packet<?> 怀) {
      // $FF: Couldn't be decompiled
   }

   private String trimClassName(String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = 怀.lastIndexOf(46);
      if (怀 != -1) {
         怀 = 怀.substring(怀 + 1);
      }

      return 怀.replaceAll("\\$", ".");
   }

   public void logReceivedPacket(Packet<?> 怀) {
      // $FF: Couldn't be decompiled
   }
}
