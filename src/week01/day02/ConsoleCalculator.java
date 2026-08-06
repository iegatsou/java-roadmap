package week01.day02;

import java.util.Scanner;

public class ConsoleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== CONSOLE CALCULATOR =====");
        System.out.print("Enter 1st number: ");
        double firstNumber=scanner.nextDouble();
        System.out.print("Enter 2nd number: ");
        double secondNumber=scanner.nextDouble();
        double result=firstNumber+secondNumber;
        System.out.printf("Result: %.2f%n", result);
        scanner.close();
    }
}
