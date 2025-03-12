package dev.nyxane.mods.omnia_arcana.registry.impl;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import static omnia_arcana.api.OmniaArcanaAPI.OMNIA_ARCANA_MODID;

public class FluidDeferredRegister {
    private final DeferredRegister<FluidType> FLUIDTYPE_INSTANCE;
    private final DeferredRegister<Fluid> FLUID_INSTANCE;
    private final DeferredRegister<Block> BLOCK_INSTANCE;
    private final ItemDeferredRegister BUCKET_INSTANCE;
    public FluidDeferredRegister() {
        this.FLUIDTYPE_INSTANCE = DeferredRegister.create(NeoForgeRegistries.Keys.FLUID_TYPES, OMNIA_ARCANA_MODID);
        this.FLUID_INSTANCE = DeferredRegister.create(Registries.FLUID, OMNIA_ARCANA_MODID);
        this.BLOCK_INSTANCE = DeferredRegister.create(Registries.BLOCK, OMNIA_ARCANA_MODID);
        this.BUCKET_INSTANCE = new ItemDeferredRegister();
    }
    public void register(IEventBus bus) {
        this.FLUIDTYPE_INSTANCE.register(bus);
        this.FLUID_INSTANCE.register(bus);
        this.BLOCK_INSTANCE.register(bus);
        this.BUCKET_INSTANCE.register(bus);
    }
}
