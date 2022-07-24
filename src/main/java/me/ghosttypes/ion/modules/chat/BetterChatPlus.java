/* Decompiler 27ms, total 189ms, lines 207 */
package me.ghosttypes.ion.modules.chat;

import java.util.Objects;
import me.ghosttypes.ion.utils.Class68;
import me.ghosttypes.ion.utils.Class70;
import me.ghosttypes.ion.utils.chat.Class4;
import me.ghosttypes.ion.utils.network.Class42;
import me.ghosttypes.ion.utils.services.DeathManager;
import meteordevelopment.meteorclient.events.game.SendMessageEvent;
import meteordevelopment.meteorclient.events.packets.PacketEvent.Receive;
import meteordevelopment.meteorclient.events.packets.PacketEvent.Send;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.BoolSetting.Builder;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.player.ChatUtils;
import meteordevelopment.meteorclient.utils.render.color.RainbowColor;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Formatting;
import net.minecraft.text.Text;
import net.minecraft.network.Packet;
import net.minecraft.network.packet.c2s.play.ChatMessageC2SPacket;
import net.minecraft.text.MutableText;
import net.minecraft.text.TextColor;
import net.minecraft.network.packet.s2c.play.ChatMessageS2CPacket;

public class BetterChatPlus extends Module {
   public final Setting<Boolean> fd_Setting_31;
   public final Setting<Boolean> fd_Setting_32;
   public final Setting<Boolean> fd_Setting_33;
   private String fd_String_34;
   private final Setting<Boolean> fd_Setting_35;
   public final Setting<Boolean> fd_Setting_36;
   private boolean fd_boolean_37;
   public final Setting<SettingColor> fd_Setting_38;
   RainbowColor fd_RainbowColor_39;
   private final Setting<Boolean> jIlLlIJJIliIiiIiJjIIjiI;
   public final Setting<Boolean> fd_Setting_40;
   public final Setting<String> fd_Setting_41;
   public final Setting<String> fd_Setting_42;
   public final Setting<Double> qqQpQpQQQQQQPPPqPPQqqpQPqppPPqpppPPPqppQPQpqqQpPppQPPQqpqpqPpqPpQPqpppqPpqQQPpPQqppqppqQQpPpqpppqqqQpppqqQqpPppqPqPqqqPqQq;
   private final SettingGroup fd_SettingGroup_43;
   public final Setting<Boolean> fd_Setting_44;
   public final Setting<String> fd_Setting_45;
   public final Setting<Boolean> fd_Setting_46;

   @EventHandler
   private void onPacketRecieve(Receive 淼沝水水㵘㵘㵘水淼沝㵘淼水㵘淼沝沝淼淼水㵘沝沝沝㵘水水水沝bTkPdlMHDg) {
      Packet<?> りいりいぃぃりいぃぃぃリリいぃぃぃりリリりいぃりいyqweQbZOoB = Class42.getPacket(佪佪回佪佪佪佪茴徊回佪徊徊回回回徊徊回佪回茴徊回茴回徊茴徊回佪佪佪佪茴茴佪徊茴佪佪佪徊佪徊茴佪佪回茴茴佪茴佪茴佪徊佪回茴回佪徊徊徊茴徊佪佪佪回回佪徊徊茴徊茴回茴佪茴回佪佪佪回回佪茴佪茴回徊回佪佪徊佪茴佪佪回徊茴徊佪佪茴佪茴佪回茴佪回茴回徊jmzobufFOm);
      if (りいりいぃぃりいぃぃぃリリいぃぃぃりリリりいぃりいyqweQbZOoB instanceof ChatMessageS2CPacket) {
         ChatMessageS2CPacket ijIjlILLIjjlILJLijLLJlIJILLJlILJLiJjLJiiIlIiLJiILLLjLiLJJlllIJIjljIJilJjJLIlJIijILijJJIljilililijjLJlLlJvdBDrKrDJz = (ChatMessageS2CPacket)りいりいぃぃりいぃぃぃリリいぃぃぃりリリりいぃりいyqweQbZOoB;
         String 鬬鬬鬬鬬鬬鬬鬭鬬鬬鬭鬭鬭鬬鬭鬬鬬鬬鬬鬭鬬鬭鬬鬭鬬鬬鬬鬭鬬鬭鬬鬭鬭鬭鬭鬭鬬鬭鬬鬬鬭鬭鬭鬭鬭鬬鬭鬬鬭鬭鬬鬭鬭鬭鬭鬭鬬鬭鬬鬭鬬鬬鬬鬬鬭鬭鬬鬭鬭鬬鬬鬬鬬鬭鬬鬬鬬鬬鬬鬭鬬鬭鬭鬬鬭鬬鬭鬭鬭鬬鬬鬬鬬鬭鬭鬬鬭鬭鬬鬬鬬鬬鬭鬭鬬鬭鬭鬬鬬鬭鬭鬬鬭鬭鬭鬭鬭鬬鬬鬬鬭鬭鬭鬭鬬enfYFjOonY = ijIjlILLIjjlILJLijLLJlIJILLJlILJLiJjLJiiIlIiLJiILLLjLiLJJlllIJIjljIJilJjJLIlJIijILijJJIljilililijjLJlLlJvdBDrKrDJz.comp_833().getString();
         if ((Boolean)りぃリリリりぃリリリリりりりいぃいリりぃぃりリいリりりりぃいりいリリBBxeMztsaJ.jIlLlIJJIliIiiIiJjIIjiI.get()) {
            if (鬬鬬鬬鬬鬬鬬鬭鬬鬬鬭鬭鬭鬬鬭鬬鬬鬬鬬鬭鬬鬭鬬鬭鬬鬬鬬鬭鬬鬭鬬鬭鬭鬭鬭鬭鬬鬭鬬鬬鬭鬭鬭鬭鬭鬬鬭鬬鬭鬭鬬鬭鬭鬭鬭鬭鬬鬭鬬鬭鬬鬬鬬鬬鬭鬭鬬鬭鬭鬬鬬鬬鬬鬭鬬鬬鬬鬬鬬鬭鬬鬭鬭鬬鬭鬬鬭鬭鬭鬬鬬鬬鬬鬭鬭鬬鬭鬭鬬鬬鬬鬬鬭鬭鬬鬭鬭鬬鬬鬭鬭鬬鬭鬭鬭鬭鬭鬬鬬鬬鬭鬭鬭鬭鬬enfYFjOonY.contains("whispers")) {
               りぃリリリりぃリリリリりりりいぃいリりぃぃりリいリりりりぃいりいリリBBxeMztsaJ.fd_String_34 = 鬬鬬鬬鬬鬬鬬鬭鬬鬬鬭鬭鬭鬬鬭鬬鬬鬬鬬鬭鬬鬭鬬鬭鬬鬬鬬鬭鬬鬭鬬鬭鬭鬭鬭鬭鬬鬭鬬鬬鬭鬭鬭鬭鬭鬬鬭鬬鬭鬭鬬鬭鬭鬭鬭鬭鬬鬭鬬鬭鬬鬬鬬鬬鬭鬭鬬鬭鬭鬬鬬鬬鬬鬭鬬鬬鬬鬬鬬鬭鬬鬭鬭鬬鬭鬬鬭鬭鬭鬬鬬鬬鬬鬭鬭鬬鬭鬭鬬鬬鬬鬬鬭鬭鬬鬭鬭鬬鬬鬭鬭鬬鬭鬭鬭鬭鬭鬬鬬鬬鬭鬭鬭鬭鬬enfYFjOonY.split(" ")[0];
               りぃリリリりぃリリリリりりりいぃいリりぃぃりリいリりりりぃいりいリリBBxeMztsaJ.fd_boolean_37 = true;
               りぃリリリりぃリリリリりりりいぃいリりぃぃりリいリりりりぃいりいリリBBxeMztsaJ.info("New whisper reply target: " + りぃリリリりぃリリリリりりりいぃいリりぃぃりリいリりりりぃいりいリリBBxeMztsaJ.fd_String_34, new Object[0]);
            } else if (DeathManager.isServerMessage((ChatMessageS2CPacket)りいりいぃぃりいぃぃぃリリいぃぃぃりリリりいぃりいyqweQbZOoB) && (鬬鬬鬬鬬鬬鬬鬭鬬鬬鬭鬭鬭鬬鬭鬬鬬鬬鬬鬭鬬鬭鬬鬭鬬鬬鬬鬭鬬鬭鬬鬭鬭鬭鬭鬭鬬鬭鬬鬬鬭鬭鬭鬭鬭鬬鬭鬬鬭鬭鬬鬭鬭鬭鬭鬭鬬鬭鬬鬭鬬鬬鬬鬬鬭鬭鬬鬭鬭鬬鬬鬬鬬鬭鬬鬬鬬鬬鬬鬭鬬鬭鬭鬬鬭鬬鬭鬭鬭鬬鬬鬬鬬鬭鬭鬬鬭鬭鬬鬬鬬鬬鬭鬭鬬鬭鬭鬬鬬鬭鬭鬬鬭鬭鬭鬭鬭鬬鬬鬬鬭鬭鬭鬭鬬enfYFjOonY.contains("Unknown or incomplete command") || 鬬鬬鬬鬬鬬鬬鬭鬬鬬鬭鬭鬭鬬鬭鬬鬬鬬鬬鬭鬬鬭鬬鬭鬬鬬鬬鬭鬬鬭鬬鬭鬭鬭鬭鬭鬬鬭鬬鬬鬭鬭鬭鬭鬭鬬鬭鬬鬭鬭鬬鬭鬭鬭鬭鬭鬬鬭鬬鬭鬬鬬鬬鬬鬭鬭鬬鬭鬭鬬鬬鬬鬬鬭鬬鬬鬬鬬鬬鬭鬬鬭鬭鬬鬭鬬鬭鬭鬭鬬鬬鬬鬬鬭鬭鬬鬭鬭鬬鬬鬬鬬鬭鬭鬬鬭鬭鬬鬬鬭鬭鬬鬭鬭鬭鬭鬭鬬鬬鬬鬭鬭鬭鬭鬬enfYFjOonY.contains("<--[HERE]")) && (Boolean)りぃリリリりぃリリリリりりりいぃいリりぃぃりリいリりりりぃいりいリリBBxeMztsaJ.fd_Setting_35.get()) {
               佪佪回佪佪佪佪茴徊回佪徊徊回回回徊徊回佪回茴徊回茴回徊茴徊回佪佪佪佪茴茴佪徊茴佪佪佪徊佪徊茴佪佪回茴茴佪茴佪茴佪徊佪回茴回佪徊徊徊茴徊佪佪佪回回佪徊徊茴徊茴回茴佪茴回佪佪佪回回佪茴佪茴回徊回佪佪徊佪茴佪佪回徊茴徊佪佪茴佪茴佪回茴佪回茴回徊jmzobufFOm.cancel();
            }
         }
      }

   }

