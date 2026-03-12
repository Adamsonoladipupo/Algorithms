package findLargest;

import java.util.Arrays;

public class DivideAndConquer {
    public static int getLargest(int firstNumber, int secondNumber){
        if(firstNumber > secondNumber) return firstNumber;
        else return secondNumber;
    }
    public static int getLargest(int[] array){
        int largest = array[0];
        for (int count = 1; count < array.length; count++){
            if (array[count] > largest) largest = array[count];
        }
        return largest;
    }
    public static int largest(int[] array){
        int[] firstHalf ;
        int[] secondHalf;
        if(array.length % 2 == 0){
            firstHalf = new int[array.length/2];
            secondHalf = new int[array.length/2];
        }else {
            firstHalf = new int[array.length/2];
            secondHalf = new int[array.length/2+1];
        }
        for (int share = 0; share < array.length; share++){
            if(share < firstHalf.length){
                firstHalf[share] = array[share];
            }
            if(share >= firstHalf.length){
                secondHalf[share-firstHalf.length] = array[share];
            }
        }
        return  getLargest(getLargest(firstHalf), getLargest(secondHalf));
    }
    public static void main(String[] args){
        int[] numbers = {1,5,2,1,3,21,8,8};
        System.out.println(largest(numbers));
    }
}
