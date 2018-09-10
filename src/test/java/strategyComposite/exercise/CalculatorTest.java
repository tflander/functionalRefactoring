package strategyComposite.exercise;

import org.junit.Test;

import java.util.function.BinaryOperator;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    public void todo() {
        System.out.println("Replace this test with the commented out section.");
        System.out.println("Use BinaryOperator as your strategy for operating on two integers to produce an integer result");
    }

    /*
    Calculator calculator = new Calculator();

    @Test
    public void adds() {
        assertThat(calculator.op(Operation.ADD, 3, 2)).isEqualTo(5);
    }

    @Test
    public void subtracts() {
        assertThat(calculator.op(Operation.SUBTRACT, 3, 2)).isEqualTo(1);
    }

    @Test
    public void multiplies() {
        assertThat(calculator.op(Operation.MULTIPLY, 3, 2)).isEqualTo(6);
    }
    */

    @Test
    public void hintOne() {
        System.out.println("Hint: You can bind functions to Enum values");
        assertThat(Blah.X.operator.apply(2,3)).isEqualTo(7);
        assertThat(Blah.Y.operator.apply(2,3)).isEqualTo(1);
        assertThat(Blah.Z.operator.apply(2,3)).isEqualTo(10);
    }

    enum Blah {
        X((a,b) -> a*2 + b),
        Y((a,b) -> a*2 - b),
        Z((a,b) -> a*(2 + b));

        public final BinaryOperator<Integer> operator;

        Blah(BinaryOperator<Integer> operator) {

            this.operator = operator;
        }
    }

}

