/* Decompiler 37ms, total 190ms, lines 257 */
package me.ghosttypes.ion.modules.chat;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.UUID;
import me.ghosttypes.ion.modules.hud.visual.NotificationsHUD;
import me.ghosttypes.ion.modules.render.Notifications.mode;
import me.ghosttypes.ion.utils.Class68;
import me.ghosttypes.ion.utils.sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS;
import me.ghosttypes.ion.utils.misc.Class20;
import me.ghosttypes.ion.utils.misc.Class23;
import me.ghosttypes.ion.utils.misc.Class30;
import me.ghosttypes.ion.utils.network.Class42;
import me.ghosttypes.ion.utils.stats.Class55;
import me.ghosttypes.ion.utils.stats.QqPpPQQQQpQppqPqPqpQqQqQpqPQQQqQQPQQQPpqQPpQQPPpPqQQPqPqQqQ;
import meteordevelopment.meteorclient.events.game.GameJoinedEvent;
import meteordevelopment.meteorclient.events.packets.PacketEvent.Receive;
import meteordevelopment.meteorclient.events.world.TickEvent.Post;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.BoolSetting.Builder;
import meteordevelopment.meteorclient.systems.friends.Friends;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.player.ChatUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Formatting;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.Packet;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;

public class PopCounter extends Module {
   private final int fd_int_52;
   public final Setting<Boolean> fd_Setting_53;
   private final Setting<Boolean> JLiILJliLiLlLjLjLlijLiIiilljjiLJlILijiliLIjijiIIiIiILlIjlLjlIlIllLJliLJLljIIiIJlIJjlIjIjijLJ;
   private final Setting<Boolean> fd_Setting_54;
   private int fd_int_55;
   private final Setting<Boolean> fd_Setting_56;
   private final Object2IntMap<UUID> liiijLLLJiijljIIljIJLJllIiJLIJIlLjiLIjljjJlILJlJiLiJJjLlLiIJJjLjJIiJLIJJjIjJIJliLIIJJJLiiJIlJIII;
   private final Random fd_Random_57;
   private final Setting<Boolean> fd_Setting_58;
   public final Setting<Boolean> fd_Setting_59;
   private final SettingGroup fd_SettingGroup_60;
   private final Setting<List<String>> fd_Setting_61;
   private final Setting<mode> fd_Setting_62;
   private final Setting<Integer> fd_Setting_63;
   private final Setting<Double> fd_Setting_64;
   private final Setting<Boolean> fd_Setting_65;
   public final Setting<Boolean> fd_Setting_66;
   public final Object2IntMap<UUID> fd_Object2IntMap_67;
   private final SettingGroup fd_SettingGroup_68;

   public void onActivate() {
      ノメノメメノメメメノメメノノメノノノメノメメメノメノメメメメメメメノメメノノメノノノノメノメノメノノノメメノノノメノノノノノメノノノノノメノノノメノノ.fd_Object2IntMap_67.clear();
      ノメノメメノメメメノメメノノメノノノメノメメメノメノメメメメメメメノメメノノメノノノノメノメノメノノノメメノノノメノノノノノメノノノノノメノノノメノノ.liiijLLLJiijljIIljIJLJllIiJLIJIlLjiLIjljjJlILJlJiLiJJjLlLiIJJjLjJIiJLIJJjIjJIJliLIIJJJLiiJIlJIII.clear();
      ノメノメメノメメメノメメノノメノノノメノメメメノメノメメメメメメメノメメノノメノノノノメノメノメノノノメメノノノメノノノノノメノノノノノメノノノメノノ.fd_int_55 = (Integer)ノメノメメノメメメノメメノノメノノノメノメメメノメノメメメメメメメノメメノノメノノノノメノメノメノノノメメノノノメノノノノノメノノノノノメノノノメノノ.fd_Setting_63.get() * 20;
   }

   private String getPopAlert(PlayerEntity 鵞鹅鹅鵞鹅鵞鹅鹅鹅鹅鹅鵞鹅鹅鹅鵞鵞鹅鵞鹅鵞鵞鵞鵞鹅鹅鹅鵞鹅鵞鹅鹅鹅鵞鵞鵞鹅鹅鹅鵞鹅鹅鵞鵞鹅鵞鹅鹅鵞鹅鵞鵞鹅鹅鹅鵞鹅鵞鹅鹅鹅鹅鵞鹅鹅鵞鵞鹅鹅鵞鵞鹅鵞鵞鹅鵞鹅鹅鵞鵞鹅鹅鹅鵞鵞鵞鹅鵞鹅鹅鵞鵞鹅鹅鹅鹅鵞鹅鵞鹅鹅鵞鹅鹅鹅鵞鹅鵞鹅鵞鹅鵞鹅鵞鹅, int 㵘水㵘淼沝水沝㵘㵘㵘沝淼水沝淼沝沝水沝㵘沝淼沝沝沝水水㵘淼㵘淼水水沝水淼淼沝淼淼水沝沝沝沝㵘水水淼沝沝㵘淼淼淼沝水水沝水水沝沝水, boolean jijJJlLLJJlJjlJLliIlILLIIjllJIJLIlJllJlJIJjLILliJjljljIlljjiJJlljijljLJIiIIJliLJjjLL) {
      String var10000;
      String 鹅鹅鵞鵞鵞鹅鵞鵞鵞鵞鵞鹅鹅鵞鵞鵞鹅鹅鹅鹅鹅鹅鹅鹅鵞鹅鹅鵞鹅鹅鹅鹅鹅鵞鵞鹅鵞鹅鹅鹅鵞鵞鵞鵞鵞鹅鹅鹅鵞鹅鵞鵞鹅鵞鹅鹅鹅鵞鹅鵞鹅鵞鹅鵞鹅鵞鹅鹅鵞鵞鵞鵞鹅鹅鹅鵞鵞鵞鵞鵞鹅鹅鵞鵞鵞鹅鹅鵞鵞鵞鵞鹅鹅鹅鵞鵞鵞鵞鵞鵞鹅鵞鹅鵞鹅鹅鹅鹅;
      if (幐幐幐幐㬺㬺幐幐幐幐幐幐幐㬺幐幐㬺㬺㬺幐幐幐幐㬺㬺㬺㬺幐㬺㬺幐幐幐幐㬺幐㬺㬺㬺幐幐幐幐幐㬺幐㬺幐㬺㬺㬺幐幐㬺㬺㬺㬺幐㬺㬺幐幐㬺㬺幐㬺幐幐幐㬺㬺㬺幐幐㬺㬺幐幐幐幐㬺幐㬺幐幐㬺㬺㬺㬺㬺幐㬺幐幐㬺㬺㬺幐㬺幐㬺㬺㬺㬺幐㬺幐㬺幐㬺㬺幐幐㬺㬺幐幐) {
         var10000 = 林林森林木森森木木林林森森森森森木森木林林森林木木森森木木林森森林森木木林林林林森木.getEntityName();
         鹅鹅鵞鵞鵞鹅鵞鵞鵞鵞鵞鹅鹅鵞鵞鵞鹅鹅鹅鹅鹅鹅鹅鹅鵞鹅鹅鵞鹅鹅鹅鹅鹅鵞鵞鹅鵞鹅鹅鹅鵞鵞鵞鵞鵞鹅鹅鹅鵞鹅鵞鵞鹅鵞鹅鹅鹅鵞鹅鵞鹅鵞鹅鵞鹅鵞鹅鹅鵞鵞鵞鵞鹅鹅鹅鵞鵞鵞鵞鵞鹅鹅鵞鵞鵞鹅鹅鵞鵞鵞鵞鹅鹅鹅鵞鵞鵞鵞鵞鵞鹅鵞鹅鵞鹅鹅鹅鹅 = var10000 + " died after popping " + 土土桂澆澆茥土桂圭㙓垚洼洼㙓垚垚㙓土㙓垚土澆㙓土桂烓烓圭洼澆土㙓澆茥桂圭澆洼澆澆洼圭土㙓土烓茥桂桂圭澆土桂土㙓圭桂烓澆土土圭土圭澆土㙓圭茥澆桂茥 + 淼水沝水淼沝沝㵘淼沝水㵘㵘淼淼沝沝淼沝㵘沝水淼沝水淼淼水沝㵘水㵘淼水㵘淼㵘沝㵘淼水淼沝水水㵘沝淼淼水水淼㵘淼水淼㵘淼水水㵘水淼㵘水水沝淼沝淼淼沝㵘淼沝㵘淼淼水沝水水水淼㵘㵘淼沝淼㵘水㵘沝沝水淼㵘水沝淼沝沝.getPopGrammar(土土桂澆澆茥土桂圭㙓垚洼洼㙓垚垚㙓土㙓垚土澆㙓土桂烓烓圭洼澆土㙓澆茥桂圭澆洼澆澆洼圭土㙓土烓茥桂桂圭澆土桂土㙓圭桂烓澆土土圭土圭澆土㙓圭茥澆桂茥);
      } else {
         var10000 = 林林森林木森森木木林林森森森森森木森木林林森林木木森森木木林森森林森木木林林林林森木.getEntityName();
         鹅鹅鵞鵞鵞鹅鵞鵞鵞鵞鵞鹅鹅鵞鵞鵞鹅鹅鹅鹅鹅鹅鹅鹅鵞鹅鹅鵞鹅鹅鹅鹅鹅鵞鵞鹅鵞鹅鹅鹅鵞鵞鵞鵞鵞鹅鹅鹅鵞鹅鵞鵞鹅鵞鹅鹅鹅鵞鹅鵞鹅鵞鹅鵞鹅鵞鹅鹅鵞鵞鵞鵞鹅鹅鹅鵞鵞鵞鵞鵞鹅鹅鵞鵞鵞鹅鹅鵞鵞鵞鵞鹅鹅鹅鵞鵞鵞鵞鵞鵞鹅鵞鹅鵞鹅鹅鹅鹅 = var10000 + " popped " + 土土桂澆澆茥土桂圭㙓垚洼洼㙓垚垚㙓土㙓垚土澆㙓土桂烓烓圭洼澆土㙓澆茥桂圭澆洼澆澆洼圭土㙓土烓茥桂桂圭澆土桂土㙓圭桂烓澆土土圭土圭澆土㙓圭茥澆桂茥 + 淼水沝水淼沝沝㵘淼沝水㵘㵘淼淼沝沝淼沝㵘沝水淼沝水淼淼水沝㵘水㵘淼水㵘淼㵘沝㵘淼水淼沝水水㵘沝淼淼水水淼㵘淼水淼㵘淼水水㵘水淼㵘水水沝淼沝淼淼沝㵘淼沝㵘淼淼水沝水水水淼㵘㵘淼沝淼㵘水㵘沝沝水淼㵘水沝淼沝沝.getPopGrammar(土土桂澆澆茥土桂圭㙓垚洼洼㙓垚垚㙓土㙓垚土澆㙓土桂烓烓圭洼澆土㙓澆茥桂圭澆洼澆澆洼圭土㙓土烓茥桂桂圭澆土桂土㙓圭桂烓澆土土圭土圭澆土㙓圭茥澆桂茥);
      }

      return 鹅鹅鵞鵞鵞鹅鵞鵞鵞鵞鵞鹅鹅鵞鵞鵞鹅鹅鹅鹅鹅鹅鹅鹅鵞鹅鹅鵞鹅鹅鹅鹅鹅鵞鵞鹅鵞鹅鹅鹅鵞鵞鵞鵞鵞鹅鹅鹅鵞鹅鵞鵞鹅鵞鹅鹅鹅鵞鹅鵞鹅鵞鹅鵞鹅鵞鹅鹅鵞鵞鵞鵞鹅鹅鹅鵞鵞鵞鵞鵞鹅鹅鵞鵞鵞鹅鹅鵞鵞鵞鵞鹅鹅鹅鵞鵞鵞鵞鵞鵞鹅鵞鹅鵞鹅鹅鹅鹅;
   }

