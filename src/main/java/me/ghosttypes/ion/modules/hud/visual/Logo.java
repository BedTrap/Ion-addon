/* Decompiler 11ms, total 160ms, lines 93 */
package me.ghosttypes.ion.modules.hud.visual;

import me.ghosttypes.ion.Ion;
import meteordevelopment.meteorclient.renderer.GL;
import meteordevelopment.meteorclient.renderer.Renderer2D;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.DoubleSetting.Builder;
import meteordevelopment.meteorclient.systems.hud.HudElement;
import meteordevelopment.meteorclient.systems.hud.HudElementInfo;
import meteordevelopment.meteorclient.systems.hud.HudRenderer;
import meteordevelopment.meteorclient.utils.player.ChatUtils;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.RainbowColor;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import net.minecraft.util.Identifier;
import net.minecraft.client.util.math.MatrixStack;

public class Logo extends HudElement {
   private final SettingGroup fd_SettingGroup_601;
   private static final Identifier fd_Identifier_602;
   public final Setting<Boolean> fd_Setting_603;
   private static final Identifier fd_Identifier_604;
   private static final RainbowColor fd_RainbowColor_605;
   public final Setting<Boolean> fd_Setting_606;
   private static final Identifier fd_Identifier_607;
   public static final HudElementInfo<Logo> SSsSSsSsssSSsSsSSsSSsSssssSSSSSSssSSSSsSsssSsssSSsSsSsSSSsSsssSSSsSSsSSsSsssSssssSsS;
   private final Setting<Double> fd_Setting_608;
   private final Setting<Double> fd_Setting_609;
   private final Setting<SettingColor> fd_Setting_610;

   public void tick(HudRenderer 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀.getLogo() == fd_Identifier_602 || 怀.getLogo() == fd_Identifier_607) {
         怀.box.setSize(78.0D * (Double)怀.fd_Setting_609.get(), 165.0D * (Double)怀.fd_Setting_609.get());
      }

      怀.box.setSize(78.0D * (Double)怀.fd_Setting_609.get(), 96.0D * (Double)怀.fd_Setting_609.get());
   }

   static {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      SSsSSsSsssSSsSsSSsSSsSssssSSSSSSssSSSSsSsssSsssSSsSsSsSSSsSsssSSSsSSsSSsSsssSssssSsS = new HudElementInfo(Ion.fd_HudGroup_2, "ion-logo", "Displays the Ion logo.", Logo::new);
      fd_Identifier_604 = new Identifier("ion", "textures/icon.png");
      fd_Identifier_607 = new Identifier("ion", "textures/logo_flat.png");
      fd_Identifier_602 = new Identifier("ion", "textures/logo_transparent.png");
      fd_RainbowColor_605 = new RainbowColor();
   }

   private Identifier getLogo() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if ((Boolean)怀.fd_Setting_606.get() && (Boolean)怀.fd_Setting_603.get()) {
         ChatUtils.error("Chroma animation is not supported with transparent style, switching to flat logo", new Object[0]);
         怀.fd_Setting_603.set(false);
      }

      if ((Boolean)怀.fd_Setting_603.get()) {
         return fd_Identifier_602;
      } else {
         return (Boolean)怀.fd_Setting_606.get() ? fd_Identifier_607 : fd_Identifier_604;
      }
   }

   public Logo() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super(SSsSSsSsssSSsSsSSsSSsSssssSSSSSSssSSSSsSsssSsssSSsSsSsSSSsSsssSSSsSSsSSsSsssSssssSsS);
      怀.fd_SettingGroup_601 = 怀.settings.getDefaultGroup();
      怀.fd_Setting_609 = 怀.fd_SettingGroup_601.add(((Builder)((Builder)(new Builder()).name("scale")).description("The scale.")).defaultValue(2.0D).min(1.0D).sliderMin(1.0D).sliderMax(5.0D).build());
      怀.fd_Setting_603 = 怀.fd_SettingGroup_601.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("transparent")).description("Remove the background from the logo.")).defaultValue(false)).build());
      怀.fd_Setting_606 = 怀.fd_SettingGroup_601.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("chroma")).description("Chroma logo animation.")).defaultValue(false)).build());
      怀.fd_Setting_608 = 怀.fd_SettingGroup_601.add(((Builder)((Builder)(new Builder()).name("chroma-speed")).description("Speed of the chroma animation.")).defaultValue(0.09D).min(0.01D).sliderMax(5.0D).decimalPlaces(2).build());
      怀.fd_Setting_610 = 怀.fd_SettingGroup_601.add(((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)(new meteordevelopment.meteorclient.settings.ColorSetting.Builder()).name("background-color")).description("Color of the background.")).defaultValue(new SettingColor(255, 255, 255))).build());
   }

   public void render(HudRenderer 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = (double)怀.box.x;
      怀 怀 = (double)怀.box.y;
      怀 怀 = 怀.getWidth();
      怀 怀 = 怀.getHeight();
      GL.bindTexture(怀.getLogo());
      Renderer2D.TEXTURE.begin();
      if ((Boolean)怀.fd_Setting_606.get()) {
         fd_RainbowColor_605.setSpeed((Double)怀.fd_Setting_608.get() / 100.0D);
         Renderer2D.TEXTURE.texQuad(怀, 怀, (double)怀, (double)怀, fd_RainbowColor_605.getNext());
      } else {
         Renderer2D.TEXTURE.texQuad(怀, 怀, (double)怀, (double)怀, (Color)怀.fd_Setting_610.get());
      }

      Renderer2D.TEXTURE.render((MatrixStack)null);
   }
}
