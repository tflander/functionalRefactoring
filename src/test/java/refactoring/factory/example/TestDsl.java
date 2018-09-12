package refactoring.factory.example;

import refactoring.factory.example.factories.CompositeItemFactory;
import refactoring.factory.example.factories.ItemFactory;
import refactoring.factory.example.items.AbstractItem;

import static org.assertj.core.api.Assertions.assertThat;

public class TestDsl {
    private String itemName;
    private int sellIn;
    private int quality;
    private AbstractItem abstractItem;
    private ItemFactory factory = new CompositeItemFactory();

    public TestDsl withName(String itemName) {
        this.itemName = itemName;
        return this;
    }

    public TestDsl withSellIn(int sellIn) {
        this.sellIn = sellIn;
        return this;
    }

    public TestDsl withQuality(int quality) {
        this.quality = quality;
        return this;
    }

    public TestDsl whenNextDay() {
        AbstractItem originalAbstractItem = factory.create(itemName, sellIn, quality);
        GildedRose app = new GildedRose(new AbstractItem[]{originalAbstractItem});
        app.updateQuality();
        abstractItem = app.abstractItems[0];
        return this;
    }

    public TestDsl thenExpectSellIn(int expectedSellIn) {
        assertThat(abstractItem.sellIn).isEqualTo(expectedSellIn);
        return this;
    }

    public void andExpectQuality(int expectedQuality) {
        assertThat(abstractItem.quality).isEqualTo(expectedQuality);
    }
}
