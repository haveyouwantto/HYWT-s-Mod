package tk.hywt.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import tk.hywt.item.HywtItems;

public class MiscTab extends CreativeTabs {

	public MiscTab(String lable) {
		super(lable);
		// TODO Auto-generated constructor stub
	}
@Override
public Item getTabIconItem() {
	return HywtItems.TestIt;
}
}
