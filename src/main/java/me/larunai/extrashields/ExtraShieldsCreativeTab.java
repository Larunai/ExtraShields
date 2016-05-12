package me.larunai.extrashields;

import me.larunai.extrashields.items.ExtraShieldsItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ExtraShieldsCreativeTab extends CreativeTabs {

	public ExtraShieldsCreativeTab(String string) {
		super(string);
		
	}
	
	public Item getTabIconItem() {
		return ExtraShieldsItems.testdummyItem;
	}
	
}
