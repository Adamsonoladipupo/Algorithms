package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicate {
    public static String[] amountOfUnique(int[] numbers){
        String[] finalUnique = new String[numbers.length];
        Arrays.fill(finalUnique, "_");
        ArrayList<Integer> uniqueNumber = new ArrayList<>();
        for (int checker : numbers) {
            for (int checkUniques = 0; checkUniques <= uniqueNumber.size(); checkUniques++) {
                if (!uniqueNumber.contains(checker)) {
                    uniqueNumber.add(checker);
                }
            }
        }
        for (String number : finalUnique){
            for (int loop = 0; loop < uniqueNumber.size(); loop++){
                if(uniqueNumber.get(loop) != null){
                    finalUnique[loop] = String.valueOf(uniqueNumber.get(loop));
                }
            }
        }
        return finalUnique;
    }
    public static void main(String[] args){
        int[] numbers = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(Arrays.toString(amountOfUnique(numbers)));
    }
}
