package decorator;

import java.awt.*;

public class Camera {
    private ColorFilter[] filters;

    public Camera() {
        setFilters();
    }

    public Color capture(final Color inputColor) {
        Color currentColor = inputColor;
        for (ColorFilter filter : filters) {
            currentColor = filter.applyFilter(currentColor);
        }
        return currentColor;
    }

    public void setFilters(final ColorFilter... filters) {
        this.filters = filters;
    }

}
