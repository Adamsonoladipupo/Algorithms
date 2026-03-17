package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestStringTest {
    @Test
    void checkWithAStringWithNoRepeatingCharacterWithZeroAsReturnTest(){
        String string = "abcdefghij";
        int result = LongestString.getLongestString(string);
        assertEquals(0, result);
        System.out.print(result);
    }

    @Test
    void checkWithStringThatHasRepeatedCharacterTest(){
        String string = "abcdeab";
        int result = LongestString.getLongestString(string);
        System.out.println(result);
    }
}