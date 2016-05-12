package me.larunai.extrashields.blocks;

import me.larunai.extrashields.ExtraShieldsGlobal;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ExtraShieldsBlock extends Block{
	
	public ExtraShieldsBlock(String unlocalizedName, Material material, float hardness, float resistance) {
		super(material);
		
		this.setCreativeTab(ExtraShieldsGlobal.extrashieldsCreativeTab);
		this.setUnlocalizedName(unlocalizedName);
		this.setHardness(hardness);
		this.setResistance(resistance);
		
	}

}
