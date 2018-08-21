package decorator;

import java.io.PrintStream;

public class Circle extends BaseShape {


    public Circle(PrintStream out) {
        super(out);
    }

    public Circle() {
        super();
    }

    @Override
    public void draw() {
        getCanvas().println("Circle");
    }
}
