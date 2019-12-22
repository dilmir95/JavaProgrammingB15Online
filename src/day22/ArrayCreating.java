package day22;

public class ArrayCreating {

    public static void main(String[] args) {

        //creating an array
        int[] ages = new int[]{40,50,70,90, 67,23};

        int count = ages.length;
        System.out.println(count);


        for (int i = 0; i <= ages.length-1 ; i++) {
            System.out.print(ages[i]+" ");
        }
    }
}
