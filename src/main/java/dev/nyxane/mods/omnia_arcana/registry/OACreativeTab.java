package dev.nyxane.mods.omnia_arcana.registry;

import net.neoforged.bus.api.IEventBus;
import dev.nyxane.mods.omnia_arcana.registry.impl.CreativeTabDeferredRegister;

public class OACreativeTab {
    public static final CreativeTabDeferredRegister INSTANCE = new CreativeTabDeferredRegister();

    public static void register(IEventBus bus) {
        INSTANCE.register(bus);
    }
}
