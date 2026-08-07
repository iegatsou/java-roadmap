package week02.day12;

public class StringMethods {
    public static void main(String[] args) {
        String text = "Java Programming";

        System.out.println(text.trim());
        System.out.println(text.contains("Java"));
        System.out.println(text.startsWith("Java"));
        System.out.println(text.endsWith("ing"));
        System.out.println(text.replace("Java", "Python"));
    }
}
