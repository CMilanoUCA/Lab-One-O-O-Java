public class Register {
    private final Denomination[] currency;

    public Register() {
        this(Currency.CurrencyType.US);  // Default to US currency
    }

    public Register(Currency.CurrencyType currencyType) {
        this.currency = Currency.getCurrency(currencyType);  // Factory Pattern Call
    }

    public Purse makeChange(double amount) {
        Purse p = new Purse();
        // Change Conversion
        long cents = Math.round(amount * 100);
        amount = cents / 100.0;

        for (Denomination d : currency) {
            if (amount <= 0) break;
            int moneyCount = (int)(amount / d.amt);
            if (moneyCount > 0) {
                amount -= moneyCount * d.amt;
                p.add(d, moneyCount);
                // Re-calc to avoid Floating-Point Errors
                amount = Math.round(amount * 100) / 100.0;
            }
        }
        return p;
    }
}