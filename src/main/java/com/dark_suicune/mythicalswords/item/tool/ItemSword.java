package com.dark_suicune.mythicalswords.item.tool;

import com.dark_suicune.mythicalswords.MythicalSwords;
import com.dark_suicune.mythicalswords.item.ItemBase;
import com.dark_suicune.mythicalswords.item.ItemModelProvider;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemSword extends net.minecraft.item.ItemSword implements ItemModelProvider {
	
	private String name;

	public ItemSword(ToolMaterial material, String name) {
		super(material);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
		setCreativeTab(MythicalSwords.toolsTab);
	}

	@Override
	public void registerItemModel(Item item) {
		MythicalSwords.proxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	public ItemSword setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
