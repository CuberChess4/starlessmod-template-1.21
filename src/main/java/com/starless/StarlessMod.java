package com.starless;

import com.starless.block.ModBlocks;
import com.starless.block.custom.TomatoCropBlock;
import com.starless.datagen.ModModelsProvider;
import com.starless.item.ModFoodComponent;
import com.starless.item.ModItemGroups;
import com.starless.item.ModItems;
import com.starless.mixin.RenderLayersMixin;
import com.starless.sound.ModSoundEvents;
import com.starless.tags.ModBlockTags;
import com.starless.tags.ModItemTags;
import com.starless.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StarlessMod implements ModInitializer {
	public static final String MOD_ID = "starlessmod";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ModItemGroups.registerModItemGroups();
        ModSoundEvents.registerModSoundEvents();
        ModWorldGeneration.registerWorldGenerations();
        ModBlockTags.registerModBlockTags();
        ModItemTags.registerModItemTags();
		LOGGER.info("Hello Fabric world!");
	}
}