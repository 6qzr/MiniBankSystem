public class BankAccount {
    private String accountName;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountName, String accountNumber, double balance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw amount must be positive.");
            return;
        }
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Not enough balance.");
        }
    }

    public void showAccountInfo() {
        System.out.println("Account Name: " + this.accountName);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Balance: " + this.balance);
        System.out.println();
    }
}
