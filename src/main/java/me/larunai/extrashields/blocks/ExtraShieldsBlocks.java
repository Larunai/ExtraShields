package me.larunai.extrashields.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ExtraShieldsBlocks {
	
	public static Block testdummyBlock;
	
	public static void initBlocks() {
		
		GameRegistry.registerBlock(testdummyBlock = new ExtraShieldsBlock("testdummyBlock", Material.rock, 3, 15), "testdummyBlock");
		
	}

}
