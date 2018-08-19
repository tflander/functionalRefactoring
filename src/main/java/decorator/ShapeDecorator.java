package decorator;

import java.io.PrintStream;

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }

    @Override
    public PrintStream getPrintStream() {
        return decoratedShape.getPrintStream();
    }

}
