package week02.day10;

public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {12, 23, 28, 28, 20};
        int max = numbers[0];
        int secondMax = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                secondMax = max;
                max = numbers[i];
            } else if (numbers[i] > secondMax && numbers[i] != max) {
                secondMax = numbers[i];
            }

        }


        System.out.println("The second max is: " + secondMax);
    }
}
