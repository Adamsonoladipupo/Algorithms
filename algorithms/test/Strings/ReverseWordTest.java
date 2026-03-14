package Strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordTest {
    @Test
    void reverseWordsInASentenceWithDotAsSeparatorTest(){
        String sentence = "i.like.this.program.very.much";
        String expected = "much.very.program.this.like.i";
        assertEquals(expected, ReverseWord.reverseWord(sentence));
    }

    @Test
    void reverseWordsInASentenceSpaceAsSeparatorTest(){
        String sentence = "i like this program very much";
        String expected = "much very program this like i";
        assertEquals(expected, ReverseWord.reverseWord(sentence));
    }

}