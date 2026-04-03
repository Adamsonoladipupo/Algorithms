package arrays;

public class TwoSum {
    public static int[] twoSum(int[] array, int target){
        int[] result = new int[2];
        for (int loop = 0; loop < array.length; loop++){
            for (int innerLoop = 0; innerLoop < array.length; innerLoop++){
                if(innerLoop == loop) continue;
                if(array[loop] + array[innerLoop] == target){
                    result[0]= innerLoop;
                    result[1]= loop;
                    break;
                }
            }
        }
        return result;
    }
}
