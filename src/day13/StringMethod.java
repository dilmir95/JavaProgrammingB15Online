package day13;

public class StringMethod {

    public static void main(String[] args) {

        //String actions that we already know
        //equals
        String s1 = "hello ";
        String s2 = "Hello";
        System.out.println(s1.equals(s2));

        //equalIgnoseCase
        System.out.println(s1.equalsIgnoreCase(s2));
        // convert toUpperCase
        System.out.println(s1);
        System.out.println(s1.toUpperCase());

        // convert to toLowerCase
        System.out.println(s2.toLowerCase());


        String name = "Dilmurod Yakubov";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println("my name is : "+ name.toUpperCase());

        //in order to get how manu character we have inside the String
        //we can use lenght method of String

        System.out.println(name.length());
        System.out.println(s1.length());


        int lenghts = s1.length();
        if(lenghts>4){
            System.out.println("more than 4");
        }else {
            System.out.println("not more than 4 character");
        }
    }
}
