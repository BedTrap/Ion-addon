/* Decompiler 24ms, total 165ms, lines 151 */
package me.ghosttypes.ion.utils.services;

import java.util.Iterator;
import me.ghosttypes.ion.utils.events.Class15;
import me.ghosttypes.ion.utils.events.SSssSSsSSsssssSsSssS;
import me.ghosttypes.ion.utils.misc.Class30;
import me.ghosttypes.ion.utils.network.Class42;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.events.packets.PacketEvent.Receive;
import meteordevelopment.meteorclient.events.packets.PacketEvent.Send;
import meteordevelopment.meteorclient.systems.friends.Friend;
import meteordevelopment.meteorclient.systems.friends.Friends;
import meteordevelopment.meteorclient.utils.Utils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.Packet;
import net.minecraft.network.packet.c2s.play.ClientStatusC2SPacket;
import net.minecraft.network.packet.s2c.play.ChatMessageS2CPacket;
import net.minecraft.network.packet.c2s.play.ClientStatusC2SPacket.class_2800;

public class DeathManager {
   public static boolean isServerMessage(ChatMessageS2CPacket 鬭鬭鬬鬬鬬鬭鬬鬬鬬鬭鬭鬭鬬鬭鬭鬭鬭鬬鬬鬬鬭鬭鬬鬭鬬鬬鬭鬭鬭鬭鬭鬬鬬鬭鬭鬭鬭鬭鬭鬭鬬鬭鬬鬭鬬鬭鬭鬭鬬鬭鬭鬬鬬鬬鬭鬭鬭鬬鬭鬭鬭鬭鬬鬭鬬鬭鬬鬭鬬鬬鬭鬬鬭鬬鬭鬬鬬鬬鬭鬬鬭鬬鬬鬭鬬鬭鬭鬭鬭鬬鬭鬬鬬鬬鬬鬭鬭鬬鬭鬭鬬鬬鬭鬭鬭鬭鬬鬭鬭鬬鬬鬬鬬鬭鬭EzJCBewLlu) {
      return りいりぃいりいリぃいリいぃいりりりぃいjGVjBIgUVd.comp_760().toString().contains("000000000");
   }

