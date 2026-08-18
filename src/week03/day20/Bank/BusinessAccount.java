package week03.day20.Bank;

public class BusinessAccount extends Account implements Reportable {
    double overdraftLimit;

    public BusinessAccount(String owner, double balance, double overdraftLimit) {
        super(owner, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > getBalance() + overdraftLimit) {
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
        System.out.printf("Overdraft Limit: %.2f%n", overdraftLimit);
    }
}
