import org.example.Account;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Account account = new Account();

    @Test
    void testDeposit() {
        account.deposit(100);
        assertEquals(100, account.getBalance());
        account.deposit(200);
        assertEquals(300, account.getBalance());
    }

    @Test
    void testWithdraw() {
        account.deposit(100);
        account.withdraw(50);
        assertEquals(50, account.getBalance());
        account.withdraw(25);
        assertEquals(25, account.getBalance());
    }


}
