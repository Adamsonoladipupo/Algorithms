package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicate {
    public static int[] amountOfUnique(int[] numbers){
        int[] finalUnique = new int[numbers.length];
        ArrayList<Integer> uniqueNumber = new ArrayList<>();
        for (int checker : numbers) {
            for (int checkUniques = 0; checkUniques <= uniqueNumber.size(); checkUniques++) {
                if (!uniqueNumber.contains(checker)) {
                    uniqueNumber.add(checker);
                }
            }
        }
        for (int number : finalUnique){
            for (int loop = 0; loop < uniqueNumber.size(); loop++){
                if(uniqueNumber.get(loop) != null){
                    finalUnique[loop] = uniqueNumber.get(loop);
                }
                else finalUnique[loop] = ;
            }
        }
        return finalUnique;
    }
    public static void main(String[] args){
        int[] numbers = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(Arrays.toString(amountOfUnique(numbers)));
    }
}
