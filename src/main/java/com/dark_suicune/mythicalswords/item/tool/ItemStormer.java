package com.dark_suicune.mythicalswords.item.tool;

import com.dark_suicune.mythicalswords.MythicalSwords;
import com.dark_suicune.mythicalswords.item.ItemModelProvider;
import com.dark_suicune.mythicalswords.util.RayTrace;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ItemStormer extends net.minecraft.item.ItemPickaxe implements ItemModelProvider {
	
	private String name;

	public ItemStormer(ToolMaterial material, String name) {
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
	public ItemStormer setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) {
		RayTraceResult trace = RayTrace.rayTraceBlocksAndEntities(worldIn, 64, playerIn);
		if(trace == null || trace.typeOfHit == RayTraceResult.Type.MISS){
		int r = 32;
		int d = r * 2;
		BlockPos target = new BlockPos(playerIn.posX+worldIn.rand.nextInt(d)-r,playerIn.posY,playerIn.posZ+worldIn.rand.nextInt(d)-r);
		worldIn.addWeatherEffect(new EntityLightningBolt(worldIn, target.getX(), target.getY(), target.getZ(), false));
		while(target.getY() < 255 && !worldIn.isAirBlock(target)){
			target = target.up();
		}
		while(target.getY() > 0 && worldIn.isAirBlock(target)){
			target = target.down();
		}
		worldIn.addWeatherEffect(new EntityLightningBolt(worldIn,target.getX(), target.getY(), target.getZ(),false));
	} else {
		Vec3d target = trace.hitVec;
		if(target == null){
			target = new Vec3d(trace.getBlockPos().getX(),trace.getBlockPos().getY(),trace.getBlockPos().getZ());
		}
		worldIn.addWeatherEffect(new EntityLightningBolt(worldIn,target.xCoord, target.yCoord, target.zCoord,false));
	}
		
		return ActionResult.newResult(EnumActionResult.SUCCESS, itemStackIn);
	}


}
