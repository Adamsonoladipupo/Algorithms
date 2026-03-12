package findLargest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideAndConquerTest {
    @Test
    void getTheLargestNumberInAnArrayTest(){
        int[] numbers = {3,5,2,1,0,2};
        int largestNumber = DivideAndConquer.largest(numbers);
        assertEquals(5, largestNumber);
    }
}