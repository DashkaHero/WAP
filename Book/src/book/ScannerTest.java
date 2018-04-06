package io;
 
import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
 
public class ScannerTest {
 
    public static void main(String[] args) throws Exception {
        LineNumberReader reader = new LineNumberReader(new FileReader("WAP12.txt"));
        String line = null;
         Set <String> set = new TreeSet <String>();
                while((line = reader.readLine()) != null) {
                    for(int i = 0; i < line.length(); i++) {
                    set.add(line);
                    }
        }
    }
}