package dev.nyxane.mods.omnia_arcana.registry;

import net.neoforged.bus.api.IEventBus;
import dev.nyxane.mods.omnia_arcana.registry.impl.RecipeTypeDeferredRegister;

public class OARecipeType {
    public static final RecipeTypeDeferredRegister INSTANCE = new RecipeTypeDeferredRegister();

    public static void register(IEventBus bus) {
        INSTANCE.register(bus);
    }
}
