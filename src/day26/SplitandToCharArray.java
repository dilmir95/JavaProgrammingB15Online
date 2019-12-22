package day26;

import java.util.Arrays;

public class SplitandToCharArray {

    public static void main(String[] args) {

        String survey = "Complete B15 Online 1 Month Survey";

        char[] surveyChars = survey.toCharArray();
        for(char eachChar : surveyChars){
            System.out.println(eachChar);
        }

        String[] words = survey.split(" ");

        System.out.println(Arrays.toString(words));
        int x=0;

        while(x< surveyChars.length){
            System.out.println("each char is: "+surveyChars[x]);
            ++x;
        }

        for (int i = 0; i <surveyChars.length ; i++) {
            System.out.println("each char is "+surveyChars[i]);
        }
    }


}
