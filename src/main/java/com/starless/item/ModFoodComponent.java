package com.starless.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponent {
    public static final FoodComponent EMERALD_APPLE = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(1.2F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 12000, 0), 1.0F)
            .alwaysEdible()
            .build();
    public static final FoodComponent AMETHYST_APPLE = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(1.2F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 12000, 0), 1.0F)
            .alwaysEdible()
            .build();
    public static final FoodComponent TOMATO = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(1.2F)
            .build();
}
