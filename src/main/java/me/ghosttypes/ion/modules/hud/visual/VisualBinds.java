/* Decompiler 19ms, total 172ms, lines 115 */
package me.ghosttypes.ion.modules.hud.visual;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import me.ghosttypes.ion.Ion;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.ColorSetting.Builder;
import meteordevelopment.meteorclient.systems.hud.Alignment;
import meteordevelopment.meteorclient.systems.hud.HudElement;
import meteordevelopment.meteorclient.systems.hud.HudElementInfo;
import meteordevelopment.meteorclient.systems.hud.HudRenderer;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;

public class VisualBinds extends HudElement {
   private final Setting<SettingColor> fd_Setting_618;
   private final ArrayList<String> fd_ArrayList_619;
   private final Setting<VisualBinds$SortMode> LlLjijljijIlIiIjILLlLjIIiLiJlLLjLILILIlijjLLlJIijjjlIiJiLLIJIJ;
   public static final HudElementInfo<VisualBinds> fd_HudElementInfo_620;
   private final SettingGroup fd_SettingGroup_621;
   private final Setting<Boolean> fd_Setting_622;

   public void tick(HudRenderer 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀.updateBinds();
      怀 怀 = 0.0D;
      怀 怀 = 0.0D;
      怀 怀 = 0;
      if (怀.fd_ArrayList_619.isEmpty()) {
         怀 怀 = "You have no keybound modules.";
         怀 = Math.max(怀, 怀.textWidth(怀));
         怀 += 怀.textHeight();
      } else {
         for(Iterator var9 = 怀.fd_ArrayList_619.iterator(); var9.hasNext(); ++怀) {
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

   public void render(HudRenderer 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀.updateBinds();
      怀 怀 = (double)怀.getX();
      怀 怀 = (double)怀.getY();
      if (怀.isInEditor()) {
         怀.text("Keybinds", 怀, 怀, (Color)怀.fd_Setting_618.get(), (Boolean)怀.fd_Setting_622.get());
      } else {
         怀 怀 = 0;
         if (怀.fd_ArrayList_619.isEmpty()) {
            怀 怀 = "You have no keybound modules.";
            怀.text(怀, 怀 + 怀.alignX(怀.textWidth(怀), Alignment.Auto), 怀, (Color)怀.fd_Setting_618.get(), (Boolean)怀.fd_Setting_622.get());
         } else {
            for(Iterator var9 = 怀.fd_ArrayList_619.iterator(); var9.hasNext(); ++怀) {
               怀 怀 = (String)var9.next();
               怀.text(怀, 怀 + 怀.alignX(怀.textWidth(怀), Alignment.Auto), 怀, (Color)怀.fd_Setting_618.get(), (Boolean)怀.fd_Setting_622.get());
               怀 += 怀.textHeight();
               if (怀 > 0) {
                  怀 += 2.0D;
               }
            }
         }

      }
   }

   static {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_HudElementInfo_620 = new HudElementInfo(Ion.fd_HudGroup_2, "visual-binds", "Display keybound modules and their bind.", VisualBinds::new);
   }

   public VisualBinds() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super(fd_HudElementInfo_620);
      怀.fd_SettingGroup_621 = 怀.settings.getDefaultGroup();
      怀.fd_Setting_618 = 怀.fd_SettingGroup_621.add(((Builder)((Builder)((Builder)(new Builder()).name("color")).description("Color of text.")).defaultValue(new SettingColor(175, 175, 175))).build());
      怀.fd_Setting_622 = 怀.fd_SettingGroup_621.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("shadow")).description("Renders shadow behind text.")).defaultValue(true)).build());
      怀.LlLjijljijIlIiIjILLlLjIIiLiJlLLjLILILIlijjLLlJIijjjlIiJiLLIJIJ = 怀.fd_SettingGroup_621.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("sort-mode")).description("How to sort the binds list.")).defaultValue(VisualBinds$SortMode.fd_SortMode_624)).build());
      怀.fd_ArrayList_619 = new ArrayList();
   }

   private void updateBinds() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀.fd_ArrayList_619.clear();
      怀 怀 = Modules.get().getAll().stream().filter((怀x) -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         return 怀x.keybind.isSet();
      }).toList();
      Iterator var2 = 怀.iterator();

      while(var2.hasNext()) {
         怀 怀 = (Module)var2.next();
         String var10001 = 怀.title;
         怀.fd_ArrayList_619.add(var10001 + ": [" + 怀.keybind.toString() + "]");
      }

      if (((VisualBinds$SortMode)怀.LlLjijljijIlIiIjILLlLjIIiLiJlLLjLILILIlijjLLlJIijjjlIiJiLLIJIJ.get()).equals(VisualBinds$SortMode.fd_SortMode_624)) {
         怀.fd_ArrayList_619.sort(Comparator.comparing(String::length));
      } else {
         怀.fd_ArrayList_619.sort(Comparator.comparing(String::length).reversed());
      }

   }
}
