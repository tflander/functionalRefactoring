package decorator;

import java.io.PrintStream;

public abstract class BaseShape implements Shape {

    private final PrintStream canvas;
    private final String shapeDescription;

    public BaseShape(PrintStream canvas, String shapeDescription) {
        this.shapeDescription = shapeDescription;
        this.canvas = canvas;
    }

    @Override
    public PrintStream getCanvas() {
        return canvas;
    }

    @Override
    public void draw() {
        canvas.println("Drawing " + shapeDescription + " Outline...");
    }

    @Override
    public String getShapeDescription() {
        return shapeDescription;
    }
}
