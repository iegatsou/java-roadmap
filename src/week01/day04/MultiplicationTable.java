package week01.day04;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a positive integer number: ");
        int i = scanner.nextInt();


        if (i <= 0) {
            System.out.println("You did not give a positive number!");
        } else {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " X " + j + " = " + (i * j));
            }

        }
        scanner.close();
    }
}
