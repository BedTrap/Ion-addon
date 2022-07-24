/* Decompiler 31ms, total 198ms, lines 134 */
package me.ghosttypes.ion.modules.misc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Map.Entry;
import me.ghosttypes.ion.utils.Class68;
import me.ghosttypes.ion.utils.events.Class17;
import me.ghosttypes.ion.utils.events.Class18_Cancellable;
import me.ghosttypes.ion.utils.misc.Class32;
import meteordevelopment.meteorclient.events.world.TickEvent.Post;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.BoolSetting.Builder;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.AbstractDecorationEntity;
import net.minecraft.entity.player.PlayerEntity;

public class Effects extends Module {
   private final Setting<Boolean> fd_Setting_657;
   private final Setting<Integer> fd_Setting_658;
   private final SettingGroup fd_SettingGroup_659;
   private final Setting<Boolean> fd_Setting_660;
   private final Setting<Boolean> fd_Setting_661;
   private final Setting<Boolean> fd_Setting_662;
   private final Setting<Integer> JLjiIjliJliilILlLLjiJJij;
   private final Setting<Effects$Effect> fd_Setting_663;
   private final Setting<Integer> fd_Setting_664;
   private final SettingGroup fd_SettingGroup_665;
   private static final Random fd_Random_666;
   private final Setting<Boolean> fd_Setting_667;
   private final Setting<Effects$Effect> fd_Setting_668;
   private static final Map<PlayerEntity, Integer> fd_Map_669;

   public Effects() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super(Class68.fd_Category_1062, "effects", "Plays effects.");
      怀.fd_SettingGroup_665 = 怀.settings.createGroup("Hit");
      怀.fd_SettingGroup_659 = 怀.settings.createGroup("Kill");
      怀.fd_Setting_667 = 怀.fd_SettingGroup_665.add(((Builder)((Builder)((Builder)(new Builder()).name("on-hit")).description("Plays the effect on a hit.")).defaultValue(true)).build());
      怀.fd_Setting_663 = 怀.fd_SettingGroup_665.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("hit-effect")).description("Which effect to play on a hit.")).defaultValue(Effects$Effect.fd_Effect_673)).build());
      怀.fd_Setting_657 = 怀.fd_SettingGroup_665.add(((Builder)((Builder)((Builder)(new Builder()).name("only-players")).description("Only plays the effect when you hit players.")).defaultValue(true)).build());
      怀.JLjiIjliJliilILlLLjiJJij = 怀.fd_SettingGroup_665.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("hit-amount")).description("How many times to play the effect.")).defaultValue(1)).sliderMax(10).build());
      怀.fd_Setting_661 = 怀.fd_SettingGroup_659.add(((Builder)((Builder)((Builder)(new Builder()).name("on-kill")).description("Plays the effect on a kill.")).defaultValue(true)).build());
      怀.fd_Setting_668 = 怀.fd_SettingGroup_659.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("effect")).description("Which effect to play on a kill.")).defaultValue(Effects$Effect.fd_Effect_671)).build());
      怀.fd_Setting_660 = 怀.fd_SettingGroup_659.add(((Builder)((Builder)((Builder)(new Builder()).name("only-own")).description("Only plays the effect for your own kills.")).defaultValue(false)).build());
      怀.fd_Setting_662 = 怀.fd_SettingGroup_659.add(((Builder)((Builder)((Builder)(new Builder()).name("only-once")).description("Only plays the effect once per kill.")).defaultValue(true)).build());
      SettingGroup var10001 = 怀.fd_SettingGroup_659;
      meteordevelopment.meteorclient.settings.IntSetting.Builder var10002 = ((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("timeout")).description("How long before an effect will play for a specific player again in ticks.")).defaultValue(100)).sliderMax(1000);
      Setting var10003 = 怀.fd_Setting_662;
      Objects.requireNonNull(var10003);
      怀.fd_Setting_664 = var10001.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)var10002.visible(var10003::get)).build());
      怀.fd_Setting_658 = 怀.fd_SettingGroup_659.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("kill-amount")).description("How many times to play the effect.")).defaultValue(1)).sliderMax(10).visible(() -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         return !(Boolean)怀.fd_Setting_662.get();
      })).build());
   }

   static {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_Map_669 = new HashMap();
      fd_Random_666 = new Random();
   }

   private void playEffect(Entity 怀, boolean 怀) {
      // $FF: Couldn't be decompiled
   }

   private void tickMap() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      Iterator 怀 = fd_Map_669.entrySet().iterator();

      while(怀.hasNext()) {
         怀 怀 = (Entry)怀.next();
         怀.setValue((Integer)怀.getValue() - 1);
         if ((Integer)怀.getValue() <= 0) {
            怀.remove();
         }
      }

   }

   @EventHandler
   private void onTick(Post 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (!(Boolean)怀.fd_Setting_660.get()) {
         怀.tickMap();
         Iterator var2 = 怀.mc.world.getPlayers().iterator();

         while(true) {
            PlayerEntity 怀;
            do {
               if (!var2.hasNext()) {
                  return;
               }

               怀 = (PlayerEntity)var2.next();
            } while(怀.getHealth() > 0.0F && (怀.deathTime <= 0 || !(Boolean)怀.fd_Setting_661.get()));

            if ((Boolean)怀.fd_Setting_662.get()) {
               if (fd_Map_669.get(怀) == null) {
                  怀.playEffect(怀, true);
                  fd_Map_669.put(怀, Class32.intToTicks((Integer)怀.fd_Setting_664.get()));
               }
            } else {
               怀.playEffect(怀, true);
            }
         }
      }
   }

   @EventHandler
   private void onAttack(Class18_Cancellable 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if ((Boolean)怀.fd_Setting_667.get() && (!(Boolean)怀.fd_Setting_657.get() || 怀.fd_Entity_908 instanceof PlayerEntity) && !(怀.fd_Entity_908 instanceof AbstractDecorationEntity)) {
         怀.playEffect(怀.fd_Entity_908, false);
      }

   }

   @EventHandler
   public void onKill(Class17 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀.fd_Vec3d_905 != null && (Boolean)怀.fd_Setting_661.get()) {
         怀.playEffect(怀.fd_Entity_904, true);
      }

   }
}
