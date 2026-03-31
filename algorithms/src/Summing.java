public class Summing {
    public static int singleDigitSum(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
    public static int getLastNumber(int number){
        return number%10;
    }
    public static int sum(int firstNumber, int secondNumber){
        int fN = getLastNumber(firstNumber);
        int sN = getLastNumber(secondNumber);

        int result =singleDigitSum(fN, sN);

        return result;
    }
    public static int getSmallest(int firstNumber, int secondNumber){
        if(firstNumber > secondNumber){
            return secondNumber;
        } else return firstNumber;
    }
    public static void main(String[] args){
//        System.out.println(sum(25, 11));
//        System.out.println(getSmallest(11, 25));
        int number = 200; int number2 = 100;
        while(number > 0){
            System.out.println(number);
            number = number/10;
        }
    }
}
