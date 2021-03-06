package refactoring.executeAroundMethod.exercise;

import org.junit.Test;

public class EmbeddedDeviceTest {

    @Test
    public void runDevice() {

//        EmbeddedDevice device = new EmbeddedDevice();
//        device.powerUp();
//        try {
//            device.doThis(120);
//            device.doThat(-45);
//        } catch (Exception e) {
//            System.out.println("Ignoring Fickle Finger of Fate error");
//        }
//        device.powerDown();

        // TODO: replace the block above with this commented out block
        // Hint:  RunCommands needs to:
        //   1) Take an array of Runnables, which are functions that take no parameters and return nothing.
        //   2) act against an instance of EmbeddedDevice, either through construction, caching, or pooling.
        //   3) Power up the device
        //   4) Power down the device (even if there is a failure)
        //   5) One of:  de-allocate the device, return it to a pool, or leave the device cached
        //
        //   This code does not need to be thread-safe
//                EmbeddedDevice.runCommands(
//                EmbeddedDevice.doThisWith(120),
//                EmbeddedDevice.doThatWith(-45)
//        );

    }

    @Test
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

    @Test
    public void hintOne() {
        Runnable thisFunctionIsCreatedThroughCurrying = showCurryingHint("Hint: Use currying to construct functions");
        thisFunctionIsCreatedThroughCurrying.run();
    }

    @Test
    public void hintTwo() {
        System.out.println("Functions, unlike methods, cannot throw checked exceptions");

        EmbeddedDevice device = new EmbeddedDevice();

        // Compile error: Unhandled Exception
//         Runnable command = () -> device.doThis(10);

        // ...but this is OK:
        Runnable command = () -> {
            try {
                device.doThis(10);
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        };
        command.run();

    }

    private Runnable showCurryingHint(String hint) {
        return () -> {
            System.out.println(hint);
            System.out.println("This is an example of constructing a curried function that reduces the parameters from one to zero");
            System.out.println("We call a function that takes one parameter and return a function that takes zero parameters");
        };
    }
}
