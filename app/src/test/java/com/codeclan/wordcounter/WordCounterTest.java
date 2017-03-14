package com.codeclan.wordcounter;

import org.junit.*;

import java.util.HashMap;

import static org.junit.Assert.*;


public class WordCounterTest {

    String phrase;
    WordCounter wordCounter;
    HashMap<String, Integer> occurrences;

    @Before
    public void before() {
        phrase = new String();
        //12 words!
        phrase = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, ...";
        wordCounter = new WordCounter(phrase);
    }

    @Test
    public void canGetWordCount(){
        assertEquals("36", wordCounter.getWordCount());
    }

    @Test
    public void canGetOccurrences(){
        occurrences = wordCounter.getOccurrences();
        int value = occurrences.get("was");
        assertEquals(6, value);
            System.out.println(occurrences);
    }










}
