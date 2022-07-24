/* Decompiler 27ms, total 182ms, lines 228 */
package me.ghosttypes.ion.modules.misc;

import java.util.Objects;
import me.ghosttypes.ion.utils.Class68;
import me.ghosttypes.ion.utils.sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.events.world.TickEvent.Post;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.BoolSetting.Builder;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.systems.modules.player.ChestSwap;
import meteordevelopment.meteorclient.utils.Utils;
import meteordevelopment.meteorclient.utils.player.FindItemResult;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.meteorclient.utils.player.Rotations;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.class_2849;

public class ElytraSwap extends Module {
   private boolean pppPpqqpQPPQQQqPpqqpQqppppqqpppPqp;
   private final SettingGroup fd_SettingGroup_676;
   private boolean pQPpQqQpqPppQqqppQqqqppQQqqpPqqqQPqQPqpqQqPQPQqPQPqQqpqQppPQqQPppPpqqQpPpQ;
   private final Setting<Integer> fd_Setting_677;
   private final Setting<Boolean> fd_Setting_678;
   public final Setting<Integer> fd_Setting_679;
   private final Setting<Integer> fd_Setting_680;
   private final ElytraSwap$StaticGroundListener fd_StaticGroundListener_681;
   private final SettingGroup fd_SettingGroup_682;
   public final Setting<ElytraSwap$ChestSwapMode> fd_Setting_683;
   private final Setting<Integer> fd_Setting_684;
   private Item fd_Item_685;
   private final SettingGroup fd_SettingGroup_686;
   private final Setting<Boolean> fd_Setting_687;
   private final Setting<Boolean> fd_Setting_688;
   private int fd_int_689;
   private final SettingGroup fd_SettingGroup_690;
   private final Setting<Boolean> fd_Setting_691;
   private final Setting<Boolean> fd_Setting_692;

