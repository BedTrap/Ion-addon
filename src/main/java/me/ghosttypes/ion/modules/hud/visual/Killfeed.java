/* Decompiler 11ms, total 153ms, lines 103 */
package me.ghosttypes.ion.modules.hud.visual;

import java.util.ArrayList;
import java.util.Iterator;
import me.ghosttypes.ion.Ion;
import me.ghosttypes.ion.utils.misc.Class30;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.ColorSetting.Builder;
import meteordevelopment.meteorclient.systems.hud.Alignment;
import meteordevelopment.meteorclient.systems.hud.HudElement;
import meteordevelopment.meteorclient.systems.hud.HudElementInfo;
import meteordevelopment.meteorclient.systems.hud.HudRenderer;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;

public class Killfeed extends HudElement {
   private final Setting<Boolean> fd_Setting_596;
   private final Setting<SettingColor> fd_Setting_597;
   private final SettingGroup fd_SettingGroup_598;
   public static final HudElementInfo<Killfeed> fd_HudElementInfo_599;
   private final ArrayList<String> fd_ArrayList_600;

   public Killfeed() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super(fd_HudElementInfo_599);
      怀.fd_SettingGroup_598 = 怀.settings.getDefaultGroup();
      怀.fd_Setting_597 = 怀.fd_SettingGroup_598.add(((Builder)((Builder)((Builder)(new Builder()).name("color")).description("Color of text.")).defaultValue(new SettingColor(175, 175, 175))).build());
      怀.fd_Setting_596 = 怀.fd_SettingGroup_598.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("shadow")).description("Renders shadow behind text.")).defaultValue(true)).build());
      怀.fd_ArrayList_600 = new ArrayList();
   }

   public void tick(HudRenderer 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀.updateFeed();
      怀 怀 = 0.0D;
      怀 怀 = 0.0D;
      怀 怀 = 0;
      if (怀.fd_ArrayList_600.isEmpty()) {
         怀 怀 = "Killfeed";
         怀 = Math.max(怀, 怀.textWidth(怀));
         怀 += 怀.textHeight();
      } else {
         怀 = Math.max(怀, 怀.textWidth("Killfeed"));
         怀 += 怀.textHeight();

         for(Iterator var9 = 怀.fd_ArrayList_600.iterator(); var9.hasNext(); ++怀) {
            怀 怀 = (String)var9.next();
            怀 = Math.max(怀, 怀.textWidth(怀));
            怀 += 怀.textHeight();
            if (怀 > 0) {
               怀 += 2.0D;
            }
         }
      }

      怀.box.setSize(怀, 怀);
   }

   private void updateFeed() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀.fd_ArrayList_600.clear();
      if (!Class30.fd_ArrayList_975.isEmpty()) {
         怀.fd_ArrayList_600.addAll(Class30.fd_ArrayList_975);
      }

   }

   static {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_HudElementInfo_599 = new HudElementInfo(Ion.fd_HudGroup_2, "killfeed", "Display a list of your kills", Killfeed::new);
   }

   public void render(HudRenderer 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀.updateFeed();
      怀 怀 = (double)怀.getX();
      怀 怀 = (double)怀.getY();
      if (怀.isInEditor()) {
         怀.text("Killfeed", 怀, 怀, (Color)怀.fd_Setting_597.get(), (Boolean)怀.fd_Setting_596.get());
      } else {
         怀 怀 = 0;
         if (怀.fd_ArrayList_600.isEmpty()) {
            怀 怀 = "Killfeed";
            怀.text(怀, 怀 + 怀.alignX(怀.textWidth(怀), Alignment.Auto), 怀, (Color)怀.fd_Setting_597.get(), (Boolean)怀.fd_Setting_596.get());
         } else {
            怀.text("Killfeed", 怀 + 怀.alignX(怀.textWidth("Killfeed"), Alignment.Auto), 怀, (Color)怀.fd_Setting_597.get(), (Boolean)怀.fd_Setting_596.get());
            怀 += 怀.textHeight();

            for(Iterator var9 = 怀.fd_ArrayList_600.iterator(); var9.hasNext(); ++怀) {
               怀 怀 = (String)var9.next();
               怀.text(怀, 怀 + 怀.alignX(怀.textWidth(怀), Alignment.Auto), 怀, (Color)怀.fd_Setting_597.get(), (Boolean)怀.fd_Setting_596.get());
               怀 += 怀.textHeight();
               if (怀 > 0) {
                  怀 += 2.0D;
               }
            }
         }

      }
   }
}
