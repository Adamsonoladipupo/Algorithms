package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsciiToInteger {
    public static int aito(String input){
        String removeSpace = removeWhiteSpaces(input);
        String getNumbers = getAllInteger(removeSpace);
        int convertToInt = stringToInteger(getNumbers);
        return convertToInt;
    }
    private static String removeWhiteSpaces(String userInput){
        String newString = "";
        for (int remove = 0; remove < userInput.length(); remove++){
            if (userInput.charAt(remove) != ' '){
                newString += userInput.charAt(remove);
            }
        }return  newString;
    }
    private static String getAllInteger(String string){
        List<Character> numbers = Arrays.asList('0','1','2','3','4','5','6','7','8','9');
        String availableInteger = "";
        for (int getInt = 0; getInt < string.length(); getInt++){
            if (numbers.contains(string.charAt(getInt)))
                availableInteger += string.charAt(getInt);
        }
        return availableInteger;
    }
    private static int stringToInteger(String input){
        return Integer.parseInt(input);
    }
}
