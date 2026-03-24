package Strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SentencePalindromeTest {
    @Test
    void removeAllNonAlphanumericCharcatersTest(){
        String sentence = "Too hot to hoot.";
        System.out.println(SentencePalindrome.removeNonAlphanumericCharacters(sentence));
    }

}