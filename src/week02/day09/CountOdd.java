package week02.day09;

public class CountOdd {
    public static void main(String[] args) {
        int[] numbers = {11, 20, 31, 42, 53};
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%2!=0){
                counter++;
            }
        }
        System.out.println("The number of odd numbers is: " + counter);
    }
}
