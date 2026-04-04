package arrays;

import java.util.Objects;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[]words){
        String commonPrefix = ""; String prefix = ""; int count = 1;
        if(words.length == 1) return words[0];
        for(int loop = 0; loop < words.length; loop++){
            prefix = getPrefix(getWord(loop, words), count);
            for (int innerLoop = 0; innerLoop < words.length; innerLoop++){
                if(Objects.equals(prefix, getPrefix(getWord(innerLoop, words), count))){
                    if(innerLoop == loop) continue;
                    commonPrefix = prefix;
                    count++;
                } else {
                    break;
                }
            }
        }
        return commonPrefix;
    }
    public static String getWord(int arrayIndex, String[]array){
            return array[arrayIndex];
    }
    public static String getPrefix(String word, int prefixCount){
        StringBuilder prefix = new StringBuilder();
        if(Objects.equals(word, ""))return "";
        for (int loop = 0; loop < prefixCount; loop++){
            if(prefixCount > word.length()) break;
            prefix.append(word.charAt(loop));
        }
        return prefix.toString();
    }
}
