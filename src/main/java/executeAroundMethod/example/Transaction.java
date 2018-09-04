package executeAroundMethod.example;

public class Transaction {

    public void execute(String command) {
        System.out.println("Executing command: " + command);
    }

    public void close() {
        System.out.println("Transaction closed and resources released.");
    }
}
