/* Decompiler 200ms, total 915ms, lines 841 */
package me.ghosttypes.ion.modules.misc.elytrabot;

import baritone.api.BaritoneAPI;
import baritone.api.command.manager.ICommandManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.BooleanSupplier;
import me.ghosttypes.ion.modules.misc.elytrabot.utils.AStar;
import me.ghosttypes.ion.modules.misc.elytrabot.utils.DirectionUtil;
import me.ghosttypes.ion.modules.misc.elytrabot.utils.ElytraFly;
import me.ghosttypes.ion.modules.misc.elytrabot.utils.MiscUtil;
import me.ghosttypes.ion.modules.misc.elytrabot.utils.PacketFly;
import me.ghosttypes.ion.modules.misc.elytrabot.utils.TimerUtil;
import me.ghosttypes.ion.utils.Class68;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.events.entity.player.PlayerMoveEvent;
import meteordevelopment.meteorclient.events.game.GameLeftEvent;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent.Pre;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.EnumSetting.Builder;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.systems.modules.movement.NoFall;
import meteordevelopment.meteorclient.systems.modules.player.AutoEat;
import meteordevelopment.meteorclient.systems.modules.player.ChestSwap;
import meteordevelopment.meteorclient.utils.Utils;
import meteordevelopment.meteorclient.utils.player.FindItemResult;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.player.Rotations;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.util.Identifier;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundCategory;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.class_2849;

public class ElytraBotThreaded extends Module {
   private int fd_int_752;
   private final TimerUtil fd_TimerUtil_753;
   private int fd_int_754;
   private final Setting<ElytraBotThreaded.FlyMode> fd_Setting_755;
   public final Setting<Boolean> fd_Setting_756;
   private BlockPos fd_BlockPos_757;
   private final Setting<Boolean> fd_Setting_758;
   public String fd_String_759;
   private final Setting<Boolean> fd_Setting_760;
   private final Setting<ElytraBotThreaded.TakeoffMode> fd_Setting_761;
   public final SettingGroup fd_SettingGroup_762;
   public final Setting<Boolean> fd_Setting_763;
   private boolean fd_boolean_764;
   private int fd_int_765;
   private final Setting<Integer> fd_Setting_766;
   private boolean sSsSSsSssssssS;
   private DirectionUtil fd_DirectionUtil_767;
   private final SettingGroup fd_SettingGroup_768;
   public final Setting<ElytraBotThreaded.Mode> fd_Setting_769;
   private double fd_double_770;
   private final TimerUtil fd_TimerUtil_771;
   private boolean fd_boolean_772;
   private final Setting<Integer> qPQQQpQqQpQQpPppPqPPqPQPpqQqqppQqQpqQppQQqQppPqqQQppQpqPqqppqqqQQpqQQPPpPQQQPpQQQpQQQQQpPQpPqppqPPPQQqQPqPqpQQqqqPPPqqPqPp;
   public String fd_String_773;
   private final SettingGroup fd_SettingGroup_774;
   private int fd_int_775;
   private final ElytraBotThreaded.StaticGroundListener fd_StaticGroundListener_776;
   private final Setting<Integer> fd_Setting_777;
   private int fd_int_778;
   public String fd_String_779;
   public final Setting<Double> fd_Setting_780;
   private boolean fd_boolean_781;
   public final Setting<Integer> fd_Setting_782;
   private final Setting<Boolean> fd_Setting_783;
   private final Setting<Double> fd_Setting_784;
   private BlockPos fd_BlockPos_785;
   private ArrayList<BlockPos> fd_ArrayList_786;
   public String fd_String_787;
   private final SettingGroup SssssSsSSsSSsSsSsSsSsssSsssSsSSsssSSssSsSSssssSsSSSSSSsSSSSSSSSs;
   public BlockPos fd_BlockPos_788;
   private int fd_int_789;
   private Thread fd_Thread_790;
   private final TimerUtil fd_TimerUtil_791;
   private final Setting<Integer> fd_Setting_792;
   public final Setting<Integer> fd_Setting_793;
   public final Setting<Double> fd_Setting_794;
   private final Setting<SettingColor> fd_Setting_795;
   private double fd_double_796;
   private final Setting<Boolean> fd_Setting_797;
   public final Setting<Boolean> pQPppqppPQpqpppqPQQQppppQQQQPpPPQqPQPqQqPQQqppQQPqPpQQPPPPppQqPQQqpPQ;
   private final Setting<Boolean> fd_Setting_798;
   private final Setting<Boolean> fd_Setting_799;
   private BlockPos fd_BlockPos_800;
   private final Setting<Boolean> fd_Setting_801;
   private final SettingGroup fd_SettingGroup_802;
   public final Setting<Boolean> SssSsSSssSSsssSsSsssssSsSSsSSsSsSSssssSsSsSsSssssSss;
   private final TimerUtil fd_TimerUtil_803;
   private int fd_int_804;
   private final Setting<Integer> fd_Setting_805;

   public static void sleepUntil(BooleanSupplier 一三二二二三二一亖三亖二三三三亖亖亖二二亖, int 壿墫墫壿墫墫墫墫壿墫壿壿壿壿壿墫墫墫壿墫墫墫墫壿墫) {
      long 沝沝沝㵘沝沝水㵘淼沝淼㵘水水淼水㵘淼㵘㵘淼沝沝水㵘㵘淼淼㵘淼水沝沝㵘沝沝沝沝沝水沝淼沝淼水水沝㵘沝㵘沝㵘水水沝水沝 = System.currentTimeMillis();

      while(!いぃいぃりリぃりいいりりりいりりリリリぃりいいリいぃいリりぃいいぃりリぃぃリりいりいいりぃりリぃいリりリぃリりりぃぃいいリいりリりいいいリぃいリりぃぃぃぃぃリりいぃリりぃリリぃいぃりリリい.getAsBoolean() && (烓桂烓㙓桂茥澆桂桂土茥土圭土垚桂澆土垚澆烓圭洼土澆烓㙓㙓㙓桂洼茥澆澆烓茥土茥桂桂桂垚土桂烓茥桂圭澆澆圭澆澆桂㙓土茥烓圭桂茥茥澆垚垚洼洼土 == -1 || System.currentTimeMillis() - 沝沝沝㵘沝沝水㵘淼沝淼㵘水水淼水㵘淼㵘㵘淼沝沝水㵘㵘淼淼㵘淼水沝沝㵘沝沝沝沝沝水沝淼沝淼水水沝㵘沝㵘沝㵘水水沝水沝 < (long)烓桂烓㙓桂茥澆桂桂土茥土圭土垚桂澆土垚澆烓圭洼土澆烓㙓㙓㙓桂洼茥澆澆烓茥土茥桂桂桂垚土桂烓茥桂圭澆澆圭澆澆桂㙓土茥烓圭桂茥茥澆垚垚洼洼土)) {
         sleep(10);
      }

   }

   private void onModeChange(ElytraBotThreaded.FlyMode ラララううラうううララうララうララララララうううラうララうラううううララララうううううララうラララララララううララううラううラううラううララうううラララううラううううラララううラララうララううラううラううララうううラうララうううララううララう) {
      ㄙㄙㄙムムムムムㄙムㄙムㄙㄙㄙㄙㄙムㄙㄙムムㄙ.fd_String_787 = null;
      ㄙㄙㄙムムムムムㄙムㄙムㄙㄙㄙㄙㄙムㄙㄙムムㄙ.fd_String_779 = null;
   }

   private void walkTo(BlockPos 鹅鵞鹅鵞鵞鹅鵞鵞鹅鵞鹅鹅鵞鵞鵞鵞鹅鹅鵞鹅鹅鵞鵞鵞鵞鵞鵞鵞鹅鵞鹅鹅鹅鹅鵞鵞鵞鵞鵞鹅鹅鵞, boolean 幐㬺幐㬺㬺幐㬺幐幐幐幐㬺㬺幐幐㬺㬺㬺㬺幐㬺㬺㬺幐㬺幐幐幐幐㬺幐㬺幐幐㬺幐) {
      ICommandManager var10000 = BaritoneAPI.getProvider().getPrimaryBaritone().getCommandManager();
      int var10001 = メノノメノメノメメノノメ.getX();
      var10000.execute("goto " + var10001 + " " + メノノメノメノメメノノメ.getY() + " " + メノノメノメノメメノノメ.getZ());
      if (SSssSsSSsSSSsSsSsSssSssSSsSSSSsSsssSSSssSSsssSSsSssSssSSSssSSSsssSSssSSssSsssssSsss) {
         sleepUntil(() -> {
            return BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().isPathing();
         }, 100);
         sleepUntil(() -> {
            return !BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().isPathing();
         }, -1);
      }

   }

