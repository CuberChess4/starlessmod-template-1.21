package com.starless.item;

import com.starless.StarlessMod;
import com.starless.block.ModBlocks;
import com.starless.sound.ModJukeboxSongs;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    public static final Item EMERALD_APPLE = registerItems("emerald_apple",
            new Item(new Item.Settings().food(ModFoodComponent.EMERALD_APPLE)));
    public static final Item AMETHYST_APPLE = registerItems("amethyst_apple",
            new Item(new Item.Settings().food(ModFoodComponent.AMETHYST_APPLE)));
    public static final Item DARK_QILIN_OF_HEBEI_MUSIC_DISC = registerItems("dark_qilin_of_hebei_music_disc",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.DARK_QILIN_OF_HEBEI))
    );
    public static final Item TOMATO = registerItems("tomato",
            new Item(new Item.Settings().food(ModFoodComponent.TOMATO)));

    public static final Item TOMATO_SEEDS = registerItems("tomato_seeds",
            new AliasedBlockItem(ModBlocks.TOMATO_CROP, new Item.Settings()));


    private static Item registerItems(String id, Item item) {
        // return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(StarlessMod.MOD_ID, id)), item);
        return Registry.register(Registries.ITEM, Identifier.of(StarlessMod.MOD_ID, id), item);
    }
    private static void addItemToIG(FabricItemGroupEntries fabricItemGroupEntries) {
        fabricItemGroupEntries.add(EMERALD_APPLE);
        fabricItemGroupEntries.add(AMETHYST_APPLE);
        fabricItemGroupEntries.add(DARK_QILIN_OF_HEBEI_MUSIC_DISC);
        fabricItemGroupEntries.add(TOMATO);
        fabricItemGroupEntries.add(TOMATO_SEEDS);
        fabricItemGroupEntries.add(ModBlocks.ALUMINIUM_ORE);
    }

    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemToIG);
        StarlessMod.LOGGER.info("Registering Items");
    }
}
