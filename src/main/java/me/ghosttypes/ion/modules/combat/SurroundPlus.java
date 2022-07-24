/* Decompiler 75ms, total 265ms, lines 412 */
package me.ghosttypes.ion.modules.combat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import me.ghosttypes.ion.modules.hud.visual.NotificationsHUD;
import me.ghosttypes.ion.modules.render.Notifications.mode;
import me.ghosttypes.ion.utils.Class68;
import me.ghosttypes.ion.utils.player.Class44;
import me.ghosttypes.ion.utils.world.Class57;
import me.ghosttypes.ion.utils.world.Class66;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent.Pre;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.IntSetting.Builder;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.meteorclient.utils.world.BlockUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.block.AbstractButtonBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.network.packet.c2s.play.HandSwingC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.class_2829;

public class SurroundPlus extends Module {
   private final Setting<Boolean> fd_Setting_369;
   private final Setting<Integer> fd_Setting_370;
   private final Setting<Boolean> IlllIjiliLlJlILiJji;
   private int fd_int_371;
   private final SettingGroup fd_SettingGroup_372;
   private final Setting<Boolean> fd_Setting_373;
   private final SettingGroup fd_SettingGroup_374;
   private final ArrayList<Vec3d> fd_ArrayList_375;
   private final Setting<Boolean> fd_Setting_376;
   private final Setting<SettingColor> fd_Setting_377;
   private final Setting<Boolean> fd_Setting_378;
   private final Setting<Boolean> fd_Setting_379;
   private final Setting<Boolean> fd_Setting_380;
   private final ArrayList<Vec3d> fd_ArrayList_381;
   private final Setting<Boolean> fd_Setting_382;
   private final Setting<SettingColor> fd_Setting_383;
   private final Setting<Integer> fd_Setting_384;
   private final Setting<Boolean> fd_Setting_385;
   private final Setting<Boolean> fd_Setting_386;
   private final Setting<Boolean> fd_Setting_387;
   private final Setting<Boolean> fd_Setting_388;
   private final Setting<Integer> fd_Setting_389;
   private final Setting<ShapeMode> sSsssSssSsssSSSsSSsSssSSSSsssSsSSSsSSSSsSsssssSSssSSSSsSSsSsSSsSsssssSSsSSS;
   private int fd_int_390;
   private final Setting<Boolean> pPQQQpqPppqPPpqPPQPqPPppQPPQPqQpqQQPPQPpQpqqpPPqPpqpQqPpQpPQqppqPpqQPQqPQqQP;
   private final ArrayList<Vec3d> fd_ArrayList_391;
   private boolean sSSsssssSSSSsSSsssSsSSssSsSsSSsSSSSssSSs;
   private final Setting<Integer> fd_Setting_392;
   private final Setting<List<Block>> fd_Setting_393;
   private final Setting<Boolean> fd_Setting_394;
   private final Setting<Boolean> SssSsSSsSssSSsssSsSSsSSssSSSsssSssSSsSSsSSSsSSssSsSsSSSSSSssSsssssSssssSsssssSSssss;
   private final Setting<mode> fd_Setting_395;
   private final SettingGroup fd_SettingGroup_396;
   private final Setting<Boolean> fd_Setting_397;

   private boolean isDangerousCrystal(BlockPos ㄑくㄑㄑㄑくㄑㄑくくくくㄑㄑㄑくㄑㄑくㄑㄑくくㄑㄑㄑくくくㄑㄑくㄑㄑくくくくくくくくくくくㄑくㄑㄑㄑㄑㄑㄑㄑくくㄑくㄑくㄑmKQMMjDvxo) {
      BlockPos 乀ㇸへ乀乀へへへへㇸへㇸ乀乀ㇸㇸへ乀ㇸへㇸ乀乀へㇸへへㇸ乀ㇸㇸへㇸㇸㇸへㇸㇸㇸㇸへㇸへ乀ㇸUjamgYMrNw = 乀へㇸㇸㇸ乀ㇸㇸ乀ㇸ乀へ乀乀へへへ乀へㇸㇸㇸへㇸ乀ㇸへへ乀へへㇸへㇸㇸへ乀ㇸへ乀ㇸ乀ㇸㇸ乀ㇸㇸへへ乀へㇸへへへ乀乀乀ㇸ乀ㇸ乀へ乀へㇸ乀乀ㇸへ乀ㇸㇸへㇸㇸ乀ㇸㇸ乀乀ㇸへへへㇸ乀乀へ乀へへ乀へへ乀乀ㇸㇸ乀ㇸ乀乀乀へへ乀へ乀へへへㇸㇸへへㇸㇸjWfuhPEFKR.mc.player.getBlockPos();
      Iterator var3 = 乀へㇸㇸㇸ乀ㇸㇸ乀ㇸ乀へ乀乀へへへ乀へㇸㇸㇸへㇸ乀ㇸへへ乀へへㇸへㇸㇸへ乀ㇸへ乀ㇸ乀ㇸㇸ乀ㇸㇸへへ乀へㇸへへへ乀乀乀ㇸ乀ㇸ乀へ乀へㇸ乀乀ㇸへ乀ㇸㇸへㇸㇸ乀ㇸㇸ乀乀ㇸへへへㇸ乀乀へ乀へへ乀へへ乀乀ㇸㇸ乀ㇸ乀乀乀へへ乀へ乀へへへㇸㇸへへㇸㇸjWfuhPEFKR.getSurrDesign().iterator();

      BlockPos ゆゅゆゅゅゆゆゅゆゅゆゅゆゆゆゆゆゆゅゆゆゆゆゆゅゅゅゅゅゆゅゆFFYyUZlQRr;
      do {
         if (!var3.hasNext()) {
            return false;
         }

         Vec3d 㵘淼水沝㵘㵘淼淼沝淼㵘㵘淼沝水淼㵘淼水水沝沝水㵘淼㵘沝沝水淼水水淼沝水㵘淼㵘㵘沝沝淼淼淼水㵘水㵘淼㵘㵘沝㵘淼㵘沝㵘水沝水淼沝㵘㵘水水淼㵘沝沝水沝㵘水淼水㵘水水㵘淼沝沝水水沝㵘沝水淼水沝沝淼淼淼水㵘wMszvqlYlE = (Vec3d)var3.next();
         ゆゅゆゅゅゆゆゅゆゅゆゅゆゆゆゆゆゆゅゆゆゆゆゆゅゅゅゅゅゆゅゆFFYyUZlQRr = 乀ㇸへ乀乀へへへへㇸへㇸ乀乀ㇸㇸへ乀ㇸへㇸ乀乀へㇸへへㇸ乀ㇸㇸへㇸㇸㇸへㇸㇸㇸㇸへㇸへ乀ㇸUjamgYMrNw.add(㵘淼水沝㵘㵘淼淼沝淼㵘㵘淼沝水淼㵘淼水水沝沝水㵘淼㵘沝沝水淼水水淼沝水㵘淼㵘㵘沝沝淼淼淼水㵘水㵘淼㵘㵘沝㵘淼㵘沝㵘水沝水淼沝㵘㵘水水淼㵘沝沝水沝㵘水淼水㵘水水㵘淼沝沝水水沝㵘沝水淼水沝沝淼淼淼水㵘wMszvqlYlE.x, 㵘淼水沝㵘㵘淼淼沝淼㵘㵘淼沝水淼㵘淼水水沝沝水㵘淼㵘沝沝水淼水水淼沝水㵘淼㵘㵘沝沝淼淼淼水㵘水㵘淼㵘㵘沝㵘淼㵘沝㵘水沝水淼沝㵘㵘水水淼㵘沝沝水沝㵘水淼水㵘水水㵘淼沝沝水水沝㵘沝水淼水沝沝淼淼淼水㵘wMszvqlYlE.y, 㵘淼水沝㵘㵘淼淼沝淼㵘㵘淼沝水淼㵘淼水水沝沝水㵘淼㵘沝沝水淼水水淼沝水㵘淼㵘㵘沝沝淼淼淼水㵘水㵘淼㵘㵘沝㵘淼㵘沝㵘水沝水淼沝㵘㵘水水淼㵘沝沝水沝㵘水淼水㵘水水㵘淼沝沝水水沝㵘沝水淼水沝沝淼淼淼水㵘wMszvqlYlE.z);
      } while(qqQppQQQQqqqPPpPpQQPpQqPqqRGpCszcJSA.equals(ゆゅゆゅゅゆゆゅゆゅゆゅゆゆゆゆゆゆゅゆゆゆゆゆゅゅゅゅゅゆゅゆFFYyUZlQRr) || Class57.distanceBetween(ゆゅゆゅゅゆゆゅゆゅゆゅゆゆゆゆゆゆゅゆゆゆゆゆゅゅゅゅゅゆゅゆFFYyUZlQRr, qqQppQQQQqqqPPpPpQQPpQqPqqRGpCszcJSA) > 2.0D);

      return true;
   }

