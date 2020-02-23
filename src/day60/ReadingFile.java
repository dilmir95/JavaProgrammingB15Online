package day60;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadingFile {
    public static void main(String[] args) throws IOException {

       List<String> lst = Files.readAllLines(Paths.get("src/day60/hero.txt"));
            //this can throw fileNotFound exception if file cannot be found

        System.out.println(lst);

        for(String eachLine : lst){
            System.out.println(eachLine);
        }
    }
}
