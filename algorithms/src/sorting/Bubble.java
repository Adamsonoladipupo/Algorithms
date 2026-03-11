package sorting;

import java.util.Arrays;

public class Bubble {
    public static int[] sort(int[] arrayInput){
        int[] array = new int[arrayInput.length];
        for (int loop = 0; loop < arrayInput.length-1; loop++){
            for (int innerLoop = 0; innerLoop < arrayInput.length-1; innerLoop++){
                if(arrayInput[innerLoop] < arrayInput[innerLoop+1]){
                    int tempVaraible = arrayInput[innerLoop];
                    arrayInput[innerLoop] = arrayInput[innerLoop+1];
                    arrayInput[innerLoop+1] = tempVaraible;
                }
            }
        }
        return arrayInput;
    }
    public static void main(String[] args){
        int[] numbers = {5, 3, 4, 8, 7};
        System.out.println(Arrays.toString(sort(numbers)));
    }
}
