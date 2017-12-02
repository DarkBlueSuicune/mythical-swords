package com.dark_suicune.mythicalswords.recipe;

import com.dark_suicune.mythicalswords.block.ModBlocks;
import com.dark_suicune.mythicalswords.item.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	
	public static void init() {
		//SHAPED RECIPES
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.blacksteelsword), " B ", " B ", " S ", 'B', ModItems.blacksteel, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.justice), " N ", " N ", " B ", 'N', ModItems.nathite, 'B', Items.BLAZE_ROD);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.lightningsword), " L ", " L ", " B ", 'L', ModItems.lightningot, 'B', Items.BLAZE_ROD);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.theuniter), "DOD", "OJO", "DOD", 'D', Blocks.DIAMOND_BLOCK, 'O', Blocks.OBSIDIAN, 'J', ModItems.justice);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.blacksteelpickaxe), "BBB", " S ", " S ", 'B', ModItems.blacksteel, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.blacksteelaxe), " BB", " SB", " S ", 'B',ModItems.blacksteel, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.blacksteelshovel), " B ", " S ", " S ", 'B', ModItems.blacksteel, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.blacksteelhoe), " BB", " S ", " S ", 'B', ModItems.blacksteel, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.blacksteelhammer), "BBB", "BSB", " S ", 'B', ModItems.blacksteel, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.banter), "NNN", "NBN", " B ", 'N', ModItems.nathite, 'B', Items.BLAZE_ROD);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.flast), "IN ", "BRN", "IN ", 'N', ModItems.nathite, 'I', Items.IRON_INGOT, 'R', Items.REDSTONE, 'B', Items.BLAZE_ROD);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.melonhelmet), "GGG", "G G", "   ", 'G', Items.SPECKLED_MELON);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.melonchestplate), "G G", "GGG", "GGG", 'G',Items.SPECKLED_MELON);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.melonleggings), "GGG", "G G", "G G", 'G',Items.SPECKLED_MELON);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.melonboots), "   ", "G G", "G G", 'G',Items.SPECKLED_MELON);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.storm), " B ", "BSB", " B ", 'B', Items.BLAZE_POWDER, 'S', Items.NETHER_STAR);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.stormer), "LLL", "LBL", " B ", 'L', ModItems.lightningot, 'B', Items.BLAZE_ROD);
		
		//SHAPELESS RECIPES
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.lightningot), ModItems.storm, Items.IRON_INGOT);
		
		//SMELTING RECIPES
		GameRegistry.addSmelting(ModBlocks.nathiteore, new ItemStack(ModItems.nathite), 0.7f);
		GameRegistry.addSmelting(ModBlocks.blacksteelore, new ItemStack(ModItems.blacksteel), 0.7f);
	}

}
