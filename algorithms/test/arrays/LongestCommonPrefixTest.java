package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {
    @Test
    void LongestCommonPrefixTest(){
        String[] input = {"flower","flow","floght, flock"};
        String expected = "flo";
        String actual = LongestCommonPrefix.longestCommonPrefix(input);
        assertEquals(expected, actual);
    }

    @Test
    void LongestCommonPrefixTwoTest(){
        String[] input = {"dog","racecar","car"};
        String expected = "";
        String actual = LongestCommonPrefix.longestCommonPrefix(input);
        assertEquals(expected, actual);
    }

    @Test
    void LongestCommonPrefixThreeTest(){
        String[] input = {""};
        String expected = "";
        String actual = LongestCommonPrefix.longestCommonPrefix(input);
        assertEquals(expected, actual);
    }

    @Test
    void LongestCommonPrefixFourTest(){
        String[] input = {"a"};
        String expected = "a";
        String actual = LongestCommonPrefix.longestCommonPrefix(input);
        assertEquals(expected, actual);
    }

    @Test
    void LongestCommonPrefixFiveTest(){
        String[] input = {"ab", "a"};
        String expected = "a";
        String actual = LongestCommonPrefix.longestCommonPrefix(input);
        assertEquals(expected, actual);
    }


    @Test
    void LongestCommonPrefixSixTest(){
        String[] input = {"flower","flower","flower","flower"};
        String expected = "flower";
        String actual = LongestCommonPrefix.longestCommonPrefix(input);
        assertEquals(expected, actual);
    }
}