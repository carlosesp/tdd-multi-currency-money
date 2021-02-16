package pe.carlosesp.tddmoney.chapter10;

/**
 * <ul>
 *     <li>Create common times() method that returns Money
 *     instead of a subclass type.</li>
 *     <li>Modify equals() method to validate the currency
 *     instead of the class type.</li>
 * </ul>
 */
class Money {
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
                && currency.equals(money.currency);
    }

    public Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    public String currency() {
        return currency;
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}
