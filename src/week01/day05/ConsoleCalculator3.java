package week01.day05;

import java.util.Scanner;

public class ConsoleCalculator3 {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            return 0;
        }

        return a / b;
    }

    public static double modulo(double a, double b) {
        if (b == 0) {
            return 0;
        }

        return a % b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.print("===== CONSOLE CALCULATOR 3.0=====\n" +
                    "\n" +
                    "1. Calculate\n" +
                    "0. Exit\n" +
                    "\n" +
                    "Choose: ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.print("\nEnter 1st number: ");
                double firstNumber = scanner.nextDouble();
                System.out.print("\nEnter 2nd number: ");
                double secondNumber = scanner.nextDouble();
                System.out.print("\nEnter operator: ");
                String operation = scanner.next();
                double result;
                if ("+".equals(operation)) {
                    result = add(firstNumber, secondNumber);
                    System.out.printf("Result: %.2f%n\n", result);
                } else if ("-".equals(operation)) {
                    result = subtract(firstNumber, secondNumber);
                    System.out.printf("Result: %.2f%n\n", result);
                } else if ("*".equals(operation)) {
                    result = multiply(firstNumber, secondNumber);
                    System.out.printf("Result: %.2f%n\n", result);
                } else if ("/".equals(operation)) {
                    result = divide(firstNumber, secondNumber);
                    System.out.printf("Result: %.2f%n\n", result);

                } else if ("%".equals(operation)) {
                    result = modulo(firstNumber, secondNumber);
                    System.out.printf("Result: %.2f%n\n", result);
                } else {
                    System.out.println("Unknown operation.");
                }

            } else if (choice == 0) {
                System.out.println("Goodbye!");
                running = false;
            } else {
                System.out.println("Invalid choice.\n");
            }

        }
        scanner.close();
    }
}
