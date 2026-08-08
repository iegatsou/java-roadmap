package week02.day12;

public class FirstUppercase {
    public static char findFirstUppercase(String text) {
        char firstUppercase = '0';
        for (int i = 0; i < text.length(); i++)
            if (Character.isUpperCase(text.charAt(i))) {
                firstUppercase = text.charAt(i);
                return firstUppercase;
            }

        return firstUppercase;
    }

    public static void main(String[] args) {
        String text = "java Programming";
        if (findFirstUppercase(text) == '0')
            System.out.println("No uppercase letters!");
        else System.out.println("First uppercase:" + findFirstUppercase(text));
    }
}
