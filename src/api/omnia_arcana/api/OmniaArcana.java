package api;

import net.minecraft.resources.ResourceLocation;

public class OmniaArcana {
    public static final String OMNIA_ARCANA_MODID = "omnia_arcana";
    public static ResourceLocation prefix(String path) {
        return ResourceLocation.fromNamespaceAndPath(OMNIA_ARCANA_MODID, path);
    }
}
