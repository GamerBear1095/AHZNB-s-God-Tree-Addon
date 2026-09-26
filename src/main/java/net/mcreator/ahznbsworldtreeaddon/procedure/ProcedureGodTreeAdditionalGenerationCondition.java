package net.mcreator.ahznbsworldtreeaddon.procedure;

import net.minecraft.world.World;

import net.mcreator.ahznbsworldtreeaddon.ElementsAhznbsworldtreeaddonMod;
import net.mcreator.ahznbsworldtreeaddon.AhznbsworldtreeaddonModVariables;

import java.util.Random;
import java.util.Map;

@ElementsAhznbsworldtreeaddonMod.ModElement.Tag
public class ProcedureGodTreeAdditionalGenerationCondition extends ElementsAhznbsworldtreeaddonMod.ModElement {
	public ProcedureGodTreeAdditionalGenerationCondition(ElementsAhznbsworldtreeaddonMod instance) {
		super(instance, 5);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure GodTreeAdditionalGenerationCondition!");
			return false;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure GodTreeAdditionalGenerationCondition!");
			return false;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure GodTreeAdditionalGenerationCondition!");
			return false;
		}
		int x = (int) dependencies.get("x");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double Random = 0;
		if (((x == ((world.getSpawnPoint().getX()) + (AhznbsworldtreeaddonModVariables.MapVariables.get(world).treeSpawnLocX)))
				&& (z == ((world.getSpawnPoint().getZ()) + (AhznbsworldtreeaddonModVariables.MapVariables.get(world).treeSpawnLocZ))))) {
			if ((!(AhznbsworldtreeaddonModVariables.MapVariables.get(world).godTreeHasSpawned))) {
				return (true);
			}
		}
		return (false);
	}
}
