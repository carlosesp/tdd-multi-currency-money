package pe.carlosesp.tddmoney.chapter03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {

    @Test
    public void testMultiplication() {
        Dollar dollar = new Dollar(5);

        Dollar product = dollar.times(2);
        assertEquals(10, product.amount);

        product = dollar.times(3);
        assertEquals(15, product.amount);
    }

    /**
     * Using Value Objects:
     * <ul>
     *     <li>All operations must return a new object.</li>
     *     <li>Should implement equals().</li>
     * </ul>
     *
     * <p>Implementation strategy: <b>Triangulation</b>
     * <p>We generalize code when theres is two or more examples.
     * When the second example demands a more general solutions,
     * then and only then do we generalize.
     */
    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}
