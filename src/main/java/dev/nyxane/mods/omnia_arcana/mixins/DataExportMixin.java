package dev.nyxane.mods.omnia_arcana.mixins;

import dev.latvian.mods.kubejs.server.DataExport;
import net.minecraft.Util;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.concurrent.ExecutorService;

@Mixin(DataExport.class)
public class DataExportMixin {
    @Redirect(
            method = "exportData0",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/Util;ioPool()LJava/util/concurrent/ExecutorService;"
            )
    )
    private ExecutorService redirectIoPool() {
        return Util.backgroundExecutor();
    }
}
