package week01.day03;

import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== POSITIVE OR NEGATIVE? =====");
        System.out.print("Enter number: ");
        int myNumber = scanner.nextInt();
        if (myNumber > 0) {
            System.out.println("Positive");
        } else if (myNumber < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
        scanner.close();
    }
}

