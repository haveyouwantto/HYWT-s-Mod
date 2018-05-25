package tk.hywt.entity;

import cpw.mods.fml.common.registry.EntityRegistry;
import tk.hywt.lib.RefStrings;
import tk.hywt.tab.MiscTab;

public class HywtEntities {
	public static void init() {
		EntityRegistry.registerModEntity(EntityRocket.class, "Rocket", 0, RefStrings.modid, 64, 10, true);
		EntityRegistry.registerModEntity(EntityBullet.class, "Bullet", 1, RefStrings.modid, 64, 10, true);
		EntityRegistry.registerModEntity(EntityDoomsdayRocket.class, "DoomsdayRocket", 1, RefStrings.modid, 64, 10, true);
	  }
}
