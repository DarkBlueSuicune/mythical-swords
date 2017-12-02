package com.dark_suicune.mythicalswords.item.armor;

import com.dark_suicune.mythicalswords.MythicalSwords;
import com.dark_suicune.mythicalswords.item.ItemModelProvider;
import com.dark_suicune.mythicalswords.item.ModItems;
import com.dark_suicune.mythicalswords.item.tool.ItemSword;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemArmor extends net.minecraft.item.ItemArmor implements ItemModelProvider {
	
	private String name;

	public ItemArmor(ArmorMaterial material, EntityEquipmentSlot slot, String name) {
		super(material, 0, slot);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
		setCreativeTab(MythicalSwords.armorTab);
	}

	@Override
	public void registerItemModel(Item item) {
		MythicalSwords.proxy.registerItemRenderer(this, 0, name);
	}
	
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if(player.inventory.armorInventory[3] != null 
				&& player.inventory.armorInventory[2] != null
				&& player.inventory.armorInventory[1] != null
				&& player.inventory.armorInventory[0] != null) {
		effectPlayer(player, Potion.getPotionById(23), 0);
		}
	} 

	private void effectPlayer(EntityPlayer player, Potion potion, int amplifier) {
		if (player.inventory.armorInventory[3].getItem() == (ModItems.melonhelmet)
				&& player.inventory.armorInventory[2].getItem() == (ModItems.melonchestplate)
				&& player.inventory.armorInventory[1].getItem() == (ModItems.melonleggings)
				&& player.inventory.armorInventory[0].getItem() == (ModItems.melonboots)){
			 if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1)
			        player.addPotionEffect(new PotionEffect(potion, 20, amplifier, true, true));
		}
	}
	
	@Override
	public ItemArmor setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
