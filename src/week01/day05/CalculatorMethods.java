package week01.day05;

public class CalculatorMethods {
    public static int add(int a, int b) {
        return a + b;
    }
    public static double add(double a, double b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static double divide(double a, double b) {
        if (b == 0) {
            return 0;
        }

        return a / b;
    }

    public static void main(String[] args) {
        int addResult = add(10, 20);
        System.out.println(addResult);
        int subtractResult = subtract(10, 20);
        System.out.println(subtractResult);
        int multiplyResult = multiply(10, 20);
        System.out.println(multiplyResult);
        double divideResult = divide(10, 4);
        System.out.printf("%.2f%n", divideResult);
        System.out.println(add(5, 3));
        System.out.println(add(5.5, 3.2));
    }
}
