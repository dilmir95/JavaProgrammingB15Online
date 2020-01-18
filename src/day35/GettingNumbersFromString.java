package day35;

public class GettingNumbersFromString {

    public static void main(String[] args) {


        String id = "A123b3W423cc4523B $$ aa 77J JsG8 2347SDFSJF";

        char[] idArray = id.toCharArray();
        String nums = "";
        for( char eachChar: idArray){
            Character charObject = Character.valueOf(eachChar);

            if(Character.isDigit(eachChar)){
                nums+= eachChar;
            }
        }
        //System.out.println(nums);

        long num = Long.valueOf(nums);
        System.out.println(num);


    }
}
