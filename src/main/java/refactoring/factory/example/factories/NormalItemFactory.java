package refactoring.factory.example.factories;

import refactoring.factory.example.items.AbstractItem;
import refactoring.factory.example.items.NormalItem;

public class NormalItemFactory implements ItemFactory {

    @Override
    public AbstractItem create(String itemName, int sellIn, int quality) {
        return new NormalItem(itemName, sellIn, quality);
    }

    @Override
    public boolean applies(String itemName) {
        return true;
    }
}
