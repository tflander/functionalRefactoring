package decorator.example;

public class DropShadowDecorator extends ShapeDecorator {

    public DropShadowDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        getCanvas().println("Drawing dropshadow for " + decoratedShape.getShapeDescription() + "...");
        super.draw();
    }

}
