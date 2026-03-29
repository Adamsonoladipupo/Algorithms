package Strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemovingDuplicateTest {

    @Test
    void reduceStringByRemovingTwoConsecutiveIdenticalCharactersTestOne(){
        String words = "goose";
        int consecutive = 2;
        String result = RemovingDuplicate.removeDuplicate(words, consecutive);
        System.out.println(result);
    }

}