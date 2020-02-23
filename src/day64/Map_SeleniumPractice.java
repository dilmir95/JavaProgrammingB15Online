package day64;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Map_SeleniumPractice {

    public static void main(String[] args) throws IOException {

//        Map<String, String> row1 = new LinkedHashMap<>();
//        row1.put("first_name","Regan");
//        row1.put("email","rboichat0@1688.com");
//        row1.put("Gender","Female");
//
//
//        Map<String,String> row2 = new LinkedHashMap<>();
//        row2.put("first_name", "Carleen" );
//        row2.put("email", "cmorillas1@blog.com" );
//        row2.put("gender", "Female" );

        List<Map<String,String>> rowMapsList= new ArrayList<>();
//        rowMapsList.add(row1);
//        rowMapsList.add(row2);

//        System.out.println(rowMapsList.get(1).get("email"));

//        rowMapsList.get(0).replace("first_name","Hulk");
////        System.out.println(rowMapsList.get(0));

        List<String> readingEmployeeDataTxt = Files.readAllLines(Paths.get("src/day64/EmployeeData1.txt"));
        for(String eachLine: readingEmployeeDataTxt){
            String[] arr = eachLine.split(",");
            Map<String,String> eachRow = new LinkedHashMap<>();
            eachRow.put("first name", arr[0]);
            eachRow.put("email", arr[1]);
            eachRow.put("gender", arr[2]);
            rowMapsList.add(eachRow);

        }

        System.out.println(rowMapsList);


    }
}
