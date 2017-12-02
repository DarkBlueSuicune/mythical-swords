package com.dark_suicune.mythicalswords.item.tool;

import com.dark_suicune.mythicalswords.MythicalSwords;
import com.dark_suicune.mythicalswords.item.ItemBase;
import com.dark_suicune.mythicalswords.item.ItemModelProvider;

import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.Sound;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.client.event.sound.PlaySoundEvent;
import scala.util.control.Exception.Catch;

public class ItemCatana extends net.minecraft.item.ItemSword implements ItemModelProvider {
	
	private String name;

	public ItemCatana(ToolMaterial material, String name) {
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
	public ItemCatana setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
		//TODO attacker.playSound("mythicalswords:meow", 3F, 1F);
		return super.hitEntity(stack, target, attacker);
	}
}
