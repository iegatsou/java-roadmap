package week02.day12;

public class CountUppercase {
    public static int countUppercase(String text){
        int counter=0;
        for (int i=0;i<text.length();i++){
            if(Character.isUpperCase(text.charAt(i)))
                counter++;
        }
        return counter;
    }
    public static void main(String[] args) {
        String text="JaVa PROgraMming";
        System.out.println("Number of Uppercase characters: "+ countUppercase(text));
    }
}
