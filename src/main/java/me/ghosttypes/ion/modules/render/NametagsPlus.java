/* Decompiler 157ms, total 334ms, lines 399 */
package me.ghosttypes.ion.modules.render;

import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import me.ghosttypes.ion.utils.Class68;
import me.ghosttypes.ion.utils.misc.Class24_Enum;
import me.ghosttypes.ion.utils.misc.Class25;
import me.ghosttypes.ion.utils.player.Class43;
import me.ghosttypes.ion.utils.world.Class66;
import meteordevelopment.meteorclient.events.render.Render2DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent.Post;
import meteordevelopment.meteorclient.renderer.Renderer2D;
import meteordevelopment.meteorclient.renderer.text.TextRenderer;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.EntityTypeListSetting.Builder;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.systems.modules.render.Freecam;
import meteordevelopment.meteorclient.utils.Utils;
import meteordevelopment.meteorclient.utils.entity.EntityUtils;
import meteordevelopment.meteorclient.utils.misc.Vec3;
import meteordevelopment.meteorclient.utils.render.NametagUtils;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.decoration.ItemFrameEntity;
import net.minecraft.entity.TntEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.util.math.MatrixStack;

public class NametagsPlus extends Module {
   private final SettingGroup fd_SettingGroup_836;
   private final Setting<Class24_Enum> fd_Setting_837;
   private final Setting<Boolean> fd_Setting_838;
   private final Setting<SettingColor> sSSsSssssssssSSssSSSsSSsSSssSsSsSSsSsSsSSSsssssSsSSssSSsSSSSsssSSssssssssssssssSsSSSSSSSSSSssSssSSsSsSSssSSssssss;
   private final Setting<Boolean> fd_Setting_839;
   private final Setting<Integer> fd_Setting_840;
   private final double[] fd_array_841;
   private final Setting<Class24_Enum> fd_Setting_842;
   private final Setting<Double> fd_Setting_843;
   public static StatusEffect PpPQPppQqPQPPqqPppPQpPPPpQppqQQqPppPppQqPpqPpppqPPQQqQpQPPpPQQqPqqPppQQQpqpppPpqQpqQQPqqP;
   private final Setting<Double> fd_Setting_844;
   private final Setting<Class24_Enum> fd_Setting_845;
   private final List<Entity> fd_List_846;
   private final Setting<Object2BooleanMap<EntityType<?>>> fd_Setting_847;
   private final Setting<Boolean> ppPQQqqQQqqqQpqqPQqQqqpQpQpqQqQpqqQpQqQqPpppQqPpQpPPPpPQpQPQPQPPQ;
   private final Setting<Boolean> fd_Setting_848;
   private final Setting<Boolean> fd_Setting_849;
   private final SettingGroup fd_SettingGroup_850;
   private final Setting<Class24_Enum> fd_Setting_851;
   private final Setting<Integer> fd_Setting_852;
   private final Setting<Class24_Enum> fd_Setting_853;
   private final SettingGroup fd_SettingGroup_854;
   private final Setting<Boolean> SSssSssSsS;
   private final Setting<Boolean> fd_Setting_855;
   private final Setting<Double> fd_Setting_856;
   private final Setting<List<Enchantment>> fd_Setting_857;
   private final Map<Enchantment, Integer> fd_Map_858;
   private final SettingGroup fd_SettingGroup_859;
   public static StatusEffect fd_StatusEffect_860;
   private final Setting<Boolean> fd_Setting_861;
   private final Setting<Boolean> fd_Setting_862;
   private final Setting<Boolean> fd_Setting_863;
   private final Vec3 fd_Vec3_864;
   private final Setting<NametagsPlus$Position> fd_Setting_865;
   private final String[] fd_array_866;
   private final Setting<Class24_Enum> fd_Setting_867;
   private final Setting<SettingColor> fd_Setting_868;
   private final Setting<Boolean> fd_Setting_869;
   private final Setting<Double> fd_Setting_870;

