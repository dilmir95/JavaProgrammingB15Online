package day22;

public class ArrayIntro {

    public static void main(String[] args) {

        //Syntax for creating variable and assigning value
        // dataType[] variableName = new dataType [size/count of item];
        int [] scores = new int[4];

        //assigning value to each index
        scores[0]= 95;
        scores[1]= 70;
        scores [2] = 88;
        scores[3]= 100;

        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);

        scores[1]=99;
        System.out.println(scores[1]);


        int[] numbers = new int[3];
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);


        //task

        byte[] data = new byte[4];
        data[0]= 7;
        data[1]= 10;
        data[2]= 17;
        data[3]= 27;

        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);

        data[3]= 99;
        System.out.println(data[3]);

        //int[] nums = new int[5];
//        int[] google = new int[4];
//
//        String[] ford= new String[5];
//

    }
}
