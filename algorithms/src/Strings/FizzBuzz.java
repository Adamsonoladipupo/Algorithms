package Strings;

import java.util.ArrayList;

//Given an integer n, for every positive integer i <= n, the task is to print,
public class FizzBuzz {
    public static ArrayList<String> fizzBuzz(int number){
        ArrayList<String> result = new ArrayList<>();
        for (int loop = 1; loop <= number; loop++){
            result.add(
                    checkNumber(loop)
            );
        }
        return result;
    }
    public static String checkNumber(int number){
        if(number % 3 == 0) return "Fizz";
        else if(number % 5 == 0) return "Buzz";
        else return String.valueOf(number);
    }

}
