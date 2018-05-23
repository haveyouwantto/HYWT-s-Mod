package tk.hywt.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import tk.hywt.lib.RefStrings;
import tk.hywt.tab.HywtTabs;

public class AutoRegisterItem {
	public static void ag(){
	for (int j = 0; j<7; j++){
		
		j=new Item().setUnlocalizedName("a"+j).setCreativeTab(HywtTabs.MiscTab).setTextureName(RefStrings.modid+":a"+j);
		GameRegistry.registerItem(a, "a"+j);
	}
}}
