package day63;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.*;

public class ReadingFilePractice {
    public static void main(String[] args) throws IOException {


        List<String> readingFile = Files.readAllLines(Paths.get("src/day63/EmployeeData.txt"));
        Map<Integer, String> idNamePair = new HashMap<>();

        for (String eachLine : readingFile){
           // System.out.println(eachLine);
            String[] splitted = eachLine.split(",");
            idNamePair.put(Integer.parseInt(splitted[0]),splitted[1]);

        }


        System.out.println(idNamePair);


        System.out.println(idNamePair.get(7));
    }
}