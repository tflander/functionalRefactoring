package factory.example;

public class LegendaryAbstractItem extends AbstractItem {
    public LegendaryAbstractItem(String itemName, int sellIn, int quality) {
        super(itemName, sellIn, quality);
    }

    @Override
    public AbstractItem age() {
        return this;
    }
}
