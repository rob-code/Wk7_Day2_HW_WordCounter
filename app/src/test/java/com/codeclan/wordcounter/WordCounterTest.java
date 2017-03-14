package com.codeclan.wordcounter;

import org.junit.*;
import static org.junit.Assert.*;


public class WordCounterTest {

    String string;
    WordCounter wordCounter;

    @Before
    public void before(){
        string = new String();
        //10 words!
        string = "To be or not to be, that is the question.";
        wordCounter = new WordCounter(string);
    }


    @Test
    public void canGetWordCount() {
        assertEquals(10, wordCounter.getWordCount());
    }










}
