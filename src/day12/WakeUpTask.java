package day12;
import java.util.Scanner;

public class WakeUpTask {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Which city are you from?");
        String city = scan.next();
        System.out.println("How is the weather in "+ city);
        String weather = scan.next();
        if(weather.equals("Sunny")){
            System.out.println("Code in "+weather+" weather");
        }else if(weather.equals("Rainy")){
            System.out.println("Code in "+weather+" weather");
        }else if(weather.equals("Cloudy")) {
            System.out.println("Code in " + weather + " weather");
        }else if(weather.equals("Snowy")) {
            System.out.println("Code in " + weather + " weather");
        }else{
            System.out.println("Rain or Shine just keep coding anyways");
        }

    }
}
