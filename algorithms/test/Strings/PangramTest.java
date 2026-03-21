package Strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PangramTest {
    @Test
    void panagramTestOne(){
        String input = "The quick brown fox jumps over the lazy dog";
        assertTrue(Pangram.isPangram(input));
    }

    @Test
    void panagranTestTwo(){
        String input = "abcdefghijklmnopqrstuvw";
        assertFalse(Pangram.isPangram(input));
    }


}