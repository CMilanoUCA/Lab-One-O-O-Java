// Greedy Strategy Pattern

public class GreedyChangeStrategy implements ChangeStrategy {
    @Override
    public Purse makeChange(double amount, Denomination[] currency) {
        Purse purse = new Purse();
        amount = Math.round(amount * 100) / 100.0; // Round to 2 decimals

        for (Denomination denom : currency) {
            int count = (int)(amount / denom.amt);
            if (count > 0) {
                purse.add(denom, count);
                amount -= count * denom.amt;
                amount = Math.round(amount * 100) / 100.0; // Re-round
            }
        }
        return purse;
    }
}
