package tk.hywt.item;

import java.util.ArrayList;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import tk.hywt.lib.RefStrings;
import tk.hywt.tab.HywtTabs;

public class AutoRegisterItem {
	public static void ag(){
	for (int j = 0; j<7; j++){
		Item newI=CGItem.get(String.valueOf(j));
		GameRegistry.registerItem(newI, ""+j);
	}
}}
