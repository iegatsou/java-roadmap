package week02.day12;

public class CountWords {
    public static int countWords(String text) {
        //method philosophy: NumberOfWords=NumberOfSpaces+1 (given that there
        // are no spaces before or after the text and two words are separated
        // by a single space)
        int spaceCounter = 0;
        for (int i = 0; i < text.length(); i++)
            if (text.charAt(i) == ' ')
                spaceCounter++;
        return spaceCounter + 1;
    }

    public static void main(String[] args) {
        String text = "Java is very fun darling!";
        System.out.println("Words: " + countWords(text));
    }
}
