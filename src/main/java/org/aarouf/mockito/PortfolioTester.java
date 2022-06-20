package org.aarouf.mockito;

;

public class PortfolioTester {
    Portfolio portfolio;
    StockService stockService;

    public static void main(String[] args) {
        PortfolioTester tester = new PortfolioTester();
        tester.setUp();
    }

    public void setUp(){
        portfolio = new Portfolio();
    }
}
