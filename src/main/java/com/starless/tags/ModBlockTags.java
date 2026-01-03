package com.starless.tags;

import com.starless.StarlessMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModBlockTags {
    public static final TagKey<Block> ORE_LIST = of("ore_list");
    private static TagKey<Block> of(String id) {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(StarlessMod.MOD_ID, id));
    }
    public static void registerModBlockTags() {
        StarlessMod.LOGGER.info("Registering Block Tags");
    }
}

