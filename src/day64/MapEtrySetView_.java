package day64;

import java.util.*;

public class MapEtrySetView_ {

    public static void main(String[] args) {

        Map<String,String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene","Female");
        employeeMap.put("Winfred","Male");
        employeeMap.put("Jereme","Male");
        employeeMap.put("Glad","Female");
        employeeMap.put("Desirae","Female");
        employeeMap.put("Kakalina","Female");
        employeeMap.put("Bertrando","Male");
        employeeMap.put("Ajay","Female");
        employeeMap.put("Brigitte","Female");
        employeeMap.put("Derk","Male");
        employeeMap.put("Orlando","Male");
        employeeMap.put("Selle","Female");
        employeeMap.put("Marika","Female");
        employeeMap.put("Griffy","Male");
        employeeMap.put("Shanon","Female");
        employeeMap.put("Clerkclaude","Male");
        employeeMap.put("Rickard","Male");
        employeeMap.put("Job","Male");
        employeeMap.put("Aida","Female");
        employeeMap.put("Alonzo","Male");

        Set<Map.Entry<String,String>> allMap = employeeMap.entrySet();
        Collection<String> allFemaleNames = new HashSet<>();
        Collection<String> allMaleNames = new HashSet<>();

        for (Map.Entry<String,String> eachEntry : allMap){
            if(eachEntry.getValue().equalsIgnoreCase("female")){
             allFemaleNames.add(eachEntry.getKey())   ;
             eachEntry.setValue("Queen");
            }else{
                allMaleNames.add(eachEntry.getKey());
                eachEntry.setValue("King");
            }

        }

        System.out.println("allMaleNames = " + allMaleNames);
        System.out.println("allFemaleNamesNames = " + allFemaleNames);
        System.out.println("allEmployeeMap = " + employeeMap);


    }
}
