import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            displayMenu();
            String option = scanner.next();
            switch (option) {
                case "1": break;
                case "2": break;
                case "3": break;
                case "4": break;
                case "5": exit = true; System.out.println("\nGoodbye!");
                    scanner.close();
                    break;
                default: System.out.println("Invalid option. Please select a number from 0 to 5.\n"); break;
            }
        }
    }

    public static void displayMenu() {
        System.out.print("""
                1: Create a new account
                2: Deposit money
                3: Withdraw money
                4: View account details
                5: Exit
                
                Please enter your option:""" + " ");
    }
}
