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
public class ProcedureGodTreeRandomNumberGen extends ElementsAhznbsworldtreeaddonMod.ModElement {
	public ProcedureGodTreeRandomNumberGen(ElementsAhznbsworldtreeaddonMod instance) {
		super(instance, 6);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure GodTreeRandomNumberGen!");
			return;
		}
		World world = (World) dependencies.get("world");
		if (((AhznbsworldtreeaddonModVariables.MapVariables.get(world).godTreeHasSpawned) == (false))) {
			while ((((AhznbsworldtreeaddonModVariables.MapVariables.get(world).treeSpawnLocZ) >= (-2000))
					|| ((AhznbsworldtreeaddonModVariables.MapVariables.get(world).treeSpawnLocZ) <= 2000))) {
				AhznbsworldtreeaddonModVariables.MapVariables.get(world).treeSpawnLocZ = (double) Math
						.floor(((Math.random() * (5000 - (-5000))) + (-5000)));
				AhznbsworldtreeaddonModVariables.MapVariables.get(world).syncData(world);
			}
			while ((((AhznbsworldtreeaddonModVariables.MapVariables.get(world).treeSpawnLocX) >= (-2000))
					|| ((AhznbsworldtreeaddonModVariables.MapVariables.get(world).treeSpawnLocX) <= 2000))) {
				AhznbsworldtreeaddonModVariables.MapVariables.get(world).treeSpawnLocX = (double) Math
						.floor(((Math.random() * (5000 - (-5000))) + (-5000)));
				AhznbsworldtreeaddonModVariables.MapVariables.get(world).syncData(world);
			}
			AhznbsworldtreeaddonModVariables.MapVariables.get(world).WorldGenerated = (boolean) (true);
			AhznbsworldtreeaddonModVariables.MapVariables.get(world).syncData(world);
		}
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
