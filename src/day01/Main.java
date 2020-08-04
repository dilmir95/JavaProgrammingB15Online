package day01;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // comments start with double slash and compiler will ignore this
        // i am going to say hello
 //       System.out.println("hello world");
    //    System.out.println("I am still here");
//        System.out.println("I love you");
        // java is case case sensative language
        //write a program to display your info
        // when you run it it should have this outcome
        System.out.println(" I am Dilmurod Yakubov");
        System.out.println(" I am from batch 15");
        System.out.println(" I am from Houston, Texas");
        System.out.println(" I am love java");


        float f = 14f;
        String sf = Float.toString(f);
        System.out.println(sf);

        Integer num = Integer.parseInt("443");

        int a = 5;
        int b = 10;

        int x = 0;

        System.out.println(incrementString("dcs1323"));
        System.out.println(incrementString("sansiaonsa12121212"));
    }

    public static String incrementString(String str){
        Integer x = Integer.parseInt(str.charAt(str.length()-1)+"");
        ++x;
        String incremented = x.toString();

       str = str.substring(0,str.length()-1);
       str += incremented;

        return str;


    }
}
