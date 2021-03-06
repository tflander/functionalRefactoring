package refactoring.factory.example.items;

public class ConcertTicket extends AbstractItem {

    public ConcertTicket(String itemName, int sellIn, int quality) {
        super(itemName, sellIn, quality);
    }

    @Override
    public AbstractItem age() {

        int newQuality = 0;
        if(sellIn > 0) {
            newQuality = quality + 1;
            if(sellIn < 11) {
                ++newQuality;
            }
            if(sellIn <= 5) {
                ++newQuality;
            }
        }
        return new ConcertTicket(itemName, sellIn - 1, newQuality);
    }
}