   public void loop() {
      if (Utils.canUpdate()) {
         if (MiscUtil.distanceTo(壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_BlockPos_788) < 10.0D) {
            壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.mc.world.playSound(壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.mc.player.getX(), 壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.mc.player.getY(), 壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.mc.player.getZ(), new SoundEvent(new Identifier("minecraft:entity.player.levelup")), SoundCategory.PLAYERS, 100.0F, 18.0F, true);
            壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.info("Goal reached!", new Object[0]);
            壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.sSsSSsSssssssS = false;
         }

         if (壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.mc.player.getEquippedStack(EquipmentSlot.CHEST).getItem() != Items.ELYTRA) {
            壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.error("You need an elytra.", new Object[0]);
            壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.sSsSSsSssssssS = false;
         }

         NoFall ムムムㄙムムㄙㄙムムムㄙㄙㄙㄙㄙムㄙムㄙㄙㄙㄙㄙムムㄙㄙㄙㄙムㄙㄙムムムムㄙㄙムㄙㄙㄙㄙムムムムムムㄙムム = (NoFall)Modules.get().get(NoFall.class);
         if (ムムムㄙムムㄙㄙムムムㄙㄙㄙㄙㄙムㄙムㄙㄙㄙㄙㄙムムㄙㄙㄙㄙムㄙㄙムムムムㄙㄙムㄙㄙㄙㄙムムムムムムㄙムム.isActive()) {
            壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.error("You cannot use NoFall while ElytraBot is active!", new Object[0]);
            if (!壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_boolean_772) {
               壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_boolean_772 = true;
            }

            ムムムㄙムムㄙㄙムムムㄙㄙㄙㄙㄙムㄙムㄙㄙㄙㄙㄙムムㄙㄙㄙㄙムㄙㄙムムムムㄙㄙムㄙㄙㄙㄙムムムムムムㄙムム.toggle();
         }

         if (壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_Setting_755.get() == ElytraBotThreaded.FlyMode.fd_FlyMode_809 && InvUtils.find(new Item[]{Items.FIREWORK_ROCKET}).count() == 0) {
            壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.error("You need fireworks in your inventory if you are using firework mode.", new Object[0]);
            壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.sSsSSsSssssssS = false;
         }

         if (!MiscUtil.isInRenderDistance(壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.getPlayerPos())) {
            壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_String_759 = "Waiting for chunk";
            壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.mc.player.setVelocity(0.0D, 0.0D, 0.0D);
         } else {
            if ((Boolean)壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_Setting_799.get()) {
               ItemStack 森森森木木木林林林木林林森森林森木林木森木森林林森林森林林林木木木木森森森森木木森森林木森木木林木森森林木林森森木木木森林林木木林林林森木森林木木林林林森森林森森森森木林木森木木森木木木林木 = 壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.mc.player.getInventory().getArmorStack(2);
               if (森森森木木木林林林木林林森森林森木林木森木森林林森林森林林林木木木木森森森森木木森森林木森木木林木森森林木林森森木木木森林林木木林林林森木森林木木林林林森森林森森森森木林木森木木森木木木林木.getItem() == Items.ELYTRA && 森森森木木木林林林木林林森森林森木林木森木森林林森林森林林林木木木木森森森森木木森森林木森木木林木森森林木林森森木木木森林林木木林林林森木森林木木林林林森森林森森森森木林木森木木森木木木林木.getMaxDamage() - 森森森木木木林林林木林林森森林森木林木森木森林林森林森林林林木木木木森森森森木木森森林木森木木林木森森林木林森森木木木森林林木木林林林森木森林木木林林林森森林森森森森木林木森木木森木木木林木.getDamage() <= (Integer)壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_Setting_793.get()) {
                  壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.debug("Trying to switch elytra");
                  FindItemResult 一三亖三一三三二二一 = InvUtils.find((沝㵘沝沝水沝淼水淼淼沝㵘㵘㵘㵘沝㵘水㵘㵘淼水㵘淼沝沝沝水㵘淼水水水沝㵘淼淼沝淼淼沝沝沝淼淼㵘㵘淼淼水淼淼水㵘淼水㵘淼水㵘淼水沝淼沝沝㵘水水㵘水淼淼水淼水水淼水水沝水㵘水沝淼沝水淼沝㵘㵘水沝沝沝淼水沝沝沝水) -> {
                     return 沝㵘沝沝水沝淼水淼淼沝㵘㵘㵘㵘沝㵘水㵘㵘淼水㵘淼沝沝沝水㵘淼水水水沝㵘淼淼沝淼淼沝沝沝淼淼㵘㵘淼淼水淼淼水㵘淼水㵘淼水㵘淼水沝淼沝沝㵘水水㵘水淼淼水淼水水淼水水沝水㵘水沝淼沝水淼沝㵘㵘水沝沝沝淼水沝沝沝水.getMaxDamage() - 沝㵘沝沝水沝淼水淼淼沝㵘㵘㵘㵘沝㵘水㵘㵘淼水㵘淼沝沝沝水㵘淼水水水沝㵘淼淼沝淼淼沝沝沝淼淼㵘㵘淼淼水淼淼水㵘淼水㵘淼水㵘淼水沝淼沝沝㵘水水㵘水淼淼水淼水水淼水水沝水㵘水沝淼沝水淼沝㵘㵘水沝沝沝淼水沝沝沝水.getDamage() > (Integer)LjjiLJjiJjlLjJjJJljllllLlijljjIijjLIiJIjiLjjljJiILilJLjlJjjijj.fd_Setting_793.get() && 沝㵘沝沝水沝淼水淼淼沝㵘㵘㵘㵘沝㵘水㵘㵘淼水㵘淼沝沝沝水㵘淼水水水沝㵘淼淼沝淼淼沝沝沝淼淼㵘㵘淼淼水淼淼水㵘淼水㵘淼水㵘淼水沝淼沝沝㵘水水㵘水淼淼水淼水水淼水水沝水㵘水沝淼沝水淼沝㵘㵘水沝沝沝淼水沝沝沝水.getItem() == Items.ELYTRA;
                  });
                  InvUtils.move().from(一三亖三一三三二二一.slot()).toArmor(2);
                  壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.debug("Swapped elytra");
               }
            }

            double liILijJlIjLIIjLLiIlILIJllLjJliIlJiijIljijliLiliIlIllljiLlljlLjLJjJJiJJJ = 壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_double_796 + 0.6D;
            if ((壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.mc.player.isFallFlying() || 壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.mc.player.getY() < liILijJlIjLIIjLLiIlILIJllLjJliIlJiijIljijliLiliIlIllljiLlljlLjLJjJJiJJJ || 壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.mc.player.isOnGround()) && PacketFly.fd_boolean_834) {
               壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.debug("//takeoff 1");
               sleep(1500);
               if (壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.mc.player.isFallFlying() || 壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.mc.player.getY() < liILijJlIjLIIjLLiIlILIJllLjJliIlJiijIljijliLiliIlIllljiLlljlLjLJjJJiJJJ || 壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.mc.player.isOnGround()) {
                  sleep(100);
                  壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.debug("//takeoff 2");
               }
            }

            if (!壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.mc.player.isFallFlying()) {
               ElytraFly.toggle(false);
               BlockPos 晩晩晚晩晚晩晩晚晩晩晩晚晚晚晩晚晚晚晚晩晩晩晚晚晩晚晚晚晩晚晚晚晚晚晚晚晚晩晚晚晩晚晩晩晚晚晚晚晩晚晩晚晩晩晩晩晚晚晚晚晚晩晚晚晩晚晚 = 壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.getPlayerPos().add(0, 2, 0);
               if (壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.mc.player.isOnGround() && MiscUtil.isSolid(晩晩晚晩晚晩晩晚晩晩晩晚晚晚晩晚晚晚晚晩晩晩晚晚晩晚晚晚晩晚晚晚晚晚晚晚晚晩晚晚晩晚晩晩晚晚晚晚晩晚晩晚晩晩晩晩晚晚晚晚晚晩晚晚晩晚晚) && (Boolean)壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_Setting_760.get() && 壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_Setting_769.get() == ElytraBotThreaded.Mode.fd_Mode_812) {
                  壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_String_759 = "Using baritone";
                  壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.useBaritone();
               }

               if (MiscUtil.isSolid(晩晩晚晩晚晩晩晚晩晩晩晚晚晚晩晚晚晚晚晩晩晩晚晚晩晚晚晚晩晚晚晚晚晚晚晚晚晩晚晚晩晚晩晩晚晚晚晚晩晚晩晚晩晩晩晩晚晚晚晚晚晩晚晚晩晚晚) && 壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_Setting_769.get() == ElytraBotThreaded.Mode.fd_Mode_811) {
                  if (MiscUtil.getBlock(晩晩晚晩晚晩晩晚晩晩晩晚晚晚晩晚晚晚晚晩晩晩晚晚晩晚晚晚晩晚晚晚晚晚晚晚晚晩晚晚晩晚晩晩晚晚晚晚晩晚晩晚晩晩晩晩晚晚晚晚晚晩晚晚晩晚晚) != Blocks.BEDROCK) {
                     壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_String_759 = "Mining obstruction";
                     PlayerUtils.centerPlayer();
                     Rotations.rotate(Rotations.getYaw(晩晩晚晩晚晩晩晚晩晩晩晚晚晚晩晚晚晚晚晩晩晩晚晚晩晚晚晚晩晚晚晚晚晚晚晚晚晩晚晚晩晚晩晩晚晚晚晚晩晚晩晚晩晩晩晩晚晚晚晚晚晩晚晚晩晚晚), Rotations.getPitch(晩晩晚晩晚晩晩晚晩晩晩晚晚晚晩晚晚晚晚晩晩晩晚晚晩晚晚晚晩晚晚晚晚晚晚晚晚晩晚晚晩晚晩晩晚晚晚晚晩晚晩晚晩晩晩晩晚晚晚晚晚晩晚晚晩晚晚), () -> {
                        MiscUtil.mine(晩晩晚晩晚晩晩晚晩晩晩晚晚晚晩晚晚晚晚晩晩晩晚晚晩晚晚晚晩晚晚晚晚晚晚晚晚晩晚晚晩晚晩晩晚晚晚晚晩晚晩晚晩晩晩晩晚晚晚晚晚晩晚晚晩晚晚);
                     });
                  } else if ((Boolean)壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_Setting_760.get()) {
                     壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_String_759 = "Using baritone";
                     壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.useBaritone();
                  } else {
                     壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.info("The above block is bedrock and useBaritone is false.", new Object[0]);
                     壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.sSsSSsSssssssS = false;
                  }
               }

               if (壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_double_796 != 1.0D && Math.abs(壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.mc.player.getY() - 壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_double_796) >= 2.0D && (Boolean)壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_Setting_760.get() && 壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_DirectionUtil_767 != null && 壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_Setting_769.get() == ElytraBotThreaded.Mode.fd_Mode_812) {
                  壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.info("Using baritone to get back to the highway.", new Object[0]);
                  壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_String_759 = "Using baritone";
                  壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.useBaritone();
               }

               if (壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_int_752 < 20) {
                  壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.debug("Trying to takeoff.");
                  壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_String_759 = "Taking off";
               }

               壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_TimerUtil_791.SsssSssSsSssssSSSss = 0L;
               if (壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.mc.player.isOnGround()) {
                  壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_double_796 = 壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.mc.player.getY();
                  壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.generatePath();
                  壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.mc.player.jump();
                  壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.debug("Path generated, taking off.");
                  壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.debug("Path: " + 壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_ArrayList_786);
               } else if (壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.mc.player.getY() < 壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.mc.player.prevY) {
                  if (壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_Setting_761.get() == ElytraBotThreaded.TakeoffMode.fd_TakeoffMode_815) {
                     if (壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.mc.player.getY() > liILijJlIjLIIjLLiIlILIJllLjJliIlJiijIljijliLiliIlIllljiLlljlLjLJjJJiJJJ && !PacketFly.fd_boolean_834) {
                        PacketFly.toggle(true);
                     }

                     壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.debug("Toggling on packet fly.");
                  } else if (壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_Setting_761.get() == ElytraBotThreaded.TakeoffMode.fd_TakeoffMode_817) {
                     壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.mc.player.setVelocity(0.0D, -0.04D, 0.0D);
                     壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.debug("Slow gliding.");
                  }

                  if (壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_int_752 <= 15) {
                     if (壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_TimerUtil_771.hasPassed(650)) {
                        壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.mc.getNetworkHandler().sendPacket(new ClientCommandC2SPacket(壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.mc.player, class_2849.START_FALL_FLYING));
                        壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.debug("Sending elytra open packet.");
                        壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_TimerUtil_771.reset();
                        壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_TimerUtil_753.reset();
                        ++壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_int_752;
                     }
                  } else if (壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_TimerUtil_753.hasPassed(15000)) {
                     壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_int_752 = 0;
                     壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.debug("15 seconds over.");
                  } else {
                     壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.info("Waiting 15 seconds before sending elytra opening packets again", new Object[0]);
                     壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_String_759 = "Waiting to takeoff";
                  }
               }

            } else {
               if (!PacketFly.fd_boolean_834) {
                  壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_int_752 = 0;
                  double 㬺㬺㬺㬺㬺㬺㬺幐㬺幐幐幐幐幐幐㬺幐幐幐幐幐幐㬺幐㬺幐㬺幐㬺幐㬺㬺幐㬺幐㬺幐幐 = MiscUtil.getSpeed();
                  if (㬺㬺㬺㬺㬺㬺㬺幐㬺幐幐幐幐幐幐㬺幐幐幐幐幐幐㬺幐㬺幐㬺幐㬺幐㬺㬺幐㬺幐㬺幐幐 < 0.1D) {
                     ++壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_int_778;
                     if (壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_int_778 >= 15) {
                        壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_int_778 = 0;
                        if ((Boolean)壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_Setting_760.get()) {
                           壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.info("Using baritone to walk a bit because we are stuck.", new Object[0]);
                           壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_String_759 = "Using baritone";
                           壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.useBaritone();
                        } else {
                           壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.info("We are stuck. Enabling the 'useBaritone' setting would help.", new Object[0]);
                           壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.sSsSSsSssssssS = false;
                        }
                     }
                  } else {
                     壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_int_778 = 0;
                  }

                  if (壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_Setting_755.get() == ElytraBotThreaded.FlyMode.fd_FlyMode_809) {
                     if (㬺㬺㬺㬺㬺㬺㬺幐㬺幐幐幐幐幐幐㬺幐幐幐幐幐幐㬺幐㬺幐㬺幐㬺幐㬺㬺幐㬺幐㬺幐幐 > 3.0D) {
                        壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_boolean_781 = true;
                     }

                     if (壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_boolean_781) {
                        if (㬺㬺㬺㬺㬺㬺㬺幐㬺幐幐幐幐幐幐㬺幐幐幐幐幐幐㬺幐㬺幐㬺幐㬺幐㬺㬺幐㬺幐㬺幐幐 < 1.0D) {
                           ++壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_int_754;
                           壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.debug("Potential lagback detected.");
                           if (壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_int_754 > 3) {
                              壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_boolean_781 = false;
                              壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_int_754 = 0;
                              壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.debug("Lagback reset.");
                           }
                        } else {
                           壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_int_754 = 0;
                        }
                     }

                     if (壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_TimerUtil_791.hasPassed((int)((Double)壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_Setting_784.get() * 1000.0D)) && !壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_boolean_781) {
                        壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.clickOnFirework();
                     }
                  }
               }

               float ゆゅゆゆゅゆゅゆゆゅゆゅゅゅゆゅゆゆゆゅゅゅゆゅゆゆゆゆゅゆゅゆゆゅゅゆゆゅゅゅゆゅゆゆゆゅゆゆゆゅゆゅゆゆゅゆゆゆゆゅゆゆゅゅゅゅゆゆゆゅゆゅゆゆゅゆゆゆゅゅゆゆゅゅゆゆゆゅゆゅゆゆゆゆゅゅゅゅ = 壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.mc.player.getHealth() + 壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.mc.player.getAbsorptionAmount();
               float ゅゆゆゅゆゅゅゆゅゅゅゆゆゅゅゆゅゆゆゅゆゆゅゆゅゅゅゆゅゆゆゅゅゅゅゆゆゆゅゆゆゆゅゅゆゅゅゆゆゅゅゆゅゅゅゆゅゅゆゅゆゅゅゅ = (float)壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.mc.player.getHungerManager().getFoodLevel();
               int 㵘㵘淼沝㵘㵘淼水水沝淼水沝淼沝沝㵘水水水沝水沝水㵘㵘水沝沝水㵘淼水淼㵘㵘沝水淼淼㵘淼㵘㵘沝水淼沝水水水水沝㵘㵘沝㵘沝水㵘㵘沝沝沝淼水沝沝㵘沝沝沝淼淼水水水㵘淼沝㵘㵘沝淼淼㵘沝水沝淼沝水淼沝淼沝水沝㵘沝淼水沝㵘㵘水㵘淼㵘水淼淼水水水水淼㵘㵘 = 壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.mc.player.getInventory().selectedSlot;
               if ((Boolean)壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_Setting_758.get() && !壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.mc.player.isUsingItem() && !((AutoEat)Modules.get().get(AutoEat.class)).isActive()) {
                  if ((壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_Setting_755.get() != ElytraBotThreaded.FlyMode.fd_FlyMode_809 || 壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_Setting_755.get() == ElytraBotThreaded.FlyMode.fd_FlyMode_809 && !壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_TimerUtil_791.hasPassed(100)) && (ゆゅゆゆゅゆゅゆゆゅゆゅゅゅゆゅゆゆゆゅゅゅゆゅゆゆゆゆゅゆゅゆゆゅゅゆゆゅゅゅゆゅゆゆゆゅゆゆゆゅゆゅゆゆゅゆゆゆゆゅゆゆゅゅゅゅゆゆゆゅゆゅゆゆゅゆゆゆゅゅゆゆゅゅゆゆゆゅゆゅゆゆゆゆゅゅゅゅ <= (float)(Integer)壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.qPQQQpQqQpQQpPppPqPPqPQPpqQqqppQqQpqQppQQqQppPqqQQppQpqPqqppqqqQQpqQQPPpPQQQPpQQQpQQQQQpPQpPqppqPPPQQqQPqPqpQQqqqPPPqqPqPp.get() || ゅゆゆゅゆゅゅゆゅゅゅゆゆゅゅゆゅゆゆゅゆゆゅゆゅゅゅゆゅゆゆゅゅゅゅゆゆゆゅゆゆゆゅゅゆゅゅゆゆゅゅゆゅゅゅゆゅゅゆゅゆゅゅゅ <= (float)(Integer)壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_Setting_805.get())) {
                     壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.debug("Need to eat.");

                     for(int ㄑくくㄑㄑㄑㄑくくㄑㄑくくくくㄑくㄑくくくㄑㄑくㄑくくㄑㄑㄑㄑㄑㄑㄑくくくㄑくくくくくくㄑㄑㄑくㄑㄑ = 0; ㄑくくㄑㄑㄑㄑくくㄑㄑくくくくㄑくㄑくくくㄑㄑくㄑくくㄑㄑㄑㄑㄑㄑㄑくくくㄑくくくくくくㄑㄑㄑくㄑㄑ < 9; ++ㄑくくㄑㄑㄑㄑくくㄑㄑくくくくㄑくㄑくくくㄑㄑくㄑくくㄑㄑㄑㄑㄑㄑㄑくくくㄑくくくくくくㄑㄑㄑくㄑㄑ) {
                        Item 欻焱欻燚火炏炎炎欻焱欻火炏燚炏火炏燚炎焱炏炏炏欻欻燚焱焱火火燚火燚欻火欻炏欻炎火炏焱燚炏燚火焱燚焱欻炏炏火焱欻炏火燚欻炏火炎燚燚欻欻焱炎欻燚火燚火燚欻燚欻欻火火炎欻炎火炎炎火燚炎 = 壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.mc.player.getInventory().getStack(ㄑくくㄑㄑㄑㄑくくㄑㄑくくくくㄑくㄑくくくㄑㄑくㄑくくㄑㄑㄑㄑㄑㄑㄑくくくㄑくくくくくくㄑㄑㄑくㄑㄑ).getItem();
                        壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.debug("Finding food item.");
                        if (欻焱欻燚火炏炎炎欻焱欻火炏燚炏火炏燚炎焱炏炏炏欻欻燚焱焱火火燚火燚欻火欻炏欻炎火炏焱燚炏燚火焱燚焱欻炏炏火焱欻炏火燚欻炏火炎燚燚欻欻焱炎欻燚火燚火燚欻燚欻欻火火炎欻炎火炎炎火燚炎.isFood() && MiscUtil.shouldEatItem(欻焱欻燚火炏炎炎欻焱欻火炏燚炏火炏燚炎焱炏炏炏欻欻燚焱焱火火燚火燚欻火欻炏欻炎火炏焱燚炏燚火焱燚焱欻炏炏火焱欻炏火燚欻炏火炎燚燚欻欻焱炎欻燚火燚火燚欻燚欻欻火火炎欻炎火炎炎火燚炎)) {
                           MiscUtil.eat(ㄑくくㄑㄑㄑㄑくくㄑㄑくくくくㄑくㄑくくくㄑㄑくㄑくくㄑㄑㄑㄑㄑㄑㄑくくくㄑくくくくくくㄑㄑㄑくㄑㄑ);
                           壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.debug("Trying to eat item.");
                        }
                     }
                  }
               } else if (壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.mc.player.isUsingItem() && ゆゅゆゆゅゆゅゆゆゅゆゅゅゅゆゅゆゆゆゅゅゅゆゅゆゆゆゆゅゆゅゆゆゅゅゆゆゅゅゅゆゅゆゆゆゅゆゆゆゅゆゅゆゆゅゆゆゆゆゅゆゆゅゅゅゅゆゆゆゅゆゅゆゆゅゆゆゆゅゅゆゆゅゅゆゆゆゅゆゅゆゆゆゆゅゅゅゅ >= (float)(Integer)壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.qPQQQpQqQpQQpPppPqPPqPQPpqQqqppQqQpqQppQQqQppPqqQQppQpqPqqppqqqQQpqQQPPpPQQQPpQQQpQQQQQpPQpPqppqPPPQQqQPqPqpQQqqqPPPqqPqPp.get() && ゅゆゆゅゆゅゅゆゅゅゅゆゆゅゅゆゅゆゆゅゆゆゅゆゅゅゅゆゅゆゆゅゅゅゅゆゆゆゅゆゆゆゅゅゆゅゅゆゆゅゅゆゅゅゅゆゅゅゆゅゆゅゅゅ >= (float)(Integer)壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_Setting_805.get()) {
                  壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.stopEating(㵘㵘淼沝㵘㵘淼水水沝淼水沝淼沝沝㵘水水水沝水沝水㵘㵘水沝沝水㵘淼水淼㵘㵘沝水淼淼㵘淼㵘㵘沝水淼沝水水水水沝㵘㵘沝㵘沝水㵘㵘沝沝沝淼水沝沝㵘沝沝沝淼淼水水水㵘淼沝㵘㵘沝淼淼㵘沝水沝淼沝水淼沝淼沝水沝㵘沝淼水沝㵘㵘水㵘淼㵘水淼淼水水水水淼㵘㵘);
                  壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.debug("Stopped eating.");
               }

               if (壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_ArrayList_786 == null || 壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_ArrayList_786.size() <= 20 || 壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.isNextPathTooFar()) {
                  壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.generatePath();
               }

               int ああおおおおああおおあおあおあおおあおおああおああおああおおおおあああおあおあああああおおおあおあおおあおおおおおおおあおああおあおあああああおあおあおあおあおおあおおあおあおああおあああおああおおおああおあああああおあああおあお = 12;
               if (壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_Setting_769.get() == ElytraBotThreaded.Mode.fd_Mode_812 || 壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_Setting_755.get() == ElytraBotThreaded.FlyMode.fd_FlyMode_808) {
                  ああおおおおああおおあおあおあおおあおおああおああおああおおおおあああおあおあああああおおおあおあおおあおおおおおおおあおああおあおあああああおあおあおあおあおおあおおあおあおああおあああおああおおおああおあああああおあああおあお = 2;
               }

               boolean 鵞鹅鹅鵞鹅鹅鹅鵞鵞鵞鵞鵞鵞鹅鹅鵞鵞鹅鵞鹅鵞鵞鹅鵞鵞鹅鹅鹅鹅鹅鵞鵞鵞鵞鵞鵞鹅鵞鹅鹅鹅鵞鵞鹅鵞鵞鵞鹅鹅鵞鹅鵞鵞鹅鹅鹅鵞鹅鹅鵞鵞鹅鵞鹅鵞鵞鵞鵞鹅鵞鵞鵞鵞鹅鹅鵞鵞鵞鹅鹅鵞鵞鹅鵞鵞鵞鹅鹅鵞鹅鹅鹅鵞鹅鹅鵞鹅鵞鵞鹅鵞鵞鹅鹅鹅鵞鹅鹅鹅鵞鵞鹅鹅鵞鹅鵞鵞鵞鵞鵞鹅鵞鹅鹅 = false;
               ArrayList<BlockPos> 鹅鹅鹅鵞鹅鵞鹅鵞鵞鵞鹅鹅鵞鹅鵞鵞鵞鹅鵞鵞鵞鵞鹅鵞鵞鹅鹅鹅鵞鵞鹅鵞鹅鹅鹅鹅鵞鵞鹅鹅鵞鹅鹅鵞鹅鵞鹅鵞鵞鵞鵞鹅鹅鵞鹅鹅鵞鵞鹅鵞鹅鵞鹅鵞鹅鵞鹅鹅鵞鹅鵞鵞鵞鹅鵞鹅鹅鵞鹅鵞鵞鹅鹅鵞鹅鹅鵞鹅鵞鵞鹅鵞鹅鹅鵞鹅鹅鵞鹅鵞鵞鵞鹅鹅鹅鹅鹅鵞鹅鹅鵞鵞鵞鹅鵞鵞鹅鹅鵞鵞鹅鵞鹅 = new ArrayList();
               Iterator var10 = 壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_ArrayList_786.iterator();

               BlockPos 鬭鬬鬭鬭鬬鬬鬭鬬鬬鬬鬬鬬鬬鬬鬬鬬鬬鬬鬭鬭鬭鬬鬭鬭鬭鬭鬬鬭鬬鬭鬬鬭鬬鬭鬭鬬鬬鬭鬭鬬鬭鬬鬭鬬鬬鬬鬭鬬鬬鬭鬭鬭鬭鬭鬬鬬鬬鬭鬭鬭鬭鬬鬬鬭鬬鬬鬬鬭鬬鬭鬭鬭鬭鬭鬬鬭鬭鬬鬬鬭鬬鬭鬭鬬鬭鬬鬭鬭鬬鬬鬭鬬鬬鬭鬭;
               while(var10.hasNext()) {
                  鬭鬬鬭鬭鬬鬬鬭鬬鬬鬬鬬鬬鬬鬬鬬鬬鬬鬬鬭鬭鬭鬬鬭鬭鬭鬭鬬鬭鬬鬭鬬鬭鬬鬭鬭鬬鬬鬭鬭鬬鬭鬬鬭鬬鬬鬬鬭鬬鬬鬭鬭鬭鬭鬭鬬鬬鬬鬭鬭鬭鬭鬬鬬鬭鬬鬬鬬鬭鬬鬭鬭鬭鬭鬭鬬鬭鬭鬬鬬鬭鬬鬭鬭鬬鬭鬬鬭鬭鬬鬬鬭鬬鬬鬭鬭 = (BlockPos)var10.next();
                  if (!鵞鹅鹅鵞鹅鹅鹅鵞鵞鵞鵞鵞鵞鹅鹅鵞鵞鹅鵞鹅鵞鵞鹅鵞鵞鹅鹅鹅鹅鹅鵞鵞鵞鵞鵞鵞鹅鵞鹅鹅鹅鵞鵞鹅鵞鵞鵞鹅鹅鵞鹅鵞鵞鹅鹅鹅鵞鹅鹅鵞鵞鹅鵞鹅鵞鵞鵞鵞鹅鵞鵞鵞鵞鹅鹅鵞鵞鵞鹅鹅鵞鵞鹅鵞鵞鵞鹅鹅鵞鹅鹅鹅鵞鹅鹅鵞鹅鵞鵞鹅鵞鵞鹅鹅鹅鵞鹅鹅鹅鵞鵞鹅鹅鵞鹅鵞鵞鵞鵞鵞鹅鵞鹅鹅 && MiscUtil.distance(鬭鬬鬭鬭鬬鬬鬭鬬鬬鬬鬬鬬鬬鬬鬬鬬鬬鬬鬭鬭鬭鬬鬭鬭鬭鬭鬬鬭鬬鬭鬬鬭鬬鬭鬭鬬鬬鬭鬭鬬鬭鬬鬭鬬鬬鬬鬭鬬鬬鬭鬭鬭鬭鬭鬬鬬鬬鬭鬭鬭鬭鬬鬬鬭鬬鬬鬬鬭鬬鬭鬭鬭鬭鬭鬬鬭鬭鬬鬬鬭鬬鬭鬭鬬鬭鬬鬭鬭鬬鬬鬭鬬鬬鬭鬭, 壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.getPlayerPos()) <= ああおおおおああおおあおあおあおおあおおああおああおああおおおおあああおあおあああああおおおあおあおおあおおおおおおおあおああおあおあああああおあおあおあおあおおあおおあおあおああおあああおああおおおああおあああああおあああおあお) {
                     鵞鹅鹅鵞鹅鹅鹅鵞鵞鵞鵞鵞鵞鹅鹅鵞鵞鹅鵞鹅鵞鵞鹅鵞鵞鹅鹅鹅鹅鹅鵞鵞鵞鵞鵞鵞鹅鵞鹅鹅鹅鵞鵞鹅鵞鵞鵞鹅鹅鵞鹅鵞鵞鹅鹅鹅鵞鹅鹅鵞鵞鹅鵞鹅鵞鵞鵞鵞鹅鵞鵞鵞鵞鹅鹅鵞鵞鵞鹅鹅鵞鵞鹅鵞鵞鵞鹅鹅鵞鹅鹅鹅鵞鹅鹅鵞鹅鵞鵞鹅鵞鵞鹅鹅鹅鵞鹅鹅鹅鵞鵞鹅鹅鵞鹅鵞鵞鵞鵞鵞鹅鵞鹅鹅 = true;
                  }

                  if (鵞鹅鹅鵞鹅鹅鹅鵞鵞鵞鵞鵞鵞鹅鹅鵞鵞鹅鵞鹅鵞鵞鹅鵞鵞鹅鹅鹅鹅鹅鵞鵞鵞鵞鵞鵞鹅鵞鹅鹅鹅鵞鵞鹅鵞鵞鵞鹅鹅鵞鹅鵞鵞鹅鹅鹅鵞鹅鹅鵞鵞鹅鵞鹅鵞鵞鵞鵞鹅鵞鵞鵞鵞鹅鹅鵞鵞鵞鹅鹅鵞鵞鹅鵞鵞鵞鹅鹅鵞鹅鹅鹅鵞鹅鹅鵞鹅鵞鵞鹅鵞鵞鹅鹅鹅鵞鹅鹅鹅鵞鵞鹅鹅鵞鹅鵞鵞鵞鵞鵞鹅鵞鹅鹅) {
                     鹅鹅鹅鵞鹅鵞鹅鵞鵞鵞鹅鹅鵞鹅鵞鵞鵞鹅鵞鵞鵞鵞鹅鵞鵞鹅鹅鹅鵞鵞鹅鵞鹅鹅鹅鹅鵞鵞鹅鹅鵞鹅鹅鵞鹅鵞鹅鵞鵞鵞鵞鹅鹅鵞鹅鹅鵞鵞鹅鵞鹅鵞鹅鵞鹅鵞鹅鹅鵞鹅鵞鵞鵞鹅鵞鹅鹅鵞鹅鵞鵞鹅鹅鵞鹅鹅鵞鹅鵞鵞鹅鵞鹅鹅鵞鹅鹅鵞鹅鵞鵞鵞鹅鹅鹅鹅鹅鵞鹅鹅鵞鵞鵞鹅鵞鵞鹅鹅鵞鵞鹅鵞鹅.add(鬭鬬鬭鬭鬬鬬鬭鬬鬬鬬鬬鬬鬬鬬鬬鬬鬬鬬鬭鬭鬭鬬鬭鬭鬭鬭鬬鬭鬬鬭鬬鬭鬬鬭鬭鬬鬬鬭鬭鬬鬭鬬鬭鬬鬬鬬鬭鬬鬬鬭鬭鬭鬭鬭鬬鬬鬬鬭鬭鬭鬭鬬鬬鬭鬬鬬鬬鬭鬬鬭鬭鬭鬭鬭鬬鬭鬭鬬鬬鬭鬬鬭鬭鬬鬭鬬鬭鬭鬬鬬鬭鬬鬬鬭鬭);
                  }
               }

               for(var10 = 鹅鹅鹅鵞鹅鵞鹅鵞鵞鵞鹅鹅鵞鹅鵞鵞鵞鹅鵞鵞鵞鵞鹅鵞鵞鹅鹅鹅鵞鵞鹅鵞鹅鹅鹅鹅鵞鵞鹅鹅鵞鹅鹅鵞鹅鵞鹅鵞鵞鵞鵞鹅鹅鵞鹅鹅鵞鵞鹅鵞鹅鵞鹅鵞鹅鵞鹅鹅鵞鹅鵞鵞鵞鹅鵞鹅鹅鵞鹅鵞鵞鹅鹅鵞鹅鹅鵞鹅鵞鵞鹅鵞鹅鹅鵞鹅鹅鵞鹅鵞鵞鵞鹅鹅鹅鹅鹅鵞鹅鹅鵞鵞鵞鹅鵞鵞鹅鹅鵞鵞鹅鵞鹅.iterator(); var10.hasNext(); 壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_BlockPos_757 = 鬭鬬鬭鬭鬬鬬鬭鬬鬬鬬鬬鬬鬬鬬鬬鬬鬬鬬鬭鬭鬭鬬鬭鬭鬭鬭鬬鬭鬬鬭鬬鬭鬬鬭鬭鬬鬬鬭鬭鬬鬭鬬鬭鬬鬬鬬鬭鬬鬬鬭鬭鬭鬭鬭鬬鬬鬬鬭鬭鬭鬭鬬鬬鬭鬬鬬鬬鬭鬬鬭鬭鬭鬭鬭鬬鬭鬭鬬鬬鬭鬬鬭鬭鬬鬭鬬鬭鬭鬬鬬鬭鬬鬬鬭鬭) {
                  鬭鬬鬭鬭鬬鬬鬭鬬鬬鬬鬬鬬鬬鬬鬬鬬鬬鬬鬭鬭鬭鬬鬭鬭鬭鬭鬬鬭鬬鬭鬬鬭鬬鬭鬭鬬鬬鬭鬭鬬鬭鬬鬭鬬鬬鬬鬭鬬鬬鬭鬭鬭鬭鬭鬬鬬鬬鬭鬭鬭鬭鬬鬬鬭鬬鬬鬬鬭鬬鬭鬭鬭鬭鬭鬬鬭鬭鬬鬬鬭鬬鬭鬭鬬鬭鬬鬭鬭鬬鬬鬭鬬鬬鬭鬭 = (BlockPos)var10.next();
                  壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_ArrayList_786.remove(鬭鬬鬭鬭鬬鬬鬭鬬鬬鬬鬬鬬鬬鬬鬬鬬鬬鬬鬭鬭鬭鬬鬭鬭鬭鬭鬬鬭鬬鬭鬬鬭鬬鬭鬭鬬鬬鬭鬭鬬鬭鬬鬭鬬鬬鬬鬭鬬鬬鬭鬭鬭鬭鬭鬬鬬鬬鬭鬭鬭鬭鬬鬬鬭鬬鬬鬬鬭鬬鬭鬭鬭鬭鬭鬬鬭鬭鬬鬬鬭鬬鬭鬭鬬鬭鬬鬭鬭鬬鬬鬭鬬鬬鬭鬭);
               }

               if (壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_ArrayList_786.size() > 0) {
                  if (壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_DirectionUtil_767 != null) {
                     壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.debug("Going to " + 壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_DirectionUtil_767.fd_String_827);
                  } else {
                     壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.debug("Going to X: " + 壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_int_765 + " Z: " + 壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_int_804);
                     if (壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_TimerUtil_803.hasPassed(1000)) {
                        壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_TimerUtil_803.reset();
                        if (壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_BlockPos_800 != null) {
                           ++壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_int_775;
                           壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_double_770 += PlayerUtils.distanceTo(壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_BlockPos_800);
                        }

                        壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_BlockPos_800 = 壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.getPlayerPos();
                     }

                     int ムムムムムㄙムムムㄙムムㄙムムㄙムㄙㄙㄙㄙㄙムㄙムㄙㄙㄙㄙㄙㄙㄙムㄙムㄙㄙムムㄙムㄙ = (int)(PlayerUtils.distanceTo(壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_BlockPos_788) / (壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_double_770 / (double)壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_int_775));
                     int jljILjjIJjjjJiLLLJIJjlIljIJjiJIILjjljIllIILIlLJiiIIJljlJIlLjjLIlllJiLJllLlijJIJl = ムムムムムㄙムムムㄙムムㄙムムㄙムㄙㄙㄙㄙㄙムㄙムㄙㄙㄙㄙㄙㄙㄙムㄙムㄙㄙムムㄙムㄙ / 3600;
                     int 森林林森木森林林森木森木林森木木林森森林林森森林木森木木林木木林林林森林木木木林森森森木森木木木林森木林林森森木森木木林森林木林森木木林木木木木林木林木林木林木木木 = ムムムムムㄙムムムㄙムムㄙムムㄙムㄙㄙㄙㄙㄙムㄙムㄙㄙㄙㄙㄙㄙㄙムㄙムㄙㄙムムㄙムㄙ % 3600 / 60;
                     int 晩晩晚晩晩晩晩晩晩晩晩晩晩晚晚晩晚晚晚晩晩晩晩晩晩晚晚晩晚晚晩晩晩晚晩晚晩晩晚晩晩晩晚晚晩晩晚晩晚晩晚晚晚晚晚晩晚晩晩晚晩晩晩晩晩晚晚晩晚晚晩晚晩晩晚晚晩晩晩晩晚晩晚晩晩晚晚晩晩晚晚晚晚晩晩晚晚晚晩 = ムムムムムㄙムムムㄙムムㄙムムㄙムㄙㄙㄙㄙㄙムㄙムㄙㄙㄙㄙㄙㄙㄙムㄙムㄙㄙムムㄙムㄙ % 60;
                     壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.debug("Estimated arrival in " + jljILjjIJjjjJiLLLJIJjlIljIJjiJIILjjljIllIILIlLJiiIIJljlJIlLjjLIlllJiLJllLlijJIJl + "h, " + 森林林森木森林林森木森木林森木木林森森林林森森林木森木木林木木林林林森林木木木林森森森木森木木木林森木林林森森木森木木林森林木林森木木林木木木木林木林木林木林木木木 + "m, " + 晩晩晚晩晩晩晩晩晩晩晩晩晩晚晚晩晚晚晚晩晩晩晩晩晩晚晚晩晚晚晩晩晩晚晩晚晩晩晚晩晩晩晚晚晩晩晚晩晚晩晚晚晚晚晚晩晚晩晩晚晩晩晩晩晩晚晚晩晚晚晩晚晩晩晚晚晩晩晩晩晚晩晚晩晩晚晚晩晩晚晚晚晚晩晩晚晚晚晩 + "s");
                     壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_String_779 = jljILjjIJjjjJiLLLJIJjlIljIJjiJIILjjljIllIILIlLJiiIIJljlJIlLjjLIlllJiLJllLlijJIJl + "h, " + 森林林森木森林林森木森木林森木木林森森林林森森林木森木木林木木林林林森林木木木林森森森木森木木木林森木林林森森木森木木林森林木林森木木林木木木木林木林木林木林木木木 + "m, " + 晩晩晚晩晩晩晩晩晩晩晩晩晩晚晚晩晚晚晚晩晩晩晩晩晩晚晚晩晚晚晩晩晩晚晩晚晩晩晚晩晩晩晚晚晩晩晚晩晚晩晚晚晚晚晚晩晚晩晩晚晩晩晩晩晩晚晚晩晚晚晩晚晩晩晚晚晩晩晩晩晚晩晚晩晩晚晚晩晩晚晚晚晚晩晩晚晚晚晩 + "s";
                     if (壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_Setting_755.get() == ElytraBotThreaded.FlyMode.fd_FlyMode_809) {
                        int var10001 = (int)((double)ムムムムムㄙムムムㄙムムㄙムムㄙムㄙㄙㄙㄙㄙムㄙムㄙㄙㄙㄙㄙㄙㄙムㄙムㄙㄙムムㄙムㄙ / (Double)壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_Setting_784.get());
                        壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.debug("Estimated fireworks needed: " + var10001);
                        壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_String_787 = String.valueOf(Math.round((double)ムムムムムㄙムムムㄙムムㄙムムㄙムㄙㄙㄙㄙㄙムㄙムㄙㄙㄙㄙㄙㄙㄙムㄙムㄙㄙムムㄙムㄙ / (Double)壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_Setting_784.get()));
                     }
                  }

                  if (壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_Setting_755.get() == ElytraBotThreaded.FlyMode.fd_FlyMode_809) {
                     Vec3d 䞨桂洼烓䞨桂茥晆烓晆洼桂烓垚桂㤬烓眭佳洼 = new Vec3d((double)((BlockPos)壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_ArrayList_786.get(壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_ArrayList_786.size() - 1)).add(0.5D, 0.5D, 0.5D).getX(), (double)((BlockPos)壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_ArrayList_786.get(壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_ArrayList_786.size() - 1)).add(0.5D, 0.5D, 0.5D).getY(), (double)((BlockPos)壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_ArrayList_786.get(壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_ArrayList_786.size() - 1)).add(0.5D, 0.5D, 0.5D).getZ());
                     壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.mc.player.setYaw((float)Rotations.getYaw(䞨桂洼烓䞨桂茥晆烓晆洼桂烓垚桂㤬烓眭佳洼));
                     壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.mc.player.setPitch((float)Rotations.getPitch(䞨桂洼烓䞨桂茥晆烓晆洼桂烓垚桂㤬烓眭佳洼));
                     壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.debug("Rotating to use firework.");
                     壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_String_759 = "Flying";
                  } else if (壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_Setting_755.get() == ElytraBotThreaded.FlyMode.fd_FlyMode_808) {
                     ElytraFly.toggle(true);
                     BlockPos 烓烓桂桂垚㙓烓澆烓桂澆洼圭圭洼垚圭烓垚圭桂土洼澆桂垚垚 = null;
                     if (壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_ArrayList_786.size() > 1) {
                        烓烓桂桂垚㙓烓澆烓桂澆洼圭圭洼垚圭烓垚圭桂土洼澆桂垚垚 = (BlockPos)壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_ArrayList_786.get(壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_ArrayList_786.size() - 2);
                     }

                     ElytraFly.setMotion((BlockPos)壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_ArrayList_786.get(壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_ArrayList_786.size() - 1), 烓烓桂桂垚㙓烓澆烓桂澆洼圭圭洼垚圭烓垚圭桂土洼澆桂垚垚, 壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_BlockPos_757);
                     if ((Boolean)壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_Setting_798.get() && 烓烓桂桂垚㙓烓澆烓桂澆洼圭圭洼垚圭烓垚圭桂土洼澆桂垚垚 != null) {
                        壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.mc.player.setYaw((float)Rotations.getYaw(烓烓桂桂垚㙓烓澆烓桂澆洼圭圭洼垚圭烓垚圭桂土洼澆桂垚垚));
                        壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.mc.player.setPitch((float)Rotations.getPitch(烓烓桂桂垚㙓烓澆烓桂澆洼圭圭洼垚圭烓垚圭桂土洼澆桂垚垚));
                     }

                     壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.debug("Elytra flying to next position.");
                     壿墫壿壿墫壿墫壿墫壿墫壿壿墫墫墫.fd_String_759 = "Flying";
                  }
               }

            }
         }
      }
   }

