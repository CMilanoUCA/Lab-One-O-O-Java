import java.util.HashMap;
import java.util.Map;

public class Purse {
    Map <Denomination, Integer> cash;             // represents the money in the purse
    public Purse() {
        cash = new HashMap<Denomination, Integer>();
    }

    public void add(Denomination denom, int num) {
     cash.put(denom, num + cash.getOrDefault(denom, 0));
    }                // adds a number of a particular denomination


    public double remove(Denomination denom, int num) {
        Integer current = cash.get(denom);
        if (current == null || current < num) {
            throw new IllegalArgumentException("Not enough " + denom.name + " in purse");
        }
        cash.put(denom, current - num);
        return num * denom.amt;
    }

    public double getValue() {
        double moneyCount = 0;
        for (Denomination denom : cash.keySet()) {
            moneyCount += cash.get(denom) * denom.amt;
        }
        return moneyCount;
    } // returns the amount of money in the Purse

    public String toString() {
        String output = "";
        if (getValue() <= 0) {
            return "Empty Purse";
        }
        for (Denomination denom : cash.keySet()) {  // Only loop through existing denominations
            if (cash.get(denom) > 0) {
                output += cash.get(denom) + " " + denom.name + " " + denom.form + "\n";
            }
        }
        return output;
    }
}
