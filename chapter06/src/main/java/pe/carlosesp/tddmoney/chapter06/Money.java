package pe.carlosesp.tddmoney.chapter06;

/**
 * Create base class Money with amount field,
 * and equals() method implementation.
 */
public class Money {
    protected int amount;

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount;
    }
}
