package me.larunai.extrashields.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ExtraShieldsItems {
	
	public static Item testdummyItem;
	
	public static void initItems() {
		
		GameRegistry.registerItem(testdummyItem = new ExtraShieldsItem("testdummyItem"), "testdummyItem");
		
	}

}
