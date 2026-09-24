package net.mcreator.ahznbsworldtreeaddon;

public class ClientProxyAHZNBsWorldTreeAddon implements IProxyAHZNBsWorldTreeAddon {
	@Override
	public void init(FMLInitializationEvent event) {
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		OBJLoader.INSTANCE.addDomain("ahznbsworldtreeaddon");
	}

	@Override
	public void postInit(FMLPostInitializationEvent event) {
	}

	@Override
	public void serverLoad(FMLServerStartingEvent event) {
	}
}
