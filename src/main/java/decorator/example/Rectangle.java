package decorator.example;

import java.io.PrintStream;

public class Rectangle extends BaseShape {

    public Rectangle(PrintStream out) {
        super(out, "Rectangle");
    }
}
