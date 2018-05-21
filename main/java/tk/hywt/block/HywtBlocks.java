package tk.hywt.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.MinecraftForge;
import tk.hywt.lib.RefStrings;
import tk.hywt.tab.HywtTabs;

public class HywtBlocks {
	public static void mainRegistry() {
		   initializeItem();
		   registerItem();
	   }
	public static Block test_block;
	public static Block QiuBlock;
	   public static void initializeItem() {
		 QiuBlock=new QiuBlock(Material.iron).setBlockName("qiuBlock").setCreativeTab(HywtTabs.qiu).setBlockTextureName(RefStrings.modid+":qiu_block").setHardness(3f).setResistance(30F);
		   test_block = new TestBlock(Material.ground).setBlockName("testBlock").setCreativeTab(HywtTabs.MiscTab).setBlockTextureName(RefStrings.modid+":test_block").setHardness(3f);
	   }
	   public static void registerItem() {
			  GameRegistry.registerBlock(test_block,"test_block");
			  GameRegistry.registerBlock(QiuBlock,"qiu_block");
	   }
	}

