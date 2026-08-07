package week02.day11;

public class PasswordValidator2 {
    public static boolean isValidPassword(String password) {
        if (password.length() < 8)
            return false;
        boolean hasUppercaseLetter = false;
        boolean hasDigit = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i)))
                hasUppercaseLetter = true;
            if (Character.isDigit(password.charAt(i)))
                hasDigit = true;
        }
        if(hasUppercaseLetter==false || hasDigit==false)
            return false;
        return true;
    }

    public static void main(String[] args) {
            String password="UpperCase9";
            if(isValidPassword(password))
                System.out.println("Your Password is valid!");
            else
                System.out.println("Your Password is invalid!");
    }
}
