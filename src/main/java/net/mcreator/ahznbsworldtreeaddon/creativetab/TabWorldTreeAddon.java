
package net.mcreator.ahznbsworldtreeaddon.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.ahznbsworldtreeaddon.block.BlockGodTreeFruit;
import net.mcreator.ahznbsworldtreeaddon.ElementsAhznbsworldtreeaddonMod;

@ElementsAhznbsworldtreeaddonMod.ModElement.Tag
public class TabWorldTreeAddon extends ElementsAhznbsworldtreeaddonMod.ModElement {
	public TabWorldTreeAddon(ElementsAhznbsworldtreeaddonMod instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabworld_tree_addon") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockGodTreeFruit.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
