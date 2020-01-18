package day37;

public class MethodOverloadingWithWrapper {

    public static void main(String[] args) {


        printNum(100);
        printNum(Integer.valueOf(100));
        String id = "1234512";

        int x = Integer.parseInt(id);


    }

//    public static void printNum (int x){
//        System.out.println("int x = " + x);
//    }

    public static void printNum (Integer x){
        System.out.println("Integer x = " + x);
    }
}
