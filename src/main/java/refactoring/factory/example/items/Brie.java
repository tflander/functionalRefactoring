package refactoring.factory.example.items;

public class Brie extends AbstractItem {

    public Brie(String itemName, int sellIn, int quality) {
        super(itemName, sellIn, quality);
    }

    @Override
    public AbstractItem age() {
        return new Brie(itemName, sellIn -1, Math.min(50, quality + 1));
    }
}
