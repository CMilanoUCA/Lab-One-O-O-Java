public class Register {
    Purse makeChange(double amount) {
        // Create a new Interface/Class ChangeMaker()
        // Maybe give makeChange() a Denomination field? for factory
        // Also get currency before amount calc from CurrencyFactory();

        Purse p = new Purse();

        amount = amount * 100;
        long rAmount = Math.round(amount);
        amount = rAmount / 100.0;
        for (int i = 0; i < 10; i++) {
            Denomination d = Currency.US_CURRENCY[i];
            int moneyCount = (int)(amount/d.amt);
            amount -= moneyCount * d.amt;
            p.add(d, moneyCount);
        }

        return p;
    }  // takes an amt and returns a Purse containing that amount
                                          // in the fewest number of bills and coins.static void main(String[] args) {}

}


