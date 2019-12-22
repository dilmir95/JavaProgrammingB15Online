package day11;
        import java.util.Scanner;

public class WakeUpTask {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Which room light is turned on");
        String room = "";

        String targerOption = scan.next();
        switch (targerOption){
            case "Bd" :

                room = "Bedroom";

                break;
            case "Lv":
                room = "Living room";

                break;
            case "Bath":
                room = "Bathroom";

                break;
            case "Kt":
                room = "Kitchen";

                break;
            default:
                System.out.println("Invalid entry");

        }
        System.out.println(room+ " light is turned on at this moment");

    }

}
