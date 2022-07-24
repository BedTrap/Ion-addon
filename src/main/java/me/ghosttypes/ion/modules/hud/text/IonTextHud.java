/* Decompiler 9ms, total 199ms, lines 61 */
package me.ghosttypes.ion.modules.hud.text;

import me.ghosttypes.ion.Ion;
import meteordevelopment.meteorclient.systems.hud.HudElementInfo;
import meteordevelopment.meteorclient.systems.hud.elements.TextHud;

public class IonTextHud {
   public static final HudElementInfo<TextHud>.Preset fd_Preset_588;
   public static final HudElementInfo<TextHud> fd_HudElementInfo_589;
   public static final HudElementInfo<TextHud>.Preset fd_Preset_590;
   public static final HudElementInfo<TextHud>.Preset fd_Preset_591;
   public static final HudElementInfo<TextHud>.Preset fd_Preset_592;
   public static final HudElementInfo<TextHud>.Preset SssSsSSSsSsSssSSsssSSSSSssSssSSSSssSssSssSssSsssSSSsSsSSssSSssssssssssSss;
   public static final HudElementInfo<TextHud>.Preset fd_Preset_593;
   public static final HudElementInfo<TextHud>.Preset fd_Preset_594;
   public static final HudElementInfo<TextHud>.Preset fd_Preset_595;

   private static HudElementInfo<TextHud>.Preset addPreset(String 怀, String 怀, int 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return fd_HudElementInfo_589.addPreset(怀, (怀x) -> {
         String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
         if (怀 != null) {
            怀x.text.set(怀);
         }

         if (怀 != -1) {
            怀x.updateDelay.set(怀);
         }

      });
   }

   static {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_HudElementInfo_589 = new HudElementInfo(Ion.fd_HudGroup_2, "ion-text-presets", "Text presets for Ion.", IonTextHud::create);
      fd_Preset_591 = addPreset("Welcome", "Welcome to Ion, {player}", Integer.MAX_VALUE);
      fd_Preset_592 = addPreset("Playtime", "Playtime: #1{ion.playtime}", 20);
      fd_Preset_594 = addPreset("Watermark", "Ion #1{ion.version}", Integer.MAX_VALUE);
      fd_Preset_595 = addPreset("Kills", "Kills: #1{ion.kills}");
      fd_Preset_588 = addPreset("Deaths", "Deaths: #1{ion.deaths}");
      SssSsSSSsSsSssSSsssSSSSSssSssSSSSssSssSssSssSsssSSSsSsSSssSSssssssssssSss = addPreset("Killstreak", "Killstreak: #1{ion.killstreak}");
      fd_Preset_593 = addPreset("Spotify", "Listening to {ion.spotify.current_track}, by {ion.spotify.current_artist}");
      fd_Preset_590 = addPreset("Elytra Bot Goal", "Goal: #1{ion.elytra_bot.goal}", 1);
   }

   private static HudElementInfo<TextHud>.Preset addPreset(String 怀, String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return addPreset(怀, 怀, -1);
   }

   private static TextHud create() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return new TextHud(fd_HudElementInfo_589);
   }

   public IonTextHud() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }
}
