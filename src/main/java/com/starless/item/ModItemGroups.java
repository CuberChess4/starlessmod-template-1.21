package com.starless.item;

import com.starless.StarlessMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
//    public static final RegistryKey<ItemGroup> STARLESS_GROUP = register("starless_group");
//    private static RegistryKey<ItemGroup> register(String id) {
//        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(StarlessMod.MOD_ID, id));
//    }
//    public static void registerModItemGroups() {
//        Registry.register(Registries.ITEM_GROUP, STARLESS_GROUP,
//                ItemGroup.create(ItemGroup.Row.TOP, 7)
//                                .displayName(Text.translatable("itemGroup.starless_group"))
//                                        .icon(() -> new ItemStack(ModItems.EMERALD_APPLE))
//                        .entries((displayContext, entries) -> {
//                            entries.add(ModItems.EMERALD_APPLE);
//                        }).build());
//        StarlessMod.LOGGER.info("[StarlessMod] Registering Starless Item Groups");
//    }
    public static final ItemGroup STARLESS_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(StarlessMod.MOD_ID, "starless_group"),
        ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.starless_group"))
                .icon(() -> new ItemStack(ModItems.EMERALD_APPLE))
                .entries((displayContext, entries) -> {
                    entries.add(ModItems.EMERALD_APPLE);
                    entries.add(ModItems.AMETHYST_APPLE);
                }).build());
    public static void registerModItemGroups() {
        StarlessMod.LOGGER.info("Registering Item Groups");
    }
}
