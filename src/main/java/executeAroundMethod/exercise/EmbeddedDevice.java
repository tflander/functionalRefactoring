package executeAroundMethod.exercise;

public class EmbeddedDevice {

    public void powerUp() {
        System.out.println("powering up, allocating memory and stuff...");
    }

    public void doThis() {
        System.out.println("Doing this...");
    }

    public void doThat() {
        System.out.println("Doing that...");
    }

    public void powerDown() {
        System.out.println("releasing resources and powering down...");
    }
}
