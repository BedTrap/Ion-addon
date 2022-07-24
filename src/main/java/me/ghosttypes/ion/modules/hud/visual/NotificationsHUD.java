/* Decompiler 21ms, total 181ms, lines 143 */
package me.ghosttypes.ion.modules.hud.visual;

import java.util.ArrayList;
import java.util.Iterator;
import me.ghosttypes.ion.Ion;
import me.ghosttypes.ion.modules.render.Notifications;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.renderer.Renderer2D;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.ColorSetting.Builder;
import meteordevelopment.meteorclient.systems.hud.Alignment;
import meteordevelopment.meteorclient.systems.hud.HudElement;
import meteordevelopment.meteorclient.systems.hud.HudElementInfo;
import meteordevelopment.meteorclient.systems.hud.HudRenderer;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.utils.render.MeteorToast;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.client.util.math.MatrixStack;

public class NotificationsHUD extends HudElement {
   private final SettingGroup fd_SettingGroup_611;
   private final Setting<SettingColor> fd_Setting_612;
   private final Setting<Boolean> fd_Setting_613;
   public static final HudElementInfo<NotificationsHUD> fd_HudElementInfo_614;
   public static ArrayList<NotificationsHUD$Notif> fd_ArrayList_615;
   public static ArrayList<NotificationsHUD$Notif> fd_ArrayList_616;

   public NotificationsHUD() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super(fd_HudElementInfo_614);
      怀.fd_SettingGroup_611 = 怀.settings.getDefaultGroup();
      怀.fd_Setting_612 = 怀.fd_SettingGroup_611.add(((Builder)((Builder)((Builder)(new Builder()).name("color")).description("Color of text.")).defaultValue(new SettingColor(175, 175, 175))).build());
      怀.fd_Setting_613 = 怀.fd_SettingGroup_611.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("shadow")).description("Renders shadow behind text.")).defaultValue(true)).build());
   }

   static {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_HudElementInfo_614 = new HudElementInfo(Ion.fd_HudGroup_2, "notifications", "Display notifications", NotificationsHUD::new);
      fd_ArrayList_616 = new ArrayList();
      fd_ArrayList_615 = new ArrayList();
   }

   public static void popAlert(String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      MeteorClient.mc.getToastManager().add(new MeteorToast(Items.TOTEM_OF_UNDYING, "PopCounter", 怀, 1000L));
   }

   public static void updateNotifs() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (fd_ArrayList_616.size() > 6) {
         fd_ArrayList_616.remove(0);
      }

      fd_ArrayList_616.removeIf((怀) -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         return 怀.pppqPqQqPqPQqQpQppp <= 0;
      });
      fd_ArrayList_615.clear();
      fd_ArrayList_615.addAll(fd_ArrayList_616);
   }

   public static void lowArmor(Item 怀, String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      MeteorClient.mc.getToastManager().add(new MeteorToast(怀, "Armor Alert", 怀, 2000L));
   }

   public static int getNotificationTime() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return (Integer)((Notifications)Modules.get().get(Notifications.class)).fd_Setting_876.get();
   }

   public static void addNotification(String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_ArrayList_616.add(new NotificationsHUD$Notif(怀));
   }

   public void render(HudRenderer 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      updateNotifs();
      怀 怀 = (double)怀.getX();
      怀 怀 = (double)怀.getY();
      怀 怀 = (double)怀.getWidth();
      怀 怀 = (double)怀.getWidth();
      怀 怀 = 0;
      怀 怀 = (Notifications)Modules.get().get(Notifications.class);
      if (怀.isInEditor()) {
         if ((Boolean)怀.fd_Setting_878.get()) {
            Renderer2D.COLOR.begin();
            Renderer2D.COLOR.quad(怀, 怀, 怀, 怀, (Color)怀.fd_Setting_879.get());
            Renderer2D.COLOR.render((MatrixStack)null);
         }

         怀.text("Notifications", 怀, 怀, (Color)怀.fd_Setting_612.get(), (Boolean)怀.fd_Setting_613.get());
      } else if (怀.isActive() && !fd_ArrayList_615.isEmpty()) {
         for(Iterator var12 = fd_ArrayList_615.iterator(); var12.hasNext(); ++怀) {
            怀 怀 = (NotificationsHUD$Notif)var12.next();
            怀 怀 = 怀.fd_String_617;
            怀.text(怀, 怀 + 怀.alignX(怀.textWidth(怀), Alignment.Auto), 怀, (Color)怀.fd_Setting_612.get(), (Boolean)怀.fd_Setting_613.get());
            怀 += 怀.textHeight();
            if (怀 > 0) {
               怀 += 2.0D;
            }
         }

      }
   }

   public void tick(HudRenderer 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      updateNotifs();
      怀 怀 = 0.0D;
      怀 怀 = 0.0D;
      怀 怀 = 0;
      if (fd_ArrayList_615.isEmpty()) {
         怀 怀 = "Notifications";
         怀 = Math.max(怀, 怀.textWidth(怀));
         怀 += 怀.textHeight();
         怀.box.setSize(怀, 怀);
      } else if (怀.isActive()) {
         for(Iterator var7 = fd_ArrayList_615.iterator(); var7.hasNext(); ++怀) {
            怀 怀 = (NotificationsHUD$Notif)var7.next();
            怀 怀 = 怀.fd_String_617;
            怀 = Math.max(怀, 怀.textWidth(怀));
            怀 += 怀.textHeight();
            if (怀 > 0) {
               怀 += 2.0D;
            }
         }

         怀.box.setSize(怀, 怀);
      }
   }

   public static void spotify(String 怀, String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      MeteorClient.mc.getToastManager().add(new MeteorToast(Items.NOTE_BLOCK, 怀, 怀, 2000L));
   }
}
