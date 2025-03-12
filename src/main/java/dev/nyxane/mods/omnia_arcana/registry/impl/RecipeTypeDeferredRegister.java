package dev.nyxane.mods.omnia_arcana.registry.impl;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import static omnia_arcana.api.OmniaArcanaAPI.OMNIA_ARCANA_MODID;

public class RecipeTypeDeferredRegister {
    private final DeferredRegister<RecipeType<?>> INSTANCE;
    public RecipeTypeDeferredRegister() {
        this.INSTANCE = DeferredRegister.create(Registries.RECIPE_TYPE, OMNIA_ARCANA_MODID);
    }
    public void register(IEventBus bus) {
        this.INSTANCE.register(bus);
    }
}
