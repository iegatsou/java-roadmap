package week02.day12;

public class PalindromeSentence {
    public static boolean isPalindrome(String text) {

        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i))
                return false;
        }
        return true;
    }

    public static String removeSpaces(String text) {
        String noSpacesText = "";
        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == ' ')
                continue;
            else noSpacesText = noSpacesText + text.charAt(i);
        }
        return noSpacesText;
    }

    public static String toLowerCase(String text) {
        String lowercaseText = "";

        for (int i = 0; i < text.length(); i++)
            lowercaseText = lowercaseText + Character.toLowerCase(text.charAt(i));

        return lowercaseText;
    }

    public static void main(String[] args) {
        String text = "Never odd or even";
        String simpleText = toLowerCase(removeSpaces(text));
        if (isPalindrome(simpleText))
            System.out.println("'" + text + "' is a Palindrome Sentence!");
        else System.out.println("'" + text + "' is not a Palindrome Sentence!");
    }
}
