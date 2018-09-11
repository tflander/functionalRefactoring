package factory.example;

public class ConjuredAbstractItem extends AbstractItem {

    public ConjuredAbstractItem(String itemName, int sellIn, int quality) {
        super(itemName, sellIn, quality);
    }

    @Override
    public AbstractItem age() {
        return new ConjuredAbstractItem(itemName, sellIn - 1,  Math.max(0, quality - 2));
    }
}
