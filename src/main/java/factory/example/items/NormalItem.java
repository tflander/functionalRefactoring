package factory.example.items;

public class NormalItem extends AbstractItem {

    public NormalItem(String itemName, int sellIn, int quality) {
        super(itemName, sellIn, quality);
    }

    public AbstractItem age() {
        int decreaseAmt = 1;
        if(sellIn < 1) {
            decreaseAmt = 2;
        }
        return new NormalItem(itemName, sellIn - 1, Math.max(0, quality - decreaseAmt));
    }

}
