package week01.day02;

import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your first name? ");
        String firstName = scanner.nextLine();
        System.out.print("What is your last name? ");
        String lastName = scanner.nextLine();
        System.out.print("How old are you? ");
        int age = scanner.nextInt();
        System.out.println("Hello " + firstName + " " + lastName);
        System.out.println("Next year you will be " + (age + 1) + " years old.");
        scanner.close();

    }
}
