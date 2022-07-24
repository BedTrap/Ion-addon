/* Decompiler 9ms, total 151ms, lines 93 */
package me.ghosttypes.ion.mixins.meteor;

import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.events.render.HeldItemRendererEvent;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.BoolSetting.Builder;
import meteordevelopment.meteorclient.systems.modules.render.HandView;
import net.minecraft.util.math.Vec3f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({HandView.class})
public class HandViewMixin {
   private Setting<Boolean> rotateMainhandY = null;
   private Setting<Double> rotateMainhandZSpeed = null;
   private Setting<Boolean> rotateOffhandX = null;
   private Setting<Boolean> rotateMainhandZ = null;
   private Setting<Double> rotateOffhandZSpeed = null;
   private Setting<Boolean> rotateOffhandY = null;
   private Setting<Double> rotateOffhandYSpeed = null;
   private Setting<Double> rotateMainhandYSpeed = null;
   private Setting<Boolean> rotateOffhandZ = null;
   private Setting<Double> rotateMainhandXSpeed = null;
   private Setting<Double> rotateOffhandXSpeed = null;
   private Setting<Boolean> rotateMainhandX = null;

   private float getRotationDegrees(double 烓澆垚桂圭烓㙓圭圭土烓洼土烓澆垚圭土洼土茥垚土土茥桂圭洼澆垚㙓烓垚桂烓烓洼圭洼洼㙓洼洼洼圭桂烓茥烓圭圭㙓茥洼桂澆垚茥土圭洼㙓㙓澆烓洼㙓烓圭㙓澆㙓洼烓茥土烓洼澆土㙓澆澆澆圭澆茥桂桂茥垚澆垚圭桂桂澆澆澆烓桂茥土茥㙓土垚土洼洼澆桂烓圭圭土) {
      double メメメノノノノメメメメメメメノノメメメノノメノメメメメノメメノメメメノメノノノメノメメノメノノノメメメメメメノメノメノ = (double)MeteorClient.mc.player.age % (20.0D / ツソツジシジツシツツジンゾヅジツンシヅヅツジシツツゾジゾシシヅゾゾシヅジジシンシジシジヅジヅゾツヅソゾツゾソシシンヅシヅツソツジソンジヅツヅソゾジシシツソ) / (20.0D / ツソツジシジツシツツジンゾヅジツンシヅヅツジシツツゾジゾシシヅゾゾシヅジジシンシジシジヅジヅゾツヅソゾツゾソシシンヅシヅツソツジソンジヅツヅソゾジシシツソ);
      double 焱炎火燚燚焱焱炎燚燚欻炎欻炎燚炎火欻炏炎炎焱燚焱欻炏焱欻火欻火炎炏炎火火燚焱燚欻炎燚欻焱焱燚燚炏火炎欻焱燚欻欻炎焱欻欻焱欻火炏火炏燚火欻火炎燚燚炎炏火炎炏火燚焱炎 = 1.0D / (20.0D / ツソツジシジツシツツジンゾヅジツンシヅヅツジシツツゾジゾシシヅゾゾシヅジジシンシジシジヅジヅゾツヅソゾツゾソシシンヅシヅツソツジソンジヅツヅソゾジシシツソ) * (double)MeteorClient.mc.getTickDelta();
      return (float)(MeteorClient.mc.isPaused() ? メメメノノノノメメメメメメメノノメメメノノメノメメメメノメメノメメメノメノノノメノメメノメノノノメメメメメメノメノメノ : メメメノノノノメメメメメメメノノメメメノノメノメメメメノメメノメメメノメノノノメノメメノメノノノメメメメメメノメノメノ + 焱炎火燚燚焱焱炎燚燚欻炎欻炎燚炎火欻炏炎炎焱燚焱欻炏焱欻火欻火炎炏炎火火燚焱燚欻炎燚欻焱焱燚燚炏火炎欻焱燚欻欻炎焱欻欻焱欻火炏火炏燚火欻火炎燚燚炎炏火炎炏火燚焱炎) * 360.0F;
   }

