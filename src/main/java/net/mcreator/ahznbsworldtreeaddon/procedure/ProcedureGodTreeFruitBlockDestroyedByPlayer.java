package net.mcreator.ahznbsworldtreeaddon.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.Entity;
import net.narutomod.item.ItemChakraFruit;

import net.mcreator.ahznbsworldtreeaddon.ElementsAhznbsworldtreeaddonMod;

import java.util.Map;

@ElementsAhznbsworldtreeaddonMod.ModElement.Tag
public class ProcedureGodTreeFruitBlockDestroyedByPlayer extends ElementsAhznbsworldtreeaddonMod.ModElement {
	public ProcedureGodTreeFruitBlockDestroyedByPlayer(ElementsAhznbsworldtreeaddonMod instance) {
		super(instance, 4);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure GodTreeFruitBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure GodTreeFruitBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure GodTreeFruitBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure GodTreeFruitBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure GodTreeFruitBlockDestroyedByPlayer!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((!((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).capabilities.isCreativeMode : false))) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(new ItemChakraFruit(), (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
		}
	}
}
