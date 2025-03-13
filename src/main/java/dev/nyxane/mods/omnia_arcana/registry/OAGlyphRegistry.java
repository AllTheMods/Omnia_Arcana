package dev.nyxane.mods.omnia_arcana.registry;

import api.OmniaArcana;
import com.hollingsworth.arsnouveau.api.documentation.DocAssets;
import com.hollingsworth.arsnouveau.api.registry.GlyphRegistry;
import com.hollingsworth.arsnouveau.api.spell.AbstractAugment;
import com.hollingsworth.arsnouveau.api.spell.AbstractSpellPart;
import com.hollingsworth.arsnouveau.api.spell.SpellTier;
import net.minecraft.network.chat.Component;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class OAGlyphRegistry {
    public static final List<AbstractSpellPart> REGISTRAR = new ArrayList<>();
    public static final DocAssets.BlitInfo CRAFT_ICON = new DocAssets.BlitInfo(OmniaArcana.prefix("textures/gui/ars_nouveau/crafting.png"), 7, 10);
    public static final SpellTier CRAFT_TIER = SpellTier.createTier(OmniaArcana.prefix("spell/crafting"),1,() -> CRAFT_ICON);
    public static void init() {

        GlyphRegistry.registerSpell(DummyGlyphSpell.INSTANCE);
        REGISTRAR.add(DummyGlyphSpell.INSTANCE);
    }
    public static class DummyGlyphSpell extends AbstractSpellPart {
        public static DummyGlyphSpell INSTANCE = new DummyGlyphSpell();
        public DummyGlyphSpell() {
            super(OmniaArcana.prefix("dummy_glyph"), "Dummy");
        }

        @Override
        public Integer getTypeIndex() {
            return 9999;
        }

        @Override
        protected int getDefaultManaCost() {
            return 0;
        }

        @Override
        protected @NotNull Set<AbstractAugment> getCompatibleAugments() {
            return Set.of();
        }

        @Override
        public Component getTypeName() {
            return Component.literal("Dummy");
        }

        @Override
        public SpellTier defaultTier() {
            return CRAFT_TIER;
        }

        @Override
        public boolean shouldShowInSpellBook() {
            return false;
        }
    }
}
