/* Decompiler 51ms, total 248ms, lines 239 */
package me.ghosttypes.ion.modules.misc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.ghosttypes.ion.utils.Class68;
import me.ghosttypes.ion.utils.sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS;
import me.ghosttypes.ion.utils.misc.Class32;
import me.ghosttypes.ion.utils.player.Class46;
import meteordevelopment.meteorclient.events.packets.PacketEvent.Send;
import meteordevelopment.meteorclient.events.world.TickEvent.Post;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.BoolSetting.Builder;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.systems.modules.world.MountBypass;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.AbstractDonkeyEntity;
import net.minecraft.entity.passive.LlamaEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.client.gui.screen.ingame.HorseScreen;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.class_2831;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.class_2849;
import org.lwjgl.glfw.GLFW;

public class DonkeyDuper extends Module {
   private int fd_int_645;
   private boolean fd_boolean_646;
   private final Setting<Boolean> fd_Setting_647;
   private final SettingGroup ssSSsssSSssSSsSssSSssSsSsssSsSSSSSSssSSssSsSSsssSSsSSSsSSSssSsSsSsssSSSssSSSsSsssssssSsSsSsssssssssSSsSssssssssSssSsss;
   private final List<Integer> fd_List_648;
   private int fd_int_649;
   private AbstractDonkeyEntity fd_AbstractDonkeyEntity_650;
   private int fd_int_651;
   private boolean fd_boolean_652;
   private final Setting<Boolean> fd_Setting_653;
   private final List<Integer> fd_List_654;
   private final Setting<Boolean> fd_Setting_655;
   private final Setting<Integer> fd_Setting_656;

