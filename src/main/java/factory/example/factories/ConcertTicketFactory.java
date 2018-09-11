package factory.example.factories;

import factory.example.items.AbstractItem;
import factory.example.items.ConcertTicket;

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
