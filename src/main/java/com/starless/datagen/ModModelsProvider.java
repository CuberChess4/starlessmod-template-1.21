package com.starless.datagen;

import com.starless.block.ModBlocks;
import com.starless.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.state.property.Properties;

import java.util.Hashtable;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCrop(ModBlocks.TOMATO_CROP,Properties.AGE_3, 0, 1, 2, 3);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ALUMINIUM_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.AMETHYST_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMERALD_APPLE, Models.GENERATED);

        itemModelGenerator.register(ModItems.TOMATO, Models.GENERATED);
        // itemModelGenerator.register(ModItems.TOMATO_SEEDS, Models.GENERATED);

        itemModelGenerator.register(ModItems.DARK_QILIN_OF_HEBEI_MUSIC_DISC, Models.TEMPLATE_MUSIC_DISC);
    }
}