   public MutableText getPrefix() {
      MutableText 茴佪徊徊回茴徊回徊回回茴茴回茴回茴回茴回徊佪回徊徊回佪回回回徊回佪佪徊徊茴茴回徊徊徊徊佪徊茴佪佪茴徊回茴徊佪徊徊回徊徊回佪佪徊茴回回回徊茴徊茴回佪回回佪徊回茴徊徊佪回佪茴茴佪徊茴徊佪uaTXXhWVcQ = Text.literal("");
      MutableText 炎火燚火火燚焱炎炎火炏炏炎燚火欻燚炎炎欻炏欻炎炏火燚燚欻焱燚炎火欻欻火火焱焱炎欻燚燚燚炏欻炎炏炏火欻火火焱火焱欻炏炏火燚欻燚燚炏焱燚燚燚焱炎炏炎燚焱燚火欻火欻焱焱欻焱火炏欻燚焱火火欻欻炏火火KWRcxLYdUh = Text.literal("");
      String ㇸ乀乀へㇸへ乀ㇸㇸへㇸㇸㇸㇸㇸへ乀乀ㇸ乀乀ㇸへㇸ乀ㇸへ乀へㇸㇸㇸㇸへ乀ㇸ乀へ乀ㇸ乀乀乀ㇸ乀ㇸへ乀へㇸ乀へ乀乀ㇸㇸㇸ乀乀へへ乀ㇸㇸへへgAgJGqsYVf = "Ion";
      if ((Boolean)メノメノノメメノノメメノメメメノメノノノノメメノメノメメメdoEUqghvnB.fd_Setting_40.get()) {
         ㇸ乀乀へㇸへ乀ㇸㇸへㇸㇸㇸㇸㇸへ乀乀ㇸ乀乀ㇸへㇸ乀ㇸへ乀へㇸㇸㇸㇸへ乀ㇸ乀へ乀ㇸ乀乀乀ㇸ乀ㇸへ乀へㇸ乀へ乀乀ㇸㇸㇸ乀乀へへ乀ㇸㇸへへgAgJGqsYVf = (String)メノメノノメメノノメメノメメメノメノノノノメメノメノメメメdoEUqghvnB.fd_Setting_42.get();
      }

      if ((Boolean)メノメノノメメノノメメノメメメノメノノノノメメノメノメメメdoEUqghvnB.fd_Setting_31.get() && !(Boolean)メノメノノメメノノメメノメメメノメノノノノメメノメノメメメdoEUqghvnB.fd_Setting_36.get()) {
         茴佪徊徊回茴徊回徊回回茴茴回茴回茴回茴回徊佪回徊徊回佪回回回徊回佪佪徊徊茴茴回徊徊徊徊佪徊茴佪佪茴徊回茴徊佪徊徊回徊徊回佪佪徊茴回回回徊茴徊茴回佪回回佪徊回茴徊徊佪回佪茴茴佪徊茴徊佪uaTXXhWVcQ.append(Text.literal(ㇸ乀乀へㇸへ乀ㇸㇸへㇸㇸㇸㇸㇸへ乀乀ㇸ乀乀ㇸへㇸ乀ㇸへ乀へㇸㇸㇸㇸへ乀ㇸ乀へ乀ㇸ乀乀乀ㇸ乀ㇸへ乀へㇸ乀へ乀乀ㇸㇸㇸ乀乀へへ乀ㇸㇸへへgAgJGqsYVf).setStyle(茴佪徊徊回茴徊回徊回回茴茴回茴回茴回茴回徊佪回徊徊回佪回回回徊回佪佪徊徊茴茴回徊徊徊徊佪徊茴佪佪茴徊回茴徊佪徊徊回徊徊回佪佪徊茴回回回徊茴徊茴回佪回回佪徊回茴徊徊佪回佪茴茴佪徊茴徊佪uaTXXhWVcQ.getStyle().withColor(TextColor.fromRgb(((SettingColor)メノメノノメメノノメメノメメメノメノノノノメメノメノメメメdoEUqghvnB.fd_Setting_38.get()).getPacked()))));
      }

      if ((Boolean)メノメノノメメノノメメノメメメノメノノノノメメノメノメメメdoEUqghvnB.fd_Setting_36.get() && !(Boolean)メノメノノメメノノメメノメメメノメノノノノメメノメノメメメdoEUqghvnB.fd_Setting_31.get()) {
         メノメノノメメノノメメノメメメノメノノノノメメノメノメメメdoEUqghvnB.fd_RainbowColor_39.setSpeed((Double)メノメノノメメノノメメノメメメノメノノノノメメノメノメメメdoEUqghvnB.qqQpQpQQQQQQPPPqPPQqqpQPqppPPqpppPPPqppQPQpqqQpPppQPPQqpqpqPpqPpQPqpppqPpqQQPpPQqppqppqQQpPpqpppqqqQpppqqQqpPppqPqPqqqPqQq.get() / 100.0D);
         int 鵞鹅鵞鹅鵞鹅鹅鹅鹅鹅鵞鹅鹅鵞鹅鹅鹅鵞鹅鵞鵞鵞鹅鵞鵞鵞鵞鹅鹅鹅鹅鹅鵞鹅鵞鵞鵞鹅鵞鵞鵞鵞鹅鵞鵞鹅鹅鹅鵞鹅鵞鵞鵞鵞鵞鹅鹅鵞鵞鵞鹅鵞鵞鵞鵞鹅鹅鵞鵞鵞鹅鹅鹅鹅鵞鵞鹅鵞鵞鹅鹅鵞鵞鵞鹅鵞鹅鹅鹅鹅鵞鵞鹅鹅鹅鹅鹅鵞鹅鹅鹅鹅鵞鵞鹅鹅鹅鵞鹅鹅鹅鵞鵞XBzRSxxhyE = 0;

         for(int QqPQQPQqQQQppQQPQpPPqQQQpppPPqpPPqpPQPzDQReNOHxT = ㇸ乀乀へㇸへ乀ㇸㇸへㇸㇸㇸㇸㇸへ乀乀ㇸ乀乀ㇸへㇸ乀ㇸへ乀へㇸㇸㇸㇸへ乀ㇸ乀へ乀ㇸ乀乀乀ㇸ乀ㇸへ乀へㇸ乀へ乀乀ㇸㇸㇸ乀乀へへ乀ㇸㇸへへgAgJGqsYVf.length(); 鵞鹅鵞鹅鵞鹅鹅鹅鹅鹅鵞鹅鹅鵞鹅鹅鹅鵞鹅鵞鵞鵞鹅鵞鵞鵞鵞鹅鹅鹅鹅鹅鵞鹅鵞鵞鵞鹅鵞鵞鵞鵞鹅鵞鵞鹅鹅鹅鵞鹅鵞鵞鵞鵞鵞鹅鹅鵞鵞鵞鹅鵞鵞鵞鵞鹅鹅鵞鵞鵞鹅鹅鹅鹅鵞鵞鹅鵞鵞鹅鹅鵞鵞鵞鹅鵞鹅鹅鹅鹅鵞鵞鹅鹅鹅鹅鹅鵞鹅鹅鹅鹅鵞鵞鹅鹅鹅鵞鹅鹅鹅鵞鵞XBzRSxxhyE < QqPQQPQqQQQppQQPQpPPqQQQpppPPqpPPqpPQPzDQReNOHxT; ++鵞鹅鵞鹅鵞鹅鹅鹅鹅鹅鵞鹅鹅鵞鹅鹅鹅鵞鹅鵞鵞鵞鹅鵞鵞鵞鵞鹅鹅鹅鹅鹅鵞鹅鵞鵞鵞鹅鵞鵞鵞鵞鹅鵞鵞鹅鹅鹅鵞鹅鵞鵞鵞鵞鵞鹅鹅鵞鵞鵞鹅鵞鵞鵞鵞鹅鹅鵞鵞鵞鹅鹅鹅鹅鵞鵞鹅鵞鵞鹅鹅鵞鵞鵞鹅鵞鹅鹅鹅鹅鵞鵞鹅鹅鹅鹅鹅鵞鹅鹅鹅鹅鵞鵞鹅鹅鹅鵞鹅鹅鹅鵞鵞XBzRSxxhyE) {
            茴佪徊徊回茴徊回徊回回茴茴回茴回茴回茴回徊佪回徊徊回佪回回回徊回佪佪徊徊茴茴回徊徊徊徊佪徊茴佪佪茴徊回茴徊佪徊徊回徊徊回佪佪徊茴回回回徊茴徊茴回佪回回佪徊回茴徊徊佪回佪茴茴佪徊茴徊佪uaTXXhWVcQ.append(Text.literal(String.valueOf(ㇸ乀乀へㇸへ乀ㇸㇸへㇸㇸㇸㇸㇸへ乀乀ㇸ乀乀ㇸへㇸ乀ㇸへ乀へㇸㇸㇸㇸへ乀ㇸ乀へ乀ㇸ乀乀乀ㇸ乀ㇸへ乀へㇸ乀へ乀乀ㇸㇸㇸ乀乀へへ乀ㇸㇸへへgAgJGqsYVf.charAt(鵞鹅鵞鹅鵞鹅鹅鹅鹅鹅鵞鹅鹅鵞鹅鹅鹅鵞鹅鵞鵞鵞鹅鵞鵞鵞鵞鹅鹅鹅鹅鹅鵞鹅鵞鵞鵞鹅鵞鵞鵞鵞鹅鵞鵞鹅鹅鹅鵞鹅鵞鵞鵞鵞鵞鹅鹅鵞鵞鵞鹅鵞鵞鵞鵞鹅鹅鵞鵞鵞鹅鹅鹅鹅鵞鵞鹅鵞鵞鹅鹅鵞鵞鵞鹅鵞鹅鹅鹅鹅鵞鵞鹅鹅鹅鹅鹅鵞鹅鹅鹅鹅鵞鵞鹅鹅鹅鵞鹅鹅鹅鵞鵞XBzRSxxhyE)))).setStyle(茴佪徊徊回茴徊回徊回回茴茴回茴回茴回茴回徊佪回徊徊回佪回回回徊回佪佪徊徊茴茴回徊徊徊徊佪徊茴佪佪茴徊回茴徊佪徊徊回徊徊回佪佪徊茴回回回徊茴徊茴回佪回回佪徊回茴徊徊佪回佪茴茴佪徊茴徊佪uaTXXhWVcQ.getStyle().withColor(TextColor.fromRgb(メノメノノメメノノメメノメメメノメノノノノメメノメノメメメdoEUqghvnB.fd_RainbowColor_39.getNext().getPacked())));
         }
      }

      if (!(Boolean)メノメノノメメノノメメノメメメノメノノノノメメノメノメメメdoEUqghvnB.fd_Setting_31.get() && !(Boolean)メノメノノメメノノメメノメメメノメノノノノメメノメノメメメdoEUqghvnB.fd_Setting_36.get()) {
         if ((Boolean)メノメノノメメノノメメノメメメノメノノノノメメノメノメメメdoEUqghvnB.fd_Setting_40.get()) {
            茴佪徊徊回茴徊回徊回回茴茴回茴回茴回茴回徊佪回徊徊回佪回回回徊回佪佪徊徊茴茴回徊徊徊徊佪徊茴佪佪茴徊回茴徊佪徊徊回徊徊回佪佪徊茴回回回徊茴徊茴回佪回回佪徊回茴徊徊佪回佪茴茴佪徊茴徊佪uaTXXhWVcQ.append((String)メノメノノメメノノメメノメメメノメノノノノメメノメノメメメdoEUqghvnB.fd_Setting_42.get());
         } else {
            茴佪徊徊回茴徊回徊回回茴茴回茴回茴回茴回徊佪回徊徊回佪回回回徊回佪佪徊徊茴茴回徊徊徊徊佪徊茴佪佪茴徊回茴徊佪徊徊回徊徊回佪佪徊茴回回回徊茴徊茴回佪回回佪徊回茴徊徊佪回佪茴茴佪徊茴徊佪uaTXXhWVcQ.append("Ion");
         }

         茴佪徊徊回茴徊回徊回回茴茴回茴回茴回茴回徊佪回徊徊回佪回回回徊回佪佪徊徊茴茴回徊徊徊徊佪徊茴佪佪茴徊回茴徊佪徊徊回徊徊回佪佪徊茴回回回徊茴徊茴回佪回回佪徊回茴徊徊佪回佪茴茴佪徊茴徊佪uaTXXhWVcQ.setStyle(茴佪徊徊回茴徊回徊回回茴茴回茴回茴回茴回徊佪回徊徊回佪回回回徊回佪佪徊徊茴茴回徊徊徊徊佪徊茴佪佪茴徊回茴徊佪徊徊回徊徊回佪佪徊茴回回回徊茴徊茴回佪回回佪徊回茴徊徊佪回佪茴茴佪徊茴徊佪uaTXXhWVcQ.getStyle().withFormatting(Formatting.RED));
      }

      if ((Boolean)メノメノノメメノノメメノメメメノメノノノノメメノメノメメメdoEUqghvnB.fd_Setting_44.get()) {
         if ((Boolean)メノメノノメメノノメメノメメメノメノノノノメメノメノメメメdoEUqghvnB.fd_Setting_31.get() && !(Boolean)メノメノノメメノノメメノメメメノメノノノノメメノメノメメメdoEUqghvnB.fd_Setting_36.get()) {
            炎火燚火火燚焱炎炎火炏炏炎燚火欻燚炎炎欻炏欻炎炏火燚燚欻焱燚炎火欻欻火火焱焱炎欻燚燚燚炏欻炎炏炏火欻火火焱火焱欻炏炏火燚欻燚燚炏焱燚燚燚焱炎炏炎燚焱燚火欻火欻焱焱欻焱火炏欻燚焱火火欻欻炏火火KWRcxLYdUh.setStyle(炎火燚火火燚焱炎炎火炏炏炎燚火欻燚炎炎欻炏欻炎炏火燚燚欻焱燚炎火欻欻火火焱焱炎欻燚燚燚炏欻炎炏炏火欻火火焱火焱欻炏炏火燚欻燚燚炏焱燚燚燚焱炎炏炎燚焱燚火欻火欻焱焱欻焱火炏欻燚焱火火欻欻炏火火KWRcxLYdUh.getStyle().withColor(TextColor.fromRgb(((SettingColor)メノメノノメメノノメメノメメメノメノノノノメメノメノメメメdoEUqghvnB.fd_Setting_38.get()).getPacked())));
         }

         if ((Boolean)メノメノノメメノノメメノメメメノメノノノノメメノメノメメメdoEUqghvnB.fd_Setting_36.get() && !(Boolean)メノメノノメメノノメメノメメメノメノノノノメメノメノメメメdoEUqghvnB.fd_Setting_31.get()) {
            メノメノノメメノノメメノメメメノメノノノノメメノメノメメメdoEUqghvnB.fd_RainbowColor_39.setSpeed((Double)メノメノノメメノノメメノメメメノメノノノノメメノメノメメメdoEUqghvnB.qqQpQpQQQQQQPPPqPPQqqpQPqppPPqpppPPPqppQPQpqqQpPppQPPQqpqpqPpqPpQPqpppqPpqQQPpPQqppqppqQQpPpqpppqqqQpppqqQqpPppqPqPqqqPqQq.get() / 100.0D);
            炎火燚火火燚焱炎炎火炏炏炎燚火欻燚炎炎欻炏欻炎炏火燚燚欻焱燚炎火欻欻火火焱焱炎欻燚燚燚炏欻炎炏炏火欻火火焱火焱欻炏炏火燚欻燚燚炏焱燚燚燚焱炎炏炎燚焱燚火欻火欻焱焱欻焱火炏欻燚焱火火欻欻炏火火KWRcxLYdUh.setStyle(炎火燚火火燚焱炎炎火炏炏炎燚火欻燚炎炎欻炏欻炎炏火燚燚欻焱燚炎火欻欻火火焱焱炎欻燚燚燚炏欻炎炏炏火欻火火焱火焱欻炏炏火燚欻燚燚炏焱燚燚燚焱炎炏炎燚焱燚火欻火欻焱焱欻焱火炏欻燚焱火火欻欻炏火火KWRcxLYdUh.getStyle().withColor(TextColor.fromRgb(メノメノノメメノノメメノメメメノメノノノノメメノメノメメメdoEUqghvnB.fd_RainbowColor_39.getNext().getPacked())));
         }

         if ((Boolean)メノメノノメメノノメメノメメメノメノノノノメメノメノメメメdoEUqghvnB.fd_Setting_33.get()) {
            炎火燚火火燚焱炎炎火炏炏炎燚火欻燚炎炎欻炏欻炎炏火燚燚欻焱燚炎火欻欻火火焱焱炎欻燚燚燚炏欻炎炏炏火欻火火焱火焱欻炏炏火燚欻燚燚炏焱燚燚燚焱炎炏炎燚焱燚火欻火欻焱焱欻焱火炏欻燚焱火火欻欻炏火火KWRcxLYdUh.append((String)メノメノノメメノノメメノメメメノメノノノノメメノメノメメメdoEUqghvnB.fd_Setting_45.get());
            炎火燚火火燚焱炎炎火炏炏炎燚火欻燚炎炎欻炏欻炎炏火燚燚欻焱燚炎火欻欻火火焱焱炎欻燚燚燚炏欻炎炏炏火欻火火焱火焱欻炏炏火燚欻燚燚炏焱燚燚燚焱炎炏炎燚焱燚火欻火欻焱焱欻焱火炏欻燚焱火火欻欻炏火火KWRcxLYdUh.append(茴佪徊徊回茴徊回徊回回茴茴回茴回茴回茴回徊佪回徊徊回佪回回回徊回佪佪徊徊茴茴回徊徊徊徊佪徊茴佪佪茴徊回茴徊佪徊徊回徊徊回佪佪徊茴回回回徊茴徊茴回佪回回佪徊回茴徊徊佪回佪茴茴佪徊茴徊佪uaTXXhWVcQ);
            炎火燚火火燚焱炎炎火炏炏炎燚火欻燚炎炎欻炏欻炎炏火燚燚欻焱燚炎火欻欻火火焱焱炎欻燚燚燚炏欻炎炏炏火欻火火焱火焱欻炏炏火燚欻燚燚炏焱燚燚燚焱炎炏炎燚焱燚火欻火欻焱焱欻焱火炏欻燚焱火火欻欻炏火火KWRcxLYdUh.append((String)メノメノノメメノノメメノメメメノメノノノノメメノメノメメメdoEUqghvnB.fd_Setting_41.get() + " ");
         } else {
            炎火燚火火燚焱炎炎火炏炏炎燚火欻燚炎炎欻炏欻炎炏火燚燚欻焱燚炎火欻欻火火焱焱炎欻燚燚燚炏欻炎炏炏火欻火火焱火焱欻炏炏火燚欻燚燚炏焱燚燚燚焱炎炏炎燚焱燚火欻火欻焱焱欻焱火炏欻燚焱火火欻欻炏火火KWRcxLYdUh.append("[");
            炎火燚火火燚焱炎炎火炏炏炎燚火欻燚炎炎欻炏欻炎炏火燚燚欻焱燚炎火欻欻火火焱焱炎欻燚燚燚炏欻炎炏炏火欻火火焱火焱欻炏炏火燚欻燚燚炏焱燚燚燚焱炎炏炎燚焱燚火欻火欻焱焱欻焱火炏欻燚焱火火欻欻炏火火KWRcxLYdUh.append(茴佪徊徊回茴徊回徊回回茴茴回茴回茴回茴回徊佪回徊徊回佪回回回徊回佪佪徊徊茴茴回徊徊徊徊佪徊茴佪佪茴徊回茴徊佪徊徊回徊徊回佪佪徊茴回回回徊茴徊茴回佪回回佪徊回茴徊徊佪回佪茴茴佪徊茴徊佪uaTXXhWVcQ);
            炎火燚火火燚焱炎炎火炏炏炎燚火欻燚炎炎欻炏欻炎炏火燚燚欻焱燚炎火欻欻火火焱焱炎欻燚燚燚炏欻炎炏炏火欻火火焱火焱欻炏炏火燚欻燚燚炏焱燚燚燚焱炎炏炎燚焱燚火欻火欻焱焱欻焱火炏欻燚焱火火欻欻炏火火KWRcxLYdUh.append("] ");
         }
      } else {
         炎火燚火火燚焱炎炎火炏炏炎燚火欻燚炎炎欻炏欻炎炏火燚燚欻焱燚炎火欻欻火火焱焱炎欻燚燚燚炏欻炎炏炏火欻火火焱火焱欻炏炏火燚欻燚燚炏焱燚燚燚焱炎炏炎燚焱燚火欻火欻焱焱欻焱火炏欻燚焱火火欻欻炏火火KWRcxLYdUh.setStyle(炎火燚火火燚焱炎炎火炏炏炎燚火欻燚炎炎欻炏欻炎炏火燚燚欻焱燚炎火欻欻火火焱焱炎欻燚燚燚炏欻炎炏炏火欻火火焱火焱欻炏炏火燚欻燚燚炏焱燚燚燚焱炎炏炎燚焱燚火欻火欻焱焱欻焱火炏欻燚焱火火欻欻炏火火KWRcxLYdUh.getStyle().withFormatting(Formatting.GRAY));
         炎火燚火火燚焱炎炎火炏炏炎燚火欻燚炎炎欻炏欻炎炏火燚燚欻焱燚炎火欻欻火火焱焱炎欻燚燚燚炏欻炎炏炏火欻火火焱火焱欻炏炏火燚欻燚燚炏焱燚燚燚焱炎炏炎燚焱燚火欻火欻焱焱欻焱火炏欻燚焱火火欻欻炏火火KWRcxLYdUh.append("[");
         炎火燚火火燚焱炎炎火炏炏炎燚火欻燚炎炎欻炏欻炎炏火燚燚欻焱燚炎火欻欻火火焱焱炎欻燚燚燚炏欻炎炏炏火欻火火焱火焱欻炏炏火燚欻燚燚炏焱燚燚燚焱炎炏炎燚焱燚火欻火欻焱焱欻焱火炏欻燚焱火火欻欻炏火火KWRcxLYdUh.append(茴佪徊徊回茴徊回徊回回茴茴回茴回茴回茴回徊佪回徊徊回佪回回回徊回佪佪徊徊茴茴回徊徊徊徊佪徊茴佪佪茴徊回茴徊佪徊徊回徊徊回佪佪徊茴回回回徊茴徊茴回佪回回佪徊回茴徊徊佪回佪茴茴佪徊茴徊佪uaTXXhWVcQ);
         炎火燚火火燚焱炎炎火炏炏炎燚火欻燚炎炎欻炏欻炎炏火燚燚欻焱燚炎火欻欻火火焱焱炎欻燚燚燚炏欻炎炏炏火欻火火焱火焱欻炏炏火燚欻燚燚炏焱燚燚燚焱炎炏炎燚焱燚火欻火欻焱焱欻焱火炏欻燚焱火火欻欻炏火火KWRcxLYdUh.append("] ");
      }

      return 炎火燚火火燚焱炎炎火炏炏炎燚火欻燚炎炎欻炏欻炎炏火燚燚欻焱燚炎火欻欻火火焱焱炎欻燚燚燚炏欻炎炏炏火欻火火焱火焱欻炏炏火燚欻燚燚炏焱燚燚燚焱炎炏炎燚焱燚火欻火欻焱焱欻焱火炏欻燚焱火火欻欻炏火火KWRcxLYdUh;
   }

