package delegate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CalculateNAVTest {

    @InjectMocks
    private CalculateNAV calculateNAV;

    @Mock
    StockPriceFacade stockPriceFacade;

    @Test
    public void computesStockWorthUsingMock() {
        when(stockPriceFacade.getPrice("MyStock")).thenReturn(BigDecimal.valueOf(123.45));
        BigDecimal myStock = calculateNAV.computeStockWorth("MyStock", 10);
        assertThat(myStock).isEqualByComparingTo(BigDecimal.valueOf(1234.50));
    }

    @Test
    public void computesStockWorthUsingYahoo() {
        CalculateNAV realNav = new CalculateNAV(new YahooFacade());
        BigDecimal googleValue = realNav.computeStockWorth("GOOG", 10);
        System.out.println("10 shares of google are worth $" + googleValue);
        assertThat(googleValue).isGreaterThanOrEqualTo(BigDecimal.valueOf(10000));
    }
}
