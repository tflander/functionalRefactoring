package decorator;

import java.awt.*;

public class BrighterFilter extends BaseColorFilter {

    public BrighterFilter() {
    }

    public BrighterFilter(ColorFilter nextFilter) {
        super(nextFilter);
    }

    @Override
    public Color applyFilter(Color originalColor) {
        return super.applyFilter(originalColor.brighter());
    }
}
