package Strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstNonRepeatingTest {
    @Test
    void getTheFirstNonRepeatingCharacterInTheWordTest(){
        String words = "racecar";
        String expected = "e";
        assertEquals(expected, FirstNonRepeating.firstNonRepeating(words));
    }

    @Test
    void getTheFirstNonRepeatingCharacterInTheWordSecondTest(){
        String words = "geeksforgeeks";
        String expected = "f";
        assertEquals(expected, FirstNonRepeating.firstNonRepeating(words));
    }

    @Test
    void getTheFirstNonRepeatingCharacterInTheWordThirdTest(){
        String words = "aabbccc";
        String expected = "$";
        assertEquals(expected, FirstNonRepeating.firstNonRepeating(words));
    }

}