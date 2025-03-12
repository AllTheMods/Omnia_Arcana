package dev.nyxane.mods.omnia_arcana.registry;

import net.neoforged.bus.api.IEventBus;
import dev.nyxane.mods.omnia_arcana.registry.impl.MenuDeferredRegister;

public class OAMenu {
    public static final MenuDeferredRegister INSTANCE = new MenuDeferredRegister();

    public static void register(IEventBus bus) {
        INSTANCE.register(bus);
    }
}
