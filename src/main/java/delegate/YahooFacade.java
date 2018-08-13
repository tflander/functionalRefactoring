package delegate;

import yahoofinance.YahooFinance;

import java.io.IOException;
import java.math.BigDecimal;

public class YahooFacade implements StockPriceFacade {

    @Override
    public BigDecimal getPrice(final String ticker) {

        try {
            return YahooFinance.get(ticker).getQuote().getPrice();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