   public DonkeyDuper() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super(Class68.fd_Category_1062, "donkey-duper", "Automatically performs the mount bypass dupe. Disable with esc.");
      怀.ssSSsssSSssSSsSssSSssSsSsssSsSSSSSSssSSssSsSSsssSSsSSSsSSSssSsSsSsssSSSssSSSsSsssssssSsSsSsssssssssSSsSssssssssSssSsss = 怀.settings.getDefaultGroup();
      怀.fd_Setting_655 = 怀.ssSSsssSSssSSsSssSSssSsSsssSsSSSSSSssSSssSsSSsssSSsSSSsSSSssSsSsSsssSSSssSSSsSsssssssSsSsSsssssssssSSsSssssssssSssSsss.add(((Builder)((Builder)((Builder)(new Builder()).name("shulker-only")).description("Only moves shulker boxes into the donkey's inventory.")).defaultValue(true)).build());
      怀.fd_Setting_647 = 怀.ssSSsssSSssSSsSssSSssSsSsssSsSSSSSSssSSssSsSSsssSSsSSSsSSSssSsSsSsssSSSssSSSsSsssssssSsSsSsssssssssSSsSssssssssSssSsss.add(((Builder)((Builder)((Builder)(new Builder()).name("rotate-down")).description("Faces down when dropping items.")).defaultValue(true)).build());
      怀.fd_Setting_653 = 怀.ssSSsssSSssSSsSssSSssSsSsssSsSSSSSSssSSssSsSSsssSSsSSSsSSSssSsSsSsssSSSssSSSsSsssssssSsSsSsssssssssSSsSssssssssSssSsss.add(((Builder)((Builder)((Builder)(new Builder()).name("announce")).description("Announce when you dupe items.")).defaultValue(false)).build());
      怀.fd_Setting_656 = 怀.ssSSsssSSssSSsSssSSssSsSsssSsSSSSSSssSSssSsSSsssSSsSSSsSSSssSsSsSsssSSSssSSSsSsssssssSsSsSsssssssssSSsSssssssssSssSsss.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("dupe-delay")).description("The delay in seconds between duping.")).defaultValue(30)).min(0).build());
      怀.fd_List_648 = new ArrayList();
      怀.fd_List_654 = new ArrayList();
      怀.fd_boolean_646 = false;
      怀.fd_boolean_652 = false;
   }

   @EventHandler
   private void onTick(Post 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (GLFW.glfwGetKey(怀.mc.getWindow().getHandle(), 256) == 1) {
         怀.toggle();
         怀.mc.player.closeHandledScreen();
      } else if (怀.fd_int_645 > 0) {
         --怀.fd_int_645;
      } else {
         怀.fd_int_645 = Class32.intToTicks((Integer)怀.fd_Setting_656.get());
         int 怀 = 怀.getInvSize(怀.mc.player.getVehicle());
         Iterator var3 = 怀.mc.world.getEntities().iterator();

         while(var3.hasNext()) {
            怀 怀 = (Entity)var3.next();
            if (怀.distanceTo(怀.mc.player) < 5.0F && 怀 instanceof AbstractDonkeyEntity && ((AbstractDonkeyEntity)怀).isTame()) {
               怀.fd_AbstractDonkeyEntity_650 = (AbstractDonkeyEntity)怀;
            }
         }

         if (怀.fd_AbstractDonkeyEntity_650 != null) {
            if (怀.fd_boolean_652) {
               怀.mc.player.networkHandler.sendPacket(new ClientCommandC2SPacket(怀.mc.player, class_2849.RELEASE_SHIFT_KEY));
               怀.mc.player.setSneaking(false);
               怀.fd_boolean_652 = false;
            } else {
               int 怀;
               if (怀 == -1) {
                  if (!怀.fd_AbstractDonkeyEntity_650.hasChest() && 怀.mc.player.getMainHandStack().getItem() != Items.CHEST) {
                     怀 = InvUtils.find(new Item[]{Items.CHEST}).count();
                     if (怀 != -1 && 怀 < 9) {
                        怀.mc.player.getInventory().selectedSlot = 怀;
                     } else {
                        怀.error("Cannot find chest in your hotbar... disabling.", new Object[0]);
                        怀.toggle();
                     }
                  } else {
                     怀.mc.player.networkHandler.sendPacket(PlayerInteractEntityC2SPacket.interact(怀.fd_AbstractDonkeyEntity_650, 怀.mc.player.isSneaking(), Hand.MAIN_HAND));
                  }
               } else {
                  int 怀;
                  if (怀 == 0) {
                     if (怀.isDupeTime()) {
                        if (!怀.fd_List_654.isEmpty()) {
                           if ((Boolean)怀.fd_Setting_647.get()) {
                              怀.mc.player.networkHandler.sendPacket(new class_2831(怀.mc.player.getYaw(), 90.0F, 怀.mc.player.isOnGround()));
                           }

                           var3 = 怀.fd_List_654.iterator();

                           while(var3.hasNext()) {
                              怀 = (Integer)var3.next();
                              InvUtils.drop().slotId(怀);
                           }

                           怀.fd_List_654.clear();
                        } else {
                           for(怀 = 2; 怀 < 怀.getDupeSize() + 1; ++怀) {
                              怀.fd_List_654.add(怀);
                           }
                        }
                     } else {
                        怀.mc.player.closeHandledScreen();
                        怀.mc.player.networkHandler.sendPacket(new ClientCommandC2SPacket(怀.mc.player, class_2849.PRESS_SHIFT_KEY));
                        怀.mc.player.setSneaking(true);
                        怀.fd_boolean_652 = true;
                     }
                  } else if (!(怀.mc.currentScreen instanceof HorseScreen)) {
                     怀.mc.player.openRidingInventory();
                  } else if (怀 > 0) {
                     if (怀.fd_List_648.isEmpty()) {
                        怀 怀 = true;

                        for(怀 = 2; 怀 <= 怀; ++怀) {
                           if (!((ItemStack)怀.mc.player.currentScreenHandler.getStacks().get(怀)).isEmpty()) {
                              怀 = false;
                              break;
                           }
                        }

                        if (!怀) {
                           怀.fd_boolean_646 = true;
                           怀.mc.player.networkHandler.sendPacket(PlayerInteractEntityC2SPacket.interactAt(怀.fd_AbstractDonkeyEntity_650, 怀.mc.player.isSneaking(), Hand.MAIN_HAND, 怀.fd_AbstractDonkeyEntity_650.getPos().add((double)(怀.fd_AbstractDonkeyEntity_650.getWidth() / 2.0F), (double)(怀.fd_AbstractDonkeyEntity_650.getHeight() / 2.0F), (double)(怀.fd_AbstractDonkeyEntity_650.getWidth() / 2.0F))));
                           怀.fd_boolean_646 = false;
                           return;
                        }

                        for(怀 = 怀 + 2; 怀 < 怀.mc.player.currentScreenHandler.getStacks().size(); ++怀) {
                           if (!((ItemStack)怀.mc.player.currentScreenHandler.getStacks().get(怀)).isEmpty() && 怀.mc.player.currentScreenHandler.getSlot(怀).getStack().getItem() != Items.CHEST && (怀.mc.player.currentScreenHandler.getSlot(怀).getStack().getItem() instanceof BlockItem && ((BlockItem)怀.mc.player.currentScreenHandler.getSlot(怀).getStack().getItem()).getBlock() instanceof ShulkerBoxBlock || !(Boolean)怀.fd_Setting_655.get())) {
                              怀.fd_List_648.add(怀);
                              if (怀.fd_List_648.size() >= 怀) {
                                 break;
                              }
                           }
                        }
                     }

                     if (!怀.fd_List_648.isEmpty()) {
                        ++怀.fd_int_649;

                        for(var3 = 怀.fd_List_648.iterator(); var3.hasNext(); ++怀.fd_int_651) {
                           怀 = (Integer)var3.next();
                           InvUtils.quickMove().slotId(怀);
                        }

                        怀.info("Doing dupe #" + 怀.fd_int_649 + " | Total Shulkers duped: " + 怀.fd_int_651, new Object[0]);
                        if ((Boolean)怀.fd_Setting_653.get()) {
                           int var8 = 怀.fd_List_648.size();
                           sSsSsSssSsSsSssSsSSsSsssSssSsSssssSsssSSsSsSsSsSSSsSssSSSssSSsSssSssSsSsssSsSsSsSssS.sendMessage("I just duped " + var8 + " " + Class46.getItemNameBySlot((Integer)怀.fd_List_648.get(0)) + " thanks to Ion!");
                        }

                        怀.fd_List_648.clear();
                     }
                  }
               }

            }
         }
      }
   }

   private int getInvSize(Entity 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (!(怀 instanceof AbstractDonkeyEntity)) {
         return -1;
      } else if (!((AbstractDonkeyEntity)怀).hasChest()) {
         return 0;
      } else {
         return 怀 instanceof LlamaEntity ? 3 * ((LlamaEntity)怀).getStrength() : 15;
      }
   }

   private boolean isDupeTime() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀.mc.player.getVehicle() == 怀.fd_AbstractDonkeyEntity_650 && !怀.fd_AbstractDonkeyEntity_650.hasChest() && 怀.mc.player.currentScreenHandler.getStacks().size() != 46) {
         if (怀.mc.player.currentScreenHandler.getStacks().size() > 38) {
            for(int 怀 = 2; 怀 < 怀.getDupeSize() + 1; ++怀) {
               if (怀.mc.player.currentScreenHandler.getSlot(怀).hasStack()) {
                  return true;
               }
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public void onActivate() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀.fd_int_645 = 0;
      怀.fd_int_651 = 0;
      怀.fd_int_649 = 0;
   }

   private int getDupeSize() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return 怀.mc.player.getVehicle() == 怀.fd_AbstractDonkeyEntity_650 && !怀.fd_AbstractDonkeyEntity_650.hasChest() && 怀.mc.player.currentScreenHandler.getStacks().size() != 46 ? 怀.mc.player.currentScreenHandler.getStacks().size() - 38 : 0;
   }

   @EventHandler
   private void onSendPacket(Send 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (!怀.fd_boolean_646) {
         ((MountBypass)Modules.get().get(MountBypass.class)).onSendPacket(怀);
      }
   }

   public String getInfoString() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return 怀.fd_int_649 + " | " + 怀.fd_int_651;
   }
}
