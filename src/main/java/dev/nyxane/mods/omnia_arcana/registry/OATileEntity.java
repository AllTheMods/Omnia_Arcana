package dev.nyxane.mods.omnia_arcana.registry;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import dev.nyxane.mods.omnia_arcana.registry.impl.TileEntityDeferredRegister;

import java.util.function.Supplier;

public class OATileEntity {
    public static final TileEntityDeferredRegister INSTANCE = new TileEntityDeferredRegister();

    public static void register(IEventBus bus) {
        INSTANCE.register(bus);
    }

    public static <BE extends BlockEntity> DeferredHolder<BlockEntityType<?>, BlockEntityType<BE>> register(String name, BlockEntityType.BlockEntitySupplier<BE> BlockEntityWrap, Supplier<? extends Block> BlockWrap) {
        return INSTANCE.register(name,()->BlockEntityType.Builder.of(BlockEntityWrap,BlockWrap.get()).build(null));
    }
}
