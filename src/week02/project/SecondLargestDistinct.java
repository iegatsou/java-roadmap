package week02.project;

public class SecondLargestDistinct {
    public static int findSecondMax(int[] numbers) {
        int max = numbers[0];
        int secondMax = Integer.MIN_VALUE;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == max) {
                continue;
            } else if (numbers[i] > max) {
                secondMax = max;
                max = numbers[i];
            } else if (numbers[i] > secondMax) {
                secondMax = numbers[i];
            }

        }
        if (secondMax==Integer.MIN_VALUE) {
            return max;
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int[] numbers = {21, 28, 28, 28, 28};
        System.out.println("Second Largest: " + findSecondMax(numbers));
    }

}
