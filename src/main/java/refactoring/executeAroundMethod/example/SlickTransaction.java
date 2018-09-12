package refactoring.executeAroundMethod.example;

public class SlickTransaction {

    private final Transaction transaction;

    public SlickTransaction(Transaction transaction) {

        this.transaction = transaction;
    }

    public static SlickTransaction start() {
        return new SlickTransaction(new Transaction());
    }

    public void execute(String... commands) {
        try {
            for (String command : commands) {
                transaction.execute(command);
            }
        } finally {
            transaction.close();
        }
    }
}
