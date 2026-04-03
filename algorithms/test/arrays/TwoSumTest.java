package arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    @Test
    void returnIndicesOfTheTwoNumbersSuchThatTheyAddUpToTargetTest(){
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] expected = {0,1};
        int[] result = TwoSum.twoSum(numbers, target);
        System.out.println(Arrays.toString(result));
//        assertEquals(result, expected);
    }

    @Test
    void returnIndicesOfTheTwoNumbersSuchThatTheyAddUpToTargetTestTwo(){
        int[] numbers = {2,4,11,3};
        int target = 6;
        int[] expected = {0,1};
        int[] result = TwoSum.twoSum(numbers, target);
        System.out.println(Arrays.toString(result));
    }

}