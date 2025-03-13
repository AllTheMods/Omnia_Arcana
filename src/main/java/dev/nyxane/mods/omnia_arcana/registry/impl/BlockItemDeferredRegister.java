package dev.nyxane.mods.omnia_arcana.registry.impl;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.BiFunction;
import java.util.function.Supplier;

import static api.OmniaArcana.OMNIA_ARCANA_MODID;

public class BlockItemDeferredRegister {
    private final DeferredRegister<Block> BLOCK_INSTANCE;
    private final DeferredRegister<Item> ITEM_INSTANCE;

    public BlockItemDeferredRegister() {
        this.BLOCK_INSTANCE = DeferredRegister.create(Registries.BLOCK, OMNIA_ARCANA_MODID);
        this.ITEM_INSTANCE = DeferredRegister.create(Registries.ITEM, OMNIA_ARCANA_MODID);
    }
    public void register(IEventBus bus) {
        this.BLOCK_INSTANCE.register(bus);
        this.ITEM_INSTANCE.register(bus);
    }

    public <BLOCK extends Block, ITEM extends Item> DeferredHolder<Block, BLOCK> register(String name, Supplier<? extends BLOCK> sup, BiFunction<BLOCK,Item.Properties,ITEM> itemWrapper) {
        DeferredHolder<Block, BLOCK> blockObject = this.BLOCK_INSTANCE.register(name, sup);
        this.ITEM_INSTANCE.register(name, () -> itemWrapper.apply(blockObject.get(), new Item.Properties()));
        return blockObject;
    }

}
