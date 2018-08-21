package decorator;

import java.io.PrintStream;

public abstract class BaseShape implements Shape {

    private final PrintStream canvas;

    public BaseShape(PrintStream canvas) {
        this.canvas = canvas;
    }

    public BaseShape() {
        this.canvas = System.out;
    }

    @Override
    public PrintStream getCanvas() {
        return canvas;
    }
}
