package Tasks;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {



        int[] numbers = {1,5,3,7,8};
        System.out.println(Arrays.toString(numbers));
        int lastIndex = numbers.length-1;
        for (int i = 0; i <numbers.length/2 ; i++) {
            int temp = numbers[i];
            numbers[i]= numbers[lastIndex-i];
            numbers[lastIndex-i]= temp;
        }

        System.out.println(Arrays.toString(numbers));

        int[] numbersCopy = new int[numbers.length];
        for (int x = 0; x <numbers.length ; x++) {
            numbersCopy[x]= numbers[x];

        }
        System.out.println(Arrays.toString(numbersCopy));
    }
}
