public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(String accountName, String accountNumber, double balance, double interestRate) {
        super(accountName, accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);  // Use inherited deposit method
        System.out.println("Interest applied: " + interest);
    }

    @Override
    public void showAccountInfo() {
        super.showAccountInfo();
        System.out.println("Interest Rate: " + interestRate);
        System.out.println();
    }

}
