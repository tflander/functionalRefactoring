package refactoring.factory.example.factories;

import refactoring.factory.example.items.AbstractItem;

public interface ItemFactory {

    AbstractItem create(String itemName, int sellIn, int quality);

    boolean applies(String itemName);
}
