package week02.day09;

public class FindFirstNegative {

    public static void main(String[] args) {
        int[] numbers = {5, 8, -4, 7, -10};
        int firstNegative=0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                firstNegative = numbers[i];
                break;
            }
        }
        if (firstNegative>=0)
            System.out.println("There are no negative numbers in this array!");
        else System.out.println("The first negative number is: " + firstNegative);
    }
}
