// Carson Milano
// Lab One (Making Change)

// IMAGES ARE 50x50, 50x30!!!!!!!!

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);




        System.out.println("Please enter a monetary amount: ");
        double amount = scan.nextDouble();

Register register = new Register();
Purse purse = register.makeChange(amount);
System.out.println(purse);




       // for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            // System.out.println("i = " + i);
       // }


    }
}

