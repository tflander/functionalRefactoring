package executeAroundMethod.exercise;

import org.junit.Test;

public class EmbeddedDeviceTest {

    @Test
    public void runDevice() throws Exception {

        EmbeddedDevice device = new EmbeddedDevice();
        device.powerUp();
        device.doThis(120);
        device.doThat(-45);
        device.powerDown();

        // TODO: replace the block above with this commented out block
        //        EmbeddedDevice.runCommands(
//                EmbeddedDevice.doThisWith(120),
//                EmbeddedDevice.doThatWith(-45)
//        );

    }
}
