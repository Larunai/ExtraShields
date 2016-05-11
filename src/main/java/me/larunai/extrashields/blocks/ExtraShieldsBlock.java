package me.larunai.extrashields.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ExtraShieldsBlock extends Block{
	
	public ExtraShieldsBlock(String unlocalizedName, Material material, float hardness, float resistance) {
		super(material);
		
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setUnlocalizedName(unlocalizedName);
		this.setHardness(hardness);
		this.setResistance(resistance);
		
	}

}
