package week02.day08;

import java.util.Scanner;

public class LinearSearch {
    public static boolean numberExists(int n, int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            if (n == numbers[i]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers = {4, 8, 15, 16, 23, 42};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give an integer number: ");
        int newNumber = scanner.nextInt();
        if (numberExists(newNumber, numbers))
            System.out.println("Found");
        else System.out.println("Not Found");

        scanner.close();
    }
}
