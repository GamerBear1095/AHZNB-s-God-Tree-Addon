
package net.mcreator.ahznbsworldtreeaddon.util;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.util.ResourceLocation;

import net.mcreator.ahznbsworldtreeaddon.ElementsAhznbsworldtreeaddonMod;

@ElementsAhznbsworldtreeaddonMod.ModElement.Tag
public class LootTableGodTreeFruitLootTable extends ElementsAhznbsworldtreeaddonMod.ModElement {
	public LootTableGodTreeFruitLootTable(ElementsAhznbsworldtreeaddonMod instance) {
		super(instance, 2);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		LootTableList.register(new ResourceLocation("ahznbsworldtreeaddon", "blocks/god_tree_fruit"));
	}
}
