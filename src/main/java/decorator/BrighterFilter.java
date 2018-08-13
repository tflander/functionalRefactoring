package decorator;

import java.awt.*;

public class BrighterFilter implements ColorFilter {
    @Override
    public Color applyFilter(Color originalColor) {
        return originalColor.brighter();
    }
}
