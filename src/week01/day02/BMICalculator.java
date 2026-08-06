package week01.day02;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== BMI CALCULATOR =====");
        System.out.print("Enter your weight (kg): ");
        double weight=scanner.nextDouble();
        System.out.print("Enter your height (m): ");
        double height=scanner.nextDouble();
        double bmi = weight / (height * height);
        System.out.printf("Your BMI is: %.2f%n", bmi);
        scanner.close();
    }
}