   @EventHandler
   private void onMessageSend(SendMessageEvent 亖亖一亖一二二二二二二三三亖三三亖二二一亖二二三亖一一三二一一亖一二三二三一二mTOYsRUNQG) {
      String 垚洼茥烓土烓烓澆㙓土澆洼圭土圭茥洼澆垚洼洼茥烓澆洼桂垚土土圭桂洼茥圭澆烓垚澆圭桂㙓桂桂澆烓洼烓土烓圭澆土烓茥茥烓洼茥桂烓土茥㙓圭澆澆茥㙓㙓土土澆澆烓烓㙓垚烓圭洼桂洼垚洼㙓澆桂澆垚土洼桂圭垚圭垚洼土㙓洼㙓茥洼土茥茥茥澆eATQfiDmJe = 沝㵘㵘㵘沝沝沝淼㵘水水淼沝淼㵘㵘水沝水沝㵘水水淼沝水㵘淼㵘淼淼沝㵘沝㵘沝沝淼沝水水㵘水淼水㵘水㵘㵘沝淼沝淼沝㵘水沝水沝淼淼沝水淼水水淼淼淼水淼沝hUGqOkUlVl.message;
      if ((Boolean)㵘㵘沝淼㵘㵘淼沝淼沝沝沝沝㵘㵘㵘沝水淼淼㵘水沝淼㵘淼淼㵘沝水㵘淼㵘淼㵘水沝淼沝㵘沝沝水淼沝水㵘沝水淼沝水沝淼沝水水水水淼淼水㵘沝㵘淼沝水淼淼淼沝水淼㵘淼沝沝淼㵘沝水沝沝水㵘水水水㵘TOimgIZPAL.fd_Setting_32.get()) {
         垚洼茥烓土烓烓澆㙓土澆洼圭土圭茥洼澆垚洼洼茥烓澆洼桂垚土土圭桂洼茥圭澆烓垚澆圭桂㙓桂桂澆烓洼烓土烓圭澆土烓茥茥烓洼茥桂烓土茥㙓圭澆澆茥㙓㙓土土澆澆烓烓㙓垚烓圭洼桂洼垚洼㙓澆桂澆垚土洼桂圭垚圭垚洼土㙓洼㙓茥洼土茥茥茥澆eATQfiDmJe = Class4.apply(垚洼茥烓土烓烓澆㙓土澆洼圭土圭茥洼澆垚洼洼茥烓澆洼桂垚土土圭桂洼茥圭澆烓垚澆圭桂㙓桂桂澆烓洼烓土烓圭澆土烓茥茥烓洼茥桂烓土茥㙓圭澆澆茥㙓㙓土土澆澆烓烓㙓垚烓圭洼桂洼垚洼㙓澆桂澆垚土洼桂圭垚圭垚洼土㙓洼㙓茥洼土茥茥茥澆eATQfiDmJe);
      }

      沝㵘㵘㵘沝沝沝淼㵘水水淼沝淼㵘㵘水沝水沝㵘水水淼沝水㵘淼㵘淼淼沝㵘沝㵘沝沝淼沝水水㵘水淼水㵘水㵘㵘沝淼沝淼沝㵘水沝水沝淼淼沝水淼水水淼淼淼水淼沝hUGqOkUlVl.message = 垚洼茥烓土烓烓澆㙓土澆洼圭土圭茥洼澆垚洼洼茥烓澆洼桂垚土土圭桂洼茥圭澆烓垚澆圭桂㙓桂桂澆烓洼烓土烓圭澆土烓茥茥烓洼茥桂烓土茥㙓圭澆澆茥㙓㙓土土澆澆烓烓㙓垚烓圭洼桂洼垚洼㙓澆桂澆垚土洼桂圭垚圭垚洼土㙓洼㙓茥洼土茥茥茥澆eATQfiDmJe;
   }

