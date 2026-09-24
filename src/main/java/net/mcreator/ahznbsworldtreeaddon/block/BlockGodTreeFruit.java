
package net.mcreator.ahznbsworldtreeaddon.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcreator.ahznbsworldtreeaddon.ElementsAhznbsworldtreeaddonMod;

@ElementsAhznbsworldtreeaddonMod.ModElement.Tag
public class BlockGodTreeFruit extends ElementsAhznbsworldtreeaddonMod.ModElement {
	@GameRegistry.ObjectHolder("ahznbsworldtreeaddon:god_tree_fruit")
	public static final Block block = null;
	public BlockGodTreeFruit(ElementsAhznbsworldtreeaddonMod instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("god_tree_fruit"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("ahznbsworldtreeaddon:god_tree_fruit", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK);
			setUnlocalizedName("god_tree_fruit");
			setSoundType(SoundType.SLIME);
			setHardness(0.5F);
			setResistance(26.5F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(null);
		}

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}
	}
}
