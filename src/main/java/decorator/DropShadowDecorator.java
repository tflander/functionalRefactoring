package decorator;

public class DropShadowDecorator extends ShapeDecorator {

    public DropShadowDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        getCanvas().println("With dropshadow");
    }

}
