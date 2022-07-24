/* Decompiler 14ms, total 197ms, lines 127 */
package me.ghosttypes.ion.modules.misc;

import me.ghosttypes.ion.utils.Class68;
import me.ghosttypes.ion.utils.network.Class42;
import meteordevelopment.meteorclient.events.packets.PacketEvent.Send;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.BoolSetting.Builder;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.player.ChatUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.item.BowItem;
import net.minecraft.item.EggItem;
import net.minecraft.item.EnderPearlItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SnowballItem;
import net.minecraft.network.Packet;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.sound.SoundEvents;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.class_2829;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.class_2847;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.class_2849;

public class OneTap extends Module {
   private final Setting<Integer> fd_Setting_711;
   private final SettingGroup SsSSsSsSsSSSSSsSssSSssSSssSsSSSsssSSSSssSSSssssSSsSsssSSssssSSSSSsSsssSsSSSSSSsSssSSsSSsSSSSSsSSSSSSsS;
   private final Setting<Integer> fd_Setting_712;
   private final Setting<Boolean> fd_Setting_713;
   private long fd_long_714;
   private final Setting<Boolean> fd_Setting_715;
   private final Setting<Boolean> fd_Setting_716;
   private final Setting<Boolean> fd_Setting_717;
   private final SettingGroup fd_SettingGroup_718;
   private final Setting<Boolean> sSsSSSssSsssSsssSsSssssssssSSSSsSSsSSSSssSssSsssSSSSSSsssSsSSsssssSSSSsSs;
   private boolean fd_boolean_719;
   public final Setting<Double> fd_Setting_720;
   private final Setting<Boolean> fd_Setting_721;
   private final Setting<Boolean> fd_Setting_722;

