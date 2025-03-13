package dev.nyxane.mods.omnia_arcana.registry.impl;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import static api.OmniaArcana.OMNIA_ARCANA_MODID;

public class RecipeSerializerDeferredRegister {
    private final DeferredRegister<RecipeSerializer<?>> INSTANCE;
    public RecipeSerializerDeferredRegister() {
        this.INSTANCE = DeferredRegister.create(Registries.RECIPE_SERIALIZER, OMNIA_ARCANA_MODID);
    }
    public void register(IEventBus bus) {
        this.INSTANCE.register(bus);
    }
}
