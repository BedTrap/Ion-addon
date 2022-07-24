/* Decompiler 39ms, total 199ms, lines 182 */
package me.ghosttypes.ion.modules.combat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.ghosttypes.ion.modules.render.Notifications.mode;
import me.ghosttypes.ion.utils.Class68;
import me.ghosttypes.ion.utils.sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS;
import me.ghosttypes.ion.utils.world.Class57;
import me.ghosttypes.ion.utils.world.Class66;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent.Pre;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.EnumSetting.Builder;
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
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.network.packet.c2s.play.HandSwingC2SPacket;

public class SelfTrapPlus extends Module {
   private final Setting<ShapeMode> fd_Setting_290;
   private final List<BlockPos> fd_List_291;
   private final Setting<Integer> qqqqPppQpPQpppPPQpqQPPPPQpqPQpqQPPPqpPQQqpPQpPqqQPqQpPpqqPQQqpQQPpppq;
   private final Setting<Boolean> fd_Setting_292;
   private BlockPos ssSsSSsssSSSSSsSsSSsSSSSsSssSsSSsSsssSSSsSSSSsSsssSSsssssssSSSsSsSSsssSssSssSsSSSssssSssSsSsSSsss;
   private final Setting<Boolean> fd_Setting_293;
   private final SettingGroup fd_SettingGroup_294;
   private final Setting<SettingColor> fd_Setting_295;
   private final Setting<Boolean> lIjLllIiLIJjlIJlILj;
   private final Setting<SelfTrapPlus$Mode> fd_Setting_296;
   private final Setting<Boolean> fd_Setting_297;
   private final Setting<Boolean> fd_Setting_298;
   private final SettingGroup fd_SettingGroup_299;
   private final Setting<SettingColor> fd_Setting_300;
   public final Setting<Double> fd_Setting_301;
   private final Setting<mode> fd_Setting_302;
   private final Setting<Double> fd_Setting_303;
   private int ppQPPqpPppppQpppPpPPqqPQqQPpQQQQqQpPQQqpPp;
   private final ArrayList<Vec3d> fd_ArrayList_304;
   private final Setting<Boolean> fd_Setting_305;
   private final Setting<Boolean> sSssssSSsSSsssSssSsssssssSsSSSSSsSSsSSsssSssSsSsssSSSsSSssssSsssSSsSsSSSSSSsSsssSSsSSSsSsSssSSssSsssSSSsssSSsssSSssssSsSS;
   private final Setting<Boolean> fd_Setting_306;
   private final Setting<SelfTrapPlus$PlaceMode> fd_Setting_307;
   private final ArrayList<Vec3d> fd_ArrayList_308;

   @EventHandler
   private void onRender(Render3DEvent 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if ((Boolean)怀.lIjLllIiLIJjlIJlILj.get() && !Class57.isVecComplete(怀.getTrapDesign())) {
         Iterator var2 = 怀.getTrapDesign().iterator();

         while(var2.hasNext()) {
            怀 怀 = (Vec3d)var2.next();
            怀 怀 = 怀.mc.player.getBlockPos();
            怀 怀 = 怀.add(怀.x, 怀.y, 怀.z);
            if (Class57.getBlock(怀) == Blocks.AIR) {
               怀.renderer.box(怀, (Color)怀.fd_Setting_300.get(), (Color)怀.fd_Setting_295.get(), (ShapeMode)怀.fd_Setting_290.get(), 0);
            }
         }

      }
   }

   private ArrayList<Vec3d> getTrapDesign() {
      // $FF: Couldn't be decompiled
   }

