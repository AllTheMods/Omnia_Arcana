package dev.nyxane.mods.omnia_arcana.registry.impl;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

import static api.OmniaArcana.OMNIA_ARCANA_MODID;

public class ItemDeferredRegister {
    private final DeferredRegister<Item> INSTANCE;

    public ItemDeferredRegister() {
        this.INSTANCE = DeferredRegister.create(Registries.ITEM, OMNIA_ARCANA_MODID);
    }

    public void register(IEventBus bus){
        this.INSTANCE.register(bus);
    }
    public <ITEM extends Item> DeferredHolder<Item, ITEM> registerItem(String id, Function<Item.Properties, ITEM> sup) {
        return INSTANCE.register(id, () -> sup.apply(new Item.Properties()));
    }
}
