package executeAroundMethod.exercise;

public class EmbeddedDevice {

    public void powerUp() {
        System.out.println("powering up, allocating memory and stuff...");
    }

    public void doThis() throws Exception {
        System.out.println("Doing this...");
        temptFate();
    }

    public void doThat() throws Exception {
        System.out.println("Doing that...");
        temptFate();
    }

    public void powerDown() {
        System.out.println("releasing resources and powering down...");
    }

    private void temptFate() throws Exception {
        if (Math.random() < .1) {
            throw new Exception("Fickle finger of fate failure");
        }
    }

}
