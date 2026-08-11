package week03.day15;

public class BankAccountApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Anna", 100);

        System.out.println("Owner: " + account.getOwner());
        System.out.println("Balance: " + account.getBalance());

        account.deposit(50);
        System.out.println("After deposit: " + account.getBalance());

        account.withdraw(30);
        System.out.println("After withdrawal: " + account.getBalance());

        account.withdraw(500);
        System.out.println("After invalid withdrawal: " + account.getBalance());

        account.deposit(-50);
        System.out.println("After invalid deposit: " + account.getBalance());
    }
}
