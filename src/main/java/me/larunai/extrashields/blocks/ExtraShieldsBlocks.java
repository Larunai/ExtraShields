package me.larunai.extrashields.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ExtraShieldsBlocks {
	
	public static Block testdummyBlock = new ExtraShieldsBlock("testdummyBlock", Material.rock, 3, 15);
	
	public static void initBlocks() {
		
		registerBlock((ExtraShieldsBlock) testdummyBlock);
		
	}
	
	public static void registerBlock(ExtraShieldsBlock block) {
		
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		
	}

}
