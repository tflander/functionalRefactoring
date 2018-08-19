package decorator;

import java.io.PrintStream;

public class RedDecorator extends ShapeDecorator {

    public RedDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public PrintStream getPrintStream() {
        return decoratedShape.getPrintStream();
    }

    @Override
    public void draw() {
        getPrintStream().println("Red");
        super.draw();
    }
}
