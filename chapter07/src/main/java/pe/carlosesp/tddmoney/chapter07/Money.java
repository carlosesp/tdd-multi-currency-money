package pe.carlosesp.tddmoney.chapter07;

public class Money {
    protected int amount;

    /**
     * Two Money objects are equal only
     * if their amounts and classes are equal.
     * @param object
     * @return
     */
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }
}
