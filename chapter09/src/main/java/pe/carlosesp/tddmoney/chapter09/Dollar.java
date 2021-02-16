package pe.carlosesp.tddmoney.chapter09;

/**
 * <ul>
 *     <li>Construct implementation moved to the parent class.</li>
 *     <li>Modify times() method to use factory method.</li>
 * </ul>
 */
public class Dollar extends Money {

    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }

}
