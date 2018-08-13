package decorator;

import java.awt.*;
import java.util.Optional;

public class BaseColorFilter implements ColorFilter {

    private final Optional<ColorFilter> nextFilter;

    public BaseColorFilter() {
        this.nextFilter = Optional.empty();
    }

    public BaseColorFilter(ColorFilter nextFilter) {
        this.nextFilter = Optional.of(nextFilter);
    }

    @Override
    public Color applyFilter(Color color) {
        if(nextFilter.isPresent()) {
            return nextFilter.get().applyFilter(color);
        }
        return color;
    }
}
