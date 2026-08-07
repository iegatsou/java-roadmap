package week02.day08;

public class ArraySum {
    public static void main(String[] args) {
        int sum = 0;
        int[] numbers = {10, 20, 30, 40, 50};
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("The total sum is: " + sum);
    }
}
