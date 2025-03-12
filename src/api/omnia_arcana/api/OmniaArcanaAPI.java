package omnia_arcana.api;

import net.minecraft.resources.ResourceLocation;

public class OmniaArcanaAPI {
    public static final String OMNIA_ARCANA_MODID = "omnia_arcana";
    public static ResourceLocation reLoc(String path) {
        return ResourceLocation.fromNamespaceAndPath(OMNIA_ARCANA_MODID, path);
    }
}
