package delegate;

import java.math.BigDecimal;

public interface StockPriceFacade {
    BigDecimal getPrice(String ticker);
}
