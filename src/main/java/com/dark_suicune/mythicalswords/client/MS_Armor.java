package com.dark_suicune.mythicalswords.client;

import com.dark_suicune.mythicalswords.MythicalSwords;
import com.dark_suicune.mythicalswords.item.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MS_Armor extends CreativeTabs {
	
	public MS_Armor() {
		super("armor");
		setBackgroundImageName("MS_Materials.png");
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.melonchestplate;
	}

}