   public void onDeactivate() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀.fd_Setting_683.get() == ElytraSwap$ChestSwapMode.fd_ChestSwapMode_694 && 怀.mc.player.getEquippedStack(EquipmentSlot.CHEST).getItem() == Items.ELYTRA) {
         ((ChestSwap)Modules.get().get(ChestSwap.class)).swap();
      } else if (怀.fd_Setting_683.get() == ElytraSwap$ChestSwapMode.fd_ChestSwapMode_693) {
         怀.enableGroundListener();
      }

      if ((Boolean)怀.fd_Setting_692.get() && 怀.fd_Item_685 != null) {
         怀 怀 = InvUtils.find(new Item[]{怀.fd_Item_685});
         InvUtils.move().from(怀.slot()).to((Integer)怀.fd_Setting_680.get());
      }

   }

   protected void enableGroundListener() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      MeteorClient.EVENT_BUS.subscribe(怀.fd_StaticGroundListener_681);
   }

   public ElytraSwap() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super(Class68.fd_Category_1062, "elytra-swap", "Swap to an elytra to quickly start flying");
      怀.fd_SettingGroup_676 = 怀.settings.getDefaultGroup();
      怀.fd_SettingGroup_682 = 怀.settings.createGroup("ChestSwap");
      怀.fd_SettingGroup_686 = 怀.settings.createGroup("Fireworks");
      怀.fd_SettingGroup_690 = 怀.settings.createGroup("Takeoff");
      怀.fd_Setting_687 = 怀.fd_SettingGroup_686.add(((Builder)((Builder)(new Builder()).name("debug")).defaultValue(false)).build());
      怀.fd_Setting_679 = 怀.fd_SettingGroup_676.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("firework-move-delay")).description("How long to wait before moving fireworks to your hotbar.")).defaultValue(3)).min(0).sliderMax(20).build());
      怀.fd_Setting_683 = 怀.fd_SettingGroup_682.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("chest-swap")).description("When to swap back to your chestplate.")).defaultValue(ElytraSwap$ChestSwapMode.fd_ChestSwapMode_693)).build());
      怀.fd_Setting_688 = 怀.fd_SettingGroup_686.add(((Builder)((Builder)((Builder)(new Builder()).name("move-to-hotbar")).description("Moves fireworks into your hotbar.")).defaultValue(false)).build());
      SettingGroup var10001 = 怀.fd_SettingGroup_686;
      meteordevelopment.meteorclient.settings.IntSetting.Builder var10002 = ((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("firework-slot")).description("The slot to move fireworks to.")).defaultValue(9)).min(1).max(9).sliderMin(1).sliderMax(9);
      Setting var10003 = 怀.fd_Setting_688;
      Objects.requireNonNull(var10003);
      怀.fd_Setting_680 = var10001.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)var10002.visible(var10003::get)).build());
      var10001 = 怀.fd_SettingGroup_686;
      Builder var1 = (Builder)((Builder)((Builder)(new Builder()).name("swap-to-fireworks")).description("Swap to fireworks after moving them to your hotbar.")).defaultValue(false);
      var10003 = 怀.fd_Setting_688;
      Objects.requireNonNull(var10003);
      怀.fd_Setting_691 = var10001.add(((Builder)var1.visible(var10003::get)).build());
      var10001 = 怀.fd_SettingGroup_686;
      var1 = (Builder)((Builder)((Builder)(new Builder()).name("swap-back")).description("Swap the original item back to the firework slot.")).defaultValue(false);
      var10003 = 怀.fd_Setting_688;
      Objects.requireNonNull(var10003);
      怀.fd_Setting_692 = var10001.add(((Builder)var1.visible(var10003::get)).build());
      怀.fd_Setting_678 = 怀.fd_SettingGroup_690.add(((Builder)((Builder)((Builder)(new Builder()).name("auto-takeoff")).description("Start flying automatically.")).defaultValue(false)).build());
      var10001 = 怀.fd_SettingGroup_690;
      var10002 = (meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("takeoff-pitch")).description("What to set your pitch to before takeoff.")).defaultValue(0);
      var10003 = 怀.fd_Setting_678;
      Objects.requireNonNull(var10003);
      怀.fd_Setting_684 = var10001.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)var10002.visible(var10003::get)).build());
      var10001 = 怀.fd_SettingGroup_690;
      var10002 = (meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("takeoff-fireworks")).description("How many fireworks to use for takeoff.")).defaultValue(2);
      var10003 = 怀.fd_Setting_678;
      Objects.requireNonNull(var10003);
      怀.fd_Setting_677 = var10001.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)var10002.visible(var10003::get)).build());
      怀.fd_StaticGroundListener_681 = new ElytraSwap$StaticGroundListener(怀);
   }

   public void onActivate() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀.pppPpqqpQPPQQQqPpqqpQqppppqqpppPqp = false;
      怀.pQPpQqQpqPppQqqppQqqqppQQqqpPqqqQPqQPqpqQqPQPQqPQPqQqpqQppPQqQPppPpqqQpPpQ = false;
      if ((Boolean)怀.fd_Setting_692.get()) {
         怀.fd_Item_685 = 怀.mc.player.getInventory().getStack((Integer)怀.fd_Setting_680.get()).getItem();
      } else {
         怀.fd_Item_685 = null;
      }

      怀.fd_int_689 = (Integer)怀.fd_Setting_679.get();
      if ((怀.fd_Setting_683.get() == ElytraSwap$ChestSwapMode.fd_ChestSwapMode_694 || 怀.fd_Setting_683.get() == ElytraSwap$ChestSwapMode.fd_ChestSwapMode_693) && 怀.mc.player.getEquippedStack(EquipmentSlot.CHEST).getItem() != Items.ELYTRA) {
         ((ChestSwap)Modules.get().get(ChestSwap.class)).swap();
      }

   }

   // $FF: synthetic method
   static MinecraftClient access$100(ElytraSwap 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return 怀.mc;
   }

   // $FF: synthetic method
   static MinecraftClient access$000(ElytraSwap 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return 怀.mc;
   }

   // $FF: synthetic method
   static MinecraftClient access$200(ElytraSwap 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return 怀.mc;
   }

   @EventHandler
   private void onTick(Post 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      FindItemResult 怀;
      if ((Boolean)怀.fd_Setting_688.get()) {
         if (怀.fd_int_689 <= 0 && !怀.pppPpqqpQPPQQQqPpqqpQqppppqqpppPqp) {
            if ((Boolean)怀.fd_Setting_687.get()) {
               怀.info("Moving fireworks", new Object[0]);
            }

            怀.pppPpqqpQPPQQQqPpqqpQqppppqqpppPqp = true;
            怀.pQPpQqQpqPppQqqppQqqqppQQqqpPqqqQPqQPqpqQqPQPQqPQPqQqpqQppPQqQPppPpqqQpPpQ = true;
            怀 = InvUtils.find(new Item[]{Items.FIREWORK_ROCKET});
            if (怀.found()) {
               InvUtils.move().from(怀.slot()).to((Integer)怀.fd_Setting_680.get());
               if ((Boolean)怀.fd_Setting_691.get()) {
                  sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.updateSlot((Integer)怀.fd_Setting_680.get());
               }
            }
         } else {
            --怀.fd_int_689;
         }
      }

      if (怀.pQPpQqQpqPppQqqppQqqqppQQqqpPqqqQPqQPqpqQqPQPQqPQPqQqpqQppPQqQPppPpqqQpPpQ && (Boolean)怀.fd_Setting_678.get()) {
         if ((Boolean)怀.fd_Setting_687.get()) {
            怀.info("Taking off", new Object[0]);
         }

         怀 = InvUtils.findInHotbar(new Item[]{Items.FIREWORK_ROCKET});
         if (怀.found()) {
            if ((Boolean)怀.fd_Setting_687.get()) {
               怀.info("Found fireworks, rotating", new Object[0]);
            }

            Rotations.rotate((double)怀.mc.player.getYaw(), (double)(Integer)怀.fd_Setting_684.get());
            if ((Boolean)怀.fd_Setting_687.get()) {
               怀.info("Jumping and setting velocity", new Object[0]);
            }

            怀.mc.player.jump();
            怀.mc.player.setVelocity(0.0D, -0.04D, 0.0D);
            if ((Boolean)怀.fd_Setting_687.get()) {
               怀.info("Sending START_FLY_FALLING packet", new Object[0]);
            }

            怀.mc.getNetworkHandler().sendPacket(new ClientCommandC2SPacket(怀.mc.player, class_2849.START_FALL_FLYING));
            if (怀.mc.player.getMainHandStack().getItem() != Items.FIREWORK_ROCKET) {
               sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.updateSlot(怀.slot());
            }

            怀 怀 = 0;
            if ((Boolean)怀.fd_Setting_687.get()) {
               怀.info("Using " + 怀.fd_Setting_677.get() + " fireworks for takeoff", new Object[0]);
            }

            while(怀 < (Integer)怀.fd_Setting_677.get()) {
               怀.useFirework();
               ++怀;
            }

            if ((Boolean)怀.fd_Setting_687.get()) {
               怀.info("Takeoff complete", new Object[0]);
            }

            怀.pQPpQqQpqPppQqqppQqqqppQQqqpPqqqQPqQPqpqQqPQPQqPQPqQqpqQppPQqQPppPpqqQpPpQ = false;
         }
      }

   }

   protected void disableGroundListener() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      MeteorClient.EVENT_BUS.unsubscribe(怀.fd_StaticGroundListener_681);
   }

   private void useFirework() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀.mc.options.useKey.setPressed(true);
      if (!怀.mc.player.isUsingItem()) {
         Utils.rightClick();
      }

      怀.mc.options.useKey.setPressed(false);
   }
}
