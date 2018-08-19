package decorator;

import java.io.PrintStream;

public abstract class BaseShape implements Shape {

    private final PrintStream out;

    public BaseShape(PrintStream out) {
        this.out = out;
    }

    public BaseShape() {
        this.out = System.out;
    }

    @Override
    public PrintStream getPrintStream() {
        return out;
    }
}
