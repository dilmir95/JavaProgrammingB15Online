package replit;

import java.util.Arrays;
import java.util.Scanner;

public class Task126 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

       String modifiedStr= str.replace(" ", "");

        String[] strArray = modifiedStr.split(",");
        String shortest = strArray[0]   ;
        for (int i = 0; i <strArray.length ; i++) {
            if(shortest.length()>strArray[i].length()){
                shortest=strArray[i];

            }
        }
        int countOfMin= 0;
        for (int x = 0; x <strArray.length ; x++) {
            if(shortest.length()==strArray[x].length()){
                //System.out.print(strArray[x]+",");
                ++countOfMin;
            }
        }
        String[] shortestWords = new String[countOfMin];
        int index=0;
        for (int j = 0; j <strArray.length ; j++) {
            if(strArray[j].length()==shortest.length()){
                shortestWords[index]= strArray[j];
                ++index;
            }
        }
            Arrays.sort(shortestWords);
        System.out.println(Arrays.toString(shortestWords));

    }
}
