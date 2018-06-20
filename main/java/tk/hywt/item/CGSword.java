package tk.hywt.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;
import tk.hywt.lib.RefStrings;
import tk.hywt.tab.HywtTabs;

public class CGSword extends Item {
	public static Item cg(int j, String i ,ToolMaterial cgm) 
	{
		class is extends ItemSword{

			public is(ToolMaterial p_i45356_1_) {
				super(p_i45356_1_);
				// TODO Auto-generated constructor stub
			}
			
		}
		return new is(cgm).setUnlocalizedName("cgSword"+i).setTextureName("hywt:cg_sword").setCreativeTab(HywtTabs.cgItem);//Auto-generated Sword Item
		}
	}

