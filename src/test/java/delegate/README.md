# Delegate Example

We have an object model for delegating calls to get stock quotes.

Since all we need is a function to take a ticker symbol and return a price, we can sub out the object model with a function.

TODO:  Eliminate the StockPriceFacade interface and delegate to a Function<String, BigDecimal>

Hint:  You do not have to touch YahooFacade.java, other than to remove the base interface and annotation
