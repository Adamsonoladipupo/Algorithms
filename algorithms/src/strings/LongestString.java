package strings;

public class LongestString {
//    find the length of the longest substring without repeating characters
    public static int getLongestString(String word){
        boolean isRepeated = false; int counter = 0; int tempCounter = 0; int comp = 0; boolean startCounting = false;
        for (int check = 0; check < word.length(); check++){
            char tempVar = word.charAt(check);
            for (int find = 0; find < word.length(); find++){
                char eachLetter = word.charAt(find);
                if (tempVar == eachLetter){
                    startCounting = true;
                    tempCounter++;
                    if (tempCounter == 2){
                        isRepeated = true;
                        break;
                    }
                }
                if(startCounting) counter++;
            }
            comp = counter;
            counter=0;
            if (isRepeated) break;
        }
        return comp;
    }
    public static void main(String[] args){
        int result = LongestString.getLongestString("abcdebc");
        System.out.println(result);
    }
}
