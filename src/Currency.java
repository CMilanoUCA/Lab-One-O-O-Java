public class Currency {
    public enum CurrencyType { US, EU, UK }  // Supported currency types

    // Private Constructor Preventing Instantiation (Static Factory Only!)
    private Currency() {}

    // Factory Method to Get Different Denominations
    public static Denomination[] getCurrency(CurrencyType type) {
        switch (type) {
            case US: return getUSDollarDenominations();
            case EU: return getEuroDenominations();
            case UK: return getBritishPoundDenominations();
            default: throw new IllegalArgumentException("Unsupported currency type");
        }
    }

    // US Dollar Denominations
    private static Denomination[] getUSDollarDenominations() {
        return new Denomination[] {
                new Denomination("One-Hundred-Dollar Note", 100.00, "Bill", "Images/hundreddollar.png"),
                new Denomination("Fifty-Dollar Note", 50.00, "Bill", "Images/fiftydollar.png"),
                new Denomination("Twenty-Dollar Note", 20.00, "Bill", "Images/twentydollar.png"),
                new Denomination("Ten-Dollar Note", 10.00, "Bill", "Images/tendollar.png"),
                new Denomination("Five-Dollar Note", 5.00, "Bill", "Images/fivedollar.png"),
                new Denomination("One-Dollar Note", 1.00, "Bill", "Images/onedollar.png"),
                new Denomination("Quarter", 0.25, "Coin", "Images/quarter.png"),
                new Denomination("Dime", 0.10, "Coin", "Images/dime.png"),
                new Denomination("Nickel", 0.05, "Coin", "Images/nickel.png"),
                new Denomination("Penny", 0.01, "Coin", "Images/penny.png")
        };
    }

    // Euro Denominations
    private static Denomination[] getEuroDenominations() {
        return new Denomination[] {
                new Denomination("Fifty-Euro Note", 50.00, "Bill", "Images/fiftyeuro.png"),
                new Denomination("Twenty-Euro Note", 20.00, "Bill", "Images/twentyeuro.png"),
                new Denomination("Ten-Euro Note", 10.00, "Bill", "Images/teneuro.png"),
                new Denomination("Five-Euro Note", 5.00, "Bill", "Images/fiveeuro.png"),
                new Denomination("Two-Euro Coin", 2.00, "Coin", "Images/twoeuro.png"),
                new Denomination("One-Euro Coin", 1.00, "Coin", "Images/oneeuro.png"),
                new Denomination("Fifty-Cent Coin", 0.50, "Coin", "Images/fiftycent.png"),
                new Denomination("Twenty-Cent Coin", 0.20, "Coin", "Images/twentycent.png"),
                new Denomination("Ten-Cent Coin", 0.10, "Coin", "Images/tencent.png"),
                new Denomination("Five-Cent Coin", 0.05, "Coin", "Images/fivecent.png"),
                new Denomination("One-Cent Coin", 0.01, "Coin", "Images/onecent.png")
        };
    }

    // British Pound Denominations
    private static Denomination[] getBritishPoundDenominations() {
        return new Denomination[] {
                new Denomination("Fifty-Pound Note", 50.00, "Bill", "Images/fiftypound.png"),
                new Denomination("Twenty-Pound Note", 20.00, "Bill", "Images/twentypound.png"),
                new Denomination("Ten-Pound Note", 10.00, "Bill", "Images/tenpound.png"),
                new Denomination("Five-Pound Note", 5.00, "Bill", "Images/fivepound.png"),
                new Denomination("Two-Pound Coin", 2.00, "Coin", "Images/twopound.png"),
                new Denomination("One-Pound Coin", 1.00, "Coin", "Images/onepound.png"),
                new Denomination("Fifty-Pence Coin", 0.50, "Coin", "Images/fiftypence.png"),
                new Denomination("Twenty-Pence Coin", 0.20, "Coin", "Images/twentypence.png"),
                new Denomination("Ten-Pence Coin", 0.10, "Coin", "Images/tenpence.png"),
                new Denomination("Five-Pence Coin", 0.05, "Coin", "Images/fivepence.png"),
                new Denomination("One-Pence Coin", 0.01, "Coin", "Images/onepenny.png")
        };
    }
}