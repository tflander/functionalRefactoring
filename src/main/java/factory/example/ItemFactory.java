package factory.example;

public class ItemFactory {

    public static AbstractItem create(String itemName, int sellIn, int quality) {

        if(itemName.equals("Conjured")) {
            return new ConjuredAbstractItem(itemName, sellIn, quality);
        } else if(itemName.equals("Backstage passes to a TAFKAL80ETC concert")) {
            return new ConcertTicket(itemName, sellIn, quality);
        } else if(itemName.equals("Sulfuras, Hand of Ragnaros")) {
            return new LegendaryAbstractItem(itemName, sellIn, quality);
        } else if(itemName.equals("Aged Brie")) {
            return new Brie(itemName, sellIn, quality);
        }
        return new NormalAbstractItem(itemName, sellIn, quality);
    }
}
