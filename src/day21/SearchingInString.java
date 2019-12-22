package day21;

import jdk.swing.interop.SwingInterOpUtils;

public class SearchingInString {

    public static void main(String[] args) {

        String myName = "Dilmurod Yakubova Dilmurod Yakubova";

        for (int i = 0; i <= myName.length()-1 ; i++) {
            String currentChar = (myName.substring(i,i+1));

            if(currentChar.equalsIgnoreCase("A")){
                System.out.println("the index of a or A is "+ i);
            }
        }
            int countOfRod=0;
        for (int j = 0; j <= myName.length()-3 ; j++) {
            String curChar = myName.substring(j,j+3 );
            if(curChar.equalsIgnoreCase("rod")){
                ++countOfRod;

            }
        }
        System.out.println("Count of rod is "+ countOfRod);
    }
}
