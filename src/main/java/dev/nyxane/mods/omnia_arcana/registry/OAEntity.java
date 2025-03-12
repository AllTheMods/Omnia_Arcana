package dev.nyxane.mods.omnia_arcana.registry;

import net.neoforged.bus.api.IEventBus;
import dev.nyxane.mods.omnia_arcana.registry.impl.EntityDeferredRegister;

public class OAEntity {
    public static final EntityDeferredRegister INSTANCE = new EntityDeferredRegister();

    public static void register(IEventBus bus) {
        INSTANCE.register(bus);
    }
}
