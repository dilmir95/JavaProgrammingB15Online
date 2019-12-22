package day23;

import org.w3c.dom.ls.LSOutput;

public class WarmUp_Array {

    public static void main(String[] args) {

        //create an int array of 10 items
        //print out in reverse order
        //store last item in a variable

        int[] numbers = {12,14,15,19,76,32,56,78,99,77};

        for (int i = numbers.length-1; i >=0 ; i--) {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        int lastItem = numbers[numbers.length-1];
        int midItem = numbers[numbers.length/2];
        System.out.println( "Last item "+ lastItem);
        System.out.println("mid item "+ midItem);

    }
}
