package week03.day20.Bank;

public abstract class Account {
    private String owner;
    private double balance;

    public Account(String owner, double balance) {
        if (owner == null || owner.isBlank()) {
            this.owner = "John Doe";
        } else this.owner = owner;
        if (balance >= 0)
            this.balance = balance;
        else this.balance = 0;
    }

    public Account() {
        this("John Doe", 0);
    }
    public String getOwner() {
        return owner;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double newBalance) {
        balance = newBalance;
    }
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Cannot deposit 0 or less.");
        } else {
            balance += amount;
            System.out.printf("Deposit successful. New Balance: %.2f%n", balance);
        }
    }

    public abstract void withdraw(double amount);
}
