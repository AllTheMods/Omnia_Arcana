package dev.nyxane.mods.omnia_arcana.mixins;

import com.hollingsworth.arsnouveau.api.spell.AbstractSpellPart;
import com.hollingsworth.arsnouveau.common.crafting.recipes.GlyphRecipe;
import com.hollingsworth.arsnouveau.common.items.Glyph;
import dev.nyxane.mods.omnia_arcana.registry.OAGlyphRegistry;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(GlyphRecipe.class)
public class GlyphRecipeMixin {
    @Shadow
    public ItemStack output;
    @Inject(method = "getSpellPart()Lcom/hollingsworth/arsnouveau/api/spell/AbstractSpellPart;", at = @At(value = "INVOKE"), cancellable = true)
    private void omniaArcana$getSpellPart(CallbackInfoReturnable<AbstractSpellPart> cir) {
        if (!(output.getItem() instanceof Glyph)) {
//            OmniaArcana.LOGGER.info(output.getItem().toString());
            cir.setReturnValue(OAGlyphRegistry.DummyGlyphSpell.INSTANCE);
        }
    }
}
