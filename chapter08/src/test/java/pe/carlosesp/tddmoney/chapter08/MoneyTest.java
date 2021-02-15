package pe.carlosesp.tddmoney.chapter08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Remove reference to subclasses Franc and Money
 * from test code.
 */
public class MoneyTest {

    @Test
    public void testMultiplication() {
        Money dollar = Money.dollar(5);
        assertEquals(Money.dollar(10), dollar.times(2));
        assertEquals(Money.dollar(15), dollar.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertTrue(Money.franc(5).equals(Money.franc(5)));
        assertFalse(Money.franc(5).equals(Money.franc(6)));
        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }

    @Test
    public void testFrancMultiplication() {
        Money franc = Money.franc(5);
        assertEquals(Money.franc(10), franc.times(2));
        assertEquals(Money.franc(15), franc.times(3));
    }

}
