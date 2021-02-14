package pe.carlosesp.tddmoney.chapter05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {

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

    /**
     * <p>In order to approach to first most complex test, first we will
     * write a test for working with a similar object Franc, which we can
     * get to work the same way that Dollar works.
     *
     * <p>Notice that this will introduce duplication that will be addressed later.
     */
    @Test
    public void testFrancMultiplication() {
        Franc dollar = new Franc(5);
        assertEquals(new Franc(10), dollar.times(2));
        assertEquals(new Franc(15), dollar.times(3));
    }

}
