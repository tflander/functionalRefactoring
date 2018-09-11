package factory.example.items;

public class ConjuredItem extends AbstractItem {

    public ConjuredItem(String itemName, int sellIn, int quality) {
        super(itemName, sellIn, quality);
    }

    @Override
    public AbstractItem age() {
        return new ConjuredItem(itemName, sellIn - 1,  Math.max(0, quality - 2));
    }
}
