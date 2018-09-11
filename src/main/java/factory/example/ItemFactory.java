package factory.example;

public class ItemFactory {
    public static Item create(String itemName, int sellIn, int quality) {

        if(itemName.equals("Conjured")) {
            return new ConjuredItem(itemName, sellIn, quality);
        }
        if(itemName.equals("Backstage passes to a TAFKAL80ETC concert")) {
            return new ConcertTicket(itemName, sellIn, quality);
        }
        if(itemName.equals("Sulfuras, Hand of Ragnaros")) {
            return new LegendaryItem(itemName, sellIn, quality);
        }
        if(itemName.equals("Aged Brie")) {
            return new Brie(itemName, sellIn, quality);
        }
        return new NormalItem(itemName, sellIn, quality);
    }
}
