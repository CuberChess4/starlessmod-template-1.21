package com.starless.world;

import com.starless.StarlessMod;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.world.gen.feature.*;
import com.starless.block.ModBlocks;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import com.starless.world.ModPlacedFeatures;

import java.util.ArrayList;
import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> ALUMINIUM_ORE_KEY = of("aluminium_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> featureRegisterable) {
        RuleTest stoneReplace = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepSlateReplace = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overWorldTargets = List.of(
                OreFeatureConfig.createTarget(stoneReplace, ModBlocks.ALUMINIUM_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepSlateReplace, ModBlocks.ALUMINIUM_ORE.getDefaultState())
        );
        register(featureRegisterable, ALUMINIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overWorldTargets, 8));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> of(String id) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(StarlessMod.MOD_ID, id));
    }

    public static <FC extends FeatureConfig, F extends Feature<FC>> void register(
            Registerable<ConfiguredFeature<?, ?>> registerable, RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC config
    ) {
        registerable.register(key, new ConfiguredFeature<FC, F>(feature, config));
    }
}
