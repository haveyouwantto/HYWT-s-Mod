package tk.hywt.item;

import net.minecraft.item.Item;
import tk.hywt.lib.RefStrings;
import tk.hywt.tab.HywtTabs;

public class AGItem extends Item {
	public static Item ags( String i ) 
	{
		return new Item().setUnlocalizedName(i).setCreativeTab(HywtTabs.MiscTab).setTextureName(RefStrings.modid+":"+i);
	}
}
