package com.dark_suicune.mythicalswords.client;

import com.dark_suicune.mythicalswords.MythicalSwords;
import com.dark_suicune.mythicalswords.block.BlockOre;
import com.dark_suicune.mythicalswords.block.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MS_Blocks extends CreativeTabs {
	
	public MS_Blocks() {
		super("blocks");
		setBackgroundImageName("MS_Materials.png");
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(ModBlocks.nathiteore);
	}

}
