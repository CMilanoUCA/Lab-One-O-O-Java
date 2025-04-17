public class Currency {
    // Factory Pattern Class (makes denominations)
    //
    public static final Denomination[] US_CURRENCY = {
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
