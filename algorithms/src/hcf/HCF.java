package hcf;

import java.util.ArrayList;

public class HCF {
    public static void main(String[] args) {
        int[] array = {12,18,6};
        System.out.println(getHCF(array));
    }

    public static ArrayList<Integer> getHCF(int[] array) {
        int divider = 2;
        ArrayList<Integer> HCFs = new ArrayList<>();
        int smallest = array[0];
        for (int find = 0; find < array.length; find++){
            if (array[find] < smallest) smallest = array[find];
        }
        int appearedXTimes = 0;
        for(int round = 0; round < smallest; round++){
            for (int count = 0; count < array.length; count++) {
                if (array[count] % divider == 0) {
                    appearedXTimes++;
                    array[count] /= divider;
                }
            }
            if (appearedXTimes == array.length) HCFs.add(divider);
            if (appearedXTimes < array.length)divider++;
            appearedXTimes = 0;
        }
        return HCFs;
    }
}
