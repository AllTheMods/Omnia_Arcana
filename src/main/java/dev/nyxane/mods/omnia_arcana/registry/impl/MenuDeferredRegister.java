package dev.nyxane.mods.omnia_arcana.registry.impl;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import static omnia_arcana.api.OmniaArcanaAPI.OMNIA_ARCANA_MODID;

public class MenuDeferredRegister {
    private final DeferredRegister<MenuType<?>> INSTANCE;
    public MenuDeferredRegister() {
        this.INSTANCE = DeferredRegister.create(Registries.MENU, OMNIA_ARCANA_MODID);
    }
    public void register(IEventBus bus) {
        this.INSTANCE.register(bus);
    }
}
