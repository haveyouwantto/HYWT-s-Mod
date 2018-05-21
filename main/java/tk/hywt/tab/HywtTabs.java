package tk.hywt.tab;

import net.minecraft.creativetab.CreativeTabs;

public class HywtTabs {
  public static CreativeTabs MiscTab;
  public static CreativeTabs qiu;
  public static void initialiseTabs() {
	  MiscTab = new MiscTab("miscTab");
	  qiu = new qiu("qiuTab");
  }
}
