package com.starless.datagen;

import com.starless.block.ModBlocks;
import com.starless.item.ModItemGroups;
import com.starless.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModENUSLanProvider extends FabricLanguageProvider {
    public ModENUSLanProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.AMETHYST_APPLE, "Amethyst Apple");
        translationBuilder.add(ModItems.EMERALD_APPLE, "Emerald Apple");
        translationBuilder.add(ModItems.DARK_QILIN_OF_HEBEI_MUSIC_DISC, "DARK QILIN OF HEBEI");
        translationBuilder.add("itemGroup.starless_group", "Starless Group");

        translationBuilder.add(ModItems.TOMATO, "Tomato");
        translationBuilder.add(ModItems.TOMATO_SEEDS, "Tomato Seeds");
        translationBuilder.add(ModBlocks.ALUMINIUM_ORE, "Aluminium Ore");

        translationBuilder.add("jukebox_song.starlessmod.dark_qilin_of_hebei", "Inside the Cable Temple" );
    }
}
