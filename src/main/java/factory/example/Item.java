package factory.example;

public class Item {

    public final String itemName;
    public final int sellIn;
    public final int quality;

    public Item(String itemName, int sellIn, int quality) {

        this.itemName = itemName;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public Item age() {
        return new Item(itemName, sellIn - 1, quality - 1);
    }
}
