/* Decompiler 9ms, total 159ms, lines 96 */
package me.ghosttypes.ion.modules.chat;

import java.util.Iterator;
import me.ghosttypes.ion.modules.render.Notifications.mode;
import me.ghosttypes.ion.utils.Class68;
import me.ghosttypes.ion.utils.player.SsSSssSsssssSsSSsSSs;
import meteordevelopment.meteorclient.events.world.TickEvent.Post;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.EnumSetting.Builder;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ArmorAlert extends Module {
   private boolean fd_boolean_11;
   private boolean fd_boolean_12;
   private final SettingGroup fd_SettingGroup_13;
   private boolean fd_boolean_14;
   private final Setting<Double> fd_Setting_15;
   private final Setting<mode> fd_Setting_16;
   private boolean fd_boolean_17;

   public void onActivate() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀.fd_boolean_14 = false;
      怀.fd_boolean_12 = false;
      怀.fd_boolean_11 = false;
      怀.fd_boolean_17 = false;
   }

   @EventHandler
   private void onTick(Post 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = 怀.mc.player.getArmorItems();
      Iterator var3 = 怀.iterator();

      while(var3.hasNext()) {
         怀 怀 = (ItemStack)var3.next();
         if (SsSSssSsssssSsSSsSSs.checkThreshold(怀, (Double)怀.fd_Setting_15.get())) {
            if (SsSSssSsssssSsSSsSSs.isHelm(怀) && !怀.fd_boolean_14) {
               怀.notif(怀.getItem(), "helmet");
               怀.fd_boolean_14 = true;
            }

            if (SsSSssSsssssSsSSsSSs.isChest(怀) && !怀.fd_boolean_12) {
               怀.notif(怀.getItem(), "chestplate");
               怀.fd_boolean_12 = true;
            }

            if (SsSSssSsssssSsSSsSSs.isLegs(怀) && !怀.fd_boolean_11) {
               怀.notif(怀.getItem(), "leggings");
               怀.fd_boolean_11 = true;
            }

            if (SsSSssSsssssSsSSsSSs.isBoots(怀) && !怀.fd_boolean_17) {
               怀.notif(怀.getItem(), "boots");
               怀.fd_boolean_17 = true;
            }
         }

         if (!SsSSssSsssssSsSSsSSs.checkThreshold(怀, (Double)怀.fd_Setting_15.get())) {
            if (SsSSssSsssssSsSSsSSs.isHelm(怀) && 怀.fd_boolean_14) {
               怀.fd_boolean_14 = false;
            }

            if (SsSSssSsssssSsSSsSSs.isChest(怀) && 怀.fd_boolean_12) {
               怀.fd_boolean_12 = false;
            }

            if (SsSSssSsssssSsSSsSSs.isLegs(怀) && 怀.fd_boolean_11) {
               怀.fd_boolean_11 = false;
            }

            if (SsSSssSsssssSsSSsSSs.isBoots(怀) && 怀.fd_boolean_17) {
               怀.fd_boolean_17 = false;
            }
         }
      }

   }

   private void notif(Item 怀, String 怀) {
      // $FF: Couldn't be decompiled
   }

   public ArmorAlert() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super(Class68.fd_Category_1059, "armor-alert", "Alerts you when your armor pieces are low.");
      怀.fd_SettingGroup_13 = 怀.settings.getDefaultGroup();
      怀.fd_Setting_16 = 怀.fd_SettingGroup_13.add(((Builder)((Builder)((Builder)(new Builder()).name("notification-mode")).description("How notifications are displayed.")).defaultValue(mode.fd_mode_881)).build());
      怀.fd_Setting_15 = 怀.fd_SettingGroup_13.add(((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)(new meteordevelopment.meteorclient.settings.DoubleSetting.Builder()).name("durability")).description("How low an armor piece needs to be to alert you.")).defaultValue(2.0D).min(1.0D).sliderMin(1.0D).sliderMax(100.0D).max(100.0D).build());
   }
}
