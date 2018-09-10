package executeAroundMethod.exercise;

import org.junit.Test;

public class EmbeddedDeviceTest {

    @Test
    public void runDevice() {
        EmbeddedDevice device = new EmbeddedDevice();
        device.powerUp();
        device.doThis();
        device.doThat();
        device.powerDown();
    }
}
