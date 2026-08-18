package week03.day20.Bank;

public class SavingsAccount extends Account implements Reportable {
    private double interestRate;

    public SavingsAccount(String owner, double balance, double interestRate) {
        super(owner, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > getBalance()) {
            System.out.println("Insufficient funds");
        } else {
            setBalance(getBalance() - amount);
            System.out.printf("Withdrawal successful. New balance: %.2f%n", getBalance());
        }
    }

    @Override
    public void printReport() {
        System.out.println("Account information:");
        System.out.println("Owner: " + getOwner());
        System.out.printf("Current Balance: %.2f%n", getBalance());
        System.out.printf("Interest rate: %.2f%n", interestRate);
    }
}
