/* Decompiler 3ms, total 147ms, lines 34 */
package me.ghosttypes.ion.utils.misc;

import java.util.Objects;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.BoolSetting.Builder;
import meteordevelopment.meteorclient.systems.config.Config;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;

public class Class27 {
   public final Setting<Boolean> fd_Setting_960;
   public final Setting<Boolean> fd_Setting_961;
   public static Class27 fd_Class27_962;
   public final SettingGroup fd_SettingGroup_963;
   public final Setting<SettingColor> fd_Setting_964;

   public Class27() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
      怀.fd_SettingGroup_963 = Config.get().settings.createGroup("Ion");
      怀.fd_Setting_960 = 怀.fd_SettingGroup_963.add(((Builder)((Builder)((Builder)((Builder)(new Builder()).name("deobfuscate-crash-reports")).description("Whether or not to deobfuscate crash reports.")).defaultValue(true)).onChanged((怀x) -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         Class29.fd_boolean_967 = 怀x;
      })).build());
      怀.fd_Setting_961 = 怀.fd_SettingGroup_963.add(((Builder)((Builder)((Builder)(new Builder()).name("custom-titlescreen-credits-colour")).description("Whether or not to enable a custom colour for the title screen credits.")).defaultValue(false)).build());
      SettingGroup var10001 = 怀.fd_SettingGroup_963;
      meteordevelopment.meteorclient.settings.ColorSetting.Builder var10002 = (meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)(new meteordevelopment.meteorclient.settings.ColorSetting.Builder()).name("titlescreen-credits-colour")).description("What colour the Ion titlescreen credits should be.")).defaultValue(new SettingColor(138, 7, 7, true));
      Setting var10003 = 怀.fd_Setting_961;
      Objects.requireNonNull(var10003);
      怀.fd_Setting_964 = var10001.add(((meteordevelopment.meteorclient.settings.ColorSetting.Builder)var10002.visible(var10003::get)).build());
      fd_Class27_962 = 怀;
   }
}
