package refactoring.factory.example;

import refactoring.factory.example.items.AbstractItem;

import java.util.Arrays;
import java.util.stream.Collectors;

public class GildedRose {
    public AbstractItem[] abstractItems;

    public GildedRose(AbstractItem[] abstractItems) {

        this.abstractItems = abstractItems;
    }

    public void updateQuality() {
        abstractItems = Arrays.stream(abstractItems).map(item -> item.age())
                .collect(Collectors.toList())
                .toArray(new AbstractItem[0]);
    }
}
