/* Decompiler 13ms, total 149ms, lines 145 */
package me.ghosttypes.ion.utils.network;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;

public class Class38 {
   private boolean LjJIIJiILLIJiJ;
   private String fd_String_994;
   private List<Class40> fd_List_995;
   private final String fd_String_996;
   private String fd_String_997;
   private String fd_String_998;

   public void addEmbed(Class40 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀.fd_List_995.add(怀);
   }

   public void execute() throws IOException {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      if (怀.fd_String_997 == null && 怀.fd_List_995.isEmpty()) {
         throw new IllegalArgumentException("Set content or add at least one EmbedObject");
      } else {
         怀 怀 = new Class34(怀);
         怀.put("content", 怀.fd_String_997);
         怀.put("username", 怀.fd_String_998);
         怀.put("avatar_url", 怀.fd_String_994);
         怀.put("tts", 怀.LjJIIJiILLIJiJ);
         if (!怀.fd_List_995.isEmpty()) {
            怀 怀 = new ArrayList();
            Iterator var3 = 怀.fd_List_995.iterator();

            while(var3.hasNext()) {
               怀 怀 = (Class40)var3.next();
               怀 怀 = new Class34(怀);
               怀.put("title", 怀.getTitle());
               怀.put("description", 怀.getDescription());
               怀.put("url", 怀.getUrl());
               if (怀.getColor() != null) {
                  怀 怀 = 怀.getColor();
                  怀 怀 = 怀.getRed();
                  怀 = (怀 << 8) + 怀.getGreen();
                  怀 = (怀 << 8) + 怀.getBlue();
                  怀.put("color", 怀);
               }

               怀 怀 = 怀.getFooter();
               怀 怀 = 怀.getImage();
               怀 怀 = 怀.getThumbnail();
               怀 怀 = 怀.getAuthor();
               怀 怀 = 怀.getFields();
               Class34 怀;
               if (怀 != null) {
                  怀 = new Class34(怀);
                  怀.put("text", 怀.getText());
                  怀.put("icon_url", 怀.getIconUrl());
                  怀.put("footer", 怀);
               }

               if (怀 != null) {
                  怀 = new Class34(怀);
                  怀.put("url", 怀.getUrl());
                  怀.put("image", 怀);
               }

               if (怀 != null) {
                  怀 = new Class34(怀);
                  怀.put("url", 怀.getUrl());
                  怀.put("thumbnail", 怀);
               }

               if (怀 != null) {
                  怀 = new Class34(怀);
                  怀.put("name", 怀.getName());
                  怀.put("url", 怀.getUrl());
                  怀.put("icon_url", 怀.getIconUrl());
                  怀.put("author", 怀);
               }

               怀 怀 = new ArrayList();
               Iterator var12 = 怀.iterator();

               while(var12.hasNext()) {
                  怀 怀 = (Class36)var12.next();
                  怀 怀 = new Class34(怀);
                  怀.put("name", 怀.getName());
                  怀.put("value", 怀.getValue());
                  怀.put("inline", 怀.isInline());
                  怀.add(怀);
               }

               怀.put("fields", 怀.toArray());
               怀.add(怀);
            }

            怀.put("embeds", 怀.toArray());
         }

         怀 怀 = new URL(怀.fd_String_996);
         怀 怀 = (HttpsURLConnection)怀.openConnection();
         怀.addRequestProperty("Content-Type", "application/json");
         怀.addRequestProperty("User-Agent", "Ion");
         怀.setDoOutput(true);
         怀.setRequestMethod("POST");
         怀 怀 = 怀.getOutputStream();
         怀.write(怀.toString().getBytes());
         怀.flush();
         怀.close();
         怀.getInputStream().close();
         怀.disconnect();
      }
   }

   public Class38(String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      super();
      怀.fd_List_995 = new ArrayList();
      怀.fd_String_996 = 怀;
   }

   public void setUsername(String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀.fd_String_998 = 怀;
   }

   public void setAvatarUrl(String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀.fd_String_994 = 怀;
   }

   public void setTts(boolean 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀.LjJIIJiILLIJiJ = 怀;
   }

   public void setContent(String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀.fd_String_997 = 怀;
   }
}
