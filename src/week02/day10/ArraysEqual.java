package week02.day10;

public class ArraysEqual {
    public static boolean arraysEqual(int[] first, int[] second){
        if(first.length!=second.length)
            return false;

        for(int i=0;i<first.length;i++){
            if (first[i]!=second[i])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] first = {1, 2, 3, 4};
        int[] second = {1, 2, 3, 4};
        if(arraysEqual(first,second))
            System.out.println("The arrays are equal!");
        else System.out.println("The arrays are not equal!");
    }

}
