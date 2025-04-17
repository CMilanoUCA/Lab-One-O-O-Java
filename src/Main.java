// Carson Milano
// Lab One (Making Change)
// Lab Four (Making Change w/Patterns)

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Mode Selection
        System.out.println("Select mode:");
        System.out.println("1. Console");
        System.out.println("2. GUI");
        System.out.print("Enter choice (1-2): ");

        int modeChoice = getValidChoice(scan, 2);

        if (modeChoice == 1) {
            runConsoleMode(scan);
        } else {
            SwingUtilities.invokeLater(() -> new RegisterPanel().showGUI());
        }
    }

    private static void runConsoleMode(Scanner scan) {
        // Currency Selection
        System.out.println("\nSelect Currency:");
        Currency.CurrencyType[] currencies = Currency.CurrencyType.values();
        for (int i = 0; i < currencies.length; i++) {
            System.out.println((i + 1) + ". " + currencies[i].name());
        }

        System.out.print("Enter choice (1-" + currencies.length + "): ");
        int currencyChoice = getValidChoice(scan, currencies.length);
        Currency.CurrencyType selectedCurrency = currencies[currencyChoice - 1];

        // Amount Input
        double amount = 0;
        while (true) {
            System.out.print("Enter monetary amount: ");
            // Catches errors if amount is neg OR amount != number
            try {
                amount = scan.nextDouble();
                if (amount > 0) break;
                System.out.println("Amount must be positive. Try again.");
            } catch (Exception e) {
                System.out.println("Invalid amount. Please enter a number.");
                scan.next(); // Clear invalid input
            }
        }

        // Process and Display Change
        Register register = new Register(selectedCurrency);
        Purse purse = register.makeChange(amount);

        System.out.println("\nChange in " + selectedCurrency.name() + ":");
        System.out.println(purse);
    }

    private static int getValidChoice(Scanner scan, int maxChoice) {
        while (true) {
            try {
                int choice = scan.nextInt();
                if (choice >= 1 && choice <= maxChoice) {
                    return choice;
                }
                System.out.print("Invalid choice. Please enter 1-" + maxChoice + ": ");
            } catch (Exception e) {
                System.out.print("Invalid input. Please enter a number: ");
                scan.next(); // Clear invalid input
            }
        }
    }
}