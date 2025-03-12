package dev.nyxane.mods.omnia_arcana.registry;


import net.neoforged.bus.api.IEventBus;
import dev.nyxane.mods.omnia_arcana.registry.impl.BlockItemDeferredRegister;

public class OABlock {

    public static final BlockItemDeferredRegister INSTANCE = new BlockItemDeferredRegister();

    public static void register(IEventBus bus) {
        INSTANCE.register(bus);
    }
}
