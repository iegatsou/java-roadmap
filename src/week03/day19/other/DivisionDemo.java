package week03.day19.other;

public class DivisionDemo {
    public static int divide(int a, int b) {
        return a/b;
    }

    public static void main(String[] args) {
        System.out.println(divide(10, 2));
        try {
            System.out.println(divide(10, 0));
        } catch (java.lang.ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        System.out.println(divide(20, 4));
    }
}
