package pe.carlosesp.tddmoney.chapter04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {

    /**
     * <p>Conceptually <i>Dollar.times()</i> should return a Dollar whose value
     * is the value of the receiver times the multiplier.
     *
     * <p>Solution: Rewrite assertions to compare Dollars to Dollars.
     */
    @Test
    public void testMultiplication() {
        Dollar dollar = new Dollar(5);
        assertEquals(new Dollar(10), dollar.times(2));
        assertEquals(new Dollar(15), dollar.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}
