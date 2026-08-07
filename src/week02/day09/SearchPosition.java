package week02.day09;

import java.util.Scanner;

public class SearchPosition {
    public static int findPosition(int n, int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            if (n == numbers[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {4, 8, 15, 16, 23, 42};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give an integer number: ");
        int newNumber = scanner.nextInt();
        if (findPosition(newNumber, numbers)==-1)
            System.out.println("Not Found");
        else System.out.println("Found at index " + findPosition(newNumber, numbers));

        scanner.close();
    }
}
