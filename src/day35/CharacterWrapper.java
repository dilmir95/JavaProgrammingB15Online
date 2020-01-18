package day35;

import java.util.concurrent.ConcurrentHashMap;

public class CharacterWrapper {

    public static void main(String[] args) {

        Character x = 'A';

        boolean isDigit = Character.isDigit(x);
        boolean isLetter = Character.isLetter(x);
        boolean isUpperCase = Character.isUpperCase(x);
        boolean isLowerCase = Character.isLowerCase(x);

        
        String str = "a34b123c4x";
        
        char[] chars = str.toCharArray();
        String nums = "";
        int sum =0;
        
        for(char each: chars){
            if(Character.isDigit(each)){
                nums+=each;
                int y = Integer.parseInt(each+"");
                sum+= y;


            }
            if(Character.isLowerCase(each)){

            }
        }
        System.out.println(nums);
        
       Integer num = Integer.valueOf(nums);

        System.out.println("sum = " + sum);

    }
}
