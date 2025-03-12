package dev.nyxane.mods.omnia_arcana.registry.impl;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;


import java.util.function.Supplier;

import static omnia_arcana.api.OmniaArcanaAPI.OMNIA_ARCANA_MODID;

public class TileEntityDeferredRegister {
    private final DeferredRegister<BlockEntityType<?>> INSTANCE;
    public TileEntityDeferredRegister() {
        this.INSTANCE = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, OMNIA_ARCANA_MODID);
    }
    public void register(IEventBus bus) {
        this.INSTANCE.register(bus);
    }


    public <BE extends BlockEntity> DeferredHolder<BlockEntityType<?>, BlockEntityType<BE>> register(String name, Supplier<BlockEntityType<BE>> sup) {
        return this.INSTANCE.register(name,sup);
    }
}