   public SurroundPlus() {
      super(Class68.fd_Category_1060, "surround-plus", "Surround v2.");
      おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_SettingGroup_372 = おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.settings.getDefaultGroup();
      おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_SettingGroup_374 = おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.settings.createGroup("Protect");
      おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_SettingGroup_396 = おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.settings.createGroup("Render");
      おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_Setting_392 = おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_SettingGroup_372.add(((Builder)((Builder)((Builder)(new Builder()).name("blocks-per-tick")).description("Block placements per tick.")).defaultValue(4)).min(1).sliderMax(10).build());
      おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_Setting_369 = おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_SettingGroup_372.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("double")).description("Place at your feet and head.")).defaultValue(false)).build());
      おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_Setting_373 = おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_SettingGroup_372.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("legacy")).description("For 1.12 servers.")).defaultValue(false)).build());
      おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_Setting_397 = おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_SettingGroup_372.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("extra")).description("Place extra surround blocks.")).defaultValue(false)).build());
      おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_Setting_378 = おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_SettingGroup_372.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("russian")).description("Russian surround.")).defaultValue(false)).build());
      おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_Setting_388 = おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_SettingGroup_372.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("anti-fall")).description("Prevents the block you are standing on from being broken.")).defaultValue(false)).build());
      おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_Setting_386 = おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_SettingGroup_372.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("only-on-ground")).description("Only activate when you're on the ground.")).defaultValue(true)).build());
      おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.pPQQQpqPppqPPpqPPQPqPPppQPPQPqQpqQQPPQPpQpqqpPPqPpqpQqPpQpPQqppqPpqQPQqPQqQP = おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_SettingGroup_372.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("require-sneak")).description("Only activate while you're sneaking.")).defaultValue(false)).build());
      おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_Setting_382 = おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_SettingGroup_372.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("toggle-after")).description("Disable after the surround is complete.")).defaultValue(false)).build());
      おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.IlllIjiliLlJlILiJji = おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_SettingGroup_372.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("center")).description("Center you before starting the surround.")).defaultValue(true)).build());
      おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_Setting_394 = おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_SettingGroup_372.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("toggle-on-jump")).description("Disable if you jump.")).defaultValue(true)).build());
      おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_Setting_379 = おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_SettingGroup_372.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("toggle-on-y-change")).description("Disable if your Y coord changes.")).defaultValue(true)).build());
      おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.SssSsSSsSssSSsssSsSSsSSssSSSsssSssSSsSSsSSSsSSssSsSsSSSSSSssSsssssSssssSsssssSSssss = おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_SettingGroup_372.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("rotate")).description("Rotate on block interactions.")).defaultValue(false)).build());
      おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_Setting_393 = おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_SettingGroup_372.add(((meteordevelopment.meteorclient.settings.BlockListSetting.Builder)((meteordevelopment.meteorclient.settings.BlockListSetting.Builder)((meteordevelopment.meteorclient.settings.BlockListSetting.Builder)(new meteordevelopment.meteorclient.settings.BlockListSetting.Builder()).name("block")).description("What blocks to use for surround.")).defaultValue(Collections.singletonList(Blocks.OBSIDIAN))).filter(おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX::blockFilter).build());
      おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_Setting_395 = おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_SettingGroup_372.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("notification-mode")).description("How notifications are displayed.")).defaultValue(mode.fd_mode_881)).build());
      おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_Setting_387 = おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_SettingGroup_374.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("protect")).description("Protect yourself from surround break/hold.")).defaultValue(false)).build());
      おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_Setting_380 = おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_SettingGroup_374.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("clamp")).description("Attempt to protect from buttons/string breaking your surround.")).defaultValue(false)).build());
      おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_Setting_389 = おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_SettingGroup_372.add(((Builder)((Builder)((Builder)(new Builder()).name("clamp-blocks-per-tick")).description("How many blocks clamp can place per tick.")).defaultValue(3)).min(1).sliderMax(10).build());
      おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_Setting_370 = おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_SettingGroup_374.add(((Builder)((Builder)((Builder)(new Builder()).name("delay")).description("Delay between trying to break dangerous crystals.")).defaultValue(2)).min(1).sliderMax(10).build());
      おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_Setting_384 = おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_SettingGroup_374.add(((Builder)((Builder)((Builder)(new Builder()).name("max-tries")).description("How many times to try protecting your surround before disabling.")).defaultValue(5)).min(1).sliderMax(10).build());
      おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_Setting_385 = おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_SettingGroup_396.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("render")).description("Renders where the surround will be placed.")).defaultValue(true)).build());
      SettingGroup var10001 = おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_SettingGroup_396;
      meteordevelopment.meteorclient.settings.BoolSetting.Builder var10002 = (meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("always")).description("Render the surround blocks after they are placed.")).defaultValue(false);
      Setting var10003 = おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_Setting_385;
      Objects.requireNonNull(var10003);
      おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_Setting_376 = var10001.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)var10002.visible(var10003::get)).build());
      おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.sSsssSssSsssSSSsSSsSssSSSSsssSsSSSsSSSSsSsssssSSssSSSSsSSsSsSSsSsssssSSsSSS = おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_SettingGroup_396.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("shape-mode")).description("How the shapes are rendered.")).defaultValue(ShapeMode.Both)).build());
      おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_Setting_383 = おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_SettingGroup_396.add(((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)(new meteordevelopment.meteorclient.settings.ColorSetting.Builder()).name("side-color")).description("The side color.")).defaultValue(new SettingColor(15, 255, 211, 75))).build());
      おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_Setting_377 = おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_SettingGroup_396.add(((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)(new meteordevelopment.meteorclient.settings.ColorSetting.Builder()).name("line-color")).description("The line color.")).defaultValue(new SettingColor(15, 255, 211))).build());
      おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_ArrayList_391 = new ArrayList<Vec3d>() {
         {
            鬬鬬鬭鬬鬭鬬鬭鬬鬭鬬鬬鬭鬭鬭鬬鬬鬬鬬鬬鬬鬬鬬鬬鬭鬭鬭鬭鬬鬭鬭鬭鬭鬬鬬鬭鬬鬬鬭鬭鬬鬬鬭鬭鬬鬬鬬鬬鬬鬭鬬鬬鬭鬬鬭鬭鬬鬭鬬鬬鬬鬬鬭鬭鬬鬭鬭鬬鬬鬭鬭鬬鬬鬭鬭鬬鬬鬬鬭鬬鬭鬭鬭鬭鬭鬭鬭鬭鬭鬭鬬鬭鬭鬭鬬鬬鬭鬬鬬鬬鬬鬭DWynEStIUE.add(new Vec3d(1.0D, 0.0D, 0.0D));
            鬬鬬鬭鬬鬭鬬鬭鬬鬭鬬鬬鬭鬭鬭鬬鬬鬬鬬鬬鬬鬬鬬鬬鬭鬭鬭鬭鬬鬭鬭鬭鬭鬬鬬鬭鬬鬬鬭鬭鬬鬬鬭鬭鬬鬬鬬鬬鬬鬭鬬鬬鬭鬬鬭鬭鬬鬭鬬鬬鬬鬬鬭鬭鬬鬭鬭鬬鬬鬭鬭鬬鬬鬭鬭鬬鬬鬬鬭鬬鬭鬭鬭鬭鬭鬭鬭鬭鬭鬭鬬鬭鬭鬭鬬鬬鬭鬬鬬鬬鬬鬭DWynEStIUE.add(new Vec3d(-1.0D, 0.0D, 0.0D));
            鬬鬬鬭鬬鬭鬬鬭鬬鬭鬬鬬鬭鬭鬭鬬鬬鬬鬬鬬鬬鬬鬬鬬鬭鬭鬭鬭鬬鬭鬭鬭鬭鬬鬬鬭鬬鬬鬭鬭鬬鬬鬭鬭鬬鬬鬬鬬鬬鬭鬬鬬鬭鬬鬭鬭鬬鬭鬬鬬鬬鬬鬭鬭鬬鬭鬭鬬鬬鬭鬭鬬鬬鬭鬭鬬鬬鬬鬭鬬鬭鬭鬭鬭鬭鬭鬭鬭鬭鬭鬬鬭鬭鬭鬬鬬鬭鬬鬬鬬鬬鬭DWynEStIUE.add(new Vec3d(0.0D, 0.0D, 1.0D));
            鬬鬬鬭鬬鬭鬬鬭鬬鬭鬬鬬鬭鬭鬭鬬鬬鬬鬬鬬鬬鬬鬬鬬鬭鬭鬭鬭鬬鬭鬭鬭鬭鬬鬬鬭鬬鬬鬭鬭鬬鬬鬭鬭鬬鬬鬬鬬鬬鬭鬬鬬鬭鬬鬭鬭鬬鬭鬬鬬鬬鬬鬭鬭鬬鬭鬭鬬鬬鬭鬭鬬鬬鬭鬭鬬鬬鬬鬭鬬鬭鬭鬭鬭鬭鬭鬭鬭鬭鬭鬬鬭鬭鬭鬬鬬鬭鬬鬬鬬鬬鬭DWynEStIUE.add(new Vec3d(0.0D, 0.0D, -1.0D));
            鬬鬬鬭鬬鬭鬬鬭鬬鬭鬬鬬鬭鬭鬭鬬鬬鬬鬬鬬鬬鬬鬬鬬鬭鬭鬭鬭鬬鬭鬭鬭鬭鬬鬬鬭鬬鬬鬭鬭鬬鬬鬭鬭鬬鬬鬬鬬鬬鬭鬬鬬鬭鬬鬭鬭鬬鬭鬬鬬鬬鬬鬭鬭鬬鬭鬭鬬鬬鬭鬭鬬鬬鬭鬭鬬鬬鬬鬭鬬鬭鬭鬭鬭鬭鬭鬭鬭鬭鬭鬬鬭鬭鬭鬬鬬鬭鬬鬬鬬鬬鬭DWynEStIUE.add(new Vec3d(0.0D, 1.0D, 0.0D));
         }
      };
      おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_ArrayList_375 = new ArrayList<Vec3d>() {
         {
            茴佪茴徊回回茴茴回徊回徊徊佪徊回徊回茴茴徊回佪徊徊徊徊茴佪茴徊徊佪佪佪佪佪茴回徊茴回回回茴茴茴茴茴回茴佪佪徊回回徊回茴回佪徊徊RecJdzcggM.add(new Vec3d(1.0D, 0.0D, 0.0D));
            茴佪茴徊回回茴茴回徊回徊徊佪徊回徊回茴茴徊回佪徊徊徊徊茴佪茴徊徊佪佪佪佪佪茴回徊茴回回回茴茴茴茴茴回茴佪佪徊回回徊回茴回佪徊徊RecJdzcggM.add(new Vec3d(-1.0D, 0.0D, 0.0D));
            茴佪茴徊回回茴茴回徊回徊徊佪徊回徊回茴茴徊回佪徊徊徊徊茴佪茴徊徊佪佪佪佪佪茴回徊茴回回回茴茴茴茴茴回茴佪佪徊回回徊回茴回佪徊徊RecJdzcggM.add(new Vec3d(0.0D, 0.0D, 1.0D));
            茴佪茴徊回回茴茴回徊回徊徊佪徊回徊回茴茴徊回佪徊徊徊徊茴佪茴徊徊佪佪佪佪佪茴回徊茴回回回茴茴茴茴茴回茴佪佪徊回回徊回茴回佪徊徊RecJdzcggM.add(new Vec3d(0.0D, 0.0D, -1.0D));
         }
      };
      おあおあおおおおあおあおあおあああおああおおおおおおあおおおおおおおおあおおああおあああおおおあおああおおおおおあおおおああおおああおああおおおああおああおあおおおおおあrNRPwlUbRX.fd_ArrayList_381 = new ArrayList<Vec3d>() {
         {
            鵞鹅鵞鹅鹅鵞鹅鹅鵞鹅鹅鹅鹅鵞鵞鵞鵞鵞鹅鹅鵞鵞鵞鵞鵞鵞鹅鵞鹅鹅鵞鵞鹅鹅鵞鵞鹅鵞鹅鵞鵞鵞鵞鵞鵞鵞鵞鹅鹅鹅鵞鹅鹅鹅鵞鹅鹅鵞鵞鹅鹅鵞鵞鵞鹅鹅鹅鵞鵞鵞鵞鹅鹅鹅鵞鹅鹅鹅鵞鵞鹅鵞鵞鹅鹅鵞鵞鹅鵞鵞鵞鵞鵞鹅鵞鵞鹅鵞鵞鵞鹅鹅鹅鵞鵞鹅鹅鵞鹅鵞鵞鹅鵞鹅鹅鹅BZQSEgNZls.add(new Vec3d(1.0D, 1.0D, 0.0D));
            鵞鹅鵞鹅鹅鵞鹅鹅鵞鹅鹅鹅鹅鵞鵞鵞鵞鵞鹅鹅鵞鵞鵞鵞鵞鵞鹅鵞鹅鹅鵞鵞鹅鹅鵞鵞鹅鵞鹅鵞鵞鵞鵞鵞鵞鵞鵞鹅鹅鹅鵞鹅鹅鹅鵞鹅鹅鵞鵞鹅鹅鵞鵞鵞鹅鹅鹅鵞鵞鵞鵞鹅鹅鹅鵞鹅鹅鹅鵞鵞鹅鵞鵞鹅鹅鵞鵞鹅鵞鵞鵞鵞鵞鹅鵞鵞鹅鵞鵞鵞鹅鹅鹅鵞鵞鹅鹅鵞鹅鵞鵞鹅鵞鹅鹅鹅BZQSEgNZls.add(new Vec3d(-1.0D, 1.0D, 0.0D));
            鵞鹅鵞鹅鹅鵞鹅鹅鵞鹅鹅鹅鹅鵞鵞鵞鵞鵞鹅鹅鵞鵞鵞鵞鵞鵞鹅鵞鹅鹅鵞鵞鹅鹅鵞鵞鹅鵞鹅鵞鵞鵞鵞鵞鵞鵞鵞鹅鹅鹅鵞鹅鹅鹅鵞鹅鹅鵞鵞鹅鹅鵞鵞鵞鹅鹅鹅鵞鵞鵞鵞鹅鹅鹅鵞鹅鹅鹅鵞鵞鹅鵞鵞鹅鹅鵞鵞鹅鵞鵞鵞鵞鵞鹅鵞鵞鹅鵞鵞鵞鹅鹅鹅鵞鵞鹅鹅鵞鹅鵞鵞鹅鵞鹅鹅鹅BZQSEgNZls.add(new Vec3d(0.0D, 1.0D, 1.0D));
            鵞鹅鵞鹅鹅鵞鹅鹅鵞鹅鹅鹅鹅鵞鵞鵞鵞鵞鹅鹅鵞鵞鵞鵞鵞鵞鹅鵞鹅鹅鵞鵞鹅鹅鵞鵞鹅鵞鹅鵞鵞鵞鵞鵞鵞鵞鵞鹅鹅鹅鵞鹅鹅鹅鵞鹅鹅鵞鵞鹅鹅鵞鵞鵞鹅鹅鹅鵞鵞鵞鵞鹅鹅鹅鵞鹅鹅鹅鵞鵞鹅鵞鵞鹅鹅鵞鵞鹅鵞鵞鵞鵞鵞鹅鵞鵞鹅鵞鵞鵞鹅鹅鹅鵞鵞鹅鹅鵞鹅鵞鵞鹅鵞鹅鹅鹅BZQSEgNZls.add(new Vec3d(0.0D, 1.0D, -1.0D));
         }
      };
   }

   private ArrayList<BlockPos> getRussianBlocks() {
      BlockPos 㬺㬺幐㬺幐幐㬺幐㬺幐㬺幐㬺幐幐幐幐幐㬺幐幐㬺幐幐㬺㬺㬺㬺㬺㬺㬺㬺㬺幐㬺㬺幐㬺幐㬺幐㬺幐幐㬺㬺㬺㬺幐幐㬺㬺㬺幐㬺㬺㬺㬺幐幐㬺幐幐幐幐㬺幐㬺㬺幐㬺幐㬺幐㬺幐㬺㬺㬺㬺㬺幐幐㬺幐㬺㬺㬺㬺幐㬺㬺㬺㬺㬺幐hyGsuteLjh = ssssSsSssSSssSSsssssSsSSssssSssSSSsSsSSssssUWjBBVYtFY.mc.player.getBlockPos();
      ArrayList<BlockPos> くくㄑくくㄑㄑㄑくくくㄑㄑㄑㄑㄑㄑくくくㄑㄑくくㄑくくくくくくくくくくくㄑㄑくㄑㄑㄑくくくくㄑくㄑlPMQibfGqU = new ArrayList();
      if ((Boolean)ssssSsSssSSssSSsssssSsSSssssSssSSSsSsSSssssUWjBBVYtFY.fd_Setting_373.get()) {
         くくㄑくくㄑㄑㄑくくくㄑㄑㄑㄑㄑㄑくくくㄑㄑくくㄑくくくくくくくくくくくㄑㄑくㄑㄑㄑくくくくㄑくㄑlPMQibfGqU.add(㬺㬺幐㬺幐幐㬺幐㬺幐㬺幐㬺幐幐幐幐幐㬺幐幐㬺幐幐㬺㬺㬺㬺㬺㬺㬺㬺㬺幐㬺㬺幐㬺幐㬺幐㬺幐幐㬺㬺㬺㬺幐幐㬺㬺㬺幐㬺㬺㬺㬺幐幐㬺幐幐幐幐㬺幐㬺㬺幐㬺幐㬺幐㬺幐㬺㬺㬺㬺㬺幐幐㬺幐㬺㬺㬺㬺幐㬺㬺㬺㬺㬺幐hyGsuteLjh.north().east().down());
         くくㄑくくㄑㄑㄑくくくㄑㄑㄑㄑㄑㄑくくくㄑㄑくくㄑくくくくくくくくくくくㄑㄑくㄑㄑㄑくくくくㄑくㄑlPMQibfGqU.add(㬺㬺幐㬺幐幐㬺幐㬺幐㬺幐㬺幐幐幐幐幐㬺幐幐㬺幐幐㬺㬺㬺㬺㬺㬺㬺㬺㬺幐㬺㬺幐㬺幐㬺幐㬺幐幐㬺㬺㬺㬺幐幐㬺㬺㬺幐㬺㬺㬺㬺幐幐㬺幐幐幐幐㬺幐㬺㬺幐㬺幐㬺幐㬺幐㬺㬺㬺㬺㬺幐幐㬺幐㬺㬺㬺㬺幐㬺㬺㬺㬺㬺幐hyGsuteLjh.east().south().down());
         くくㄑくくㄑㄑㄑくくくㄑㄑㄑㄑㄑㄑくくくㄑㄑくくㄑくくくくくくくくくくくㄑㄑくㄑㄑㄑくくくくㄑくㄑlPMQibfGqU.add(㬺㬺幐㬺幐幐㬺幐㬺幐㬺幐㬺幐幐幐幐幐㬺幐幐㬺幐幐㬺㬺㬺㬺㬺㬺㬺㬺㬺幐㬺㬺幐㬺幐㬺幐㬺幐幐㬺㬺㬺㬺幐幐㬺㬺㬺幐㬺㬺㬺㬺幐幐㬺幐幐幐幐㬺幐㬺㬺幐㬺幐㬺幐㬺幐㬺㬺㬺㬺㬺幐幐㬺幐㬺㬺㬺㬺幐㬺㬺㬺㬺㬺幐hyGsuteLjh.south().west().down());
         くくㄑくくㄑㄑㄑくくくㄑㄑㄑㄑㄑㄑくくくㄑㄑくくㄑくくくくくくくくくくくㄑㄑくㄑㄑㄑくくくくㄑくㄑlPMQibfGqU.add(㬺㬺幐㬺幐幐㬺幐㬺幐㬺幐㬺幐幐幐幐幐㬺幐幐㬺幐幐㬺㬺㬺㬺㬺㬺㬺㬺㬺幐㬺㬺幐㬺幐㬺幐㬺幐幐㬺㬺㬺㬺幐幐㬺㬺㬺幐㬺㬺㬺㬺幐幐㬺幐幐幐幐㬺幐㬺㬺幐㬺幐㬺幐㬺幐㬺㬺㬺㬺㬺幐幐㬺幐㬺㬺㬺㬺幐㬺㬺㬺㬺㬺幐hyGsuteLjh.west().north().down());
      }

      くくㄑくくㄑㄑㄑくくくㄑㄑㄑㄑㄑㄑくくくㄑㄑくくㄑくくくくくくくくくくくㄑㄑくㄑㄑㄑくくくくㄑくㄑlPMQibfGqU.add(㬺㬺幐㬺幐幐㬺幐㬺幐㬺幐㬺幐幐幐幐幐㬺幐幐㬺幐幐㬺㬺㬺㬺㬺㬺㬺㬺㬺幐㬺㬺幐㬺幐㬺幐㬺幐幐㬺㬺㬺㬺幐幐㬺㬺㬺幐㬺㬺㬺㬺幐幐㬺幐幐幐幐㬺幐㬺㬺幐㬺幐㬺幐㬺幐㬺㬺㬺㬺㬺幐幐㬺幐㬺㬺㬺㬺幐㬺㬺㬺㬺㬺幐hyGsuteLjh.north().east());
      くくㄑくくㄑㄑㄑくくくㄑㄑㄑㄑㄑㄑくくくㄑㄑくくㄑくくくくくくくくくくくㄑㄑくㄑㄑㄑくくくくㄑくㄑlPMQibfGqU.add(㬺㬺幐㬺幐幐㬺幐㬺幐㬺幐㬺幐幐幐幐幐㬺幐幐㬺幐幐㬺㬺㬺㬺㬺㬺㬺㬺㬺幐㬺㬺幐㬺幐㬺幐㬺幐幐㬺㬺㬺㬺幐幐㬺㬺㬺幐㬺㬺㬺㬺幐幐㬺幐幐幐幐㬺幐㬺㬺幐㬺幐㬺幐㬺幐㬺㬺㬺㬺㬺幐幐㬺幐㬺㬺㬺㬺幐㬺㬺㬺㬺㬺幐hyGsuteLjh.east().south());
      くくㄑくくㄑㄑㄑくくくㄑㄑㄑㄑㄑㄑくくくㄑㄑくくㄑくくくくくくくくくくくㄑㄑくㄑㄑㄑくくくくㄑくㄑlPMQibfGqU.add(㬺㬺幐㬺幐幐㬺幐㬺幐㬺幐㬺幐幐幐幐幐㬺幐幐㬺幐幐㬺㬺㬺㬺㬺㬺㬺㬺㬺幐㬺㬺幐㬺幐㬺幐㬺幐幐㬺㬺㬺㬺幐幐㬺㬺㬺幐㬺㬺㬺㬺幐幐㬺幐幐幐幐㬺幐㬺㬺幐㬺幐㬺幐㬺幐㬺㬺㬺㬺㬺幐幐㬺幐㬺㬺㬺㬺幐㬺㬺㬺㬺㬺幐hyGsuteLjh.south().west());
      くくㄑくくㄑㄑㄑくくくㄑㄑㄑㄑㄑㄑくくくㄑㄑくくㄑくくくくくくくくくくくㄑㄑくㄑㄑㄑくくくくㄑくㄑlPMQibfGqU.add(㬺㬺幐㬺幐幐㬺幐㬺幐㬺幐㬺幐幐幐幐幐㬺幐幐㬺幐幐㬺㬺㬺㬺㬺㬺㬺㬺㬺幐㬺㬺幐㬺幐㬺幐㬺幐幐㬺㬺㬺㬺幐幐㬺㬺㬺幐㬺㬺㬺㬺幐幐㬺幐幐幐幐㬺幐㬺㬺幐㬺幐㬺幐㬺幐㬺㬺㬺㬺㬺幐幐㬺幐㬺㬺㬺㬺幐㬺㬺㬺㬺㬺幐hyGsuteLjh.west().north());
      return くくㄑくくㄑㄑㄑくくくㄑㄑㄑㄑㄑㄑくくくㄑㄑくくㄑくくくくくくくくくくくㄑㄑくㄑㄑㄑくくくくㄑくㄑlPMQibfGqU;
   }

   public void onActivate() {
      Class66.moduleAuth();
      if ((Boolean)ノメノノノメメメメノノノノノメノメメメノノノメメノノメメノノメノメメメメノメメノノメメメノメメメノノメノメメノノノメxNeBJBxhOt.IlllIjiliLlJlILiJji.get()) {
         PlayerUtils.centerPlayer();
      }

      ノメノノノメメメメノノノノノメノメメメノノノメメノノメメノノメノメメメメノメメノノメメメノメメメノノメノメメノノノメxNeBJBxhOt.fd_int_371 = 0;
      ノメノノノメメメメノノノノノメノメメメノノノメメノノメメノノメノメメメメノメメノノメメメノメメメノノメノメメノノノメxNeBJBxhOt.sSSsssssSSSSsSSsssSsSSssSsSsSSsSSSSssSSs = true;
   }

   @EventHandler
   private void onTick(Pre ㄑくくㄑㄑㄑㄑくㄑㄑㄑㄑくㄑㄑㄑくくㄑㄑくㄑくくくくㄑくくㄑくㄑㄑくくㄑくㄑくくㄑㄑㄑㄑㄑくくくㄑㄑくくくㄑくㄑくくくㄑㄑくㄑㄑくㄑㄑくくㄑくくㄑㄑㄑㄑくㄑくㄑくㄑㄑくくㄑくㄑくㄑくくㄑㄑくくくㄑㄑERYBiIDRlv) {
      int ムムムムムㄙムㄙムムㄙㄙㄙムムㄙムムㄙムムㄙㄙムムㄙㄙムㄙムㄙㄙㄙㄙㄙㄙㄙㄙムㄙムムㄙㄙㄙムㄙムㄙㄙㄙムムㄙムㄙムㄙムムムㄙㄙㄙㄙㄙㄙムムムㄙムㄙㄙムㄙムムㄙㄙムㄙㄙㄙㄙムムムムㄙムムㄙムㄙㄙㄙムムㄙㄙムムムㄙムㄙムㄙhMKyMtsqwL = 0;
      int 茥茥㤬垚垚晆洼㤬佳烓䞨洼垚垚㤬晆䞨茥垚洼眭晆茥茥桂佳晆垚洼垚䞨㤬眭䞨茥䞨洼桂佳茥桂䞨佳烓眭晆烓佳烓眭眭眭佳佳㤬桂佳桂晆眭茥洼佳佳kWmvPJyrgW = 0;
      if ((!(Boolean)へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.fd_Setting_394.get() || !へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.mc.options.jumpKey.isPressed() && !へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.mc.player.input.jumping) && (!(Boolean)へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.fd_Setting_379.get() || へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.mc.player.prevY >= へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.mc.player.getY())) {
         if (!(Boolean)へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.fd_Setting_386.get() || へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.mc.player.isOnGround()) {
            if (!(Boolean)へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.pPQQQpqPppqPPpqPPQPqPPppQPPQPqQpqQQPPQPpQpqqpPPqPpqpQqPpQpPQqppqPpqQPQqPQqQP.get() || へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.mc.options.sneakKey.isPressed()) {
               if ((Boolean)へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.fd_Setting_388.get() && Class57.getBlock(へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.mc.player.getBlockPos().down()) == Blocks.AIR) {
                  へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.mc.player.networkHandler.sendPacket(new class_2829(へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.mc.player.getX(), へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.mc.player.getY() + 1.0D, へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.mc.player.getZ(), false));
                  BlockUtils.place(へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.mc.player.getBlockPos().down(), InvUtils.findInHotbar((ょょょよよよょょよよよょょよよよよょょょよよょょよょょょょよよょょょよょょょよよょょょょよょよよょよよょよょよょょよょょょょよょょょょよよょょよよよよよよよょよょょよょよよょょょょよよょよよよよょよよょよよよょよよよよょょCIpVGhSMmW) -> {
                     return ((List)鵞鹅鹅鹅鹅鹅鵞鵞鹅鵞鵞鹅鵞鵞鹅鹅鹅鹅ZTHjjkNGTV.fd_Setting_393.get()).contains(Block.getBlockFromItem(ょょょよよよょょよよよょょよよよよょょょよよょょよょょょょよよょょょよょょょよよょょょょよょよよょよよょよょよょょよょょょょよょょょょよよょょよよよよよよよょよょょよょよよょょょょよよょよよよよょよよょよよよょよよよよょょCIpVGhSMmW.getItem()));
                  }), (Boolean)へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.SssSsSSsSssSSsssSsSSsSSssSSSsssSssSSsSSsSSSsSSssSsSsSSSSSSssSsssssSssssSsssssSSssss.get(), 100, true);
                  ++ムムムムムㄙムㄙムムㄙㄙㄙムムㄙムムㄙムムㄙㄙムムㄙㄙムㄙムㄙㄙㄙㄙㄙㄙㄙㄙムㄙムムㄙㄙㄙムㄙムㄙㄙㄙムムㄙムㄙムㄙムムムㄙㄙㄙㄙㄙㄙムムムㄙムㄙㄙムㄙムムㄙㄙムㄙㄙㄙㄙムムムムㄙムムㄙムㄙㄙㄙムムㄙㄙムムムㄙムㄙムㄙhMKyMtsqwL;
               }

               Iterator var4;
               BlockPos ラうラうううラうラうううううラうううううラうラううララララうラうラうラうララララうラララララうラララうララううううラううううララうラうラううラうううラうララうラうラううラララううううララうララうううラうララうラうララうララううラうラうううラララううううzdAblcYeSD;
               BlockPos ppQPPqpPppppQpppPpPPqqPQqQPpQQQQqQpPQQqpPpPCPgObXvor;
               Iterator var9;
               Vec3d ssSsSSsssSSSSSsSsSSsSSSSsSssSsSSsSsssSSSsSSSSsSsssSSsssssssSSSsSsSSsssSssSssSsSSSssssSssSsSsSSsssXyTVoCwIPA;
               if (Class57.isVecComplete(へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.getSurrDesign())) {
                  if ((Boolean)へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.fd_Setting_382.get()) {
                     へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.notify("Surround Complete.");
                     へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.toggle();
                  }

                  if ((Boolean)へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.fd_Setting_387.get() && へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.fd_int_371 <= 0 && へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.sSSsssssSSSSsSSsssSsSSssSsSsSSsSSSSssSSs) {
                     へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.fd_int_371 = (Integer)へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.fd_Setting_370.get();
                     var4 = へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.mc.world.getEntities().iterator();

                     while(var4.hasNext()) {
                        Entity 晚晩晩晩晚晩晩晚晩晩晩晩晩晚晩晩mBpzbNWuvJ = (Entity)var4.next();
                        if (晚晩晩晩晚晩晩晚晩晩晩晩晩晚晩晩mBpzbNWuvJ instanceof EndCrystalEntity) {
                           BlockPos sSssssSSsSSsssSssSsssssssSsSSSSSsSSsSSsssSssSsSsssSSSsSSssssSsssSSsSsSSSSSSsSsssSSsSSSsSsSssSSssSsssSSSsssSSsssSSssssSsSSBXOHrRIxJr = 晚晩晩晩晚晩晩晚晩晩晩晩晩晚晩晩mBpzbNWuvJ.getBlockPos();
                           if (へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.isDangerousCrystal(sSssssSSsSSsssSssSsssssssSsSSSSSsSSsSSsssSssSsSsssSSSsSSssssSsssSSsSsSSSSSSsSsssSSsSSSsSsSssSSssSsssSSSsssSSsssSSssssSsSSBXOHrRIxJr)) {
                              へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.mc.player.networkHandler.sendPacket(PlayerInteractEntityC2SPacket.attack(晚晩晩晩晚晩晩晚晩晩晩晩晩晚晩晩mBpzbNWuvJ, へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.mc.player.isSneaking()));
                              へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.mc.getNetworkHandler().sendPacket(new HandSwingC2SPacket(Hand.MAIN_HAND));
                              ++へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.fd_int_390;
                              if (へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.fd_int_390 >= (Integer)へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.fd_Setting_384.get()) {
                                 へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.sSSsssssSSSSsSSsssSsSSssSsSsSSsSSSSssSSs = false;
                              }
                              break;
                           }
                        }
                     }
                  } else {
                     --へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.fd_int_371;
                  }
               } else {
                  ppQPPqpPppppQpppPpPPqqPQqQPpQQQQqQpPQQqpPpPCPgObXvor = へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.mc.player.getBlockPos();
                  var9 = へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.getSurrDesign().iterator();

                  while(var9.hasNext()) {
                     ssSsSSsssSSSSSsSsSSsSSSSsSssSsSSsSsssSSSsSSSSsSsssSSsssssssSSSsSsSSsssSssSssSsSSSssssSssSsSsSSsssXyTVoCwIPA = (Vec3d)var9.next();
                     if (ムムムムムㄙムㄙムムㄙㄙㄙムムㄙムムㄙムムㄙㄙムムㄙㄙムㄙムㄙㄙㄙㄙㄙㄙㄙㄙムㄙムムㄙㄙㄙムㄙムㄙㄙㄙムムㄙムㄙムㄙムムムㄙㄙㄙㄙㄙㄙムムムㄙムㄙㄙムㄙムムㄙㄙムㄙㄙㄙㄙムムムムㄙムムㄙムㄙㄙㄙムムㄙㄙムムムㄙムㄙムㄙhMKyMtsqwL >= (Integer)へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.fd_Setting_392.get()) {
                        return;
                     }

                     ラうラうううラうラうううううラうううううラうラううララララうラうラうラうララララうラララララうラララうララううううラううううララうラうラううラうううラうララうラうラううラララううううララうララうううラうララうラうララうララううラうラうううラララううううzdAblcYeSD = ppQPPqpPppppQpppPpPPqqPQqQPpQQQQqQpPQQqpPpPCPgObXvor.add(ssSsSSsssSSSSSsSsSSsSSSSsSssSsSSsSsssSSSsSSSSsSsssSSsssssssSSSsSsSSsssSssSssSsSSSssssSssSsSsSSsssXyTVoCwIPA.x, ssSsSSsssSSSSSsSsSSsSSSSsSssSsSSsSsssSSSsSSSSsSsssSSsssssssSSSsSsSSsssSssSssSsSSSssssSssSsSsSSsssXyTVoCwIPA.y, ssSsSSsssSSSSSsSsSSsSSSSsSssSsSSsSsssSSSsSSSSsSsssSSsssssssSSSsSsSSsssSssSssSsSSSssssSssSsSsSSsssXyTVoCwIPA.z);
                     if (Class57.getBlock(ラうラうううラうラうううううラうううううラうラううララララうラうラうラうララララうラララララうラララうララううううラううううララうラうラううラうううラうララうラうラううラララううううララうララうううラうララうラうララうララううラうラうううラララううううzdAblcYeSD) == Blocks.AIR) {
                        BlockUtils.place(ラうラうううラうラうううううラうううううラうラううララララうラうラうラうララララうラララララうラララうララううううラううううララうラうラううラうううラうララうラうラううラララううううララうララうううラうララうラうララうララううラうラうううラララううううzdAblcYeSD, InvUtils.findInHotbar((メメノノノノメメメノノノノノメdXwtSwSyCR) -> {
                           return ((List)sssSSSSSsSSSsssSsSsssssSSsSSSsSsSsSSSsssSsSSSSSsssSSSSSSSsSSsSSSSSSSSsssSssSSSSSsSssssSSsSSsSssPuXomyfUIB.fd_Setting_393.get()).contains(Block.getBlockFromItem(メメノノノノメメメノノノノノメdXwtSwSyCR.getItem()));
                        }), (Boolean)へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.SssSsSSsSssSSsssSsSSsSSssSSSsssSssSSsSSsSSSsSSssSsSsSSSSSSssSsssssSssssSsssssSSssss.get(), 100, true);
                        ++ムムムムムㄙムㄙムムㄙㄙㄙムムㄙムムㄙムムㄙㄙムムㄙㄙムㄙムㄙㄙㄙㄙㄙㄙㄙㄙムㄙムムㄙㄙㄙムㄙムㄙㄙㄙムムㄙムㄙムㄙムムムㄙㄙㄙㄙㄙㄙムムムㄙムㄙㄙムㄙムムㄙㄙムㄙㄙㄙㄙムムムムㄙムムㄙムㄙㄙㄙムムㄙㄙムムムㄙムㄙムㄙhMKyMtsqwL;
                     }
                  }
               }

               BlockPos 壿壿墫墫壿壿壿墫墫壿墫壿墫壿壿墫墫壿壿壿壿墫壿墫墫墫壿墫墫壿墫壿壿墫墫墫壿壿壿壿墫壿壿墫壿壿墫壿墫壿壿墫壿墫墫墫墫壿墫壿墫壿墫墫壿墫壿壿墫壿壿墫墫墫墫壿墫壿墫壿壿壿墫壿壿壿墫壿壿墫壿壿壿墫墫墫墫壿墫壿壿壿壿壿壿壿壿壿壿墫壿墫壿墫壿numFRQpwqi;
               if ((Boolean)へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.fd_Setting_397.get()) {
                  var4 = へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.getExtraBlocks().iterator();

                  while(var4.hasNext()) {
                     壿壿墫墫壿壿壿墫墫壿墫壿墫壿壿墫墫壿壿壿壿墫壿墫墫墫壿墫墫壿墫壿壿墫墫墫壿壿壿壿墫壿壿墫壿壿墫壿墫壿壿墫壿墫墫墫墫壿墫壿墫壿墫墫壿墫壿壿墫壿壿墫墫墫墫壿墫壿墫壿壿壿墫壿壿壿墫壿壿墫壿壿壿墫墫墫墫壿墫壿壿壿壿壿壿壿壿壿壿墫壿墫壿墫壿numFRQpwqi = (BlockPos)var4.next();
                     if (ムムムムムㄙムㄙムムㄙㄙㄙムムㄙムムㄙムムㄙㄙムムㄙㄙムㄙムㄙㄙㄙㄙㄙㄙㄙㄙムㄙムムㄙㄙㄙムㄙムㄙㄙㄙムムㄙムㄙムㄙムムムㄙㄙㄙㄙㄙㄙムムムㄙムㄙㄙムㄙムムㄙㄙムㄙㄙㄙㄙムムムムㄙムムㄙムㄙㄙㄙムムㄙㄙムムムㄙムㄙムㄙhMKyMtsqwL >= (Integer)へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.fd_Setting_392.get()) {
                        return;
                     }

                     if (Class57.getBlock(壿壿墫墫壿壿壿墫墫壿墫壿墫壿壿墫墫壿壿壿壿墫壿墫墫墫壿墫墫壿墫壿壿墫墫墫壿壿壿壿墫壿壿墫壿壿墫壿墫壿壿墫壿墫墫墫墫壿墫壿墫壿墫墫壿墫壿壿墫壿壿墫墫墫墫壿墫壿墫壿壿壿墫壿壿壿墫壿壿墫壿壿壿墫墫墫墫壿墫壿壿壿壿壿壿壿壿壿壿墫壿墫壿墫壿numFRQpwqi) == Blocks.AIR) {
                        BlockUtils.place(壿壿墫墫壿壿壿墫墫壿墫壿墫壿壿墫墫壿壿壿壿墫壿墫墫墫壿墫墫壿墫壿壿墫墫墫壿壿壿壿墫壿壿墫壿壿墫壿墫壿壿墫壿墫墫墫墫壿墫壿墫壿墫墫壿墫壿壿墫壿壿墫墫墫墫壿墫壿墫壿壿壿墫壿壿壿墫壿壿墫壿壿壿墫墫墫墫壿墫壿壿壿壿壿壿壿壿壿壿墫壿墫壿墫壿numFRQpwqi, InvUtils.findInHotbar((ゆゅゅゆゅゅゆゅゅゅゅゆゆゆゅゅゅゅゅゆゆゅゆゅゅゆゅゅゆゆゆゅゅゆゆゅゆゆゆゆゆゅゅゆゅゅゆゅゆゅゆゅゅゆゆゆゆゅゅゅゆゅゅゆゆゅゅゆゅゆゆeAhquaBobV) -> {
                           return ((List)幐幐幐㬺幐㬺幐㬺幐幐㬺幐㬺幐幐幐㬺幐幐㬺㬺㬺幐㬺㬺幐㬺㬺㬺㬺㬺幐幐㬺㬺幐幐幐幐㬺幐幐㬺㬺㬺幐幐㬺㬺幐㬺㬺幐㬺幐㬺幐幐㬺幐幐幐㬺幐ClwEzvDZOi.fd_Setting_393.get()).contains(Block.getBlockFromItem(ゆゅゅゆゅゅゆゅゅゅゅゆゆゆゅゅゅゅゅゆゆゅゆゅゅゆゅゅゆゆゆゅゅゆゆゅゆゆゆゆゆゅゅゆゅゅゆゅゆゅゆゅゅゆゆゆゆゅゅゅゆゅゅゆゆゅゅゆゅゆゆeAhquaBobV.getItem()));
                        }), (Boolean)へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.SssSsSSsSssSSsssSsSSsSSssSSSsssSssSSsSSsSSSsSSssSsSsSSSSSSssSsssssSssssSsssssSSssss.get(), 100, true);
                        ++ムムムムムㄙムㄙムムㄙㄙㄙムムㄙムムㄙムムㄙㄙムムㄙㄙムㄙムㄙㄙㄙㄙㄙㄙㄙㄙムㄙムムㄙㄙㄙムㄙムㄙㄙㄙムムㄙムㄙムㄙムムムㄙㄙㄙㄙㄙㄙムムムㄙムㄙㄙムㄙムムㄙㄙムㄙㄙㄙㄙムムムムㄙムムㄙムㄙㄙㄙムムㄙㄙムムムㄙムㄙムㄙhMKyMtsqwL;
                     }
                  }
               }

               if ((Boolean)へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.fd_Setting_378.get()) {
                  var4 = へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.getRussianBlocks().iterator();

                  while(var4.hasNext()) {
                     壿壿墫墫壿壿壿墫墫壿墫壿墫壿壿墫墫壿壿壿壿墫壿墫墫墫壿墫墫壿墫壿壿墫墫墫壿壿壿壿墫壿壿墫壿壿墫壿墫壿壿墫壿墫墫墫墫壿墫壿墫壿墫墫壿墫壿壿墫壿壿墫墫墫墫壿墫壿墫壿壿壿墫壿壿壿墫壿壿墫壿壿壿墫墫墫墫壿墫壿壿壿壿壿壿壿壿壿壿墫壿墫壿墫壿numFRQpwqi = (BlockPos)var4.next();
                     if (ムムムムムㄙムㄙムムㄙㄙㄙムムㄙムムㄙムムㄙㄙムムㄙㄙムㄙムㄙㄙㄙㄙㄙㄙㄙㄙムㄙムムㄙㄙㄙムㄙムㄙㄙㄙムムㄙムㄙムㄙムムムㄙㄙㄙㄙㄙㄙムムムㄙムㄙㄙムㄙムムㄙㄙムㄙㄙㄙㄙムムムムㄙムムㄙムㄙㄙㄙムムㄙㄙムムムㄙムㄙムㄙhMKyMtsqwL >= (Integer)へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.fd_Setting_392.get()) {
                        return;
                     }

                     if (Class57.getBlock(壿壿墫墫壿壿壿墫墫壿墫壿墫壿壿墫墫壿壿壿壿墫壿墫墫墫壿墫墫壿墫壿壿墫墫墫壿壿壿壿墫壿壿墫壿壿墫壿墫壿壿墫壿墫墫墫墫壿墫壿墫壿墫墫壿墫壿壿墫壿壿墫墫墫墫壿墫壿墫壿壿壿墫壿壿壿墫壿壿墫壿壿壿墫墫墫墫壿墫壿壿壿壿壿壿壿壿壿壿墫壿墫壿墫壿numFRQpwqi) == Blocks.AIR) {
                        BlockUtils.place(壿壿墫墫壿壿壿墫墫壿墫壿墫壿壿墫墫壿壿壿壿墫壿墫墫墫壿墫墫壿墫壿壿墫墫墫壿壿壿壿墫壿壿墫壿壿墫壿墫壿壿墫壿墫墫墫墫壿墫壿墫壿墫墫壿墫壿壿墫壿壿墫墫墫墫壿墫壿墫壿壿壿墫壿壿壿墫壿壿墫壿壿壿墫墫墫墫壿墫壿壿壿壿壿壿壿壿壿壿墫壿墫壿墫壿numFRQpwqi, InvUtils.findInHotbar((晚晩晩晩晚晚晚晚晩晚晩晚晚晩晚晚晩晚晚晚晩晚晩晩晚晩晩晚晩晩晩晩晚晚晩晚晚qEgmFUKVVm) -> {
                           return ((List)佪回徊茴茴回徊佪回佪佪回徊回茴茴佪徊茴茴回茴茴茴佪徊徊佪徊茴徊佪DsZfpkGnwW.fd_Setting_393.get()).contains(Block.getBlockFromItem(晚晩晩晩晚晚晚晚晩晚晩晚晚晩晚晚晩晚晚晚晩晚晩晩晚晩晩晚晩晩晩晩晚晚晩晚晚qEgmFUKVVm.getItem()));
                        }), (Boolean)へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.SssSsSSsSssSSsssSsSSsSSssSSSsssSssSSsSSsSSSsSSssSsSsSSSSSSssSsssssSssssSsssssSSssss.get(), 100, true);
                        ++ムムムムムㄙムㄙムムㄙㄙㄙムムㄙムムㄙムムㄙㄙムムㄙㄙムㄙムㄙㄙㄙㄙㄙㄙㄙㄙムㄙムムㄙㄙㄙムㄙムㄙㄙㄙムムㄙムㄙムㄙムムムㄙㄙㄙㄙㄙㄙムムムㄙムㄙㄙムㄙムムㄙㄙムㄙㄙㄙㄙムムムムㄙムムㄙムㄙㄙㄙムムㄙㄙムムムㄙムㄙムㄙhMKyMtsqwL;
                     }
                  }
               }

               if ((Boolean)へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.fd_Setting_387.get() && (Boolean)へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.fd_Setting_380.get()) {
                  ppQPPqpPppppQpppPpPPqqPQqQPpQQQQqQpPQQqpPpPCPgObXvor = へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.getClampPos();
                  if (ppQPPqpPppppQpppPpPPqqPQqQPpQQQQqQpPQQqpPpPCPgObXvor != null) {
                     for(var9 = へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.fd_ArrayList_391.iterator(); var9.hasNext(); ++茥茥㤬垚垚晆洼㤬佳烓䞨洼垚垚㤬晆䞨茥垚洼眭晆茥茥桂佳晆垚洼垚䞨㤬眭䞨茥䞨洼桂佳茥桂䞨佳烓眭晆烓佳烓眭眭眭佳佳㤬桂佳桂晆眭茥洼佳佳kWmvPJyrgW) {
                        ssSsSSsssSSSSSsSsSSsSSSSsSssSsSSsSsssSSSsSSSSsSsssSSsssssssSSSsSsSSsssSssSssSsSSSssssSssSsSsSSsssXyTVoCwIPA = (Vec3d)var9.next();
                        if (茥茥㤬垚垚晆洼㤬佳烓䞨洼垚垚㤬晆䞨茥垚洼眭晆茥茥桂佳晆垚洼垚䞨㤬眭䞨茥䞨洼桂佳茥桂䞨佳烓眭晆烓佳烓眭眭眭佳佳㤬桂佳桂晆眭茥洼佳佳kWmvPJyrgW >= (Integer)へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.fd_Setting_389.get()) {
                           break;
                        }

                        ラうラうううラうラうううううラうううううラうラううララララうラうラうラうララララうラララララうラララうララううううラううううララうラうラううラうううラうララうラうラううラララううううララうララうううラうララうラうララうララううラうラうううラララううううzdAblcYeSD = ppQPPqpPppppQpppPpPPqqPQqQPpQQQQqQpPQQqpPpPCPgObXvor.add(ssSsSSsssSSSSSsSsSSsSSSSsSssSsSSsSsssSSSsSSSSsSsssSSsssssssSSSsSsSSsssSssSssSsSSSssssSssSsSsSSsssXyTVoCwIPA.x, ssSsSSsssSSSSSsSsSSsSSSSsSssSsSSsSsssSSSsSSSSsSsssSSsssssssSSSsSsSSsssSssSssSsSSSssssSssSsSsSSsssXyTVoCwIPA.y, ssSsSSsssSSSSSsSsSSsSSSSsSssSsSSsSsssSSSsSSSSsSsssSSsssssssSSSsSsSSsssSssSssSsSSSssssSssSsSsSSsssXyTVoCwIPA.z);
                        if (Class57.getBlock(ラうラうううラうラうううううラうううううラうラううララララうラうラうラうララララうラララララうラララうララううううラううううララうラうラううラうううラうララうラうラううラララううううララうララうううラうララうラうララうララううラうラうううラララううううzdAblcYeSD) == Blocks.AIR) {
                           BlockUtils.place(ラうラうううラうラうううううラうううううラうラううララララうラうラうラうララララうラララララうラララうララううううラううううララうラうラううラうううラうララうラうラううラララううううララうララうううラうララうラうララうララううラうラうううラララううううzdAblcYeSD, InvUtils.findInHotbar((幐幐㬺幐幐幐㬺㬺㬺幐㬺㬺幐幐㬺㬺㬺幐㬺㬺幐㬺幐㬺㬺㬺㬺㬺㬺幐㬺㬺㬺㬺㬺幐幐幐幐㬺幐幐㬺㬺㬺幐幐㬺幐幐㬺㬺幐幐幐㬺幐幐幐幐㬺㬺㬺幐幐幐幐幐幐幐WAMxCNJjne) -> {
                              return ((List)ぃりリリいいリリリぃいぃぃいリりぃリぃぃりりいりぃりりリりいリリVLXlAsGJWJ.fd_Setting_393.get()).contains(Block.getBlockFromItem(幐幐㬺幐幐幐㬺㬺㬺幐㬺㬺幐幐㬺㬺㬺幐㬺㬺幐㬺幐㬺㬺㬺㬺㬺㬺幐㬺㬺㬺㬺㬺幐幐幐幐㬺幐幐㬺㬺㬺幐幐㬺幐幐㬺㬺幐幐幐㬺幐幐幐幐㬺㬺㬺幐幐幐幐幐幐幐WAMxCNJjne.getItem()));
                           }), (Boolean)へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.SssSsSSsSssSSsssSsSSsSSssSSSsssSssSSsSSsSSSsSSssSsSsSSSSSSssSsssssSssssSsssssSSssss.get(), 100, false);
                        }
                     }
                  }
               }

            }
         }
      } else {
         へへ乀ㇸㇸ乀へ乀へㇸㇸㇸㇸへㇸㇸㇸ乀ㇸ乀へ乀ㇸへへ乀ㇸへㇸへへ乀ㇸㇸへ乀ㇸ乀へ乀乀ㇸㇸへへㇸㇸㇸㇸへへㇸへ乀へㇸㇸへㇸ乀乀乀ㇸへ乀へへへへㇸ乀乀ㇸ乀ㇸへへへ乀乀ㇸ乀へㇸㇸへ乀乀へへㇸㇸㇸㇸへ乀NzseLwZuiS.toggle();
      }
   }

   private BlockPos getClampPos() {
      BlockPos あおおあおああおあおあおおあおおおあああおおおおあああおおおあおあおおおおあおおあおあおおおおおあおああおああおああおおあおおあおおああおおああああおああああおああおおおおおあああおおあおあおおあおあおおおおおおおおおQRzmiYMejf = 木林林木森林森森森森木林木木木林森森木森林森森森木林林木森木木森森林林林木木木木森木木森木森林森林林木森木森木林森木森木木林林木林林林森森林森森森林林森森林auHbEIxyaE.mc.player.getBlockPos();
      Iterator var2 = 木林林木森林森森森森木林木木木林森森木森林森森森木林林木森木木森森林林林木木木木森木木森木森林森林林木森木森木林森木森木木林林木林林林森森林森森森林林森森林auHbEIxyaE.getSurrDesign().iterator();

      BlockPos 沝水淼水沝㵘水水淼㵘淼水淼㵘沝淼㵘水淼淼沝沝淼淼沝水㵘淼水沝㵘沝沝㵘沝㵘㵘沝水沝水水沝沝沝沝水㵘沝㵘淼沝㵘㵘沝㵘㵘水㵘沝沝㵘淼沝㵘水沝水淼淼淼淼水淼淼水沝水淼㵘水水㵘沝沝水㵘水沝淼㵘淼淼㵘㵘水㵘沝qmYkWheaZZ;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         Vec3d リいぃいりリりぃぃいリいぃいリいリりりぃりリリリりいりいいリりリいJTYZcLqIBs = (Vec3d)var2.next();
         沝水淼水沝㵘水水淼㵘淼水淼㵘沝淼㵘水淼淼沝沝淼淼沝水㵘淼水沝㵘沝沝㵘沝㵘㵘沝水沝水水沝沝沝沝水㵘沝㵘淼沝㵘㵘沝㵘㵘水㵘沝沝㵘淼沝㵘水沝水淼淼淼淼水淼淼水沝水淼㵘水水㵘沝沝水㵘水沝淼㵘淼淼㵘㵘水㵘沝qmYkWheaZZ = あおおあおああおあおあおおあおおおあああおおおおあああおおおあおあおおおおあおおあおあおおおおおあおああおああおああおおあおおあおおああおおああああおああああおああおおおおおあああおおあおあおおあおあおおおおおおおおおQRzmiYMejf.add(リいぃいりリりぃぃいリいぃいリいリりりぃりリリリりいりいいリりリいJTYZcLqIBs.x, リいぃいりリりぃぃいリいぃいリいリりりぃりリリリりいりいいリりリいJTYZcLqIBs.y, リいぃいりリりぃぃいリいぃいリいリりりぃりリリリりいりいいリりリいJTYZcLqIBs.z);
      } while(!(Class57.getBlock(沝水淼水沝㵘水水淼㵘淼水淼㵘沝淼㵘水淼淼沝沝淼淼沝水㵘淼水沝㵘沝沝㵘沝㵘㵘沝水沝水水沝沝沝沝水㵘沝㵘淼沝㵘㵘沝㵘㵘水㵘沝沝㵘淼沝㵘水沝水淼淼淼淼水淼淼水沝水淼㵘水水㵘沝沝水㵘水沝淼㵘淼淼㵘㵘水㵘沝qmYkWheaZZ) instanceof AbstractButtonBlock) && !Class44.isWeb(沝水淼水沝㵘水水淼㵘淼水淼㵘沝淼㵘水淼淼沝沝淼淼沝水㵘淼水沝㵘沝沝㵘沝㵘㵘沝水沝水水沝沝沝沝水㵘沝㵘淼沝㵘㵘沝㵘㵘水㵘沝沝㵘淼沝㵘水沝水淼淼淼淼水淼淼水沝水淼㵘水水㵘沝沝水㵘水沝淼㵘淼淼㵘㵘水㵘沝qmYkWheaZZ));

      return 沝水淼水沝㵘水水淼㵘淼水淼㵘沝淼㵘水淼淼沝沝淼淼沝水㵘淼水沝㵘沝沝㵘沝㵘㵘沝水沝水水沝沝沝沝水㵘沝㵘淼沝㵘㵘沝㵘㵘水㵘沝沝㵘淼沝㵘水沝水淼淼淼淼水淼淼水沝水淼㵘水水㵘沝沝水㵘水沝淼㵘淼淼㵘㵘水㵘沝qmYkWheaZZ;
   }

   private void notify(String llJJIjjLjIilijJiLjiJlJllJJIJlliiJlJLJIilJJJiiJIlillJiJiIjJilLLLJiJJLjIiILllJJLLiLljIIjlIiIinYExprIbBC) {
      String ゆゅゆゆゆゅゅゆゆゆゆゅゅゅゅゆゅゆゆゆゅゅゆゆゆゆゅゆゅゆゅゅゅゅゅゅゅゆゆゅゅゆゅゅゆゅゆゆゅゅゅゅゆゅゆゆゅゅゅゅゆゅゅゆゆゆゅゅゅゅゅゆゆVSMSQabiuL = "[" + ㄑくㄑㄑㄑㄑㄑㄑㄑくくくㄑㄑくくくㄑㄑㄑㄑㄑくㄑくㄑㄑㄑㄑㄑくㄑㄑくくくくくㄑㄑㄑくㄑㄑㄑくくㄑくくㄑくくくくㄑくくくくㄑくくㄑㄑくくㄑくㄑくㄑㄑくくくくくくaxwjMexFCZ.name + "] ";
      switch((mode)ㄑくㄑㄑㄑㄑㄑㄑㄑくくくㄑㄑくくくㄑㄑㄑㄑㄑくㄑくㄑㄑㄑㄑㄑくㄑㄑくくくくくㄑㄑㄑくㄑㄑㄑくくㄑくくㄑくくくくㄑくくくくㄑくくㄑㄑくくㄑくㄑくㄑㄑくくくくくくaxwjMexFCZ.fd_Setting_395.get()) {
      case fd_mode_881:
         ㄑくㄑㄑㄑㄑㄑㄑㄑくくくㄑㄑくくくㄑㄑㄑㄑㄑくㄑくㄑㄑㄑㄑㄑくㄑㄑくくくくくㄑㄑㄑくㄑㄑㄑくくㄑくくㄑくくくくㄑくくくくㄑくくㄑㄑくくㄑくㄑくㄑㄑくくくくくくaxwjMexFCZ.info(うラうララうラううラうラララララううSyoeUnjwWw, new Object[0]);
         break;
      case fd_mode_883:
         NotificationsHUD.addNotification(ゆゅゆゆゆゅゅゆゆゆゆゅゅゅゅゆゅゆゆゆゅゅゆゆゆゆゅゆゅゆゅゅゅゅゅゅゅゆゆゅゅゆゅゅゆゅゆゆゅゅゅゅゆゅゆゆゅゅゅゅゆゅゅゆゆゆゅゅゅゅゅゆゆVSMSQabiuL + うラうララうラううラうラララララううSyoeUnjwWw);
      }

   }

   private ArrayList<BlockPos> getExtraBlocks() {
      ArrayList<BlockPos> 㙓茥桂垚烓垚土澆烓㙓㙓圭土土㙓烓㙓洼桂㙓㙓土澆垚㙓澆㙓烓洼圭土茥烓洼茥土洼烓烓桂澆澆CnvvKaFdgh = new ArrayList();
      BlockPos 茴回茴徊回茴徊茴回佪茴佪茴回徊徊佪佪回佪佪徊茴佪佪佪徊徊徊茴佪佪回回茴茴佪佪徊佪佪茴佪徊佪回佪茴茴茴茴茴徊回徊茴回佪回茴徊茴茴回茴DDSExiTSAj = 䞨䞨茥桂眭垚垚㤬晆㤬㤬洼茥洼䞨洼䞨䞨佳㤬茥䞨眭烓洼桂烓烓晆洼䞨垚烓洼佳佳烓茥晆眭晆晆㤬烓桂眭䞨晆㤬垚㤬洼佳烓佳㤬眭洼烓洼䞨垚茥烓佳烓䞨晆茥烓䞨垚㤬洼眭眭眭桂茥晆䞨眭垚㤬佳垚眭䞨垚洼䞨眭晆茥㤬眭眭佳桂茥垚眭㤬桂烓洼䞨眭眭㤬眭㤬桂䞨垚烓茥䞨烓佳桂烓烓GhZNCVxErP.mc.player.getBlockPos();
      if ((Boolean)䞨䞨茥桂眭垚垚㤬晆㤬㤬洼茥洼䞨洼䞨䞨佳㤬茥䞨眭烓洼桂烓烓晆洼䞨垚烓洼佳佳烓茥晆眭晆晆㤬烓桂眭䞨晆㤬垚㤬洼佳烓佳㤬眭洼烓洼䞨垚茥烓佳烓䞨晆茥烓䞨垚㤬洼眭眭眭桂茥晆䞨眭垚㤬佳垚眭䞨垚洼䞨眭晆茥㤬眭眭佳桂茥垚眭㤬桂烓洼䞨眭眭㤬眭㤬桂䞨垚烓茥䞨烓佳桂烓烓GhZNCVxErP.fd_Setting_373.get()) {
         㙓茥桂垚烓垚土澆烓㙓㙓圭土土㙓烓㙓洼桂㙓㙓土澆垚㙓澆㙓烓洼圭土茥烓洼茥土洼烓烓桂澆澆CnvvKaFdgh.add(茴回茴徊回茴徊茴回佪茴佪茴回徊徊佪佪回佪佪徊茴佪佪佪徊徊徊茴佪佪回回茴茴佪佪徊佪佪茴佪徊佪回佪茴茴茴茴茴徊回徊茴回佪回茴徊茴茴回茴DDSExiTSAj.north(2).down());
         㙓茥桂垚烓垚土澆烓㙓㙓圭土土㙓烓㙓洼桂㙓㙓土澆垚㙓澆㙓烓洼圭土茥烓洼茥土洼烓烓桂澆澆CnvvKaFdgh.add(茴回茴徊回茴徊茴回佪茴佪茴回徊徊佪佪回佪佪徊茴佪佪佪徊徊徊茴佪佪回回茴茴佪佪徊佪佪茴佪徊佪回佪茴茴茴茴茴徊回徊茴回佪回茴徊茴茴回茴DDSExiTSAj.south(2).down());
         㙓茥桂垚烓垚土澆烓㙓㙓圭土土㙓烓㙓洼桂㙓㙓土澆垚㙓澆㙓烓洼圭土茥烓洼茥土洼烓烓桂澆澆CnvvKaFdgh.add(茴回茴徊回茴徊茴回佪茴佪茴回徊徊佪佪回佪佪徊茴佪佪佪徊徊徊茴佪佪回回茴茴佪佪徊佪佪茴佪徊佪回佪茴茴茴茴茴徊回徊茴回佪回茴徊茴茴回茴DDSExiTSAj.east(2).down());
         㙓茥桂垚烓垚土澆烓㙓㙓圭土土㙓烓㙓洼桂㙓㙓土澆垚㙓澆㙓烓洼圭土茥烓洼茥土洼烓烓桂澆澆CnvvKaFdgh.add(茴回茴徊回茴徊茴回佪茴佪茴回徊徊佪佪回佪佪徊茴佪佪佪徊徊徊茴佪佪回回茴茴佪佪徊佪佪茴佪徊佪回佪茴茴茴茴茴徊回徊茴回佪回茴徊茴茴回茴DDSExiTSAj.west(2).down());
      }

      㙓茥桂垚烓垚土澆烓㙓㙓圭土土㙓烓㙓洼桂㙓㙓土澆垚㙓澆㙓烓洼圭土茥烓洼茥土洼烓烓桂澆澆CnvvKaFdgh.add(茴回茴徊回茴徊茴回佪茴佪茴回徊徊佪佪回佪佪徊茴佪佪佪徊徊徊茴佪佪回回茴茴佪佪徊佪佪茴佪徊佪回佪茴茴茴茴茴徊回徊茴回佪回茴徊茴茴回茴DDSExiTSAj.north(2));
      㙓茥桂垚烓垚土澆烓㙓㙓圭土土㙓烓㙓洼桂㙓㙓土澆垚㙓澆㙓烓洼圭土茥烓洼茥土洼烓烓桂澆澆CnvvKaFdgh.add(茴回茴徊回茴徊茴回佪茴佪茴回徊徊佪佪回佪佪徊茴佪佪佪徊徊徊茴佪佪回回茴茴佪佪徊佪佪茴佪徊佪回佪茴茴茴茴茴徊回徊茴回佪回茴徊茴茴回茴DDSExiTSAj.south(2));
      㙓茥桂垚烓垚土澆烓㙓㙓圭土土㙓烓㙓洼桂㙓㙓土澆垚㙓澆㙓烓洼圭土茥烓洼茥土洼烓烓桂澆澆CnvvKaFdgh.add(茴回茴徊回茴徊茴回佪茴佪茴回徊徊佪佪回佪佪徊茴佪佪佪徊徊徊茴佪佪回回茴茴佪佪徊佪佪茴佪徊佪回佪茴茴茴茴茴徊回徊茴回佪回茴徊茴茴回茴DDSExiTSAj.east(2));
      㙓茥桂垚烓垚土澆烓㙓㙓圭土土㙓烓㙓洼桂㙓㙓土澆垚㙓澆㙓烓洼圭土茥烓洼茥土洼烓烓桂澆澆CnvvKaFdgh.add(茴回茴徊回茴徊茴回佪茴佪茴回徊徊佪佪回佪佪徊茴佪佪佪徊徊徊茴佪佪回回茴茴佪佪徊佪佪茴佪徊佪回佪茴茴茴茴茴徊回徊茴回佪回茴徊茴茴回茴DDSExiTSAj.west(2));
      return 㙓茥桂垚烓垚土澆烓㙓㙓圭土土㙓烓㙓洼桂㙓㙓土澆垚㙓澆㙓烓洼圭土茥烓洼茥土洼烓烓桂澆澆CnvvKaFdgh;
   }

   @EventHandler
   private void onRender(Render3DEvent Oo〇o〇〇OOoo〇〇〇Oooo〇〇OOoOo〇Oo〇o〇O〇o〇OoO〇〇Oo〇Oo〇〇〇O〇OO〇〇Oo〇ooO〇〇〇〇O〇〇ooooo〇oOo〇〇OOOo〇OoOoWhDlAEsRWF) {
      if ((Boolean)ㄑㄑくㄑくㄑㄑくくくくㄑㄑㄑrZsHxvOpLI.fd_Setting_385.get()) {
         BlockPos 燚炎欻炎火炎欻欻焱炎炎炏火焱焱火火燚炏火焱燚炏火炏燚欻炎欻火焱燚燚炏火炎炎燚欻炏炏焱欻燚燚火焱火焱焱炎火炏燚炏火炎焱火炎焱火炎炎funIMeDZuT = ㄑㄑくㄑくㄑㄑくくくくㄑㄑㄑrZsHxvOpLI.mc.player.getBlockPos();
         Iterator var3 = ㄑㄑくㄑくㄑㄑくくくくㄑㄑㄑrZsHxvOpLI.getSurrDesign().iterator();

         while(var3.hasNext()) {
            Vec3d 鬬鬬鬭鬭鬭鬭鬬鬭鬬鬬鬭鬬鬭鬭鬬鬭鬬鬭鬭鬭鬭鬭鬭鬭鬬鬭鬬鬭鬬鬭鬭鬭鬭鬬鬬鬬鬬鬭IKlFUbtCRH = (Vec3d)var3.next();
            BlockPos あおあああおおあおおおあおおおあおおああおあおあああおああおあああおあおおあおああおあおあああおおあああおあおああおああおあああおおああおおおおあおおおおああおおおおあおおあおおああおあおおおあおあおおああおloJnSsntwy = 燚炎欻炎火炎欻欻焱炎炎炏火焱焱火火燚炏火焱燚炏火炏燚欻炎欻火焱燚燚炏火炎炎燚欻炏炏焱欻燚燚火焱火焱焱炎火炏燚炏火炎焱火炎焱火炎炎funIMeDZuT.add(鬬鬬鬭鬭鬭鬭鬬鬭鬬鬬鬭鬬鬭鬭鬬鬭鬬鬭鬭鬭鬭鬭鬭鬭鬬鬭鬬鬭鬬鬭鬭鬭鬭鬬鬬鬬鬬鬭IKlFUbtCRH.x, 鬬鬬鬭鬭鬭鬭鬬鬭鬬鬬鬭鬬鬭鬭鬬鬭鬬鬭鬭鬭鬭鬭鬭鬭鬬鬭鬬鬭鬬鬭鬭鬭鬭鬬鬬鬬鬬鬭IKlFUbtCRH.y, 鬬鬬鬭鬭鬭鬭鬬鬭鬬鬬鬭鬬鬭鬭鬬鬭鬬鬭鬭鬭鬭鬭鬭鬭鬬鬭鬬鬭鬬鬭鬭鬭鬭鬬鬬鬬鬬鬭IKlFUbtCRH.z);
            if (Class57.getBlock(あおあああおおあおおおあおおおあおおああおあおあああおああおあああおあおおあおああおあおあああおおあああおあおああおああおあああおおああおおおおあおおおおああおおおおあおおあおおああおあおおおあおあおおああおloJnSsntwy) == Blocks.AIR) {
               㬺幐㬺㬺㬺㬺幐㬺㬺㬺㬺㬺㬺㬺㬺幐幐㬺㬺㬺幐㬺幐㬺㬺㬺幐JhxlEQMXrJ.renderer.box(あおあああおおあおおおあおおおあおおああおあおあああおああおあああおあおおあおああおあおあああおおあああおあおああおああおあああおおああおおおおあおおおおああおおおおあおおあおおああおあおおおあおあおおああおloJnSsntwy, (Color)ㄑㄑくㄑくㄑㄑくくくくㄑㄑㄑrZsHxvOpLI.fd_Setting_383.get(), (Color)ㄑㄑくㄑくㄑㄑくくくくㄑㄑㄑrZsHxvOpLI.fd_Setting_377.get(), (ShapeMode)ㄑㄑくㄑくㄑㄑくくくくㄑㄑㄑrZsHxvOpLI.sSsssSssSsssSSSsSSsSssSSSSsssSsSSSsSSSSsSsssssSSssSSSSsSSsSsSSsSsssssSSsSSS.get(), 0);
            }

            if ((Boolean)ㄑㄑくㄑくㄑㄑくくくくㄑㄑㄑrZsHxvOpLI.fd_Setting_376.get()) {
               㬺幐㬺㬺㬺㬺幐㬺㬺㬺㬺㬺㬺㬺㬺幐幐㬺㬺㬺幐㬺幐㬺㬺㬺幐JhxlEQMXrJ.renderer.box(あおあああおおあおおおあおおおあおおああおあおあああおああおあああおあおおあおああおあおあああおおあああおあおああおああおあああおおああおおおおあおおおおああおおおおあおおあおおああおあおおおあおあおおああおloJnSsntwy, (Color)ㄑㄑくㄑくㄑㄑくくくくㄑㄑㄑrZsHxvOpLI.fd_Setting_383.get(), (Color)ㄑㄑくㄑくㄑㄑくくくくㄑㄑㄑrZsHxvOpLI.fd_Setting_377.get(), (ShapeMode)ㄑㄑくㄑくㄑㄑくくくくㄑㄑㄑrZsHxvOpLI.sSsssSssSsssSSSsSSsSssSSSSsssSsSSSsSSSSsSsssssSSssSSSSsSSsSsSSsSsssssSSsSSS.get(), 0);
            }
         }
      }

   }

   private boolean blockFilter(Block 乀へㇸㇸㇸ乀へへㇸへへ乀乀ㇸ乀へへへ乀ㇸへへ乀ㇸ乀へへㇸㇸへへ乀乀乀ㇸㇸㇸ乀ㇸㇸへ乀へへㇸㇸへㇸㇸㇸへ乀ㇸへへㇸㇸへへへㇸㇸ乀乀乀乀乀ㇸ乀ㇸ乀乀乀乀乀乀ㇸㇸへへㇸㇸへㇸㇸ乀へㇸ乀へへへ乀乀ㇸへへㇸ乀ㇸ乀へへへ乀乀乀ㇸへ乀乀ㇸ乀へㇸcOiCoxXXUc) {
      return 森木森林森林林林林森森森森林森木木木森木森木森木木林木森林木木林森林林林森森森木森森XdzSfTHsWZ == Blocks.OBSIDIAN || 森木森林森林林林林森森森森林森木木木森木森木森木木林木森林木木林森林林林森森森木森森XdzSfTHsWZ == Blocks.CRYING_OBSIDIAN || 森木森林森林林林林森森森森林森木木木森木森木森木木林木森林木木林森林林林森森森木森森XdzSfTHsWZ == Blocks.NETHERITE_BLOCK || 森木森林森林林林林森森森森林森木木木森木森木森木木林木森林木木林森林林林森森森木森森XdzSfTHsWZ == Blocks.ENDER_CHEST || 森木森林森林林林林森森森森林森木木木森木森木森木木林木森林木木林森林林林森森森木森森XdzSfTHsWZ == Blocks.RESPAWN_ANCHOR;
   }

   private ArrayList<Vec3d> getSurrDesign() {
      ArrayList<Vec3d> 茴佪徊回茴回徊佪佪徊佪回茴徊茴回回佪徊茴回回徊回佪茴茴佪徊dkUAAvBjWc = new ArrayList();
      Iterator var2;
      Vec3d 垚土圭烓垚澆土圭土圭澆土LRbaEBxMHK;
      if ((Boolean)ㇸ乀ㇸㇸㇸㇸ乀乀へㇸㇸㇸ乀へへ乀乀へへㇸㇸㇸㇸㇸㇸへㇸㇸ乀乀乀へ乀乀へㇸへへへㇸveFnicblXz.fd_Setting_373.get()) {
         var2 = ㇸ乀ㇸㇸㇸㇸ乀乀へㇸㇸㇸ乀へへ乀乀へへㇸㇸㇸㇸㇸㇸへㇸㇸ乀乀乀へ乀乀へㇸへへへㇸveFnicblXz.fd_ArrayList_375.iterator();

         while(var2.hasNext()) {
            垚土圭烓垚澆土圭土圭澆土LRbaEBxMHK = (Vec3d)var2.next();
            茴佪徊回茴回徊佪佪徊佪回茴徊茴回回佪徊茴回回徊回佪茴茴佪徊dkUAAvBjWc.add(垚土圭烓垚澆土圭土圭澆土LRbaEBxMHK.add(0.0D, -1.0D, 0.0D));
         }
      }

      茴佪徊回茴回徊佪佪徊佪回茴徊茴回回佪徊茴回回徊回佪茴茴佪徊dkUAAvBjWc.addAll(ㇸ乀ㇸㇸㇸㇸ乀乀へㇸㇸㇸ乀へへ乀乀へへㇸㇸㇸㇸㇸㇸへㇸㇸ乀乀乀へ乀乀へㇸへへへㇸveFnicblXz.fd_ArrayList_375);
      if ((Boolean)ㇸ乀ㇸㇸㇸㇸ乀乀へㇸㇸㇸ乀へへ乀乀へへㇸㇸㇸㇸㇸㇸへㇸㇸ乀乀乀へ乀乀へㇸへへへㇸveFnicblXz.fd_Setting_369.get()) {
         if ((Boolean)ㇸ乀ㇸㇸㇸㇸ乀乀へㇸㇸㇸ乀へへ乀乀へへㇸㇸㇸㇸㇸㇸへㇸㇸ乀乀乀へ乀乀へㇸへへへㇸveFnicblXz.fd_Setting_373.get()) {
            var2 = ㇸ乀ㇸㇸㇸㇸ乀乀へㇸㇸㇸ乀へへ乀乀へへㇸㇸㇸㇸㇸㇸへㇸㇸ乀乀乀へ乀乀へㇸへへへㇸveFnicblXz.fd_ArrayList_381.iterator();

            while(var2.hasNext()) {
               垚土圭烓垚澆土圭土圭澆土LRbaEBxMHK = (Vec3d)var2.next();
               茴佪徊回茴回徊佪佪徊佪回茴徊茴回回佪徊茴回回徊回佪茴茴佪徊dkUAAvBjWc.add(垚土圭烓垚澆土圭土圭澆土LRbaEBxMHK.add(0.0D, -1.0D, 0.0D));
            }
         }

         茴佪徊回茴回徊佪佪徊佪回茴徊茴回回佪徊茴回回徊回佪茴茴佪徊dkUAAvBjWc.addAll(ㇸ乀ㇸㇸㇸㇸ乀乀へㇸㇸㇸ乀へへ乀乀へへㇸㇸㇸㇸㇸㇸへㇸㇸ乀乀乀へ乀乀へㇸへへへㇸveFnicblXz.fd_ArrayList_381);
      }

      return 茴佪徊回茴回徊佪佪徊佪回茴徊茴回回佪徊茴回回徊回佪茴茴佪徊dkUAAvBjWc;
   }
}
