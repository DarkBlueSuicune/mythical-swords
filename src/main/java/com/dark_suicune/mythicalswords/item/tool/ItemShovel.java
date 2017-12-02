package com.dark_suicune.mythicalswords.item.tool;

import com.dark_suicune.mythicalswords.MythicalSwords;
import com.dark_suicune.mythicalswords.item.ItemModelProvider;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemShovel extends net.minecraft.item.ItemSpade implements ItemModelProvider {
	
	private String name;

	public ItemShovel(ToolMaterial material, String name) {
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
	public ItemShovel setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
