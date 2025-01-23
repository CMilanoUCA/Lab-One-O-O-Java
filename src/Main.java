// Carson Milano
// Lab One (Making Change)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a monetary amount: ");
        double amount = scan.nextDouble();

    Register register = new Register();
    Purse purse = register.makeChange(amount);
    System.out.println(purse);
    }
}