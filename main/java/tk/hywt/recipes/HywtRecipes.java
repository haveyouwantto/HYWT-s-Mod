package tk.hywt.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
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
    }
}
