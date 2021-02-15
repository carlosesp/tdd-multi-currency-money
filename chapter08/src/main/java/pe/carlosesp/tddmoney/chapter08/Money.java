package pe.carlosesp.tddmoney.chapter08;

/**
 * Create factory methods for Dollar and Franc.
 * Make class abstract and declare times() method that
 * is implemented in each subclass.
 */
abstract class Money {
    protected int amount;

    public static Money dollar(int amount) {
        return new Dollar(amount);
    }

    public static Money franc(int amount) {
        return new Franc(amount);
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }

    abstract Money times(int multiplier);
}
