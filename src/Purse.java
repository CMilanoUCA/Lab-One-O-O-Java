import java.util.HashMap;
import java.util.Map;


public class Purse {
    Map <Main.Denomination, Integer> cash;             // represents the money in the purse


    public Purse() {
        cash = new HashMap<Main.Denomination, Integer>();
    }
    public void add(Main.Denomination denom, int num) {

    }                // adds a number of a particular denomination
    public double remove(Main.Denomination denom, int num) {
        return 0;
    } //diminishes the money in the purse and returns that amount.
    public double getValue() {
        return 0;
    }                          // returns the amount of money in the Purse
    public String toString() {
        return "";
    }                         // returns a string representation of the Purse and its contents
}
