package Strings;

import java.util.Arrays;
import java.util.Objects;

public class RemovingDuplicate {
//    Reduce the string by removing K consecutive identical characters
    public static String removeDuplicate(String word, int consecutive){
        String newString = ""; int count = 0;
        for (int loop =0; loop < word.length()-1; loop++){
            newString += word.charAt(loop);
            System.out.println(word.charAt(loop));
            if(word.charAt(loop) == word.charAt(loop+1)){
                count++;
            }
        }
        return newString;
    }

}
