package decorator;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Camera {
    private List<Function<Color, Color>> filters;

    public Camera() {
        setFilters();
    }

    public Color capture(final Color inputColor) {
        Color currentColor = inputColor;
        for(Function<Color, Color> filter : filters) {
            currentColor = filter.apply(currentColor);
        };
        return currentColor;
    }

    public void setFilters(final Function<Color, Color>... filters) {
        this.filters = Arrays.asList(filters);
    }

}
