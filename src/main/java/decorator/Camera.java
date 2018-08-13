package decorator;

import java.awt.*;
import java.util.Optional;

public class Camera {
    private Optional<ColorFilter> filter;

    public Camera() {
        filter = Optional.empty();
    }

    public Color capture(final Color inputColor) {
        if(filter.isPresent()) {
            return filter.get().applyFilter(inputColor);
        }
        return inputColor;
    }

    public void setFilter(final ColorFilter filter) {
        this.filter = Optional.of(filter);
    }

}
