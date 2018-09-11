package decorator.exercise;

import java.util.ArrayList;
import java.util.List;

public class Robot {

    private static String type;

    public static Robot create(String type) {
        Robot.type = type;
        return new Robot();
    }

    public List<String> getBuildInstructions() {
        List<String> instructions = new ArrayList<>();
        instructions.add("Building " + type);
        return instructions;
    }
}
