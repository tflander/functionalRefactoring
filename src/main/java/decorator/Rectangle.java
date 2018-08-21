package decorator;

import java.io.PrintStream;

public class Rectangle extends BaseShape {

    public Rectangle(PrintStream out) {
        super(out);
    }

    public Rectangle() {
        super();
    }

    @Override
    public void draw() {
        getCanvas().println("Rectangle");
    }
}
