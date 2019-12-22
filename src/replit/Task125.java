package replit;

import java.util.Scanner;

public class Task125 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};
            String shortest = str[0];

        for (int i = 0; i <str.length ; i++) {
            if(shortest.length()>str[i].length()){
                shortest=str[i];
            }
        }
        System.out.println(shortest);
    }
}
