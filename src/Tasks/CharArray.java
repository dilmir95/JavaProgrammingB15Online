package Tasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CharArray {

    public static void main(String[] args) {

        String fullName = "Dilmurod Yakubov";
        char[] name = new char[fullName.length()];

        for (int i = 0; i <=name.length-1 ; i++) {
            name[i]= fullName.charAt(i);

        }
        System.out.println(Arrays.toString(name));


        String laptop = "Macbook Pro";
        char[] eachChar = laptop.toCharArray();
        System.out.println(Arrays.toString(eachChar));

        String phone = "Iphone 11 max pro";
        char[] eachP   = new char[phone.length()];

        for (int i = 0; i <=eachP.length-1 ; i++) {
            eachP[i]=phone.charAt(i);
        }
        System.out.println(Arrays.toString(eachP));


        String car = "Chevrolet";
        char[] eachCharr = car.toCharArray();
        System.out.println(Arrays.toString(eachCharr));

        String sentence = "Java is hard we need to practice more";
        String[] eachWord = sentence.split(" ");
        System.out.println(Arrays.toString(eachWord));

        String longest = eachWord[0];
        for(String each: eachWord){
            if(each.length()>longest.length()){
                longest=each;
            }
        }
        System.out.println(longest);
    }
}
