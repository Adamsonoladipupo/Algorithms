package Strings;

public class Pangram {
    public static boolean isPangram(String input){
        for (char characters = 'a'; characters <= 'z'; characters++){
            boolean finalResult = false;
            for (int loop = 0; loop < input.length(); loop++){
                if (characters == Character.toLowerCase(input.charAt(loop))){
                    finalResult = true;
                    break;
                }
            }
            if (!finalResult) return false;
        }
        return true;
    }
}
