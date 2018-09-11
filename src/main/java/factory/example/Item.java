package factory.example;

public abstract class Item {

    public final String itemName;
    public final int sellIn;
    public final int quality;

    public Item(String itemName, int sellIn, int quality) {

        this.itemName = itemName;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public abstract Item age();
}