   @EventHandler
   private void onTick(Pre 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀.ppQPPqpPppppQpppPpPPqqPQqQPpQQQQqQpPQQqpPp = 0;
      怀 怀 = InvUtils.findInHotbar(new Item[]{Items.OBSIDIAN});
      if (!怀.found()) {
         怀.notify("No obsidian in hotbar!");
         怀.toggle();
      } else if (Class57.isVecComplete(怀.getTrapDesign()) && (Boolean)怀.fd_Setting_297.get()) {
         怀.notify("Finished self trap.");
         怀.toggle();
      } else if ((Boolean)怀.fd_Setting_298.get() && 怀.ssSsSSsssSSSSSsSsSSsSSSSsSssSsSSsSsssSSSsSSSSsSsssSSsssssssSSSsSsSSsssSssSssSsSSSssssSssSsSsSSsss != 怀.mc.player.getBlockPos()) {
         怀.toggle();
      } else if ((Boolean)怀.sSssssSSsSSsssSssSsssssssSsSSSSSsSSsSSsssSssSsSsssSSSsSSssssSsssSSsSsSSSSSSsSsssSSsSSSsSsSssSSssSsssSSSsssSSsssSSssssSsSS.get() && !sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.isInHole(怀.mc.player)) {
         怀.toggle();
      } else {
         Iterator var3;
         BlockPos 怀;
         if ((Boolean)怀.fd_Setting_293.get()) {
            var3 = 怀.mc.world.getEntities().iterator();

            while(var3.hasNext()) {
               怀 怀 = (Entity)var3.next();
               if (怀 instanceof EndCrystalEntity) {
                  怀 = 怀.getBlockPos();
                  if (怀.equals(怀.mc.player.getBlockPos().up(3)) || 怀.equals(怀.mc.player.getBlockPos().up(4))) {
                     怀.mc.player.networkHandler.sendPacket(PlayerInteractEntityC2SPacket.attack(怀, 怀.mc.player.isSneaking()));
                     怀.mc.getNetworkHandler().sendPacket(new HandSwingC2SPacket(Hand.MAIN_HAND));
                  }
                  break;
               }
            }
         }

         var3 = 怀.getTrapDesign().iterator();

         while(var3.hasNext()) {
            怀 怀 = (Vec3d)var3.next();
            if (怀.ppQPPqpPppppQpppPpPPqqPQqQPpQQQQqQpPQQqpPp >= (Integer)怀.qqqqPppQpPQpppPPQpqQPPPPQpqPQpqQPPPqpPQQqpPQpPqqQPqQpPpqqPQQqpQQPpppq.get()) {
               return;
            }

            怀 = 怀.mc.player.getBlockPos();
            怀 怀 = 怀.add(怀.x, 怀.y, 怀.z);
            if (Class57.getBlock(怀) == Blocks.AIR) {
               BlockUtils.place(怀, 怀, (Boolean)怀.fd_Setting_306.get(), 100, true);
               ++怀.ppQPPqpPppppQpppPpPPqqPQqQPpQQQQqQpPQQqpPp;
            }
         }

      }
   }

