package productOfArrayExceptSelf;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] array = {10,3,5,6,2};
        System.out.println(Arrays.toString(productOfArrayExceptSelf(array)));
    }

    public static int[] productOfArrayExceptSelf(int [] array){
        int[] newArray = new int [array.length];
        int product = 1;
        for (int counter = 0; counter < array.length; counter++){
            for (int number = 0; number < array.length; number++){
                if (counter == number) continue;
                product *= array[number];
            }
            newArray[counter] = product; product=1;
        }
        return newArray;
    }
}
