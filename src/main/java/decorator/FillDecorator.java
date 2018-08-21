package decorator;

public class FillDecorator extends ShapeDecorator {

    private final String fillColor;

    public FillDecorator(String fillColor, Shape decoratedShape) {
        super(decoratedShape);
        this.fillColor = fillColor;
    }

    @Override
    public void draw() {
        getCanvas().println(fillColor);
        super.draw();
    }
}
