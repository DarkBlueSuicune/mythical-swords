package com.dark_suicune.mythicalswords.item;

import com.dark_suicune.mythicalswords.MythicalSwords;
import com.dark_suicune.mythicalswords.item.armor.ItemArmor;
import com.dark_suicune.mythicalswords.item.tool.ItemAxe;
import com.dark_suicune.mythicalswords.item.tool.ItemCatana;
import com.dark_suicune.mythicalswords.item.tool.ItemFlast;
import com.dark_suicune.mythicalswords.item.tool.ItemHoe;
import com.dark_suicune.mythicalswords.item.tool.ItemLightningSword;
import com.dark_suicune.mythicalswords.item.tool.ItemPickaxe;
import com.dark_suicune.mythicalswords.item.tool.ItemShovel;
import com.dark_suicune.mythicalswords.item.tool.ItemStormer;
import com.dark_suicune.mythicalswords.item.tool.ItemSword;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static ItemBase blacksteel;
	public static ItemBase lightningot;
	public static ItemBase nathite;
	public static ItemBase storm;
	
	public static ItemSword blacksteelsword;
	public static ItemLightningSword lightningsword;
	public static ItemSword justice;
	public static ItemSword theuniter;
	public static ItemCatana catana;
	
	public static ItemPickaxe blacksteelhammer;
	public static ItemPickaxe banter;
	public static ItemStormer stormer;
	public static ItemFlast flast;
	
	public static ItemPickaxe blacksteelpickaxe;
	public static ItemShovel blacksteelshovel;
	public static ItemAxe blacksteelaxe;
	public static ItemHoe blacksteelhoe;
	
	public static ItemArmor melonhelmet;
	public static ItemArmor melonchestplate;
	public static ItemArmor melonleggings;
	public static ItemArmor melonboots;

	
	public static void init() {
		
		blacksteel = register(new ItemBase("blacksteel"));
		lightningot = register(new ItemBase("lightningot"));
		nathite = register(new ItemBase("nathite"));
		storm = register(new ItemBase("storm"));
		
		blacksteelsword = register(new ItemSword(MythicalSwords.blacksteelToolMaterial, "blacksteelsword"));
		lightningsword = register(new ItemLightningSword(MythicalSwords.lightningMaterial, "lightningsword"));
		justice = register(new ItemSword(MythicalSwords.justiceMaterial, "justice"));
		theuniter = register(new ItemSword(MythicalSwords.uniterMaterial, "theuniter"));
		catana = register(new ItemCatana(MythicalSwords.catanaMaterial, "catana"));
		
		blacksteelpickaxe = register(new ItemPickaxe(MythicalSwords.blacksteelPickMaterial, "blacksteelpickaxe"));
		blacksteelshovel = register(new ItemShovel(MythicalSwords.blacksteelSpadeMaterial, "blacksteelshovel"));
		blacksteelaxe = register(new ItemAxe(MythicalSwords.blacksteelAxeMaterial, "blacksteelaxe"));
		blacksteelhoe = register(new ItemHoe(MythicalSwords.blacksteelHoeMaterial, "blacksteelhoe"));
		
		flast = register(new ItemFlast(MythicalSwords.flastMaterial, "flast"));
		
		blacksteelhammer = register(new ItemPickaxe(MythicalSwords.blacksteelHammerMaterial, "blacksteelhammer"));
		banter = register(new ItemPickaxe(MythicalSwords.banterMaterial, "banter"));
		stormer = register(new ItemStormer(MythicalSwords.stormerMaterial, "stormer"));
		
		melonhelmet = register(new ItemArmor(MythicalSwords.melonArmorMaterial, EntityEquipmentSlot.HEAD, "melonhelmet"));
		melonchestplate = register(new ItemArmor(MythicalSwords.melonArmorMaterial, EntityEquipmentSlot.CHEST, "melonchestplate"));
		melonleggings = register(new ItemArmor(MythicalSwords.melonArmorMaterial, EntityEquipmentSlot.LEGS, "melonleggings"));
		melonboots = register(new ItemArmor(MythicalSwords.melonArmorMaterial, EntityEquipmentSlot.FEET, "melonboots"));
		
	}

	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);

		if (item instanceof ItemBase) {
			((ItemBase)item).registerItemModel();
		}
		
		if (item instanceof ItemSword) {
			((ItemSword)item).registerItemModel(item);
		}
		
		if (item instanceof ItemLightningSword) {
			((ItemLightningSword)item).registerItemModel(item);
		}
		
		if (item instanceof ItemStormer) {
			((ItemStormer)item).registerItemModel(item);
		}
		
		if (item instanceof ItemPickaxe) {
			((ItemPickaxe)item).registerItemModel(item);
		}
		
		if (item instanceof ItemFlast) {
			((ItemFlast)item).registerItemModel(item);
		}
		
		if (item instanceof ItemAxe) {
			((ItemAxe)item).registerItemModel(item);
		}
		
		if (item instanceof ItemHoe) {
			((ItemHoe)item).registerItemModel(item);
		}
		
		if (item instanceof ItemShovel) {
			((ItemShovel)item).registerItemModel(item);
		}
		
		if (item instanceof ItemArmor) {
			((ItemArmor)item).registerItemModel(item);
		}

		return item;
	}

}
