package com.company;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Map<String,Integer> words = new HashMap<String,Integer>();
        Map<String,Integer> woord = new HashMap<String,Integer>();
        countEachWord("C:\\Users\\Priyanshi Tripathi\\Desktop\\JavaWork\\src\\happy_sentiment_dictionary.txt",words);
        countEachWord("C:\\Users\\Priyanshi Tripathi\\Desktop\\JavaWork\\src\\sad_sentiment_dictionary.txt",woord);
        System.out.println("PositiveWords     Frequency");
        System.out.println(words);
        System.out.println("NegativeWords    Frequency");
        System.out.println(woord);

    }
    static void countEachWord(String fileName, Map<String, Integer> words) throws FileNotFoundException {
        Scanner file = new Scanner(new File(fileName));
        while (file.hasNext()){
            String word = file.next();
            Integer count = words.get(word);
            if(count != null)
                count++;
            else
                count = 1;
            words.put(word, count);
        }
        file.close();
    }
void countEachWoord(String fileName, Map<String, Integer> woord) throws FileNotFoundException{
    Scanner file = new Scanner(new File(fileName));
    while (file.hasNext()){
        String word = file.next();
        Integer count = woord.get(word);
        if(count != null)
            count++;
        else
            count = 1;
        woord.put(word, count);
    }
    file.close();
}

}
