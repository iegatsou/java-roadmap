package week01.day04;

import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a positive number: ");
        int i = scanner.nextInt();
        int sum = 0;

        if (i <= 0) {
            System.out.println("You did not give a positive number!");
        } else {
            for (int j = 1; j <= i; j++) {
                sum = sum + j;
            }
            System.out.println(sum);
        }
        scanner.close();
    }
}
