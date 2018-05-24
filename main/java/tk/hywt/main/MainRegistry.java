package tk.hywt.main;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import tk.hywt.lib.RefStrings;
import tk.hywt.oregen.OreGen;
import tk.hywt.recipes.HywtRecipes;
import tk.hywt.tab.HywtTabs;
import tk.hywt.block.TestBlock;
import tk.hywt.entity.HywtEntities;
import tk.hywt.item.AutoRegisterItem;
import tk.hywt.item.HywtItems;	
import tk.hywt.block.HywtBlocks;

@Mod(modid = RefStrings.modid, name =RefStrings.name , version =RefStrings.version )
public class MainRegistry {
	@SidedProxy(clientSide =RefStrings.clientSide ,serverSide = RefStrings.serverSide)
	public static ServerProxy proxy;
	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent){
		HywtTabs.initialiseTabs();
		HywtItems.mainRegistry();
		HywtBlocks.mainRegistry();
		HywtRecipes.init();
		HywtEntities.init();
		GameRegistry.registerWorldGenerator(new OreGen(),0);
		AutoRegisterItem.ag();
    proxy.registerRenderInfo();
	}
	@EventHandler
	public static void load(FMLInitializationEvent event){

	}
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PostEvent){
	HywtBlocks.QiuBlock.setHarvestLevel("pickaxe",2);
	HywtBlocks.QiuOre.setHarvestLevel("pickaxe",2);
	}
}
