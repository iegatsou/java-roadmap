package week02.day11;

public class ReverseString {
    public static void main(String[] args) {
        String text = "Java is Awesome!";
        for(int i=text.length()-1;i>=0;i--){
            System.out.print(text.charAt(i));
        }
    }
}
