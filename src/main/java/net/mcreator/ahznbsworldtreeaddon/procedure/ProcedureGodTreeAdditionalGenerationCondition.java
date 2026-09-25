package net.mcreator.ahznbsworldtreeaddon.procedure;

import net.minecraft.world.World;

import net.mcreator.ahznbsworldtreeaddon.ElementsAhznbsworldtreeaddonMod;
import net.mcreator.ahznbsworldtreeaddon.AhznbsworldtreeaddonModVariables;

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
		if (((x <= ((world.getSpawnPoint().getX()) - (-2000))) || (x >= ((world.getSpawnPoint().getX()) + 2000)))) {
			if (((z <= ((world.getSpawnPoint().getZ()) - (-2000))) || (z >= ((world.getSpawnPoint().getZ()) - 2000)))) {
				return (!(AhznbsworldtreeaddonModVariables.MapVariables.get(world).godTreeHasSpawned));
			}
		}
		return (false);
	}
}
