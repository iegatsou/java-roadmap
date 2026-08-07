package week02.day11;

import java.util.Scanner;

public class CountLetter {
    public static int countCharacter(String word, char character){
        int counter=0;
        for(int i=0;i<word.length();i++)
            if (character == word.charAt(i))
                counter++;
        return counter;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give text: ");
        String word = scanner.nextLine();
        System.out.print("Give character: ");
        char character = scanner.nextLine().charAt(0);

        System.out.println("'"+character+"' appears "+countCharacter(word,character)+" times");
        scanner.close();
    }
}
