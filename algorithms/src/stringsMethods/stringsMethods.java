package stringsMethods;

import java.util.Arrays;

public class stringsMethods {
    public static void main(String[] args){
        String word1 = "road";
        String word2 = "ROAD";
        String[] words = {"banner", "ben", "kiter", "lemon", "data", "mongo", "cooler", "peter"};
        System.out.println(word2.compareTo(word1));
        System.out.println(Arrays.toString(words));
        for (int check = 0; check < words.length; check++){
            if(words[check].endsWith("er")) {
//                System.out.println(words[check]);
                words[check] = words[check] + "BOOK";
            }
        }
        System.out.println(Arrays.toString(words));
    }


}
