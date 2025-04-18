public class Register {
    private Denomination[] currency;
    private ChangeStrategy strategy;

    public Register(Currency.CurrencyType currencyType) {
        this(currencyType, new GreedyChangeStrategy()); // Default to greedy
    }

    public Register(Currency.CurrencyType currencyType, ChangeStrategy strategy) {
        // Factory Pattern Call
        this.currency = Currency.getCurrency(currencyType);
        this.strategy = strategy;
    }

    public void setStrategy(ChangeStrategy strategy) {
        this.strategy = strategy;
    }

    public String getStrategyName() {
        return strategy.getClass().getSimpleName().replace("ChangeStrategy", "");
    }

    public Purse makeChange(double amount) {
        return strategy.makeChange(amount, currency);
    }
}