package week02.day09;

public class ChallengeSquares {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 11, 16};
        int[] numbersSquared= new int[numbers.length];
        for(int i=0;i<numbers.length;i++){
            numbersSquared[i]=numbers[i]*numbers[i];
        }
        for(int i=0;i<numbersSquared.length;i++){
            System.out.println(numbersSquared[i]);
        }
    }

}
