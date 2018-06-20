package tk.hywt.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import tk.hywt.block.CSTTNT;
import tk.hywt.block.HywtBlocks;
import tk.hywt.item.HywtItems;

public class HywtRecipes {
	public static void init()
    {
		GameRegistry.addRecipe(new ItemStack(HywtItems.QiuPickaxe), "XXX", " Y ", " Y ", 'X', HywtItems.Qiu, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(HywtItems.QiuAxe), "XX ", "XY ", " Y ", 'X', HywtItems.Qiu, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(HywtItems.QiuAxe), " XX", " YX", " Y ", 'X', HywtItems.Qiu, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(HywtItems.QiuHoe), "XX ", " Y ", " Y ", 'X', HywtItems.Qiu, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(HywtItems.QiuHoe), " XX", " Y ", " Y ", 'X', HywtItems.Qiu, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(HywtItems.QiuShovel), " X ", " Y ", " Y ", 'X', HywtItems.Qiu, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(HywtItems.QiuSword), " X ", " X ", " Y ", 'X', HywtItems.Qiu, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(HywtBlocks.QiuBlock), "XXX", "XXX", "XXX", 'X', HywtItems.Qiu);
		GameRegistry.addRecipe(new ItemStack(HywtItems.QiuFood,8), "XXX", "XaX", "XXX", 'a', HywtItems.Qiu,'X',Items.paper);
		GameRegistry.addShapelessRecipe(new ItemStack(HywtItems.Qiu, 9), new Object[] { HywtBlocks.QiuBlock });
		GameRegistry.addRecipe(new ItemStack(CSTTNT.block, 1), new Object[]{
				"X1X", "345", "X7X", Character.valueOf('1'), new ItemStack(Items.blaze_rod, 1), Character.valueOf('3'), new ItemStack(Items.blaze_rod, 1), Character.valueOf('4'), new ItemStack(Blocks.tnt, 1), Character.valueOf('5'), new ItemStack(Items.blaze_rod, 1), Character.valueOf('7'), new ItemStack(Items.blaze_rod, 1), 
			});
    }
}
