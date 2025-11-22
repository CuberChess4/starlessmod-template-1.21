package com.starless.item;

import com.starless.StarlessMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.component.type.FoodComponents;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item EMERALD_APPLE = registerItems("emerald_apple", new Item(new Item.Settings().food(ModFoodComponent.EMERALD_APPLE)));
    public static final Item AMETHYST_APPLE = registerItems("amethyst_apple", new Item(new Item.Settings().food(ModFoodComponent.AMETHYST_APPLE)));

    private static Item registerItems(String id, Item item) {
        // return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(StarlessMod.MOD_ID, id)), item);
        return Registry.register(Registries.ITEM, Identifier.of(StarlessMod.MOD_ID, id), item);
    }
    private static void addItemToIG(FabricItemGroupEntries fabricItemGroupEntries) {
        fabricItemGroupEntries.add(EMERALD_APPLE);
        fabricItemGroupEntries.add(AMETHYST_APPLE);
    }

    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemToIG);
        StarlessMod.LOGGER.info("Registering Items");
    }
}
