package basics.function.exercise;

import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static org.assertj.core.api.Assertions.assertThat;

public class Aggregator {

    @Test
    @Ignore("finish the sumIntegers function")
    public void aggregationFunction() {

        Function<List<Integer>, Integer> sumIntegers = list -> 0;

        List<Integer> numbersToAdd = Arrays.asList(1, 2, 3);
        int sumUsingStream = numbersToAdd.stream().mapToInt(i -> i).sum();
        assertThat(sumIntegers.apply(numbersToAdd)).isEqualTo(6).isEqualTo(sumUsingStream);
    }
}
