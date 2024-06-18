package de.ppi.codeiumworkshop.exercise3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountManagerTest {
    private BankAccountManager accountManager;

    @BeforeEach
    public void setUp() {
        accountManager = new BankAccountManager("John Doe", 1000.0);
    }


    
    @Test
    public void testDeposit() {
        accountManager.deposit(500.0);
        assertEquals(1500.0, accountManager.getBalance());
    }

    @Test
    public void testWithdraw() {
        accountManager.withdraw(200.0);
        assertEquals(800.0, accountManager.getBalance());
    }

    @Test
    public void testOverdraw() {
        accountManager.withdraw(1500.0);
        assertEquals(1000.0, accountManager.getBalance());
    }



}
