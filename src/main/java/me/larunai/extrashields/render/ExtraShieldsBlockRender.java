package me.larunai.extrashields.render;

import me.larunai.extrashields.ExtraShieldsGlobal;
import me.larunai.extrashields.blocks.ExtraShieldsBlocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class ExtraShieldsBlockRender {
	
	public static void registerBlockRender() {
		
		regBlock(ExtraShieldsBlocks.testdummyBlock);
		
	}

	public static void regBlock(Block block) {
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
		
	}
	
}
