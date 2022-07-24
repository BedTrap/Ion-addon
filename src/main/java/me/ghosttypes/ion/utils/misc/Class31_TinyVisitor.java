/* Decompiler 4ms, total 146ms, lines 47 */
package me.ghosttypes.ion.utils.misc;

import java.util.HashMap;
import java.util.Map;
import net.fabricmc.mapping.reader.v2.MappingGetter;
import net.fabricmc.mapping.reader.v2.TinyMetadata;
import net.fabricmc.mapping.reader.v2.TinyVisitor;

class Class31_TinyVisitor implements TinyVisitor {
   // $FF: synthetic field
   final Map fd_Map_977;
   private final Map<String, Integer> fd_Map_978;

   Class31_TinyVisitor(Map var1) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀.fd_Map_977 = var1;
      super();
      怀.fd_Map_978 = new HashMap();
   }

   public void pushClass(MappingGetter 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀.addMappings(怀);
   }

   private void addMappings(MappingGetter 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀.fd_Map_977.put(怀.get((Integer)怀.fd_Map_978.get("intermediary")).replace('/', '.'), 怀.get((Integer)怀.fd_Map_978.get("named")).replace('/', '.'));
   }

   public void pushField(MappingGetter 怀, String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀.addMappings(怀);
   }

   public void start(TinyMetadata 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀.fd_Map_978.put("intermediary", 怀.index("intermediary"));
      怀.fd_Map_978.put("named", 怀.index("named"));
   }

   public void pushMethod(MappingGetter 怀, String 怀) {
      String var10000 = "YOUR_MOTHER_IS_GAY_ION_ON_TOP_COPE";
      怀.addMappings(怀);
   }
}
