package week02.day12;

public class CharacterStatistics {
    public static void main(String[] args) {
        String text = "Java 21! #";
        int lettersCounter = 0;
        int digitsCounter = 0;
        int spacesCounter = 0;
        int othersCounter = 0;

        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i)))
                lettersCounter++;
            else if (Character.isDigit(text.charAt(i)))
                digitsCounter++;
            else if (text.charAt(i) == ' ')
                spacesCounter++;
            else othersCounter++;
        }
        System.out.println("Letters: " + lettersCounter);
        System.out.println("Digits: " + digitsCounter);
        System.out.println("Spaces: " + spacesCounter);
        System.out.println("Other: " + othersCounter);
    }
}
