package sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleTest {
    @Test
    void testingBubbleSorting(){
        int[] numbers = {5, 3, 4, 8, 7};
        int actual = 5;
        int[] sortedNumber = Bubble.sort(numbers);
        int expected = sortedNumber[2];
        assertEquals(actual, expected);
    }
}