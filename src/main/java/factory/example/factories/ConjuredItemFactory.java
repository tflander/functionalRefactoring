package factory.example.factories;

import factory.example.items.AbstractItem;
import factory.example.items.ConjuredItem;

public class ConjuredItemFactory implements ItemFactory {

    @Override
    public AbstractItem create(String itemName, int sellIn, int quality) {
        return new ConjuredItem(itemName, sellIn, quality);
    }

    @Override
    public boolean applies(String itemName) {
        return itemName.equals("Conjured");
    }
}
