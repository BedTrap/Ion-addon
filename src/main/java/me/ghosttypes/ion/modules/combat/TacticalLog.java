/* Decompiler 31ms, total 254ms, lines 139 */
package me.ghosttypes.ion.modules.combat;

import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Objects;
import me.ghosttypes.ion.utils.Class68;
import me.ghosttypes.ion.utils.misc.Class19;
import meteordevelopment.meteorclient.events.world.TickEvent.Post;
import meteordevelopment.meteorclient.events.world.TickEvent.Pre;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.EnumSetting.Builder;
import meteordevelopment.meteorclient.systems.friends.Friends;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.player.DamageUtils;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.network.packet.s2c.play.DisconnectS2CPacket;

public class TacticalLog extends Module {
   public final Setting<Integer> fd_Setting_402;
   public final Setting<Boolean> fd_Setting_403;
   public final Setting<Boolean> iILijIljjJiiijijIIILjLjIiIliiILJILLlLJLIIiLJijLililijJJLiiJljIjjJJJLJjJjIl;
   public final Setting<Boolean> fd_Setting_404;
   private final SettingGroup fd_SettingGroup_405;
   public final Setting<Boolean> fd_Setting_406;
   public final Setting<TacticalLog$TickMode> fd_Setting_407;
   public final Setting<Integer> fd_Setting_408;
   public final Setting<Boolean> fd_Setting_409;

   public TacticalLog() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super(Class68.fd_Category_1060, "tactical-log", "Auto log v2");
      怀.fd_SettingGroup_405 = 怀.settings.getDefaultGroup();
      怀.fd_Setting_407 = 怀.fd_SettingGroup_405.add(((Builder)((Builder)((Builder)(new Builder()).name("tick-mode")).description("When to check each tick.")).defaultValue(TacticalLog$TickMode.fd_TickMode_411)).build());
      怀.fd_Setting_408 = 怀.fd_SettingGroup_405.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("min-totems")).description("How many totems you must have left before logging.")).defaultValue(2)).min(1).sliderMax(20).max(20).build());
      怀.fd_Setting_402 = 怀.fd_SettingGroup_405.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("health")).description("What health to log out at.")).defaultValue(15)).min(1).sliderMax(20).max(20).build());
      怀.fd_Setting_406 = 怀.fd_SettingGroup_405.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("strict-totem")).description("Ignore health check until your totems are below min-totems.")).defaultValue(true)).build());
      怀.fd_Setting_409 = 怀.fd_SettingGroup_405.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("zero-tick-bypass")).description("Log out if you get zero ticked by a sword")).defaultValue(true)).build());
      怀.fd_Setting_404 = 怀.fd_SettingGroup_405.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("death-bypass")).description("Log out if you will take enough damage to kill you.")).defaultValue(true)).build());
      SettingGroup var10001 = 怀.fd_SettingGroup_405;
      meteordevelopment.meteorclient.settings.BoolSetting.Builder var10002 = (meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("death-bypass-strict")).description("Only log out if you will die, ignore if you will pop.")).defaultValue(true);
      Setting var10003 = 怀.fd_Setting_404;
      Objects.requireNonNull(var10003);
      怀.iILijIljjJiiijijIIILjLjIiIliiILJILLlLJLIIiLJijLililijJJLiiJljIjjJJJLJjJjIl = var10001.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)var10002.visible(var10003::get)).build());
      var10001 = 怀.fd_SettingGroup_405;
      var10002 = (meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("death-bypass-totem-check")).description("Log out if the next pop will be below min-totems.")).defaultValue(true);
      var10003 = 怀.fd_Setting_404;
      Objects.requireNonNull(var10003);
      怀.fd_Setting_403 = var10001.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)var10002.visible(var10003::get)).build());
   }

   private String getDamageString(Double 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = new DecimalFormat("0.00");
      return 怀.format(怀);
   }

   private void check() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = Class19.totem();
      if (怀 <= (Integer)怀.fd_Setting_408.get()) {
         怀.logOut("Totem Count below min totems");
      }

      if (怀.mc.player.getHealth() <= (float)(Integer)怀.fd_Setting_402.get() && (Boolean)怀.fd_Setting_406.get() && 怀 <= (Integer)怀.fd_Setting_408.get()) {
         怀.logOut("Health below min health : " + 怀.getHealthString());
      }

      if ((Boolean)怀.fd_Setting_404.get()) {
         怀 怀 = PlayerUtils.possibleHealthReductions();
         if (PlayerUtils.getTotalHealth() - PlayerUtils.possibleHealthReductions() < (double)(Integer)怀.fd_Setting_402.get()) {
            var10000 = 怀.getDamageString(怀);
            怀 怀 = "You were going to take " + var10000 + "dmg, ";
            if ((Boolean)怀.iILijIljjJiiijijIIILjLjIiIliiILJILLlLJLIIiLJijLililijJJLiiJljIjjJJJLJjJjIl.get() && 怀.mc.player.getOffHandStack().getItem() != Items.TOTEM_OF_UNDYING) {
               怀.logOut(怀 + "and had no totem equipped");
            }

            if ((Boolean)怀.fd_Setting_403.get() && 怀 - 1 <= (Integer)怀.fd_Setting_408.get()) {
               怀.logOut(怀 + "and would be below " + 怀.fd_Setting_408.get() + " totems");
            }
         }
      }

      if ((Boolean)怀.fd_Setting_409.get()) {
         Iterator var5 = 怀.mc.world.getEntities().iterator();

         while(var5.hasNext()) {
            怀 怀 = (Entity)var5.next();
            if (怀 instanceof PlayerEntity && 怀.getUuid() != 怀.mc.player.getUuid()) {
               怀 怀 = (PlayerEntity)怀;
               if (!Friends.get().isFriend(怀) && 怀.mc.player.distanceTo(怀) < 8.0F && DamageUtils.getSwordDamage(怀, true) > PlayerUtils.getTotalHealth()) {
                  怀.logOut("You were about to be 0ticked by " + 怀.getEntityName());
               }
            }
         }
      }

   }

   private String getHealthString() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = new DecimalFormat("0.00");
      怀 怀 = 怀.mc.player.getHealth();
      return 怀.format((double)怀);
   }

   @EventHandler
   private void onTick(Post 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀.fd_Setting_407.get() == TacticalLog$TickMode.fd_TickMode_411) {
         怀.check();
      }

   }

   @EventHandler
   private void onTick(Pre 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀.fd_Setting_407.get() == TacticalLog$TickMode.fd_TickMode_412) {
         怀.check();
      }

   }

   private void logOut(String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = 怀.mc.player.getBlockPos();
      int var5 = 怀.getX();
      怀 怀 = "X: " + var5 + " Y: " + 怀.getY() + " Z: " + 怀.getZ();
      怀 怀 = "[TaticalLog] " + 怀 + ". Pos: " + 怀;
      怀.mc.player.networkHandler.onDisconnect(new DisconnectS2CPacket(Text.literal(怀)));
   }
}
