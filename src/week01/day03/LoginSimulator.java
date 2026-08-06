package week01.day03;

import java.util.Scanner;

public class LoginSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        if ("admin".equals(username) && "1234".equals(password)) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Wrong username or password.");
        }
        scanner.close();
    }
}
