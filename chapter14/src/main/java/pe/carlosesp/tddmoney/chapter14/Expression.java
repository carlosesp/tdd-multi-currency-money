package pe.carlosesp.tddmoney.chapter14;

public interface Expression {
    Money reduce(Bank bank, String to);
}
