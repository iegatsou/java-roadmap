package week02.day08;

public class CountEven {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%2==0){
                counter++;
            }
        }
        System.out.println("The number of even numbers is: " + counter);
    }
}
