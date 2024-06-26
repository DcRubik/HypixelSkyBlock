package net.swofty.types.generic.item.items.armor.mineroutfit;

import net.minestom.server.color.Color;
import net.swofty.types.generic.item.SkyBlockItem;
import net.swofty.types.generic.item.impl.*;
import net.swofty.types.generic.user.statistics.ItemStatistic;
import net.swofty.types.generic.user.statistics.ItemStatistics;

public class MinerOutfitLeggings implements CustomSkyBlockItem, StandardItem, LeatherColour, Sellable {

    @Override
    public ItemStatistics getStatistics(SkyBlockItem instance) {
        return ItemStatistics.builder().with(ItemStatistic.DEFENSE, 30D).build();
    }

    @Override
    public Color getLeatherColour() {
        return new Color(128, 128, 128);
    }

    @Override
    public double getSellValue() {
        return 1920;
    }

    @Override
    public StandardItemType getStandardItemType() {
        return StandardItemType.LEGGINGS;
    }
}
