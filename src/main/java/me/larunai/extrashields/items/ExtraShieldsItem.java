package me.larunai.extrashields.items;

import me.larunai.extrashields.ExtraShieldsGlobal;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ExtraShieldsItem extends Item {
	
	public ExtraShieldsItem(String name) {
		super();
		
		this.setCreativeTab(ExtraShieldsGlobal.extrashieldsCreativeTab);
		this.setUnlocalizedName(name);
		
	}

}
