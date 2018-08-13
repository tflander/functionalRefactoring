package decorator;

import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static org.assertj.core.api.Assertions.assertThat;

public class CameraTest {


    private Camera camera;

    final Color inputColor = new Color(200, 100, 200);

    @Before
    public void setUp() throws Exception {
        camera = new Camera();
    }

    @Test
    public void noFilter() {
        assertThat(camera.capture(inputColor)).isEqualTo(new Color(200, 100, 200));
    }

    @Test
    public void brighter() {
        camera.setFilters(Color::brighter);
        assertThat(camera.capture(inputColor)).isEqualTo(new Color(255, 142, 255));
    }

    @Test
    public void darker() {
        camera.setFilters(Color::darker);
        assertThat(camera.capture(inputColor)).isEqualTo(new Color(140, 70, 140));
    }

    @Test
    public void darkerTwice() {
        camera.setFilters(Color::darker, Color::darker);
        assertThat(camera.capture(inputColor)).isEqualTo(new Color(98, 49, 98));
    }

}
