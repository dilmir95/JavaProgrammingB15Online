package day11;
import javax.swing.*;
import java.util.Scanner;

public class LightRoomIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Which room light is on");
        String room = "";

        String targetOption = scan.next();
        if(targetOption.equals("Bd")){
            room = "Bedroom";
        }else if(targetOption.equals("Kt")){
            room = "Kitchen";

        }else if(targetOption.equals("Bt")){
            room = "Bathroom";
        }else if(targetOption.equals("Lv")) {
            room = "Living room";
        }else {
            System.out.println("Invalid entry");
            }
        System.out.println(room + " ligh is on at this moment");
        }

    }


