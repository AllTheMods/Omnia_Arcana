package dev.nyxane.mods.omnia_arcana.registry;

import net.neoforged.bus.api.IEventBus;
import dev.nyxane.mods.omnia_arcana.registry.impl.FluidDeferredRegister;

public class OAFluid {
    public static final FluidDeferredRegister INSTANCE = new FluidDeferredRegister();

    public static void register(IEventBus bus) {
        INSTANCE.register(bus);
    }
}