   public OneTap() {
      super(Class68.fd_Category_1062, "one-tap", "one tap bow exploit.");
      林森木森木林森木林森木林森木木林林林木森木林林木木林木木木森林林森林林木林林木森木林森林木森林森林林林木木森森森林林木森木木森森森木林森林木林林林木林林木森木木森林木木木森森森森森林森木林木林森木森木木林.fd_SettingGroup_718 = 林森木森木林森木林森木林森木木林林林木森木林林木木林木木木森林林森林林木林林木森木林森林木森林森林林林木木森森森林林木森木木森森森木林森林木林林林木林林木森木木森林木木木森森森森森林森木林木林森木森木木林.settings.getDefaultGroup();
      林森木森木林森木林森木林森木木林林林木森木林林木木林木木木森林林森林林木林林木森木林森林木森林森林林林木木森森森林林木森木木森森森木林森林木林林林木林林木森木木森林木木木森森森森森林森木林木林森木森木木林.SsSSsSsSsSSSSSsSssSSssSSssSsSSSsssSSSSssSSSssssSSsSsssSSssssSSSSSsSsssSsSSSSSSsSssSSsSSsSSSSSsSSSSSSsS = 林森木森木林森木林森木林森木木林林林木森木林林木木林木木木森林林森林林木林林木森木林森林木森林森林林林木木森森森林林木森木木森森森木林森林木林林林木林林木森木木森林木木木森森森森森林森木林木林森木森木木林.settings.createGroup("Aimbot");
      林森木森木林森木林森木林森木木林林林木森木林林木木林木木木森林林森林林木林林木森木林森林木森林森林林林木木森森森林林木森木木森森森木林森林木林林林木林林木森木木森林木木木森森森森森林森木林木林森木森木木林.sSsSSSssSsssSsssSsSssssssssSSSSsSSsSSSSssSssSsssSSSSSSsssSsSSsssssSSSSsSs = 林森木森木林森木林森木林森木木林林林木森木林林木木林木木木森林林森林林木林林木森木林森林木森林森林林林木木森森森林林木森木木森森森木林森林木林林林木林林木森木木森林木木木森森森森森林森木林木林森木森木木林.fd_SettingGroup_718.add(((Builder)((Builder)(new Builder()).name("bows")).defaultValue(true)).build());
      林森木森木林森木林森木林森木木林林林木森木林林木木林木木木森林林森林林木林林木森木林森林木森林森林林林木木森森森林林木森木木森森森木林森林木林林林木林林木森木木森林木木木森森森森森林森木林木林森木森木木林.fd_Setting_717 = 林森木森木林森木林森木林森木木林林林木森木林林木木林木木木森林林森林林木林林木森木林森林木森林森林林林木木森森森林林木森木木森森森木林森林木林林林木林林木森木木森林木木木森森森森森林森木林木林森木森木木林.fd_SettingGroup_718.add(((Builder)((Builder)(new Builder()).name("pearl")).defaultValue(true)).build());
      林森木森木林森木林森木林森木木林林林木森木林林木木林木木木森林林森林林木林林木森木林森林木森林森林林林木木森森森林林木森木木森森森木林森林木林林林木林林木森木木森林木木木森森森森森林森木林木林森木森木木林.fd_Setting_715 = 林森木森木林森木林森木林森木木林林林木森木林林木木林木木木森林林森林林木林林木森木林森林木森林森林林林木木森森森林林木森木木森森森木林森林木林林林木林林木森木木森林木木木森森森森森林森木林木林森木森木木林.fd_SettingGroup_718.add(((Builder)((Builder)(new Builder()).name("eggs")).defaultValue(true)).build());
      林森木森木林森木林森木林森木木林林林木森木林林木木林木木木森林林森林林木林林木森木林森林木森林森林林林木木森森森林林木森木木森森森木林森林木林林林木林林木森木木森林木木木森森森森森林森木林木林森木森木木林.fd_Setting_716 = 林森木森木林森木林森木林森木木林林林木森木林林木木林木木木森林林森林林木林林木森木林森林木森林森林林林木木森森森林林木森木木森森森木林森林木林林林木林林木森木木森林木木木森森森森森林森木林木林森木森木木林.fd_SettingGroup_718.add(((Builder)((Builder)(new Builder()).name("snowballs")).defaultValue(true)).build());
      林森木森木林森木林森木林森木木林林林木森木林林木木林木木木森林林森林林木林林木森木林森林木森林森林林林木木森森森林林木森木木森森森木林森林木林林林木林林木森木木森林木木木森森森森森林森木林木林森木森木木林.fd_Setting_722 = 林森木森木林森木林森木林森木木林林林木森木林林木木林木木木森林林森林林木林林木森木林森林木森林森林林林木木森森森林林木森木木森森森木林森林木林林林木林林木森木木森林木木木森森森森森林森木林木林森木森木木林.fd_SettingGroup_718.add(((Builder)((Builder)(new Builder()).name("railgun-sfx")).defaultValue(true)).build());
      林森木森木林森木林森木林森木木林林林木森木林林木木林木木木森林林森林林木林林木森木林森林木森林森林林林木木森森森林林木森木木森森森木林森林木林林林木林林木森木木森林木木木森森森森森林森木林木林森木森木木林.fd_Setting_720 = 林森木森木林森木林森木林森木木林林林木森木林林木木林木木木森林林森林林木林林木森木林森林木森林森林林林木木森森森林林木森木木森森森木林森林木林林林木林林木森木木森林木木木森森森森森林森木林木林森木森木木林.fd_SettingGroup_718.add(((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)(new meteordevelopment.meteorclient.settings.DoubleSetting.Builder()).name("sfx-volume")).description("How loud the sound is.")).defaultValue(1.0D).min(1.0D).sliderMax(5.0D).build());
      林森木森木林森木林森木林森木木林林林木森木林林木木林木木木森林林森林林木林林木森木林森林木森林森林林林木木森森森林林木森木木森森森木林森林木林林林木林林木森木木森林木木木森森森森森林森木林木林森木森木木林.fd_Setting_712 = 林森木森木林森木林森木林森木木林林林木森木林林木木林木木木森林林森林林木林林木森木林森林木森林森林林林木木森森森林林木森木木森森森木林森林木林林林木林林木森木木森林木木木森森森森森林森木林木林森木森木木林.fd_SettingGroup_718.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("timeout")).min(0).max(20000).sliderMin(100).sliderMax(20000).defaultValue(1)).build());
      林森木森木林森木林森木林森木木林林林木森木林林木木林木木木森林林森林林木林林木森木林森林木森林森林林林木木森森森林林木森木木森森森木林森林木林林林木林林木森木木森林木木木森森森森森林森木林木林森木森木木林.fd_Setting_711 = 林森木森木林森木林森木林森木木林林林木森木林林木木林木木木森林林森林林木林林木森木林森林木森林森林林林木木森森森林林木森木木森森森木林森林木林林林木林林木森木木森林木木木森森森森森林森木林木林森木森木木林.fd_SettingGroup_718.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("spoofs")).min(0).max(300).sliderMin(1).sliderMax(300).defaultValue(100)).build());
      林森木森木林森木林森木林森木木林林林木森木林林木木林木木木森林林森林林木林林木森木林森林木森林森林林林木木森森森林林木森木木森森森木林森林木林林林木林林木森木木森林木木木森森森森森林森木林木林森木森木木林.fd_Setting_721 = 林森木森木林森木林森木林森木木林林林木森木林林木木林木木木森林林森林林木林林木森木林森林木森林森林林林木木森森森林林木森木木森森森木林森林木林林林木林林木森木木森林木木木森森森森森林森木林木林森木森木木林.fd_SettingGroup_718.add(((Builder)((Builder)(new Builder()).name("bypass")).defaultValue(false)).build());
      林森木森木林森木林森木林森木木林林林木森木林林木木林木木木森林林森林林木林林木森木林森林木森林森林林林木木森森森林林木森木木森森森木林森林木林林林木林林木森木木森林木木木森森森森森林森木林木林森木森木木林.fd_Setting_713 = 林森木森木林森木林森木林森木木林林林木森木林林木木林木木木森林林森林林木林林木森木林森林木森林森林林林木木森森森林林木森木木森森森木林森林木林林林木林林木森木木森林木木木森森森森森林森木林木林森木森木木林.fd_SettingGroup_718.add(((Builder)((Builder)(new Builder()).name("debug")).defaultValue(false)).build());
   }

   private void doSpoofs() {
      if (System.currentTimeMillis() - 晚晚晩晩晚晚晚晩晩晩晚晚晩晩晚晩晚晩晚晩晩晚晚晚晚晩晩晚晩晚晩晚晩晚晚晩晚晚晩晩晚晚晚晩晚晚晩晚晩晚.fd_long_714 >= (long)(Integer)晚晚晩晩晚晚晚晩晩晩晚晚晩晩晚晩晚晩晚晩晩晚晚晚晚晩晩晚晩晚晩晚晩晚晚晩晚晚晩晩晚晚晚晩晚晚晩晚晩晚.fd_Setting_712.get()) {
         晚晚晩晩晚晚晚晩晩晩晚晚晩晩晚晩晚晩晚晩晩晚晚晚晚晩晩晚晩晚晩晚晩晚晚晩晚晚晩晩晚晚晚晩晚晚晩晚晩晚.fd_boolean_719 = true;
         晚晚晩晩晚晚晚晩晩晩晚晚晩晩晚晩晚晩晚晩晩晚晚晚晚晩晩晚晩晚晩晚晩晚晚晩晚晚晩晩晚晚晚晩晚晚晩晚晩晚.fd_long_714 = System.currentTimeMillis();
         晚晚晩晩晚晚晚晩晩晩晚晚晩晩晚晩晚晩晚晩晩晚晚晚晚晩晩晚晩晚晩晚晩晚晚晩晚晚晩晩晚晚晚晩晚晚晩晚晩晚.mc.player.networkHandler.sendPacket(new ClientCommandC2SPacket(晚晚晩晩晚晚晚晩晩晩晚晚晩晩晚晩晚晩晚晩晩晚晚晚晚晩晩晚晩晚晩晚晩晚晚晩晚晚晩晩晚晚晚晩晚晚晩晚晩晚.mc.player, class_2849.START_SPRINTING));

         for(int 佪茴回茴茴佪徊佪徊回茴佪徊茴回茴 = 0; 佪茴回茴茴佪徊佪徊回茴佪徊茴回茴 < (Integer)晚晚晩晩晚晚晚晩晩晩晚晚晩晩晚晩晚晩晚晩晩晚晚晚晚晩晩晚晩晚晩晚晩晚晚晩晚晚晩晩晚晚晚晩晚晚晩晚晩晚.fd_Setting_711.get(); ++佪茴回茴茴佪徊佪徊回茴佪徊茴回茴) {
            if ((Boolean)晚晚晩晩晚晚晚晩晩晩晚晚晩晩晚晩晚晩晚晩晩晚晚晚晚晩晩晚晩晚晩晚晩晚晚晩晚晚晩晩晚晚晚晩晚晚晩晚晩晚.fd_Setting_721.get()) {
               晚晚晩晩晚晚晚晩晩晩晚晚晩晩晚晩晚晩晚晩晩晚晚晚晚晩晩晚晩晚晩晚晩晚晚晩晚晚晩晩晚晚晚晩晚晚晩晚晩晚.mc.player.networkHandler.sendPacket(new class_2829(晚晚晩晩晚晚晚晩晩晩晚晚晩晩晚晩晚晩晚晩晩晚晚晚晚晩晩晚晩晚晩晚晩晚晚晩晚晚晩晩晚晚晚晩晚晚晩晚晩晚.mc.player.getX(), 晚晚晩晩晚晚晚晩晩晩晚晚晩晩晚晩晚晩晚晩晩晚晚晚晚晩晩晚晩晚晩晚晩晚晚晩晚晚晩晩晚晚晚晩晚晚晩晚晩晚.mc.player.getY() + 1.0E-10D, 晚晚晩晩晚晚晚晩晩晩晚晚晩晩晚晩晚晩晚晩晩晚晚晚晚晩晩晚晩晚晩晚晩晚晚晩晚晚晩晩晚晚晚晩晚晚晩晚晩晚.mc.player.getZ(), false));
               晚晚晩晩晚晚晚晩晩晩晚晚晩晩晚晩晚晩晚晩晩晚晚晚晚晩晩晚晩晚晩晚晩晚晚晩晚晚晩晩晚晚晚晩晚晚晩晚晩晚.mc.player.networkHandler.sendPacket(new class_2829(晚晚晩晩晚晚晚晩晩晩晚晚晩晩晚晩晚晩晚晩晩晚晚晚晚晩晩晚晩晚晩晚晩晚晚晩晚晚晩晩晚晚晚晩晚晚晩晚晩晚.mc.player.getX(), 晚晚晩晩晚晚晚晩晩晩晚晚晩晩晚晩晚晩晚晩晩晚晚晚晚晩晩晚晩晚晩晚晩晚晚晩晚晚晩晩晚晚晚晩晚晚晩晚晩晚.mc.player.getY() - 1.0E-10D, 晚晚晩晩晚晚晚晩晩晩晚晚晩晩晚晩晚晩晚晩晩晚晚晚晚晩晩晚晩晚晩晚晩晚晚晩晚晚晩晩晚晚晚晩晚晚晩晚晩晚.mc.player.getZ(), true));
            } else {
               晚晚晩晩晚晚晚晩晩晩晚晚晩晩晚晩晚晩晚晩晩晚晚晚晚晩晩晚晩晚晩晚晩晚晚晩晚晚晩晩晚晚晚晩晚晚晩晚晩晚.mc.player.networkHandler.sendPacket(new class_2829(晚晚晩晩晚晚晚晩晩晩晚晚晩晩晚晩晚晩晚晩晩晚晚晚晚晩晩晚晩晚晩晚晩晚晚晩晚晚晩晩晚晚晚晩晚晚晩晚晩晚.mc.player.getX(), 晚晚晩晩晚晚晚晩晩晩晚晚晩晩晚晩晚晩晚晩晩晚晚晚晚晩晩晚晩晚晩晚晩晚晚晩晚晚晩晩晚晚晚晩晚晚晩晚晩晚.mc.player.getY() - 1.0E-10D, 晚晚晩晩晚晚晚晩晩晩晚晚晩晩晚晩晚晩晚晩晩晚晚晚晚晩晩晚晩晚晩晚晩晚晚晩晚晚晩晩晚晚晚晩晚晚晩晚晩晚.mc.player.getZ(), true));
               晚晚晩晩晚晚晚晩晩晩晚晚晩晩晚晩晚晩晚晩晩晚晚晚晚晩晩晚晩晚晩晚晩晚晚晩晚晚晩晩晚晚晚晩晚晚晩晚晩晚.mc.player.networkHandler.sendPacket(new class_2829(晚晚晩晩晚晚晚晩晩晩晚晚晩晩晚晩晚晩晚晩晩晚晚晚晚晩晩晚晩晚晩晚晩晚晚晩晚晚晩晩晚晚晚晩晚晚晩晚晩晚.mc.player.getX(), 晚晚晩晩晚晚晚晩晩晩晚晚晩晩晚晩晚晩晚晩晩晚晚晚晚晩晩晚晩晚晩晚晩晚晚晩晚晚晩晩晚晚晚晩晚晚晩晚晩晚.mc.player.getY() + 1.0E-10D, 晚晚晩晩晚晚晚晩晩晩晚晚晩晩晚晩晚晩晚晩晩晚晚晚晚晩晩晚晩晚晩晚晩晚晚晩晚晚晩晩晚晚晚晩晚晚晩晚晩晚.mc.player.getZ(), false));
            }
         }

         if ((Boolean)晚晚晩晩晚晚晚晩晩晩晚晚晩晩晚晩晚晩晚晩晩晚晚晚晚晩晩晚晩晚晩晚晩晚晚晩晚晚晩晩晚晚晚晩晚晚晩晚晩晚.fd_Setting_713.get()) {
            ChatUtils.info(晚晚晩晩晚晚晚晩晩晩晚晚晩晩晚晩晚晩晚晩晩晚晚晚晚晩晩晚晩晚晩晚晩晚晚晩晚晚晩晩晚晚晚晩晚晚晩晚晩晚.name, "spoofed", new Object[0]);
         }

         晚晚晩晩晚晚晚晩晩晩晚晚晩晩晚晩晚晩晚晩晩晚晚晚晚晩晩晚晩晚晩晚晩晚晚晩晚晚晩晩晚晚晚晩晚晚晩晚晩晚.fd_boolean_719 = false;
      }

   }

   @EventHandler
   public void onPacketSend(Send JiLjJijJiJjILLLjIIIJliLJiIliiliJJIJJlIjjiilLLjIljjLllLILIjLlIIjLiJjIjLjljiJliJLllijJJJiijLiLl) {
      Packet<?> 㬺幐幐㬺㬺㬺幐㬺幐㬺㬺㬺幐幐幐幐幐㬺幐㬺㬺㬺㬺幐幐㬺幐幐㬺㬺㬺幐幐幐 = Class42.getPacket(ムㄙㄙㄙムムㄙムㄙムㄙㄙㄙㄙムㄙㄙムムムムㄙㄙムㄙムムムムムㄙㄙㄙムムムㄙムㄙㄙㄙムㄙㄙ);
      ItemStack 燚炏火欻炎炎炎火火火炏炎焱燚火焱火焱欻火炎焱;
      if (㬺幐幐㬺㬺㬺幐㬺幐㬺㬺㬺幐幐幐幐幐㬺幐㬺㬺㬺㬺幐幐㬺幐幐㬺㬺㬺幐幐幐 instanceof PlayerActionC2SPacket) {
         PlayerActionC2SPacket 㵘水沝淼沝淼沝淼沝淼水沝水水沝沝㵘沝㵘沝沝淼沝水水㵘淼水㵘㵘㵘水水㵘淼沝沝㵘㵘沝水淼沝沝淼水淼水㵘淼㵘淼沝水水淼㵘水水㵘沝水淼沝沝淼淼沝沝水水水水㵘沝水㵘水㵘淼㵘水㵘水㵘沝淼㵘水㵘淼水水水水水淼淼淼㵘㵘㵘淼水㵘水水淼㵘水水沝㵘水㵘㵘水沝沝㵘淼淼水沝 = (PlayerActionC2SPacket)㬺幐幐㬺㬺㬺幐㬺幐㬺㬺㬺幐幐幐幐幐㬺幐㬺㬺㬺㬺幐幐㬺幐幐㬺㬺㬺幐幐幐;
         if (㵘水沝淼沝淼沝淼沝淼水沝水水沝沝㵘沝㵘沝沝淼沝水水㵘淼水㵘㵘㵘水水㵘淼沝沝㵘㵘沝水淼沝沝淼水淼水㵘淼㵘淼沝水水淼㵘水水㵘沝水淼沝沝淼淼沝沝水水水水㵘沝水㵘水㵘淼㵘水㵘水㵘沝淼㵘水㵘淼水水水水水淼淼淼㵘㵘㵘淼水㵘水水淼㵘水水沝㵘水㵘㵘水沝沝㵘淼淼水沝.getAction() == class_2847.RELEASE_USE_ITEM) {
            燚炏火欻炎炎炎火火火炏炎焱燚火焱火焱欻火炎焱 = あおあああおあおああおおおおあああおおあああああおおおおあおおあおおあああおおおあおあおあああおああおおおああおあああおお.mc.player.getStackInHand(Hand.MAIN_HAND);
            if (!燚炏火欻炎炎炎火火火炏炎焱燚火焱火焱欻火炎焱.isEmpty() && 燚炏火欻炎炎炎火火火炏炎焱燚火焱火焱欻火炎焱.getItem() != null && 燚炏火欻炎炎炎火火火炏炎焱燚火焱火焱欻火炎焱.getItem() instanceof BowItem && (Boolean)あおあああおあおああおおおおあああおおあああああおおおおあおおあおおあああおおおあおあおあああおああおおおああおあああおお.sSsSSSssSsssSsssSsSssssssssSSSSsSSsSSSSssSssSsssSSSSSSsssSsSSsssssSSSSsSs.get()) {
               if ((Boolean)あおあああおあおああおおおおあああおおあああああおおおおあおおあおおあああおおおあおあおあああおああおおおああおあああおお.fd_Setting_722.get()) {
                  float 晚晩晩晩晚晩晚晩晚晚晚晚晩晩晚晚晩晚晚晩晩晚晚晚晚晩晚晚晚晩晚晚晩晚晚晩晩晚晩晚晚晩晚晩晚晩晩晚晩晚晚晚晩晚晩晩晚晚晩晩晩晩晩晩晩晚晚晩晚晚晩晩晩晚晚晩晩晚晚晚晚晩晩晩晚晩晩晚晚晚晚晩晩晩晩晚晩晚晚晚晚晩晚晚 = ((Double)あおあああおあおああおおおおあああおおあああああおおおおあおおあおおあああおおおあおあおあああおああおおおああおあああおお.fd_Setting_720.get()).floatValue();
                  あおあああおあおああおおおおあああおおあああああおおおおあおおあおおあああおおおあおあおあああおああおおおああおあああおお.mc.player.playSound(SoundEvents.BLOCK_BEACON_ACTIVATE, 晚晩晩晩晚晩晚晩晚晚晚晚晩晩晚晚晩晚晚晩晩晚晚晚晚晩晚晚晚晩晚晚晩晚晚晩晩晚晩晚晚晩晚晩晚晩晩晚晩晚晚晚晩晚晩晩晚晚晩晩晩晩晩晩晩晚晚晩晚晚晩晩晩晚晚晩晩晚晚晚晚晩晩晩晚晩晩晚晚晚晚晩晩晩晩晚晩晚晚晚晚晩晚晚, 1.0F);
               }

               あおあああおあおああおおおおあああおおあああああおおおおあおおあおおあああおおおあおあおあああおああおおおああおあああおお.doSpoofs();
               if ((Boolean)あおあああおあおああおおおおあああおおあああああおおおおあおおあおおあああおおおあおあおあああおああおおおああおあああおお.fd_Setting_713.get()) {
                  ChatUtils.info(あおあああおあおああおおおおあああおおあああああおおおおあおおあおおあああおおおあおあおあああおああおおおああおあああおお.name, "trying to spoof", new Object[0]);
               }
            }
         }
      } else if (㬺幐幐㬺㬺㬺幐㬺幐㬺㬺㬺幐幐幐幐幐㬺幐㬺㬺㬺㬺幐幐㬺幐幐㬺㬺㬺幐幐幐 instanceof PlayerInteractItemC2SPacket) {
         PlayerInteractItemC2SPacket よよよょよよょよょょょよよよょょよょょよよょよょょょょょよょよょよょょょょよょ = (PlayerInteractItemC2SPacket)㬺幐幐㬺㬺㬺幐㬺幐㬺㬺㬺幐幐幐幐幐㬺幐㬺㬺㬺㬺幐幐㬺幐幐㬺㬺㬺幐幐幐;
         if (よよよょよよょよょょょよよよょょよょょよよょよょょょょょよょよょよょょょょよょ.getHand() == Hand.MAIN_HAND) {
            燚炏火欻炎炎炎火火火炏炎焱燚火焱火焱欻火炎焱 = あおあああおあおああおおおおあああおおあああああおおおおあおおあおおあああおおおあおあおあああおああおおおああおあああおお.mc.player.getStackInHand(Hand.MAIN_HAND);
            if (!燚炏火欻炎炎炎火火火炏炎焱燚火焱火焱欻火炎焱.isEmpty() && 燚炏火欻炎炎炎火火火炏炎焱燚火焱火焱欻火炎焱.getItem() != null) {
               if (燚炏火欻炎炎炎火火火炏炎焱燚火焱火焱欻火炎焱.getItem() instanceof EggItem && (Boolean)あおあああおあおああおおおおあああおおあああああおおおおあおおあおおあああおおおあおあおあああおああおおおああおあああおお.fd_Setting_715.get()) {
                  あおあああおあおああおおおおあああおおあああああおおおおあおおあおおあああおおおあおあおあああおああおおおああおあああおお.doSpoofs();
               } else if (燚炏火欻炎炎炎火火火炏炎焱燚火焱火焱欻火炎焱.getItem() instanceof EnderPearlItem && (Boolean)あおあああおあおああおおおおあああおおあああああおおおおあおおあおおあああおおおあおあおあああおああおおおああおあああおお.fd_Setting_717.get()) {
                  あおあああおあおああおおおおあああおおあああああおおおおあおおあおおあああおおおあおあおあああおああおおおああおあああおお.doSpoofs();
               } else if (燚炏火欻炎炎炎火火火炏炎焱燚火焱火焱欻火炎焱.getItem() instanceof SnowballItem && (Boolean)あおあああおあおああおおおおあああおおあああああおおおおあおおあおおあああおおおあおあおあああおああおおおああおあああおお.fd_Setting_716.get()) {
                  あおあああおあおああおおおおあああおおあああああおおおおあおおあおおあああおおおあおあおあああおああおおおああおあああおお.doSpoofs();
               }
            }
         }
      }

   }

   public void onActivate() {
      森木林森森林森林森林森森森森林木林森林木森木木林森林木森林木林木森林森林森林林林森木森森林森森木林林森林林林木木木木林林林森林森木森木森木木林木森森木林林森木木森林木森林木林木林森木森林木木木林林森木.fd_boolean_719 = false;
      森木林森森林森林森林森森森森林木林森林木森木木林森林木森林木林木森林森林森林林林森木森森林森森木林林森林林林木木木木林林林森林森木森木森木木林木森森木林林森木木森林木森林木林木林森木森林木木木林林森木.fd_long_714 = System.currentTimeMillis();
   }
}
