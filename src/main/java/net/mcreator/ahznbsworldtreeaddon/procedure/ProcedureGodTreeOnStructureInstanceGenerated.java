package net.mcreator.ahznbsworldtreeaddon.procedure;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;

import net.mcreator.ahznbsworldtreeaddon.ElementsAhznbsworldtreeaddonMod;
import net.mcreator.ahznbsworldtreeaddon.AhznbsworldtreeaddonModVariables;

import java.util.Map;

@ElementsAhznbsworldtreeaddonMod.ModElement.Tag
public class ProcedureGodTreeOnStructureInstanceGenerated extends ElementsAhznbsworldtreeaddonMod.ModElement {
	public ProcedureGodTreeOnStructureInstanceGenerated(ElementsAhznbsworldtreeaddonMod instance) {
		super(instance, 5);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure GodTreeOnStructureInstanceGenerated!");
			return;
		}
		World world = (World) dependencies.get("world");
		AhznbsworldtreeaddonModVariables.MapVariables.get(world).godTreeHasSpawned = (boolean) (true);
		AhznbsworldtreeaddonModVariables.MapVariables.get(world).syncData(world);
	}

	@SubscribeEvent
	public void onWorldLoad(WorldEvent.Load event) {
		World world = event.getWorld();
		java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
		dependencies.put("world", world);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
