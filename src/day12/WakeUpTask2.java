package day12;
import java.util.Scanner;

public class WakeUpTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the number of month");
        int month = scan.nextInt();
        if(month>12 || month<1){
            System.out.println("Invalid month");
        }else if (month>=3 && month<=5){
            System.out.println("It's Spring");
        }else if (month>=6 && month<=8) {
            System.out.println("It's Summer");
        }else if (month>=9 && month<=11) {
            System.out.println("It's Fall");
        }else if(month==1 || month==2 || month==12){
            System.out.println("It's Winter");
        }
    }
}
