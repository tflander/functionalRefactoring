package delegate;

import java.math.BigDecimal;

public class CalculateNAV {

    StockPriceFacade stockPriceFacade;

    public CalculateNAV(final StockPriceFacade stockPriceFacade) {
        this.stockPriceFacade = stockPriceFacade;
    }

    public BigDecimal computeStockWorth(
            final String ticker, final int shares) {
        return stockPriceFacade.getPrice(ticker).multiply(BigDecimal.valueOf(shares));
    }

}
