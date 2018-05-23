package tk.hywt.item;

import java.util.ArrayList;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import tk.hywt.lib.RefStrings;
import tk.hywt.tab.HywtTabs;

public class AutoRegisterItem {
	public static void ag(){
	for (int j = 1; j<10; j++){
		ToolMaterial cgm = EnumHelper.addToolMaterial(String.valueOf(j), 4, j*32, 2f, j-2, 10);
		Item newI=CGSword.get(j,String.valueOf(j),cgm);
		GameRegistry.registerItem(newI, "cg_sword_"+j);
	}
}}
