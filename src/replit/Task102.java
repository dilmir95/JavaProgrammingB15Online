package replit;

import java.util.Scanner;

public class Task102 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String html = scan.nextLine();
        String id = "";
        String answer = "";

        if (html.contains("html")) {

            html = html.substring(html.indexOf(" id") + 5, html.length() - 1);
           // System.out.println(html);
            id = html.substring(0, html.indexOf("\""));


            System.out.println(id);
        } else if (!html.contains("html")) {
            System.out.println("false");
        }
    }

}