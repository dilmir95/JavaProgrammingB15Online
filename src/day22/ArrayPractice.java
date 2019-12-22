package day22;

public class ArrayPractice {

    public static void main(String[] args) {

        double[] prices = new double[5];
        //System.out.println(prices[0]);  if you print empty array it will print 0

        //System.out.println(prices); cannot print out array variable directly to see what is inside
        prices[0]= 2.46;
        prices[1]= 12.96;
        prices[2]= 992.1;
        prices[3]= 500;
        prices[4]= 65.12;

        System.out.println(prices[0]);
        System.out.println(prices[1]);
        System.out.println(prices[2]);
        System.out.println(prices[3]);
        System.out.println(prices[4]);


        char[]name = new char[8];
        name[0]= 'D';
        name[1]= 'i';
        name[2]= 'l';
        name[3]= 'm';
        name[4]= 'u';
        name[5]= 'r';
        name[6]= 'o';
        name[7]= 'd';

        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(name[3]);
        System.out.println(name[4]);
        System.out.println(name[5]);
        System.out.println(name[6]);
        System.out.println(name[7]);

        System.out.println(name);   //only for char array ,it will print the content in the array


        boolean[] bools = new boolean[3];
        System.out.println(bools[0]);

        bools[0]= true;
        bools[1]=false;
        bools[2]=10>7;

        System.out.println(bools[0] );
        System.out.println(bools[1] );
        System.out.println(bools[2] );
    }
}
