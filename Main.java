import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<BankAccount> accounts = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            displayMenu();
            String option = scanner.next();
            switch (option) {
                case "1": newAccount(scanner); break;
                case "2": break;
                case "3": break;
                case "4": viewAccountDetails(scanner); break;
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

    public static void newAccount(Scanner scanner) {
        System.out.print("Enter account name: ");
        scanner.nextLine(); // Consume leftover newline
        String name = scanner.nextLine();

        System.out.print("Enter account number: ");
        String number = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();

        BankAccount account = new BankAccount(name, number, balance);
        accounts.add(account);

        System.out.println("\nAccount created successfully!\n");
    }

    public static void viewAccountDetails(Scanner scanner) {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found.\n");
            return;
        }

        scanner.nextLine(); // clear buffer
        System.out.print("Enter account number: ");
        String inputNumber = scanner.nextLine();

        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(inputNumber)) {
                System.out.println("\nAccount details:");
                account.showAccountInfo();
                return;
            }
        }
        System.out.println("Account not found.\n");
    }


}
