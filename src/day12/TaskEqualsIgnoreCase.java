package day12;

public class TaskEqualsIgnoreCase {

    public static void main(String[] args) {

        String name = "Dilmurod YAKubov";

        if(name.equals("Dilmurod yakubov")){
            System.out.println("your name is "+ name);
        }else if (name.equalsIgnoreCase("Dilmurod YAKUBOV")){
            System.out.println("is correct when ignoring the case");
        }else {
            System.out.println("Invalid entry");
        }
    }
}
