package refactoring.factory.example.factories;

import refactoring.factory.example.items.AbstractItem;
import refactoring.factory.example.items.ConcertTicket;

public class ConcertTicketFactory implements ItemFactory {

    @Override
    public AbstractItem create(String itemName, int sellIn, int quality) {
        return new ConcertTicket(itemName, sellIn, quality);
    }

    @Override
    public boolean applies(String itemName) {
        return itemName.equals("Backstage passes to a TAFKAL80ETC concert");
    }
}
