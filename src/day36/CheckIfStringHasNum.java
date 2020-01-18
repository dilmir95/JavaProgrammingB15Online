package day36;

import java.util.ArrayList;

public class CheckIfStringHasNum {

    public static void main(String[] args) {


        System.out.println(checkIfStringContainNumber("dilmurod65434"));

        System.out.println(checkIfStringContainNumber("sdsdfsgsa"));

        Integer x = null;

        ArrayList<Integer> lst1 = new ArrayList<>();

    }

    public static Boolean checkIfStringContainNumber(String str){

        char[] chars = str.toCharArray();
        for(char each: chars){
            if(Character.isDigit(each)){
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