   public BetterChatPlus() {
      super(Class68.fd_Category_1059, "better-chat-plus", "Various chat improvements.");
      沝水淼沝沝淼㵘淼㵘淼沝㵘水淼水沝沝沝淼水淼淼沝沝淼㵘水㵘淼沝㵘㵘淼水沝㵘水水㵘淼淼水淼㵘淼淼淼㵘㵘沝水淼水沝淼沝㵘淼水淼淼㵘沝水水㵘沝淼沝淼㵘沝淼淼水水沝水㵘淼淼㵘水㵘水㵘水㵘㵘㵘㵘淼沝水淼㵘㵘淼水㵘㵘淼淼水TITnFXuYwI.fd_SettingGroup_43 = 沝水淼沝沝淼㵘淼㵘淼沝㵘水淼水沝沝沝淼水淼淼沝沝淼㵘水㵘淼沝㵘㵘淼水沝㵘水水㵘淼淼水淼㵘淼淼淼㵘㵘沝水淼水沝淼沝㵘淼水淼淼㵘沝水水㵘沝淼沝淼㵘沝淼淼水水沝水㵘淼淼㵘水㵘水㵘水㵘㵘㵘㵘淼沝水淼㵘㵘淼水㵘㵘淼淼水TITnFXuYwI.settings.getDefaultGroup();
      沝水淼沝沝淼㵘淼㵘淼沝㵘水淼水沝沝沝淼水淼淼沝沝淼㵘水㵘淼沝㵘㵘淼水沝㵘水水㵘淼淼水淼㵘淼淼淼㵘㵘沝水淼水沝淼沝㵘淼水淼淼㵘沝水水㵘沝淼沝淼㵘沝淼淼水水沝水㵘淼淼㵘水㵘水㵘水㵘㵘㵘㵘淼沝水淼㵘㵘淼水㵘㵘淼淼水TITnFXuYwI.fd_Setting_32 = 沝水淼沝沝淼㵘淼㵘淼沝㵘水淼水沝沝沝淼水淼淼沝沝淼㵘水㵘淼沝㵘㵘淼水沝㵘水水㵘淼淼水淼㵘淼淼淼㵘㵘沝水淼水沝淼沝㵘淼水淼淼㵘沝水水㵘沝淼沝淼㵘沝淼淼水水沝水㵘淼淼㵘水㵘水㵘水㵘㵘㵘㵘淼沝水淼㵘㵘淼水㵘㵘淼淼水TITnFXuYwI.fd_SettingGroup_43.add(((Builder)((Builder)((Builder)(new Builder()).name("emotes")).description("Enables the Ion emote system.")).defaultValue(false)).build());
      沝水淼沝沝淼㵘淼㵘淼沝㵘水淼水沝沝沝淼水淼淼沝沝淼㵘水㵘淼沝㵘㵘淼水沝㵘水水㵘淼淼水淼㵘淼淼淼㵘㵘沝水淼水沝淼沝㵘淼水淼淼㵘沝水水㵘沝淼沝淼㵘沝淼淼水水沝水㵘淼淼㵘水㵘水㵘水㵘㵘㵘㵘淼沝水淼㵘㵘淼水㵘㵘淼淼水TITnFXuYwI.fd_Setting_40 = 沝水淼沝沝淼㵘淼㵘淼沝㵘水淼水沝沝沝淼水淼淼沝沝淼㵘水㵘淼沝㵘㵘淼水沝㵘水水㵘淼淼水淼㵘淼淼淼㵘㵘沝水淼水沝淼沝㵘淼水淼淼㵘沝水水㵘沝淼沝淼㵘沝淼淼水水沝水㵘淼淼㵘水㵘水㵘水㵘㵘㵘㵘淼沝水淼㵘㵘淼水㵘㵘淼淼水TITnFXuYwI.fd_SettingGroup_43.add(((Builder)((Builder)((Builder)(new Builder()).name("custom-prefix")).description("Lets you set a custom prefix.")).defaultValue(false)).build());
      SettingGroup var10001 = 沝水淼沝沝淼㵘淼㵘淼沝㵘水淼水沝沝沝淼水淼淼沝沝淼㵘水㵘淼沝㵘㵘淼水沝㵘水水㵘淼淼水淼㵘淼淼淼㵘㵘沝水淼水沝淼沝㵘淼水淼淼㵘沝水水㵘沝淼沝淼㵘沝淼淼水水沝水㵘淼淼㵘水㵘水㵘水㵘㵘㵘㵘淼沝水淼㵘㵘淼水㵘㵘淼淼水TITnFXuYwI.fd_SettingGroup_43;
      Builder var10002 = (Builder)((Builder)((Builder)(new Builder()).name("override-default")).description("Overrides the default meteor prefix.")).defaultValue(false);
      Setting var10003 = 沝水淼沝沝淼㵘淼㵘淼沝㵘水淼水沝沝沝淼水淼淼沝沝淼㵘水㵘淼沝㵘㵘淼水沝㵘水水㵘淼淼水淼㵘淼淼淼㵘㵘沝水淼水沝淼沝㵘淼水淼淼㵘沝水水㵘沝淼沝淼㵘沝淼淼水水沝水㵘淼淼㵘水㵘水㵘水㵘㵘㵘㵘淼沝水淼㵘㵘淼水㵘㵘淼淼水TITnFXuYwI.fd_Setting_40;
      Objects.requireNonNull(var10003);
      沝水淼沝沝淼㵘淼㵘淼沝㵘水淼水沝沝沝淼水淼淼沝沝淼㵘水㵘淼沝㵘㵘淼水沝㵘水水㵘淼淼水淼㵘淼淼淼㵘㵘沝水淼水沝淼沝㵘淼水淼淼㵘沝水水㵘沝淼沝淼㵘沝淼淼水水沝水㵘淼淼㵘水㵘水㵘水㵘㵘㵘㵘淼沝水淼㵘㵘淼水㵘㵘淼淼水TITnFXuYwI.fd_Setting_46 = var10001.add(((Builder)var10002.visible(var10003::get)).build());
      var10001 = 沝水淼沝沝淼㵘淼㵘淼沝㵘水淼水沝沝沝淼水淼淼沝沝淼㵘水㵘淼沝㵘㵘淼水沝㵘水水㵘淼淼水淼㵘淼淼淼㵘㵘沝水淼水沝淼沝㵘淼水淼淼㵘沝水水㵘沝淼沝淼㵘沝淼淼水水沝水㵘淼淼㵘水㵘水㵘水㵘㵘㵘㵘淼沝水淼㵘㵘淼水㵘㵘淼淼水TITnFXuYwI.fd_SettingGroup_43;
      meteordevelopment.meteorclient.settings.StringSetting.Builder var1 = (meteordevelopment.meteorclient.settings.StringSetting.Builder)((meteordevelopment.meteorclient.settings.StringSetting.Builder)((meteordevelopment.meteorclient.settings.StringSetting.Builder)(new meteordevelopment.meteorclient.settings.StringSetting.Builder()).name("custom-prefix-text")).description("Override the [Ion] prefix.")).defaultValue("Ion");
      var10003 = 沝水淼沝沝淼㵘淼㵘淼沝㵘水淼水沝沝沝淼水淼淼沝沝淼㵘水㵘淼沝㵘㵘淼水沝㵘水水㵘淼淼水淼㵘淼淼淼㵘㵘沝水淼水沝淼沝㵘淼水淼淼㵘沝水水㵘沝淼沝淼㵘沝淼淼水水沝水㵘淼淼㵘水㵘水㵘水㵘㵘㵘㵘淼沝水淼㵘㵘淼水㵘㵘淼淼水TITnFXuYwI.fd_Setting_40;
      Objects.requireNonNull(var10003);
      沝水淼沝沝淼㵘淼㵘淼沝㵘水淼水沝沝沝淼水淼淼沝沝淼㵘水㵘淼沝㵘㵘淼水沝㵘水水㵘淼淼水淼㵘淼淼淼㵘㵘沝水淼水沝淼沝㵘淼水淼淼㵘沝水水㵘沝淼沝淼㵘沝淼淼水水沝水㵘淼淼㵘水㵘水㵘水㵘㵘㵘㵘淼沝水淼㵘㵘淼水㵘㵘淼淼水TITnFXuYwI.fd_Setting_42 = var10001.add(((meteordevelopment.meteorclient.settings.StringSetting.Builder)var1.visible(var10003::get)).build());
      沝水淼沝沝淼㵘淼㵘淼沝㵘水淼水沝沝沝淼水淼淼沝沝淼㵘水㵘淼沝㵘㵘淼水沝㵘水水㵘淼淼水淼㵘淼淼淼㵘㵘沝水淼水沝淼沝㵘淼水淼淼㵘沝水水㵘沝淼沝淼㵘沝淼淼水水沝水㵘淼淼㵘水㵘水㵘水㵘㵘㵘㵘淼沝水淼㵘㵘淼水㵘㵘淼淼水TITnFXuYwI.fd_Setting_31 = 沝水淼沝沝淼㵘淼㵘淼沝㵘水淼水沝沝沝淼水淼淼沝沝淼㵘水㵘淼沝㵘㵘淼水沝㵘水水㵘淼淼水淼㵘淼淼淼㵘㵘沝水淼水沝淼沝㵘淼水淼淼㵘沝水水㵘沝淼沝淼㵘沝淼淼水水沝水㵘淼淼㵘水㵘水㵘水㵘㵘㵘㵘淼沝水淼㵘㵘淼水㵘㵘淼淼水TITnFXuYwI.fd_SettingGroup_43.add(((Builder)((Builder)((Builder)(new Builder()).name("custom-prefix-color")).description("Lets you set a custom prefix.")).defaultValue(false)).build());
      var10001 = 沝水淼沝沝淼㵘淼㵘淼沝㵘水淼水沝沝沝淼水淼淼沝沝淼㵘水㵘淼沝㵘㵘淼水沝㵘水水㵘淼淼水淼㵘淼淼淼㵘㵘沝水淼水沝淼沝㵘淼水淼淼㵘沝水水㵘沝淼沝淼㵘沝淼淼水水沝水㵘淼淼㵘水㵘水㵘水㵘㵘㵘㵘淼沝水淼㵘㵘淼水㵘㵘淼淼水TITnFXuYwI.fd_SettingGroup_43;
      meteordevelopment.meteorclient.settings.ColorSetting.Builder var2 = (meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)(new meteordevelopment.meteorclient.settings.ColorSetting.Builder()).name("prefix-color")).description("Color of the prefix text.")).defaultValue(new SettingColor(255, 255, 255));
      var10003 = 沝水淼沝沝淼㵘淼㵘淼沝㵘水淼水沝沝沝淼水淼淼沝沝淼㵘水㵘淼沝㵘㵘淼水沝㵘水水㵘淼淼水淼㵘淼淼淼㵘㵘沝水淼水沝淼沝㵘淼水淼淼㵘沝水水㵘沝淼沝淼㵘沝淼淼水水沝水㵘淼淼㵘水㵘水㵘水㵘㵘㵘㵘淼沝水淼㵘㵘淼水㵘㵘淼淼水TITnFXuYwI.fd_Setting_31;
      Objects.requireNonNull(var10003);
      沝水淼沝沝淼㵘淼㵘淼沝㵘水淼水沝沝沝淼水淼淼沝沝淼㵘水㵘淼沝㵘㵘淼水沝㵘水水㵘淼淼水淼㵘淼淼淼㵘㵘沝水淼水沝淼沝㵘淼水淼淼㵘沝水水㵘沝淼沝淼㵘沝淼淼水水沝水㵘淼淼㵘水㵘水㵘水㵘㵘㵘㵘淼沝水淼㵘㵘淼水㵘㵘淼淼水TITnFXuYwI.fd_Setting_38 = var10001.add(((meteordevelopment.meteorclient.settings.ColorSetting.Builder)var2.visible(var10003::get)).build());
      沝水淼沝沝淼㵘淼㵘淼沝㵘水淼水沝沝沝淼水淼淼沝沝淼㵘水㵘淼沝㵘㵘淼水沝㵘水水㵘淼淼水淼㵘淼淼淼㵘㵘沝水淼水沝淼沝㵘淼水淼淼㵘沝水水㵘沝淼沝淼㵘沝淼淼水水沝水㵘淼淼㵘水㵘水㵘水㵘㵘㵘㵘淼沝水淼㵘㵘淼水㵘㵘淼淼水TITnFXuYwI.fd_Setting_36 = 沝水淼沝沝淼㵘淼㵘淼沝㵘水淼水沝沝沝淼水淼淼沝沝淼㵘水㵘淼沝㵘㵘淼水沝㵘水水㵘淼淼水淼㵘淼淼淼㵘㵘沝水淼水沝淼沝㵘淼水淼淼㵘沝水水㵘沝淼沝淼㵘沝淼淼水水沝水㵘淼淼㵘水㵘水㵘水㵘㵘㵘㵘淼沝水淼㵘㵘淼水㵘㵘淼淼水TITnFXuYwI.fd_SettingGroup_43.add(((Builder)((Builder)((Builder)(new Builder()).name("chroma-prefix")).description("Lets you set a custom prefix.")).defaultValue(false)).build());
      var10001 = 沝水淼沝沝淼㵘淼㵘淼沝㵘水淼水沝沝沝淼水淼淼沝沝淼㵘水㵘淼沝㵘㵘淼水沝㵘水水㵘淼淼水淼㵘淼淼淼㵘㵘沝水淼水沝淼沝㵘淼水淼淼㵘沝水水㵘沝淼沝淼㵘沝淼淼水水沝水㵘淼淼㵘水㵘水㵘水㵘㵘㵘㵘淼沝水淼㵘㵘淼水㵘㵘淼淼水TITnFXuYwI.fd_SettingGroup_43;
      meteordevelopment.meteorclient.settings.DoubleSetting.Builder var3 = ((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)(new meteordevelopment.meteorclient.settings.DoubleSetting.Builder()).name("chroma-speed")).description("Speed of the chroma animation.")).defaultValue(0.09D).min(0.01D).sliderMax(5.0D).decimalPlaces(2);
      var10003 = 沝水淼沝沝淼㵘淼㵘淼沝㵘水淼水沝沝沝淼水淼淼沝沝淼㵘水㵘淼沝㵘㵘淼水沝㵘水水㵘淼淼水淼㵘淼淼淼㵘㵘沝水淼水沝淼沝㵘淼水淼淼㵘沝水水㵘沝淼沝淼㵘沝淼淼水水沝水㵘淼淼㵘水㵘水㵘水㵘㵘㵘㵘淼沝水淼㵘㵘淼水㵘㵘淼淼水TITnFXuYwI.fd_Setting_36;
      Objects.requireNonNull(var10003);
      沝水淼沝沝淼㵘淼㵘淼沝㵘水淼水沝沝沝淼水淼淼沝沝淼㵘水㵘淼沝㵘㵘淼水沝㵘水水㵘淼淼水淼㵘淼淼淼㵘㵘沝水淼水沝淼沝㵘淼水淼淼㵘沝水水㵘沝淼沝淼㵘沝淼淼水水沝水㵘淼淼㵘水㵘水㵘水㵘㵘㵘㵘淼沝水淼㵘㵘淼水㵘㵘淼淼水TITnFXuYwI.qqQpQpQQQQQQPPPqPPQqqpQPqppPPqpppPPPqppQPQpqqQpPppQPPQqpqpqPpqPpQPqpppqPpqQQPpPQqppqppqQQpPpqpppqqqQpppqqQqpPppqPqPqqqPqQq = var10001.add(((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)var3.visible(var10003::get)).build());
      沝水淼沝沝淼㵘淼㵘淼沝㵘水淼水沝沝沝淼水淼淼沝沝淼㵘水㵘淼沝㵘㵘淼水沝㵘水水㵘淼淼水淼㵘淼淼淼㵘㵘沝水淼水沝淼沝㵘淼水淼淼㵘沝水水㵘沝淼沝淼㵘沝淼淼水水沝水㵘淼淼㵘水㵘水㵘水㵘㵘㵘㵘淼沝水淼㵘㵘淼水㵘㵘淼淼水TITnFXuYwI.fd_Setting_44 = 沝水淼沝沝淼㵘淼㵘淼沝㵘水淼水沝沝沝淼水淼淼沝沝淼㵘水㵘淼沝㵘㵘淼水沝㵘水水㵘淼淼水淼㵘淼淼淼㵘㵘沝水淼水沝淼沝㵘淼水淼淼㵘沝水水㵘沝淼沝淼㵘沝淼淼水水沝水㵘淼淼㵘水㵘水㵘水㵘㵘㵘㵘淼沝水淼㵘㵘淼水㵘㵘淼淼水TITnFXuYwI.fd_SettingGroup_43.add(((Builder)((Builder)((Builder)(new Builder()).name("apply-to-brackets")).description("Apply the current prefix theme to the brackets.")).defaultValue(false)).build());
      沝水淼沝沝淼㵘淼㵘淼沝㵘水淼水沝沝沝淼水淼淼沝沝淼㵘水㵘淼沝㵘㵘淼水沝㵘水水㵘淼淼水淼㵘淼淼淼㵘㵘沝水淼水沝淼沝㵘淼水淼淼㵘沝水水㵘沝淼沝淼㵘沝淼淼水水沝水㵘淼淼㵘水㵘水㵘水㵘㵘㵘㵘淼沝水淼㵘㵘淼水㵘㵘淼淼水TITnFXuYwI.fd_Setting_33 = 沝水淼沝沝淼㵘淼㵘淼沝㵘水淼水沝沝沝淼水淼淼沝沝淼㵘水㵘淼沝㵘㵘淼水沝㵘水水㵘淼淼水淼㵘淼淼淼㵘㵘沝水淼水沝淼沝㵘淼水淼淼㵘沝水水㵘沝淼沝淼㵘沝淼淼水水沝水㵘淼淼㵘水㵘水㵘水㵘㵘㵘㵘淼沝水淼㵘㵘淼水㵘㵘淼淼水TITnFXuYwI.fd_SettingGroup_43.add(((Builder)((Builder)((Builder)(new Builder()).name("custom-brackets")).description("Set custom brackets.")).defaultValue(false)).build());
      var10001 = 沝水淼沝沝淼㵘淼㵘淼沝㵘水淼水沝沝沝淼水淼淼沝沝淼㵘水㵘淼沝㵘㵘淼水沝㵘水水㵘淼淼水淼㵘淼淼淼㵘㵘沝水淼水沝淼沝㵘淼水淼淼㵘沝水水㵘沝淼沝淼㵘沝淼淼水水沝水㵘淼淼㵘水㵘水㵘水㵘㵘㵘㵘淼沝水淼㵘㵘淼水㵘㵘淼淼水TITnFXuYwI.fd_SettingGroup_43;
      var1 = (meteordevelopment.meteorclient.settings.StringSetting.Builder)((meteordevelopment.meteorclient.settings.StringSetting.Builder)((meteordevelopment.meteorclient.settings.StringSetting.Builder)(new meteordevelopment.meteorclient.settings.StringSetting.Builder()).name("left-bracket")).description("")).defaultValue("[");
      var10003 = 沝水淼沝沝淼㵘淼㵘淼沝㵘水淼水沝沝沝淼水淼淼沝沝淼㵘水㵘淼沝㵘㵘淼水沝㵘水水㵘淼淼水淼㵘淼淼淼㵘㵘沝水淼水沝淼沝㵘淼水淼淼㵘沝水水㵘沝淼沝淼㵘沝淼淼水水沝水㵘淼淼㵘水㵘水㵘水㵘㵘㵘㵘淼沝水淼㵘㵘淼水㵘㵘淼淼水TITnFXuYwI.fd_Setting_33;
      Objects.requireNonNull(var10003);
      沝水淼沝沝淼㵘淼㵘淼沝㵘水淼水沝沝沝淼水淼淼沝沝淼㵘水㵘淼沝㵘㵘淼水沝㵘水水㵘淼淼水淼㵘淼淼淼㵘㵘沝水淼水沝淼沝㵘淼水淼淼㵘沝水水㵘沝淼沝淼㵘沝淼淼水水沝水㵘淼淼㵘水㵘水㵘水㵘㵘㵘㵘淼沝水淼㵘㵘淼水㵘㵘淼淼水TITnFXuYwI.fd_Setting_45 = var10001.add(((meteordevelopment.meteorclient.settings.StringSetting.Builder)var1.visible(var10003::get)).build());
      var10001 = 沝水淼沝沝淼㵘淼㵘淼沝㵘水淼水沝沝沝淼水淼淼沝沝淼㵘水㵘淼沝㵘㵘淼水沝㵘水水㵘淼淼水淼㵘淼淼淼㵘㵘沝水淼水沝淼沝㵘淼水淼淼㵘沝水水㵘沝淼沝淼㵘沝淼淼水水沝水㵘淼淼㵘水㵘水㵘水㵘㵘㵘㵘淼沝水淼㵘㵘淼水㵘㵘淼淼水TITnFXuYwI.fd_SettingGroup_43;
      var1 = (meteordevelopment.meteorclient.settings.StringSetting.Builder)((meteordevelopment.meteorclient.settings.StringSetting.Builder)((meteordevelopment.meteorclient.settings.StringSetting.Builder)(new meteordevelopment.meteorclient.settings.StringSetting.Builder()).name("right-bracket")).description("")).defaultValue("]");
      var10003 = 沝水淼沝沝淼㵘淼㵘淼沝㵘水淼水沝沝沝淼水淼淼沝沝淼㵘水㵘淼沝㵘㵘淼水沝㵘水水㵘淼淼水淼㵘淼淼淼㵘㵘沝水淼水沝淼沝㵘淼水淼淼㵘沝水水㵘沝淼沝淼㵘沝淼淼水水沝水㵘淼淼㵘水㵘水㵘水㵘㵘㵘㵘淼沝水淼㵘㵘淼水㵘㵘淼淼水TITnFXuYwI.fd_Setting_33;
      Objects.requireNonNull(var10003);
      沝水淼沝沝淼㵘淼㵘淼沝㵘水淼水沝沝沝淼水淼淼沝沝淼㵘水㵘淼沝㵘㵘淼水沝㵘水水㵘淼淼水淼㵘淼淼淼㵘㵘沝水淼水沝淼沝㵘淼水淼淼㵘沝水水㵘沝淼沝淼㵘沝淼淼水水沝水㵘淼淼㵘水㵘水㵘水㵘㵘㵘㵘淼沝水淼㵘㵘淼水㵘㵘淼淼水TITnFXuYwI.fd_Setting_41 = var10001.add(((meteordevelopment.meteorclient.settings.StringSetting.Builder)var1.visible(var10003::get)).build());
      沝水淼沝沝淼㵘淼㵘淼沝㵘水淼水沝沝沝淼水淼淼沝沝淼㵘水㵘淼沝㵘㵘淼水沝㵘水水㵘淼淼水淼㵘淼淼淼㵘㵘沝水淼水沝淼沝㵘淼水淼淼㵘沝水水㵘沝淼沝淼㵘沝淼淼水水沝水㵘淼淼㵘水㵘水㵘水㵘㵘㵘㵘淼沝水淼㵘㵘淼水㵘㵘淼淼水TITnFXuYwI.jIlLlIJJIliIiiIiJjIIjiI = 沝水淼沝沝淼㵘淼㵘淼沝㵘水淼水沝沝沝淼水淼淼沝沝淼㵘水㵘淼沝㵘㵘淼水沝㵘水水㵘淼淼水淼㵘淼淼淼㵘㵘沝水淼水沝淼沝㵘淼水淼淼㵘沝水水㵘沝淼沝淼㵘沝淼淼水水沝水㵘淼淼㵘水㵘水㵘水㵘㵘㵘㵘淼沝水淼㵘㵘淼水㵘㵘淼淼水TITnFXuYwI.fd_SettingGroup_43.add(((Builder)((Builder)((Builder)(new Builder()).name("easy-reply")).description("Lets you use /r on every server.")).defaultValue(false)).build());
      var10001 = 沝水淼沝沝淼㵘淼㵘淼沝㵘水淼水沝沝沝淼水淼淼沝沝淼㵘水㵘淼沝㵘㵘淼水沝㵘水水㵘淼淼水淼㵘淼淼淼㵘㵘沝水淼水沝淼沝㵘淼水淼淼㵘沝水水㵘沝淼沝淼㵘沝淼淼水水沝水㵘淼淼㵘水㵘水㵘水㵘㵘㵘㵘淼沝水淼㵘㵘淼水㵘㵘淼淼水TITnFXuYwI.fd_SettingGroup_43;
      var10002 = (Builder)((Builder)((Builder)(new Builder()).name("cancel-reply-errors")).description("Cancels the reply errors.")).defaultValue(true);
      var10003 = 沝水淼沝沝淼㵘淼㵘淼沝㵘水淼水沝沝沝淼水淼淼沝沝淼㵘水㵘淼沝㵘㵘淼水沝㵘水水㵘淼淼水淼㵘淼淼淼㵘㵘沝水淼水沝淼沝㵘淼水淼淼㵘沝水水㵘沝淼沝淼㵘沝淼淼水水沝水㵘淼淼㵘水㵘水㵘水㵘㵘㵘㵘淼沝水淼㵘㵘淼水㵘㵘淼淼水TITnFXuYwI.jIlLlIJJIliIiiIiJjIIjiI;
      Objects.requireNonNull(var10003);
      沝水淼沝沝淼㵘淼㵘淼沝㵘水淼水沝沝沝淼水淼淼沝沝淼㵘水㵘淼沝㵘㵘淼水沝㵘水水㵘淼淼水淼㵘淼淼淼㵘㵘沝水淼水沝淼沝㵘淼水淼淼㵘沝水水㵘沝淼沝淼㵘沝淼淼水水沝水㵘淼淼㵘水㵘水㵘水㵘㵘㵘㵘淼沝水淼㵘㵘淼水㵘㵘淼淼水TITnFXuYwI.fd_Setting_35 = var10001.add(((Builder)var10002.visible(var10003::get)).build());
      沝水淼沝沝淼㵘淼㵘淼沝㵘水淼水沝沝沝淼水淼淼沝沝淼㵘水㵘淼沝㵘㵘淼水沝㵘水水㵘淼淼水淼㵘淼淼淼㵘㵘沝水淼水沝淼沝㵘淼水淼淼㵘沝水水㵘沝淼沝淼㵘沝淼淼水水沝水㵘淼淼㵘水㵘水㵘水㵘㵘㵘㵘淼沝水淼㵘㵘淼水㵘㵘淼淼水TITnFXuYwI.fd_RainbowColor_39 = new RainbowColor();
   }

   public void onActivate() {
      ChatUtils.registerCustomPrefix("me.ghosttypes.ion", LLijiiLLJjjJiJJiILlLLLJJLiIjllilIijlIJLLIljJLJJiJjiJIIiWQxKFiNxAj::getPrefix);
      LLijiiLLJjjJiJJiILlLLLJJLiIjllilIijlIJLLIljJLJJiJjiJIIiWQxKFiNxAj.fd_boolean_37 = false;
      LLijiiLLJjjJiJJiILlLLLJJLiIjllilIijlIJLLIljJLJJiJjiJIIiWQxKFiNxAj.fd_String_34 = null;
   }

   @EventHandler
   private void onPacketSend(Send ゆゅゅゅゅゆゅゆゅゅゅゅゆゅゆゅゅゅゆゆゅゅゅゆゆゆゆゅゅゆゆゅゆotyscuXLAH) {
      Packet var3 = Class42.getPacket(鹅鵞鹅鹅鵞鵞鹅鹅鹅鹅鵞鵞鹅鹅鹅鵞鹅鵞鹅鹅鹅鹅鵞鵞鹅鹅鵞鵞鵞鹅鵞鵞鵞鵞鵞鵞鵞鵞鵞鵞鹅鹅鹅鹅鹅鹅鹅鵞鵞鵞鹅鵞鹅鵞鵞鹅鵞鵞鹅鵞鵞鵞鹅鹅鹅鵞鵞鵞鹅鵞鵞鹅鹅鵞鹅鵞鵞鵞鵞鹅鵞鹅鹅鹅鹅鹅鵞鵞鹅鵞鹅鹅鹅鹅鵞鹅鹅鹅鹅鵞鵞鹅鹅鵞鹅鹅鹅鹅鹅鹅鵞鵞鹅鵞鵞鹅鵞鵞鹅pEEyuoBAtW);
      if (var3 instanceof ChatMessageC2SPacket) {
         ChatMessageC2SPacket 鬬鬬鬭鬬鬬鬭鬭鬭鬬鬭鬬鬬鬬鬭鬭鬭鬭鬬鬬鬭鬭鬬鬭鬭鬭鬬鬬鬭鬬鬬鬭鬭鬭鬭鬭鬬鬬鬭鬭鬬鬭鬬鬬鬭鬬鬬鬭鬭STxmlTqnhJ = (ChatMessageC2SPacket)var3;
         String 回徊茴回回徊茴茴茴徊茴徊佪茴徊佪徊佪回回佪徊茴佪佪茴徊回茴徊佪徊茴徊回茴回回佪回茴茴徊佪茴回佪回徊徊GKCxhyQLhR = 鬬鬬鬭鬬鬬鬭鬭鬭鬬鬭鬬鬬鬬鬭鬭鬭鬭鬬鬬鬭鬭鬬鬭鬭鬭鬬鬬鬭鬬鬬鬭鬭鬭鬭鬭鬬鬬鬭鬭鬬鬭鬬鬬鬭鬬鬬鬭鬭STxmlTqnhJ.getChatMessage();
         if ((Boolean)ょょょょょょょよょょょよょょょよよょよょよよよょよょょょよよょょよょょょょよよよよょょよよょよょょよょよょょょょよよょよょょょょょょょょよょょよよょよょょょよよよょょょょよよょよよよよPPNaMyXSHr.jIlLlIJJIliIiiIiJjIIjiI.get() && ょょょょょょょよょょょよょょょよよょよょよよよょよょょょよよょょよょょょょよよよよょょよよょよょょよょよょょょょよよょよょょょょょょょょよょょよよょよょょょよよよょょょょよよょよよよよPPNaMyXSHr.fd_String_34 != null && ょょょょょょょよょょょよょょょよよょよょよよよょよょょょよよょょよょょょょよよよよょょよよょよょょよょよょょょょよよょよょょょょょょょょよょょよよょよょょょよよよょょょょよよょよよよよPPNaMyXSHr.fd_boolean_37 && 回徊茴回回徊茴茴茴徊茴徊佪茴徊佪徊佪回回佪徊茴佪佪茴徊回茴徊佪徊茴徊回茴回回佪回茴茴徊佪茴回佪回徊徊GKCxhyQLhR.split(" ")[0].equalsIgnoreCase("/r")) {
            鹅鵞鹅鹅鵞鵞鹅鹅鹅鹅鵞鵞鹅鹅鹅鵞鹅鵞鹅鹅鹅鹅鵞鵞鹅鹅鵞鵞鵞鹅鵞鵞鵞鵞鵞鵞鵞鵞鵞鵞鹅鹅鹅鹅鹅鹅鹅鵞鵞鵞鹅鵞鹅鵞鵞鹅鵞鵞鹅鵞鵞鵞鹅鹅鹅鵞鵞鵞鹅鵞鵞鹅鹅鵞鹅鵞鵞鵞鵞鹅鵞鹅鹅鹅鹅鹅鵞鵞鹅鵞鹅鹅鹅鹅鵞鹅鹅鹅鹅鵞鵞鹅鹅鵞鹅鹅鹅鹅鹅鹅鵞鵞鹅鵞鵞鹅鵞鵞鹅pEEyuoBAtW.cancel();
            String var10000 = ょょょょょょょよょょょよょょょよよょよょよよよょよょょょよよょょよょょょょよよよよょょよよょよょょよょよょょょょよよょよょょょょょょょょよょょよよょよょょょよよよょょょょよよょよよよよPPNaMyXSHr.fd_String_34;
            String 壿墫壿墫墫墫壿墫墫墫壿墫墫墫壿壿墫墫壿墫壿墫壿墫墫墫壿墫墫墫壿墫壿墫墫墫壿壿墫墫壿壿壿墫壿墫壿墫壿壿壿壿壿壿壿墫墫EpZBHFqMkM = "/msg " + var10000 + " " + 回徊茴回回徊茴茴茴徊茴徊佪茴徊佪徊佪回回佪徊茴佪佪茴徊回茴徊佪徊茴徊回茴回回佪回茴茴徊佪茴回佪回徊徊GKCxhyQLhR.substring(3);
            ょょょょょょょよょょょよょょょよよょよょよよよょよょょょよよょょよょょょょよよよよょょよよょよょょよょよょょょょよよょよょょょょょょょょよょょよよょよょょょよよよょょょょよよょよよよよPPNaMyXSHr.mc.getNetworkHandler().sendPacket(new ChatMessageC2SPacket(壿墫壿墫墫墫壿墫墫墫壿墫墫墫壿壿墫墫壿墫壿墫壿墫墫墫壿墫墫墫壿墫壿墫墫墫壿壿墫墫壿壿壿墫壿墫壿墫壿壿壿壿壿壿壿墫墫EpZBHFqMkM, Class70.signMessage(壿墫壿墫墫墫壿墫墫墫壿墫墫墫壿壿墫墫壿墫壿墫壿墫墫墫壿墫墫墫壿墫壿墫墫墫壿壿墫墫壿壿壿墫壿墫壿墫壿壿壿壿壿壿壿墫墫EpZBHFqMkM), false));
         }
      }

   }
}
