package ru.croc.school;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordsInTheTextTest {
    @Test
    public void testWords(){
        WordsInTheText example=new WordsInTheText("By Need8 888 to-parse - by,      by");
        example.cleanString();
        Assertions.assertEquals("by need8 to-parse by by", example.getString());
        example.counting();
        Assertions.assertEquals(1, example.getWords().get("need8"));
        Assertions.assertEquals(3, example.getWords().get("by"));
        Assertions.assertEquals(1, example.getWords().get("to-parse"));
    }

}
