package com.starless.block;

import com.starless.StarlessMod;
import com.starless.block.custom.TomatoCropBlock;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;

public class ModBlocks {
    public static final Block TOMATO_CROP = Registry.register(Registries.BLOCK, Identifier.of(StarlessMod.MOD_ID, "tomato_crop"),
            new TomatoCropBlock(AbstractBlock.Settings.copy(Blocks.BEETROOTS)));

    public static final Block ALUMINIUM_ORE = register("aluminium_ore",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).requiresTool().strength(3.0F, 3.0F))
    );

    public static void registerBlockItems(String id, Block block) {
        Item item = Registry.register(Registries.ITEM, Identifier.of(StarlessMod.MOD_ID, id), new BlockItem(block, new Item.Settings()));
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
    }

    public static Block register(String id, Block block) {
        registerBlockItems(id, block);
        return Registry.register(Registries.BLOCK, Identifier.of(StarlessMod.MOD_ID, id), block);
    }

    public static void registerModBlocks(){
        StarlessMod.LOGGER.info("Registering Blocks");
    }
}