   @Inject(
      method = {"<init>"},
      at = {@At("TAIL")},
      remap = false
   )
   private void onInit(CallbackInfo へㇸへへㇸ乀へへㇸ乀へへㇸ乀乀へ) {
      SettingGroup メメノメノノノノメノメメメメメノ = ((HandView)ょょよょよよょよよょよよょよょよょよょよょょょよょょよ).settings.createGroup("Rotations");
      ょょよょよよょよよょよよょよょよょよょよょょょよょょよ.rotateMainhandX = メメノメノノノノメノメメメメメノ.add(((Builder)((Builder)((Builder)(new Builder()).name("rotate-mainhand-x")).description("Whether to rotate the X orientation")).defaultValue(false)).build());
      ょょよょよよょよよょよよょよょよょよょよょょょよょょよ.rotateMainhandY = メメノメノノノノメノメメメメメノ.add(((Builder)((Builder)((Builder)(new Builder()).name("rotate-mainhand-y")).description("Whether to rotate the Y orientation")).defaultValue(false)).build());
      ょょよょよよょよよょよよょよょよょよょよょょょよょょよ.rotateMainhandZ = メメノメノノノノメノメメメメメノ.add(((Builder)((Builder)((Builder)(new Builder()).name("rotate-mainhand-z")).description("Whether to rotate the Z orientation")).defaultValue(false)).build());
      ょょよょよよょよよょよよょよょよょよょよょょょよょょよ.rotateOffhandX = メメノメノノノノメノメメメメメノ.add(((Builder)((Builder)((Builder)(new Builder()).name("rotate-offhand-x")).description("Whether to rotate the X orientation")).defaultValue(false)).build());
      ょょよょよよょよよょよよょよょよょよょよょょょよょょよ.rotateOffhandY = メメノメノノノノメノメメメメメノ.add(((Builder)((Builder)((Builder)(new Builder()).name("rotate-offhand-y")).description("Whether to rotate the Y orientation")).defaultValue(false)).build());
      ょょよょよよょよよょよよょよょよょよょよょょょよょょよ.rotateOffhandZ = メメノメノノノノメノメメメメメノ.add(((Builder)((Builder)((Builder)(new Builder()).name("rotate-offhand-z")).description("Whether to rotate the Z orientation")).defaultValue(false)).build());
      ょょよょよよょよよょよよょよょよょよょよょょょよょょよ.rotateMainhandXSpeed = メメノメノノノノメノメメメメメノ.add(((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)(new meteordevelopment.meteorclient.settings.DoubleSetting.Builder()).name("mainhand-x-rotation-speed")).description("The speed of the mainhand X rotation.")).defaultValue(0.5D).sliderRange(-3.0D, 3.0D).build());
      ょょよょよよょよよょよよょよょよょよょよょょょよょょよ.rotateMainhandYSpeed = メメノメノノノノメノメメメメメノ.add(((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)(new meteordevelopment.meteorclient.settings.DoubleSetting.Builder()).name("mainhand-y-rotation-speed")).description("The speed of the mainhand Y rotation.")).defaultValue(0.5D).sliderRange(-3.0D, 3.0D).build());
      ょょよょよよょよよょよよょよょよょよょよょょょよょょよ.rotateMainhandZSpeed = メメノメノノノノメノメメメメメノ.add(((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)(new meteordevelopment.meteorclient.settings.DoubleSetting.Builder()).name("mainhand-z-rotation-speed")).description("The speed of the mainhand Z rotation.")).defaultValue(0.5D).sliderRange(-3.0D, 3.0D).build());
      ょょよょよよょよよょよよょよょよょよょよょょょよょょよ.rotateOffhandXSpeed = メメノメノノノノメノメメメメメノ.add(((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)(new meteordevelopment.meteorclient.settings.DoubleSetting.Builder()).name("offhand-x-rotation-speed")).description("The speed of the offhand X rotation.")).defaultValue(0.5D).sliderRange(-3.0D, 3.0D).build());
      ょょよょよよょよよょよよょよょよょよょよょょょよょょよ.rotateOffhandYSpeed = メメノメノノノノメノメメメメメノ.add(((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)(new meteordevelopment.meteorclient.settings.DoubleSetting.Builder()).name("offhand-y-rotation-speed")).description("The speed of the offhand Y rotation.")).defaultValue(0.5D).sliderRange(-3.0D, 3.0D).build());
      ょょよょよよょよよょよよょよょよょよょよょょょよょょよ.rotateOffhandZSpeed = メメノメノノノノメノメメメメメノ.add(((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)(new meteordevelopment.meteorclient.settings.DoubleSetting.Builder()).name("offhand-z-rotation-speed")).description("The speed of the offhand Z rotation.")).defaultValue(0.5D).sliderRange(-3.0D, 3.0D).build());
   }

   @Inject(
      method = {"onHeldItemRender"},
      at = {@At("TAIL")},
      remap = false
   )
   private void heldItemRender(HeldItemRendererEvent 佪回回回佪徊徊回茴徊茴茴徊徊回回徊徊佪佪回佪茴回徊佪徊佪茴茴, CallbackInfo ssssSssSSSsSssSssssSSsSssSsSssSssSSsSSsssSssSSSsSSssssssSSsS) {
      switch(SSsSSSSsSsSSSssssSSssSSSSsSSSsSSsSSSSSSsSSsssSSsSSSSSSSssssSSSSSSsSssSsssSSsssSSsSsSSsSSSssssS.hand) {
      case MAIN_HAND:
         if ((Boolean)うララううラうううラううラうううララううううラうララララララうララうラララうララうラううララうラうララうララうううううラううラララうララうララううううララううララうララ.rotateMainhandX.get()) {
            SSsSSSSsSsSSSssssSSssSSSSsSSSsSSsSSSSSSsSSsssSSsSSSSSSSssssSSSSSSsSssSsssSSsssSSsSsSSsSSSssssS.matrix.multiply(Vec3f.POSITIVE_X.getDegreesQuaternion(うララううラうううラううラうううララううううラうララララララうララうラララうララうラううララうラうララうララうううううラううラララうララうララううううララううララうララ.getRotationDegrees((Double)うララううラうううラううラうううララううううラうララララララうララうラララうララうラううララうラうララうララうううううラううラララうララうララううううララううララうララ.rotateMainhandXSpeed.get())));
         }

         if ((Boolean)うララううラうううラううラうううララううううラうララララララうララうラララうララうラううララうラうララうララうううううラううラララうララうララううううララううララうララ.rotateMainhandY.get()) {
            SSsSSSSsSsSSSssssSSssSSSSsSSSsSSsSSSSSSsSSsssSSsSSSSSSSssssSSSSSSsSssSsssSSsssSSsSsSSsSSSssssS.matrix.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(うララううラうううラううラうううララううううラうララララララうララうラララうララうラううララうラうララうララうううううラううラララうララうララううううララううララうララ.getRotationDegrees((Double)うララううラうううラううラうううララううううラうララララララうララうラララうララうラううララうラうララうララうううううラううラララうララうララううううララううララうララ.rotateMainhandYSpeed.get())));
         }

         if ((Boolean)うララううラうううラううラうううララううううラうララララララうララうラララうララうラううララうラうララうララうううううラううラララうララうララううううララううララうララ.rotateMainhandZ.get()) {
            SSsSSSSsSsSSSssssSSssSSSSsSSSsSSsSSSSSSsSSsssSSsSSSSSSSssssSSSSSSsSssSsssSSsssSSsSsSSsSSSssssS.matrix.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(うララううラうううラううラうううララううううラうララララララうララうラララうララうラううララうラうララうララうううううラううラララうララうララううううララううララうララ.getRotationDegrees((Double)うララううラうううラううラうううララううううラうララララララうララうラララうララうラううララうラうララうララうううううラううラララうララうララううううララううララうララ.rotateMainhandZSpeed.get())));
         }
         break;
      case OFF_HAND:
         if ((Boolean)うララううラうううラううラうううララううううラうララララララうララうラララうララうラううララうラうララうララうううううラううラララうララうララううううララううララうララ.rotateOffhandX.get()) {
            SSsSSSSsSsSSSssssSSssSSSSsSSSsSSsSSSSSSsSSsssSSsSSSSSSSssssSSSSSSsSssSsssSSsssSSsSsSSsSSSssssS.matrix.multiply(Vec3f.POSITIVE_X.getDegreesQuaternion(うララううラうううラううラうううララううううラうララララララうララうラララうララうラううララうラうララうララうううううラううラララうララうララううううララううララうララ.getRotationDegrees((Double)うララううラうううラううラうううララううううラうララララララうララうラララうララうラううララうラうララうララうううううラううラララうララうララううううララううララうララ.rotateOffhandXSpeed.get())));
         }

         if ((Boolean)うララううラうううラううラうううララううううラうララララララうララうラララうララうラううララうラうララうララうううううラううラララうララうララううううララううララうララ.rotateOffhandY.get()) {
            SSsSSSSsSsSSSssssSSssSSSSsSSSsSSsSSSSSSsSSsssSSsSSSSSSSssssSSSSSSsSssSsssSSsssSSsSsSSsSSSssssS.matrix.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(うララううラうううラううラうううララううううラうララララララうララうラララうララうラううララうラうララうララうううううラううラララうララうララううううララううララうララ.getRotationDegrees((Double)うララううラうううラううラうううララううううラうララララララうララうラララうララうラううララうラうララうララうううううラううラララうララうララううううララううララうララ.rotateOffhandYSpeed.get())));
         }

         if ((Boolean)うララううラうううラううラうううララううううラうララララララうララうラララうララうラううララうラうララうララうううううラううラララうララうララううううララううララうララ.rotateOffhandZ.get()) {
            SSsSSSSsSsSSSssssSSssSSSSsSSSsSSsSSSSSSsSSsssSSsSSSSSSSssssSSSSSSsSssSsssSSsssSSsSsSSsSSSssssS.matrix.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(うララううラうううラううラうううララううううラうララララララうララうラララうララうラううララうラうララうララうううううラううラララうララうララううううララううララうララ.getRotationDegrees((Double)うララううラうううラううラうううララううううラうララララララうララうラララうララうラううララうラうララうララうううううラううラララうララうララううううララううララうララ.rotateOffhandZSpeed.get())));
         }
      }

   }
}
