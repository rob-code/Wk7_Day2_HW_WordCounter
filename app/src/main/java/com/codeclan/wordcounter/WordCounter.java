package com.codeclan.wordcounter;

import java.sql.Array;
import java.util.*;

public class WordCounter {

    String phrase;
    HashMap<String,Integer> occurrences;
    TreeMap<String, Integer> occTree;



    public WordCounter(String phrase){
        this.phrase = phrase;
        occurrences = new HashMap<String, Integer>();
        occTree = new TreeMap<String, Integer>();
    }

    public String getWordCount(){

        // Regex: the \s is a character class to detect space including tabs,
        // since \ needs to be escaped in Java, it becomes \\s and because
        // there could be multiple spaces between words we made
        // this regular expression greedy by adding +,
        // hence \\s+ will find one more space and split the String
        // accordingly. This is the simplest way to count the number
        // of words in a given sentence.

        if (this.phrase == null || this.phrase.isEmpty()) {
            return "no words found, please try again";
        }
        String[] words = getArrayOfWords();
        return Integer.toString(words.length);
    }

     public String[] getArrayOfWords(){

         phrase = phrase.toLowerCase();

         if(phrase.contains(",")){
             phrase = phrase.replace(",", " ");
         }
         if(phrase.contains(".")) {
             phrase = phrase.replace(".", " ");
         }

         String[] array = phrase.split("\\s+");
         return array;
     }


    public HashMap<String, Integer> getOccurrences(){

        String[] words = getArrayOfWords();

        for (int i = 0; i < words.length; i++) {

            if (occurrences.containsKey(words[i])) {
                occurrences.put(words[i], occurrences.get(words[i]) + 1);
            }
            else
            {
                occurrences.put(words[i],1);
            }
        }

        return occurrences;

    }

    public void sortOccurrences(HashMap<String, Integer> word_occurrences){

        System.out.println(word_occurrences);

    }




}