   public ElytraBotThreaded() {
      super(Class68.fd_Category_1062, "elytra-bot", "Elytra AutoPilot");
      メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_SettingGroup_802 = メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.settings.getDefaultGroup();
      メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_SettingGroup_762 = メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.settings.createGroup("ElytraFly");
      メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.SssssSsSSsSSsSsSsSsSsssSsssSsSSsssSSssSsSSssssSsSSSSSSsSSSSSSSSs = メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.settings.createGroup("Coordinates");
      メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_SettingGroup_774 = メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.settings.createGroup("AutoEat");
      メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_SettingGroup_768 = メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.settings.createGroup("Rendering");
      メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_Setting_769 = メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_SettingGroup_802.add(((Builder)((Builder)((Builder)(new Builder()).name("bot-mode")).description("What mode for the module to use.")).defaultValue(ElytraBotThreaded.Mode.fd_Mode_812)).build());
      メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_Setting_761 = メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_SettingGroup_802.add(((Builder)((Builder)((Builder)(new Builder()).name("takeoff-mode")).description("What mode to use for taking off.")).defaultValue(ElytraBotThreaded.TakeoffMode.fd_TakeoffMode_817)).build());
      メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_Setting_760 = メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_SettingGroup_802.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("use-baritone")).description("Whether or not to use baritone to walk a bit if stuck or a path cannot be found.")).defaultValue(true)).build());
      SettingGroup var10001 = メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_SettingGroup_802;
      meteordevelopment.meteorclient.settings.IntSetting.Builder var10002 = ((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("walk-distance")).description("How far to walk with baritone.")).defaultValue(20)).sliderMax(30);
      Setting var10003 = メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_Setting_760;
      Objects.requireNonNull(var10003);
      メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_Setting_777 = var10001.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)var10002.visible(var10003::get)).build());
      メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.SssSsSSssSSsssSsSsssssSsSSsSSsSsSSssssSsSsSsSssssSss = メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_SettingGroup_802.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("avoid-lava")).description("Whether or not the pathfinding will avoid lava.")).defaultValue(false)).build());
      メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_Setting_782 = メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_SettingGroup_802.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("max-y")).description("The maximum y coordinate the pathfinding can go to. Set to -1 to disable.")).defaultValue(-1)).sliderMax(512).build());
      メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_Setting_799 = メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_SettingGroup_802.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("auto-switch")).description("Switches equipped low durability elytra with a new one.")).defaultValue(false)).build());
      メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_Setting_783 = メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_SettingGroup_802.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("restore-chestplate")).description("Switch back to a chestplate after disabling.")).defaultValue(false)).build());
      var10001 = メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_SettingGroup_802;
      var10002 = ((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("switch-durability")).description("The durability threshold your elytra will be replaced at.")).defaultValue(2)).min(1).max(Items.ELYTRA.getMaxDamage() - 1).sliderMax(20);
      var10003 = メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_Setting_799;
      Objects.requireNonNull(var10003);
      メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_Setting_793 = var10001.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)var10002.visible(var10003::get)).build());
      メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_Setting_797 = メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_SettingGroup_802.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("toggle-on-pop")).description("Whether to toggle the module if you pop a totem or not.")).defaultValue(true)).build());
      メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_Setting_798 = メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_SettingGroup_802.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("rotate")).description("Whether to rotate to face the direction you're flying.")).defaultValue(false)).build());
      メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_Setting_756 = メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_SettingGroup_802.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("debug")).description("Sends debug messages.")).defaultValue(false)).build());
      メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_Setting_755 = メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_SettingGroup_762.add(((Builder)((Builder)((Builder)((Builder)(new Builder()).name("fly-mode")).description("What mode to use for flying.")).defaultValue(ElytraBotThreaded.FlyMode.fd_FlyMode_808)).onChanged(メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ::onModeChange)).build());
      メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_Setting_794 = メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_SettingGroup_762.add(((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)(new meteordevelopment.meteorclient.settings.DoubleSetting.Builder()).name("fly-speed")).description("The speed for control flight.")).defaultValue(1.81D).sliderMax(5.0D).visible(() -> {
         return 鬬鬬鬬鬭鬭鬭鬭鬭鬭鬭鬬鬭鬭鬭鬬鬭鬭鬬鬭鬬鬬鬭鬭鬭鬭鬭鬬鬭鬬鬭鬬鬭鬭鬭鬭鬬鬭鬭鬬鬬鬬鬭鬬鬭鬬鬭鬬鬭鬭鬭鬬鬭鬭鬬鬭鬬鬭鬭鬬鬬鬭鬬鬬鬭鬬鬬鬬鬬鬬鬭鬬鬬鬬鬬鬬鬬鬭鬬鬭鬬鬭鬭鬭鬭鬬鬭鬭鬭鬬鬬鬬鬭鬭鬭鬬鬭鬭鬬鬭鬭鬭.fd_Setting_755.get() == ElytraBotThreaded.FlyMode.fd_FlyMode_808;
      })).build());
      メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_Setting_780 = メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_SettingGroup_762.add(((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)(new meteordevelopment.meteorclient.settings.DoubleSetting.Builder()).name("maneuver-speed")).description("The speed used for maneuvering.")).defaultValue(1.0D).sliderMax(3.0D).visible(() -> {
         return ssSSSsSSSSsssSSssSSsssSsssSSSsS.fd_Setting_755.get() == ElytraBotThreaded.FlyMode.fd_FlyMode_808;
      })).build());
      メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_Setting_784 = メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_SettingGroup_762.add(((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)(new meteordevelopment.meteorclient.settings.DoubleSetting.Builder()).name("firework-delay")).description("The delay between using fireworks in seconds.")).defaultValue(2.0D).visible(() -> {
         return 〇ooo〇〇o〇〇OOooOooOOOOO〇〇O〇o〇oo〇〇〇〇O〇oooo〇ooOO〇OoO〇O〇OoO〇〇〇Oo〇〇ooOoO〇OOO〇〇oOOoO〇〇O〇ooO〇〇oOOooOOOo〇o〇〇.fd_Setting_755.get() == ElytraBotThreaded.FlyMode.fd_FlyMode_809;
      })).build());
      メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_Setting_801 = メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.SssssSsSSsSSsSsSsSsSsssSsssSsSSsssSSssSsSSssssSsSSSSSSsSSSSSSSSs.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("use-coordinates")).description("If true, uses the given coordinates. If not, starts flying in the direction you are facing.")).defaultValue(false)).build());
      var10001 = メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.SssssSsSSsSSsSsSsSsSsssSsssSsSSsssSSssSsSSssssSsSSSSSSsSSSSSSSSs;
      var10002 = ((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("goto-x")).description("The x coordinate the bot will try to go to.")).defaultValue(0)).sliderMin(-100000).sliderMax(100000).min(-30000000).max(30000000);
      var10003 = メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_Setting_801;
      Objects.requireNonNull(var10003);
      メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_Setting_766 = var10001.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)var10002.visible(var10003::get)).build());
      var10001 = メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.SssssSsSSsSSsSsSsSsSsssSsssSsSSsssSSssSsSSssssSsSSSSSSsSSSSSSSSs;
      var10002 = ((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("goto-z")).description("The z coordinate the bot will try to go to.")).defaultValue(0)).sliderMin(-100000).sliderMax(100000).min(-30000000).max(30000000);
      var10003 = メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_Setting_801;
      Objects.requireNonNull(var10003);
      メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_Setting_792 = var10001.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)var10002.visible(var10003::get)).build());
      メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_Setting_758 = メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_SettingGroup_774.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("auto-eat")).description("Automatically eats gaps or other food when health or hunger is low.")).defaultValue(true)).build());
      var10001 = メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_SettingGroup_774;
      var10002 = ((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("min-health")).description("The health value at which the bot will eat food.")).defaultValue(10)).sliderMin(1).sliderMax(19);
      var10003 = メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_Setting_758;
      Objects.requireNonNull(var10003);
      メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.qPQQQpQqQpQQpPppPqPPqPQPpqQqqppQqQpqQppQQqQppPqqQQppQpqPqqppqqqQQpqQQPPpPQQQPpQQQpQQQQQpPQpPqppqPPPQQqQPqPqpQQqqqPPPqqPqPp = var10001.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)var10002.visible(var10003::get)).build());
      var10001 = メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_SettingGroup_774;
      var10002 = ((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("min-hunger")).description("The health hunger at which the bot will eat food.")).defaultValue(10)).sliderMin(1).sliderMax(19);
      var10003 = メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_Setting_758;
      Objects.requireNonNull(var10003);
      メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_Setting_805 = var10001.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)var10002.visible(var10003::get)).build());
      var10001 = メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_SettingGroup_774;
      meteordevelopment.meteorclient.settings.BoolSetting.Builder var1 = (meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("allow-gaps")).description("Whether or not the bot is allowed to eat gapples.")).defaultValue(true);
      var10003 = メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_Setting_758;
      Objects.requireNonNull(var10003);
      メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.pQPppqppPQpqpppqPQQQppppQQQQPpPPQqPQPqQqPQQqppQQPqPpQQPPPPppQqPQQqpPQ = var10001.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)var1.visible(var10003::get)).build());
      メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_Setting_763 = メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_SettingGroup_768.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("render-path")).description("Whether or not the path should be rendered.")).defaultValue(true)).build());
      var10001 = メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_SettingGroup_768;
      meteordevelopment.meteorclient.settings.ColorSetting.Builder var2 = (meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)(new meteordevelopment.meteorclient.settings.ColorSetting.Builder()).name("path-color")).description("The path's color.")).defaultValue(new SettingColor(255, 0, 0, 150));
      var10003 = メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_Setting_763;
      Objects.requireNonNull(var10003);
      メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_Setting_795 = var10001.add(((meteordevelopment.meteorclient.settings.ColorSetting.Builder)var2.visible(var10003::get)).build());
      メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_double_796 = -1.0D;
      メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_TimerUtil_803 = new TimerUtil();
      メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_TimerUtil_753 = new TimerUtil();
      メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_TimerUtil_791 = new TimerUtil();
      メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_TimerUtil_771 = new TimerUtil();
      メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_String_759 = "Disabled";
      メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_String_773 = null;
      メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_String_779 = null;
      メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_String_787 = null;
      メメメノノノメノノノメメノメメノメノノメノノノノメノノノノノメメメメノノ.fd_StaticGroundListener_776 = new ElytraBotThreaded.StaticGroundListener();
   }

   public void onDeactivate() {
      Oo〇O〇OooOoO〇OOOoooo〇〇〇oo〇〇OO〇OOo〇oOoo〇o〇ooOooOoo.fd_DirectionUtil_767 = null;
      Oo〇O〇OooOoO〇OOOoooo〇〇〇oo〇〇OO〇OOo〇oOoo〇o〇ooOooOoo.fd_ArrayList_786 = null;
      Oo〇O〇OooOoO〇OOOoooo〇〇〇oo〇〇OO〇OOo〇oOoo〇o〇ooOooOoo.fd_int_778 = 0;
      Oo〇O〇OooOoO〇OOOoooo〇〇〇oo〇〇OO〇OOo〇oOoo〇o〇ooOooOoo.fd_boolean_781 = false;
      Oo〇O〇OooOoO〇OOOoooo〇〇〇oo〇〇OO〇OOo〇oOoo〇o〇ooOooOoo.fd_int_754 = 0;
      Oo〇O〇OooOoO〇OOOoooo〇〇〇oo〇〇OO〇OOo〇oOoo〇o〇ooOooOoo.fd_double_770 = 0.0D;
      Oo〇O〇OooOoO〇OOOoooo〇〇〇oo〇〇OO〇OOo〇oOoo〇o〇ooOooOoo.fd_int_775 = 0;
      Oo〇O〇OooOoO〇OOOoooo〇〇〇oo〇〇OO〇OOo〇oOoo〇o〇ooOooOoo.fd_BlockPos_800 = null;
      Oo〇O〇OooOoO〇OOOoooo〇〇〇oo〇〇OO〇OOo〇oOoo〇o〇ooOooOoo.fd_double_796 = -1.0D;
      Oo〇O〇OooOoO〇OOOoooo〇〇〇oo〇〇OO〇OOo〇oOoo〇o〇ooOooOoo.fd_BlockPos_785 = null;
      PacketFly.toggle(false);
      ElytraFly.toggle(false);
      Oo〇O〇OooOoO〇OOOoooo〇〇〇oo〇〇OO〇OOo〇oOoo〇o〇ooOooOoo.fd_BlockPos_788 = null;
      BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().forceCancel();
      MiscUtil.suspend(Oo〇O〇OooOoO〇OOOoooo〇〇〇oo〇〇OO〇OOo〇oOoo〇o〇ooOooOoo.fd_Thread_790);
      Oo〇O〇OooOoO〇OOOoooo〇〇〇oo〇〇OO〇OOo〇oOoo〇o〇ooOooOoo.fd_Thread_790 = null;
      Oo〇O〇OooOoO〇OOOoooo〇〇〇oo〇〇OO〇OOo〇oOoo〇o〇ooOooOoo.fd_String_759 = "Disabled";
      Oo〇O〇OooOoO〇OOOoooo〇〇〇oo〇〇OO〇OOo〇oOoo〇o〇ooOooOoo.fd_String_773 = null;
      Oo〇O〇OooOoO〇OOOoooo〇〇〇oo〇〇OO〇OOo〇oOoo〇o〇ooOooOoo.fd_String_779 = null;
      Oo〇O〇OooOoO〇OOOoooo〇〇〇oo〇〇OO〇OOo〇oOoo〇o〇ooOooOoo.fd_String_787 = null;
      if (Oo〇O〇OooOoO〇OOOoooo〇〇〇oo〇〇OO〇OOo〇oOoo〇o〇ooOooOoo.fd_boolean_772) {
         NoFall 乀乀ㇸへㇸㇸへㇸ乀ㇸへへ乀ㇸㇸ乀へㇸ乀ㇸㇸへㇸ乀へへㇸへへ乀ㇸㇸ乀へㇸへ乀へㇸ乀へㇸ乀ㇸ乀乀ㇸㇸへへ乀へㇸ乀へへㇸへ乀乀乀ㇸへへ乀へ乀へ乀へㇸㇸへㇸ乀へ = (NoFall)Modules.get().get(NoFall.class);
         if (!乀乀ㇸへㇸㇸへㇸ乀ㇸへへ乀ㇸㇸ乀へㇸ乀ㇸㇸへㇸ乀へへㇸへへ乀ㇸㇸ乀へㇸへ乀へㇸ乀へㇸ乀ㇸ乀乀ㇸㇸへへ乀へㇸ乀へへㇸへ乀乀乀ㇸへへ乀へ乀へ乀へㇸㇸへㇸ乀へ.isActive() && Oo〇O〇OooOoO〇OOOoooo〇〇〇oo〇〇OO〇OOo〇oOoo〇o〇ooOooOoo.fd_boolean_772) {
            Oo〇O〇OooOoO〇OOOoooo〇〇〇oo〇〇OO〇OOo〇oOoo〇o〇ooOooOoo.info("Re-enabling NoFall", new Object[0]);
            乀乀ㇸへㇸㇸへㇸ乀ㇸへへ乀ㇸㇸ乀へㇸ乀ㇸㇸへㇸ乀へへㇸへへ乀ㇸㇸ乀へㇸへ乀へㇸ乀へㇸ乀ㇸ乀乀ㇸㇸへへ乀へㇸ乀へへㇸへ乀乀乀ㇸへへ乀へ乀へ乀へㇸㇸへㇸ乀へ.toggle();
         }
      }

   }

   @EventHandler
   private void onGameLeft(GameLeftEvent 幐幐㬺幐㬺幐幐㬺㬺幐㬺幐幐幐㬺幐幐幐㬺㬺㬺㬺㬺幐㬺幐㬺㬺幐幐幐㬺幐㬺㬺幐㬺幐幐㬺幐幐幐幐㬺㬺幐㬺幐幐幐㬺㬺幐㬺㬺幐㬺幐㬺㬺㬺㬺幐幐幐㬺幐㬺㬺幐幐㬺㬺幐幐幐㬺幐㬺㬺幐㬺幐幐) {
      幐幐幐幐㬺幐㬺幐幐幐幐㬺㬺㬺㬺幐幐㬺幐㬺幐幐㬺幐幐幐幐㬺幐㬺㬺幐幐幐幐㬺幐幐㬺㬺幐幐㬺幐幐㬺幐幐幐㬺幐幐㬺幐幐㬺㬺幐㬺㬺㬺㬺幐㬺幐幐幐幐㬺幐幐㬺幐幐㬺幐幐幐幐幐幐幐幐㬺幐幐㬺㬺㬺㬺㬺㬺㬺幐㬺幐㬺㬺㬺幐幐㬺幐㬺幐幐㬺幐㬺㬺㬺㬺㬺㬺㬺幐幐幐㬺幐幐幐.sSsSSsSssssssS = false;
   }

   public static void sleep(int 墫墫墫壿壿壿墫壿壿壿墫墫墫墫墫壿壿墫壿墫壿壿壿壿墫壿墫壿壿墫壿墫墫墫壿墫壿壿墫墫壿壿壿壿墫壿壿壿壿墫壿墫墫墫壿壿墫壿墫墫壿墫壿墫壿壿墫壿壿墫墫壿墫墫壿壿墫墫墫壿墫墫墫墫壿墫墫墫墫墫墫壿墫壿壿墫墫壿壿墫壿) {
      try {
         Thread.sleep((long)jlJlJjIJjjLliIiiJlLijLilIIJijIJlIlJiIjJlLJIJjiiJILjij);
      } catch (Exception var2) {
      }

   }

   public void generatePath() {
      BlockPos[] 桂眭㤬桂桂桂㤬䞨洼晆桂㤬桂眭垚烓㤬洼䞨眭烓佳晆桂桂垚桂眭洼烓眭洼洼垚烓洼 = new BlockPos[]{new BlockPos(1, 0, 0), new BlockPos(-1, 0, 0), new BlockPos(0, 0, 1), new BlockPos(0, 0, -1), new BlockPos(1, 0, 1), new BlockPos(-1, 0, -1), new BlockPos(-1, 0, 1), new BlockPos(1, 0, -1), new BlockPos(0, -1, 0), new BlockPos(0, 1, 0)};
      ArrayList<BlockPos> ムㄙムㄙㄙㄙㄙㄙㄙムㄙムムムムム = new ArrayList();
      if (へ乀乀乀へへへへへㇸ乀ㇸへへ乀乀ㇸ乀へ乀ㇸ乀へㇸへㇸ乀へㇸ乀.fd_Setting_769.get() == ElytraBotThreaded.Mode.fd_Mode_812) {
         BlockPos[] 佪茴佪佪徊徊茴佪徊徊回茴茴佪回回徊徊回佪回佪茴徊佪徊徊茴徊徊茴茴茴佪回徊回徊回茴徊回徊佪回佪回徊佪茴茴茴徊佪徊佪徊回佪徊茴徊回徊回回茴佪回茴佪茴佪佪 = new BlockPos[]{new BlockPos(1, 0, 0), new BlockPos(-1, 0, 0), new BlockPos(0, 0, 1), new BlockPos(0, 0, -1), new BlockPos(1, 0, 1), new BlockPos(-1, 0, -1), new BlockPos(-1, 0, 1), new BlockPos(1, 0, -1)};
         ムㄙムㄙㄙㄙㄙㄙㄙムㄙムムムムム = new ArrayList(Arrays.asList(佪茴佪佪徊徊茴佪徊徊回茴茴佪回回徊徊回佪回佪茴徊佪徊徊茴徊徊茴茴茴佪回徊回徊回茴徊回徊佪回佪回徊佪茴茴茴徊佪徊佪徊回佪徊茴徊回徊回回茴佪回茴佪茴佪佪));
      } else if (へ乀乀乀へへへへへㇸ乀ㇸへへ乀乀ㇸ乀へ乀ㇸ乀へㇸへㇸ乀へㇸ乀.fd_Setting_769.get() == ElytraBotThreaded.Mode.fd_Mode_813) {
         int oO〇O〇oOoooOOOO〇O〇oO〇〇〇o〇Oo〇OoO〇oOOOOO〇OooOOo〇OOO〇o〇〇oo〇O〇OOooOOooOOOOooo〇〇oooOoooOo〇o〇OoOOOOoO〇 = 3;

         for(int JjiiJlIjLlLLjJlIjJILJLJjjLIiIlLiJIllliiJiIjijJLilLIlLijljJLlLijlLiIILIIjJjIijlJLLLIILijiIIJjiJlLIIiIIjjJJjLJiIijiIIjl = -oO〇O〇oOoooOOOO〇O〇oO〇〇〇o〇Oo〇OoO〇oOOOOO〇OooOOo〇OOO〇o〇〇oo〇O〇OOooOOooOOOOooo〇〇oooOoooOo〇o〇OoOOOOoO〇; JjiiJlIjLlLLjJlIjJILJLJjjLIiIlLiJIllliiJiIjijJLilLIlLijljJLlLijlLiIILIIjJjIijlJLLLIILijiIIJjiJlLIIiIIjjJJjLJiIijiIIjl < oO〇O〇oOoooOOOO〇O〇oO〇〇〇o〇Oo〇OoO〇oOOOOO〇OooOOo〇OOO〇o〇〇oo〇O〇OOooOOooOOOOooo〇〇oooOoooOo〇o〇OoOOOOoO〇; ++JjiiJlIjLlLLjJlIjJILJLJjjLIiIlLiJIllliiJiIjijJLilLIlLijljJLlLijlLiIILIIjJjIijlJLLLIILijiIIJjiJlLIIiIIjjJJjLJiIijiIIjl) {
            for(int 燚燚炏炎炎炎燚火焱欻 = -oO〇O〇oOoooOOOO〇O〇oO〇〇〇o〇Oo〇OoO〇oOOOOO〇OooOOo〇OOO〇o〇〇oo〇O〇OOooOOooOOOOooo〇〇oooOoooOo〇o〇OoOOOOoO〇; 燚燚炏炎炎炎燚火焱欻 < oO〇O〇oOoooOOOO〇O〇oO〇〇〇o〇Oo〇OoO〇oOOOOO〇OooOOo〇OOO〇o〇〇oo〇O〇OOooOOooOOOOooo〇〇oooOoooOo〇o〇OoOOOOoO〇; ++燚燚炏炎炎炎燚火焱欻) {
               for(int 鬬鬬鬭鬬鬭鬬鬭鬬鬭鬬鬬鬭鬭鬭鬬鬬鬬鬬鬬鬬鬬鬬鬬鬭鬭鬭鬭鬬鬭鬭鬭鬭鬬鬬鬭鬬鬬鬭鬭鬬鬬鬭鬭鬬鬬鬬鬬鬬鬭鬬鬬鬭鬬鬭鬭鬬鬭鬬鬬鬬鬬鬭鬭鬬鬭鬭鬬鬬鬭鬭鬬鬬鬭鬭鬬鬬鬬鬭鬬鬭鬭鬭鬭鬭鬭鬭鬭鬭鬭鬬鬭鬭鬭鬬鬬鬭鬬鬬鬬鬬鬭 = oO〇O〇oOoooOOOO〇O〇oO〇〇〇o〇Oo〇OoO〇oOOOOO〇OooOOo〇OOO〇o〇〇oo〇O〇OOooOOooOOOOooo〇〇oooOoooOo〇o〇OoOOOOoO〇; 鬬鬬鬭鬬鬭鬬鬭鬬鬭鬬鬬鬭鬭鬭鬬鬬鬬鬬鬬鬬鬬鬬鬬鬭鬭鬭鬭鬬鬭鬭鬭鬭鬬鬬鬭鬬鬬鬭鬭鬬鬬鬭鬭鬬鬬鬬鬬鬬鬭鬬鬬鬭鬬鬭鬭鬬鬭鬬鬬鬬鬬鬭鬭鬬鬭鬭鬬鬬鬭鬭鬬鬬鬭鬭鬬鬬鬬鬭鬬鬭鬭鬭鬭鬭鬭鬭鬭鬭鬭鬬鬭鬭鬭鬬鬬鬭鬬鬬鬬鬬鬭 > -oO〇O〇oOoooOOOO〇O〇oO〇〇〇o〇Oo〇OoO〇oOOOOO〇OooOOo〇OOO〇o〇〇oo〇O〇OOooOOooOOOOooo〇〇oooOoooOo〇o〇OoOOOOoO〇; --鬬鬬鬭鬬鬭鬬鬭鬬鬭鬬鬬鬭鬭鬭鬬鬬鬬鬬鬬鬬鬬鬬鬬鬭鬭鬭鬭鬬鬭鬭鬭鬭鬬鬬鬭鬬鬬鬭鬭鬬鬬鬭鬭鬬鬬鬬鬬鬬鬭鬬鬬鬭鬬鬭鬭鬬鬭鬬鬬鬬鬬鬭鬭鬬鬭鬭鬬鬬鬭鬭鬬鬬鬭鬭鬬鬬鬬鬭鬬鬭鬭鬭鬭鬭鬭鬭鬭鬭鬭鬬鬭鬭鬭鬬鬬鬭鬬鬬鬬鬬鬭) {
                  ムㄙムㄙㄙㄙㄙㄙㄙムㄙムムムムム.add(new BlockPos(JjiiJlIjLlLLjJlIjJILJLJjjLIiIlLiJIllliiJiIjijJLilLIlLijljJLlLijlLiIILIIjJjIijlJLLLIILijiIIJjiJlLIIiIIjjJJjLJiIijiIIjl, 鬬鬬鬭鬬鬭鬬鬭鬬鬭鬬鬬鬭鬭鬭鬬鬬鬬鬬鬬鬬鬬鬬鬬鬭鬭鬭鬭鬬鬭鬭鬭鬭鬬鬬鬭鬬鬬鬭鬭鬬鬬鬭鬭鬬鬬鬬鬬鬬鬭鬬鬬鬭鬬鬭鬭鬬鬭鬬鬬鬬鬬鬭鬭鬬鬭鬭鬬鬬鬭鬭鬬鬬鬭鬭鬬鬬鬬鬭鬬鬭鬭鬭鬭鬭鬭鬭鬭鬭鬭鬬鬭鬭鬭鬬鬬鬭鬬鬬鬬鬬鬭, 燚燚炏炎炎炎燚火焱欻));
               }
            }
         }
      } else if (へ乀乀乀へへへへへㇸ乀ㇸへへ乀乀ㇸ乀へ乀ㇸ乀へㇸへㇸ乀へㇸ乀.fd_Setting_769.get() == ElytraBotThreaded.Mode.fd_Mode_811) {
         桂眭㤬桂桂桂㤬䞨洼晆桂㤬桂眭垚烓㤬洼䞨眭烓佳晆桂桂垚桂眭洼烓眭洼洼垚烓洼 = new BlockPos[]{new BlockPos(1, 0, 0), new BlockPos(-1, 0, 0), new BlockPos(0, 0, 1), new BlockPos(0, 0, -1)};
         ムㄙムㄙㄙㄙㄙㄙㄙムㄙムムムムム = new ArrayList(List.of(new BlockPos(0, -1, 0)));
      }

      if (へ乀乀乀へへへへへㇸ乀ㇸへへ乀乀ㇸ乀へ乀ㇸ乀へㇸへㇸ乀へㇸ乀.fd_ArrayList_786 != null && へ乀乀乀へへへへへㇸ乀ㇸへへ乀乀ㇸ乀へ乀ㇸ乀へㇸへㇸ乀へㇸ乀.fd_ArrayList_786.size() != 0 && !へ乀乀乀へへへへへㇸ乀ㇸへへ乀乀ㇸ乀へ乀ㇸ乀へㇸへㇸ乀へㇸ乀.isNextPathTooFar() && !へ乀乀乀へへへへへㇸ乀ㇸへへ乀乀ㇸ乀へ乀ㇸ乀へㇸへㇸ乀へㇸ乀.mc.player.isOnGround()) {
         ArrayList 森木林森木森木林林森森森森木林林木林木林木森木木森森林森木森木林森木木森林木森木林森森森林林林森木木森木森木木木林林林林林 = AStar.generatePath((BlockPos)へ乀乀乀へへへへへㇸ乀ㇸへへ乀乀ㇸ乀へ乀ㇸ乀へㇸへㇸ乀へㇸ乀.fd_ArrayList_786.get(0), へ乀乀乀へへへへへㇸ乀ㇸへへ乀乀ㇸ乀へ乀ㇸ乀へㇸへㇸ乀へㇸ乀.fd_BlockPos_788, 桂眭㤬桂桂桂㤬䞨洼晆桂㤬桂眭垚烓㤬洼䞨眭烓佳晆桂桂垚桂眭洼烓眭洼洼垚烓洼, ムㄙムㄙㄙㄙㄙㄙㄙムㄙムムムムム, 500);

         try {
            森木林森木森木林林森森森森木林林木林木林木森木木森森林森木森木林森木木森林木森木林森森森林林林森木木森木森木木木林林林林林.addAll(へ乀乀乀へへへへへㇸ乀ㇸへへ乀乀ㇸ乀へ乀ㇸ乀へㇸへㇸ乀へㇸ乀.fd_ArrayList_786);
         } catch (NullPointerException var7) {
         }

         へ乀乀乀へへへへへㇸ乀ㇸへへ乀乀ㇸ乀へ乀ㇸ乀へㇸへㇸ乀へㇸ乀.fd_ArrayList_786 = 森木林森木森木林林森森森森木林林木林木林木森木木森森林森木森木林森木木森林木森木林森森森林林林森木木森木森木木木林林林林林;
      } else {
         BlockPos メノノメメメメノノノノノメメノノメノノノノノノメノメメ;
         if (へ乀乀乀へへへへへㇸ乀ㇸへへ乀乀ㇸ乀へ乀ㇸ乀へㇸへㇸ乀へㇸ乀.fd_Setting_769.get() == ElytraBotThreaded.Mode.fd_Mode_813) {
            メノノメメメメノノノノノメメノノメノノノノノノメノメメ = へ乀乀乀へへへへへㇸ乀ㇸへへ乀乀ㇸ乀へ乀ㇸ乀へㇸへㇸ乀へㇸ乀.getPlayerPos().add(0, 4, 0);
         } else if (Math.abs(へ乀乀乀へへへへへㇸ乀ㇸへへ乀乀ㇸ乀へ乀ㇸ乀へㇸへㇸ乀へㇸ乀.fd_double_796 - へ乀乀乀へへへへへㇸ乀ㇸへへ乀乀ㇸ乀へ乀ㇸ乀へㇸへㇸ乀へㇸ乀.mc.player.getY()) <= 2.0D) {
            メノノメメメメノノノノノメメノノメノノノノノノメノメメ = new BlockPos(へ乀乀乀へへへへへㇸ乀ㇸへへ乀乀ㇸ乀へ乀ㇸ乀へㇸへㇸ乀へㇸ乀.mc.player.getX(), へ乀乀乀へへへへへㇸ乀ㇸへへ乀乀ㇸ乀へ乀ㇸ乀へㇸへㇸ乀へㇸ乀.fd_double_796 + 1.0D, へ乀乀乀へへへへへㇸ乀ㇸへへ乀乀ㇸ乀へ乀ㇸ乀へㇸへㇸ乀へㇸ乀.mc.player.getZ());
         } else {
            メノノメメメメノノノノノメメノノメノノノノノノメノメメ = へ乀乀乀へへへへへㇸ乀ㇸへへ乀乀ㇸ乀へ乀ㇸ乀へㇸへㇸ乀へㇸ乀.getPlayerPos().add(0, 1, 0);
         }

         if (へ乀乀乀へへへへへㇸ乀ㇸへへ乀乀ㇸ乀へ乀ㇸ乀へㇸへㇸ乀へㇸ乀.isNextPathTooFar()) {
            メノノメメメメノノノノノメメノノメノノノノノノメノメメ = へ乀乀乀へへへへへㇸ乀ㇸへへ乀乀ㇸ乀へ乀ㇸ乀へㇸへㇸ乀へㇸ乀.getPlayerPos();
         }

         へ乀乀乀へへへへへㇸ乀ㇸへへ乀乀ㇸ乀へ乀ㇸ乀へㇸへㇸ乀へㇸ乀.fd_ArrayList_786 = AStar.generatePath(メノノメメメメノノノノノメメノノメノノノノノノメノメメ, へ乀乀乀へへへへへㇸ乀ㇸへへ乀乀ㇸ乀へ乀ㇸ乀へㇸへㇸ乀へㇸ乀.fd_BlockPos_788, 桂眭㤬桂桂桂㤬䞨洼晆桂㤬桂眭垚烓㤬洼䞨眭烓佳晆桂桂垚桂眭洼烓眭洼洼垚烓洼, ムㄙムㄙㄙㄙㄙㄙㄙムㄙムムムムム, 500);
      }

   }

   public void useBaritone() {
      ElytraFly.toggle(false);
      int おああおおおああおああおあおおおあああおおあおあおあおああああおおああおあああおああおおおあおおああああおおおあおああああおおおあああおおあおあおおおあおあああおあおああああおおあああ = (int)(おおおおああああああおああおああああおあああああああああおおおおあおあおあおおああおあおおあおおああおああおあおおあああおあおあおおおあああおああおおおおおおああおああおおあおおおああおああおあおあ.fd_double_796 - おおおおああああああおああおああああおあああああああああおおおおあおあおあおおああおあおおあおおああおああおあおおあああおあおあおおおあああおああおおおおおおああおああおおあおおおああおああおあおあ.mc.player.getY());
      int OOOO〇Ooo〇〇oO〇ooOOOo〇O〇oO〇〇〇〇〇oOOO〇oOo〇oo〇〇〇OO〇oOOOOOoOoooO〇〇OO〇ooO〇OOoo〇oo〇o〇oo〇 = 0;
      int 〇Oo〇ooO〇ooO〇o〇O〇oO〇〇oO〇OOoOO〇ooo〇oooO〇OoooOOoO〇O〇oOOo〇Oo〇OOoOo〇oo〇OOO〇〇ooOo〇oOOOO〇oO〇oooOoO〇〇Oo〇 = 0;
      int ㄑㄑㄑくㄑㄑくㄑくㄑㄑㄑくㄑくくくくㄑくくくㄑくㄑくㄑくくくくくㄑㄑくくくくㄑくくくくくㄑㄑㄑくㄑくㄑㄑㄑくㄑㄑくくㄑㄑくくくくくㄑㄑくくくㄑくくくくㄑㄑくくくくくㄑㄑくくくくくく = (Integer)おおおおああああああおああおああああおあああああああああおおおおあおあおあおおああおあおおあおおああおああおあおおあああおあおあおおおあああおああおおおおおおああおああおおあおおおああおああおあおあ.fd_Setting_777.get();
      switch(おおおおああああああおああおああああおあああああああああおおおおあおあおあおおああおあおおあおおああおああおあおおあああおあおあおおおあああおああおおおおおおああおああおおあおおおああおああおあおあ.fd_DirectionUtil_767) {
      case fd_DirectionUtil_825:
         〇Oo〇ooO〇ooO〇o〇O〇oO〇〇oO〇OOoOO〇ooo〇oooO〇OoooOOoO〇O〇oOOo〇Oo〇OOoOo〇oo〇OOO〇〇ooOo〇oOOOO〇oO〇oooOoO〇〇Oo〇 = -ㄑㄑㄑくㄑㄑくㄑくㄑㄑㄑくㄑくくくくㄑくくくㄑくㄑくㄑくくくくくㄑㄑくくくくㄑくくくくくㄑㄑㄑくㄑくㄑㄑㄑくㄑㄑくくㄑㄑくくくくくㄑㄑくくくㄑくくくくㄑㄑくくくくくㄑㄑくくくくくく;
      case QqqPpqPPQqPPqQQqqPpqQPpppPQqQqpqQQPPQqpqqPqqqPpQQpQPppppQpPpp:
         OOOO〇Ooo〇〇oO〇ooOOOo〇O〇oO〇〇〇〇〇oOOO〇oOo〇oo〇〇〇OO〇oOOOOOoOoooO〇〇OO〇ooO〇OOoo〇oo〇o〇oo〇 = -ㄑㄑㄑくㄑㄑくㄑくㄑㄑㄑくㄑくくくくㄑくくくㄑくㄑくㄑくくくくくㄑㄑくくくくㄑくくくくくㄑㄑㄑくㄑくㄑㄑㄑくㄑㄑくくㄑㄑくくくくくㄑㄑくくくㄑくくくくㄑㄑくくくくくㄑㄑくくくくくく;
      case fd_DirectionUtil_826:
      case fd_DirectionUtil_830:
      case fd_DirectionUtil_829:
      case fd_DirectionUtil_831:
         OOOO〇Ooo〇〇oO〇ooOOOo〇O〇oO〇〇〇〇〇oOOO〇oOo〇oo〇〇〇OO〇oOOOOOoOoooO〇〇OO〇ooO〇OOoo〇oo〇o〇oo〇 = -ㄑㄑㄑくㄑㄑくㄑくㄑㄑㄑくㄑくくくくㄑくくくㄑくㄑくㄑくくくくくㄑㄑくくくくㄑくくくくくㄑㄑㄑくㄑくㄑㄑㄑくㄑㄑくくㄑㄑくくくくくㄑㄑくくくㄑくくくくㄑㄑくくくくくㄑㄑくくくくくく;
         〇Oo〇ooO〇ooO〇o〇O〇oO〇〇oO〇OOoOO〇ooo〇oooO〇OoooOOoO〇O〇oOOo〇Oo〇OOoOo〇oo〇OOO〇〇ooOo〇oOOOO〇oO〇oooOoO〇〇Oo〇 = -ㄑㄑㄑくㄑㄑくㄑくㄑㄑㄑくㄑくくくくㄑくくくㄑくㄑくㄑくくくくくㄑㄑくくくくㄑくくくくくㄑㄑㄑくㄑくㄑㄑㄑくㄑㄑくくㄑㄑくくくくくㄑㄑくくくㄑくくくくㄑㄑくくくくくㄑㄑくくくくくく;
      case ssSSSsSSSSSsSSsssSSsSssSssSSsSSs:
         〇Oo〇ooO〇ooO〇o〇O〇oO〇〇oO〇OOoOO〇ooo〇oooO〇OoooOOoO〇O〇oOOo〇Oo〇OOoOo〇oo〇OOO〇〇ooOo〇oOOOO〇oO〇oooOoO〇〇Oo〇 = -ㄑㄑㄑくㄑㄑくㄑくㄑㄑㄑくㄑくくくくㄑくくくㄑくㄑくㄑくくくくくㄑㄑくくくくㄑくくくくくㄑㄑㄑくㄑくㄑㄑㄑくㄑㄑくくㄑㄑくくくくくㄑㄑくくくㄑくくくくㄑㄑくくくくくㄑㄑくくくくくく;
      case fd_DirectionUtil_824:
         OOOO〇Ooo〇〇oO〇ooOOOo〇O〇oO〇〇〇〇〇oOOO〇oOo〇oo〇〇〇OO〇oOOOOOoOoooO〇〇OO〇ooO〇OOoo〇oo〇o〇oo〇 = -ㄑㄑㄑくㄑㄑくㄑくㄑㄑㄑくㄑくくくくㄑくくくㄑくㄑくㄑくくくくくㄑㄑくくくくㄑくくくくくㄑㄑㄑくㄑくㄑㄑㄑくㄑㄑくくㄑㄑくくくくくㄑㄑくくくㄑくくくくㄑㄑくくくくくㄑㄑくくくくくく;
         〇Oo〇ooO〇ooO〇o〇O〇oO〇〇oO〇OOoOO〇ooo〇oooO〇OoooOOoO〇O〇oOOo〇Oo〇OOoOo〇oo〇OOO〇〇ooOo〇oOOOO〇oO〇oooOoO〇〇Oo〇 = ㄑㄑㄑくㄑㄑくㄑくㄑㄑㄑくㄑくくくくㄑくくくㄑくㄑくㄑくくくくくㄑㄑくくくくㄑくくくくくㄑㄑㄑくㄑくㄑㄑㄑくㄑㄑくくㄑㄑくくくくくㄑㄑくくくㄑくくくくㄑㄑくくくくくㄑㄑくくくくくく;
      default:
         おおおおああああああおああおああああおあああああああああおおおおあおあおあおおああおあおおあおおああおああおあおおあああおあおあおおおあああおああおおおおおおああおああおおあおおおああおああおあおあ.walkTo(おおおおああああああおああおああああおあああああああああおおおおあおあおあおおああおあおおあおおああおああおあおおあああおあおあおおおあああおああおおおおおおああおああおおあおおおああおああおあおあ.getPlayerPos().add(OOOO〇Ooo〇〇oO〇ooOOOo〇O〇oO〇〇〇〇〇oOOO〇oOo〇oo〇〇〇OO〇oOOOOOoOoooO〇〇OO〇ooO〇OOoo〇oo〇o〇oo〇, おああおおおああおああおあおおおあああおおあおあおあおああああおおああおあああおああおおおあおおああああおおおあおああああおおおあああおおあおあおおおあおあああおあおああああおおあああ, 〇Oo〇ooO〇ooO〇o〇O〇oO〇〇oO〇OOoOO〇ooo〇oooO〇OoooOOoO〇O〇oOOo〇Oo〇OOoOo〇oo〇OOO〇〇ooOo〇oOOOO〇oO〇oooOoO〇〇Oo〇), true);
         sleep(5000);
         sleepUntil(() -> {
            return !BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().isPathing();
         }, 120000);
         BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().forceCancel();
      }
   }

   @EventHandler
   private void render3DEvent(Render3DEvent よよょよょよよよょよよょょよよょよょょよよよよよょょょょよょょょょよよよよょょょ) {
      if (森木森林木木木林木森林林森森木林森森林森森森林林林林森木林木森林森林林森木森林森森木林森林森林木森木森木林森木木林森林林林森林木林林森森森.fd_ArrayList_786 != null && (Boolean)森木森林木木木林木森林林森森木林森森林森森森林林林林森木林木森林森林林森木森林森森木林森林森林木森木森木林森木木林森林林林森林木林林森森森.fd_Setting_763.get()) {
         try {
            森木森林木木木林木森林林森森木林森森林森森森林林林林森木林木森林森林林森木森林森森木林森林森林木森木森木林森木木林森林林林森林木林林森森森.fd_BlockPos_785 = null;

            BlockPos Oo〇〇o〇o〇OO〇〇OoO〇Ooo〇Oo〇o〇OOOOOoOo〇O〇OOooOoO〇〇OOOOOOOOo〇o〇〇OOOo〇OOO〇ooooOOOOo〇oO〇O〇Oo〇〇ooOO〇o〇O〇o〇oO;
            for(Iterator var2 = 森木森林木木木林木森林林森森木林森森林森森森林林林林森木林木森林森林林森木森林森森木林森林森林木森木森木林森木木林森林林林森林木林林森森森.fd_ArrayList_786.iterator(); var2.hasNext(); 森木森林木木木林木森林林森森木林森森林森森森林林林林森木林木森林森林林森木森林森森木林森林森林木森木森木林森木木林森林林林森林木林林森森森.fd_BlockPos_785 = Oo〇〇o〇o〇OO〇〇OoO〇Ooo〇Oo〇o〇OOOOOoOo〇O〇OOooOoO〇〇OOOOOOOOo〇o〇〇OOOo〇OOO〇ooooOOOOo〇oO〇O〇Oo〇〇ooOO〇o〇O〇o〇oO) {
               Oo〇〇o〇o〇OO〇〇OoO〇Ooo〇Oo〇o〇OOOOOoOo〇O〇OOooOoO〇〇OOOOOOOOo〇o〇〇OOOo〇OOO〇ooooOOOOo〇oO〇O〇Oo〇〇ooOO〇o〇O〇o〇oO = (BlockPos)var2.next();
               if (森木森林木木木林木森林林森森木林森森林森森森林林林林森木林木森林森林林森木森林森森木林森林森林木森木森木林森木木林森林林林森林木林林森森森.fd_BlockPos_785 != null) {
                  乀へㇸへㇸㇸ乀ㇸ乀乀ㇸㇸ乀乀ㇸㇸへㇸへへㇸへㇸ乀へ乀へへ乀へへへㇸ乀乀乀ㇸ乀乀へㇸㇸ乀乀へㇸ乀乀ㇸへㇸ乀へ乀乀へ乀ㇸ乀乀へへㇸㇸ乀へ乀乀乀ㇸ乀ㇸ乀乀へへ乀へへへㇸへへへㇸ乀乀ㇸへㇸ.renderer.line((double)Oo〇〇o〇o〇OO〇〇OoO〇Ooo〇Oo〇o〇OOOOOoOo〇O〇OOooOoO〇〇OOOOOOOOo〇o〇〇OOOo〇OOO〇ooooOOOOo〇oO〇O〇Oo〇〇ooOO〇o〇O〇o〇oO.getX() + 0.5D, (double)Oo〇〇o〇o〇OO〇〇OoO〇Ooo〇Oo〇o〇OOOOOoOo〇O〇OOooOoO〇〇OOOOOOOOo〇o〇〇OOOo〇OOO〇ooooOOOOo〇oO〇O〇Oo〇〇ooOO〇o〇O〇o〇oO.getY() + 0.5D, (double)Oo〇〇o〇o〇OO〇〇OoO〇Ooo〇Oo〇o〇OOOOOoOo〇O〇OOooOoO〇〇OOOOOOOOo〇o〇〇OOOo〇OOO〇ooooOOOOo〇oO〇O〇Oo〇〇ooOO〇o〇O〇o〇oO.getZ() + 0.5D, (double)森木森林木木木林木森林林森森木林森森林森森森林林林林森木林木森林森林林森木森林森森木林森林森林木森木森木林森木木林森林林林森林木林林森森森.fd_BlockPos_785.getX() + 0.5D, (double)森木森林木木木林木森林林森森木林森森林森森森林林林林森木林木森林森林林森木森林森森木林森林森林木森木森木林森木木林森林林林森林木林林森森森.fd_BlockPos_785.getY() + 0.5D, (double)森木森林木木木林木森林林森森木林森森林森森森林林林林森木林木森林森林林森木森林森森木林森林森林木森木森木林森木木林森林林林森林木林林森森森.fd_BlockPos_785.getZ() + 0.5D, (Color)森木森林木木木林木森林林森森木林森森林森森森林林林林森木林木森林森林林森木森林森森木林森林森林木森木森木林森木木林森林林林森林木林林森森森.fd_Setting_795.get());
               }
            }
         } catch (Exception var4) {
            森木森林木木木林木森林林森森木林森森林森森森林林林林森木林木森林森林林森木森林森森木林森林森林木森木森木林森木木林森林林林森林木林林森森森.fd_BlockPos_785 = null;
         }
      }

   }

   private BlockPos getPlayerPos() {
      return new BlockPos(o〇Ooo〇〇ooooOOooOOooO〇〇〇〇ooOOOOOoo〇〇o〇〇o〇O〇o〇oo〇ooo〇〇OoO〇〇〇Ooo〇o〇Ooo〇O〇OoO〇O〇oo.mc.player.getX(), o〇Ooo〇〇ooooOOooOOooO〇〇〇〇ooOOOOOoo〇〇o〇〇o〇O〇o〇oo〇ooo〇〇OoO〇〇〇Ooo〇o〇Ooo〇O〇OoO〇O〇oo.mc.player.getY(), o〇Ooo〇〇ooooOOooOOooO〇〇〇〇ooOOOOOoo〇〇o〇〇o〇O〇o〇oo〇ooo〇〇OoO〇〇〇Ooo〇o〇Ooo〇O〇OoO〇O〇oo.mc.player.getZ());
   }

   private void stopEating(int 鬭鬭鬬鬭鬭鬭鬭鬭鬭鬭鬬鬭鬭鬭鬭鬬鬬鬭鬬鬭鬭鬬鬭鬬鬭鬬鬬鬬鬬鬭鬬鬬鬭鬬鬬鬬鬬鬭鬭鬬鬬鬬鬭鬭鬭鬭鬭鬬鬬鬭鬭鬭鬭鬭鬭鬭鬬) {
      InvUtils.swap(ㄑくㄑㄑくㄑくㄑくㄑㄑㄑㄑㄑㄑㄑくくくくㄑㄑ, false);
      ㄑㄑㄑくㄑㄑㄑくくくくㄑくくㄑくくㄑくㄑくㄑくㄑㄑくくくくㄑㄑㄑㄑくㄑくくㄑくくくㄑくㄑくくくㄑㄑㄑㄑくㄑくㄑㄑㄑくくㄑㄑくくㄑㄑ.mc.options.useKey.setPressed(false);
   }

   protected void enableGroundListener() {
      MeteorClient.EVENT_BUS.subscribe(淼淼沝㵘㵘沝水水沝淼沝㵘水水沝㵘㵘㵘㵘水㵘水㵘淼淼水淼㵘㵘㵘水淼淼㵘沝水水水㵘沝沝淼㵘沝沝沝㵘.fd_StaticGroundListener_776);
   }

   @EventHandler
   private void onTick(Pre 垚佳佳茥桂䞨佳㤬烓眭桂晆桂茥晆) {
      if (!ああおあああああおおおおおああお.sSsSSsSssssssS) {
         if ((Boolean)ああおあああああおおおおおああお.fd_Setting_783.get()) {
            ああおあああああおおおおおああお.enableGroundListener();
         }

         ああおあああああおおおおおああお.toggle();
      }

      if (ああおあああああおおおおおああお.fd_boolean_764 && (Boolean)ああおあああああおおおおおああお.fd_Setting_797.get()) {
         FindItemResult ょょよよよよよよょょょょょょよよよょよよょょよょょょょよょょょよょょよよょょよょょよよょょょ = InvUtils.find(new Item[]{Items.TOTEM_OF_UNDYING});
         if (!ょょよよよよよよょょょょょょよよよょよよょょよょょょょよょょょよょょよよょょよょょよよょょょ.found() || ょょよよよよよよょょょょょょよよよょよよょょよょょょょよょょょよょょよよょょよょょよよょょょ.count() < ああおあああああおおおおおああお.fd_int_789) {
            ああおあああああおおおおおああお.warning("Disabling because you've popped a totem.", new Object[0]);
            ああおあああああおおおおおああお.sSsSSsSssssssS = false;
         }
      }

   }

   protected void disableGroundListener() {
      MeteorClient.EVENT_BUS.unsubscribe(シジソツシジソゾゾジソツ.fd_StaticGroundListener_776);
   }

   public BlockPos generateGoalFromDirection(DirectionUtil ㇸ乀ㇸ乀ㇸㇸㇸㇸ乀乀へㇸ乀へ乀ㇸ乀ㇸへㇸㇸへへㇸ乀乀へへ乀へ乀乀へ乀へへ乀乀ㇸへ乀ㇸへㇸへ乀, int ゅゆゅゆゅゅゅゆゆゆゆゆゅゆゅゆゅゅゆゆゆゅゅゆゅゆゅゆゅゆゆゅゅゅゆゅゆゆゆゆゆゅゆゆゆゅゆゆゅゅゅゅゆゆゅゅゆゆゆゆゅゆゅゆゅゅゆゆゅゅゅゅゅゅゆゅゆゆゅゅゅゅゆゅゆゆゆゅゅゆゅゅゆゅゆゆゅゅゅゆゅゅ) {
      double 森森木林森林木木林木森森木木林木森森林森森林木林森林林木木木林森林林林木木森木木林木木林林木林林森森森木木林林森 = QpPpQqpqpPPppQppqqPqpPPpQpQppqPppPPQqPPq.mc.player.getX();
      double ㇸㇸ乀乀乀乀ㇸ乀ㇸㇸ乀乀乀ㇸㇸ乀乀乀ㇸへ乀へㇸ = QpPpQqpqpPPppQppqqPqpPPpQpQppqPppPPQqPPq.mc.player.getY();
      double 淼水沝沝淼淼㵘沝水水沝㵘沝淼㵘沝沝㵘㵘沝㵘㵘㵘沝淼水水㵘水水㵘淼沝沝㵘㵘沝沝水水沝水㵘沝水水㵘淼沝㵘水㵘淼㵘㵘水㵘水沝㵘水水淼淼水沝沝沝淼水淼淼沝沝淼沝㵘㵘㵘淼水水水水㵘㵘沝水㵘沝㵘沝沝淼㵘沝水淼水水㵘 = QpPpQqpqpPPppQppqqPqpPPpQpQppqPppPPQqPPq.mc.player.getZ();
      if (鹅鹅鹅鹅鹅鵞鵞鵞鹅鹅鵞鹅鹅鹅鹅鹅鹅鵞鹅鵞鹅鵞鹅鹅鵞鵞鵞鹅鵞鹅鹅鹅鹅鵞鹅鵞鵞鹅鵞鹅鹅鹅鹅鹅鵞鵞鵞鹅鵞鵞鵞鵞鵞鵞鵞鵞鵞鵞鹅鹅鹅鹅鵞鵞鵞鵞鹅鹅鹅鹅鵞鹅鹅鹅鵞鵞鵞鵞鵞鹅鵞鹅鹅鵞鹅鹅鹅鹅鹅鹅鵞鹅鹅鹅鹅鹅鹅鵞鹅鹅鵞鵞鵞鹅鵞鵞鹅 == DirectionUtil.fd_DirectionUtil_825) {
         return new BlockPos(0.0D, ㇸㇸ乀乀乀乀ㇸ乀ㇸㇸ乀乀乀ㇸㇸ乀乀乀ㇸへ乀へㇸ + (double)ううラうラうラううララうううラうラうラううララううラララうラララううラララううううラううラうラううううララううううラうラうララララううラうううララララうラうララううララううラうううラうララうララうララうラうラううううララうううラうラうううううラララう, 淼水沝沝淼淼㵘沝水水沝㵘沝淼㵘沝沝㵘㵘沝㵘㵘㵘沝淼水水㵘水水㵘淼沝沝㵘㵘沝沝水水沝水㵘沝水水㵘淼沝㵘水㵘淼㵘㵘水㵘水沝㵘水水淼淼水沝沝沝淼水淼淼沝沝淼沝㵘㵘㵘淼水水水水㵘㵘沝水㵘沝㵘沝沝淼㵘沝水淼水水㵘 - 3.0E7D);
      } else if (鹅鹅鹅鹅鹅鵞鵞鵞鹅鹅鵞鹅鹅鹅鹅鹅鹅鵞鹅鵞鹅鵞鹅鹅鵞鵞鵞鹅鵞鹅鹅鹅鹅鵞鹅鵞鵞鹅鵞鹅鹅鹅鹅鹅鵞鵞鵞鹅鵞鵞鵞鵞鵞鵞鵞鵞鵞鵞鹅鹅鹅鹅鵞鵞鵞鵞鹅鹅鹅鹅鵞鹅鹅鹅鵞鵞鵞鵞鵞鹅鵞鹅鹅鵞鹅鹅鹅鹅鹅鹅鵞鹅鹅鹅鹅鹅鹅鵞鹅鹅鵞鵞鵞鹅鵞鵞鹅 == DirectionUtil.fd_DirectionUtil_830) {
         return new BlockPos(0.0D, ㇸㇸ乀乀乀乀ㇸ乀ㇸㇸ乀乀乀ㇸㇸ乀乀乀ㇸへ乀へㇸ + (double)ううラうラうラううララうううラうラうラううララううラララうラララううラララううううラううラうラううううララううううラうラうララララううラうううララララうラうララううララううラうううラうララうララうララうラうラううううララうううラうラうううううラララう, 淼水沝沝淼淼㵘沝水水沝㵘沝淼㵘沝沝㵘㵘沝㵘㵘㵘沝淼水水㵘水水㵘淼沝沝㵘㵘沝沝水水沝水㵘沝水水㵘淼沝㵘水㵘淼㵘㵘水㵘水沝㵘水水淼淼水沝沝沝淼水淼淼沝沝淼沝㵘㵘㵘淼水水水水㵘㵘沝水㵘沝㵘沝沝淼㵘沝水淼水水㵘 + 3.0E7D);
      } else if (鹅鹅鹅鹅鹅鵞鵞鵞鹅鹅鵞鹅鹅鹅鹅鹅鹅鵞鹅鵞鹅鵞鹅鹅鵞鵞鵞鹅鵞鹅鹅鹅鹅鵞鹅鵞鵞鹅鵞鹅鹅鹅鹅鹅鵞鵞鵞鹅鵞鵞鵞鵞鵞鵞鵞鵞鵞鵞鹅鹅鹅鹅鵞鵞鵞鵞鹅鹅鹅鹅鵞鹅鹅鹅鵞鵞鵞鵞鵞鹅鵞鹅鹅鵞鹅鹅鹅鹅鹅鹅鵞鹅鹅鹅鹅鹅鹅鵞鹅鹅鵞鵞鵞鹅鵞鵞鹅 == DirectionUtil.QqqPpqPPQqPPqQQqqPpqQPpppPQqQqpqQQPPQqpqqPqqqPpQQpQPppppQpPpp) {
         return new BlockPos(森森木林森林木木林木森森木木林木森森林森森林木林森林林木木木林森林林林木木森木木林木木林林木林林森森森木木林林森 - 3.0E7D, ㇸㇸ乀乀乀乀ㇸ乀ㇸㇸ乀乀乀ㇸㇸ乀乀乀ㇸへ乀へㇸ + (double)ううラうラうラううララうううラうラうラううララううラララうラララううラララううううラううラうラううううララううううラうラうララララううラうううララララうラうララううララううラうううラうララうララうララうラうラううううララうううラうラうううううラララう, 0.0D);
      } else if (鹅鹅鹅鹅鹅鵞鵞鵞鹅鹅鵞鹅鹅鹅鹅鹅鹅鵞鹅鵞鹅鵞鹅鹅鵞鵞鵞鹅鵞鹅鹅鹅鹅鵞鹅鵞鵞鹅鵞鹅鹅鹅鹅鹅鵞鵞鵞鹅鵞鵞鵞鵞鵞鵞鵞鵞鵞鵞鹅鹅鹅鹅鵞鵞鵞鵞鹅鹅鹅鹅鵞鹅鹅鹅鵞鵞鵞鵞鵞鹅鵞鹅鹅鵞鹅鹅鹅鹅鹅鹅鵞鹅鹅鹅鹅鹅鹅鵞鹅鹅鵞鵞鵞鹅鵞鵞鹅 == DirectionUtil.fd_DirectionUtil_826) {
         return new BlockPos(森森木林森林木木林木森森木木林木森森林森森林木林森林林木木木林森林林林木木森木木林木木林林木林林森森森木木林林森 + 3.0E7D, ㇸㇸ乀乀乀乀ㇸ乀ㇸㇸ乀乀乀ㇸㇸ乀乀乀ㇸへ乀へㇸ + (double)ううラうラうラううララうううラうラうラううララううラララうラララううラララううううラううラうラううううララううううラうラうララララううラうううララララうラうララううララううラうううラうララうララうララうラうラううううララうううラうラうううううラララう, 0.0D);
      } else if (鹅鹅鹅鹅鹅鵞鵞鵞鹅鹅鵞鹅鹅鹅鹅鹅鹅鵞鹅鵞鹅鵞鹅鹅鵞鵞鵞鹅鵞鹅鹅鹅鹅鵞鹅鵞鵞鹅鵞鹅鹅鹅鹅鹅鵞鵞鵞鹅鵞鵞鵞鵞鵞鵞鵞鵞鵞鵞鹅鹅鹅鹅鵞鵞鵞鵞鹅鹅鹅鹅鵞鹅鹅鹅鵞鵞鵞鵞鵞鹅鵞鹅鹅鵞鹅鹅鹅鹅鹅鹅鵞鹅鹅鹅鹅鹅鹅鵞鹅鹅鵞鵞鵞鹅鵞鵞鹅 == DirectionUtil.fd_DirectionUtil_829) {
         return new BlockPos(森森木林森林木木林木森森木木林木森森林森森林木林森林林木木木林森林林林木木森木木林木木林林木林林森森森木木林林森 + 3.0E7D, ㇸㇸ乀乀乀乀ㇸ乀ㇸㇸ乀乀乀ㇸㇸ乀乀乀ㇸへ乀へㇸ + (double)ううラうラうラううララうううラうラうラううララううラララうラララううラララううううラううラうラううううララううううラうラうララララううラうううララララうラうララううララううラうううラうララうララうララうラうラううううララうううラうラうううううラララう, 淼水沝沝淼淼㵘沝水水沝㵘沝淼㵘沝沝㵘㵘沝㵘㵘㵘沝淼水水㵘水水㵘淼沝沝㵘㵘沝沝水水沝水㵘沝水水㵘淼沝㵘水㵘淼㵘㵘水㵘水沝㵘水水淼淼水沝沝沝淼水淼淼沝沝淼沝㵘㵘㵘淼水水水水㵘㵘沝水㵘沝㵘沝沝淼㵘沝水淼水水㵘 + 3.0E7D);
      } else if (鹅鹅鹅鹅鹅鵞鵞鵞鹅鹅鵞鹅鹅鹅鹅鹅鹅鵞鹅鵞鹅鵞鹅鹅鵞鵞鵞鹅鵞鹅鹅鹅鹅鵞鹅鵞鵞鹅鵞鹅鹅鹅鹅鹅鵞鵞鵞鹅鵞鵞鵞鵞鵞鵞鵞鵞鵞鵞鹅鹅鹅鹅鵞鵞鵞鵞鹅鹅鹅鹅鵞鹅鹅鹅鵞鵞鵞鵞鵞鹅鵞鹅鹅鵞鹅鹅鹅鹅鹅鹅鵞鹅鹅鹅鹅鹅鹅鵞鹅鹅鵞鵞鵞鹅鵞鵞鹅 == DirectionUtil.fd_DirectionUtil_831) {
         return new BlockPos(森森木林森林木木林木森森木木林木森森林森森林木林森林林木木木林森林林林木木森木木林木木林林木林林森森森木木林林森 - 3.0E7D, ㇸㇸ乀乀乀乀ㇸ乀ㇸㇸ乀乀乀ㇸㇸ乀乀乀ㇸへ乀へㇸ + (double)ううラうラうラううララうううラうラうラううララううラララうラララううラララううううラううラうラううううララううううラうラうララララううラうううララララうラうララううララううラうううラうララうララうララうラうラううううララうううラうラうううううラララう, 淼水沝沝淼淼㵘沝水水沝㵘沝淼㵘沝沝㵘㵘沝㵘㵘㵘沝淼水水㵘水水㵘淼沝沝㵘㵘沝沝水水沝水㵘沝水水㵘淼沝㵘水㵘淼㵘㵘水㵘水沝㵘水水淼淼水沝沝沝淼水淼淼沝沝淼沝㵘㵘㵘淼水水水水㵘㵘沝水㵘沝㵘沝沝淼㵘沝水淼水水㵘 - 3.0E7D);
      } else {
         return 鹅鹅鹅鹅鹅鵞鵞鵞鹅鹅鵞鹅鹅鹅鹅鹅鹅鵞鹅鵞鹅鵞鹅鹅鵞鵞鵞鹅鵞鹅鹅鹅鹅鵞鹅鵞鵞鹅鵞鹅鹅鹅鹅鹅鵞鵞鵞鹅鵞鵞鵞鵞鵞鵞鵞鵞鵞鵞鹅鹅鹅鹅鵞鵞鵞鵞鹅鹅鹅鹅鵞鹅鹅鹅鵞鵞鵞鵞鵞鹅鵞鹅鹅鵞鹅鹅鹅鹅鹅鹅鵞鹅鹅鹅鹅鹅鹅鵞鹅鹅鵞鵞鵞鹅鵞鵞鹅 == DirectionUtil.ssSSSsSSSSSsSSsssSSsSssSssSSsSSs ? new BlockPos(森森木林森林木木林木森森木木林木森森林森森林木林森林林木木木林森林林林木木森木木林木木林林木林林森森森木木林林森 + 3.0E7D, ㇸㇸ乀乀乀乀ㇸ乀ㇸㇸ乀乀乀ㇸㇸ乀乀乀ㇸへ乀へㇸ + (double)ううラうラうラううララうううラうラうラううララううラララうラララううラララううううラううラうラううううララううううラうラうララララううラうううララララうラうララううララううラうううラうララうララうララうラうラううううララうううラうラうううううラララう, 淼水沝沝淼淼㵘沝水水沝㵘沝淼㵘沝沝㵘㵘沝㵘㵘㵘沝淼水水㵘水水㵘淼沝沝㵘㵘沝沝水水沝水㵘沝水水㵘淼沝㵘水㵘淼㵘㵘水㵘水沝㵘水水淼淼水沝沝沝淼水淼淼沝沝淼沝㵘㵘㵘淼水水水水㵘㵘沝水㵘沝㵘沝沝淼㵘沝水淼水水㵘 - 3.0E7D) : new BlockPos(森森木林森林木木林木森森木木林木森森林森森林木林森林林木木木林森林林林木木森木木林木木林林木林林森森森木木林林森 - 3.0E7D, ㇸㇸ乀乀乀乀ㇸ乀ㇸㇸ乀乀乀ㇸㇸ乀乀乀ㇸへ乀へㇸ + (double)ううラうラうラううララうううラうラうラううララううラララうラララううラララううううラううラうラううううララううううラうラうララララううラうううララララうラうララううララううラうううラうララうララうララうラうラううううララうううラうラうううううラララう, 淼水沝沝淼淼㵘沝水水沝㵘沝淼㵘沝沝㵘㵘沝㵘㵘㵘沝淼水水㵘水水㵘淼沝沝㵘㵘沝沝水水沝水㵘沝水水㵘淼沝㵘水㵘淼㵘㵘水㵘水沝㵘水水淼淼水沝沝沝淼水淼淼沝沝淼沝㵘㵘㵘淼水水水水㵘㵘沝水㵘沝㵘沝沝淼㵘沝水淼水水㵘 + 3.0E7D);
      }
   }

   private void clickOnFirework() {
      if (MeteorClient.mc.player.getMainHandStack().getItem() != Items.FIREWORK_ROCKET) {
         FindItemResult O〇oO〇oooo〇〇ooO〇O〇oOoOoO〇〇〇O〇OO〇o〇〇〇oo〇O〇o〇〇〇O〇〇O〇o〇〇Ooo〇ooo〇ooO = InvUtils.findInHotbar(new Item[]{Items.FIREWORK_ROCKET});
         if (O〇oO〇oooo〇〇ooO〇O〇oOoOoO〇〇〇O〇OO〇o〇〇〇oo〇O〇o〇〇〇O〇〇O〇o〇〇Ooo〇ooo〇ooO.slot() != -1) {
            InvUtils.swap(O〇oO〇oooo〇〇ooO〇O〇oOoOoO〇〇〇O〇OO〇o〇〇〇oo〇O〇o〇〇〇O〇〇O〇o〇〇Ooo〇ooo〇ooO.slot(), false);
         }
      }

      MiscUtil.useItem();
      LijLlLilJLJilLLilJILLLjJIJLIIijJjiJLLLILjJlIjJLlJlLLLlLLjIlJJJiILIILilLIIjLiLlJlJljIIlll.fd_TimerUtil_791.reset();
   }

   public void onActivate() {
      int 徊回佪茴佪茴回佪佪回徊回佪茴茴徊徊回徊回徊回徊徊回佪佪徊回茴茴茴佪徊茴回茴徊茴回茴茴茴徊 = 1;
      ラうララううララララララララううううラうラううううララうううラううううう.fd_String_759 = "Enabled";
      ラうララううララララララララううううラうラううううララうううラううううう.sSsSSsSssssssS = true;
      if (ラうララううララララララララううううラうラううううララうううラううううう.mc.player.getEquippedStack(EquipmentSlot.CHEST).getItem() != Items.ELYTRA) {
         FindItemResult ムㄙㄙㄙㄙムムㄙムㄙㄙムㄙムムムムムムㄙムㄙㄙムムムㄙムㄙㄙㄙムㄙㄙムㄙㄙㄙㄙㄙムムㄙㄙムㄙㄙㄙムㄙㄙムムムムㄙムㄙムムㄙㄙムㄙムㄙムㄙㄙムㄙムムㄙムㄙㄙムㄙムムㄙムムムㄙㄙㄙㄙㄙㄙムムㄙムムㄙㄙㄙムムムムムㄙムㄙムㄙㄙ = InvUtils.find(new Item[]{Items.ELYTRA});
         if (ムㄙㄙㄙㄙムムㄙムㄙㄙムㄙムムムムムムㄙムㄙㄙムムムㄙムㄙㄙㄙムㄙㄙムㄙㄙㄙㄙㄙムムㄙㄙムㄙㄙㄙムㄙㄙムムムムㄙムㄙムムㄙㄙムㄙムㄙムㄙㄙムㄙムムㄙムㄙㄙムㄙムムㄙムムムㄙㄙㄙㄙㄙㄙムムㄙムムㄙㄙㄙムムムムムㄙムㄙムㄙㄙ.found()) {
            InvUtils.move().from(ムㄙㄙㄙㄙムムㄙムㄙㄙムㄙムムムムムムㄙムㄙㄙムムムㄙムㄙㄙㄙムㄙㄙムㄙㄙㄙㄙㄙムムㄙㄙムㄙㄙㄙムㄙㄙムムムムㄙムㄙムムㄙㄙムㄙムㄙムㄙㄙムㄙムムㄙムㄙㄙムㄙムムㄙムムムㄙㄙㄙㄙㄙㄙムムㄙムムㄙㄙㄙムムムムムㄙムㄙムㄙㄙ.slot()).toArmor(2);
         }
      }

      NoFall 壿壿墫墫墫壿壿壿壿壿壿墫壿壿壿壿壿壿墫壿壿壿墫壿墫壿壿壿壿壿壿壿壿壿壿壿壿壿壿墫墫墫墫墫壿墫壿壿墫壿墫壿壿墫墫墫壿壿壿壿壿壿墫墫壿壿墫墫壿壿 = (NoFall)Modules.get().get(NoFall.class);
      if (壿壿墫墫墫壿壿壿壿壿壿墫壿壿壿壿壿壿墫壿壿壿墫壿墫壿壿壿壿壿壿壿壿壿壿壿壿壿壿墫墫墫墫墫壿墫壿壿墫壿墫壿壿墫墫墫壿壿壿壿壿壿墫墫壿壿墫墫壿壿.isActive()) {
         壿壿墫墫墫壿壿壿壿壿壿墫壿壿壿壿壿壿墫壿壿壿墫壿墫壿壿壿壿壿壿壿壿壿壿壿壿壿壿墫墫墫墫墫壿墫壿壿墫壿墫壿壿墫墫墫壿壿壿壿壿壿墫墫壿壿墫墫壿壿.toggle();
         ラうララううララララララララううううラうラううううララうううラううううう.fd_boolean_772 = true;
         ラうララううララララララララううううラうラううううララうううラううううう.warning("NoFall is on, disabling while ElytraBot is active.", new Object[0]);
      }

      FindItemResult りいぃりりぃリリいいいリぃぃいりリぃリリりぃぃリリりりりいリりり = InvUtils.find(new Item[]{Items.TOTEM_OF_UNDYING});
      if (!りいぃりりぃリリいいいリぃぃいりリぃリリりぃぃリリりりりいリりり.found()) {
         ラうララううララララララララううううラうラううううララうううラううううう.fd_boolean_764 = false;
      } else {
         ラうララううララララララララううううラうラううううララうううラううううう.fd_int_789 = りいぃりりぃリリいいいリぃぃいりリぃリリりぃぃリリりりりいリりり.count();
         ラうララううララララララララううううラうラううううララうううラううううう.fd_boolean_764 = true;
      }

      if (ラうララううララララララララううううラうラううううララうううラううううう.fd_BlockPos_788 == null) {
         if (!(Boolean)ラうララううララララララララううううラうラううううララうううラううううう.fd_Setting_801.get()) {
            if (Math.abs(Math.abs(ラうララううララララララララううううラうラううううララうううラううううう.mc.player.getX()) - Math.abs(ラうララううララララララララううううラうラううううララうううラううううう.mc.player.getZ())) <= 5.0D && Math.abs(ラうララううララララララララううううラうラううううララうううラううううう.mc.player.getX()) > 10.0D && Math.abs(ラうララううララララララララううううラうラううううララうううラううううう.mc.player.getZ()) > 10.0D && ラうララううララララララララううううラうラううううララうううラううううう.fd_Setting_769.get() == ElytraBotThreaded.Mode.fd_Mode_812) {
               ラうララううララララララララううううラうラううううララうううラううううう.fd_DirectionUtil_767 = DirectionUtil.getDiagonalDirection();
            } else {
               ラうララううララララララララううううラうラううううララうううラううううう.fd_DirectionUtil_767 = DirectionUtil.getDirection();
            }

            ラうララううララララララララううううラうラううううララうううラううううう.fd_BlockPos_788 = ラうララううララララララララううううラうラううううララうううラううううう.generateGoalFromDirection(ラうララううララララララララううううラうラううううララうううラううううう.fd_DirectionUtil_767, 徊回佪茴佪茴回佪佪回徊回佪茴茴徊徊回徊回徊回徊徊回佪佪徊回茴茴茴佪徊茴回茴徊茴回茴茴茴徊);
            ラうララううララララララララううううラうラううううララうううラううううう.fd_String_773 = ラうララううララララララララううううラうラううううララうううラううううう.fd_DirectionUtil_767.fd_String_827;
         } else {
            ラうララううララララララララううううラうラううううララうううラううううう.fd_int_765 = (Integer)ラうララううララララララララううううラうラううううララうううラううううう.fd_Setting_766.get();
            ラうララううララララララララううううラうラううううララうううラううううう.fd_int_804 = (Integer)ラうララううララララララララううううラうラううううララうううラううううう.fd_Setting_792.get();
            ラうララううララララララララううううラうラううううララうううラううううう.fd_BlockPos_788 = new BlockPos((double)ラうララううララララララララううううラうラううううララうううラううううう.fd_int_765, ラうララううララララララララううううラうラううううララうううラううううう.mc.player.getY() + (double)徊回佪茴佪茴回佪佪回徊回佪茴茴徊徊回徊回徊回徊徊回佪佪徊回茴茴茴佪徊茴回茴徊茴回茴茴茴徊, (double)ラうララううララララララララううううラうラううううララうううラううううう.fd_int_804);
            ラうララううララララララララううううラうラううううララうううラううううう.fd_String_773 = "X: " + ラうララううララララララララううううラうラううううララうううラううううう.fd_int_765 + ", Z: " + ラうララううララララララララううううラうラううううララうううラううううう.fd_int_804;
         }
      }

      ラうララううララララララララううううラうラううううララうううラううううう.fd_Thread_790 = new Thread() {
         public void run() {
            while(ラうララううララララララララううううラうラううううララうううラううううう.fd_Thread_790 != null && ラうララううララララララララううううラうラううううララうううラううううう.fd_Thread_790.equals(圭垚㙓澆洼洼洼澆烓洼土㙓茥垚㙓茥㙓桂圭垚垚圭烓土澆土茥桂洼圭㙓GLOyVPmRFc) && ラうララううララララララララううううラうラううううララうううラううううう.sSsSSsSssssssS) {
               try {
                  ラうララううララララララララううううラうラううううララうううラううううう.loop();
               } catch (NullPointerException var3) {
               }

               try {
                  sleep(50L);
               } catch (InterruptedException var2) {
                  var2.printStackTrace();
               }
            }

         }
      };
      ラうララううララララララララううううラうラううううララうううラううううう.fd_TimerUtil_803.reset();
      ラうララううララララララララううううラうラううううララうううラううううう.fd_Thread_790.start();
   }

   private boolean isNextPathTooFar() {
      try {
         return MiscUtil.distance(ツンシソゾンンソンシンツンヅツシゾゾシツソヅンシシヅソジヅジゾンツンツゾツゾヅソツシゾジジシジヅシツソゾジゾヅツヅヅンツ.getPlayerPos(), (BlockPos)ツンシソゾンンソンシンツンヅツシゾゾシツソヅンシシヅソジヅジゾンツンツゾツゾヅソツシゾジジシジヅシツソゾジゾヅツヅヅンツ.fd_ArrayList_786.get(ツンシソゾンンソンシンツンヅツシゾゾシツソヅンシシヅソジヅジゾンツンツゾツゾヅソツシゾジジシジヅシツソゾジゾヅツヅヅンツ.fd_ArrayList_786.size() - 1)) > 15;
      } catch (Exception var2) {
         return false;
      }
   }

   private void debug(Object SSSSssSSSsssSsSSSSssSssSSSsSSSSs) {
      if ((Boolean)幐幐幐幐㬺幐幐㬺幐㬺㬺.fd_Setting_756.get()) {
         幐幐幐幐㬺幐幐㬺幐㬺㬺.info(String.valueOf(壿墫墫壿墫壿墫墫壿墫壿壿壿墫壿壿墫壿墫墫壿壿壿墫壿墫壿壿墫墫墫墫壿墫壿墫壿墫墫壿壿壿壿壿壿墫墫墫墫壿墫壿壿壿墫墫壿壿壿墫墫壿壿墫墫壿壿壿壿壿壿墫壿墫壿壿墫壿墫墫壿墫墫墫壿墫墫墫墫墫壿壿壿壿墫壿壿墫壿壿壿壿墫壿壿壿壿壿壿墫墫墫墫壿壿壿壿), new Object[0]);
      }

   }

   private class StaticGroundListener {
      @EventHandler
      private void chestSwapGroundListener(PlayerMoveEvent 林森林林木木木林木林林林森森森木木森木森木林林森林森林森木木木林林森木森森森林林森林木林木木林木木森木木森森森木木森林林木木森林木森森木木木森木木森森林木木林森森木森森木森木森林林木木木NWELRUYVyW) {
         if (ElytraBotThreaded.this.mc.player != null && ElytraBotThreaded.this.mc.player.isOnGround() && ElytraBotThreaded.this.mc.player.getEquippedStack(EquipmentSlot.CHEST).getItem() == Items.ELYTRA) {
            ((ChestSwap)Modules.get().get(ChestSwap.class)).swap();
            ElytraBotThreaded.this.disableGroundListener();
         }

      }
   }

   public static enum FlyMode {
      fd_FlyMode_808,
      fd_FlyMode_809;

      // $FF: synthetic method
      private static ElytraBotThreaded.FlyMode[] $values() {
         return new ElytraBotThreaded.FlyMode[]{fd_FlyMode_808, fd_FlyMode_809};
      }
   }

   public static enum TakeoffMode {
      fd_TakeoffMode_815,
      fd_TakeoffMode_816,
      fd_TakeoffMode_817;

      // $FF: synthetic method
      private static ElytraBotThreaded.TakeoffMode[] $values() {
         return new ElytraBotThreaded.TakeoffMode[]{fd_TakeoffMode_817, fd_TakeoffMode_815, fd_TakeoffMode_816};
      }
   }

   public static enum Mode {
      fd_Mode_811,
      fd_Mode_812,
      fd_Mode_813;

      // $FF: synthetic method
      private static ElytraBotThreaded.Mode[] $values() {
         return new ElytraBotThreaded.Mode[]{fd_Mode_812, fd_Mode_813, fd_Mode_811};
      }
   }
}
