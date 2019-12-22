package day26;

import java.util.Arrays;

public class StringSplitPractice {

    public static void main(String[] args) {

        String students = "Abbos, Zulyar,Zhibek,Hasan,Muge, Orhan,Susan";
        students = students.replace(" ", "");
        String[] nameArray = students.split(",");
        System.out.println(Arrays.toString(nameArray));

        for (int i = 0; i <nameArray.length ; i++) {
            for (int j = 0; j <nameArray[i].length() ; j++) {
                System.out.print(nameArray[i].charAt(j)+"-");
            }
            System.out.println();
        }

    }
}
