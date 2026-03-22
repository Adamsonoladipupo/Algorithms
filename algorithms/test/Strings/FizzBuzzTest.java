package Strings;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void fizzBuzzTestOne(){
        int input = 3;
        String output = "Fizz";
        assertSame(FizzBuzz.checkNumber(input), output);
    }

    @Test
    void fizzBuzzTestTwo(){
        int input = 5;
        String[] output = {"1", "2", "Fizz", "4", "Buzz"};
//        assertSame(FizzBuzz.fizzBuzz(5), Arrays.toString(output));
        System.out.println(
                FizzBuzz.fizzBuzz(input)
        );
    }

    @Test
    void fizzBuzzTestThree(){
        int input = 20;
        System.out.println(FizzBuzz.fizzBuzz(input));

    }

}