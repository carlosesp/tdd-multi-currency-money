package pe.carlosesp.tddmoney.chapter01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoneyTest {

    /**
     * <p> Problems found:
     * <ul>
     *     <li>No class Dollar</li>
     *     <li>No constructor</li>
     *     <li>No method times(int)</li>
     *     <li>No field amount</li>
     * </ul>
     *
     * <p> Duplication found:
     * <pre>
     * Between the data in the test and the data in the code.
     * Test: Dollar dollar = new Dollar(5);
     * Test: dollar.times(2);
     * Code: int amount = 10; -> int amount 5 * 2;
     * -> Numbers 5 and 2 are being duplicated, and we must remove
     * duplication before starting the next task.
     * </pre>
     *
     * <p>Solution
     * <pre>
     * Move object initialization to times() method.
     * amount = 5 * 2;
     * Assign amount variable with value passed to the constructor.
     * this.amount = amount
     * Replace 5 with amount variable in times() method.
     * Replace 2 with multiplier parameter in times() method.
     * Use *= operator.
     * </pre>
     */
    @Test
    public void testMultiplication() {
        Dollar dollar = new Dollar(5);
        dollar.times(2);

        Assertions.assertEquals(10, dollar.amount);

    }

}
