package week02.day10;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] numbers){
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if ( numbers[i] == numbers[j])
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] numbers = {4, 7, 2, 7, 9};
        if(containsDuplicate(numbers))
            System.out.println("Contains duplicate: true");
        else
            System.out.println("Contains duplicate: false");

    }
}
