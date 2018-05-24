package tk.hywt.entity;

import cpw.mods.fml.common.registry.EntityRegistry;
import tk.hywt.lib.RefStrings;
import tk.hywt.tab.MiscTab;

public class HywtEntities {
	public static void init() {
		EntityRegistry.registerModEntity(EntityRocket.class, "Rocket", 0, RefStrings.modid, 64, 10, true);
		EntityRegistry.registerModEntity(EntityBomb.class, "TNT", 1, RefStrings.modid, 64, 10, true);
		EntityRegistry.registerModEntity(EntityTorch.class, "Torch", 2, RefStrings.modid, 64, 10, true);
	  }
}
