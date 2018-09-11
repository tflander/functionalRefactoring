package factory.example;

public class LegendaryItem extends Item {
    public LegendaryItem(String itemName, int sellIn, int quality) {
        super(itemName, sellIn, quality);
    }

    @Override
    public Item age() {
        return this;
    }
}
