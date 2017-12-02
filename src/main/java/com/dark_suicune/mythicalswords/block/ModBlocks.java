package com.dark_suicune.mythicalswords.block;

import com.dark_suicune.mythicalswords.block.pedestal.BlockPedestal;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static BlockOre nathiteore;
	public static BlockOre blacksteelore;
	
	public static BlockPedestal pedestal;
	
public static void init() {
		
	nathiteore = register(new BlockOre("nathiteore"));
	blacksteelore = register(new BlockOre("blacksteelore"));
	
	pedestal = register(new BlockPedestal());
	
	}

	private static <T extends Block> T register(T block, ItemBlock itemBlock) {
		GameRegistry.register(block);
		GameRegistry.register(itemBlock);

		if (block instanceof BlockBase) {
			((BlockBase)block).registerItemModel(itemBlock);
		}
		
		if (block instanceof BlockOre) {
			((BlockOre)block).registerItemModel(itemBlock);
		}
		
		if (block instanceof BlockTileEntity) {
			GameRegistry.registerTileEntity(((BlockTileEntity<?>)block).getTileEntityClass(), block.getRegistryName().toString());
		}

		return block;
	}

	private static <T extends Block> T register(T block) {
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(block.getRegistryName());
		return register(block, itemBlock);
	}


}
