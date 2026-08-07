package week02.day10;

import java.util.Scanner;

public class CountOccurrences {
    public static int countOccurrences(int[] numbers, int myNum) {
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == myNum)
                counter++;

        }
        return counter;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 5, 2, 8, 2, 10};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give an integer number: ");
        int myNum = scanner.nextInt();
        if (countOccurrences(numbers, myNum)==1)
            System.out.println(myNum + " appears " + countOccurrences(numbers, myNum) + " time");
        else System.out.println(myNum + " appears " + countOccurrences(numbers, myNum) + " times");
        scanner.close();
    }
}
