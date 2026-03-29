package Strings;

import java.util.Arrays;
import java.util.Objects;

public class RemovingDuplicate {
//    Reduce the string by removing K consecutive identical characters
    public static String removeDuplicate(String word, int numberOfConsecutiveDuplicate){
        
        return "";
    }
    public static String getDuplicate(String word, int consecutive){
        int countDuplicate = 0; String duplicate = "";
        String[] letters = word.split("");
        System.out.println(Arrays.toString(letters));
        for (int loop = 0; loop < letters.length-1; loop++){
            if (Objects.equals(letters[loop], letters[loop + 1])){
                duplicate +=letters[loop] + letters[loop+1];
                countDuplicate = 2;
//                if(countDuplicate == consecutive){
//                }
            }
        }
        return duplicate;
    }
    public static void main(String[] args){
        String word = "goose";
        System.out.println(getDuplicate(word, 2));
    }

}
