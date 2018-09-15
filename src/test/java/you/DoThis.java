package you;

import org.junit.AssumptionViolatedException;

public class DoThis extends AssumptionViolatedException {

    public DoThis(String message) {
        super(message);
    }
}