   @EventHandler
   public static void onReceivePacket(Receive くくくㄑㄑㄑくくくㄑㄑくくくくㄑくㄑくくㄑㄑㄑㄑㄑㄑnyhzhIyIWY) {
      if (Utils.canUpdate()) {
         Packet var2 = Class42.getPacket(ムムㄙㄙㄙムムムムムムㄙムムㄙㄙムムムㄙㄙㄙムムムムムムムㄙムムㄙムㄙㄙムㄙㄙㄙムムムムムㄙㄙㄙムㄙㄙムムムㄙㄙㄙムㄙㄙムㄙUUXehjHNkW);
         if (var2 instanceof ChatMessageS2CPacket) {
            ChatMessageS2CPacket 晩晩晩晩晩晩晚晩晩晩晚晩晩晩晩晩晩晩晩晩晚晩晩晩晚晩晚晚晚晩晚晩晚晚晩晚晩晩晩晩晩晩晚晚晩晚晩晚晩晩晩晚晚晚晚晚晚晩晩晚晚晩晚晩晚晚晚晚晩晚晩晩晩晩晚晚晚晩晩晩晚晚yjmFahayKh = (ChatMessageS2CPacket)var2;
            String ㄙムㄙムㄙムムムムㄙムムㄙムムムムㄙxiZqBBxSJv;
            if (isServerMessage(晩晩晩晩晩晩晚晩晩晩晚晩晩晩晩晩晩晩晩晩晚晩晩晩晚晩晚晚晚晩晚晩晚晚晩晚晩晩晩晩晩晩晚晚晩晚晩晚晩晩晩晚晚晚晚晚晚晩晩晚晚晩晚晩晚晚晚晚晩晚晩晩晩晩晚晚晚晩晩晩晚晚yjmFahayKh)) {
               ㄙムㄙムㄙムムムムㄙムムㄙムムムムㄙxiZqBBxSJv = 晩晩晩晩晩晩晚晩晩晩晚晩晩晩晩晩晩晩晩晩晚晩晩晩晚晩晚晚晚晩晚晩晚晚晩晚晩晩晩晩晩晩晚晚晩晚晩晚晩晩晩晚晚晚晚晚晚晩晩晚晚晩晚晩晚晚晚晚晩晚晩晩晩晩晚晚晚晩晩晩晚晚yjmFahayKh.comp_833().getString();
               if (ㄙムㄙムㄙムムムムㄙムムㄙムムムムㄙxiZqBBxSJv.contains("by " + MeteorClient.mc.player.getEntityName())) {
                  String ツジヅンンゾツソシシシツンツジシンヅンヅゾシジゾシジジンソンンジゾソンヅツツツジソンジジソジゾンヅソツヅジンヅジジソソシンツツゾジヅツゾンツジソソシシツジジヅゾンaugMPGydMA = ㄙムㄙムㄙムムムムㄙムムㄙムムムムㄙxiZqBBxSJv.substring(0, ㄙムㄙムㄙムムムムㄙムムㄙムムムムㄙxiZqBBxSJv.indexOf(" "));
                  if (ツジヅンンゾツソシシシツンツジシンヅンヅゾシジゾシジジンソンンジゾソンヅツツツジソンジジソジゾンヅソツヅジンヅジジソソシンツツゾジヅツゾンツジソソシシツジジヅゾンaugMPGydMA.contains(MeteorClient.mc.player.getEntityName())) {
                     return;
                  }

                  Iterator var4 = Friends.get().iterator();

                  while(var4.hasNext()) {
                     Friend 回茴回佪茴回回茴徊佪徊佪佪徊佪佪徊茴回佪茴茴茴佪徊回佪佪茴茴回回徊回茴佪茴佪回徊徊茴茴回回茴佪CZxmXfOnfV = (Friend)var4.next();
                     if (ツジヅンンゾツソシシシツンツジシンヅンヅゾシジゾシジジンソンンジゾソンヅツツツジソンジジソジゾンヅソツヅジンヅジジソソシンツツゾジヅツゾンツジソソシシツジジヅゾンaugMPGydMA.contains(回茴回佪茴回回茴徊佪徊佪佪徊佪佪徊茴回佪茴茴茴佪徊回佪佪茴茴回回徊回茴佪茴佪回徊徊茴茴回回茴佪CZxmXfOnfV.name)) {
                        return;
                     }
                  }

                  boolean 乀ㇸへ乀へへㇸ乀ㇸ乀ㇸへㇸ乀へㇸ乀乀乀ㇸ乀へへㇸㇸへへ乀ㇸへ乀ㇸへ乀ㇸへへ乀ㇸㇸ乀乀乀へ乀ㇸ乀乀へへ乀乀ㇸ乀乀へㇸㇸへへへ乀へへㇸㇸへ乀乀乀乀へmuPhWpHxYa = false;
                  Iterator var14 = MeteorClient.mc.world.getPlayers().iterator();

                  label113:
                  while(true) {
                     PlayerEntity メノメノノノメノノノメメノノメメメメメメノノノメノノノメメメメメノノノメメノノメメノメメメノノメノメメノメメノメメノメメメノノノメメメノノメノメメメメノノノノメメgydefOhYYS;
                     do {
                        do {
                           if (!var14.hasNext()) {
                              if (!乀ㇸへ乀へへㇸ乀ㇸ乀ㇸへㇸ乀へㇸ乀乀乀ㇸ乀へへㇸㇸへへ乀ㇸへ乀ㇸへ乀ㇸへへ乀ㇸㇸ乀乀乀へ乀ㇸ乀乀へへ乀乀ㇸ乀乀へㇸㇸへへへ乀へへㇸㇸへ乀乀乀乀へmuPhWpHxYa) {
                                 MeteorClient.EVENT_BUS.post(SSssSSsSSsssssSsSssS.get(ツジヅンンゾツソシシシツンツジシンヅンヅゾシジゾシジジンソンンジゾソンヅツツツジソンジジソジゾンヅソツヅジンヅジジソソシンツツゾジヅツゾンツジソソシシツジジヅゾンaugMPGydMA, (Vec3d)null));
                              }
                              break label113;
                           }

                           メノメノノノメノノノメメノノメメメメメメノノノメノノノメメメメメノノノメメノノメメノメメメノノメノメメノメメノメメノメメメノノノメメメノノメノメメメメノノノノメメgydefOhYYS = (PlayerEntity)var14.next();
                        } while(!メノメノノノメノノノメメノノメメメメメメノノノメノノノメメメメメノノノメメノノメメノメメメノノメノメメノメメノメメノメメメノノノメメメノノメノメメメメノノノノメメgydefOhYYS.getEntityName().equals(ツジヅンンゾツソシシシツンツジシンヅンヅゾシジゾシジジンソンンジゾソンヅツツツジソンジジソジゾンヅソツヅジンヅジジソソシンツツゾジヅツゾンツジソソシシツジジヅゾンaugMPGydMA));
                     } while(メノメノノノメノノノメメノノメメメメメメノノノメノノノメメメメメノノノメメノノメメノメメメノノメノメメノメメノメメノメメメノノノメメメノノメノメメメメノノノノメメgydefOhYYS.getHealth() > 0.0F && メノメノノノメノノノメメノノメメメメメメノノノメノノノメメメメメノノノメメノノメメノメメメノノメノメメノメメノメメノメメメノノノメメメノノメノメメメメノノノノメメgydefOhYYS.deathTime <= 0);

                     MeteorClient.EVENT_BUS.post(SSssSSsSSsssssSsSssS.get(ツジヅンンゾツソシシシツンツジシンヅンヅゾシジゾシジジンソンンジゾソンヅツツツジソンジジソジゾンヅソツヅジンヅジジソソシンツツゾジヅツゾンツジソソシシツジジヅゾンaugMPGydMA, メノメノノノメノノノメメノノメメメメメメノノノメノノノメメメメメノノノメメノノメメノメメメノノメノメメノメメノメメノメメメノノノメメメノノメノメメメメノノノノメメgydefOhYYS.getPos()));
                     乀ㇸへ乀へへㇸ乀ㇸ乀ㇸへㇸ乀へㇸ乀乀乀ㇸ乀へへㇸㇸへへ乀ㇸへ乀ㇸへ乀ㇸへへ乀ㇸㇸ乀乀乀へ乀ㇸ乀乀へへ乀乀ㇸ乀乀へㇸㇸへへへ乀へへㇸㇸへ乀乀乀乀へmuPhWpHxYa = true;
                  }
               }
            }

            ㄙムㄙムㄙムムムムㄙムムㄙムムムムㄙxiZqBBxSJv = 晩晩晩晩晩晩晚晩晩晩晚晩晩晩晩晩晩晩晩晩晚晩晩晩晚晩晚晚晚晩晚晩晚晚晩晚晩晩晩晩晩晩晚晚晩晚晩晚晩晩晩晚晚晚晚晚晚晩晩晚晚晩晚晩晚晚晚晚晩晚晩晩晩晩晚晚晚晩晩晩晚晚yjmFahayKh.comp_833().getString();
            if (isServerMessage(晩晩晩晩晩晩晚晩晩晩晚晩晩晩晩晩晩晩晩晩晚晩晩晩晚晩晚晚晚晩晚晩晚晚晩晚晩晩晩晩晩晩晚晚晩晚晩晚晩晩晩晚晚晚晚晚晚晩晩晚晚晩晚晩晚晚晚晚晩晚晩晩晩晩晚晚晚晩晩晩晚晚yjmFahayKh) && !MeteorClient.mc.player.isDead() && MeteorClient.mc.player.getHealth() > 0.0F && MeteorClient.mc.player.deathTime <= 0 && ㄙムㄙムㄙムムムムㄙムムㄙムムムムㄙxiZqBBxSJv.contains(MeteorClient.mc.player.getEntityName())) {
               if (System.currentTimeMillis() - Class30.ijLJJJLijLJLjiILJliLiJliiLLJJjiLllljJLlilJllLiLIlIlLjJiiJIIlIJLLLJIllljIJJljiJlLJJLJljiLlLj >= 5000L) {
                  Iterator var11 = MeteorClient.mc.world.getPlayers().iterator();

                  while(true) {
                     while(true) {
                        int 壿墫墫墫壿墫壿壿壿墫壿墫壿壿壿墫壿墫壿壿壿壿壿壿墫壿墫壿壿壿墫墫壿壿壿墫墫壿墫墫壿壿dNtuSQjXLk;
                        PlayerEntity 炏火燚欻火欻炏欻燚焱炎焱炎火炏炎焱火焱欻欻欻火炎炎燚焱炎燚火炎火火炎燚炏燚燚炏火欻燚火炎火燚焱燚欻炎火欻燚欻焱焱火炎欻炎炎炎焱燚火炏焱焱欻火燚焱欻焱燚欻燚焱炏焱炏焱欻欻炎炎炎炏燚焱焱YccqeWifLr;
                        String リいいりリリいリいリリぃリりぃりリぃりぃリりいりりぃリぃりいリリりりぃリぃいリりいいりりぃいいリいぃりリリいBpJkOmayxZ;
                        int うううララううララううラうううララうララうううラうううラうううララうララララうラううラうラうララうラララララうラううラうラララララううララうララううラララうラうラララうラううラううララうラうララララうラララララうラうラうううううララうラうううララうSfMulxpBri;
                        do {
                           do {
                              do {
                                 do {
                                    if (!var11.hasNext()) {
                                       return;
                                    }

                                    炏火燚欻火欻炏欻燚焱炎焱炎火炏炎焱火焱欻欻欻火炎炎燚焱炎燚火炎火火炎燚炏燚燚炏火欻燚火炎火燚焱燚欻炎火欻燚欻焱焱火炎欻炎炎炎焱燚火炏焱焱欻火燚焱欻焱燚欻燚焱炏焱炏焱欻欻炎炎炎炏燚焱焱YccqeWifLr = (PlayerEntity)var11.next();
                                 } while(炏火燚欻火欻炏欻燚焱炎焱炎火炏炎焱火焱欻欻欻火炎炎燚焱炎燚火炎火火炎燚炏燚燚炏火欻燚火炎火燚焱燚欻炎火欻燚欻焱焱火炎欻炎炎炎焱燚火炏焱焱欻火燚焱欻焱燚欻燚焱炏焱炏焱欻欻炎炎炎炏燚焱焱YccqeWifLr == MeteorClient.mc.player);

                                 リいいりリリいリいリリぃリりぃりリぃりぃリりいりりぃリぃりいリリりりぃリぃいリりいいりりぃいいリいぃりリリいBpJkOmayxZ = 炏火燚欻火欻炏欻燚焱炎焱炎火炏炎焱火焱欻欻欻火炎炎燚焱炎燚火炎火火炎燚炏燚燚炏火欻燚火炎火燚焱燚欻炎火欻燚欻焱焱火炎欻炎炎炎焱燚火炏焱焱欻火燚焱欻焱燚欻燚焱炏焱炏焱欻欻炎炎炎炏燚焱焱YccqeWifLr.getEntityName();
                              } while(!ㄙムㄙムㄙムムムムㄙムムㄙムムムムㄙxiZqBBxSJv.contains(リいいりリリいリいリリぃリりぃりリぃりぃリりいりりぃリぃりいリリりりぃリぃいリりいいりりぃいいリいぃりリリいBpJkOmayxZ));

                              うううララううララううラうううララうララうううラうううラうううララうララララうラううラうラうララうラララララうラううラうラララララううララうララううラララうラうラララうラううラううララうラうララララうラララララうラうラうううううララうラうううララうSfMulxpBri = ㄙムㄙムㄙムムムムㄙムムㄙムムムムㄙxiZqBBxSJv.indexOf(MeteorClient.mc.player.getEntityName());
                              壿墫墫墫壿墫壿壿壿墫壿墫壿壿壿墫壿墫壿壿壿壿壿壿墫壿墫壿壿壿墫墫壿壿壿墫墫壿墫墫壿壿dNtuSQjXLk = ㄙムㄙムㄙムムムムㄙムムㄙムムムムㄙxiZqBBxSJv.indexOf(リいいりリリいリいリリぃリりぃりリぃりぃリりいりりぃリぃりいリリりりぃリぃいリりいいりりぃいいリいぃりリリいBpJkOmayxZ);
                           } while(うううララううララううラうううララうララうううラうううラうううララうララララうラううラうラうララうラララララうラううラうラララララううララうララううラララうラうラララうラううラううララうラうララララうラララララうラうラうううううララうラうううララうSfMulxpBri == -1);
                        } while(壿墫墫墫壿墫壿壿壿墫壿墫壿壿壿墫壿墫壿壿壿壿壿壿墫壿墫壿壿壿墫墫壿壿壿墫墫壿墫墫壿壿dNtuSQjXLk == -1);

                        Iterator var8 = Friends.get().iterator();

                        while(var8.hasNext()) {
                           Friend 垚圭垚桂澆㙓土垚澆烓垚洼桂圭垚澆垚澆茥圭茥圭土茥桂澆㙓土洼桂㙓垚澆垚茥土垚茥㙓洼洼土土洼澆茥桂㙓茥洼㙓垚澆圭茥桂vsBQjbWJZy = (Friend)var8.next();
                           if (リいいりリリいリいリリぃリりぃりリぃりぃリりいりりぃリぃりいリリりりぃリぃいリりいいりりぃいいリいぃりリリいBpJkOmayxZ.equals(垚圭垚桂澆㙓土垚澆烓垚洼桂圭垚澆垚澆茥圭茥圭土茥桂澆㙓土洼桂㙓垚澆垚茥土垚茥㙓洼洼土土洼澆茥桂㙓茥洼㙓垚澆圭茥桂vsBQjbWJZy.name)) {
                              return;
                           }
                        }

                        if (炏火燚欻火欻炏欻燚焱炎焱炎火炏炎焱火焱欻欻欻火炎炎燚焱炎燚火炎火火炎燚炏燚燚炏火欻燚火炎火燚焱燚欻炎火欻燚欻焱焱火炎欻炎炎炎焱燚火炏焱焱欻火燚焱欻焱燚欻燚焱炏焱炏焱欻欻炎炎炎炏燚焱焱YccqeWifLr.deathTime <= 0 && 炏火燚欻火欻炏欻燚焱炎焱炎火炏炎焱火焱欻欻欻火炎炎燚焱炎燚火炎火火炎燚炏燚燚炏火欻燚火炎火燚焱燚欻炎火欻燚欻焱焱火炎欻炎炎炎焱燚火炏焱焱欻火燚焱欻焱燚欻燚焱炏焱炏焱欻欻炎炎炎炏燚焱焱YccqeWifLr.getHealth() > 0.0F) {
                           MeteorClient.EVENT_BUS.post(Class15.get(リいいりリリいリいリリぃリりぃりリぃりぃリりいりりぃリぃりいリリりりぃリぃいリりいいりりぃいいリいぃりリリいBpJkOmayxZ, (Vec3d)null));
                        } else {
                           MeteorClient.EVENT_BUS.post(Class15.get(リいいりリリいリいリリぃリりぃりリぃりぃリりいりりぃリぃりいリリりりぃリぃいリりいいりりぃいいリいぃりリリいBpJkOmayxZ, 炏火燚欻火欻炏欻燚焱炎焱炎火炏炎焱火焱欻欻欻火炎炎燚焱炎燚火炎火火炎燚炏燚燚炏火欻燚火炎火燚焱燚欻炎火欻燚欻焱焱火炎欻炎炎炎焱燚火炏焱焱欻火燚焱欻焱燚欻燚焱炏焱炏焱欻欻炎炎炎炏燚焱焱YccqeWifLr.getPos()));
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @EventHandler
   private static void onSendPacket(Send 晚晚晩晩晚晩晩晚晩晩晩晩晩晚晩晚晩晚晩晩晩晚晩晚晚晩晩晩晩晩晚晚晚晚晩晩晩晩晚晚晩ropJXnhCDq) {
      Packet var2 = Class42.getPacket(ノメノノノメメメノメメノノノノメノノメメノメノメノメメメノノメメノメノメノノノノノメノノメノノメメメメメメノノメノノメノノノメノメNOmkvuklEq);
      if (var2 instanceof ClientStatusC2SPacket) {
         ClientStatusC2SPacket ㄙㄙㄙムㄙムムムムㄙムムㄙムㄙムㄙムㄙㄙムムムムㄙㄙムㄙムㄙㄙㄙㄙムㄙㄙムムムㄙムムムㄙㄙㄙㄙㄙムㄙㄙムムムムムムムㄙㄙムムㄙムムㄙㄙㄙムムㄙㄙㄙムムㄙㄙムㄙㄙムムㄙㄙㄙㄙムムムムムㄙムムムムムムㄙㄙムㄙムムムㄙkuzTHOZipu = (ClientStatusC2SPacket)var2;
         if (ㄙㄙㄙムㄙムムムムㄙムムㄙムㄙムㄙムㄙㄙムムムムㄙㄙムㄙムㄙㄙㄙㄙムㄙㄙムムムㄙムムムㄙㄙㄙㄙㄙムㄙㄙムムムムムムムㄙㄙムムㄙムムㄙㄙㄙムムㄙㄙㄙムムㄙㄙムㄙㄙムムㄙㄙㄙㄙムムムムムㄙムムムムムムㄙㄙムㄙムムムㄙkuzTHOZipu.getMode().equals(class_2800.PERFORM_RESPAWN)) {
            Class30.ijLJJJLijLJLjiILJliLiJliiLLJJjiLllljJLlilJllLiLIlIlLjJiiJIIlIJLLLJIllljIJJljiJlLJJLJljiLlLj = System.currentTimeMillis();
         }
      }

   }

   public static enum KillDetection {
      fd_KillDetection_1017,
      fd_KillDetection_1018,
      IJJJJJILIiJjlijLILLlIJjljiliIIJlLiIlLLJIIJlJLLIIiiIjLLjjjJIJijj;

      // $FF: synthetic method
      private static DeathManager.KillDetection[] $values() {
         return new DeathManager.KillDetection[]{fd_KillDetection_1017, IJJJJJILIiJjlijLILLlIJjljiliIIJlLiIlLLJIIJlJLLIIiiIjLLjjjJIJijj, fd_KillDetection_1018};
      }
   }
}
