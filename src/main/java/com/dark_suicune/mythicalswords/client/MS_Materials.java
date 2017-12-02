package com.dark_suicune.mythicalswords.client;

import com.dark_suicune.mythicalswords.MythicalSwords;
import com.dark_suicune.mythicalswords.item.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MS_Materials extends CreativeTabs {
	
	public MS_Materials() {
		super("materials");
		setBackgroundImageName("MS_Materials.png");
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.blacksteel;
	}

}
