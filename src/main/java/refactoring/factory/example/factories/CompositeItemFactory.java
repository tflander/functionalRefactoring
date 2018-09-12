package refactoring.factory.example.factories;

import refactoring.factory.example.items.AbstractItem;

import java.util.ArrayList;
import java.util.List;

public class CompositeItemFactory implements ItemFactory {

    private static final List<ItemFactory> factories = new ArrayList<>();

    static {
        factories.add(new ConjuredItemFactory());
        factories.add(new ConcertTicketFactory());
        factories.add(new LegendaryItemFactory());
        factories.add(new BrieFactory());
        factories.add(new NormalItemFactory());
    }

    @Override
    public AbstractItem create(String itemName, int sellIn, int quality) {

        for (ItemFactory factory : factories) {
            if (factory.applies(itemName)) {
                return factory.create(itemName, sellIn, quality);
            }
        }
        throw new IllegalStateException("Fix this bug in Composite Item Factory");
    }

    @Override
    public boolean applies(String itemName) {
        return true;
    }
}
