package pe.carlosesp.demo.chapter01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * TDD Steps:
 * <ol>
 *     <li>Quickly add a test.</li>
 *     <li>Run all tests and see the new one fail.</li>
 *     <li>Make a little change.</li>
 *     <li>Run all tests and see them all succeed.</li>
 *     <li>Refactor to remove duplication.</li>
 * </ol>
 *
 * <p> Tests for the project:
 * <ol>
 *     <li>Be able to add amounts in two different currencies and convert the result
 *     given a set of exchange rates.</li>
 *     <li>Be able to multiply an amount (price per share) by a number (number of shares)
 *     and receive an amount.</li>
 * </ol>
 *
 * <p> Work based on tasks:
 * <ul>
 *     <li>Make a to-do list of tasks (tests) we want to complete.</li>
 *     <li><b>Text in bold</b> means that the task is being developed.</li>
 *     <li><strike>Text crossed off</strike> means that the task was completed.</li>
 *     <li>New tests can be added to the list as they appear.</li>
 * </ul>
 * <p>
 * List of pending tasks and current task being worked on:
 * <pre>
 * $5 + 10 CHF = $10 if rate is 2:1
 * <b>$5 * 2 = 10</b>
 * <i>*** New tasks identified during the first test's solution ***</i>
 * Make "amount" private
 * Dollar side-effects?
 * Money rounding?
 * </pre>
 */
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
