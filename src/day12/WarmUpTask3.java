package day12;
        import  java.util.Scanner;

public class WarmUpTask3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in)   ;

        int number = scan.nextInt();
        if((number%5)==0 && (number%3)==0){
            System.out.println("FizzBuzz Number");
        }else if ((number%5)==0){
            System.out.println("Fizz number");
        }else if((number%3)==0){
            System.out.println("Buzz number");
        }else{
            System.out.println("Not my number");
        }
    }
}
