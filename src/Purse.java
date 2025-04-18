import java.util.HashMap;
import java.util.Map;

public class Purse {
    Map <Denomination, Integer> cash;             // represents the money in the purse
    public Purse() {
        cash = new HashMap<Denomination, Integer>();
    }

    public void add(Denomination denom, int num) {
     // adds a number of a particular Denomination
     cash.put(denom, num + cash.getOrDefault(denom, 0));
    }


    public double remove(Denomination denom, int num) {
        Integer current = cash.get(denom);
        if (current == null || current < num) {
            throw new IllegalArgumentException("Not enough " + denom.name + " in purse");
        }
        cash.put(denom, current - num);
        return num * denom.amt;
    }

    public double getValue() {
        // returns the amount of money in the Purse
        double moneyCount = 0;
        for (Denomination denom : cash.keySet()) {
            moneyCount += cash.get(denom) * denom.amt;
        }
        return moneyCount;
    }

    public String toString() {
        String output = "";
        if (getValue() <= 0) {
            return "Empty Purse";
        }
        // Only loop through existing Denominations!
        for (Denomination denom : cash.keySet()) {
            if (cash.get(denom) > 0) {
                output += cash.get(denom) + " " + denom.name + " " + denom.form + "\n";
            }
        }
        return output;
    }
}
