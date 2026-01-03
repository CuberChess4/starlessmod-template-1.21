package com.starless.datagen;

import com.starless.block.ModBlocks;
import com.starless.item.ModItemGroups;
import com.starless.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class ModZHCNLanProvider extends FabricLanguageProvider {
    public ModZHCNLanProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "zh_cn", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.AMETHYST_APPLE, "紫水晶苹果");
        translationBuilder.add(ModItems.EMERALD_APPLE, "绿宝石苹果");
        translationBuilder.add(ModItems.DARK_QILIN_OF_HEBEI_MUSIC_DISC, "河北墨麒麟唱片");
        translationBuilder.add("itemGroup.starless_group", "熵星");

        translationBuilder.add(ModItems.TOMATO, "番茄");
        translationBuilder.add(ModItems.TOMATO_SEEDS, "番茄种子");
        translationBuilder.add(ModBlocks.ALUMINIUM_ORE, "铝矿");

        translationBuilder.add("jukebox_song.starlessmod.dark_qilin_of_hebei", "河北墨麒麟" );
    }
}
