package refactoring.decorator.example;

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
    public PrintStream getCanvas() {
        return decoratedShape.getCanvas();
    }

    @Override
    public String getShapeDescription() {
        return decoratedShape.getShapeDescription();
    }

}
