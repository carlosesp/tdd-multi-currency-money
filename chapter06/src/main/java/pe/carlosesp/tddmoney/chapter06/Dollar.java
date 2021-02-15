package pe.carlosesp.tddmoney.chapter06;

/**
 * Extend base class Money that contains amount field,
 * and equals() method implementation.
 */
public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
