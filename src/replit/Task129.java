package replit;

import java.util.Arrays;

public class Task129 {

    public static void main(String[] args) {

        String[] arr = {"Dilmurod","Bek","Sanam","Feride"};
        int countENames = 0;

        for(String eachName: arr){
            if(eachName.contains("e")){
                ++countENames;
            }
        }
        String[] fewValues = new String[countENames];
        int index = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].contains("e")){
                fewValues[index]=arr[i];
                ++index;
            }
        }
        System.out.println(Arrays.toString(fewValues));
    }
}
