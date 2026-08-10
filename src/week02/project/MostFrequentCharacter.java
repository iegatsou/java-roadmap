package week02.project;

import java.util.Locale;

public class MostFrequentCharacter {
    public static int findPosition(int n, int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            if (n == numbers[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int findMaxIndex(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return findPosition(max, numbers);
    }

    public static char mostFrequentCharacter(String text) {
        char p = text.charAt(0);
        text=text.toLowerCase(Locale.ROOT);
        text=text.replace(" ","");
        int[] counters = new int[text.length()]; // array with length same as text that corresponds to each letter's appearances in text
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == text.charAt(i)) {
                    counters[i]++;
                }
            }
        }

        p = text.charAt(findMaxIndex(counters));
        return p;
    }

    public static void main(String[] args) {
        String text = "Aa bBb";
        System.out.println("Most Frequent Character: " + mostFrequentCharacter(text));
    }
}
