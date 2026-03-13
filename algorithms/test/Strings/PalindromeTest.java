package Strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    @Test
    void checkIfStringIsAPalindromeTest(){
        String word = "madam";
        boolean result = Palindrome.isPalindrome(word);
        assertTrue(result);
    }

    @Test
    void checkIfStringIsNotAPalindromeTest(){
        String word = "Mother";
        boolean result = Palindrome.isPalindrome(word);
        assertFalse(result);
    }

}