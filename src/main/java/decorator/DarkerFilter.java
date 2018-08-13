package decorator;

import java.awt.*;

public class DarkerFilter implements ColorFilter {

    @Override
    public Color applyFilter(Color originalColor) {
        return originalColor.darker();
    }
}
