package factory.example.factories;

import factory.example.items.AbstractItem;

public interface ItemFactory {

    AbstractItem create(String itemName, int sellIn, int quality);

    boolean applies(String itemName);
}
