package tk.hywt.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import tk.hywt.item.HywtItems;

public class cgItem extends CreativeTabs {

	public cgItem(String lable) {
		super(lable);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return HywtItems.Cg;
	}

}
