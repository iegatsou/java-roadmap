package week03.day15;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        if (owner.equals(""))
            this.owner = "John Doe";
        else
            this.owner = owner;
        if (balance >= 0)
            this.balance = balance;
        else
            System.out.println("No negative balance allowed. Accounts balance is set to zero");
    }

    public double getBalance() {
        return this.balance;
    }

    public String getOwner() {
        return this.owner;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than zero.");
        } else
            balance += amount;
    }
    public void withdraw(double amount){
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
        } else if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

}

