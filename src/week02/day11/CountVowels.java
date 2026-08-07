package week02.day11;

public class CountVowels {

    public static void main(String[] args) {
        String text = "programming language";
        int vowelCounter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u')
                vowelCounter++;
        }
        System.out.println("Vowels: "+vowelCounter);
    }
}
