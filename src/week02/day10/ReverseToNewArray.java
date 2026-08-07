package week02.day10;


public class ReverseToNewArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int[] reversedNumbers = new int[numbers.length];
        int j = 0;
        for (int i = (numbers.length - 1); i >= 0; i--) {
            reversedNumbers[j] = numbers[i];

            j++;
        }
        for (int z = 0; z < reversedNumbers.length; z++)
            System.out.println(reversedNumbers[z]);
    }
}
