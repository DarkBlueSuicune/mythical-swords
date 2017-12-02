package com.dark_suicune.mythicalswords.handler;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public final class SoundHandler {
	
	public static SoundEvent meow;
	
	private static int size = 0;
	
	public static void init() {
		size = SoundEvent.REGISTRY.getKeys().size();
		
		meow = register("meow");
	}
	
	public static SoundEvent register(String name) {
		ResourceLocation location = new ResourceLocation("mythicalswords", "meow");
		SoundEvent event = new SoundEvent(location);
		
		SoundEvent.REGISTRY.register(size, location, event);
		size++;
		
		return event;
	}

}
