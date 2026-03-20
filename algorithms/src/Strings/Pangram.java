package Strings;

public class Pangram {
    public static boolean isPangram(String input){
        boolean finalResult = false;
        for (char characters = 'a'; characters <= 'z'; characters++){
            for (int loop = 0; loop < input.length(); loop++){
                if (Character.toLowerCase(input.charAt(loop)) == characters){
                    finalResult = true;
                    System.out.print("Them be thesame");
                    return finalResult;
                }
                else {
                    return finalResult;
                }
            }
        }
        return true;
    }
    public static void main(String [] args){
        System.out.println(isPangram("lets get"));
    }
}
