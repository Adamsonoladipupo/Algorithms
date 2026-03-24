package Strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SentencePalindromeTest {
    @Test
    void removeAllNonAlphanumericCharcatersTest(){
        String sentence = "Too hot to hoot4u1.";
        String expected = "toohottohoot4u1";
        String newSentence = SentencePalindrome.removeNonAlphanumericCharacters(sentence);
        assertSame(expected, newSentence);
    }

}