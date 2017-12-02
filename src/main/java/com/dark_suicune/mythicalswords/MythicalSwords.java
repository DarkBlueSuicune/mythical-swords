package com.dark_suicune.mythicalswords;

import com.dark_suicune.mythicalswords.block.ModBlocks;
import com.dark_suicune.mythicalswords.client.MS_Armor;
import com.dark_suicune.mythicalswords.client.MS_Blocks;
import com.dark_suicune.mythicalswords.client.MS_Materials;
import com.dark_suicune.mythicalswords.client.MS_Tools;
import com.dark_suicune.mythicalswords.item.ModItems;
import com.dark_suicune.mythicalswords.network.PacketRequestUpdatePedestal;
import com.dark_suicune.mythicalswords.network.PacketUpdatePedestal;
import com.dark_suicune.mythicalswords.proxy.CommonProxy;
import com.dark_suicune.mythicalswords.recipe.ModCrafting;
import com.dark_suicune.mythicalswords.world.ModWorldGeneration;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.EnumHand;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.common.util.EnumHelper;
	
	@Mod(modid = MythicalSwords.modId, name = MythicalSwords.name, version = MythicalSwords.version, acceptedMinecraftVersions = "[1.10.2]")
	public class MythicalSwords {
		
		public static SimpleNetworkWrapper network;

		public static final String modId = "mythicalswords";
		public static final String name = "Mythical Swords";
		public static final String version = "1.2.3";
		
		public static final Item.ToolMaterial justiceMaterial = EnumHelper.addToolMaterial("JUSTICE", 2, 2000, 0, 7, 14);
		public static final Item.ToolMaterial catanaMaterial = EnumHelper.addToolMaterial("CATANA", 2, 995, 6, 4, 9);
		public static final Item.ToolMaterial blacksteelToolMaterial = EnumHelper.addToolMaterial("BLACKSTEEL", 2, 1200, 6, 3, 13);
		public static final Item.ToolMaterial lightningMaterial = EnumHelper.addToolMaterial("LIGHTNING", 2, 550, 0, 2, 14);
		public static final Item.ToolMaterial blacksteelPickMaterial = EnumHelper.addToolMaterial("BLACKSTEEL", 3, 900, 8, 2, 11);
		public static final Item.ToolMaterial blacksteelSpadeMaterial = EnumHelper.addToolMaterial("BLACKSTEEL", 3, 895, 5, 1, 11);
		public static final Item.ToolMaterial blacksteelAxeMaterial = EnumHelper.addToolMaterial("BLACKSTEEL", 3, 820, 6, 5, 11);
		public static final Item.ToolMaterial blacksteelHoeMaterial = EnumHelper.addToolMaterial("BLACKSTEEL", 2, 700, 0, 0, 11);
		public static final Item.ToolMaterial blacksteelHammerMaterial = EnumHelper.addToolMaterial("BLACKSTEEL", 3, 1000, 7, 7, 14);
		public static final Item.ToolMaterial banterMaterial = EnumHelper.addToolMaterial("BANTER", 3, 1500, 8, 10, 12);
		public static final Item.ToolMaterial flastMaterial = EnumHelper.addToolMaterial("FLAST", 4, 1700, 50, 4, 12);
		public static final Item.ToolMaterial uniterMaterial = EnumHelper.addToolMaterial("UNITER", 2, 5000, 0, 36, 0);
		public static final Item.ToolMaterial stormerMaterial = EnumHelper.addToolMaterial("STORMER", 3, 500, 7, 4, 12);
		
		public static final ItemArmor.ArmorMaterial melonArmorMaterial = EnumHelper.addArmorMaterial("MELON", MythicalSwords.modId + ":melon", 15, new int []{2, 4, 5, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
		
		public static final MS_Materials materialsTab = new MS_Materials();
		public static final MS_Tools toolsTab = new MS_Tools();
		public static final MS_Armor armorTab = new MS_Armor();
		public static final MS_Blocks blocksTab = new MS_Blocks();

		@Mod.Instance(modId)
		public static MythicalSwords instance;

		@Mod.EventHandler
		public void preInit(FMLPreInitializationEvent event) {
			System.out.println(name + " is loading!");
			ModItems.init();
			ModBlocks.init();
			GameRegistry.registerWorldGenerator(new ModWorldGeneration(), 3);
			network = NetworkRegistry.INSTANCE.newSimpleChannel(modId);
			network.registerMessage(new PacketUpdatePedestal.Handler(), PacketUpdatePedestal.class, 0, Side.CLIENT);
			network.registerMessage(new PacketRequestUpdatePedestal.Handler(), PacketRequestUpdatePedestal.class, 1, Side.SERVER);
		}

		@Mod.EventHandler
		public void init(FMLInitializationEvent event) {
			ModCrafting.init();
		}

		@Mod.EventHandler
		public void postInit(FMLPostInitializationEvent event) {

		}
		
		@SidedProxy(serverSide = "com.dark_suicune.mythicalswords.proxy.CommonProxy", clientSide = "com.dark_suicune.mythicalswords.proxy.ClientProxy")
		public static CommonProxy proxy;

}
