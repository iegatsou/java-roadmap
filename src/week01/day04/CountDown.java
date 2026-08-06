package week01.day04;

import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a positive number: ");
        int i = scanner.nextInt();

        if (i <= 0) {
            System.out.println("You did not give a positive number!");
        } else {
            for (int j=i;j>=0;j--){
                System.out.println(j);
            }
        }
        scanner.close();
    }
}
