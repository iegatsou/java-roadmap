package week03.day19.other;

public class ExceptionDemo {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30};

        System.out.println("A");

        System.out.println(numbers[1]);

        System.out.println("B");

        try {
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("My message:");
            System.out.println(e.getMessage());
        }

        System.out.println("C");
    }
}
