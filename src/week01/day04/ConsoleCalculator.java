package week01.day04;

import java.util.Scanner;

public class ConsoleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i=1;
        while(i==1){
        System.out.print("===== CONSOLE CALCULATOR 2.0=====\n" +
                "\n" +
                "1. Calculate\n" +
                "0. Exit\n" +
                "\n" +
                "Choose: ");
        int j=scanner.nextInt();
        if(j==1){
        System.out.print("\nEnter 1st number: ");
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
                System.out.print("\n");
            }

        } else {
            System.out.println("Unknown operation.");
        }

    } else if (j==0) {
            System.out.println("Goodbye!");
            i=j;
        }

        }
        scanner.close();
        }
}
