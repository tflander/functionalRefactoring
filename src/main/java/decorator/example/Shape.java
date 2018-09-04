package decorator.example;

import java.io.PrintStream;

public interface Shape {

    PrintStream getCanvas();

    void draw();

    String getShapeDescription();

}
