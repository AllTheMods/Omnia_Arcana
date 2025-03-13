package dev.nyxane.mods.omnia_arcana.registry;

import net.neoforged.bus.api.IEventBus;
import dev.nyxane.mods.omnia_arcana.registry.impl.ItemDeferredRegister;

public class OAItem {
    public static final ItemDeferredRegister INSTANCE = new ItemDeferredRegister();
    public static void register(IEventBus bus) {
        INSTANCE.register(bus);
    }
}
