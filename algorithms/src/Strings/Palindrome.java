package Strings;

public class Palindrome {
    public static boolean isPalindrome(String input){
        StringBuilder reserved = new StringBuilder();
        for (int check = input.length()-1; check >= 0; check--){
            char letter = input.charAt(check);
            reserved.append(letter);
        }
        return input.equals(reserved.toString());
    }
}
