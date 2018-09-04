package executeAroundMethod.example;

public class TransactionManager {

    public Transaction startTransaction() {
        System.out.println("transaction started");
        return new Transaction();
    }

    public ClosableTransaction startClosableTransaction() {
        System.out.println("closable transaction started");
        return new ClosableTransaction();
    }
}
