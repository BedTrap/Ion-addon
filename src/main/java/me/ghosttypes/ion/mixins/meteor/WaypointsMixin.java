/* Decompiler 3ms, total 139ms, lines 53 */
package me.ghosttypes.ion.mixins.meteor;

import java.util.Iterator;
import me.ghosttypes.ion.modules.misc.elytrabot.ElytraBotThreaded;
import meteordevelopment.meteorclient.gui.GuiTheme;
import meteordevelopment.meteorclient.gui.widgets.WLabel;
import meteordevelopment.meteorclient.gui.widgets.containers.WTable;
import meteordevelopment.meteorclient.gui.widgets.pressable.WButton;
import meteordevelopment.meteorclient.gui.widgets.pressable.WCheckbox;
import meteordevelopment.meteorclient.gui.widgets.pressable.WMinus;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.systems.modules.render.WaypointsModule;
import meteordevelopment.meteorclient.systems.waypoints.Waypoint;
import meteordevelopment.meteorclient.utils.Utils;
import meteordevelopment.meteorclient.utils.world.Dimension;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin({WaypointsModule.class})
public abstract class WaypointsMixin {
   @Inject(
      method = {"fillTable"},
      at = {@At(
   value = "INVOKE",
   target = "Lmeteordevelopment/meteorclient/gui/widgets/containers/WTable;row()V",
   ordinal = 1
)},
      locals = LocalCapture.CAPTURE_FAILSOFT,
      remap = false
   )
   private void onFillTable(GuiTheme oOOo〇O〇ooo〇o〇ooo, WTable ムㄙㄙㄙㄙムㄙㄙㄙムㄙムムムムムㄙㄙㄙム, CallbackInfo 壿壿墫墫壿壿墫壿墫墫墫墫壿墫墫墫墫墫墫墫墫墫壿墫壿墫墫壿墫墫壿墫墫壿墫壿壿墫壿壿壿壿墫壿墫墫壿壿墫壿墫壿墫壿墫墫壿墫壿壿壿墫墫墫壿壿墫墫壿壿墫壿壿壿墫壿壿, WButton へへへへㇸㇸㇸ乀ㇸ乀へㇸ乀乀へㇸ乀へㇸへへへㇸ乀乀ㇸへㇸへㇸへㇸㇸㇸへ乀乀乀ㇸ乀ㇸㇸㇸㇸへへへへへㇸ乀乀ㇸㇸㇸ乀乀ㇸへ乀へㇸㇸㇸへㇸへへㇸㇸㇸへㇸ乀ㇸ乀へへ乀へ乀へへ乀ㇸㇸㇸㇸㇸ乀へㇸへへㇸ乀乀ㇸ乀へㇸへ, Iterator 炎炎火炏火燚炎欻炎炏欻火燚炏炏欻焱欻火火火火燚火欻火, Waypoint くㄑくㄑくㄑㄑくㄑくㄑㄑㄑくㄑくㄑくくㄑくㄑㄑㄑくㄑくくくくㄑくㄑ, WLabel 壿墫壿壿壿壿墫壿墫墫壿壿壿壿壿墫墫墫墫壿壿壿墫壿墫壿墫壿墫壿壿壿壿壿壿壿壿壿壿壿壿壿墫壿墫壿墫, boolean PpppPqPPPQPPpPPqqqpqpqqpPpPQPpQpppPQqQpqpqqPqqQpPPPQppQQpqpQqqqQPPpPqpqQppqqppPQqpPqQPPQPQqqqPQpQqppQQpqqpQpQqpq, Dimension 〇OOOoo〇〇〇OO〇O〇oOo〇oOooOO〇O〇ooOO〇〇O〇〇〇oOoOOo〇〇〇OOOooooo〇ooooo〇OoooO〇〇O〇〇O〇o〇〇〇OO〇o〇OooOoO〇oo〇oOo〇Ooo, WCheckbox 幐幐幐㬺幐幐幐㬺㬺㬺㬺㬺㬺幐㬺㬺幐幐㬺㬺幐㬺㬺幐幐㬺㬺㬺㬺幐幐幐㬺幐幐幐幐㬺㬺幐幐㬺幐㬺㬺㬺㬺㬺幐㬺幐幐㬺幐㬺幐幐㬺㬺㬺幐幐㬺幐幐㬺㬺幐㬺幐㬺㬺㬺幐, WButton ラララうラううラララうラララララララ, WMinus おおああおあおあおああおおあおあああああおあおおおあおああおあおおおおおおあああおあおおおおあおあおああおおあおおああおおああああおおおあああおあああおおおあおあおあおあおおおおああああおおおああおおあおおおああああああお) {
      if (ソゾシシシシジゾゾシソゾソシヅシゾソジゾヅヅジジシンンツヅンソジシツン.actualDimension == 佪佪茴茴回茴茴回佪佪茴徊徊佪徊徊回佪佪佪佪回徊佪回徊茴佪佪茴茴徊回徊佪徊佪佪徊徊佪徊茴茴茴回回茴茴佪徊佪回回佪佪徊回) {
         WButton 晩晩晚晩晩晚晚晩晚晩晚晚晚晩晩晚晚晩晚晩晩晩晚晩晩晩晩晩晚晚晚晚晩晚晚晩晩晩晩晩晚晚晚晩晚晚晚晩晩晩晚晩晚晩晚晚晚晚晚晚晩晩晩晚晚晩晚晩晩晩晩晚晚晚晩晚晚晚晩晩晚晚晚晚晩晚晩晚晩晚晚晩晩晚晩晚晩晩晩晚晩晩晩晚晚晩晚晚晩 = (WButton)よよよょょよょよょよょよょょょよょょよょょょよよょよょよよょょょょよょょよょよょょよょょょよょょよよよよょょょょよよよよょよよょょよょよよょよょょょよよよよょよょよょよょよよよよょょよょよよょょよよょょよょよよよょよょょよよ.add(qqpPqQPpqQPPpPQPqpqqPppQpqqqPQPPqpQpPpQPPpQqQPQpQPqpqppqqPpPQqqpPqpPqqqppPpqQQQqPPpQQqqPpppqppqPqPPp.button("Fly")).widget();
         晩晩晚晩晩晚晚晩晚晩晚晚晚晩晩晚晚晩晚晩晩晩晚晩晩晩晩晩晚晚晚晚晩晚晚晩晩晩晩晩晚晚晚晩晚晚晚晩晩晩晚晩晚晩晚晚晚晚晚晚晩晩晩晚晚晩晚晩晩晩晩晚晚晚晩晚晚晚晩晩晚晚晚晚晩晚晩晚晩晚晚晩晩晚晩晚晩晩晩晚晩晩晩晚晚晩晚晚晩.action = () -> {
            if (Utils.canUpdate()) {
               ElytraBotThreaded OOOo〇〇oO〇O〇OOoO〇Ooo〇o〇〇oOO〇ooo〇OO〇oo〇oOoo〇OooOoOo〇oOO〇OooOoOo〇〇OOo〇OO〇OooooOO〇〇OOoo〇OO〇oooO〇〇O〇〇o〇o〇o〇OOOooOo〇OooOOOOoo〇o〇Oo = (ElytraBotThreaded)Modules.get().get(ElytraBotThreaded.class);
               if (OOOo〇〇oO〇O〇OOoO〇Ooo〇o〇〇oOO〇ooo〇OO〇oo〇oOoo〇OooOoOo〇oOO〇OooOoOo〇〇OOo〇OO〇OooooOO〇〇OOoo〇OO〇oooO〇〇O〇〇o〇o〇o〇OOOooOo〇OooOOOOoo〇o〇Oo.isActive()) {
                  OOOo〇〇oO〇O〇OOoO〇Ooo〇o〇〇oOO〇ooo〇OO〇oo〇oOoo〇OooOoOo〇oOO〇OooOoOo〇〇OOo〇OO〇OooooOO〇〇OOoo〇OO〇oooO〇〇O〇〇o〇o〇o〇OOOooOo〇OooOOOOoo〇o〇Oo.toggle();
               }

               OOOo〇〇oO〇O〇OOoO〇Ooo〇o〇〇oOO〇ooo〇OO〇oo〇oOoo〇OooOoOo〇oOO〇OooOoOo〇〇OOo〇OO〇OooooOO〇〇OOoo〇OO〇oooO〇〇O〇〇o〇o〇o〇OOOooOo〇OooOOOOoo〇o〇Oo.fd_BlockPos_788 = new BlockPos(ソゾシシシシジゾゾシソゾソシヅシゾソジゾヅヅジジシンンツヅンソジシツン.x, ソゾシシシシジゾゾシソゾソシヅシゾソジゾヅヅジジシンンツヅンソジシツン.y + 1, ソゾシシシシジゾゾシソゾソシヅシゾソジゾヅヅジジシンンツヅンソジシツン.z);
               OOOo〇〇oO〇O〇OOoO〇Ooo〇o〇〇oOO〇ooo〇OO〇oo〇oOoo〇OooOoOo〇oOO〇OooOoOo〇〇OOo〇OO〇OooooOO〇〇OOoo〇OO〇oooO〇〇O〇〇o〇o〇o〇OOOooOo〇OooOOOOoo〇o〇Oo.toggle();
            }
         };
      }

   }
}
