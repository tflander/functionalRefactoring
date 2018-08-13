package delegate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.math.BigDecimal;
import java.util.function.Function;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CalculateNAVTest {

    @InjectMocks
    private CalculateNAV calculateNAV;

    @Mock
    Function<String, BigDecimal> priceFinder;

    @Test
    public void name() {
        when(priceFinder.apply("MyStock")).thenReturn(BigDecimal.valueOf(123.45));
        BigDecimal myStock = calculateNAV.computeStockWorth("MyStock", 10);
        assertThat(myStock).isEqualByComparingTo(BigDecimal.valueOf(1234.50));
    }
}