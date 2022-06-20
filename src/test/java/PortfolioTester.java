import org.aarouf.mockito.Portfolio;
import org.aarouf.mockito.StockService;
import static org.mockito.Mockito.*;

public class PortfolioTester {
    Portfolio portfolio;
    StockService stockService;

    public static void main(String[] args) {
        PortfolioTester tester = new PortfolioTester();
        tester.setUp();
    }

    public void setUp(){
        portfolio = new Portfolio();
        stockService = mock(StockService.class);
        portfolio.setStockService(stockService);
    }
}
