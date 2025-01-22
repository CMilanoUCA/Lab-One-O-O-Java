// Carson Milano
// Lab One (Making Change)

// IMAGES ARE 50x50, 50x30!!!!!!!!

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public record Denomination(String name, double amt, String form, String img) { }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Denomination penny = new Denomination("Penny", 0.01, "Coin", "penny.jpg");
        Denomination nickel = new Denomination("Nickel", 0.05, "Coin", "nickel.jpg");
        Denomination dime = new Denomination("Dime", 0.10, "Coin", "dime.jpg");
        Denomination quarter = new Denomination("Quarter", 0.25, "Coin", "quarter.jpg");

        Denomination onedollar = new Denomination("One-Dollar Note", 1.00, "Bill", "onedollar.jpg");
        Denomination fivedollar = new Denomination("Five-Dollar Note", 5.00, "Bill", "fivedollar.jpg");
        Denomination tendollar = new Denomination("Ten-Dollar Note", 10.00, "Bill", "tendollar.jpg");
        Denomination twentyfivedollar = new Denomination("Twenty-Five-Dollar Note", 25.00, "Bill", "twentyfivedollar.jpg");
        Denomination fiftydollar = new Denomination("Fifty-Dollar Note", 50.00, "Bill", "fiftydollar.jpg");
        Denomination hundreddollar = new Denomination("One-Hundred-Dollar Note", 100.00, "Bill", "hundreddollar.jpg");

        System.out.println("Please enter a monetary amount: ");
        double amt = scan.nextDouble();


        // Purse makeChange (double amt)



       // for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            // System.out.println("i = " + i);
       // }


    }
}

