package me.larunai.extrashields;

import me.larunai.extrashields.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = ExtraShieldsGlobal.MOD_ID, name = ExtraShieldsGlobal.MOD_NAME, version = ExtraShieldsGlobal.VERSION)
public class ExtraShields {
	
	@Instance(ExtraShieldsGlobal.MOD_ID)
	public static ExtraShields instance;
	
	@SidedProxy(clientSide = ExtraShieldsGlobal.EXTRASHIELDS_CLIENT_PROXY, serverSide = ExtraShieldsGlobal.EXTRASHIELDS_COMMON_PROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent preEvent) {
		
		this.proxy.preInit(preEvent);
		
	}
	
	@EventHandler
	public void init (FMLInitializationEvent event) {
		
		this.proxy.init(event);
		
	}
	
	@EventHandler
	public void postInit (FMLPostInitializationEvent postEvent) {
		
		this.proxy.postInit(postEvent);
		
	}

}
