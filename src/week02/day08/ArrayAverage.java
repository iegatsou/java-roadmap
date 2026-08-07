package week02.day08;

public class ArrayAverage {
    public static void main(String[] args) {
        int sum = 0;
        int[] numbers = {10, 20, 30, 40, 50};
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        double average = (double) sum / numbers.length;

        System.out.printf("Average: %.2f%n", average);

    }
}
