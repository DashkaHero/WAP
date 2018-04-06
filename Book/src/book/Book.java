/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 806244
 */
public class Book {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String message = "я? пока, не. поняла' как вставить/ считанный 'файл в -счетчик слов";
        String [] words = ScannerTest.set.toLowerCase().replaceAll("[%+=.?!)(,/':;$№&*^#]", "").split("\\s");
 
        Map <String, Integer> counterMap = new HashMap<>();
        for (String word : words) {
            if(!word.isEmpty()) {
                Integer count = counterMap.get(word);
                if(count == null) {
                    count = 0;
                }
                counterMap.put(word, ++count);
            }
        }
 
        for(String word : counterMap.keySet()) {
            //if ((counterMap.get(word) > 10)&&(word.length() < 4)) {
            System.out.println(word + ": " + counterMap.get(word));
        //}
    }
    
 }
}
