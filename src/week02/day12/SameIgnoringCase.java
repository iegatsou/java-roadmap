package week02.day12;

public class SameIgnoringCase {
    public static boolean equalStrings(String a, String b) {
        if (a.length() != b.length())
            return false;
        for (int i = 0; i < a.length(); i++) {
            if (Character.toLowerCase(a.charAt(i)) != Character.toLowerCase(b.charAt(i)))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "Java";
        String b = "JAVA";
        if (equalStrings(a, b))
            System.out.println("Equal Strings");
        else System.out.println("Non Equal Strings");
    }
}
