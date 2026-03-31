import java.util.ArrayList;
import java.util.Stack;

public class Summing {
    public static int singleDigitSum(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
    public static int getLastNumber(int number){
        return number%10;
    }
    public static int sum(int firstNumber, int secondNumber){
        return 0;
    }
    public static int getSmallest(int firstNumber, int secondNumber){
        if(firstNumber > secondNumber){
            return secondNumber;
        } else return firstNumber;
    }
    public static int reverseString(String input){
        String finalResult = "";
        for (int reverse = input.length()-1; reverse >= 0; reverse--){
            finalResult += input.charAt(reverse);
        }
        return Integer.parseInt(finalResult);
    }
    public static void main(String[] args){
        int number = 10000000; int number2 = 89990000;
        String result = "";
        while(number > 0){
            result += (
                    singleDigitSum(
                            getLastNumber(number), getLastNumber(number2)
                    )
            );
            number = number/10;
            number2 = number2/10;
        }
        System.out.println(reverseString(result));

    }
}
