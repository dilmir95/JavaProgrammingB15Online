package day16;

import java.util.Scanner;

public class StringPractice_day16 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the keyword");
        String keywordSearch = scan.nextLine();


        String tabTitle = keywordSearch + " - Google Search";

        if(tabTitle.startsWith(keywordSearch) && tabTitle.endsWith(" - Google Search")){
            System.out.println("test passed");
        }else {
            System.out.println("test failed");
        }
    }
}