   public SelfTrapPlus() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super(Class68.fd_Category_1060, "self-trap-plus", "Places obsidian around your head.");
      怀.fd_SettingGroup_294 = 怀.settings.getDefaultGroup();
      怀.fd_SettingGroup_299 = 怀.settings.createGroup("Render");
      怀.fd_Setting_296 = 怀.fd_SettingGroup_294.add(((Builder)((Builder)((Builder)(new Builder()).name("mode")).description("Which mode to use")).defaultValue(SelfTrapPlus$Mode.fd_Mode_314)).build());
      怀.fd_Setting_292 = 怀.fd_SettingGroup_294.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("consider-beds")).description("Fully trap yourself if a player has beds nearby")).defaultValue(true)).build());
      怀.fd_Setting_301 = 怀.fd_SettingGroup_294.add(((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)(new meteordevelopment.meteorclient.settings.DoubleSetting.Builder()).name("bed-check-range")).description("How far to check for players holding beds.")).defaultValue(5.0D).min(0.0D).sliderMax(5.0D).build());
      怀.fd_Setting_303 = 怀.fd_SettingGroup_294.add(((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)(new meteordevelopment.meteorclient.settings.DoubleSetting.Builder()).name("smart-dura")).description("How low an armor piece needs to be to fully trap.")).defaultValue(2.0D).min(1.0D).sliderMin(1.0D).sliderMax(100.0D).max(100.0D).build());
      怀.fd_Setting_307 = 怀.fd_SettingGroup_294.add(((Builder)((Builder)((Builder)(new Builder()).name("place-mode")).description("Which positions to place at.")).defaultValue(SelfTrapPlus$PlaceMode.fd_PlaceMode_315)).build());
      怀.fd_Setting_293 = 怀.fd_SettingGroup_294.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("anti-cev-breaker")).description("Protect yourself from cev breaker.")).defaultValue(true)).build());
      怀.qqqqPppQpPQpppPPQpqQPPPPQpqPQpqQPPPqpPQQqpPQpPqqQPqQpPpqqPQQqpQQPpppq = 怀.fd_SettingGroup_294.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("blocks-per-tick")).description("How many block placements per tick.")).defaultValue(4)).sliderMin(1).sliderMax(10).build());
      怀.fd_Setting_305 = 怀.fd_SettingGroup_294.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("center")).description("Centers you on the block you are standing on before placing.")).defaultValue(true)).build());
      怀.fd_Setting_297 = 怀.fd_SettingGroup_294.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("turn-off")).description("Turns off after placing.")).defaultValue(true)).build());
      怀.fd_Setting_298 = 怀.fd_SettingGroup_294.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("toggle-on-move")).description("Turns off if you move (chorus, pearl phase etc).")).defaultValue(true)).build());
      怀.sSssssSSsSSsssSssSsssssssSsSSSSSsSSsSSsssSssSsSsssSSSsSSssssSsssSSsSsSSSSSSsSsssSSsSSSsSsSssSSssSsssSSSsssSSsssSSssssSsSS = 怀.fd_SettingGroup_294.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("only-in-hole")).description("Won't place unless you're in a hole")).defaultValue(true)).build());
      怀.fd_Setting_306 = 怀.fd_SettingGroup_294.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("rotate")).description("Sends rotation packets to the server when placing.")).defaultValue(true)).build());
      怀.fd_Setting_302 = 怀.fd_SettingGroup_294.add(((Builder)((Builder)((Builder)(new Builder()).name("notification-mode")).description("How notifications are displayed.")).defaultValue(mode.fd_mode_881)).build());
      怀.lIjLllIiLIJjlIJlILj = 怀.fd_SettingGroup_299.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("render")).description("Renders a block overlay where the obsidian will be placed.")).defaultValue(true)).build());
      怀.fd_Setting_290 = 怀.fd_SettingGroup_299.add(((Builder)((Builder)((Builder)(new Builder()).name("shape-mode")).description("How the shapes are rendered.")).defaultValue(ShapeMode.Both)).build());
      怀.fd_Setting_300 = 怀.fd_SettingGroup_299.add(((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)(new meteordevelopment.meteorclient.settings.ColorSetting.Builder()).name("side-color")).description("The color of the sides of the blocks being rendered.")).defaultValue(new SettingColor(204, 0, 0, 10))).build());
      怀.fd_Setting_295 = 怀.fd_SettingGroup_299.add(((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)(new meteordevelopment.meteorclient.settings.ColorSetting.Builder()).name("line-color")).description("The color of the lines of the blocks being rendered.")).defaultValue(new SettingColor(204, 0, 0, 255))).build());
      怀.fd_List_291 = new ArrayList();
      怀.fd_ArrayList_308 = new SelfTrapPlus$1(怀);
      怀.fd_ArrayList_304 = new SelfTrapPlus$2(怀);
   }

   public void onActivate() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      Class66.moduleAuth();
      if (!怀.fd_List_291.isEmpty()) {
         怀.fd_List_291.clear();
      }

      if ((Boolean)怀.fd_Setting_305.get()) {
         PlayerUtils.centerPlayer();
      }

      怀.ssSsSSsssSSSSSsSsSSsSSSSsSssSsSSsSsssSSSsSSSSsSsssSSsssssssSSSsSsSSsssSssSssSsSSSssssSssSsSsSSsss = 怀.mc.player.getBlockPos();
      怀.ppQPPqpPppppQpppPpPPqqPQqQPpQQQQqQpPQQqpPp = 0;
   }

   private void notify(String 怀) {
      // $FF: Couldn't be decompiled
   }
}
