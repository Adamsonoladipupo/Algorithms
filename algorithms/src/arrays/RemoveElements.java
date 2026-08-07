package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveElements {
    public static ArrayList<Integer> removeElement(int[] numbers, int value){
        ArrayList<Integer> unique = new ArrayList<>();
        for (int number:numbers){
            if(number == value) continue;
            unique.add(number);
        }
        return unique;
    }
    public static void main(String[] args){
        int[] nums = {0,1,2,2,3,0,4,2}; int value = 2;
        System.out.println(removeElement(nums, value));
    }
}
