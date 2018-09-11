package factory.example.factories;

import factory.example.factories.ItemFactory;
import factory.example.items.AbstractItem;
import factory.example.items.LegendaryItem;

public class LegendaryItemFactory implements ItemFactory {

    @Override
    public AbstractItem create(String itemName, int sellIn, int quality) {
        return new LegendaryItem(itemName, sellIn, quality);
    }

    @Override
    public boolean applies(String itemName) {
        return itemName.equals("Sulfuras, Hand of Ragnaros");
    }
}
