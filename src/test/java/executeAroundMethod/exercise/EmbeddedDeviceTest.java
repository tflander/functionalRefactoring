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

    @Test(expected = Exception.class)
    public void verifyEventualFailure() {
        EmbeddedDevice device = new EmbeddedDevice();
        device.powerUp();
        while (true) {
            try {
                device.doThis(120);
                device.doThat(-45);
            } catch (Exception e) {
                System.out.println("Encountered expected exception " + e.getMessage());
                return;
            }
        }
    }
}
