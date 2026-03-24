package Strings;

public class SentencePalindrome {
    public static boolean isPalindrome(String sentence){
        return false;
    }
    public static String removeNonAlphanumericCharacters(String sentence){
        String newSentence = "";
        for (int loop = 0; loop < sentence.length(); loop++){
            for (char alphabet = 'a'; alphabet <= 'z'; alphabet++){
                if(sentence.charAt(loop) == alphabet ){
                    newSentence += alphabet;
                }
            }
            for (int number = 0; number <= 9; number++){
                if(sentence.charAt(loop) == number){
                    newSentence += number;
                }
            }
        }
        return newSentence;
    }
    public static void main(String[] args){
        String n = removeNonAlphanumericCharacters("Too hot to hoot.");
        System.out.println(n);
    }
}
