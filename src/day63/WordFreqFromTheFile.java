package day63;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class WordFreqFromTheFile {

    public static void main(String[] args) throws IOException {

        List<String> allLines = Files.readAllLines(Paths.get("src/day60/hero.txt"));


        String allLinesAsString = allLines.toString();
        allLinesAsString = allLinesAsString.replace("[","");
        allLinesAsString = allLinesAsString.replace("]","");

        System.out.println(WordFrequencyMethod.getFreqMap(allLinesAsString));
    }
}
