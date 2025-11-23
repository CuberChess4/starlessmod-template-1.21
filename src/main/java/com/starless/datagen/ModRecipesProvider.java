package com.starless.datagen;

import com.starless.StarlessMod;
import com.starless.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipesProvider extends FabricRecipeProvider {
    public ModRecipesProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EMERALD_APPLE, 1)
                .pattern("###")
                .pattern("#.#")
                .pattern("###")
                .input('#', Ingredient.ofItems(Items.EMERALD_BLOCK))
                .input('.', Ingredient.ofItems(Items.APPLE))
                .criterion("has_item", RecipeProvider.conditionsFromItem(Items.EMERALD_BLOCK))
                .criterion("has_item", RecipeProvider.conditionsFromItem(Items.APPLE))
                .offerTo(exporter, Identifier.of(StarlessMod.MOD_ID, "emerald_apple"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AMETHYST_APPLE, 1)
                .pattern("###")
                .pattern("#.#")
                .pattern("###")
                .input('#', Ingredient.ofItems(Items.AMETHYST_BLOCK))
                .input('.', Ingredient.ofItems(Items.APPLE))
                .criterion("has_item", RecipeProvider.conditionsFromItem(Items.AMETHYST_BLOCK))
                .criterion("has_item", RecipeProvider.conditionsFromItem(Items.APPLE))
                .offerTo(exporter, Identifier.of(StarlessMod.MOD_ID, "amethyst_apple"));
    }
}
