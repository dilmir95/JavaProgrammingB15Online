package replit;

public class PracticeStringManupulation {

    public static void main(String[] args) {


        String company = "Fix Pro Aplliances";

        System.out.println(company.length());

        System.out.println(company.substring(company.indexOf("Fix"), company.indexOf(" Pro")));

        System.out.println(company.substring(company.indexOf("Ap"), company.length()-0));

        System.out.println(company.replace("Fix Pro" , "Pro Fix"));


    }
}
