package Strings;

public class Pangram {
    public static boolean isPangram(String input){
        for (char characters = 'a'; characters <= 'z'; characters++){
            System.out.println(characters);
        }
        return false;
    }
    public static void main(String [] args){
        System.out.println(isPangram("lets get"));
    }
}
