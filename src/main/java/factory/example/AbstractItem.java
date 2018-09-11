package factory.example;

public abstract class AbstractItem {

    public final String itemName;
    public final int sellIn;
    public final int quality;

    public AbstractItem(String itemName, int sellIn, int quality) {

        this.itemName = itemName;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public abstract AbstractItem age();
}
