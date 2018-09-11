package factory.example;

public class Brie extends Item {

    public Brie(String itemName, int sellIn, int quality) {
        super(itemName, sellIn, quality);
    }

    @Override
    public Item age() {
        return new Brie(itemName, sellIn -1, Math.min(50, quality + 1));
    }
}
