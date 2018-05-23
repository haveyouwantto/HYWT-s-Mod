package tk.hywt.item;

import net.minecraft.item.Item;
import tk.hywt.lib.RefStrings;
import tk.hywt.tab.HywtTabs;

public class CGItem extends Item {
	public static Item get( String i ) 
	{
		return new Item().setUnlocalizedName(i).setCreativeTab(HywtTabs.cgItem).setTextureName(RefStrings.modid+":"+i);
	}
}
