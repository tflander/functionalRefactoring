package executeAroundMethod;

import org.junit.Test;

public class TransactionManagerTest {

    private final TransactionManager transactionManager = new TransactionManager();

    @Test
    public void initialCode() {
        Transaction transaction = transactionManager.startTransaction();
        transaction.execute("save this");
        transaction.execute("save that");
        transaction.close();

        /*
        Problems:
          1) If I need to execute more commands, can I use the same object, or do I need a new one?
          2) What if I forget to close?
          3) What if one of the commands to execute throws an exception?
         */
    }

    @Test
    public void secondPass() {
        Transaction transaction = transactionManager.startTransaction();
        try {
            transaction.execute("save this");
            transaction.execute("save that");
        } finally {
            transaction.close();
        }

        /*

        Solved Problems
          3) What if one of the commands to execute throws an exception?

        Unsolved Problems:
          1) If I need to execute more commands, can I use the same object, or do I need a new one?
          2) What if I forget to close?

        New Problem:
          4) What if I forget the try / finally block?

         */
    }

    @Test
    public void thirdPass() {

        try (ClosableTransaction transaction = transactionManager.startClosableTransaction()) {
            transaction.execute("save this");
            transaction.execute("save that");
        };

        /*
        Solved Problems:
          1) We can assume startClosableTransaction() will act appropriately.  Options:
             - Create a new transaction
             - Use a cached transaction
             - Use a pooled transaction
          2) Commit is handled automagically
          3) Exception handling is also handled

        New problem:
          4) what if I forget the try-with-resources call?
         */

    }

    @Test
    public void executeAroundMethod() {
        SlickTransaction.start()
            .execute("saveThis", "saveThat");

        /*
        Solved Problems:
          1) We can assume SlickTransaction.start() will act appropriately.  Options:
             - Create a new transaction
             - Use a cached transaction
             - Use a pooled transaction
          2) Commit is handled automagically
          3) Exception handling is also handled
         */
    }
}
