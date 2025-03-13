package dev.nyxane.mods.omnia_arcana;

import com.mojang.logging.LogUtils;
import dev.nyxane.mods.omnia_arcana.registry.OABlock;
import dev.nyxane.mods.omnia_arcana.registry.OAFluid;
import dev.nyxane.mods.omnia_arcana.registry.OAItem;
import dev.nyxane.mods.omnia_arcana.registry.OAMenu;
import dev.nyxane.mods.omnia_arcana.registry.OAEntity;
import dev.nyxane.mods.omnia_arcana.registry.OATileEntity;
import dev.nyxane.mods.omnia_arcana.registry.OARecipeType;
import dev.nyxane.mods.omnia_arcana.registry.OACreativeTab;
import dev.nyxane.mods.omnia_arcana.registry.OARecipeSerializer;
import dev.nyxane.mods.omnia_arcana.registry.OAGlyphRegistry;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

import static api.OmniaArcana.OMNIA_ARCANA_MODID;

@Mod(OMNIA_ARCANA_MODID)
public class OmniaArcana
{
    public static final Logger LOGGER = LogUtils.getLogger();
    public OmniaArcana(IEventBus modEventBus, ModContainer modContainer)
    {
        OAGlyphRegistry.init();
        OAItem.register(modEventBus);
        OAMenu.register(modEventBus);
        OABlock.register(modEventBus);
        OAFluid.register(modEventBus);
        OAEntity.register(modEventBus);
        OATileEntity.register(modEventBus);
        OARecipeType.register(modEventBus);
        OACreativeTab.register(modEventBus);
        OARecipeSerializer.register(modEventBus);
    }
}