   public void onActivate() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      Class66.moduleAuth();
   }

   private int getRenderCount() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = (Boolean)怀.fd_Setting_838.get() ? (Integer)怀.fd_Setting_852.get() : 怀.fd_List_846.size();
      怀 = MathHelper.clamp(怀, 0, 怀.fd_List_846.size());
      return 怀;
   }

   private void renderNametagItem(ItemStack 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = TextRenderer.get();
      NametagUtils.begin(怀.fd_Vec3_864);
      怀 怀 = 怀.getName().getString();
      怀 怀 = " x" + 怀.getCount();
      怀 怀 = 怀.getWidth(怀, true);
      怀 怀 = 怀.getWidth(怀, true);
      怀 怀 = 怀.getHeight(true);
      怀 怀 = 怀;
      if ((Boolean)怀.fd_Setting_848.get()) {
         怀 = 怀 + 怀;
      }

      怀 怀 = 怀 / 2.0D;
      怀.drawBg(-怀, -怀, 怀, 怀);
      怀.beginBig();
      怀 怀 = -怀;
      怀 怀 = -怀;
      怀 = 怀.render(怀, 怀, 怀, (Color)怀.sSSsSssssssssSSssSSSsSSsSSssSsSsSSsSsSsSSSsssssSsSSssSSsSSSSsssSSssssssssssssssSsSSSSSSSSSSssSssSSsSsSSssSSssssss.get(), true);
      if ((Boolean)怀.fd_Setting_848.get()) {
         怀.render(怀, 怀, 怀, Class25.fd_Color_944, true);
      }

      怀.end();
      NametagUtils.end();
   }

   private void renderGenericNametag(LivingEntity 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = TextRenderer.get();
      NametagUtils.begin(怀.fd_Vec3_864);
      怀 怀 = 怀.getType().getName().getString();
      怀 = 怀 + " ";
      怀 怀 = 怀.getAbsorptionAmount();
      怀 怀 = Math.round(怀.getHealth() + 怀);
      怀 怀 = (double)((float)怀 / (怀.getMaxHealth() + 怀));
      怀 怀 = String.valueOf(怀);
      Color 怀;
      if (怀 <= 0.333D) {
         怀 = Class25.fd_Color_952;
      } else if (怀 <= 0.666D) {
         怀 = Class25.fd_Color_944;
      } else {
         怀 = Class25.fd_Color_951;
      }

      怀 怀 = 怀.getWidth(怀, true);
      怀 怀 = 怀.getWidth(怀, true);
      怀 怀 = 怀.getHeight(true);
      怀 怀 = 怀 + 怀;
      怀 怀 = 怀 / 2.0D;
      怀.drawBg(-怀, -怀, 怀, 怀);
      怀.beginBig();
      怀 怀 = -怀;
      怀 怀 = -怀;
      怀 = 怀.render(怀, 怀, 怀, (Color)怀.sSSsSssssssssSSssSSSsSSsSSssSsSsSSsSsSsSSSsssssSsSSssSSsSSSSsssSSssssssssssssssSsSSSSSSSSSSssSssSSsSsSSssSSssssss.get(), true);
      怀.render(怀, 怀, 怀, 怀, true);
      怀.end();
      NametagUtils.end();
   }

   @EventHandler
   private void onTick(Post 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀.fd_List_846.clear();
      怀 怀 = !Modules.get().isActive(Freecam.class);
      怀 怀 = 怀.mc.gameRenderer.getCamera().getPos();
      Iterator var4 = 怀.mc.world.getEntities().iterator();

      while(true) {
         Entity 怀;
         EntityType 怀;
         do {
            do {
               do {
                  if (!var4.hasNext()) {
                     怀.fd_List_846.sort(Comparator.comparing((怀x) -> {
                        String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
                        return 怀x.squaredDistanceTo(怀);
                     }));
                     return;
                  }

                  怀 = (Entity)var4.next();
                  怀 = 怀.getType();
               } while(!((Object2BooleanMap)怀.fd_Setting_847.get()).containsKey(怀));
            } while(怀 == EntityType.PLAYER && (!(Boolean)怀.fd_Setting_839.get() || 怀) && 怀 == 怀.mc.player);
         } while((Boolean)怀.fd_Setting_838.get() && 怀.getPos().distanceTo(怀) >= (Double)怀.fd_Setting_844.get());

         怀.fd_List_846.add(怀);
      }
   }

   public static int getAmplifier(PlayerEntity 怀, StatusEffect 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return 怀.getStatusEffect(怀).getAmplifier() + 1;
   }

   private void renderTntNametag(TntEntity 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = TextRenderer.get();
      NametagUtils.begin(怀.fd_Vec3_864);
      怀 怀 = ticksToTime(怀.getFuse());
      怀 怀 = 怀.getWidth(怀, true);
      怀 怀 = 怀.getHeight(true);
      怀 怀 = 怀 / 2.0D;
      怀.drawBg(-怀, -怀, 怀, 怀);
      怀.beginBig();
      怀 怀 = -怀;
      怀 怀 = -怀;
      怀.render(怀, 怀, 怀, (Color)怀.sSSsSssssssssSSssSSSsSSsSSssSsSsSSsSsSsSSSsssssSsSSssSSsSSSSsssSSssssssssssssssSsSSSSSSSSSSssSssSSsSsSSssSSssssss.get(), true);
      怀.end();
      NametagUtils.end();
   }

   public String getInfoString() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      return Integer.toString(怀.getRenderCount());
   }

   public NametagsPlus() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super(Class68.fd_Category_1062, "nametags-plus", "Cooler nametags.");
      怀.fd_SettingGroup_854 = 怀.settings.getDefaultGroup();
      怀.fd_SettingGroup_850 = 怀.settings.createGroup("Players");
      怀.fd_SettingGroup_836 = 怀.settings.createGroup("Items");
      怀.fd_SettingGroup_859 = 怀.settings.createGroup("Colors");
      怀.fd_Setting_847 = 怀.fd_SettingGroup_854.add(((Builder)((Builder)((Builder)(new Builder()).name("entities")).description("Select entities to draw nametags on.")).defaultValue(Utils.asO2BMap(new EntityType[]{EntityType.PLAYER, EntityType.ITEM}))).build());
      怀.fd_Setting_856 = 怀.fd_SettingGroup_854.add(((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)(new meteordevelopment.meteorclient.settings.DoubleSetting.Builder()).name("scale")).description("The scale of the nametag.")).defaultValue(1.5D).min(0.1D).build());
      怀.fd_Setting_839 = 怀.fd_SettingGroup_854.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("self")).description("Displays a nametag on your player if you're in Freecam.")).defaultValue(true)).build());
      怀.fd_Setting_868 = 怀.fd_SettingGroup_854.add(((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)(new meteordevelopment.meteorclient.settings.ColorSetting.Builder()).name("background-color")).description("The color of the nametag background.")).defaultValue(new SettingColor(0, 0, 0, 75))).build());
      怀.sSSsSssssssssSSssSSSsSSsSSssSsSsSSsSsSsSSSsssssSsSSssSSsSSSSsssSSssssssssssssssSsSSSSSSSSSSssSssSSsSsSSssSSssssss = 怀.fd_SettingGroup_854.add(((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)((meteordevelopment.meteorclient.settings.ColorSetting.Builder)(new meteordevelopment.meteorclient.settings.ColorSetting.Builder()).name("primary-color")).description("The color of the nametag names.")).defaultValue(new SettingColor())).build());
      怀.fd_Setting_838 = 怀.fd_SettingGroup_854.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("culling")).description("Only render a certain number of nametags at a certain distance.")).defaultValue(false)).build());
      SettingGroup var10001 = 怀.fd_SettingGroup_854;
      meteordevelopment.meteorclient.settings.DoubleSetting.Builder var10002 = ((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)(new meteordevelopment.meteorclient.settings.DoubleSetting.Builder()).name("culling-range")).description("Only render nametags within this distance of your player.")).defaultValue(20.0D).min(0.0D).sliderMax(200.0D);
      Setting var10003 = 怀.fd_Setting_838;
      Objects.requireNonNull(var10003);
      怀.fd_Setting_844 = var10001.add(((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)var10002.visible(var10003::get)).build());
      var10001 = 怀.fd_SettingGroup_854;
      meteordevelopment.meteorclient.settings.IntSetting.Builder var1 = ((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("culling-count")).description("Only render this many nametags.")).defaultValue(50)).min(1).sliderMin(1).sliderMax(100);
      var10003 = 怀.fd_Setting_838;
      Objects.requireNonNull(var10003);
      怀.fd_Setting_852 = var10001.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)var1.visible(var10003::get)).build());
      怀.ppPQQqqQQqqqQpqqPQqQqqpQpQpqQqQpqqQpQqQqPpppQqPpQpPPPpPQpQPQPQPPQ = 怀.fd_SettingGroup_850.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("show-pots")).description("Show if the player has speed/strength.")).defaultValue(false)).build());
      怀.fd_Setting_869 = 怀.fd_SettingGroup_850.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("show-pops")).description("Show the players pops.")).defaultValue(true)).build());
      怀.fd_Setting_862 = 怀.fd_SettingGroup_850.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("show-items")).description("Displays armor and hand items above the name tags.")).defaultValue(true)).build());
      var10001 = 怀.fd_SettingGroup_850;
      var10002 = ((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)(new meteordevelopment.meteorclient.settings.DoubleSetting.Builder()).name("item-spacing")).description("The spacing between items.")).defaultValue(2.0D).min(0.0D).max(10.0D).sliderMax(5.0D);
      var10003 = 怀.fd_Setting_862;
      Objects.requireNonNull(var10003);
      怀.fd_Setting_843 = var10001.add(((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)var10002.visible(var10003::get)).build());
      var10001 = 怀.fd_SettingGroup_850;
      meteordevelopment.meteorclient.settings.BoolSetting.Builder var2 = (meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("ignore-empty-slots")).description("Doesn't add spacing where an empty item stack would be.")).defaultValue(true);
      var10003 = 怀.fd_Setting_862;
      Objects.requireNonNull(var10003);
      怀.SSssSssSsS = var10001.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)var2.visible(var10003::get)).build());
      var10001 = 怀.fd_SettingGroup_850;
      var2 = (meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("display-enchants")).description("Displays item enchantments on the items.")).defaultValue(true);
      var10003 = 怀.fd_Setting_862;
      Objects.requireNonNull(var10003);
      怀.fd_Setting_855 = var10001.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)var2.visible(var10003::get)).build());
      var10001 = 怀.fd_SettingGroup_850;
      meteordevelopment.meteorclient.settings.EnumSetting.Builder var3 = (meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("enchantment-position")).description("Where the enchantments are rendered.")).defaultValue(NametagsPlus$Position.fd_Position_873);
      var10003 = 怀.fd_Setting_855;
      Objects.requireNonNull(var10003);
      怀.fd_Setting_865 = var10001.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)var3.visible(var10003::get)).build());
      var10001 = 怀.fd_SettingGroup_850;
      var1 = ((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)((meteordevelopment.meteorclient.settings.IntSetting.Builder)(new meteordevelopment.meteorclient.settings.IntSetting.Builder()).name("enchant-name-length")).description("The length enchantment names are trimmed to.")).defaultValue(3)).min(1).max(5).sliderMin(0).sliderMax(5);
      var10003 = 怀.fd_Setting_855;
      Objects.requireNonNull(var10003);
      怀.fd_Setting_840 = var10001.add(((meteordevelopment.meteorclient.settings.IntSetting.Builder)var1.visible(var10003::get)).build());
      var10001 = 怀.fd_SettingGroup_850;
      meteordevelopment.meteorclient.settings.EnchantmentListSetting.Builder var4 = (meteordevelopment.meteorclient.settings.EnchantmentListSetting.Builder)((meteordevelopment.meteorclient.settings.EnchantmentListSetting.Builder)((meteordevelopment.meteorclient.settings.EnchantmentListSetting.Builder)(new meteordevelopment.meteorclient.settings.EnchantmentListSetting.Builder()).name("ignored-enchantments")).description("The enchantments that aren't shown on nametags.")).defaultValue(new ArrayList());
      var10003 = 怀.fd_Setting_855;
      Objects.requireNonNull(var10003);
      怀.fd_Setting_857 = var10001.add(((meteordevelopment.meteorclient.settings.EnchantmentListSetting.Builder)var4.visible(var10003::get)).build());
      var10001 = 怀.fd_SettingGroup_850;
      var10002 = ((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)(new meteordevelopment.meteorclient.settings.DoubleSetting.Builder()).name("enchant-text-scale")).description("The scale of the enchantment text.")).defaultValue(1.0D).min(0.1D).max(2.0D).sliderMin(0.1D).sliderMax(2.0D);
      var10003 = 怀.fd_Setting_855;
      Objects.requireNonNull(var10003);
      怀.fd_Setting_870 = var10001.add(((meteordevelopment.meteorclient.settings.DoubleSetting.Builder)var10002.visible(var10003::get)).build());
      怀.fd_Setting_863 = 怀.fd_SettingGroup_850.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("gamemode")).description("Shows the player's game mode.")).defaultValue(true)).build());
      怀.fd_Setting_861 = 怀.fd_SettingGroup_850.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("ping")).description("Shows the player's ping.")).defaultValue(true)).build());
      怀.fd_Setting_849 = 怀.fd_SettingGroup_850.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("distance")).description("Shows the distance between you and the player.")).defaultValue(true)).build());
      怀.fd_Setting_845 = 怀.fd_SettingGroup_859.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("strength-color")).defaultValue(Class24_Enum.fd_Class24_Enum_937)).build());
      怀.fd_Setting_851 = 怀.fd_SettingGroup_859.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("speed-color")).defaultValue(Class24_Enum.fd_Class24_Enum_932)).build());
      怀.fd_Setting_837 = 怀.fd_SettingGroup_859.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("pops-color")).defaultValue(Class24_Enum.QqQPqpQqqqpPpPQQPp)).build());
      怀.fd_Setting_867 = 怀.fd_SettingGroup_859.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("game-mode-color")).defaultValue(Class24_Enum.fd_Class24_Enum_936)).build());
      怀.fd_Setting_853 = 怀.fd_SettingGroup_859.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("ping-color")).defaultValue(Class24_Enum.fd_Class24_Enum_932)).build());
      怀.fd_Setting_842 = 怀.fd_SettingGroup_859.add(((meteordevelopment.meteorclient.settings.EnumSetting.Builder)((meteordevelopment.meteorclient.settings.EnumSetting.Builder)(new meteordevelopment.meteorclient.settings.EnumSetting.Builder()).name("distance-color")).defaultValue(Class24_Enum.fd_Class24_Enum_931)).build());
      怀.fd_Setting_848 = 怀.fd_SettingGroup_836.add(((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)((meteordevelopment.meteorclient.settings.BoolSetting.Builder)(new meteordevelopment.meteorclient.settings.BoolSetting.Builder()).name("show-count")).description("Displays the number of items in the stack.")).defaultValue(true)).build());
      怀.fd_Vec3_864 = new Vec3();
      怀.fd_array_841 = new double[6];
      怀.fd_Map_858 = new HashMap();
      怀.fd_List_846 = new ArrayList();
      怀.fd_array_866 = new String[]{"Wide_Cat", "osshe5", "VenomN4"};
   }

   static {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      fd_StatusEffect_860 = StatusEffect.byRawId(1);
      PpPQPppQqPQPPqqPppPQpPPPpQppqQQqPppPppQqPpqPpppqPPQQqQpQPPpPQQqPqqPppQQQpqpppPpqQpqQQPqqP = StatusEffect.byRawId(5);
   }

   private double getHeight(Entity 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = (double)怀.getEyeHeight(怀.getPose());
      if (怀.getType() != EntityType.ITEM && 怀.getType() != EntityType.ITEM_FRAME) {
         怀 += 0.5D;
      } else {
         怀 += 0.2D;
      }

      return 怀;
   }

   private static String ticksToTime(int 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      int 怀;
      if (怀 > 72000) {
         怀 = 怀 / 20 / 3600;
         return 怀 + " h";
      } else if (怀 > 1200) {
         怀 = 怀 / 20 / 60;
         return 怀 + " m";
      } else {
         怀 = 怀 / 20;
         怀 怀 = 怀 % 20 / 2;
         return 怀 + "." + 怀 + " s";
      }
   }

   private void renderNametagPlayer(PlayerEntity 怀) {
      // $FF: Couldn't be decompiled
   }

   private void drawBg(double 怀, double 怀, double 怀, double 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      Renderer2D.COLOR.begin();
      Renderer2D.COLOR.quad(怀 - 1.0D, 怀 - 1.0D, 怀 + 2.0D, 怀 + 2.0D, (Color)怀.fd_Setting_868.get());
      Renderer2D.COLOR.render((MatrixStack)null);
   }

   private ItemStack getItem(PlayerEntity 怀, int 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      ItemStack var3;
      switch(怀) {
      case 0:
         var3 = 怀.getMainHandStack();
         break;
      case 1:
         var3 = (ItemStack)怀.getInventory().armor.get(3);
         break;
      case 2:
         var3 = (ItemStack)怀.getInventory().armor.get(2);
         break;
      case 3:
         var3 = (ItemStack)怀.getInventory().armor.get(1);
         break;
      case 4:
         var3 = (ItemStack)怀.getInventory().armor.get(0);
         break;
      case 5:
         var3 = 怀.getOffHandStack();
         break;
      default:
         var3 = ItemStack.EMPTY;
      }

      return var3;
   }

   @EventHandler
   private void onRender2D(Render2DEvent 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = 怀.getRenderCount();

      for(int 怀 = 怀 - 1; 怀 > -1; --怀) {
         怀 怀 = (Entity)怀.fd_List_846.get(怀);
         怀.fd_Vec3_864.set(怀, (double)怀.tickDelta);
         怀.fd_Vec3_864.add(0.0D, 怀.getHeight(怀), 0.0D);
         怀 怀 = 怀.getType();
         if (NametagUtils.to2D(怀.fd_Vec3_864, (Double)怀.fd_Setting_856.get())) {
            if (怀 == EntityType.PLAYER) {
               怀.renderNametagPlayer((PlayerEntity)怀);
            } else if (怀 == EntityType.ITEM) {
               怀.renderNametagItem(((ItemEntity)怀).getStack());
            } else if (怀 == EntityType.ITEM_FRAME) {
               怀.renderNametagItem(((ItemFrameEntity)怀).getHeldItemStack());
            } else if (怀 == EntityType.TNT) {
               怀.renderTntNametag((TntEntity)怀);
            } else if (怀 instanceof LivingEntity) {
               怀.renderGenericNametag((LivingEntity)怀);
            }
         }
      }

   }
}
