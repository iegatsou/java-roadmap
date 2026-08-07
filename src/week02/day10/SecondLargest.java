package week02.day10;

public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {12, 5, 28, 17, 20};
        int max=numbers[0];
        int secondMax=max;

        for(int i=1;i<numbers.length;i++){
            if(max<numbers[i]){
                secondMax=max;
                max=numbers[i];
            }

    }
        System.out.println("The second max is: " + secondMax);
}}
