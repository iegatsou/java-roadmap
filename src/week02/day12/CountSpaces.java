package week02.day12;

public class CountSpaces {
    public static int countSpaces(String text){
        int spaceCounter=0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==' ')
                spaceCounter++;
        }
        return spaceCounter;
    }
    public static void main(String[] args) {
        String text="Java is awesome dude ! ";
        System.out.println("Your string has "+countSpaces(text)+" spaces");
    }
}
