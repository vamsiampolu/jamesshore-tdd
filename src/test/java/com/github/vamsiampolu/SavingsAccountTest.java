package com.github.vamsiampolu;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class SavingsAccountTest
{

    @Test
    public void depositAndWithdrawal() {
        SavingsAccount acc = new SavingsAccount();
        acc.deposit(100);
        assertEquals("after deposit", 100, acc.balance());
        acc.withdraw(50);
        assertEquals("after withdrawal", 50, acc.balance());
    }

    @Test
    public void negativeBalanceIsJustFine() {
        SavingsAccount acc = new SavingsAccount();
        acc.withdraw(75);
        assertEquals(-75, acc.balance());
    }
}
