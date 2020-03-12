package day64;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class MapPractice$$ {

    public static void main(String[] args) throws IOException {


        Map<String, Double> employeeAndSalaryPair = new LinkedHashMap<>();

        List<String> readingSalaryFile = Files.readAllLines(Paths.get("src/day64/salary.txt"));

        for(String eachLine: readingSalaryFile){
            String[] eachInfo = eachLine.split(",");

            employeeAndSalaryPair.put(eachInfo[0],Double.parseDouble(eachInfo[1]));


        }


        System.out.println(employeeAndSalaryPair);

        Set<Map.Entry<String,Double>> mapCopy = employeeAndSalaryPair.entrySet();

        System.out.println(mapCopy);

        for(Map.Entry<String,Double> each: mapCopy){
            System.out.println("Monthly payment for the employee "+ each.getKey());
            System.out.println(each.getValue()/12);
        }

        Set<String > allKeys = employeeAndSalaryPair.keySet();

        Collection<Double> allValues = employeeAndSalaryPair.values();

        System.out.println("allValues = " + allValues);
        System.out.println("allKeys = " + allKeys);




    }
}
