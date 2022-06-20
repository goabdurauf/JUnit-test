import org.aarouf.BankAccount;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountBeforeAndAfterTest {
    static BankAccount bankAccount;

    @BeforeAll
    public static void prepTest(){
        System.out.println("nima gap");
        bankAccount = new BankAccount(500,0);
    }

    @BeforeEach
    public void beforeEachTest(){
        System.out.println("hello");
    }


    @Test
    public void testWithdraw(){
        bankAccount.withdraw(300);
        assertEquals(200, bankAccount.getBalance());

    }
    @Test
    public void testDeposit(){
        bankAccount.deposit(500);
        assertEquals(700, bankAccount.getBalance());
    }

    @AfterEach
    public void afterEach(){
        System.out.println("bye");
    }

    @AfterAll
    public static void endTest(){
        System.out.println("test finished");
    }
}