   @EventHandler
   private void onGameJoin(GameJoinedEvent jiJiIjlJiLIIiilLlIlIIIJiJLjijiLLjjjJILlLJIlLiiILjljLliLJjjlJl) {
      Class30.reset();
      乀ㇸㇸへ乀へへㇸへへ乀ㇸへへ乀乀乀ㇸㇸへへ乀ㇸへへ乀へㇸㇸへㇸへ乀へㇸへ乀へ乀乀乀ㇸへ乀へへㇸへㇸㇸへㇸㇸㇸ乀ㇸ乀ㇸㇸ乀へ乀へ乀ㇸ乀へ乀ㇸㇸ乀乀乀ㇸ乀ㇸㇸ乀乀ㇸ乀ㇸㇸへㇸへㇸ乀ㇸへへ乀乀へへへへへへ乀へㇸへ乀乀乀へ乀ㇸ乀ㇸ乀乀ㇸ乀.fd_Object2IntMap_67.clear();
      乀ㇸㇸへ乀へへㇸへへ乀ㇸへへ乀乀乀ㇸㇸへへ乀ㇸへへ乀へㇸㇸへㇸへ乀へㇸへ乀へ乀乀乀ㇸへ乀へへㇸへㇸㇸへㇸㇸㇸ乀ㇸ乀ㇸㇸ乀へ乀へ乀ㇸ乀へ乀ㇸㇸ乀乀乀ㇸ乀ㇸㇸ乀乀ㇸ乀ㇸㇸへㇸへㇸ乀ㇸへへ乀乀へへへへへへ乀へㇸへ乀乀乀へ乀ㇸ乀ㇸ乀乀ㇸ乀.liiijLLLJiijljIIljIJLJllIiJLIJIlLjiLIjljjJlILJlJiLiJJjLlLiIJJjLjJIiJLIJJjIjJIJliLIIJJJLiiJIlJIII.clear();
   }

   private int getChatId(Entity 森森森森木林森木木木木木木林木木森木森森木林森林森森木木林木林森木森森森森木森森林森森林林林木木森林木林林森森木木木森木林林木木木森森林木木木森木木木林林木林林森林林木林森森木林林森森林木木林森木森森木森森林林森林森林林林林) {
      return ノノメノメメノノメメノノノメメメノ.liiijLLLJiijljIIljIJLJllIiJLIJIlLjiLIjljjJlILJlJiLiJJjLlLiIJJjLjJIiJLIJJjIjJIJliLIIJJJLiiJIlJIII.computeIntIfAbsent(ゆゅゅゆゆゆゆゆゆゆゅゅゅゆゆゅゆゅゆゆゅゅゆゅゅゅゅゅゆゆゆゅゆゆゆゆゆゆゆゅゆゅゆゆゅゅゆゆゆゆゆゆゆゅゅゅゅゅゆゆゆゅゆゆゆゅゆゆゆゅゆゅゆゆゆゆゅゅゅゆゆゆゆゆゅゅゅゅゆゅゅゅゆゆゅゅゅゆゆゅゅゆ.getUuid(), (ラうラララララうラララ) -> {
         return 鵞鵞鵞鵞鹅鹅鵞鹅鹅鵞鹅鹅鵞鵞鵞鵞鵞鹅鹅鹅鵞鹅鹅鵞鹅鵞鹅鹅鹅鵞鵞鹅鹅鹅鹅鹅鹅鹅鹅鵞鹅鹅鹅鵞鵞鵞鹅鵞鹅鵞鹅鹅鵞鹅鵞鹅鹅鵞鵞鹅鹅鵞.fd_Random_57.nextInt();
      });
   }

