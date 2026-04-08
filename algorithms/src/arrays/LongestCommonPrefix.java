package arrays;

public class LongestCommonPrefix {
//    public static String longestCommonPrefix(String[]words){
//        String commonPrefix = ""; String prefix = ""; int count = 1;
//        if(words.length == 1) return words[0];
//        for(int loop = 0; loop < words.length; loop++){
//            prefix = getPrefix(words[loop], count);
//            for (int innerLoop = 0; innerLoop < words.length; innerLoop++){
//                if(Objects.equals(prefix, getPrefix(words[innerLoop], count))){
//                    if(innerLoop == loop) continue;
//                    commonPrefix = prefix;
//                    count++;
//                    System.out.println(prefix);
//                } else {
//                    System.out.println("Broken :: Main");
//                    break;
//                }
//            }
//        }
//        return commonPrefix;
//    }
//    public static String getPrefix(String word, int prefixCount){
//        StringBuilder prefix = new StringBuilder();
//        if(Objects.equals(word, ""))return "";
//        for (int loop = 0; loop < prefixCount; loop++){
//            System.out.println(word.charAt(loop));
//            if(prefixCount > word.length()) {
//                System.out.println("Broken:: Helper");
//                break;
//            }
//            prefix.append(word.charAt(loop));
//        }
//        return prefix.toString();
//    }
    public static String longestCommonPrefix(String[] string) {
        if (string.length == 0) return "";
        for (int firstWord = 0; firstWord < string[0].length(); firstWord++) {
            char c = string[0].charAt(firstWord);
            for (int arrayLength = 1; arrayLength < string.length; arrayLength++) {
                if (firstWord == string[arrayLength].length() || string[arrayLength].charAt(firstWord) != c) {
                    return string[0].substring(0, firstWord);
                }
            }
        }
        return string[0];
    }
}
