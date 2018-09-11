package factory.example;

public class ConjuredItem extends Item {

    public ConjuredItem(String itemName, int sellIn, int quality) {
        super(itemName, sellIn, quality);
    }

    @Override
    public Item age() {
        return new ConjuredItem(itemName, sellIn - 1,  Math.max(0, quality - 2));
    }
}
