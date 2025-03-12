package dev.nyxane.mods.omnia_arcana.registry.impl;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import static omnia_arcana.api.OmniaArcanaAPI.OMNIA_ARCANA_MODID;

public class CreativeTabDeferredRegister {
    private final DeferredRegister<CreativeModeTab> INSTANCE;

    public CreativeTabDeferredRegister() {
        this.INSTANCE = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OMNIA_ARCANA_MODID);
    }

    public void register(IEventBus bus) {
        this.INSTANCE.register(bus);
    }
}
