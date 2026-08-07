package week02.day11;

public class PalindromeChecker {
    public static boolean isPalindrome(String text){

        for(int i=0;i<text.length()/2;i++){
            if(text.charAt(i)!=text.charAt(text.length()-1-i))
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String text="level";
        if(isPalindrome(text))
            System.out.println("'"+text+ "' is a Palindrome!");
        else System.out.println("'"+text+ "' is not a Palindrome!");

    }
}
