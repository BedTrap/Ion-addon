/* Decompiler 7ms, total 154ms, lines 92 */
package me.ghosttypes.ion.utils.network;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.authlib.properties.PropertyMap;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import me.ghosttypes.ion.Ion;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.mixin.MinecraftClientAccessor;
import net.minecraft.client.util.Session;
import net.minecraft.client.util.Session.class_321;

public class Class39 {
   public static boolean isTokenValid(String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = new JsonObject();
      怀.addProperty("accessToken", 怀);
      怀 怀 = (HttpURLConnection)(new URL("https://authserver.mojang.com/validate")).openConnection();
      怀.setRequestMethod("POST");
      怀.setRequestProperty("Content-Type", "application/json");
      怀.setDoOutput(true);
      怀 怀 = 怀.getOutputStream();
      怀.write(怀.toString().getBytes(StandardCharsets.UTF_8));
      怀 怀 = 怀.getResponseCode();
      HttpURLConnection var6 = 怀;

      try {
         var6.disconnect();
         return 怀 == 204;
      } catch (Exception var5) {
         Ion.log("[TokenLogin] " + var5);
         return false;
      }
   }

   public static String getUUID(String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = new StringBuilder();
      怀 怀 = new URL("https://api.mojang.com/users/profiles/minecraft/" + 怀);
      怀 怀 = new BufferedReader(new InputStreamReader(怀.openStream()));
      byte[] var7 = new byte[0];
      new String(var7);

      String 怀;
      while((怀 = 怀.readLine()) != null) {
         怀.append(怀);
      }

      怀.close();
      怀 怀 = (new JsonParser()).parse(怀.toString()).getAsJsonObject();
      JsonElement var9 = 怀.get("id");

      try {
         return var9.getAsString();
      } catch (Exception var8) {
         Ion.log("[TokenLogin] " + var8);
         return null;
      }
   }

   public Class39() {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
   }

   public static boolean setSession(String 怀, String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀 怀 = getUUID(怀);
      if (怀 == null) {
         return false;
      } else {
         怀 怀 = new Session(怀, 怀, 怀, Optional.empty(), Optional.empty(), class_321.MOJANG);
         ((MinecraftClientAccessor)MeteorClient.mc).setSession(怀);
         PropertyMap var5 = MeteorClient.mc.getSessionProperties();

         try {
            var5.clear();
            return true;
         } catch (Exception var4) {
            Ion.log("[TokenLogin] " + var4);
            return false;
         }
      }
   }
}
