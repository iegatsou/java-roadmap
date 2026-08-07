package week02.day12;

public class CountDigits {
    public static int countDigits(String text){
        int digitCounter=0;
        for(int i=0;i<text.length();i++){
            if(Character.isDigit(text.charAt(i)))
                digitCounter++;
        }
        return digitCounter;
    }
    public static void main(String[] args) {
        String text="Java21 version432";
        System.out.println("Your string has "+countDigits(text)+" digits!");
    }
}
