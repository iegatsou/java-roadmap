package week01.project;

import java.util.Scanner;

public class AtmConsole {
    public static int showMenu(Scanner scanner) {

        System.out.println("===== ATM =====\n" + "\n" + "1. Check Balance\n" + "2. Deposit\n" + "3. Withdraw\n" + "0. Exit\n" + "\n" + "Choose: ");
        int choice = scanner.nextInt();
        return choice;
    }

    public static void checkBalance(double balance) {
        System.out.println("Your Balance is: " + balance + " $ !\n");

    }

    public static double deposit(Scanner scanner, double oldBalance) {
        System.out.print("Add Amount: ");
        double addAmount = scanner.nextDouble();
        if (addAmount <= 0) {
            System.out.println("The deposit amount must be greater than zero!\n");
            return oldBalance;
        } else {
            System.out.println("Balance added successfully!\n");
            return oldBalance + addAmount;
        }
    }

    public static double withdraw(Scanner scanner, double oldBalance) {
        System.out.print("Withdraw Amount: ");
        double withdrawAmount = scanner.nextDouble();
        if (withdrawAmount <= 0) {
            System.out.println("The withdraw amount must be greater than zero!\n");
            return oldBalance;
        }
        if (withdrawAmount <= oldBalance) {
            System.out.println("Withdrawal successful!\n");
            return oldBalance - withdrawAmount;
        }

        System.out.println("Insufficient funds!\n");
        return oldBalance;

    }


    public static void main(String[] args) {

        boolean running = true;
        double balance = 1000;
        Scanner scanner = new Scanner(System.in);
        while (running) {
            int choice = showMenu(scanner);
            switch (choice) {
                case 0:
                    System.out.println("Goodbye!\n");
                    running = false;
                    break;
                case 1:
                    checkBalance(balance);
                    break;
                case 2:
                    balance = deposit(scanner, balance);
                    break;
                case 3:
                    balance = withdraw(scanner, balance);
                    break;
                default:
                    System.out.println("Invalid choice!\n");
                    break;
            }
        }
        scanner.close();
    }
}