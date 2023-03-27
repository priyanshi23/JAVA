
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
        countEachWord("C:\\Users\\Priyanshi Tripathi\\Desktop\\JavaWork\\src\\icep.txt",words);
        System.out.println("Word     Frequency");
        System.out.println(words);
        int max = getMaxOccurence(words);
        for (Map.Entry<String, Integer> word: words.entrySet()){
            if(word.getValue() == max){
                System.out.println("The most occurring word=" + word);
            }
        }

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
    static int getMaxOccurence(Map<String, Integer> words){
        int max = 1;
        for(Map.Entry<String,Integer> word: words.entrySet()){
            if(word.getValue() > max){
                max = word.getValue();
            }
        }
        return max;
    }

}

