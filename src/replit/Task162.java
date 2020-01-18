package replit;

import java.util.Arrays;

public class Task162 {

    public static void main(String[] args) {
        fib(14);
        fib(25);
        fib(9);


    }
    public static void fib(int num){
        String result = "0,1,";
        //WRITE YOUR CODE HERE
        for(int i =0; i<=num-1; i++){
            result+= (i+(i+1)+",");
        }

        String[] splitted = result.split(",");
        //System.out.println(splitted[splitted.length-3]);
        System.out.println(Arrays.toString(splitted));
    }
}
