package decorator;

import java.awt.*;

public class DarkerFilter extends BaseColorFilter {

    public DarkerFilter() {
    }

    public DarkerFilter(ColorFilter nextFilter) {
        super(nextFilter);
    }

    @Override
    public Color applyFilter(Color originalColor) {
        return super.applyFilter(originalColor.darker());
    }
}
