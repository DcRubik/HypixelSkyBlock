package net.swofty.types.generic.item.items.mining.crystal.gemstones.flawless;

import net.swofty.types.generic.gems.GemRarity;
import net.swofty.types.generic.gems.Gemstone;
import net.swofty.types.generic.item.ItemType;
import net.swofty.types.generic.item.SkyBlockItem;
import net.swofty.types.generic.item.impl.DefaultCraftable;
import net.swofty.types.generic.item.impl.GemstoneImpl;
import net.swofty.types.generic.item.impl.SkyBlockRecipe;
import net.swofty.types.generic.item.impl.Unstackable;
import net.swofty.types.generic.item.impl.recipes.ShapelessRecipe;
import net.swofty.types.generic.user.SkyBlockPlayer;
import org.jetbrains.annotations.Nullable;

public class FlawlessJasper implements GemstoneImpl, Unstackable {
    @Override
    public String getSkullTexture(@Nullable SkyBlockPlayer player, SkyBlockItem item) {
        return "ff993d3a43d40597b474485976160d0cf52ac64d157307d3b1c941db224d0ac6";
    }

    @Override
    public GemRarity getAssociatedGemRarity() {
        return GemRarity.FLAWLESS;
    }

    @Override
    public Gemstone getAssociatedGemstone() {
        return Gemstone.JASPER;
    }

}
