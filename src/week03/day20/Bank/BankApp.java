package week03.day20.Bank;

public class BankApp {
    public static Account findHighestBalance(Account[] accounts) {
        Account highestBalanceAccount = null;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null &&
                    (highestBalanceAccount == null ||
                            accounts[i].getBalance() > highestBalanceAccount.getBalance())) {
                highestBalanceAccount = accounts[i];
            }
        }
        return highestBalanceAccount;
    }

    public static double calculateTotalBalance(Account[] accounts) {
        double totalBalance = 0;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null) {
                totalBalance += accounts[i].getBalance();
            }
        }
        return totalBalance;
    }

    static void main() {
        Account[] accounts = new Account[5];
        accounts[0] = null;
        accounts[1] = new SavingsAccount("Rachel Green", 19000, 35.5);
        accounts[2] = new BusinessAccount("Regina Falantzi", 78.45, 10000);
        accounts[3] = null;
        accounts[4] = new SavingsAccount("Monica Geller", 78.45, 98.4);

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null) {
                accounts[i].deposit(100);
                accounts[i].withdraw(1000);
            }
        }
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] instanceof Reportable)
                ((Reportable) accounts[i]).printReport();
        }
        Account highestBalanceAccount = findHighestBalance(accounts);
        System.out.print("Owner: " + highestBalanceAccount.getOwner() + " - Balance: ");
        System.out.printf("%.2f%n", highestBalanceAccount.getBalance());
        System.out.printf("Total Bank Balance: $%.2f%n", calculateTotalBalance(accounts));
    }
}
