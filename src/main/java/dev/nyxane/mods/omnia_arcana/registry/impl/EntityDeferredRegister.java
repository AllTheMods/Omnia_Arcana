package dev.nyxane.mods.omnia_arcana.registry.impl;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import static api.OmniaArcana.OMNIA_ARCANA_MODID;

public class EntityDeferredRegister {
    private final DeferredRegister<EntityType<?>> INSTANCE;
    public EntityDeferredRegister() {
        this.INSTANCE = DeferredRegister.create(Registries.ENTITY_TYPE, OMNIA_ARCANA_MODID);
    }
    public void register(IEventBus bus) {
        this.INSTANCE.register(bus);
    }
}
