package pe.carlosesp.tddmoney.chapter09;

/**
 * <ul>
 *     <li>Create filed currency and set its value in the factory methods
 *     that returns Dollar and Franc.</li>
 *     <li>Create currency() method that returns the currency value.</li>
 * </ul>
 */
abstract class Money {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }

    abstract Money times(int multiplier);

    public String currency() {
        return currency;
    }
}
