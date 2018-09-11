package factory.example;

public class ItemFactory {
    public static Item create(String itemName, int sellIn, int quality) {
        return new Item(itemName, sellIn, quality);
    }
}
