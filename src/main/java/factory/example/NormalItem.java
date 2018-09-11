package factory.example;

public class NormalItem extends Item {

    public NormalItem(String itemName, int sellIn, int quality) {
        super(itemName, sellIn, quality);
    }

    public Item age() {
        int decreaseAmt = 1;
        if(sellIn < 1) {
            decreaseAmt = 2;
        }
        return new NormalItem(itemName, sellIn - 1, Math.max(0, quality - decreaseAmt));
    }

}
