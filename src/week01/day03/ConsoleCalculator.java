package week01.day03;

import java.util.Scanner;

public class ConsoleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== CONSOLE CALCULATOR =====");
        System.out.print("Enter 1st number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Enter 2nd number: ");
        double secondNumber = scanner.nextDouble();
        System.out.print("Enter operator: ");
        String operation = scanner.next();
        double result;
        if ("+".equals(operation)) {
            result = firstNumber + secondNumber;
            System.out.printf("Result: %.2f%n", result);
        } else if ("-".equals(operation)) {
            result = firstNumber - secondNumber;
            System.out.printf("Result: %.2f%n", result);
        } else if ("*".equals(operation)) {
            result = firstNumber * secondNumber;
            System.out.printf("Result: %.2f%n", result);
        } else if ("/".equals(operation)) {
            if (secondNumber == 0) {
                System.out.println("Cannot divide by zero.");
            } else {
                result = firstNumber / secondNumber;
                System.out.printf("Result: %.2f%n", result);
            }
        } else if ("%".equals(operation)) {
            if (secondNumber == 0) {
                System.out.println("Cannot divide by zero.");
            } else {
                result = firstNumber % secondNumber;
                System.out.printf("Result: %.2f%n", result);
            }

        } else {
            System.out.println("Unknown operation.");
        }
        scanner.close();
    }
}
