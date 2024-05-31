package account;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    public void checkAccountbalance_test() {
        Account kimAccount = new Account();
        assertEquals(0, kimAccount.checkBalance("pin"));
    }

    @Test
    public void checkThatAccountCanBeDepositedIntoToAccount() {
        Account kimAccount = new Account();
        assertEquals(2000, kimAccount.deposit(2000));
    }

    @Test
    public void checkThatAccountBalanceIsIncreasedAtDoubleDeposit() {

        Account kimAccount = new Account();
        assertEquals(2000, kimAccount.deposit(2000));
        assertEquals(5000, kimAccount.deposit(3000));
        assertEquals(5000, kimAccount.checkBalance("pin"));
    }

    @Test
    public void checkThatBalanceCanBeWithdrawn_at3kBalance() {

        Account kimAccount = new Account();
        assertEquals(3000, kimAccount.deposit(3000));
        assertEquals(2000, kimAccount.withDraw(1000));
        assertEquals(2000, kimAccount.checkBalance("pin"));

    }

    @Test
    public void checkThatAccountWithdrawsAmountThatInNotMoreThanBalance() {

        Account kimAccount = new Account();
        assertEquals(3000, kimAccount.deposit(3000));
        assertEquals(3000, kimAccount.withDraw(5000));
        assertEquals(3000, kimAccount.checkBalance("pin"));

    }

    @Test
    public void checkThatAmountBelowZeroCannotBeWithdrawnFromAccount() {

        Account kimAccount = new Account();
        assertEquals(3000, kimAccount.deposit(3000));
        assertEquals(3000, kimAccount.withDraw(-1000));
        assertEquals(3000, kimAccount.checkBalance("pin"));
    }

    @Test
    public void checkThatDepositOfNegativeAmountIntoAccountIsNotPossible() {

        Account olaAccount = new Account();
        assertEquals(0, olaAccount.deposit(-2000));

    }
    @Test
    public void checkThatTransferFromOneAccountToAnotherIsPossible() {

        Account olaAccount = new Account();
        Account kimAccount = new Account();
        assertEquals(2000, olaAccount.deposit(2000));
        assertEquals(1000, kimAccount.transfer(1000));
        assertEquals(1000, kimAccount.checkBalance("pin"));
        assertEquals(1000,olaAccount.checkBalance("pin"));
    }
}