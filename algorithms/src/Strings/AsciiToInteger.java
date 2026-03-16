package Strings;

public class AsciiToInteger {
    public static int aito(String input){

        return 0;
    }
    private static String removeWhiteSpaces(String userInput){
        String newString = "";
        for (int remove = 0; remove < userInput.length(); remove++){
            if (userInput.charAt(remove) != ' '){
                newString += userInput.charAt(remove);
            }
        }return  newString;
    }
    public static void main(String[] args){
        System.out.println(removeWhiteSpaces("  let Getme "));
    }
}
