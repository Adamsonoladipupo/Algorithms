package Strings;

public class SentencePalindrome {
    public static boolean isPalindrome(String sentence){
        return false;
    }
    public static String removeNonAlphanumericCharacters(String sentence){
        String newSentence = "";
        for (int loop = 0; loop < sentence.length(); loop++){
            for (char alphabet = 'a'; alphabet <= 'z'; alphabet++){
                if(Character.toLowerCase(sentence.charAt(loop)) == alphabet ){
                    newSentence += alphabet;
                }
            }
            for (int number = 0; number <= 9; number++){
                System.out.println(sentence.charAt(loop));
                if(sentence.charAt(loop) == number){
                    System.out.println(number);
                    newSentence += number;
                }
            }
        }
        return newSentence;
    }
    public static void main(String[] args){
//        String n = removeNonAlphanumericCharacters("Too hot 5to hoot.");
        int n =5; char m = '5';
        System.out.println((char)n == m);
    }
}
