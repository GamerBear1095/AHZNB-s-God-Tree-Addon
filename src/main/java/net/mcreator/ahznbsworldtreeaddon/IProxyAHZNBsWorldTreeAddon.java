package net.mcreator.ahznbsworldtreeaddon;

public interface IProxyAHZNBsWorldTreeAddon {
	void preInit(FMLPreInitializationEvent event);

	void init(FMLInitializationEvent event);

	void postInit(FMLPostInitializationEvent event);

	void serverLoad(FMLServerStartingEvent event);
}
