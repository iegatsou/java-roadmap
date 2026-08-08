package week01.liveCodingChallenge;

import java.util.Scanner;

public class PasswordValidator {
    public static boolean isValidPassword(String password) {
        return password.length() >= 8;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a password: ");
        String password = scanner.nextLine();
        if (isValidPassword(password)) {
            System.out.println("Password accepted.");
        } else {
            System.out.println("Password too short.");
        }
        scanner.close();
    }
}
