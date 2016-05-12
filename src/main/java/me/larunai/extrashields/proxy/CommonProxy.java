package me.larunai.extrashields.proxy;

import me.larunai.extrashields.blocks.ExtraShieldsBlocks;
import me.larunai.extrashields.items.ExtraShieldsItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent preEvent) {
		
		ExtraShieldsBlocks.initBlocks();
		ExtraShieldsItems.initItems();
	}
	
	public void init(FMLInitializationEvent event) {
		
	}
	
	public void postInit(FMLPostInitializationEvent postEvent) {
		
	}
}
