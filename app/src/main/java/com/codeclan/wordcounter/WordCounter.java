package com.codeclan.wordcounter;

import java.util.*;

public class WordCounter {

    String string;


    public WordCounter(String string){
        this.string = string;
    }

    public String getWordCount(){

        //If you are new to regular expression in Java,
        // the \s is a character class to detect space including tabs,
        // since \ needs to be escaped in Java, it becomes \\s and because
        // there could be multiple spaces between words we made
        // this regular expression greedy by adding +,
        // hence \\s+ will find one more space and split the String
        // accordingly. This is the simplest way to count the number
        // of words in a given sentence.

        if (this.string == null || this.string.isEmpty()) {
            return "no words found, please try again";
        }

        String[] words = string.split("\\s+");
        return Integer.toString(words.length);
    }



}
