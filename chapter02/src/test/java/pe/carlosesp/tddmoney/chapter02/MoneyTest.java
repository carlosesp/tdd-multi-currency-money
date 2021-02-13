package pe.carlosesp.tddmoney.chapter02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {

    /**
     * Strategies for quickly getting to green:
     * <ol>
     *     <li>Fake It - Return a constant and gradually replace constants
     *     with variables until you have the real code.</li>
     *     <li>Use Obvious Implementation - Type in the real implementation.</li>
     * </ol>
     */
    @Test
    public void testMultiplication() {
        Dollar dollar = new Dollar(5);
        Dollar product = dollar.times(2);
        assertEquals(10, product.amount);

        product = dollar.times(3);
        assertEquals(15, product.amount);
    }

}
