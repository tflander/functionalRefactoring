package decorator;

import java.awt.*;

public class Camera {
    private ColorFilter filter;

    public Camera() {
        setFilter(new BaseColorFilter());
    }

    public Color capture(final Color inputColor) {
        return filter.applyFilter(inputColor);
    }

    public void setFilter(final ColorFilter filters) {
        this.filter = filters;
    }

}
