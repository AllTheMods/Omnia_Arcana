package dev.nyxane.mods.omnia_arcana.registry;

import net.neoforged.bus.api.IEventBus;
import dev.nyxane.mods.omnia_arcana.registry.impl.RecipeSerializerDeferredRegister;

public class OARecipeSerializer {
    public static final RecipeSerializerDeferredRegister INSTANCE = new RecipeSerializerDeferredRegister();

    public static void register(IEventBus bus) {
        INSTANCE.register(bus);
    }
}
