package Strings;

public class ReverseWord {
    public static String reverseWord(String word){
        String newWord = ""; String allWords = "";
        for (int getLetter = word.length()-1; getLetter > -1; getLetter--){
            if(getLetter == 0) allWords += word.charAt(getLetter);
            if(word.charAt(getLetter) == '.'){
                allWords += reverse(newWord);
                allWords += ".";
                newWord = "";
            }
            else if(word.charAt(getLetter) == ' '){
                allWords += reverse(newWord);
                allWords += " ";
                newWord = "";
            }
            else newWord += word.charAt(getLetter);
        }
        return allWords;
    }
    public static String reverse(String word){
        String toBeReturn = "";
        for (int reverse = word.length()-1; reverse >= 0; reverse--){
            toBeReturn += word.charAt(reverse);
        }return toBeReturn;
    }
}
