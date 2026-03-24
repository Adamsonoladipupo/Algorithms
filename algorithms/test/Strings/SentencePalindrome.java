package Strings;

public class SentencePalindrome {
    public static boolean isPalindrome(String sentence){
        return false;
    }
    public static String removeNonAlphanumericCharacters(String sentence){
        String newSentence = "";
        for (char alphabet = 'a'; alphabet <= 'z'; alphabet++){
            for (int number = 0; number <= 9; number++){
                if(sentence.charAt(alphabet) == alphabet ){
                    newSentence += alphabet;
                }
                if(sentence.charAt(alphabet) == number){
                    newSentence += number;
                }
            }
        }
        return newSentence;
    }
}
