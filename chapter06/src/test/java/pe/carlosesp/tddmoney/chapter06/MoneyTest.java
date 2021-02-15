package pe.carlosesp.tddmoney.chapter06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {

    @Test
    public void testMultiplication() {
        Dollar dollar = new Dollar(5);
        assertEquals(new Dollar(10), dollar.times(2));
        assertEquals(new Dollar(15), dollar.times(3));
    }

    /**
     * Add missing test for comparing Francs.
     */
    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(5).equals(new Franc(6)));
    }

    @Test
    public void testFrancMultiplication() {
        Franc franc = new Franc(5);
        assertEquals(new Franc(10), franc.times(2));
        assertEquals(new Franc(15), franc.times(3));
    }

}
