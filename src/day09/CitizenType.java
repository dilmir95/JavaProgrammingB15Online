package day09;
import java.util.Scanner;

public class CitizenType {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String citizenType = null;
        int senior = scan.nextInt();
        if (senior >= 65) {
            citizenType = "Senior";
            System.out.println("The citizen age is "+senior+" and he is a "+ citizenType );
        } else if(senior<0){
            citizenType = "Invalid Entry";
            System.out.println(citizenType);
        }else{
            citizenType = "Not Senior";
            System.out.println("The citizen age is "+senior+" and he is a "+ citizenType );
        }


    }
}
