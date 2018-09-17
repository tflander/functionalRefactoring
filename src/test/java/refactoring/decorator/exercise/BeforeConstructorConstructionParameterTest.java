package refactoring.decorator.exercise;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BeforeConstructorConstructionParameterTest {

    @Test
    public void simpleRobot() {
        Robot robot = Robot.create("basic robot");
        assertThat(robot.getBuildInstructions()).containsExactly("Building basic robot");
    }
}
