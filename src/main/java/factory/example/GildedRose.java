package factory.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class GildedRose {
    public Item[] items;

    public GildedRose(Item[] items) {

        this.items = items;
    }

    public void updateQuality() {
        items = Arrays.stream(items).map(item -> item.age())
                .collect(Collectors.toList())
                .toArray(new Item[0]);
    }
}
