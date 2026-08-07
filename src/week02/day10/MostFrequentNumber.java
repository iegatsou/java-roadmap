package week02.day10;

public class MostFrequentNumber {
    public static int countOccurrences(int[] numbers, int number) {
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number)
                counter++;

        }
        return counter;
    }

    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int findPosition(int value, int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            if (value == numbers[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {4, 2, 7, 7, 2, 7, 7};
        int[] numberOccurrences = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numberOccurrences[i] = countOccurrences(numbers, numbers[i]);
        }
        int maxOccurrences = findMax(numberOccurrences);
        int maxOccurrencesIndex = findPosition(maxOccurrences, numberOccurrences);
        System.out.println("Most frequent: " + numbers[maxOccurrencesIndex]);
        System.out.println("Occurrences: " + numberOccurrences[maxOccurrencesIndex]);


    }

}
