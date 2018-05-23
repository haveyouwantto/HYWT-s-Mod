package tk.hywt.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import tk.hywt.item.HywtItems;

public class cgItemTab extends CreativeTabs {

	public cgItemTab(String lable) {
		super(lable);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return HywtItems.Cg;
	}

}
