package dev.nyxane.mods.omnia_arcana.client;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

import static omnia_arcana.api.OmniaArcanaAPI.OMNIA_ARCANA_MODID;

@Mod(value = OMNIA_ARCANA_MODID, dist = Dist.CLIENT)
public class OmniaArcanaClient {
    public OmniaArcanaClient(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(OmniaArcanaClient::clientInit);
    }
    public static void clientInit(final FMLClientSetupEvent event) {

    }
}
