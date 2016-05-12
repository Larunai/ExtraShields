package me.larunai.extrashields.render;

import me.larunai.extrashields.ExtraShieldsGlobal;
import me.larunai.extrashields.items.ExtraShieldsItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ExtraShieldsItemRender {
	
	public static void registerItemRender() {
		
		regItem(ExtraShieldsItems.testdummyItem);
		
	}

	public static void regItem(Item item) {
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		
	}
}
