package week02.day09;

public class LargestEvenNumber {

    public static void main(String[] args) {
        int[] numbers = {7, 12, 3, 18, 5, 24};
        int[] evenNumbers=new int[numbers.length];
        int j=0;
        for (int i=0;i<numbers.length;i++){

            if(numbers[i]%2==0){
                evenNumbers[j]=numbers[i];
                j++;
            }
        }
//        for (int i=0;i<evenNumbers.length;i++){
//            System.out.println(evenNumbers[i]);
//        }
        int max=evenNumbers[0];
        for(int i=1;i<evenNumbers.length;i++){
            if(max<evenNumbers[i])
                max=evenNumbers[i];
        }
        System.out.println("The max even number is: " + max);

    }
}
