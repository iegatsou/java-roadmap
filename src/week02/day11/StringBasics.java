package week02.day11;

public class StringBasics {
    public static void main(String[] args) {
        String text = "Java Programming";
        System.out.println("Length: "+text.length());
        System.out.println("First Character: " + text.charAt(0));
        System.out.println("Last Character: " + text.charAt(text.length()-1));
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
    }
}
