package refactoring.executeAroundMethod.example;

public class ClosableTransaction implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("Transaction closed and resources released.");
    }

    public void execute(String command) {
        System.out.println("Executing command: " + command);
    }
}
