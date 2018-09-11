package factory.example.factories;

import factory.example.items.AbstractItem;
import factory.example.items.Brie;

public class BrieFactory implements ItemFactory {

    @Override
    public AbstractItem create(String itemName, int sellIn, int quality) {
        return new Brie(itemName, sellIn, quality);
    }

    @Override
    public boolean applies(String itemName) {
        return itemName.equals("Aged Brie");
    }
}
