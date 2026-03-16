package Strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AsciiToIntegerTest {
    @Test
    void convertAsciiToIntegerFirstTest(){
        String input = "-123";
        int expected = 123;
        assertEquals(expected, AsciiToInteger.aito(input));
    }

}