package tk.hywt.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import tk.hywt.lib.RefStrings;
import tk.hywt.tab.HywtTabs;

public class HywtItems {
   public static void mainRegistry() {
	   initializeItem();
	   registerItem();
   }
   public static ToolMaterial qiupick = EnumHelper.addToolMaterial("qiupick", 1, 17, 1f, 5, 4);
   public static ToolMaterial qiuaxe = EnumHelper.addToolMaterial("qiuaxe", 2, 121, 3f, 5, 4);
   public static ToolMaterial qiu = EnumHelper.addToolMaterial("qiu", 1, 100, 2.5f, 5, 4);
   public static ToolMaterial qiusword = EnumHelper.addToolMaterial("qiusword", 4, 2916, 16f, 12, 25);
   public static ToolMaterial op = EnumHelper.addToolMaterial("op", 5, 2147483647, 64f, 1E16f, 127);
   public static Item TestIt;
   public static Item Qiu;
   public static Item QiuMonster;
   public static Item QiuFood;
   public static Item QiuSword;
   public static Item QiuPickaxe;
   public static Item QiuAxe;
   public static Item QiuShovel;
   public static Item QiuHoe;
   public static Item OPSword;
   public static void initializeItem() {
	   TestIt=new Item().setUnlocalizedName("testItem").setCreativeTab(HywtTabs.MiscTab).setTextureName(RefStrings.modid+":test_item");
       Qiu= new Item().setUnlocalizedName("qiu").setCreativeTab(HywtTabs.qiu).setTextureName(RefStrings.modid+":qiu");
       QiuFood=new ItemFood(4,false).setUnlocalizedName("qiuFood").setTextureName(RefStrings.modid+":qiu_food").setCreativeTab(HywtTabs.qiu);
       QiuSword= new QiuSword(qiusword).setUnlocalizedName("qiuSword").setCreativeTab(HywtTabs.qiu).setTextureName(RefStrings.modid+":qiu_sword");
       QiuPickaxe= new QiuPickaxe(qiupick).setUnlocalizedName("qiuPickaxe").setCreativeTab(HywtTabs.qiu).setTextureName(RefStrings.modid+":qiu_pickaxe");
       QiuAxe= new QiuAxe(qiuaxe).setUnlocalizedName("qiuAxe").setCreativeTab(HywtTabs.qiu).setTextureName(RefStrings.modid+":qiu_axe");
       QiuShovel=new QiuShovel(qiu).setUnlocalizedName("qiuShovel").setCreativeTab(HywtTabs.qiu).setTextureName(RefStrings.modid+":qiu_shovel");
       QiuMonster=new Item().setUnlocalizedName("qiuMonster").setCreativeTab(HywtTabs.qiu).setTextureName(RefStrings.modid+":qiu_monster");
       QiuHoe=new QiuHoe(qiu).setUnlocalizedName("qiuHoe").setCreativeTab(HywtTabs.qiu).setTextureName(RefStrings.modid+":qiu_hoe");
       OPSword=new OPSword(op).setUnlocalizedName("opSword").setCreativeTab(HywtTabs.MiscTab).setTextureName(RefStrings.modid+":op_sword");
   }
   public static void registerItem() {
	   GameRegistry.registerItem(TestIt, "test_item");
	   GameRegistry.registerItem(Qiu, "qiu");
	   GameRegistry.registerItem(QiuFood, "qiu_food");
	   GameRegistry.registerItem(QiuSword,"qiu_sword");
	   GameRegistry.registerItem(QiuPickaxe, "qiu_pickaxe");
	   GameRegistry.registerItem(QiuAxe, "qiu_axe");
	   GameRegistry.registerItem(QiuHoe, "qiu_hoe");
	   GameRegistry.registerItem(QiuShovel, "qiu_shovel");
	   GameRegistry.registerItem(OPSword,"op_sword");
	   GameRegistry.registerItem(QiuMonster, "qiu_monster");
   }
}
