package day27;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class Multi_Dimensional_Array_Practice {

    public static void main(String[] args) {


        String[][] names = { {"Dilmurod", "Dimka","Dil"},{"Pablo","Gustavo","Limon"}};


        System.out.println(names[0][0]); //Dilmurod

        names[1][0]= "Man";
        names[1][1]= "Bobur";
        names[1][2]= "Islom";

        System.out.println(Arrays.toString(names[1]));


        System.out.println(Arrays.deepToString(names));
    }
}
