package day25;

import java.util.Arrays;

public class StringSplitMethod {

    public static void main(String[] args) {

        String sentence = "I love java";

       String[] allWords= sentence.split(" ");
        System.out.println(Arrays.toString(allWords));


        System.out.println(allWords.length+" words i have");

        System.out.println(allWords[allWords.length-1]);

        System.out.println("========================");

        String oracle = "Java is made by Oracle";
        String[] splitByA=  oracle.split(" ");
        System.out.println(Arrays.toString(splitByA));

        for(String eachSplit: splitByA){
            System.out.println("eachSplit = " + eachSplit);
        }
        
        String[] splitByIs  = sentence.split("love");
        System.out.println(Arrays.toString(splitByIs));
        for(String eachSplitByIs: splitByIs ){
            System.out.println("eachSplitByIs = " + eachSplitByIs);
        }
                
    }
}