   @EventHandler
   private void onReceivePacket(Receive ゆゆゅゆゆゆゆゆゅゅゅゆゅゅゅゆゅゆゅゆゅゆゆゅゆゅゆゆゆゆゆゆゆゅゆゅゆゆゆゅゅゆゆゆゅゅゆゅゆゅゅゆゆゅゆゅゆゆゅゅゅゅゅゅゅゅゅゅゆゆゆゅゆゆゅゅゆゆゆゅゆゅゆゆゅゅゅゆゆゅゆゆゆゅゅゆゆゅゅゆゅ) {
      Packet var3 = Class42.getPacket(垚澆㙓㙓澆澆土垚烓烓圭㙓澆垚洼桂桂圭垚土土土土圭洼圭垚桂㙓澆圭圭圭烓圭茥洼圭垚土土㙓茥圭土茥洼茥圭㙓圭土澆垚茥桂);
      if (var3 instanceof EntityStatusS2CPacket) {
         EntityStatusS2CPacket 乀乀ㇸㇸ乀ㇸへ乀へㇸㇸㇸへㇸㇸへ乀ㇸㇸㇸㇸㇸ乀へㇸ乀乀へへへへへへへへ乀乀 = (EntityStatusS2CPacket)var3;
         if (乀乀ㇸㇸ乀ㇸへ乀へㇸㇸㇸへㇸㇸへ乀ㇸㇸㇸㇸㇸ乀へㇸ乀乀へへへへへへへへ乀乀.getStatus() == 35) {
            Entity ㄑくくㄑㄑくくㄑくㄑㄑㄑ = 乀乀ㇸㇸ乀ㇸへ乀へㇸㇸㇸへㇸㇸへ乀ㇸㇸㇸㇸㇸ乀へㇸ乀乀へへへへへへへへ乀乀.getEntity(㙓垚茥桂洼土垚烓圭澆洼圭垚土澆烓㙓桂㙓土茥㙓茥烓圭洼桂洼垚洼桂圭洼垚澆桂洼㙓垚㙓土圭烓烓㙓桂土圭土烓桂茥垚土烓烓㙓茥㙓洼烓洼洼圭土圭垚圭澆㙓桂垚茥土垚垚圭洼㙓垚㙓.mc.world);
            if (ㄑくくㄑㄑくくㄑくㄑㄑㄑ == null || ㄑくくㄑㄑくくㄑくㄑㄑㄑ instanceof PlayerEntity) {
               if (ㄑくくㄑㄑくくㄑくㄑㄑㄑ != null && (!ㄑくくㄑㄑくくㄑくㄑㄑㄑ.equals(㙓垚茥桂洼土垚烓圭澆洼圭垚土澆烓㙓桂㙓土茥㙓茥烓圭洼桂洼垚洼桂圭洼垚澆桂洼㙓垚㙓土圭烓烓㙓桂土圭土烓桂茥垚土烓烓㙓茥㙓洼烓洼洼圭土圭垚圭澆㙓桂垚茥土垚垚圭洼㙓垚㙓.mc.player) || (Boolean)㙓垚茥桂洼土垚烓圭澆洼圭垚土澆烓㙓桂㙓土茥㙓茥烓圭洼桂洼垚洼桂圭洼垚澆桂洼㙓垚㙓土圭烓烓㙓桂土圭土烓桂茥垚土烓烓㙓茥㙓洼烓洼洼圭土圭垚圭澆㙓桂垚茥土垚垚圭洼㙓垚㙓.fd_Setting_65.get()) && (Friends.get().isFriend((PlayerEntity)ㄑくくㄑㄑくくㄑくㄑㄑㄑ) || (Boolean)㙓垚茥桂洼土垚烓圭澆洼圭垚土澆烓㙓桂㙓土茥㙓茥烓圭洼桂洼垚洼桂圭洼垚澆桂洼㙓垚㙓土圭烓烓㙓桂土圭土烓桂茥垚土烓烓㙓茥㙓洼烓洼洼圭土圭垚圭澆㙓桂垚茥土垚垚圭洼㙓垚㙓.fd_Setting_54.get()) && (!Friends.get().isFriend((PlayerEntity)ㄑくくㄑㄑくくㄑくㄑㄑㄑ) || (Boolean)㙓垚茥桂洼土垚烓圭澆洼圭垚土澆烓㙓桂㙓土茥㙓茥烓圭洼桂洼垚洼桂圭洼垚澆桂洼㙓垚㙓土圭烓烓㙓桂土圭土烓桂茥垚土烓烓㙓茥㙓洼烓洼洼圭土圭垚圭澆㙓桂垚茥土垚垚圭洼㙓垚㙓.fd_Setting_56.get())) {
                  Object2IntMap var4;
                  synchronized(var4 = 㙓垚茥桂洼土垚烓圭澆洼圭垚土澆烓㙓桂㙓土茥㙓茥烓圭洼桂洼垚洼桂圭洼垚澆桂洼㙓垚㙓土圭烓烓㙓桂土圭土烓桂茥垚土烓烓㙓茥㙓洼烓洼洼圭土圭垚圭澆㙓桂垚茥土垚垚圭洼㙓垚㙓.fd_Object2IntMap_67){}
                  int ああおああおおおあおあおあおあああおおおあああおおおおおおああおおおああああおあおおあおあおおあああおあおおああおああおああおおああおああおあおあおあおあおおあおあああおおああおああおおあおおおおああおおおああおおああああおあおああああ = 㙓垚茥桂洼土垚烓圭澆洼圭垚土澆烓㙓桂㙓土茥㙓茥烓圭洼桂洼垚洼桂圭洼垚澆桂洼㙓垚㙓土圭烓烓㙓桂土圭土烓桂茥垚土烓烓㙓茥㙓洼烓洼洼圭土圭垚圭澆㙓桂垚茥土垚垚圭洼㙓垚㙓.fd_Object2IntMap_67.getOrDefault(ㄑくくㄑㄑくくㄑくㄑㄑㄑ.getUuid(), 0);
                  Object2IntMap var10000 = 㙓垚茥桂洼土垚烓圭澆洼圭垚土澆烓㙓桂㙓土茥㙓茥烓圭洼桂洼垚洼桂圭洼垚澆桂洼㙓垚㙓土圭烓烓㙓桂土圭土烓桂茥垚土烓烓㙓茥㙓洼烓洼洼圭土圭垚圭澆㙓桂垚茥土垚垚圭洼㙓垚㙓.fd_Object2IntMap_67;
                  UUID var10001 = ㄑくくㄑㄑくくㄑくㄑㄑㄑ.getUuid();
                  ++ああおああおおおあおあおあおあああおおおあああおおおおおおああおおおああああおあおおあおあおおあああおあおおああおああおああおおああおああおあおあおあおあおおあおあああおおああおああおおあおおおおああおおおああおおああああおあおああああ;
                  var10000.put(var10001, ああおああおおおあおあおあおあああおおおあああおおおおおおああおおおああああおあおおあおあおおあああおあおおああおああおああおおああおああおあおあおあおあおおあおあああおおああおああおおあおおおおああおおおああおおああああおあおああああ);
                  switch((mode)㙓垚茥桂洼土垚烓圭澆洼圭垚土澆烓㙓桂㙓土茥㙓茥烓圭洼桂洼垚洼桂圭洼垚澆桂洼㙓垚㙓土圭烓烓㙓桂土圭土烓桂茥垚土烓烓㙓茥㙓洼烓洼洼圭土圭垚圭澆㙓桂垚茥土垚垚圭洼㙓垚㙓.fd_Setting_62.get()) {
                  case fd_mode_881:
                     ChatUtils.sendMsg(㙓垚茥桂洼土垚烓圭澆洼圭垚土澆烓㙓桂㙓土茥㙓茥烓圭洼桂洼垚洼桂圭洼垚澆桂洼㙓垚㙓土圭烓烓㙓桂土圭土烓桂茥垚土烓烓㙓茥㙓洼烓洼洼圭土圭垚圭澆㙓桂垚茥土垚垚圭洼㙓垚㙓.getChatId(ㄑくくㄑㄑくくㄑくㄑㄑㄑ), Formatting.GRAY, "(highlight)%s (default)popped (highlight)%d (default)%s.", new Object[]{ㄑくくㄑㄑくくㄑくㄑㄑㄑ.getEntityName(), ああおああおおおあおあおあおあああおおおあああおおおおおおああおおおああああおあおおあおあおおあああおあおおああおああおああおおああおああおあおあおあおあおおあおあああおおああおああおおあおおおおああおおおああおおああああおあおああああ, ああおああおおおあおあおあおあああおおおあああおおおおおおああおおおああああおあおおあおあおおあああおあおおああおああおああおおああおああおあおあおあおあおおあおあああおおああおああおおあおおおおああおおおああおおああああおあおああああ == 1 ? "totem" : "totems"});
                     break;
                  case fd_mode_883:
                     㙓垚茥桂洼土垚烓圭澆洼圭垚土澆烓㙓桂㙓土茥㙓茥烓圭洼桂洼垚洼桂圭洼垚澆桂洼㙓垚㙓土圭烓烓㙓桂土圭土烓桂茥垚土烓烓㙓茥㙓洼烓洼洼圭土圭垚圭澆㙓桂垚茥土垚垚圭洼㙓垚㙓.popAlertHUD((PlayerEntity)ㄑくくㄑㄑくくㄑくㄑㄑㄑ, ああおああおおおあおあおあおあああおおおあああおおおおおおああおおおああああおあおおあおあおおあああおあおおああおああおああおおああおああおあおあおあおあおおあおあああおおああおああおおあおおおおああおおおああおおああああおあおああああ, false);
                     break;
                  case fd_mode_880:
                     㙓垚茥桂洼土垚烓圭澆洼圭垚土澆烓㙓桂㙓土茥㙓茥烓圭洼桂洼垚洼桂圭洼垚澆桂洼㙓垚㙓土圭烓烓㙓桂土圭土烓桂茥垚土烓烓㙓茥㙓洼烓洼洼圭土圭垚圭澆㙓桂垚茥土垚垚圭洼㙓垚㙓.popAlertToast((PlayerEntity)ㄑくくㄑㄑくくㄑくㄑㄑㄑ, ああおああおおおあおあおあおあああおおおあああおおおおおおああおおおああああおあおおあおあおおあああおあおおああおああおああおおああおああおあおあおあおあおおあおあああおおああおああおおあおおおおああおおおああおおああああおあおああああ, false);
                  }

                  if ((Boolean)㙓垚茥桂洼土垚烓圭澆洼圭垚土澆烓㙓桂㙓土茥㙓茥烓圭洼桂洼垚洼桂圭洼垚澆桂洼㙓垚㙓土圭烓烓㙓桂土圭土烓桂茥垚土烓烓㙓茥㙓洼烓洼洼圭土圭垚圭澆㙓桂垚茥土垚垚圭洼㙓垚㙓.JLiILJliLiLlLjLjLlijLiIiilljjiLJlILijiliLIjijiIIiIiILlIjlLjlIlIllLJliLJLljIIiIJlIJjlIjIjijLJ.get() && (double)㙓垚茥桂洼土垚烓圭澆洼圭垚土澆烓㙓桂㙓土茥㙓茥烓圭洼桂洼垚洼桂圭洼垚澆桂洼㙓垚㙓土圭烓烓㙓桂土圭土烓桂茥垚土烓烓㙓茥㙓洼烓洼洼圭土圭垚圭澆㙓桂垚茥土垚垚圭洼㙓垚㙓.mc.player.distanceTo(ㄑくくㄑㄑくくㄑくㄑㄑㄑ) <= (Double)㙓垚茥桂洼土垚烓圭澆洼圭垚土澆烓㙓桂㙓土茥㙓茥烓圭洼桂洼垚洼桂圭洼垚澆桂洼㙓垚㙓土圭烓烓㙓桂土圭土烓桂茥垚土烓烓㙓茥㙓洼烓洼洼圭土圭垚圭澆㙓桂垚茥土垚垚圭洼㙓垚㙓.fd_Setting_64.get() && 㙓垚茥桂洼土垚烓圭澆洼圭垚土澆烓㙓桂㙓土茥㙓茥烓圭洼桂洼垚洼桂圭洼垚澆桂洼㙓垚㙓土圭烓烓㙓桂土圭土烓桂茥垚土烓烓㙓茥㙓洼烓洼洼圭土圭垚圭澆㙓桂垚茥土垚垚圭洼㙓垚㙓.fd_int_55 <= 0) {
                     if ((Boolean)㙓垚茥桂洼土垚烓圭澆洼圭垚土澆烓㙓桂㙓土茥㙓茥烓圭洼桂洼垚洼桂圭洼垚澆桂洼㙓垚㙓土圭烓烓㙓桂土圭土烓桂茥垚土烓烓㙓茥㙓洼烓洼洼圭土圭垚圭澆㙓桂垚茥土垚垚圭洼㙓垚㙓.fd_Setting_58.get() && Friends.get().isFriend((PlayerEntity)ㄑくくㄑㄑくくㄑくㄑㄑㄑ)) {
                        return;
                     }

                     String 炏炏欻炏火焱欻燚火炎燚焱焱炏欻欻焱燚火欻火欻焱火炎焱炎欻欻火焱燚火火欻燚炏火炏火炏燚炏欻炏炎火炏焱燚欻炏火炎炎焱炏欻欻燚欻炎焱炎火炏火炏燚炎焱火火火欻炎炎燚焱火炏火欻欻火燚燚火 = 㙓垚茥桂洼土垚烓圭澆洼圭垚土澆烓㙓桂㙓土茥㙓茥烓圭洼桂洼垚洼桂圭洼垚澆桂洼㙓垚㙓土圭烓烓㙓桂土圭土烓桂茥垚土烓烓㙓茥㙓洼烓洼洼圭土圭垚圭澆㙓桂垚茥土垚垚圭洼㙓垚㙓.getPopMessage((PlayerEntity)ㄑくくㄑㄑくくㄑくㄑㄑㄑ);
                     if ((Boolean)㙓垚茥桂洼土垚烓圭澆洼圭垚土澆烓㙓桂㙓土茥㙓茥烓圭洼桂洼垚洼桂圭洼垚澆桂洼㙓垚㙓土圭烓烓㙓桂土圭土烓桂茥垚土烓烓㙓茥㙓洼烓洼洼圭土圭垚圭澆㙓桂垚茥土垚垚圭洼㙓垚㙓.fd_Setting_59.get()) {
                        炏炏欻炏火焱欻燚火炎燚焱焱炏欻欻焱燚火欻火欻焱火炎焱炎欻欻火焱燚火火欻燚炏火炏火炏燚炏欻炏炎火炏焱燚欻炏火炎炎焱炏欻欻燚欻炎焱炎火炏火炏燚炎焱火火火欻炎炎燚焱火炏火欻欻火燚燚火 = Class23.apply(炏炏欻炏火焱欻燚火炎燚焱焱炏欻欻焱燚火欻火欻焱火炎焱炎欻欻火焱燚火火欻燚炏火炏火炏燚炏欻炏炎火炏焱燚欻炏火炎炎焱炏欻欻燚欻炎焱炎火炏火炏燚炎焱火火火欻炎炎燚焱火炏火欻欻火燚燚火);
                     }

                     String 淼㵘㵘沝沝㵘淼㵘水淼㵘淼㵘沝淼淼沝沝水沝淼沝㵘淼水沝淼沝水淼淼淼㵘水㵘水水水淼淼淼㵘沝㵘水水淼水淼沝沝淼水水淼沝沝淼水㵘㵘㵘㵘水㵘沝淼㵘㵘沝水淼水㵘沝沝水沝淼㵘淼沝㵘㵘沝水沝沝水沝沝水㵘淼㵘 = ㄑくくㄑㄑくくㄑくㄑㄑㄑ.getEntityName();
                     if ((Boolean)㙓垚茥桂洼土垚烓圭澆洼圭垚土澆烓㙓桂㙓土茥㙓茥烓圭洼桂洼垚洼桂圭洼垚澆桂洼㙓垚㙓土圭烓烓㙓桂土圭土烓桂茥垚土烓烓㙓茥㙓洼烓洼洼圭土圭垚圭澆㙓桂垚茥土垚垚圭洼㙓垚㙓.fd_Setting_66.get()) {
                        炏炏欻炏火焱欻燚火炎燚焱焱炏欻欻焱燚火欻火欻焱火炎焱炎欻欻火焱燚火火欻燚炏火炏火炏燚炏欻炏炎火炏焱燚欻炏火炎炎焱炏欻欻燚欻炎焱炎火炏火炏燚炎焱火火火欻炎炎燚焱火炏火欻欻火燚燚火 = 炏炏欻炏火焱欻燚火炎燚焱焱炏欻欻焱燚火欻火欻焱火炎焱炎欻欻火焱燚火火欻燚炏火炏火炏燚炏欻炏炎火炏焱燚欻炏火炎炎焱炏欻欻燚欻炎焱炎火炏火炏燚炎焱火火火欻炎炎燚焱火炏火欻欻火燚燚火 + " | Ion 1.4.2";
                     }

                     sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.sendMessage(炏炏欻炏火焱欻燚火炎燚焱焱炏欻欻焱燚火欻火欻焱火炎焱炎欻欻火焱燚火火欻燚炏火炏火炏燚炏欻炏炎火炏焱燚欻炏火炎炎焱炏欻欻燚欻炎焱炎火炏火炏燚炎焱火火火欻炎炎燚焱火炏火欻欻火燚燚火);
                     if ((Boolean)㙓垚茥桂洼土垚烓圭澆洼圭垚土澆烓㙓桂㙓土茥㙓茥烓圭洼桂洼垚洼桂圭洼垚澆桂洼㙓垚㙓土圭烓烓㙓桂土圭土烓桂茥垚土烓烓㙓茥㙓洼烓洼洼圭土圭垚圭澆㙓桂垚茥土垚垚圭洼㙓垚㙓.fd_Setting_53.get()) {
                        sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.messagePlayer(淼㵘㵘沝沝㵘淼㵘水淼㵘淼㵘沝淼淼沝沝水沝淼沝㵘淼水沝淼沝水淼淼淼㵘水㵘水水水淼淼淼㵘沝㵘水水淼水淼沝沝淼水水淼沝沝淼水㵘㵘㵘㵘水㵘沝淼㵘㵘沝水淼水㵘沝沝水沝淼㵘淼沝㵘㵘沝水沝沝水沝沝水㵘淼㵘, Class20.stripName(淼㵘㵘沝沝㵘淼㵘水淼㵘淼㵘沝淼淼沝沝水沝淼沝㵘淼水沝淼沝水淼淼淼㵘水㵘水水水淼淼淼㵘沝㵘水水淼水淼沝沝淼水水淼沝沝淼水㵘㵘㵘㵘水㵘沝淼㵘㵘沝水淼水㵘沝沝水沝淼㵘淼沝㵘㵘沝水沝沝水沝沝水㵘淼㵘, 炏炏欻炏火焱欻燚火炎燚焱焱炏欻欻焱燚火欻火欻焱火炎焱炎欻欻火焱燚火火欻燚炏火炏火炏燚炏欻炏炎火炏焱燚欻炏火炎炎焱炏欻欻燚欻炎焱炎火炏火炏燚炎焱火火火欻炎炎燚焱火炏火欻欻火燚燚火));
                     }

                     㙓垚茥桂洼土垚烓圭澆洼圭垚土澆烓㙓桂㙓土茥㙓茥烓圭洼桂洼垚洼桂圭洼垚澆桂洼㙓垚㙓土圭烓烓㙓桂土圭土烓桂茥垚土烓烓㙓茥㙓洼烓洼洼圭土圭垚圭澆㙓桂垚茥土垚垚圭洼㙓垚㙓.fd_int_55 = (Integer)㙓垚茥桂洼土垚烓圭澆洼圭垚土澆烓㙓桂㙓土茥㙓茥烓圭洼桂洼垚洼桂圭洼垚澆桂洼㙓垚㙓土圭烓烓㙓桂土圭土烓桂茥垚土烓烓㙓茥㙓洼烓洼洼圭土圭垚圭澆㙓桂垚茥土垚垚圭洼㙓垚㙓.fd_Setting_63.get() * 20;
                  }

               }
            }
         }
      }
   }

