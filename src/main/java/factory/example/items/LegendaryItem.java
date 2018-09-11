package factory.example.items;

import factory.example.items.AbstractItem;

public class LegendaryItem extends AbstractItem {
    public LegendaryItem(String itemName, int sellIn, int quality) {
        super(itemName, sellIn, quality);
    }

    @Override
    public AbstractItem age() {
        return this;
    }
}
