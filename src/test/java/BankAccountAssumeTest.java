import org.aarouf.BankAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

public class BankAccountAssumeTest {
    @Test
    public void testActive() {

        BankAccount bankAccount = new BankAccount(500, 0);
        assumingThat(bankAccount == null, () -> assertTrue(bankAccount.isActive()));
    }
}
