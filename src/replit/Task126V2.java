package replit;

import java.util.Arrays;
import java.util.Scanner;

public class Task126V2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String modified = str.replace(" ", "");
        String[] strArr = modified.split(",");
        //System.out.println(Arrays.toString(strArr));

        String shortest = strArr[0];
        for(String eachWord : strArr){
            if(eachWord.length()<shortest.length()){
                shortest=eachWord;
            }
        }
        String shortestCombination = "";
        for(String eachW: strArr){
            if(eachW.length()==shortest.length()){
                shortestCombination+= eachW+",";
            }
        }
        String[] sorted = shortestCombination.split(",");
        Arrays.sort(sorted);
        System.out.println(Arrays.toString(sorted));
    }
}
