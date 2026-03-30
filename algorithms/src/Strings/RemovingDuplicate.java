package Strings;

import java.util.Arrays;
import java.util.Objects;

public class RemovingDuplicate {
//    Reduce the string by removing K consecutive identical characters
    public static String removeDuplicate(String word, int consecutive){
        int countDuplicate = 0; String duplicate = ""; String newString = "";
        String[] letters = word.split("");
        for (int loop = 0; loop < letters.length-1; loop++){
            if (Objects.equals(letters[loop], letters[loop + 1])){
                for (int innerLoop = loop; innerLoop < letters.length-1; innerLoop++){
                    if(letters[innerLoop] == letters[loop]){
                        duplicate += letters[innerLoop];
                        countDuplicate ++;
                    }
                }
                if (countDuplicate == consecutive) System.out.println("Consecutive");
            }
            else newString += letters[loop];
        }
        return newString;
    }
    public static void main(String[] args){
        String word = "gooose";
        System.out.println(removeDuplicate(word, 3));
    }

}
