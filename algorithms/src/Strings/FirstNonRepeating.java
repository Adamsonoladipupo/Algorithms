package Strings;

import java.util.ArrayList;

public class FirstNonRepeating {
    private static ArrayList<Character> getUniqueCharacter(String word){
        ArrayList<Character> availableLetters = new ArrayList<>();
        for (int check = 0; check < word.length(); check++){
            if (availableLetters.isEmpty()) availableLetters.add(word.charAt(check));
            for (int loop = 0; loop < availableLetters.size(); loop++){
                if (!availableLetters.contains((word.charAt(check))) ){
                    availableLetters.add(word.charAt(check));
                }
            }
        } return availableLetters;
    }
    public static String firstNonRepeating(String word){
        int count = 0;
        ArrayList<Character> uniques = getUniqueCharacter(word);
        for (char unique: uniques){
            for (int check = 0; check < word.length(); check++){
                if (word.charAt(check) == unique) count++;
            }
            if (count > 1) count = 0;
            else if (count == 1) return String.valueOf(unique);
        }
        return "$";
    }

}