   public PopCounter() {
      super(Class68.fd_Category_1059, "pop-counter", "Count player's totem pops.");
      一一一二二二二一三三二三三亖二亖二一二亖亖三二一二一二亖二一亖二二三三二一亖三二亖一一二三二亖三三亖三亖三三一一一亖三二亖一亖亖三二一一三二一二二二亖一三三三二一一一亖亖亖一亖亖.fd_SettingGroup_60 = 一一一二二二二一三三二三三亖二亖二一二亖亖三二一二一二亖二一亖二二三三二一亖三二亖一一二三二亖三三亖三亖三三一一一亖三二亖一亖亖三二一一三二一二二二亖一三三三二一一一亖亖亖一亖亖.settings.getDefaultGroup();
      一一一二二二二一三三二三三亖二亖二一二亖亖三二一二一二亖二一亖二二三三二一亖三二亖一一二三二亖三三亖三亖三三一一一亖三二亖一亖亖三二一一三二一二二二亖一三三三二一一一亖亖亖一亖亖.fd_SettingGroup_68 = 一一一二二二二一三三二三三亖二亖二一二亖亖三二一二一二亖二一亖二二三三二一亖三二亖一一二三二亖三三亖三亖三三一一一亖三二亖一亖亖三二一一三二一二二二亖一三三三二一一一亖亖亖一亖亖.settings.createGroup("Messages");
      一一一二二二二一三三二三三亖二亖二一二亖亖三二一二一二亖二一亖二二三三二一亖三二亖一一二三二亖三三亖三亖三三一一一亖三二亖一亖亖三二一一三二一二二二亖一三三三二一一一亖亖亖一亖亖.fd_Setting_65 = 一一一二二二二一三三二三三亖二亖二一二亖亖三二一二一二亖二一亖二二三三二一亖三二亖一一二三二亖三三亖三亖三三一一一亖三二亖一亖亖三二一一三二一二二二亖一三三三二一一一亖亖亖一亖亖.fd_SettingGroup_60.add(((Builder)((Builder)((Builder)(new Builder()).name("own")).description("Notifies you of your own totem pops.")).defaultValue(false)).build());
      一一一二二二二一三三二三三亖二亖二一二亖亖三二一二一二亖二一亖二二三三二一亖三二亖一一二三二亖三三亖三亖三三一一一亖三二亖一亖亖三二一一三二一二二二亖一三三三二一一一亖亖亖一亖亖.fd_Setting_56 = 一一一二二二二一三三二三三亖二亖二一二亖亖三二一二一二亖二一亖二二三三二一亖三二亖一一二三二亖三三亖三亖三三一一一亖三二亖一亖亖三二一一三二一二二二亖一三三三二一一一亖亖亖一亖亖.fd_SettingGroup_60.add(((Builder)((Builder)((Builder)(new Builder()).name("friends")).description("Notifies you of your friends totem pops.")).defaultValue(true)).build());
      一一一二二二二一三三二三三亖二亖二一二亖亖三二一二一二亖二一亖二二三三二一亖三二亖一一二三二亖三三亖三亖三三一一一亖三二亖一亖亖三二一一三二一二二二亖一三三三二一一一亖亖亖一亖亖.fd_Setting_54 = 一一一二二二二一三三二三三亖二亖二一二亖亖三二一二一二亖二一亖二二三三二一亖三二亖一一二三二亖三三亖三亖三三一一一亖三二亖一亖亖三二一一三二一二二二亖一三三三二一一一亖亖亖一亖亖.fd_SettingGroup_60.add(((Builder)((Builder)((Builder)(new Builder()).name("others")).description("Notifies you of other players totem pops.")).defaultValue(true)).build());
      一一一二二二二一三三二三三亖二亖二一二亖亖三二一二一二亖二一亖二二三三二一亖三二亖一一二三二亖三三亖三亖三三一一一亖三二亖一亖亖三二一一三二一二二二亖一三三三二一一一亖亖亖一亖亖.fd_Setting_62 = 一一一二二二二一三三二三三亖二亖二一二亖亖三二一二一二亖二一亖二二三三二一亖三二亖一一二三二亖三三亖三亖三三一一一亖三二亖一亖亖三二一一三二一二二二亖一三三三二一一一亖亖亖一亖亖.fd_SettingGroup_60.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("notification-mode")).description("How notifications are displayed.")).defaultValue(mode.fd_mode_881)).build());
      SettingGroup var10001 = 一一一二二二二一三三二三三亖二亖二一二亖亖三二一二一二亖二一亖二二三三二一亖三二亖一一二三二亖三三亖三亖三三一一一亖三二亖一亖亖三二一一三二一二二二亖一三三三二一一一亖亖亖一亖亖.fd_SettingGroup_60;
      Builder var10002 = (Builder)((Builder)((Builder)(new Builder()).name("announce")).description("Announces when other players pop totems in global chat.")).defaultValue(false);
      Setting var10003 = 一一一二二二二一三三二三三亖二亖二一二亖亖三二一二一二亖二一亖二二三三二一亖三二亖一一二三二亖三三亖三亖三三一一一亖三二亖一亖亖三二一一三二一二二二亖一三三三二一一一亖亖亖一亖亖.fd_Setting_54;
      Objects.requireNonNull(var10003);
      一一一二二二二一三三二三三亖二亖二一二亖亖三二一二一二亖二一亖二二三三二一亖三二亖一一二三二亖三三亖三亖三三一一一亖三二亖一亖亖三二一一三二一二二二亖一三三三二一一一亖亖亖一亖亖.JLiILJliLiLlLjLjLlijLiIiilljjiLJlILijiliLIjijiIIiIiILlIjlLjlIlIllLJliLJLljIIiIJlIJjlIjIjijLJ = var10001.add(((Builder)var10002.visible(var10003::get)).build());
      var10001 = 一一一二二二二一三三二三三亖二亖二一二亖亖三二一二一二亖二一亖二二三三二一亖三二亖一一二三二亖三三亖三亖三三一一一亖三二亖一亖亖三二一一三二一二二二亖一三三三二一一一亖亖亖一亖亖.fd_SettingGroup_60;
      var10002 = (Builder)((Builder)((Builder)(new Builder()).name("pm")).description("Message players when they pop a totem.")).defaultValue(false);
      var10003 = 一一一二二二二一三三二三三亖二亖二一二亖亖三二一二一二亖二一亖二二三三二一亖三二亖一一二三二亖三三亖三亖三三一一一亖三二亖一亖亖三二一一三二一二二二亖一三三三二一一一亖亖亖一亖亖.JLiILJliLiLlLjLjLlijLiIiilljjiLJlILijiliLIjijiIIiIiILlIjlLjlIlIllLJliLJLljIIiIJlIJjlIjIjijLJ;
      Objects.requireNonNull(var10003);
      一一一二二二二一三三二三三亖二亖二一二亖亖三二一二一二亖二一亖二二三三二一亖三二亖一一二三二亖三三亖三亖三三一一一亖三二亖一亖亖三二一一三二一二二二亖一三三三二一一一亖亖亖一亖亖.fd_Setting_53 = var10001.add(((Builder)var10002.visible(var10003::get)).build());
      var10001 = 一一一二二二二一三三二三三亖二亖二一二亖亖三二一二一二亖二一亖二二三三二一亖三二亖一一二三二亖三三亖三亖三三一一一亖三二亖一亖亖三二一一三二一二二二亖一三三三二一一一亖亖亖一亖亖.fd_SettingGroup_60;
      meteordevelopment.meteorclient.settings.IntSetting.Builder var1 = ((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("announce-delay")).description("How many seconds between announcing totem pops.")).defaultValue(5)).min(1).sliderMax(100);
      var10003 = 一一一二二二二一三三二三三亖二亖二一二亖亖三二一二一二亖二一亖二二三三二一亖三二亖一一二三二亖三三亖三亖三三一一一亖三二亖一亖亖三二一一三二一二二二亖一三三三二一一一亖亖亖一亖亖.JLiILJliLiLlLjLjLlijLiIiilljjiLJlILijiliLIjijiIIiIiILlIjlLjlIlIllLJliLJLljIIiIJlIJjlIjIjijLJ;
      Objects.requireNonNull(var10003);
      一一一二二二二一三三二三三亖二亖二一二亖亖三二一二一二亖二一亖二二三三二一亖三二亖一一二三二亖三三亖三亖三三一一一亖三二亖一亖亖三二一一三二一二二二亖一三三三二一一一亖亖亖一亖亖.fd_Setting_63 = var10001.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)var1.visible(var10003::get)).build());
      var10001 = 一一一二二二二一三三二三三亖二亖二一二亖亖三二一二一二亖二一亖二二三三二一亖三二亖一一二三二亖三三亖三亖三三一一一亖三二亖一亖亖三二一一三二一二二二亖一三三三二一一一亖亖亖一亖亖.fd_SettingGroup_60;
      meteordevelopment.meteorclient.settings.DoubleSetting.Builder var2 = ((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)(new meteordevelopment.meteorclient.settings.DoubleSetting.Builder()).name("announce-range")).description("How close players need to be to announce pops or AutoEz.")).defaultValue(3.0D).min(0.0D).sliderMax(10.0D);
      var10003 = 一一一二二二二一三三二三三亖二亖二一二亖亖三二一二一二亖二一亖二二三三二一亖三二亖一一二三二亖三三亖三亖三三一一一亖三二亖一亖亖三二一一三二一二二二亖一三三三二一一一亖亖亖一亖亖.JLiILJliLiLlLjLjLlijLiIiilljjiLJlILijiliLIjijiIIiIiILlIjlLjlIlIllLJliLJLljIIiIJlIJjlIjIjijLJ;
      Objects.requireNonNull(var10003);
      一一一二二二二一三三二三三亖二亖二一二亖亖三二一二一二亖二一亖二二三三二一亖三二亖一一二三二亖三三亖三亖三三一一一亖三二亖一亖亖三二一一三二一二二二亖一三三三二一一一亖亖亖一亖亖.fd_Setting_64 = var10001.add(((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)var2.visible(var10003::get)).build());
      一一一二二二二一三三二三三亖二亖二一二亖亖三二一二一二亖二一亖二二三三二一亖三二亖一一二三二亖三三亖三亖三三一一一亖三二亖一亖亖三二一一三二一二二二亖一三三三二一一一亖亖亖一亖亖.fd_Setting_58 = 一一一二二二二一三三二三三亖二亖二一二亖亖三二一二一二亖二一亖二二三三二一亖三二亖一一二三二亖三三亖三亖三三一一一亖三二亖一亖亖三二一一三二一二二二亖一三三三二一一一亖亖亖一亖亖.fd_SettingGroup_60.add(((Builder)((Builder)((Builder)(new Builder()).name("dont-announce-friends")).description("Don't annnounce when your friends pop.")).defaultValue(true)).build());
      一一一二二二二一三三二三三亖二亖二一二亖亖三二一二一二亖二一亖二二三三二一亖三二亖一一二三二亖三三亖三亖三三一一一亖三二亖一亖亖三二一一三二一二二二亖一三三三二一一一亖亖亖一亖亖.fd_Setting_59 = 一一一二二二二一三三二三三亖二亖二一二亖亖三二一二一二亖二一亖二二三三二一亖三二亖一一二三二亖三三亖三亖三三一一一亖三二亖一亖亖三二一一三二一二二二亖一三三三二一一一亖亖亖一亖亖.fd_SettingGroup_60.add(((Builder)((Builder)((Builder)(new Builder()).name("placeholders")).description("Enable global placeholders for pop messages.")).defaultValue(false)).build());
      一一一二二二二一三三二三三亖二亖二一二亖亖三二一二一二亖二一亖二二三三二一亖三二亖一一二三二亖三三亖三亖三三一一一亖三二亖一亖亖三二一一三二一二二二亖一三三三二一一一亖亖亖一亖亖.fd_Setting_66 = 一一一二二二二一三三二三三亖二亖二一二亖亖三二一二一二亖二一亖二二三三二一亖三二亖一一二三二亖三三亖三亖三三一一一亖三二亖一亖亖三二一一三二一二二二亖一三三三二一一一亖亖亖一亖亖.fd_SettingGroup_60.add(((Builder)((Builder)((Builder)(new Builder()).name("suffix")).description("Add Ion suffix to the end of pop messages.")).defaultValue(false)).build());
      一一一二二二二一三三二三三亖二亖二一二亖亖三二一二一二亖二一亖二二三三二一亖三二亖一一二三二亖三三亖三亖三三一一一亖三二亖一亖亖三二一一三二一二二二亖一三三三二一一一亖亖亖一亖亖.fd_Setting_61 = 一一一二二二二一三三二三三亖二亖二一二亖亖三二一二一二亖二一亖二二三三二一亖三二亖一一二三二亖三三亖三亖三三一一一亖三二亖一亖亖三二一一三二一二二二亖一三三三二一一一亖亖亖一亖亖.fd_SettingGroup_68.add(((meteordevelopment.meteorclient.settings.StringListSetting.Builder)((meteordevelopment.meteorclient.settings.StringListSetting.Builder)((meteordevelopment.meteorclient.settings.StringListSetting.Builder)(new meteordevelopment.meteorclient.settings.StringListSetting.Builder()).name("pop-messages")).description("Messages to use when announcing pops.")).defaultValue(Collections.emptyList())).build());
      一一一二二二二一三三二三三亖二亖二一二亖亖三二一二一二亖二一亖二二三三二一亖三二亖一一二三二亖三三亖三亖三三一一一亖三二亖一亖亖三二一一三二一二二二亖一三三三二一一一亖亖亖一亖亖.fd_Object2IntMap_67 = new Object2IntOpenHashMap();
      一一一二二二二一三三二三三亖二亖二一二亖亖三二一二一二亖二一亖二二三三二一亖三二亖一一二三二亖三三亖三亖三三一一一亖三二亖一亖亖三二一一三二一二二二亖一三三三二一一一亖亖亖一亖亖.liiijLLLJiijljIIljIJLJllIiJLIJIlLjiLIjljjJlILJlJiLiJJjLlLiIJJjLjJIiJLIJJjIjJIJliLIIJJJLiiJIlJIII = new Object2IntOpenHashMap();
      一一一二二二二一三三二三三亖二亖二一二亖亖三二一二一二亖二一亖二二三三二一亖三二亖一一二三二亖三三亖三亖三三一一一亖三二亖一亖亖三二一一三二一二二二亖一三三三二一一一亖亖亖一亖亖.fd_Random_57 = new Random();
      一一一二二二二一三三二三三亖二亖二一二亖亖三二一二一二亖二一亖二二三三二一亖三二亖一一二三二亖三三亖三亖三三一一一亖三二亖一亖亖三二一一三二一二二二亖一三三三二一一一亖亖亖一亖亖.fd_int_52 = 0;
   }

   private void popAlertToast(PlayerEntity IijIjjJlILLjilj, int 㬺㬺㬺幐㬺㬺㬺幐㬺幐幐㬺幐㬺幐㬺幐㬺幐幐㬺㬺㬺㬺幐幐幐幐幐㬺幐幐, boolean ゆゆゆゅゆゆゆゆゆゅゅゅゆゅゅゅゅゆゅゆゆゅゆゆゆゅゆゅゅゆゆゆゅゆゆゆゅゆゅゅゅゆゆゅゆゅゅゅゅゅゅゅゆゆゅ) {
      NotificationsHUD.popAlert(くくㄑくㄑくㄑㄑㄑくㄑㄑくくくくくくくㄑㄑㄑくくㄑくㄑくㄑㄑくくㄑくㄑㄑくㄑㄑㄑくㄑくくくくㄑㄑくㄑくㄑくㄑㄑくㄑㄑくㄑくㄑㄑくくくくくくくくくくㄑくㄑくㄑㄑくくㄑくくㄑくㄑくくㄑ.getPopAlert(三二一一三亖亖亖二一三三亖亖, ㄑㄑㄑくㄑㄑくㄑㄑㄑくㄑくくㄑくくㄑㄑㄑくㄑくくㄑㄑくㄑㄑㄑㄑㄑㄑㄑくㄑくㄑくㄑㄑㄑくㄑくㄑㄑㄑㄑくㄑㄑㄑㄑくくㄑㄑくㄑㄑㄑくくㄑㄑくくくㄑくㄑㄑㄑくくくくㄑㄑㄑくくくㄑくくㄑㄑㄑくくㄑくくㄑㄑㄑくくくくㄑㄑくㄑㄑくくㄑくくくㄑくㄑくㄑㄑ, 一二二三三三三一三三一亖二三三亖一三一一一三一一三二二三一亖));
   }

   private String getPopMessage(PlayerEntity ぃりりリいりりりりりぃぃぃりリりリぃぃぃぃりいぃリぃリりりぃぃリいリリリいぃいリいりぃリいリりりいりぃぃいいいぃぃりいぃぃリリいリリいいぃりいいりぃり) {
      if (((List)晩晩晚晩晩晚晚晩晩晩晩晚晩晚晚晩晩晚.fd_Setting_61.get()).isEmpty()) {
         ChatUtils.warning("Your pop message list is empty!", new Object[0]);
         return "Ez pop";
      } else {
         String ㇸへㇸへ乀乀へへ乀へへへㇸ乀へㇸㇸへ乀乀ㇸㇸへ乀乀乀ㇸㇸㇸㇸㇸへㇸ乀へㇸ乀ㇸㇸㇸ乀乀ㇸへㇸㇸ乀乀ㇸㇸ乀乀ㇸㇸㇸㇸㇸへ乀 = 晚晚晩晩晚晚晚晚晩晩晩晩晚晩晩晚晚晚晚晩晩晚晩晩晚晩晩晚晚晚晩晚晩晩晩晚晚晚晩晚晩晩晚晩晩晩晚晚晚晩晩晩晚晚晩晚晩晩晩晚晩晚晩晚晚晚晩晚晩.getEntityName();
         String ㄑㄑㄑㄑくㄑㄑㄑくくくㄑくくㄑㄑㄑくくくくくㄑㄑくㄑくくくくくくくㄑくㄑㄑくㄑくくくㄑくくくくくくくくくくㄑㄑくㄑㄑㄑくくくく = (String)((List)晩晩晚晩晩晚晚晩晩晩晩晚晩晚晚晩晩晚.fd_Setting_61.get()).get((new Random()).nextInt(((List)晩晩晚晩晩晚晚晩晩晩晩晚晩晚晚晩晩晚.fd_Setting_61.get()).size()));
         if (ㄑㄑㄑㄑくㄑㄑㄑくくくㄑくくㄑㄑㄑくくくくくㄑㄑくㄑくくくくくくくㄑくㄑㄑくㄑくくくㄑくくくくくくくくくくㄑㄑくㄑㄑㄑくくくく.contains("{pops}")) {
            if (晩晩晚晩晩晚晚晩晩晩晩晚晩晚晚晩晩晚.fd_Object2IntMap_67.containsKey(晚晚晩晩晚晚晚晚晩晩晩晩晚晩晩晚晚晚晚晩晩晚晩晩晚晩晩晚晚晚晩晚晩晩晩晚晚晚晩晚晩晩晚晩晩晩晚晚晚晩晩晩晚晚晩晚晩晩晩晚晩晚晩晚晚晚晩晚晩.getUuid())) {
               int くくㄑくくㄑくくくㄑくくㄑㄑくくくくくㄑくㄑくくㄑくくㄑくくㄑくくくくㄑㄑㄑくㄑㄑㄑくくㄑくㄑㄑくㄑㄑくㄑくくくㄑくㄑㄑㄑくㄑくㄑㄑくくㄑくくㄑくㄑㄑくㄑくㄑㄑくくㄑくくくㄑくくㄑㄑㄑくㄑㄑくくくㄑㄑくくㄑㄑㄑく = 晩晩晚晩晩晚晚晩晩晩晩晚晩晚晚晩晩晚.fd_Object2IntMap_67.getOrDefault(晚晚晩晩晚晚晚晚晩晩晩晩晚晩晩晚晚晚晚晩晩晚晩晩晚晩晩晚晚晚晩晚晩晩晩晚晚晚晩晚晩晩晚晩晩晩晚晚晚晩晩晩晚晚晩晚晩晩晩晚晩晚晩晚晚晚晩晚晩.getUuid(), 0);
               ㄑㄑㄑㄑくㄑㄑㄑくくくㄑくくㄑㄑㄑくくくくくㄑㄑくㄑくくくくくくくㄑくㄑㄑくㄑくくくㄑくくくくくくくくくくㄑㄑくㄑㄑㄑくくくく = ㄑㄑㄑㄑくㄑㄑㄑくくくㄑくくㄑㄑㄑくくくくくㄑㄑくㄑくくくくくくくㄑくㄑㄑくㄑくくくㄑくくくくくくくくくくㄑㄑくㄑㄑㄑくくくく.replace("{pops}", くくㄑくくㄑくくくㄑくくㄑㄑくくくくくㄑくㄑくくㄑくくㄑくくㄑくくくくㄑㄑㄑくㄑㄑㄑくくㄑくㄑㄑくㄑㄑくㄑくくくㄑくㄑㄑㄑくㄑくㄑㄑくくㄑくくㄑくㄑㄑくㄑくㄑㄑくくㄑくくくㄑくくㄑㄑㄑくㄑㄑくくくㄑㄑくくㄑㄑㄑく + " " + 晩晩晚晩晩晚晚晩晩晩晩晚晩晚晚晩晩晚.getPopGrammar(くくㄑくくㄑくくくㄑくくㄑㄑくくくくくㄑくㄑくくㄑくくㄑくくㄑくくくくㄑㄑㄑくㄑㄑㄑくくㄑくㄑㄑくㄑㄑくㄑくくくㄑくㄑㄑㄑくㄑくㄑㄑくくㄑくくㄑくㄑㄑくㄑくㄑㄑくくㄑくくくㄑくくㄑㄑㄑくㄑㄑくくくㄑㄑくくㄑㄑㄑく));
            } else {
               ㄑㄑㄑㄑくㄑㄑㄑくくくㄑくくㄑㄑㄑくくくくくㄑㄑくㄑくくくくくくくㄑくㄑㄑくㄑくくくㄑくくくくくくくくくくㄑㄑくㄑㄑㄑくくくく = "Ezz pop";
            }
         }

         if (ㄑㄑㄑㄑくㄑㄑㄑくくくㄑくくㄑㄑㄑくくくくくㄑㄑくㄑくくくくくくくㄑくㄑㄑくㄑくくくㄑくくくくくくくくくくㄑㄑくㄑㄑㄑくくくく.contains("{player}")) {
            ㄑㄑㄑㄑくㄑㄑㄑくくくㄑくくㄑㄑㄑくくくくくㄑㄑくㄑくくくくくくくㄑくㄑㄑくㄑくくくㄑくくくくくくくくくくㄑㄑくㄑㄑㄑくくくく = ㄑㄑㄑㄑくㄑㄑㄑくくくㄑくくㄑㄑㄑくくくくくㄑㄑくㄑくくくくくくくㄑくㄑㄑくㄑくくくㄑくくくくくくくくくくㄑㄑくㄑㄑㄑくくくく.replace("{player}", ㇸへㇸへ乀乀へへ乀へへへㇸ乀へㇸㇸへ乀乀ㇸㇸへ乀乀乀ㇸㇸㇸㇸㇸへㇸ乀へㇸ乀ㇸㇸㇸ乀乀ㇸへㇸㇸ乀乀ㇸㇸ乀乀ㇸㇸㇸㇸㇸへ乀);
         }

         return ㄑㄑㄑㄑくㄑㄑㄑくくくㄑくくㄑㄑㄑくくくくくㄑㄑくㄑくくくくくくくㄑくㄑㄑくㄑくくくㄑくくくくくくくくくくㄑㄑくㄑㄑㄑくくくく;
      }
   }

   private String getPopGrammar(int ijjJJLJlIIIIILLJIiIlLlLIJlljJlLlLjijiILJlLjiIilLLIlLllIillllilIliijlJIijjijlIIiiLJJJjLJLijILiiLllLIjjjlLjJjIiJlJjJJJ) {
      return いぃリぃりリリリりりりぃリリりリいリぃりりぃぃいリぃりりりぃいリぃいぃリ == 1 ? " totem" : " totems";
   }

   private void popAlertHUD(PlayerEntity 木木森森木木木森森森林木木木林森森森林木森森林林森森林林森木森森林森林林木森森木林木林森木森木林林木森林林木木林木林木木木木森林森森木森, int 鹅鵞鹅鵞鵞鹅鵞鹅鵞鵞鵞鵞鵞鹅鹅鵞鹅鹅鹅鹅鹅鹅鹅鵞鵞鹅鹅鵞鵞鹅鵞鹅鹅鹅鹅鹅鹅鹅鵞鵞鵞鹅鹅鵞鹅鹅鹅鹅鵞鹅鵞鵞鵞鵞鹅鹅鵞鹅鹅鹅鹅鹅鹅鹅鵞鵞鹅鹅鹅鹅鵞鵞鵞鵞鹅鹅鹅鹅鵞鹅鹅鵞鹅鵞鵞鵞鹅鵞鹅鹅鵞鹅鹅鹅鹅鵞鵞鵞鵞鹅鹅鵞鵞鹅鹅鹅鵞鹅鵞鹅鹅鵞鹅, boolean 沝㵘㵘水淼淼㵘淼水㵘㵘淼沝水淼㵘沝沝沝㵘沝水水㵘沝水㵘水㵘淼水淼水淼淼㵘淼水水㵘淼水㵘㵘㵘淼沝水淼淼沝㵘㵘水沝淼淼水㵘㵘沝沝沝沝沝淼沝沝水㵘水沝水㵘㵘水沝水㵘沝水㵘㵘沝㵘水水淼淼淼水沝水沝沝沝㵘水沝沝㵘水沝沝沝沝水) {
      NotificationsHUD.addNotification(おあああああおおあおおおおおあおあおおおおおおおあおああおああああああおあおあおあおおあおあああおおおおあおおおああおおああおおあああああああおおあああおああおあおおあああおおおあおああおおあおおおおおおおおああおああおあおおおあおあおおお.getPopAlert(佪茴佪佪茴徊茴茴徊回茴回佪回茴佪茴茴回回回徊回茴佪佪回佪茴回徊回回徊徊徊徊佪佪茴回徊佪回茴佪回徊茴佪回回徊徊回佪佪茴佪回徊回回回佪佪回回回佪回佪佪徊徊佪回佪茴佪茴茴, 鵞鵞鵞鹅鹅鹅鵞鵞鹅鹅鵞鵞鹅鹅鹅鵞鹅鵞鵞鹅鹅鵞鵞鹅鹅鵞鵞鵞鵞鹅鹅鵞鵞鹅鹅鵞鹅鹅鵞鵞鹅鵞鵞鵞鹅鹅鵞鵞鹅鵞鵞鹅鹅鵞鹅鹅鹅鹅鹅鹅鵞鵞鹅鹅鹅鹅鹅鵞鵞鵞鹅鵞鹅鹅鵞鹅鹅鹅鹅鹅鹅鵞鵞鹅鵞鹅鹅鹅鵞鹅鹅鵞鹅鵞鵞鵞鹅, りいぃリいリリいぃリリぃぃぃリりリりりぃリいりりぃりリりぃりリいリぃぃリぃリりリリりいぃリりいリりぃリりぃいリぃリりりぃいいリリぃりリリぃりりぃリぃぃ));
   }

   @EventHandler
   private void onTick(Post へへへ乀へへㇸへへ乀ㇸ乀へへへへへ乀ㇸ乀ㇸへへㇸㇸへㇸ乀へ乀乀へㇸへㇸㇸへ乀へㇸㇸへㇸㇸ乀へㇸㇸㇸへへへへ乀ㇸㇸㇸㇸ乀へへ乀へへへ乀へㇸ乀) {
      --佪佪回回茴佪回回回佪回茴茴徊回茴回回回徊茴茴回佪佪佪徊徊回回佪佪佪徊徊徊徊徊回佪茴佪徊茴茴徊回徊徊佪回徊徊回徊徊茴佪回佪徊徊回佪徊茴回徊徊徊茴回回回回徊茴茴徊茴徊回茴茴徊徊茴徊茴徊佪佪佪茴佪徊佪茴徊回茴佪茴佪回徊茴茴徊回茴徊回茴佪茴.fd_int_55;
      Object2IntMap var2;
      synchronized(var2 = 佪佪回回茴佪回回回佪回茴茴徊回茴回回回徊茴茴回佪佪佪徊徊回回佪佪佪徊徊徊徊徊回佪茴佪徊茴茴徊回徊徊佪回徊徊回徊徊茴佪回佪徊徊回佪徊茴回徊徊徊茴回回回回徊茴茴徊茴徊回茴茴徊徊茴徊茴徊佪佪佪茴佪徊佪茴徊回茴佪茴佪回徊茴茴徊回茴徊回茴佪茴.fd_Object2IntMap_67){}
      Iterator var3 = 佪佪回回茴佪回回回佪回茴茴徊回茴回回回徊茴茴回佪佪佪徊徊回回佪佪佪徊徊徊徊徊回佪茴佪徊茴茴徊回徊徊佪回徊徊回徊徊茴佪回佪徊徊回佪徊茴回徊徊徊茴回回回回徊茴茴徊茴徊回茴茴徊徊茴徊茴徊佪佪佪茴佪徊佪茴徊回茴佪茴佪回徊茴茴徊回茴徊回茴佪茴.mc.world.getPlayers().iterator();

      while(true) {
         PlayerEntity 墫壿壿壿墫壿墫墫墫壿壿壿壿壿壿墫壿墫墫壿壿壿墫墫壿墫壿壿壿壿墫墫壿壿墫壿墫墫壿壿壿壿壿壿壿壿壿壿墫壿墫壿壿壿壿墫墫墫墫壿墫壿墫墫壿墫墫墫壿墫壿墫壿壿壿壿壿墫墫墫墫壿墫壿壿墫墫墫壿墫壿壿壿壿墫墫壿墫墫墫墫墫墫墫墫墫墫墫壿壿壿壿墫墫墫墫墫壿壿壿壿壿壿墫壿墫;
         do {
            do {
               if (!var3.hasNext()) {
                  return;
               }

               墫壿壿壿墫壿墫墫墫壿壿壿壿壿壿墫壿墫墫壿壿壿墫墫壿墫壿壿壿壿墫墫壿壿墫壿墫墫壿壿壿壿壿壿壿壿壿壿墫壿墫壿壿壿壿墫墫墫墫壿墫壿墫墫壿墫墫墫壿墫壿墫壿壿壿壿壿墫墫墫墫壿墫壿壿墫墫墫壿墫壿壿壿壿墫墫壿墫墫墫墫墫墫墫墫墫墫墫壿壿壿壿墫墫墫墫墫壿壿壿壿壿壿墫壿墫 = (PlayerEntity)var3.next();
            } while(!佪佪回回茴佪回回回佪回茴茴徊回茴回回回徊茴茴回佪佪佪徊徊回回佪佪佪徊徊徊徊徊回佪茴佪徊茴茴徊回徊徊佪回徊徊回徊徊茴佪回佪徊徊回佪徊茴回徊徊徊茴回回回回徊茴茴徊茴徊回茴茴徊徊茴徊茴徊佪佪佪茴佪徊佪茴徊回茴佪茴佪回徊茴茴徊回茴徊回茴佪茴.fd_Object2IntMap_67.containsKey(墫壿壿壿墫壿墫墫墫壿壿壿壿壿壿墫壿墫墫壿壿壿墫墫壿墫壿壿壿壿墫墫壿壿墫壿墫墫壿壿壿壿壿壿壿壿壿壿墫壿墫壿壿壿壿墫墫墫墫壿墫壿墫墫壿墫墫墫壿墫壿墫壿壿壿壿壿墫墫墫墫壿墫壿壿墫墫墫壿墫壿壿壿壿墫墫壿墫墫墫墫墫墫墫墫墫墫墫壿壿壿壿墫墫墫墫墫壿壿壿壿壿壿墫壿墫.getUuid()));
         } while(墫壿壿壿墫壿墫墫墫壿壿壿壿壿壿墫壿墫墫壿壿壿墫墫壿墫壿壿壿壿墫墫壿壿墫壿墫墫壿壿壿壿壿壿壿壿壿壿墫壿墫壿壿壿壿墫墫墫墫壿墫壿墫墫壿墫墫墫壿墫壿墫壿壿壿壿壿墫墫墫墫壿墫壿壿墫墫墫壿墫壿壿壿壿墫墫壿墫墫墫墫墫墫墫墫墫墫墫壿壿壿壿墫墫墫墫墫壿壿壿壿壿壿墫壿墫.deathTime <= 0 && 墫壿壿壿墫壿墫墫墫壿壿壿壿壿壿墫壿墫墫壿壿壿墫墫壿墫壿壿壿壿墫墫壿壿墫壿墫墫壿壿壿壿壿壿壿壿壿壿墫壿墫壿壿壿壿墫墫墫墫壿墫壿墫墫壿墫墫墫壿墫壿墫壿壿壿壿壿墫墫墫墫壿墫壿壿墫墫墫壿墫壿壿壿壿墫墫壿墫墫墫墫墫墫墫墫墫墫墫壿壿壿壿墫墫墫墫墫壿壿壿壿壿壿墫壿墫.getHealth() > 0.0F);

         int ㇸへ乀ㇸへへㇸへへㇸへㇸ乀へへㇸへ乀へㇸへへㇸへ乀ㇸ乀ㇸㇸへ乀ㇸㇸ乀乀ㇸ乀へㇸㇸㇸㇸへㇸㇸ乀へㇸへへへ乀乀乀乀ㇸㇸㇸㇸㇸ乀へㇸへ乀乀ㇸ乀へへへㇸ乀乀乀ㇸㇸ乀へ乀ㇸへ乀乀乀乀へへ乀へへ乀ㇸㇸへ乀ㇸへㇸへ乀へへへㇸへ乀へ乀乀へへㇸ乀へへ乀乀ㇸㇸㇸ乀ㇸ = 佪佪回回茴佪回回回佪回茴茴徊回茴回回回徊茴茴回佪佪佪徊徊回回佪佪佪徊徊徊徊徊回佪茴佪徊茴茴徊回徊徊佪回徊徊回徊徊茴佪回佪徊徊回佪徊茴回徊徊徊茴回回回回徊茴茴徊茴徊回茴茴徊徊茴徊茴徊佪佪佪茴佪徊佪茴徊回茴佪茴佪回徊茴茴徊回茴徊回茴佪茴.fd_Object2IntMap_67.removeInt(墫壿壿壿墫壿墫墫墫壿壿壿壿壿壿墫壿墫墫壿壿壿墫墫壿墫壿壿壿壿墫墫壿壿墫壿墫墫壿壿壿壿壿壿壿壿壿壿墫壿墫壿壿壿壿墫墫墫墫壿墫壿墫墫壿墫墫墫壿墫壿墫壿壿壿壿壿墫墫墫墫壿墫壿壿墫墫墫壿墫壿壿壿壿墫墫壿墫墫墫墫墫墫墫墫墫墫墫壿壿壿壿墫墫墫墫墫壿壿壿壿壿壿墫壿墫.getUuid());
         Class55.fd_ArrayList_1030.add(new QqPpPQQQQpQppqPqPqpQqQqQpqPQQQqQQPQQQPpqQPpQQPPpPqQQPqPqQqQ(墫壿壿壿墫壿墫墫墫壿壿壿壿壿壿墫壿墫墫壿壿壿墫墫壿墫壿壿壿壿墫墫壿壿墫壿墫墫壿壿壿壿壿壿壿壿壿壿墫壿墫壿壿壿壿墫墫墫墫壿墫壿墫墫壿墫墫墫壿墫壿墫壿壿壿壿壿墫墫墫墫壿墫壿壿墫墫墫壿墫壿壿壿壿墫墫壿墫墫墫墫墫墫墫墫墫墫墫壿壿壿壿墫墫墫墫墫壿壿壿壿壿壿墫壿墫, ㇸへ乀ㇸへへㇸへへㇸへㇸ乀へへㇸへ乀へㇸへへㇸへ乀ㇸ乀ㇸㇸへ乀ㇸㇸ乀乀ㇸ乀へㇸㇸㇸㇸへㇸㇸ乀へㇸへへへ乀乀乀乀ㇸㇸㇸㇸㇸ乀へㇸへ乀乀ㇸ乀へへへㇸ乀乀乀ㇸㇸ乀へ乀ㇸへ乀乀乀乀へへ乀へへ乀ㇸㇸへ乀ㇸへㇸへ乀へへへㇸへ乀へ乀乀へへㇸ乀へへ乀乀ㇸㇸㇸ乀ㇸ));
         switch((mode)佪佪回回茴佪回回回佪回茴茴徊回茴回回回徊茴茴回佪佪佪徊徊回回佪佪佪徊徊徊徊徊回佪茴佪徊茴茴徊回徊徊佪回徊徊回徊徊茴佪回佪徊徊回佪徊茴回徊徊徊茴回回回回徊茴茴徊茴徊回茴茴徊徊茴徊茴徊佪佪佪茴佪徊佪茴徊回茴佪茴佪回徊茴茴徊回茴徊回茴佪茴.fd_Setting_62.get()) {
         case fd_mode_881:
            ChatUtils.sendMsg(佪佪回回茴佪回回回佪回茴茴徊回茴回回回徊茴茴回佪佪佪徊徊回回佪佪佪徊徊徊徊徊回佪茴佪徊茴茴徊回徊徊佪回徊徊回徊徊茴佪回佪徊徊回佪徊茴回徊徊徊茴回回回回徊茴茴徊茴徊回茴茴徊徊茴徊茴徊佪佪佪茴佪徊佪茴徊回茴佪茴佪回徊茴茴徊回茴徊回茴佪茴.getChatId(墫壿壿壿墫壿墫墫墫壿壿壿壿壿壿墫壿墫墫壿壿壿墫墫壿墫壿壿壿壿墫墫壿壿墫壿墫墫壿壿壿壿壿壿壿壿壿壿墫壿墫壿壿壿壿墫墫墫墫壿墫壿墫墫壿墫墫墫壿墫壿墫壿壿壿壿壿墫墫墫墫壿墫壿壿墫墫墫壿墫壿壿壿壿墫墫壿墫墫墫墫墫墫墫墫墫墫墫壿壿壿壿墫墫墫墫墫壿壿壿壿壿壿墫壿墫), Formatting.GRAY, "(highlight)%s (default)popped (highlight)%d (default)%s.", new Object[]{墫壿壿壿墫壿墫墫墫壿壿壿壿壿壿墫壿墫墫壿壿壿墫墫壿墫壿壿壿壿墫墫壿壿墫壿墫墫壿壿壿壿壿壿壿壿壿壿墫壿墫壿壿壿壿墫墫墫墫壿墫壿墫墫壿墫墫墫壿墫壿墫壿壿壿壿壿墫墫墫墫壿墫壿壿墫墫墫壿墫壿壿壿壿墫墫壿墫墫墫墫墫墫墫墫墫墫墫壿壿壿壿墫墫墫墫墫壿壿壿壿壿壿墫壿墫.getEntityName(), ㇸへ乀ㇸへへㇸへへㇸへㇸ乀へへㇸへ乀へㇸへへㇸへ乀ㇸ乀ㇸㇸへ乀ㇸㇸ乀乀ㇸ乀へㇸㇸㇸㇸへㇸㇸ乀へㇸへへへ乀乀乀乀ㇸㇸㇸㇸㇸ乀へㇸへ乀乀ㇸ乀へへへㇸ乀乀乀ㇸㇸ乀へ乀ㇸへ乀乀乀乀へへ乀へへ乀ㇸㇸへ乀ㇸへㇸへ乀へへへㇸへ乀へ乀乀へへㇸ乀へへ乀乀ㇸㇸㇸ乀ㇸ, ㇸへ乀ㇸへへㇸへへㇸへㇸ乀へへㇸへ乀へㇸへへㇸへ乀ㇸ乀ㇸㇸへ乀ㇸㇸ乀乀ㇸ乀へㇸㇸㇸㇸへㇸㇸ乀へㇸへへへ乀乀乀乀ㇸㇸㇸㇸㇸ乀へㇸへ乀乀ㇸ乀へへへㇸ乀乀乀ㇸㇸ乀へ乀ㇸへ乀乀乀乀へへ乀へへ乀ㇸㇸへ乀ㇸへㇸへ乀へへへㇸへ乀へ乀乀へへㇸ乀へへ乀乀ㇸㇸㇸ乀ㇸ == 1 ? "totem" : "totems"});
            break;
         case fd_mode_883:
            佪佪回回茴佪回回回佪回茴茴徊回茴回回回徊茴茴回佪佪佪徊徊回回佪佪佪徊徊徊徊徊回佪茴佪徊茴茴徊回徊徊佪回徊徊回徊徊茴佪回佪徊徊回佪徊茴回徊徊徊茴回回回回徊茴茴徊茴徊回茴茴徊徊茴徊茴徊佪佪佪茴佪徊佪茴徊回茴佪茴佪回徊茴茴徊回茴徊回茴佪茴.popAlertHUD(墫壿壿壿墫壿墫墫墫壿壿壿壿壿壿墫壿墫墫壿壿壿墫墫壿墫壿壿壿壿墫墫壿壿墫壿墫墫壿壿壿壿壿壿壿壿壿壿墫壿墫壿壿壿壿墫墫墫墫壿墫壿墫墫壿墫墫墫壿墫壿墫壿壿壿壿壿墫墫墫墫壿墫壿壿墫墫墫壿墫壿壿壿壿墫墫壿墫墫墫墫墫墫墫墫墫墫墫壿壿壿壿墫墫墫墫墫壿壿壿壿壿壿墫壿墫, ㇸへ乀ㇸへへㇸへへㇸへㇸ乀へへㇸへ乀へㇸへへㇸへ乀ㇸ乀ㇸㇸへ乀ㇸㇸ乀乀ㇸ乀へㇸㇸㇸㇸへㇸㇸ乀へㇸへへへ乀乀乀乀ㇸㇸㇸㇸㇸ乀へㇸへ乀乀ㇸ乀へへへㇸ乀乀乀ㇸㇸ乀へ乀ㇸへ乀乀乀乀へへ乀へへ乀ㇸㇸへ乀ㇸへㇸへ乀へへへㇸへ乀へ乀乀へへㇸ乀へへ乀乀ㇸㇸㇸ乀ㇸ, true);
            break;
         case fd_mode_880:
            佪佪回回茴佪回回回佪回茴茴徊回茴回回回徊茴茴回佪佪佪徊徊回回佪佪佪徊徊徊徊徊回佪茴佪徊茴茴徊回徊徊佪回徊徊回徊徊茴佪回佪徊徊回佪徊茴回徊徊徊茴回回回回徊茴茴徊茴徊回茴茴徊徊茴徊茴徊佪佪佪茴佪徊佪茴徊回茴佪茴佪回徊茴茴徊回茴徊回茴佪茴.popAlertToast(墫壿壿壿墫壿墫墫墫壿壿壿壿壿壿墫壿墫墫壿壿壿墫墫壿墫壿壿壿壿墫墫壿壿墫壿墫墫壿壿壿壿壿壿壿壿壿壿墫壿墫壿壿壿壿墫墫墫墫壿墫壿墫墫壿墫墫墫壿墫壿墫壿壿壿壿壿墫墫墫墫壿墫壿壿墫墫墫壿墫壿壿壿壿墫墫壿墫墫墫墫墫墫墫墫墫墫墫壿壿壿壿墫墫墫墫墫壿壿壿壿壿壿墫壿墫, ㇸへ乀ㇸへへㇸへへㇸへㇸ乀へへㇸへ乀へㇸへへㇸへ乀ㇸ乀ㇸㇸへ乀ㇸㇸ乀乀ㇸ乀へㇸㇸㇸㇸへㇸㇸ乀へㇸへへへ乀乀乀乀ㇸㇸㇸㇸㇸ乀へㇸへ乀乀ㇸ乀へへへㇸ乀乀乀ㇸㇸ乀へ乀ㇸへ乀乀乀乀へへ乀へへ乀ㇸㇸへ乀ㇸへㇸへ乀へへへㇸへ乀へ乀乀へへㇸ乀へへ乀乀ㇸㇸㇸ乀ㇸ, true);
         }

         佪佪回回茴佪回回回佪回茴茴徊回茴回回回徊茴茴回佪佪佪徊徊回回佪佪佪徊徊徊徊徊回佪茴佪徊茴茴徊回徊徊佪回徊徊回徊徊茴佪回佪徊徊回佪徊茴回徊徊徊茴回回回回徊茴茴徊茴徊回茴茴徊徊茴徊茴徊佪佪佪茴佪徊佪茴徊回茴佪茴佪回徊茴茴徊回茴徊回茴佪茴.liiijLLLJiijljIIljIJLJllIiJLIJIlLjiLIjljjJlILJlJiLiJJjLlLiIJJjLjJIiJLIJJjIjJIJliLIIJJJLiiJIlJIII.removeInt(墫壿壿壿墫壿墫墫墫壿壿壿壿壿壿墫壿墫墫壿壿壿墫墫壿墫壿壿壿壿墫墫壿壿墫壿墫墫壿壿壿壿壿壿壿壿壿壿墫壿墫壿壿壿壿墫墫墫墫壿墫壿墫墫壿墫墫墫壿墫壿墫壿壿壿壿壿墫墫墫墫壿墫壿壿墫墫墫壿墫壿壿壿壿墫墫壿墫墫墫墫墫墫墫墫墫墫墫壿壿壿壿墫墫墫墫墫壿壿壿壿壿壿墫壿墫.getUuid());
      }
   }
}
