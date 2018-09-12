package refactoring.factory.example.items;

public class LegendaryItem extends AbstractItem {
    public LegendaryItem(String itemName, int sellIn, int quality) {
        super(itemName, sellIn, quality);
    }

    @Override
    public AbstractItem age() {
        return this;
    }
}
